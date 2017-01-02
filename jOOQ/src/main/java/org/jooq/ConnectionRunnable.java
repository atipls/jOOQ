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
package org.jooq;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.jooq.exception.DataAccessException;

/**
 * An operation that can run code and statements against a provided JDBC
 * {@link Connection}.
 *
 * @author Lukas Eder
 */

@FunctionalInterface

public interface ConnectionRunnable {

    /**
     * Run statements.
     * <p>
     * Implementations may freely use the argument {@link Connection} to run
     * statements against the database. Implementations MUST manage the
     * lifecycle of any resources created from this <code>connection</code>,
     * such as {@link Statement} or {@link ResultSet}. Implementations MUST NOT
     * manage the lifecycle of the {@link Connection}, which is managed by the
     * {@link ConnectionProvider} that provided the <code>connection</code> to
     * this {@link ConnectionRunnable}.
     *
     * @param connection The connection.
     * @throws Exception Any exception, including {@link SQLException}, that
     *             will be propagated as an unchecked
     *             {@link DataAccessException}.
     */
    void run(Connection connection) throws Exception;
}
