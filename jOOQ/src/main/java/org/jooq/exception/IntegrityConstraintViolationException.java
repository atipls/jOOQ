/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: https://www.jooq.org/legal/licensing
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq.exception;

import static org.jooq.exception.SQLStateClass.C23_INTEGRITY_CONSTRAINT_VIOLATION;
import static org.jooq.exception.SQLStateSubclass.C23000_NO_SUBCLASS;

import java.sql.SQLIntegrityConstraintViolationException;

/**
 * The <code>IntegrityConstraintViolationException</code> is jOOQ's equivalent
 * of JDBC's {@link SQLIntegrityConstraintViolationException}.
 * <p>
 * It is thrown by jOOQ whenever jOOQ detects
 * {@link SQLStateClass#C23_INTEGRITY_CONSTRAINT_VIOLATION} from the JDBC
 * driver. Whether this SQL state is available is JDBC driver implementation
 * specific.
 *
 * @author Lukas Eder
 */
public class IntegrityConstraintViolationException extends DataAccessException {

    /**
     * Constructor for IntegrityConstraintViolationException.
     *
     * @param message the detail message
     */
    public IntegrityConstraintViolationException(String message) {
        super(message);

        init();
    }

    /**
     * Constructor for IntegrityConstraintViolationException.
     *
     * @param message the detail message
     * @param cause the root cause (usually from using a underlying data access
     *            API such as JDBC)
     */
    public IntegrityConstraintViolationException(String message, Throwable cause) {
        super(message, cause);

        init();
    }

    private final void init() {
        sqlStateClass(C23_INTEGRITY_CONSTRAINT_VIOLATION);
        sqlStateSubclass(C23000_NO_SUBCLASS);
    }
}
