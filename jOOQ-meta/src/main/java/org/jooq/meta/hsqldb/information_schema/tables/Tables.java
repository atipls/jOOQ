/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.hsqldb.information_schema.tables;


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
import org.jooq.meta.hsqldb.information_schema.InformationSchema;
import org.jooq.meta.hsqldb.information_schema.Keys;
import org.jooq.meta.hsqldb.information_schema.tables.Columns.ColumnsPath;
import org.jooq.meta.hsqldb.information_schema.tables.Schemata.SchemataPath;
import org.jooq.meta.hsqldb.information_schema.tables.Views.ViewsPath;


/**
 * one row for each table or view
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.TABLES</code>
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
     * The column <code>INFORMATION_SCHEMA.TABLES.TABLE_CATALOG</code>.
     */
    public final TableField<Record, String> TABLE_CATALOG = createField(DSL.name("TABLE_CATALOG"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.TABLE_SCHEMA</code>.
     */
    public final TableField<Record, String> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.TABLE_NAME</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.TABLE_TYPE</code>.
     */
    public final TableField<Record, String> TABLE_TYPE = createField(DSL.name("TABLE_TYPE"), SQLDataType.VARCHAR(65536), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.TABLES.SELF_REFERENCING_COLUMN_NAME</code>.
     */
    public final TableField<Record, String> SELF_REFERENCING_COLUMN_NAME = createField(DSL.name("SELF_REFERENCING_COLUMN_NAME"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.REFERENCE_GENERATION</code>.
     */
    public final TableField<Record, String> REFERENCE_GENERATION = createField(DSL.name("REFERENCE_GENERATION"), SQLDataType.VARCHAR(65536), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.TABLES.USER_DEFINED_TYPE_CATALOG</code>.
     */
    public final TableField<Record, String> USER_DEFINED_TYPE_CATALOG = createField(DSL.name("USER_DEFINED_TYPE_CATALOG"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.TABLES.USER_DEFINED_TYPE_SCHEMA</code>.
     */
    public final TableField<Record, String> USER_DEFINED_TYPE_SCHEMA = createField(DSL.name("USER_DEFINED_TYPE_SCHEMA"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.USER_DEFINED_TYPE_NAME</code>.
     */
    public final TableField<Record, String> USER_DEFINED_TYPE_NAME = createField(DSL.name("USER_DEFINED_TYPE_NAME"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.IS_INSERTABLE_INTO</code>.
     */
    public final TableField<Record, String> IS_INSERTABLE_INTO = createField(DSL.name("IS_INSERTABLE_INTO"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.IS_TYPED</code>.
     */
    public final TableField<Record, String> IS_TYPED = createField(DSL.name("IS_TYPED"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.COMMIT_ACTION</code>.
     */
    public final TableField<Record, String> COMMIT_ACTION = createField(DSL.name("COMMIT_ACTION"), SQLDataType.VARCHAR(65536), this, "");

    private Tables(Name alias, Table<Record> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Tables(Name alias, Table<Record> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment("one row for each table or view"), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.TABLES</code> table reference
     */
    public Tables(String alias) {
        this(DSL.name(alias), TABLES);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.TABLES</code> table reference
     */
    public Tables(Name alias) {
        this(alias, TABLES);
    }

    /**
     * Create a <code>INFORMATION_SCHEMA.TABLES</code> table reference
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
     * <code>INFORMATION_SCHEMA.SCHEMATA</code> table.
     */
    public SchemataPath schemata() {
        if (_schemata == null)
            _schemata = new SchemataPath(this, Keys.SYNTHETIC_FK_TABLES__SYNTHETIC_PK_SCHEMATA, null);

        return _schemata;
    }

    private transient ColumnsPath _columns;

    /**
     * Get the implicit to-many join path to the
     * <code>INFORMATION_SCHEMA.COLUMNS</code> table
     */
    public ColumnsPath columns() {
        if (_columns == null)
            _columns = new ColumnsPath(this, null, Keys.SYNTHETIC_FK_COLUMNS__SYNTHETIC_PK_TABLES.getInverseKey());

        return _columns;
    }

    private transient ViewsPath _views;

    /**
     * Get the implicit to-many join path to the
     * <code>INFORMATION_SCHEMA.VIEWS</code> table
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
