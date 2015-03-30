/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.fingence.slayer.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.AuditedModel;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Asset service. Represents a row in the &quot;fing_Asset&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.fingence.slayer.model.impl.AssetModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.fingence.slayer.model.impl.AssetImpl}.
 * </p>
 *
 * @author Ahmed Hasan
 * @see Asset
 * @see com.fingence.slayer.model.impl.AssetImpl
 * @see com.fingence.slayer.model.impl.AssetModelImpl
 * @generated
 */
public interface AssetModel extends AuditedModel, BaseModel<Asset> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a asset model instance should use the {@link Asset} interface instead.
	 */

	/**
	 * Returns the primary key of this asset.
	 *
	 * @return the primary key of this asset
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this asset.
	 *
	 * @param primaryKey the primary key of this asset
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the asset ID of this asset.
	 *
	 * @return the asset ID of this asset
	 */
	public long getAssetId();

	/**
	 * Sets the asset ID of this asset.
	 *
	 * @param assetId the asset ID of this asset
	 */
	public void setAssetId(long assetId);

	/**
	 * Returns the security_ticker of this asset.
	 *
	 * @return the security_ticker of this asset
	 */
	@AutoEscape
	public String getSecurity_ticker();

	/**
	 * Sets the security_ticker of this asset.
	 *
	 * @param security_ticker the security_ticker of this asset
	 */
	public void setSecurity_ticker(String security_ticker);

	/**
	 * Returns the id_cusip of this asset.
	 *
	 * @return the id_cusip of this asset
	 */
	@AutoEscape
	public String getId_cusip();

	/**
	 * Sets the id_cusip of this asset.
	 *
	 * @param id_cusip the id_cusip of this asset
	 */
	public void setId_cusip(String id_cusip);

	/**
	 * Returns the id_isin of this asset.
	 *
	 * @return the id_isin of this asset
	 */
	@AutoEscape
	public String getId_isin();

	/**
	 * Sets the id_isin of this asset.
	 *
	 * @param id_isin the id_isin of this asset
	 */
	public void setId_isin(String id_isin);

	/**
	 * Returns the id_bb_global of this asset.
	 *
	 * @return the id_bb_global of this asset
	 */
	@AutoEscape
	public String getId_bb_global();

	/**
	 * Sets the id_bb_global of this asset.
	 *
	 * @param id_bb_global the id_bb_global of this asset
	 */
	public void setId_bb_global(String id_bb_global);

	/**
	 * Returns the id_bb_sec_num_src of this asset.
	 *
	 * @return the id_bb_sec_num_src of this asset
	 */
	public long getId_bb_sec_num_src();

	/**
	 * Sets the id_bb_sec_num_src of this asset.
	 *
	 * @param id_bb_sec_num_src the id_bb_sec_num_src of this asset
	 */
	public void setId_bb_sec_num_src(long id_bb_sec_num_src);

	/**
	 * Returns the name of this asset.
	 *
	 * @return the name of this asset
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this asset.
	 *
	 * @param name the name of this asset
	 */
	public void setName(String name);

	/**
	 * Returns the chg_pct_mtd of this asset.
	 *
	 * @return the chg_pct_mtd of this asset
	 */
	public double getChg_pct_mtd();

	/**
	 * Sets the chg_pct_mtd of this asset.
	 *
	 * @param chg_pct_mtd the chg_pct_mtd of this asset
	 */
	public void setChg_pct_mtd(double chg_pct_mtd);

	/**
	 * Returns the chg_pct_5d of this asset.
	 *
	 * @return the chg_pct_5d of this asset
	 */
	public double getChg_pct_5d();

	/**
	 * Sets the chg_pct_5d of this asset.
	 *
	 * @param chg_pct_5d the chg_pct_5d of this asset
	 */
	public void setChg_pct_5d(double chg_pct_5d);

	/**
	 * Returns the chg_pct_1m of this asset.
	 *
	 * @return the chg_pct_1m of this asset
	 */
	public double getChg_pct_1m();

	/**
	 * Sets the chg_pct_1m of this asset.
	 *
	 * @param chg_pct_1m the chg_pct_1m of this asset
	 */
	public void setChg_pct_1m(double chg_pct_1m);

	/**
	 * Returns the chg_pct_3m of this asset.
	 *
	 * @return the chg_pct_3m of this asset
	 */
	public double getChg_pct_3m();

	/**
	 * Sets the chg_pct_3m of this asset.
	 *
	 * @param chg_pct_3m the chg_pct_3m of this asset
	 */
	public void setChg_pct_3m(double chg_pct_3m);

	/**
	 * Returns the chg_pct_6m of this asset.
	 *
	 * @return the chg_pct_6m of this asset
	 */
	public double getChg_pct_6m();

	/**
	 * Sets the chg_pct_6m of this asset.
	 *
	 * @param chg_pct_6m the chg_pct_6m of this asset
	 */
	public void setChg_pct_6m(double chg_pct_6m);

	/**
	 * Returns the chg_pct_ytd of this asset.
	 *
	 * @return the chg_pct_ytd of this asset
	 */
	public double getChg_pct_ytd();

	/**
	 * Sets the chg_pct_ytd of this asset.
	 *
	 * @param chg_pct_ytd the chg_pct_ytd of this asset
	 */
	public void setChg_pct_ytd(double chg_pct_ytd);

	/**
	 * Returns the chg_pct_high_52week of this asset.
	 *
	 * @return the chg_pct_high_52week of this asset
	 */
	public double getChg_pct_high_52week();

	/**
	 * Sets the chg_pct_high_52week of this asset.
	 *
	 * @param chg_pct_high_52week the chg_pct_high_52week of this asset
	 */
	public void setChg_pct_high_52week(double chg_pct_high_52week);

	/**
	 * Returns the chg_pct_low_52week of this asset.
	 *
	 * @return the chg_pct_low_52week of this asset
	 */
	public double getChg_pct_low_52week();

	/**
	 * Sets the chg_pct_low_52week of this asset.
	 *
	 * @param chg_pct_low_52week the chg_pct_low_52week of this asset
	 */
	public void setChg_pct_low_52week(double chg_pct_low_52week);

	/**
	 * Returns the chg_pct_1yr of this asset.
	 *
	 * @return the chg_pct_1yr of this asset
	 */
	public double getChg_pct_1yr();

	/**
	 * Sets the chg_pct_1yr of this asset.
	 *
	 * @param chg_pct_1yr the chg_pct_1yr of this asset
	 */
	public void setChg_pct_1yr(double chg_pct_1yr);

	/**
	 * Returns the chg_trr_5yr of this asset.
	 *
	 * @return the chg_trr_5yr of this asset
	 */
	public double getChg_trr_5yr();

	/**
	 * Sets the chg_trr_5yr of this asset.
	 *
	 * @param chg_trr_5yr the chg_trr_5yr of this asset
	 */
	public void setChg_trr_5yr(double chg_trr_5yr);

	/**
	 * Returns the current_price of this asset.
	 *
	 * @return the current_price of this asset
	 */
	public double getCurrent_price();

	/**
	 * Sets the current_price of this asset.
	 *
	 * @param current_price the current_price of this asset
	 */
	public void setCurrent_price(double current_price);

	/**
	 * Returns the last_price of this asset.
	 *
	 * @return the last_price of this asset
	 */
	public double getLast_price();

	/**
	 * Sets the last_price of this asset.
	 *
	 * @param last_price the last_price of this asset
	 */
	public void setLast_price(double last_price);

	/**
	 * Returns the bid_price of this asset.
	 *
	 * @return the bid_price of this asset
	 */
	public double getBid_price();

	/**
	 * Sets the bid_price of this asset.
	 *
	 * @param bid_price the bid_price of this asset
	 */
	public void setBid_price(double bid_price);

	/**
	 * Returns the ask_price of this asset.
	 *
	 * @return the ask_price of this asset
	 */
	public double getAsk_price();

	/**
	 * Sets the ask_price of this asset.
	 *
	 * @param ask_price the ask_price of this asset
	 */
	public void setAsk_price(double ask_price);

	/**
	 * Returns the security_des of this asset.
	 *
	 * @return the security_des of this asset
	 */
	@AutoEscape
	public String getSecurity_des();

	/**
	 * Sets the security_des of this asset.
	 *
	 * @param security_des the security_des of this asset
	 */
	public void setSecurity_des(String security_des);

	/**
	 * Returns the parent_comp_name of this asset.
	 *
	 * @return the parent_comp_name of this asset
	 */
	@AutoEscape
	public String getParent_comp_name();

	/**
	 * Sets the parent_comp_name of this asset.
	 *
	 * @param parent_comp_name the parent_comp_name of this asset
	 */
	public void setParent_comp_name(String parent_comp_name);

	/**
	 * Returns the security_class of this asset.
	 *
	 * @return the security_class of this asset
	 */
	public int getSecurity_class();

	/**
	 * Sets the security_class of this asset.
	 *
	 * @param security_class the security_class of this asset
	 */
	public void setSecurity_class(int security_class);

	/**
	 * Returns the volatility_30d of this asset.
	 *
	 * @return the volatility_30d of this asset
	 */
	public double getVolatility_30d();

	/**
	 * Sets the volatility_30d of this asset.
	 *
	 * @param volatility_30d the volatility_30d of this asset
	 */
	public void setVolatility_30d(double volatility_30d);

	/**
	 * Returns the volatility_90d of this asset.
	 *
	 * @return the volatility_90d of this asset
	 */
	public double getVolatility_90d();

	/**
	 * Sets the volatility_90d of this asset.
	 *
	 * @param volatility_90d the volatility_90d of this asset
	 */
	public void setVolatility_90d(double volatility_90d);

	/**
	 * Returns the volatility_180d of this asset.
	 *
	 * @return the volatility_180d of this asset
	 */
	public double getVolatility_180d();

	/**
	 * Sets the volatility_180d of this asset.
	 *
	 * @param volatility_180d the volatility_180d of this asset
	 */
	public void setVolatility_180d(double volatility_180d);

	/**
	 * Returns the volatility_360d of this asset.
	 *
	 * @return the volatility_360d of this asset
	 */
	public double getVolatility_360d();

	/**
	 * Sets the volatility_360d of this asset.
	 *
	 * @param volatility_360d the volatility_360d of this asset
	 */
	public void setVolatility_360d(double volatility_360d);

	/**
	 * Returns the currency of this asset.
	 *
	 * @return the currency of this asset
	 */
	@AutoEscape
	public String getCurrency();

	/**
	 * Sets the currency of this asset.
	 *
	 * @param currency the currency of this asset
	 */
	public void setCurrency(String currency);

	/**
	 * Returns the country of this asset.
	 *
	 * @return the country of this asset
	 */
	public long getCountry();

	/**
	 * Sets the country of this asset.
	 *
	 * @param country the country of this asset
	 */
	public void setCountry(long country);

	/**
	 * Returns the country_of_risk of this asset.
	 *
	 * @return the country_of_risk of this asset
	 */
	public long getCountry_of_risk();

	/**
	 * Sets the country_of_risk of this asset.
	 *
	 * @param country_of_risk the country_of_risk of this asset
	 */
	public void setCountry_of_risk(long country_of_risk);

	/**
	 * Returns the create date of this asset.
	 *
	 * @return the create date of this asset
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this asset.
	 *
	 * @param createDate the create date of this asset
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this asset.
	 *
	 * @return the modified date of this asset
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this asset.
	 *
	 * @param modifiedDate the modified date of this asset
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the company ID of this asset.
	 *
	 * @return the company ID of this asset
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this asset.
	 *
	 * @param companyId the company ID of this asset
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this asset.
	 *
	 * @return the user ID of this asset
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this asset.
	 *
	 * @param userId the user ID of this asset
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this asset.
	 *
	 * @return the user uuid of this asset
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this asset.
	 *
	 * @param userUuid the user uuid of this asset
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this asset.
	 *
	 * @return the user name of this asset
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this asset.
	 *
	 * @param userName the user name of this asset
	 */
	@Override
	public void setUserName(String userName);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Asset asset);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Asset> toCacheModel();

	@Override
	public Asset toEscapedModel();

	@Override
	public Asset toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}