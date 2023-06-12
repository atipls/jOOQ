/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.mysql.information_schema.tables;


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
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.mysql.information_schema.InformationSchema;
import org.jooq.meta.mysql.information_schema.Keys;
import org.jooq.meta.mysql.information_schema.tables.Schemata.SchemataPath;
import org.jooq.meta.mysql.information_schema.tables.TableConstraints.TableConstraintsPath;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class KeyColumnUsage extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.KEY_COLUMN_USAGE</code>
     */
    public static final KeyColumnUsage KEY_COLUMN_USAGE = new KeyColumnUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column
     * <code>information_schema.KEY_COLUMN_USAGE.CONSTRAINT_CATALOG</code>.
     */
    public final TableField<Record, String> CONSTRAINT_CATALOG = createField(DSL.name("CONSTRAINT_CATALOG"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.KEY_COLUMN_USAGE.CONSTRAINT_SCHEMA</code>.
     */
    public final TableField<Record, String> CONSTRAINT_SCHEMA = createField(DSL.name("CONSTRAINT_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.KEY_COLUMN_USAGE.CONSTRAINT_NAME</code>.
     */
    public final TableField<Record, String> CONSTRAINT_NAME = createField(DSL.name("CONSTRAINT_NAME"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column
     * <code>information_schema.KEY_COLUMN_USAGE.TABLE_CATALOG</code>.
     */
    public final TableField<Record, String> TABLE_CATALOG = createField(DSL.name("TABLE_CATALOG"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.KEY_COLUMN_USAGE.TABLE_SCHEMA</code>.
     */
    public final TableField<Record, String> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.KEY_COLUMN_USAGE.TABLE_NAME</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.KEY_COLUMN_USAGE.COLUMN_NAME</code>.
     */
    public final TableField<Record, String> COLUMN_NAME = createField(DSL.name("COLUMN_NAME"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column
     * <code>information_schema.KEY_COLUMN_USAGE.ORDINAL_POSITION</code>.
     */
    public final TableField<Record, UInteger> ORDINAL_POSITION = createField(DSL.name("ORDINAL_POSITION"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column
     * <code>information_schema.KEY_COLUMN_USAGE.POSITION_IN_UNIQUE_CONSTRAINT</code>.
     */
    public final TableField<Record, UInteger> POSITION_IN_UNIQUE_CONSTRAINT = createField(DSL.name("POSITION_IN_UNIQUE_CONSTRAINT"), SQLDataType.INTEGERUNSIGNED, this, "");

    /**
     * The column
     * <code>information_schema.KEY_COLUMN_USAGE.REFERENCED_TABLE_SCHEMA</code>.
     */
    public final TableField<Record, String> REFERENCED_TABLE_SCHEMA = createField(DSL.name("REFERENCED_TABLE_SCHEMA"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column
     * <code>information_schema.KEY_COLUMN_USAGE.REFERENCED_TABLE_NAME</code>.
     */
    public final TableField<Record, String> REFERENCED_TABLE_NAME = createField(DSL.name("REFERENCED_TABLE_NAME"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column
     * <code>information_schema.KEY_COLUMN_USAGE.REFERENCED_COLUMN_NAME</code>.
     */
    public final TableField<Record, String> REFERENCED_COLUMN_NAME = createField(DSL.name("REFERENCED_COLUMN_NAME"), SQLDataType.VARCHAR(64), this, "");

    private KeyColumnUsage(Name alias, Table<Record> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private KeyColumnUsage(Name alias, Table<Record> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>information_schema.KEY_COLUMN_USAGE</code> table
     * reference
     */
    public KeyColumnUsage(String alias) {
        this(DSL.name(alias), KEY_COLUMN_USAGE);
    }

    /**
     * Create an aliased <code>information_schema.KEY_COLUMN_USAGE</code> table
     * reference
     */
    public KeyColumnUsage(Name alias) {
        this(alias, KEY_COLUMN_USAGE);
    }

    /**
     * Create a <code>information_schema.KEY_COLUMN_USAGE</code> table reference
     */
    public KeyColumnUsage() {
        this(DSL.name("KEY_COLUMN_USAGE"), null);
    }

    public <O extends Record> KeyColumnUsage(Table<O> path, ForeignKey<O, Record> childPath, InverseForeignKey<O, Record> parentPath) {
        super(path, childPath, parentPath, KEY_COLUMN_USAGE);
    }

    public static class KeyColumnUsagePath extends KeyColumnUsage implements Path<Record> {
        public <O extends Record> KeyColumnUsagePath(Table<O> path, ForeignKey<O, Record> childPath, InverseForeignKey<O, Record> parentPath) {
            super(path, childPath, parentPath);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public List<ForeignKey<Record, ?>> getReferences() {
        return Arrays.asList(Keys.SYNTHETIC_FK_KEY_COLUMN_USAGE__SYNTHETIC_PK_SCHEMATA, Keys.SYNTHETIC_FK_KEY_COLUMN_USAGE__SYNTHETIC_PK_TABLE_CONSTRAINTS);
    }

    private transient SchemataPath _schemata;

    /**
     * Get the implicit join path to the
     * <code>information_schema.SCHEMATA</code> table.
     */
    public SchemataPath schemata() {
        if (_schemata == null)
            _schemata = new SchemataPath(this, Keys.SYNTHETIC_FK_KEY_COLUMN_USAGE__SYNTHETIC_PK_SCHEMATA, null);

        return _schemata;
    }

    private transient TableConstraintsPath _tableConstraints;

    /**
     * Get the implicit join path to the
     * <code>information_schema.TABLE_CONSTRAINTS</code> table.
     */
    public TableConstraintsPath tableConstraints() {
        if (_tableConstraints == null)
            _tableConstraints = new TableConstraintsPath(this, Keys.SYNTHETIC_FK_KEY_COLUMN_USAGE__SYNTHETIC_PK_TABLE_CONSTRAINTS, null);

        return _tableConstraints;
    }

    @Override
    public KeyColumnUsage as(String alias) {
        return new KeyColumnUsage(DSL.name(alias), this);
    }

    @Override
    public KeyColumnUsage as(Name alias) {
        return new KeyColumnUsage(alias, this);
    }

    @Override
    public KeyColumnUsage as(Table<?> alias) {
        return new KeyColumnUsage(alias.getQualifiedName(), this);
    }
}
