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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Asset}.
 * </p>
 *
 * @author Ahmed Hasan
 * @see Asset
 * @generated
 */
public class AssetWrapper implements Asset, ModelWrapper<Asset> {
	public AssetWrapper(Asset asset) {
		_asset = asset;
	}

	@Override
	public Class<?> getModelClass() {
		return Asset.class;
	}

	@Override
	public String getModelClassName() {
		return Asset.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("assetId", getAssetId());
		attributes.put("security_ticker", getSecurity_ticker());
		attributes.put("id_cusip", getId_cusip());
		attributes.put("id_isin", getId_isin());
		attributes.put("id_bb_global", getId_bb_global());
		attributes.put("id_bb_sec_num_src", getId_bb_sec_num_src());
		attributes.put("name", getName());
		attributes.put("chg_pct_mtd", getChg_pct_mtd());
		attributes.put("chg_pct_5d", getChg_pct_5d());
		attributes.put("chg_pct_1m", getChg_pct_1m());
		attributes.put("chg_pct_3m", getChg_pct_3m());
		attributes.put("chg_pct_6m", getChg_pct_6m());
		attributes.put("chg_pct_ytd", getChg_pct_ytd());
		attributes.put("chg_pct_high_52week", getChg_pct_high_52week());
		attributes.put("chg_pct_low_52week", getChg_pct_low_52week());
		attributes.put("chg_pct_1yr", getChg_pct_1yr());
		attributes.put("chg_trr_5yr", getChg_trr_5yr());
		attributes.put("current_price", getCurrent_price());
		attributes.put("last_price", getLast_price());
		attributes.put("bid_price", getBid_price());
		attributes.put("ask_price", getAsk_price());
		attributes.put("security_des", getSecurity_des());
		attributes.put("parent_comp_name", getParent_comp_name());
		attributes.put("security_class", getSecurity_class());
		attributes.put("volatility_30d", getVolatility_30d());
		attributes.put("volatility_90d", getVolatility_90d());
		attributes.put("volatility_180d", getVolatility_180d());
		attributes.put("volatility_360d", getVolatility_360d());
		attributes.put("currency", getCurrency());
		attributes.put("country", getCountry());
		attributes.put("country_of_risk", getCountry_of_risk());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long assetId = (Long)attributes.get("assetId");

		if (assetId != null) {
			setAssetId(assetId);
		}

		String security_ticker = (String)attributes.get("security_ticker");

		if (security_ticker != null) {
			setSecurity_ticker(security_ticker);
		}

		String id_cusip = (String)attributes.get("id_cusip");

		if (id_cusip != null) {
			setId_cusip(id_cusip);
		}

		String id_isin = (String)attributes.get("id_isin");

		if (id_isin != null) {
			setId_isin(id_isin);
		}

		String id_bb_global = (String)attributes.get("id_bb_global");

		if (id_bb_global != null) {
			setId_bb_global(id_bb_global);
		}

		Long id_bb_sec_num_src = (Long)attributes.get("id_bb_sec_num_src");

		if (id_bb_sec_num_src != null) {
			setId_bb_sec_num_src(id_bb_sec_num_src);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Double chg_pct_mtd = (Double)attributes.get("chg_pct_mtd");

		if (chg_pct_mtd != null) {
			setChg_pct_mtd(chg_pct_mtd);
		}

		Double chg_pct_5d = (Double)attributes.get("chg_pct_5d");

		if (chg_pct_5d != null) {
			setChg_pct_5d(chg_pct_5d);
		}

		Double chg_pct_1m = (Double)attributes.get("chg_pct_1m");

		if (chg_pct_1m != null) {
			setChg_pct_1m(chg_pct_1m);
		}

		Double chg_pct_3m = (Double)attributes.get("chg_pct_3m");

		if (chg_pct_3m != null) {
			setChg_pct_3m(chg_pct_3m);
		}

		Double chg_pct_6m = (Double)attributes.get("chg_pct_6m");

		if (chg_pct_6m != null) {
			setChg_pct_6m(chg_pct_6m);
		}

		Double chg_pct_ytd = (Double)attributes.get("chg_pct_ytd");

		if (chg_pct_ytd != null) {
			setChg_pct_ytd(chg_pct_ytd);
		}

		Double chg_pct_high_52week = (Double)attributes.get(
				"chg_pct_high_52week");

		if (chg_pct_high_52week != null) {
			setChg_pct_high_52week(chg_pct_high_52week);
		}

		Double chg_pct_low_52week = (Double)attributes.get("chg_pct_low_52week");

		if (chg_pct_low_52week != null) {
			setChg_pct_low_52week(chg_pct_low_52week);
		}

		Double chg_pct_1yr = (Double)attributes.get("chg_pct_1yr");

		if (chg_pct_1yr != null) {
			setChg_pct_1yr(chg_pct_1yr);
		}

		Double chg_trr_5yr = (Double)attributes.get("chg_trr_5yr");

		if (chg_trr_5yr != null) {
			setChg_trr_5yr(chg_trr_5yr);
		}

		Double current_price = (Double)attributes.get("current_price");

		if (current_price != null) {
			setCurrent_price(current_price);
		}

		Double last_price = (Double)attributes.get("last_price");

		if (last_price != null) {
			setLast_price(last_price);
		}

		Double bid_price = (Double)attributes.get("bid_price");

		if (bid_price != null) {
			setBid_price(bid_price);
		}

		Double ask_price = (Double)attributes.get("ask_price");

		if (ask_price != null) {
			setAsk_price(ask_price);
		}

		String security_des = (String)attributes.get("security_des");

		if (security_des != null) {
			setSecurity_des(security_des);
		}

		String parent_comp_name = (String)attributes.get("parent_comp_name");

		if (parent_comp_name != null) {
			setParent_comp_name(parent_comp_name);
		}

		Integer security_class = (Integer)attributes.get("security_class");

		if (security_class != null) {
			setSecurity_class(security_class);
		}

		Double volatility_30d = (Double)attributes.get("volatility_30d");

		if (volatility_30d != null) {
			setVolatility_30d(volatility_30d);
		}

		Double volatility_90d = (Double)attributes.get("volatility_90d");

		if (volatility_90d != null) {
			setVolatility_90d(volatility_90d);
		}

		Double volatility_180d = (Double)attributes.get("volatility_180d");

		if (volatility_180d != null) {
			setVolatility_180d(volatility_180d);
		}

		Double volatility_360d = (Double)attributes.get("volatility_360d");

		if (volatility_360d != null) {
			setVolatility_360d(volatility_360d);
		}

		String currency = (String)attributes.get("currency");

		if (currency != null) {
			setCurrency(currency);
		}

		Long country = (Long)attributes.get("country");

		if (country != null) {
			setCountry(country);
		}

		Long country_of_risk = (Long)attributes.get("country_of_risk");

		if (country_of_risk != null) {
			setCountry_of_risk(country_of_risk);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}
	}

	/**
	* Returns the primary key of this asset.
	*
	* @return the primary key of this asset
	*/
	@Override
	public long getPrimaryKey() {
		return _asset.getPrimaryKey();
	}

	/**
	* Sets the primary key of this asset.
	*
	* @param primaryKey the primary key of this asset
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_asset.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the asset ID of this asset.
	*
	* @return the asset ID of this asset
	*/
	@Override
	public long getAssetId() {
		return _asset.getAssetId();
	}

	/**
	* Sets the asset ID of this asset.
	*
	* @param assetId the asset ID of this asset
	*/
	@Override
	public void setAssetId(long assetId) {
		_asset.setAssetId(assetId);
	}

	/**
	* Returns the security_ticker of this asset.
	*
	* @return the security_ticker of this asset
	*/
	@Override
	public java.lang.String getSecurity_ticker() {
		return _asset.getSecurity_ticker();
	}

	/**
	* Sets the security_ticker of this asset.
	*
	* @param security_ticker the security_ticker of this asset
	*/
	@Override
	public void setSecurity_ticker(java.lang.String security_ticker) {
		_asset.setSecurity_ticker(security_ticker);
	}

	/**
	* Returns the id_cusip of this asset.
	*
	* @return the id_cusip of this asset
	*/
	@Override
	public java.lang.String getId_cusip() {
		return _asset.getId_cusip();
	}

	/**
	* Sets the id_cusip of this asset.
	*
	* @param id_cusip the id_cusip of this asset
	*/
	@Override
	public void setId_cusip(java.lang.String id_cusip) {
		_asset.setId_cusip(id_cusip);
	}

	/**
	* Returns the id_isin of this asset.
	*
	* @return the id_isin of this asset
	*/
	@Override
	public java.lang.String getId_isin() {
		return _asset.getId_isin();
	}

	/**
	* Sets the id_isin of this asset.
	*
	* @param id_isin the id_isin of this asset
	*/
	@Override
	public void setId_isin(java.lang.String id_isin) {
		_asset.setId_isin(id_isin);
	}

	/**
	* Returns the id_bb_global of this asset.
	*
	* @return the id_bb_global of this asset
	*/
	@Override
	public java.lang.String getId_bb_global() {
		return _asset.getId_bb_global();
	}

	/**
	* Sets the id_bb_global of this asset.
	*
	* @param id_bb_global the id_bb_global of this asset
	*/
	@Override
	public void setId_bb_global(java.lang.String id_bb_global) {
		_asset.setId_bb_global(id_bb_global);
	}

	/**
	* Returns the id_bb_sec_num_src of this asset.
	*
	* @return the id_bb_sec_num_src of this asset
	*/
	@Override
	public long getId_bb_sec_num_src() {
		return _asset.getId_bb_sec_num_src();
	}

	/**
	* Sets the id_bb_sec_num_src of this asset.
	*
	* @param id_bb_sec_num_src the id_bb_sec_num_src of this asset
	*/
	@Override
	public void setId_bb_sec_num_src(long id_bb_sec_num_src) {
		_asset.setId_bb_sec_num_src(id_bb_sec_num_src);
	}

	/**
	* Returns the name of this asset.
	*
	* @return the name of this asset
	*/
	@Override
	public java.lang.String getName() {
		return _asset.getName();
	}

	/**
	* Sets the name of this asset.
	*
	* @param name the name of this asset
	*/
	@Override
	public void setName(java.lang.String name) {
		_asset.setName(name);
	}

	/**
	* Returns the chg_pct_mtd of this asset.
	*
	* @return the chg_pct_mtd of this asset
	*/
	@Override
	public double getChg_pct_mtd() {
		return _asset.getChg_pct_mtd();
	}

	/**
	* Sets the chg_pct_mtd of this asset.
	*
	* @param chg_pct_mtd the chg_pct_mtd of this asset
	*/
	@Override
	public void setChg_pct_mtd(double chg_pct_mtd) {
		_asset.setChg_pct_mtd(chg_pct_mtd);
	}

	/**
	* Returns the chg_pct_5d of this asset.
	*
	* @return the chg_pct_5d of this asset
	*/
	@Override
	public double getChg_pct_5d() {
		return _asset.getChg_pct_5d();
	}

	/**
	* Sets the chg_pct_5d of this asset.
	*
	* @param chg_pct_5d the chg_pct_5d of this asset
	*/
	@Override
	public void setChg_pct_5d(double chg_pct_5d) {
		_asset.setChg_pct_5d(chg_pct_5d);
	}

	/**
	* Returns the chg_pct_1m of this asset.
	*
	* @return the chg_pct_1m of this asset
	*/
	@Override
	public double getChg_pct_1m() {
		return _asset.getChg_pct_1m();
	}

	/**
	* Sets the chg_pct_1m of this asset.
	*
	* @param chg_pct_1m the chg_pct_1m of this asset
	*/
	@Override
	public void setChg_pct_1m(double chg_pct_1m) {
		_asset.setChg_pct_1m(chg_pct_1m);
	}

	/**
	* Returns the chg_pct_3m of this asset.
	*
	* @return the chg_pct_3m of this asset
	*/
	@Override
	public double getChg_pct_3m() {
		return _asset.getChg_pct_3m();
	}

	/**
	* Sets the chg_pct_3m of this asset.
	*
	* @param chg_pct_3m the chg_pct_3m of this asset
	*/
	@Override
	public void setChg_pct_3m(double chg_pct_3m) {
		_asset.setChg_pct_3m(chg_pct_3m);
	}

	/**
	* Returns the chg_pct_6m of this asset.
	*
	* @return the chg_pct_6m of this asset
	*/
	@Override
	public double getChg_pct_6m() {
		return _asset.getChg_pct_6m();
	}

	/**
	* Sets the chg_pct_6m of this asset.
	*
	* @param chg_pct_6m the chg_pct_6m of this asset
	*/
	@Override
	public void setChg_pct_6m(double chg_pct_6m) {
		_asset.setChg_pct_6m(chg_pct_6m);
	}

	/**
	* Returns the chg_pct_ytd of this asset.
	*
	* @return the chg_pct_ytd of this asset
	*/
	@Override
	public double getChg_pct_ytd() {
		return _asset.getChg_pct_ytd();
	}

	/**
	* Sets the chg_pct_ytd of this asset.
	*
	* @param chg_pct_ytd the chg_pct_ytd of this asset
	*/
	@Override
	public void setChg_pct_ytd(double chg_pct_ytd) {
		_asset.setChg_pct_ytd(chg_pct_ytd);
	}

	/**
	* Returns the chg_pct_high_52week of this asset.
	*
	* @return the chg_pct_high_52week of this asset
	*/
	@Override
	public double getChg_pct_high_52week() {
		return _asset.getChg_pct_high_52week();
	}

	/**
	* Sets the chg_pct_high_52week of this asset.
	*
	* @param chg_pct_high_52week the chg_pct_high_52week of this asset
	*/
	@Override
	public void setChg_pct_high_52week(double chg_pct_high_52week) {
		_asset.setChg_pct_high_52week(chg_pct_high_52week);
	}

	/**
	* Returns the chg_pct_low_52week of this asset.
	*
	* @return the chg_pct_low_52week of this asset
	*/
	@Override
	public double getChg_pct_low_52week() {
		return _asset.getChg_pct_low_52week();
	}

	/**
	* Sets the chg_pct_low_52week of this asset.
	*
	* @param chg_pct_low_52week the chg_pct_low_52week of this asset
	*/
	@Override
	public void setChg_pct_low_52week(double chg_pct_low_52week) {
		_asset.setChg_pct_low_52week(chg_pct_low_52week);
	}

	/**
	* Returns the chg_pct_1yr of this asset.
	*
	* @return the chg_pct_1yr of this asset
	*/
	@Override
	public double getChg_pct_1yr() {
		return _asset.getChg_pct_1yr();
	}

	/**
	* Sets the chg_pct_1yr of this asset.
	*
	* @param chg_pct_1yr the chg_pct_1yr of this asset
	*/
	@Override
	public void setChg_pct_1yr(double chg_pct_1yr) {
		_asset.setChg_pct_1yr(chg_pct_1yr);
	}

	/**
	* Returns the chg_trr_5yr of this asset.
	*
	* @return the chg_trr_5yr of this asset
	*/
	@Override
	public double getChg_trr_5yr() {
		return _asset.getChg_trr_5yr();
	}

	/**
	* Sets the chg_trr_5yr of this asset.
	*
	* @param chg_trr_5yr the chg_trr_5yr of this asset
	*/
	@Override
	public void setChg_trr_5yr(double chg_trr_5yr) {
		_asset.setChg_trr_5yr(chg_trr_5yr);
	}

	/**
	* Returns the current_price of this asset.
	*
	* @return the current_price of this asset
	*/
	@Override
	public double getCurrent_price() {
		return _asset.getCurrent_price();
	}

	/**
	* Sets the current_price of this asset.
	*
	* @param current_price the current_price of this asset
	*/
	@Override
	public void setCurrent_price(double current_price) {
		_asset.setCurrent_price(current_price);
	}

	/**
	* Returns the last_price of this asset.
	*
	* @return the last_price of this asset
	*/
	@Override
	public double getLast_price() {
		return _asset.getLast_price();
	}

	/**
	* Sets the last_price of this asset.
	*
	* @param last_price the last_price of this asset
	*/
	@Override
	public void setLast_price(double last_price) {
		_asset.setLast_price(last_price);
	}

	/**
	* Returns the bid_price of this asset.
	*
	* @return the bid_price of this asset
	*/
	@Override
	public double getBid_price() {
		return _asset.getBid_price();
	}

	/**
	* Sets the bid_price of this asset.
	*
	* @param bid_price the bid_price of this asset
	*/
	@Override
	public void setBid_price(double bid_price) {
		_asset.setBid_price(bid_price);
	}

	/**
	* Returns the ask_price of this asset.
	*
	* @return the ask_price of this asset
	*/
	@Override
	public double getAsk_price() {
		return _asset.getAsk_price();
	}

	/**
	* Sets the ask_price of this asset.
	*
	* @param ask_price the ask_price of this asset
	*/
	@Override
	public void setAsk_price(double ask_price) {
		_asset.setAsk_price(ask_price);
	}

	/**
	* Returns the security_des of this asset.
	*
	* @return the security_des of this asset
	*/
	@Override
	public java.lang.String getSecurity_des() {
		return _asset.getSecurity_des();
	}

	/**
	* Sets the security_des of this asset.
	*
	* @param security_des the security_des of this asset
	*/
	@Override
	public void setSecurity_des(java.lang.String security_des) {
		_asset.setSecurity_des(security_des);
	}

	/**
	* Returns the parent_comp_name of this asset.
	*
	* @return the parent_comp_name of this asset
	*/
	@Override
	public java.lang.String getParent_comp_name() {
		return _asset.getParent_comp_name();
	}

	/**
	* Sets the parent_comp_name of this asset.
	*
	* @param parent_comp_name the parent_comp_name of this asset
	*/
	@Override
	public void setParent_comp_name(java.lang.String parent_comp_name) {
		_asset.setParent_comp_name(parent_comp_name);
	}

	/**
	* Returns the security_class of this asset.
	*
	* @return the security_class of this asset
	*/
	@Override
	public int getSecurity_class() {
		return _asset.getSecurity_class();
	}

	/**
	* Sets the security_class of this asset.
	*
	* @param security_class the security_class of this asset
	*/
	@Override
	public void setSecurity_class(int security_class) {
		_asset.setSecurity_class(security_class);
	}

	/**
	* Returns the volatility_30d of this asset.
	*
	* @return the volatility_30d of this asset
	*/
	@Override
	public double getVolatility_30d() {
		return _asset.getVolatility_30d();
	}

	/**
	* Sets the volatility_30d of this asset.
	*
	* @param volatility_30d the volatility_30d of this asset
	*/
	@Override
	public void setVolatility_30d(double volatility_30d) {
		_asset.setVolatility_30d(volatility_30d);
	}

	/**
	* Returns the volatility_90d of this asset.
	*
	* @return the volatility_90d of this asset
	*/
	@Override
	public double getVolatility_90d() {
		return _asset.getVolatility_90d();
	}

	/**
	* Sets the volatility_90d of this asset.
	*
	* @param volatility_90d the volatility_90d of this asset
	*/
	@Override
	public void setVolatility_90d(double volatility_90d) {
		_asset.setVolatility_90d(volatility_90d);
	}

	/**
	* Returns the volatility_180d of this asset.
	*
	* @return the volatility_180d of this asset
	*/
	@Override
	public double getVolatility_180d() {
		return _asset.getVolatility_180d();
	}

	/**
	* Sets the volatility_180d of this asset.
	*
	* @param volatility_180d the volatility_180d of this asset
	*/
	@Override
	public void setVolatility_180d(double volatility_180d) {
		_asset.setVolatility_180d(volatility_180d);
	}

	/**
	* Returns the volatility_360d of this asset.
	*
	* @return the volatility_360d of this asset
	*/
	@Override
	public double getVolatility_360d() {
		return _asset.getVolatility_360d();
	}

	/**
	* Sets the volatility_360d of this asset.
	*
	* @param volatility_360d the volatility_360d of this asset
	*/
	@Override
	public void setVolatility_360d(double volatility_360d) {
		_asset.setVolatility_360d(volatility_360d);
	}

	/**
	* Returns the currency of this asset.
	*
	* @return the currency of this asset
	*/
	@Override
	public java.lang.String getCurrency() {
		return _asset.getCurrency();
	}

	/**
	* Sets the currency of this asset.
	*
	* @param currency the currency of this asset
	*/
	@Override
	public void setCurrency(java.lang.String currency) {
		_asset.setCurrency(currency);
	}

	/**
	* Returns the country of this asset.
	*
	* @return the country of this asset
	*/
	@Override
	public long getCountry() {
		return _asset.getCountry();
	}

	/**
	* Sets the country of this asset.
	*
	* @param country the country of this asset
	*/
	@Override
	public void setCountry(long country) {
		_asset.setCountry(country);
	}

	/**
	* Returns the country_of_risk of this asset.
	*
	* @return the country_of_risk of this asset
	*/
	@Override
	public long getCountry_of_risk() {
		return _asset.getCountry_of_risk();
	}

	/**
	* Sets the country_of_risk of this asset.
	*
	* @param country_of_risk the country_of_risk of this asset
	*/
	@Override
	public void setCountry_of_risk(long country_of_risk) {
		_asset.setCountry_of_risk(country_of_risk);
	}

	/**
	* Returns the create date of this asset.
	*
	* @return the create date of this asset
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _asset.getCreateDate();
	}

	/**
	* Sets the create date of this asset.
	*
	* @param createDate the create date of this asset
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_asset.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this asset.
	*
	* @return the modified date of this asset
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _asset.getModifiedDate();
	}

	/**
	* Sets the modified date of this asset.
	*
	* @param modifiedDate the modified date of this asset
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_asset.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the company ID of this asset.
	*
	* @return the company ID of this asset
	*/
	@Override
	public long getCompanyId() {
		return _asset.getCompanyId();
	}

	/**
	* Sets the company ID of this asset.
	*
	* @param companyId the company ID of this asset
	*/
	@Override
	public void setCompanyId(long companyId) {
		_asset.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this asset.
	*
	* @return the user ID of this asset
	*/
	@Override
	public long getUserId() {
		return _asset.getUserId();
	}

	/**
	* Sets the user ID of this asset.
	*
	* @param userId the user ID of this asset
	*/
	@Override
	public void setUserId(long userId) {
		_asset.setUserId(userId);
	}

	/**
	* Returns the user uuid of this asset.
	*
	* @return the user uuid of this asset
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _asset.getUserUuid();
	}

	/**
	* Sets the user uuid of this asset.
	*
	* @param userUuid the user uuid of this asset
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_asset.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this asset.
	*
	* @return the user name of this asset
	*/
	@Override
	public java.lang.String getUserName() {
		return _asset.getUserName();
	}

	/**
	* Sets the user name of this asset.
	*
	* @param userName the user name of this asset
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_asset.setUserName(userName);
	}

	@Override
	public boolean isNew() {
		return _asset.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_asset.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _asset.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_asset.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _asset.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _asset.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_asset.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _asset.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_asset.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_asset.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_asset.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AssetWrapper((Asset)_asset.clone());
	}

	@Override
	public int compareTo(Asset asset) {
		return _asset.compareTo(asset);
	}

	@Override
	public int hashCode() {
		return _asset.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<Asset> toCacheModel() {
		return _asset.toCacheModel();
	}

	@Override
	public Asset toEscapedModel() {
		return new AssetWrapper(_asset.toEscapedModel());
	}

	@Override
	public Asset toUnescapedModel() {
		return new AssetWrapper(_asset.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _asset.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _asset.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_asset.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssetWrapper)) {
			return false;
		}

		AssetWrapper assetWrapper = (AssetWrapper)obj;

		if (Validator.equals(_asset, assetWrapper._asset)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Asset getWrappedAsset() {
		return _asset;
	}

	@Override
	public Asset getWrappedModel() {
		return _asset;
	}

	@Override
	public void resetOriginalValues() {
		_asset.resetOriginalValues();
	}

	private Asset _asset;
}