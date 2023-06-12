/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.mysql.information_schema.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Path;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.mysql.information_schema.InformationSchema;
import org.jooq.meta.mysql.information_schema.Keys;
import org.jooq.meta.mysql.information_schema.tables.Columns.ColumnsPath;
import org.jooq.meta.mysql.information_schema.tables.Schemata.SchemataPath;
import org.jooq.meta.mysql.information_schema.tables.Views.ViewsPath;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.TABLES</code>
     */
    public static final Tables TABLES = new Tables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.TABLES.TABLE_CATALOG</code>.
     */
    public final TableField<Record, String> TABLE_CATALOG = createField(DSL.name("TABLE_CATALOG"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.TABLES.TABLE_SCHEMA</code>.
     */
    public final TableField<Record, String> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.TABLES.TABLE_NAME</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.TABLES.TABLE_TYPE</code>.
     */
    public final TableField<Record, String> TABLE_TYPE = createField(DSL.name("TABLE_TYPE"), SQLDataType.VARCHAR(11).nullable(false), this, "");

    /**
     * The column <code>information_schema.TABLES.ENGINE</code>.
     */
    public final TableField<Record, String> ENGINE = createField(DSL.name("ENGINE"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>information_schema.TABLES.VERSION</code>.
     */
    public final TableField<Record, Integer> VERSION = createField(DSL.name("VERSION"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.TABLES.ROW_FORMAT</code>.
     */
    public final TableField<Record, String> ROW_FORMAT = createField(DSL.name("ROW_FORMAT"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>information_schema.TABLES.TABLE_ROWS</code>.
     */
    public final TableField<Record, ULong> TABLE_ROWS = createField(DSL.name("TABLE_ROWS"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.TABLES.AVG_ROW_LENGTH</code>.
     */
    public final TableField<Record, ULong> AVG_ROW_LENGTH = createField(DSL.name("AVG_ROW_LENGTH"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.TABLES.DATA_LENGTH</code>.
     */
    public final TableField<Record, ULong> DATA_LENGTH = createField(DSL.name("DATA_LENGTH"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.TABLES.MAX_DATA_LENGTH</code>.
     */
    public final TableField<Record, ULong> MAX_DATA_LENGTH = createField(DSL.name("MAX_DATA_LENGTH"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.TABLES.INDEX_LENGTH</code>.
     */
    public final TableField<Record, ULong> INDEX_LENGTH = createField(DSL.name("INDEX_LENGTH"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.TABLES.DATA_FREE</code>.
     */
    public final TableField<Record, ULong> DATA_FREE = createField(DSL.name("DATA_FREE"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.TABLES.AUTO_INCREMENT</code>.
     */
    public final TableField<Record, ULong> AUTO_INCREMENT = createField(DSL.name("AUTO_INCREMENT"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.TABLES.CREATE_TIME</code>.
     */
    public final TableField<Record, Timestamp> CREATE_TIME = createField(DSL.name("CREATE_TIME"), SQLDataType.TIMESTAMP(0).nullable(false), this, "");

    /**
     * The column <code>information_schema.TABLES.UPDATE_TIME</code>.
     */
    public final TableField<Record, Timestamp> UPDATE_TIME = createField(DSL.name("UPDATE_TIME"), SQLDataType.TIMESTAMP(0), this, "");

    /**
     * The column <code>information_schema.TABLES.CHECK_TIME</code>.
     */
    public final TableField<Record, Timestamp> CHECK_TIME = createField(DSL.name("CHECK_TIME"), SQLDataType.TIMESTAMP(0), this, "");

    /**
     * The column <code>information_schema.TABLES.TABLE_COLLATION</code>.
     */
    public final TableField<Record, String> TABLE_COLLATION = createField(DSL.name("TABLE_COLLATION"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>information_schema.TABLES.CHECKSUM</code>.
     */
    public final TableField<Record, Long> CHECKSUM = createField(DSL.name("CHECKSUM"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.TABLES.CREATE_OPTIONS</code>.
     */
    public final TableField<Record, String> CREATE_OPTIONS = createField(DSL.name("CREATE_OPTIONS"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>information_schema.TABLES.TABLE_COMMENT</code>.
     */
    public final TableField<Record, String> TABLE_COMMENT = createField(DSL.name("TABLE_COMMENT"), SQLDataType.CLOB, this, "");

    private Tables(Name alias, Table<Record> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Tables(Name alias, Table<Record> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>information_schema.TABLES</code> table reference
     */
    public Tables(String alias) {
        this(DSL.name(alias), TABLES);
    }

    /**
     * Create an aliased <code>information_schema.TABLES</code> table reference
     */
    public Tables(Name alias) {
        this(alias, TABLES);
    }

    /**
     * Create a <code>information_schema.TABLES</code> table reference
     */
    public Tables() {
        this(DSL.name("TABLES"), null);
    }

    public <O extends Record> Tables(Table<O> path, ForeignKey<O, Record> childPath, InverseForeignKey<O, Record> parentPath) {
        super(path, childPath, parentPath, TABLES);
    }

    public static class TablesPath extends Tables implements Path<Record> {
        public <O extends Record> TablesPath(Table<O> path, ForeignKey<O, Record> childPath, InverseForeignKey<O, Record> parentPath) {
            super(path, childPath, parentPath);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.SYNTHETIC_PK_TABLES;
    }

    @Override
    public List<ForeignKey<Record, ?>> getReferences() {
        return Arrays.asList(Keys.SYNTHETIC_FK_TABLES__SYNTHETIC_PK_SCHEMATA);
    }

    private transient SchemataPath _schemata;

    /**
     * Get the implicit join path to the
     * <code>information_schema.SCHEMATA</code> table.
     */
    public SchemataPath schemata() {
        if (_schemata == null)
            _schemata = new SchemataPath(this, Keys.SYNTHETIC_FK_TABLES__SYNTHETIC_PK_SCHEMATA, null);

        return _schemata;
    }

    private transient ColumnsPath _columns;

    /**
     * Get the implicit to-many join path to the
     * <code>information_schema.COLUMNS</code> table
     */
    public ColumnsPath columns() {
        if (_columns == null)
            _columns = new ColumnsPath(this, null, Keys.SYNTHETIC_FK_COLUMNS__SYNTHETIC_PK_TABLES.getInverseKey());

        return _columns;
    }

    private transient ViewsPath _views;

    /**
     * Get the implicit to-many join path to the
     * <code>information_schema.VIEWS</code> table
     */
    public ViewsPath views() {
        if (_views == null)
            _views = new ViewsPath(this, null, Keys.SYNTHETIC_FK_VIEWS__SYNTHETIC_PK_TABLES.getInverseKey());

        return _views;
    }

    @Override
    public Tables as(String alias) {
        return new Tables(DSL.name(alias), this);
    }

    @Override
    public Tables as(Name alias) {
        return new Tables(alias, this);
    }

    @Override
    public Tables as(Table<?> alias) {
        return new Tables(alias.getQualifiedName(), this);
    }
}
