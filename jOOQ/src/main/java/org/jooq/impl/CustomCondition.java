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

import static org.jooq.Clause.CUSTOM;

import org.jooq.Clause;
import org.jooq.Condition;
import org.jooq.Context;

/**
 * A base class for custom {@link Condition} implementations in client code.
 * <p>
 * Client code may provide proper {@link Condition} implementations extending
 * this useful base class. All necessary parts of the {@link Condition}
 * interface are already implemented. Only this method needs further
 * implementation: {@link #accept(Context)}.
 * <p>
 * Refer to that methods' Javadoc for further details about their expected
 * behaviour.
 *
 * @author Lukas Eder
 */
public abstract class CustomCondition extends AbstractCondition {

    /**
     * Generated UID
     */
    private static final long     serialVersionUID = -3439681086987884991L;
    private static final Clause[] CLAUSES          = { CUSTOM };

    protected CustomCondition() {}

    // -------------------------------------------------------------------------
    // Implementation required
    // -------------------------------------------------------------------------

    /**
     * Subclasses must implement this method.
     * <hr/>
     * {@inheritDoc}
     */
    @Override
    public abstract void accept(Context<?> ctx);

    // -------------------------------------------------------------------------
    // No further overrides allowed
    // -------------------------------------------------------------------------

    @Override
    public final Clause[] clauses(Context<?> ctx) {
        return CLAUSES;
    }

    @Override
    public final boolean declaresFields() {
        return super.declaresFields();
    }

    @Override
    public final boolean declaresTables() {
        return super.declaresTables();
    }
}
