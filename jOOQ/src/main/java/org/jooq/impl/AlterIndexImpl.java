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
package org.jooq.impl;

import static java.util.Arrays.asList;
import static org.jooq.Clause.ALTER_INDEX;
import static org.jooq.Clause.ALTER_INDEX_INDEX;
import static org.jooq.Clause.ALTER_INDEX_RENAME;
// ...
// ...
import static org.jooq.SQLDialect.CUBRID;
// ...
import static org.jooq.SQLDialect.DERBY;
import static org.jooq.SQLDialect.FIREBIRD;
// ...
// ...
import static org.jooq.impl.DSL.name;

import org.jooq.AlterIndexFinalStep;
import org.jooq.AlterIndexStep;
import org.jooq.Clause;
import org.jooq.Configuration;
import org.jooq.Context;
import org.jooq.Name;

/**
 * @author Lukas Eder
 */
final class AlterIndexImpl extends AbstractQuery implements

    // Cascading interface implementations for ALTER INDEX behaviour
    AlterIndexStep,
    AlterIndexFinalStep {

    /**
     * Generated UID
     */
    private static final long     serialVersionUID = 8904572826501186329L;
    private static final Clause[] CLAUSES          = { ALTER_INDEX };

    private final Name            index;
    private final boolean         ifExists;
    private Name                  renameTo;

    AlterIndexImpl(Configuration configuration, Name index) {
        this(configuration, index, false);
    }

    AlterIndexImpl(Configuration configuration, Name index, boolean ifExists) {
        super(configuration);

        this.index = index;
        this.ifExists = ifExists;
    }

    // ------------------------------------------------------------------------
    // XXX: DSL API
    // ------------------------------------------------------------------------

    @Override
    public final AlterIndexImpl renameTo(Name newName) {
        this.renameTo = newName;
        return this;
    }

    @Override
    public final AlterIndexImpl renameTo(String newName) {
        return renameTo(name(newName));
    }

    // ------------------------------------------------------------------------
    // XXX: QueryPart API
    // ------------------------------------------------------------------------

    private final boolean supportsIfExists(Context<?> ctx) {
        return !asList(CUBRID, DERBY, FIREBIRD).contains(ctx.family());
    }

    @Override
    public final void accept(Context<?> ctx) {
        if (ifExists && !supportsIfExists(ctx)) {
            Tools.executeImmediateIfExistsBegin(ctx, DDLStatementType.ALTER_INDEX, index);
            accept0(ctx);
            Tools.executeImmediateIfExistsEnd(ctx, DDLStatementType.ALTER_INDEX, index);
        }
        else {
            accept0(ctx);
        }
    }

    private final void accept0(Context<?> ctx) {
        ctx.start(ALTER_INDEX_INDEX)
           .keyword("alter index");

        if (ifExists && supportsIfExists(ctx))
            ctx.sql(' ').keyword("if exists");

        ctx.sql(' ').visit(index)
           .end(ALTER_INDEX_INDEX)
           .formatIndentStart()
           .formatSeparator();

        if (renameTo != null) {
            boolean qualify = ctx.qualify();

            ctx.start(ALTER_INDEX_RENAME)
               .qualify(false)
               .keyword("rename to").sql(' ').visit(renameTo)
               .qualify(qualify)
               .end(ALTER_INDEX_RENAME);
        }

        ctx.formatIndentEnd();
    }

    @Override
    public final Clause[] clauses(Context<?> ctx) {
        return CLAUSES;
    }
}
