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

/**
 * A SQL enum type. This can be any of the following:
 * <ul>
 * <li>In {@link SQLDialect#MARIADB}, this can be a column-scope enum type</li>
 * <li>In {@link SQLDialect#MYSQL}, this can be a column-scope enum type</li>
 * <li>In {@link SQLDialect#POSTGRES}, this can be a schema-scope enum type</li>
 * <li>In all other dialects, this can be an enum type as defined in the code
 * generation configuration [#968]</li>
 * </ul>
 * <p>
 * Client code should not assume that the actual enum reference is a Java
 * {@link Enum}. In Scala, for instance, enums are not idiomatic, and jOOQ
 * implements them differently. In any case, this {@link EnumType} API is
 * implemented by generated database enums.
 *
 * @author Lukas Eder
 */
public interface EnumType {

    /**
     * The literal as defined in the database
     */
    String getLiteral();

    /**
     * The catalog of the enum type, if applicable. Otherwise, this returns
     * <code>null</code>
     */
    Catalog getCatalog();

    /**
     * The schema of the enum type, if applicable (Postgres schema-scope enum
     * type only). Otherwise, this returns <code>null</code>
     */
    Schema getSchema();

    /**
     * The type name as registered in the database, if applicable (Postgres
     * schema-scope enum type only). Otherwise, this returns <code>null</code>
     */
    String getName();
}
