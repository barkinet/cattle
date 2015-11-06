/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StoragePoolTable extends org.jooq.impl.TableImpl<io.cattle.platform.core.model.tables.records.StoragePoolRecord> {

	private static final long serialVersionUID = -1446338698;

	/**
	 * The singleton instance of <code>cattle.storage_pool</code>
	 */
	public static final io.cattle.platform.core.model.tables.StoragePoolTable STORAGE_POOL = new io.cattle.platform.core.model.tables.StoragePoolTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<io.cattle.platform.core.model.tables.records.StoragePoolRecord> getRecordType() {
		return io.cattle.platform.core.model.tables.records.StoragePoolRecord.class;
	}

	/**
	 * The column <code>cattle.storage_pool.id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.StoragePoolRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>cattle.storage_pool.name</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.StoragePoolRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.storage_pool.account_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.StoragePoolRecord, java.lang.Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.storage_pool.kind</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.StoragePoolRecord, java.lang.String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>cattle.storage_pool.uuid</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.StoragePoolRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>cattle.storage_pool.description</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.StoragePoolRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * The column <code>cattle.storage_pool.state</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.StoragePoolRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>cattle.storage_pool.created</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.StoragePoolRecord, java.util.Date> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.storage_pool.removed</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.StoragePoolRecord, java.util.Date> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.storage_pool.remove_time</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.StoragePoolRecord, java.util.Date> REMOVE_TIME = createField("remove_time", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.storage_pool.data</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.StoragePoolRecord, java.util.Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB.length(16777215).asConvertedDataType(new io.cattle.platform.db.jooq.converter.DataConverter()), this, "");

	/**
	 * The column <code>cattle.storage_pool.physical_total_size_mb</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.StoragePoolRecord, java.lang.Long> PHYSICAL_TOTAL_SIZE_MB = createField("physical_total_size_mb", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.storage_pool.virtual_total_size_mb</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.StoragePoolRecord, java.lang.Long> VIRTUAL_TOTAL_SIZE_MB = createField("virtual_total_size_mb", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.storage_pool.external</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.StoragePoolRecord, java.lang.Boolean> EXTERNAL = createField("external", org.jooq.impl.SQLDataType.BIT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>cattle.storage_pool.agent_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.StoragePoolRecord, java.lang.Long> AGENT_ID = createField("agent_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.storage_pool.zone_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.StoragePoolRecord, java.lang.Long> ZONE_ID = createField("zone_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.storage_pool.external_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.StoragePoolRecord, java.lang.String> EXTERNAL_ID = createField("external_id", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>cattle.storage_pool.driver_name</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.StoragePoolRecord, java.lang.String> DRIVER_NAME = createField("driver_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * Create a <code>cattle.storage_pool</code> table reference
	 */
	public StoragePoolTable() {
		this("storage_pool", null);
	}

	/**
	 * Create an aliased <code>cattle.storage_pool</code> table reference
	 */
	public StoragePoolTable(java.lang.String alias) {
		this(alias, io.cattle.platform.core.model.tables.StoragePoolTable.STORAGE_POOL);
	}

	private StoragePoolTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.StoragePoolRecord> aliased) {
		this(alias, aliased, null);
	}

	private StoragePoolTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.StoragePoolRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, io.cattle.platform.core.model.CattleTable.CATTLE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<io.cattle.platform.core.model.tables.records.StoragePoolRecord, java.lang.Long> getIdentity() {
		return io.cattle.platform.core.model.Keys.IDENTITY_STORAGE_POOL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.StoragePoolRecord> getPrimaryKey() {
		return io.cattle.platform.core.model.Keys.KEY_STORAGE_POOL_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.StoragePoolRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.StoragePoolRecord>>asList(io.cattle.platform.core.model.Keys.KEY_STORAGE_POOL_PRIMARY, io.cattle.platform.core.model.Keys.KEY_STORAGE_POOL_IDX_STORAGE_POOL_UUID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.StoragePoolRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.StoragePoolRecord, ?>>asList(io.cattle.platform.core.model.Keys.FK_STORAGE_POOL__ACCOUNT_ID, io.cattle.platform.core.model.Keys.FK_STORAGE_POOL__AGENT_ID, io.cattle.platform.core.model.Keys.FK_STORAGE_POOL__ZONE_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public io.cattle.platform.core.model.tables.StoragePoolTable as(java.lang.String alias) {
		return new io.cattle.platform.core.model.tables.StoragePoolTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public io.cattle.platform.core.model.tables.StoragePoolTable rename(java.lang.String name) {
		return new io.cattle.platform.core.model.tables.StoragePoolTable(name, null);
	}
}
