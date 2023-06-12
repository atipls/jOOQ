/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.mysql.information_schema.tables;


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
import org.jooq.meta.mysql.information_schema.tables.CheckConstraints.CheckConstraintsPath;
import org.jooq.meta.mysql.information_schema.tables.Columns.ColumnsPath;
import org.jooq.meta.mysql.information_schema.tables.KeyColumnUsage.KeyColumnUsagePath;
import org.jooq.meta.mysql.information_schema.tables.ReferentialConstraints.ReferentialConstraintsPath;
import org.jooq.meta.mysql.information_schema.tables.Routines.RoutinesPath;
import org.jooq.meta.mysql.information_schema.tables.TableConstraints.TableConstraintsPath;
import org.jooq.meta.mysql.information_schema.tables.Tables.TablesPath;
import org.jooq.meta.mysql.information_schema.tables.Views.ViewsPath;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Schemata extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.SCHEMATA</code>
     */
    public static final Schemata SCHEMATA = new Schemata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.SCHEMATA.CATALOG_NAME</code>.
     */
    public final TableField<Record, String> CATALOG_NAME = createField(DSL.name("CATALOG_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.SCHEMATA.SCHEMA_NAME</code>.
     */
    public final TableField<Record, String> SCHEMA_NAME = createField(DSL.name("SCHEMA_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.SCHEMATA.DEFAULT_CHARACTER_SET_NAME</code>.
     */
    public final TableField<Record, String> DEFAULT_CHARACTER_SET_NAME = createField(DSL.name("DEFAULT_CHARACTER_SET_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.SCHEMATA.DEFAULT_COLLATION_NAME</code>.
     */
    public final TableField<Record, String> DEFAULT_COLLATION_NAME = createField(DSL.name("DEFAULT_COLLATION_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.SCHEMATA.SQL_PATH</code>.
     */
    public final TableField<Record, byte[]> SQL_PATH = createField(DSL.name("SQL_PATH"), SQLDataType.BINARY, this, "");

    /**
     * The column <code>information_schema.SCHEMATA.DEFAULT_ENCRYPTION</code>.
     */
    public final TableField<Record, String> DEFAULT_ENCRYPTION = createField(DSL.name("DEFAULT_ENCRYPTION"), SQLDataType.VARCHAR(3).nullable(false), this, "");

    private Schemata(Name alias, Table<Record> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Schemata(Name alias, Table<Record> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>information_schema.SCHEMATA</code> table
     * reference
     */
    public Schemata(String alias) {
        this(DSL.name(alias), SCHEMATA);
    }

    /**
     * Create an aliased <code>information_schema.SCHEMATA</code> table
     * reference
     */
    public Schemata(Name alias) {
        this(alias, SCHEMATA);
    }

    /**
     * Create a <code>information_schema.SCHEMATA</code> table reference
     */
    public Schemata() {
        this(DSL.name("SCHEMATA"), null);
    }

    public <O extends Record> Schemata(Table<O> path, ForeignKey<O, Record> childPath, InverseForeignKey<O, Record> parentPath) {
        super(path, childPath, parentPath, SCHEMATA);
    }

    public static class SchemataPath extends Schemata implements Path<Record> {
        public <O extends Record> SchemataPath(Table<O> path, ForeignKey<O, Record> childPath, InverseForeignKey<O, Record> parentPath) {
            super(path, childPath, parentPath);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.SYNTHETIC_PK_SCHEMATA;
    }

    private transient CheckConstraintsPath _checkConstraints;

    /**
     * Get the implicit to-many join path to the
     * <code>information_schema.CHECK_CONSTRAINTS</code> table
     */
    public CheckConstraintsPath checkConstraints() {
        if (_checkConstraints == null)
            _checkConstraints = new CheckConstraintsPath(this, null, Keys.SYNTHETIC_FK_CHECK_CONSTRAINTS__SYNTHETIC_PK_SCHEMATA.getInverseKey());

        return _checkConstraints;
    }

    private transient KeyColumnUsagePath _keyColumnUsage;

    /**
     * Get the implicit to-many join path to the
     * <code>information_schema.KEY_COLUMN_USAGE</code> table
     */
    public KeyColumnUsagePath keyColumnUsage() {
        if (_keyColumnUsage == null)
            _keyColumnUsage = new KeyColumnUsagePath(this, null, Keys.SYNTHETIC_FK_KEY_COLUMN_USAGE__SYNTHETIC_PK_SCHEMATA.getInverseKey());

        return _keyColumnUsage;
    }

    private transient ReferentialConstraintsPath _referentialConstraints;

    /**
     * Get the implicit to-many join path to the
     * <code>information_schema.REFERENTIAL_CONSTRAINTS</code> table
     */
    public ReferentialConstraintsPath referentialConstraints() {
        if (_referentialConstraints == null)
            _referentialConstraints = new ReferentialConstraintsPath(this, null, Keys.SYNTHETIC_FK_REFERENTIAL_CONSTRAINTS__SYNTHETIC_PK_SCHEMATA.getInverseKey());

        return _referentialConstraints;
    }

    private transient TableConstraintsPath _tableConstraints;

    /**
     * Get the implicit to-many join path to the
     * <code>information_schema.TABLE_CONSTRAINTS</code> table
     */
    public TableConstraintsPath tableConstraints() {
        if (_tableConstraints == null)
            _tableConstraints = new TableConstraintsPath(this, null, Keys.SYNTHETIC_FK_TABLE_CONSTRAINTS__SYNTHETIC_PK_SCHEMATA.getInverseKey());

        return _tableConstraints;
    }

    private transient ColumnsPath _columns;

    /**
     * Get the implicit to-many join path to the
     * <code>information_schema.COLUMNS</code> table
     */
    public ColumnsPath columns() {
        if (_columns == null)
            _columns = new ColumnsPath(this, null, Keys.SYNTHETIC_FK_COLUMNS__SYNTHETIC_PK_SCHEMATA.getInverseKey());

        return _columns;
    }

    private transient TablesPath _tables;

    /**
     * Get the implicit to-many join path to the
     * <code>information_schema.TABLES</code> table
     */
    public TablesPath tables() {
        if (_tables == null)
            _tables = new TablesPath(this, null, Keys.SYNTHETIC_FK_TABLES__SYNTHETIC_PK_SCHEMATA.getInverseKey());

        return _tables;
    }

    private transient ViewsPath _views;

    /**
     * Get the implicit to-many join path to the
     * <code>information_schema.VIEWS</code> table
     */
    public ViewsPath views() {
        if (_views == null)
            _views = new ViewsPath(this, null, Keys.SYNTHETIC_FK_VIEWS__SYNTHETIC_PK_SCHEMATA.getInverseKey());

        return _views;
    }

    private transient RoutinesPath _routines;

    /**
     * Get the implicit to-many join path to the
     * <code>information_schema.ROUTINES</code> table
     */
    public RoutinesPath routines() {
        if (_routines == null)
            _routines = new RoutinesPath(this, null, Keys.SYNTHETIC_FK_ROUTINES__SYNTHETIC_PK_SCHEMATA.getInverseKey());

        return _routines;
    }

    @Override
    public Schemata as(String alias) {
        return new Schemata(DSL.name(alias), this);
    }

    @Override
    public Schemata as(Name alias) {
        return new Schemata(alias, this);
    }

    @Override
    public Schemata as(Table<?> alias) {
        return new Schemata(alias.getQualifiedName(), this);
    }
}
