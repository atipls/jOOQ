/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.firebird.rdb.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.firebird.rdb.DefaultSchema;
import org.jooq.meta.firebird.rdb.Keys;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Rdb$functions extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>RDB$FUNCTIONS</code>
     */
    public static final Rdb$functions RDB$FUNCTIONS = new Rdb$functions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>RDB$FUNCTIONS.RDB$FUNCTION_NAME</code>.
     */
    public final TableField<Record, String> RDB$FUNCTION_NAME = createField(DSL.name("RDB$FUNCTION_NAME"), SQLDataType.CHAR(31), this, "");

    /**
     * The column <code>RDB$FUNCTIONS.RDB$FUNCTION_TYPE</code>.
     */
    public final TableField<Record, Short> RDB$FUNCTION_TYPE = createField(DSL.name("RDB$FUNCTION_TYPE"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>RDB$FUNCTIONS.RDB$QUERY_NAME</code>.
     */
    public final TableField<Record, String> RDB$QUERY_NAME = createField(DSL.name("RDB$QUERY_NAME"), SQLDataType.CHAR(31), this, "");

    /**
     * The column <code>RDB$FUNCTIONS.RDB$DESCRIPTION</code>.
     */
    public final TableField<Record, String> RDB$DESCRIPTION = createField(DSL.name("RDB$DESCRIPTION"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>RDB$FUNCTIONS.RDB$MODULE_NAME</code>.
     */
    public final TableField<Record, String> RDB$MODULE_NAME = createField(DSL.name("RDB$MODULE_NAME"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>RDB$FUNCTIONS.RDB$ENTRYPOINT</code>.
     */
    public final TableField<Record, String> RDB$ENTRYPOINT = createField(DSL.name("RDB$ENTRYPOINT"), SQLDataType.CHAR, this, "");

    /**
     * The column <code>RDB$FUNCTIONS.RDB$RETURN_ARGUMENT</code>.
     */
    public final TableField<Record, Short> RDB$RETURN_ARGUMENT = createField(DSL.name("RDB$RETURN_ARGUMENT"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>RDB$FUNCTIONS.RDB$SYSTEM_FLAG</code>.
     */
    public final TableField<Record, Short> RDB$SYSTEM_FLAG = createField(DSL.name("RDB$SYSTEM_FLAG"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>RDB$FUNCTIONS.RDB$ENGINE_NAME</code>.
     */
    public final TableField<Record, String> RDB$ENGINE_NAME = createField(DSL.name("RDB$ENGINE_NAME"), SQLDataType.CHAR(31), this, "");

    /**
     * The column <code>RDB$FUNCTIONS.RDB$PACKAGE_NAME</code>.
     */
    public final TableField<Record, String> RDB$PACKAGE_NAME = createField(DSL.name("RDB$PACKAGE_NAME"), SQLDataType.CHAR(31), this, "");

    /**
     * The column <code>RDB$FUNCTIONS.RDB$PRIVATE_FLAG</code>.
     */
    public final TableField<Record, Short> RDB$PRIVATE_FLAG = createField(DSL.name("RDB$PRIVATE_FLAG"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>RDB$FUNCTIONS.RDB$FUNCTION_SOURCE</code>.
     */
    public final TableField<Record, String> RDB$FUNCTION_SOURCE = createField(DSL.name("RDB$FUNCTION_SOURCE"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>RDB$FUNCTIONS.RDB$FUNCTION_ID</code>.
     */
    public final TableField<Record, Short> RDB$FUNCTION_ID = createField(DSL.name("RDB$FUNCTION_ID"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>RDB$FUNCTIONS.RDB$FUNCTION_BLR</code>.
     */
    public final TableField<Record, byte[]> RDB$FUNCTION_BLR = createField(DSL.name("RDB$FUNCTION_BLR"), SQLDataType.BLOB, this, "");

    /**
     * The column <code>RDB$FUNCTIONS.RDB$VALID_BLR</code>.
     */
    public final TableField<Record, Short> RDB$VALID_BLR = createField(DSL.name("RDB$VALID_BLR"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>RDB$FUNCTIONS.RDB$DEBUG_INFO</code>.
     */
    public final TableField<Record, byte[]> RDB$DEBUG_INFO = createField(DSL.name("RDB$DEBUG_INFO"), SQLDataType.BLOB, this, "");

    /**
     * The column <code>RDB$FUNCTIONS.RDB$SECURITY_CLASS</code>.
     */
    public final TableField<Record, String> RDB$SECURITY_CLASS = createField(DSL.name("RDB$SECURITY_CLASS"), SQLDataType.CHAR(31), this, "");

    /**
     * The column <code>RDB$FUNCTIONS.RDB$OWNER_NAME</code>.
     */
    public final TableField<Record, String> RDB$OWNER_NAME = createField(DSL.name("RDB$OWNER_NAME"), SQLDataType.CHAR(31), this, "");

    /**
     * The column <code>RDB$FUNCTIONS.RDB$LEGACY_FLAG</code>.
     */
    public final TableField<Record, Short> RDB$LEGACY_FLAG = createField(DSL.name("RDB$LEGACY_FLAG"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>RDB$FUNCTIONS.RDB$DETERMINISTIC_FLAG</code>.
     */
    public final TableField<Record, Short> RDB$DETERMINISTIC_FLAG = createField(DSL.name("RDB$DETERMINISTIC_FLAG"), SQLDataType.SMALLINT, this, "");

    private Rdb$functions(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Rdb$functions(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>RDB$FUNCTIONS</code> table reference
     */
    public Rdb$functions(String alias) {
        this(DSL.name(alias), RDB$FUNCTIONS);
    }

    /**
     * Create an aliased <code>RDB$FUNCTIONS</code> table reference
     */
    public Rdb$functions(Name alias) {
        this(alias, RDB$FUNCTIONS);
    }

    /**
     * Create a <code>RDB$FUNCTIONS</code> table reference
     */
    public Rdb$functions() {
        this(DSL.name("RDB$FUNCTIONS"), null);
    }

    public <O extends Record> Rdb$functions(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, RDB$FUNCTIONS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<UniqueKey<Record>> getUniqueKeys() {
        return Arrays.asList(Keys.RDB$INDEX_9, Keys.RDB$INDEX_53);
    }

    @Override
    public Rdb$functions as(String alias) {
        return new Rdb$functions(DSL.name(alias), this);
    }

    @Override
    public Rdb$functions as(Name alias) {
        return new Rdb$functions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Rdb$functions rename(String name) {
        return new Rdb$functions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Rdb$functions rename(Name name) {
        return new Rdb$functions(name, null);
    }
}
