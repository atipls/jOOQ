/*
 * This work is dual-licensed
 * - under the Apache Software License 2.0 (the "ASL")
 * - under the jOOQ License and Maintenance Agreement (the "jOOQ License")
 * =============================================================================
 * You may choose which license applies to you:
 *
 * - If you're using this work with Open Source databases, you may choose
 *   either ASL or jOOQ License.
 * - If you're using this work with at least one commercial database, you must
 *   choose jOOQ License
 *
 * For more information, please visit http://www.jooq.org/licenses
 *
 * Apache Software License 2.0:
 * -----------------------------------------------------------------------------
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * jOOQ License and Maintenance Agreement:
 * -----------------------------------------------------------------------------
 * Data Geekery grants the Customer the non-exclusive, timely limited and
 * non-transferable license to install and use the Software under the terms of
 * the jOOQ License and Maintenance Agreement.
 *
 * This library is distributed with a LIMITED WARRANTY. See the jOOQ License
 * and Maintenance Agreement for more details: http://www.jooq.org/licensing
 */
package org.jooq.checker;

import static com.sun.source.util.TreePath.getPath;
import static org.checkerframework.javacutil.TreeUtils.elementFromDeclaration;
import static org.checkerframework.javacutil.TreeUtils.elementFromUse;
import static org.checkerframework.javacutil.TreeUtils.enclosingMethod;

import java.io.PrintWriter;

import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;

import org.jooq.Allow;
import org.jooq.PlainSQL;

import org.checkerframework.framework.source.SourceVisitor;

import com.sun.source.tree.MethodInvocationTree;

/**
 * A checker to disallow usage of {@link PlainSQL} API, except where allowed
 * explicitly.
 *
 * @author Lukas Eder
 */
public class PlainSQLChecker extends AbstractChecker {

    @Override
    protected SourceVisitor<Void, Void> createSourceVisitor() {
        return new SourceVisitor<Void, Void>(getChecker()) {

            @Override
            public Void visitMethodInvocation(MethodInvocationTree node, Void p) {
                try {
                    ExecutableElement elementFromUse = elementFromUse(node);
                    PlainSQL plainSQL = elementFromUse.getAnnotation(PlainSQL.class);

                    // In the absence of a @PlainSQL annotation,
                    // all jOOQ API method calls will type check.
                    if (plainSQL != null) {
                        Element enclosing = elementFromDeclaration(enclosingMethod(getPath(root, node)));
                        boolean allowed = false;

                        moveUpEnclosingLoop:
                        while (enclosing != null) {
                            if (enclosing.getAnnotation(Allow.PlainSQL.class) != null) {
                                allowed = true;
                                break moveUpEnclosingLoop;
                            }

                            enclosing = enclosing.getEnclosingElement();
                        }

                        if (!allowed)
                            error(node, "Plain SQL usage not allowed at current scope. Use @Allow.PlainSQL.");
                    }
                }
                catch (final Exception e) {
                    print(new Printer() {
                        @Override
                        public void print(PrintWriter t) {
                            e.printStackTrace(t);
                        }
                    });
                }

                return super.visitMethodInvocation(node, p);
            }
        };
    }
}
