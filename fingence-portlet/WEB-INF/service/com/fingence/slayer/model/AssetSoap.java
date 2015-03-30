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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.fingence.slayer.service.http.AssetServiceSoap}.
 *
 * @author Ahmed Hasan
 * @see com.fingence.slayer.service.http.AssetServiceSoap
 * @generated
 */
public class AssetSoap implements Serializable {
	public static AssetSoap toSoapModel(Asset model) {
		AssetSoap soapModel = new AssetSoap();

		soapModel.setAssetId(model.getAssetId());
		soapModel.setSecurity_ticker(model.getSecurity_ticker());
		soapModel.setId_cusip(model.getId_cusip());
		soapModel.setId_isin(model.getId_isin());
		soapModel.setId_bb_global(model.getId_bb_global());
		soapModel.setId_bb_sec_num_src(model.getId_bb_sec_num_src());
		soapModel.setName(model.getName());
		soapModel.setChg_pct_mtd(model.getChg_pct_mtd());
		soapModel.setChg_pct_5d(model.getChg_pct_5d());
		soapModel.setChg_pct_1m(model.getChg_pct_1m());
		soapModel.setChg_pct_3m(model.getChg_pct_3m());
		soapModel.setChg_pct_6m(model.getChg_pct_6m());
		soapModel.setChg_pct_ytd(model.getChg_pct_ytd());
		soapModel.setChg_pct_high_52week(model.getChg_pct_high_52week());
		soapModel.setChg_pct_low_52week(model.getChg_pct_low_52week());
		soapModel.setChg_pct_1yr(model.getChg_pct_1yr());
		soapModel.setChg_trr_5yr(model.getChg_trr_5yr());
		soapModel.setCurrent_price(model.getCurrent_price());
		soapModel.setLast_price(model.getLast_price());
		soapModel.setBid_price(model.getBid_price());
		soapModel.setAsk_price(model.getAsk_price());
		soapModel.setSecurity_des(model.getSecurity_des());
		soapModel.setParent_comp_name(model.getParent_comp_name());
		soapModel.setSecurity_class(model.getSecurity_class());
		soapModel.setVolatility_30d(model.getVolatility_30d());
		soapModel.setVolatility_90d(model.getVolatility_90d());
		soapModel.setVolatility_180d(model.getVolatility_180d());
		soapModel.setVolatility_360d(model.getVolatility_360d());
		soapModel.setCurrency(model.getCurrency());
		soapModel.setCountry(model.getCountry());
		soapModel.setCountry_of_risk(model.getCountry_of_risk());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());

		return soapModel;
	}

	public static AssetSoap[] toSoapModels(Asset[] models) {
		AssetSoap[] soapModels = new AssetSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AssetSoap[][] toSoapModels(Asset[][] models) {
		AssetSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AssetSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AssetSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AssetSoap[] toSoapModels(List<Asset> models) {
		List<AssetSoap> soapModels = new ArrayList<AssetSoap>(models.size());

		for (Asset model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AssetSoap[soapModels.size()]);
	}

	public AssetSoap() {
	}

	public long getPrimaryKey() {
		return _assetId;
	}

	public void setPrimaryKey(long pk) {
		setAssetId(pk);
	}

	public long getAssetId() {
		return _assetId;
	}

	public void setAssetId(long assetId) {
		_assetId = assetId;
	}

	public String getSecurity_ticker() {
		return _security_ticker;
	}

	public void setSecurity_ticker(String security_ticker) {
		_security_ticker = security_ticker;
	}

	public String getId_cusip() {
		return _id_cusip;
	}

	public void setId_cusip(String id_cusip) {
		_id_cusip = id_cusip;
	}

	public String getId_isin() {
		return _id_isin;
	}

	public void setId_isin(String id_isin) {
		_id_isin = id_isin;
	}

	public String getId_bb_global() {
		return _id_bb_global;
	}

	public void setId_bb_global(String id_bb_global) {
		_id_bb_global = id_bb_global;
	}

	public long getId_bb_sec_num_src() {
		return _id_bb_sec_num_src;
	}

	public void setId_bb_sec_num_src(long id_bb_sec_num_src) {
		_id_bb_sec_num_src = id_bb_sec_num_src;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public double getChg_pct_mtd() {
		return _chg_pct_mtd;
	}

	public void setChg_pct_mtd(double chg_pct_mtd) {
		_chg_pct_mtd = chg_pct_mtd;
	}

	public double getChg_pct_5d() {
		return _chg_pct_5d;
	}

	public void setChg_pct_5d(double chg_pct_5d) {
		_chg_pct_5d = chg_pct_5d;
	}

	public double getChg_pct_1m() {
		return _chg_pct_1m;
	}

	public void setChg_pct_1m(double chg_pct_1m) {
		_chg_pct_1m = chg_pct_1m;
	}

	public double getChg_pct_3m() {
		return _chg_pct_3m;
	}

	public void setChg_pct_3m(double chg_pct_3m) {
		_chg_pct_3m = chg_pct_3m;
	}

	public double getChg_pct_6m() {
		return _chg_pct_6m;
	}

	public void setChg_pct_6m(double chg_pct_6m) {
		_chg_pct_6m = chg_pct_6m;
	}

	public double getChg_pct_ytd() {
		return _chg_pct_ytd;
	}

	public void setChg_pct_ytd(double chg_pct_ytd) {
		_chg_pct_ytd = chg_pct_ytd;
	}

	public double getChg_pct_high_52week() {
		return _chg_pct_high_52week;
	}

	public void setChg_pct_high_52week(double chg_pct_high_52week) {
		_chg_pct_high_52week = chg_pct_high_52week;
	}

	public double getChg_pct_low_52week() {
		return _chg_pct_low_52week;
	}

	public void setChg_pct_low_52week(double chg_pct_low_52week) {
		_chg_pct_low_52week = chg_pct_low_52week;
	}

	public double getChg_pct_1yr() {
		return _chg_pct_1yr;
	}

	public void setChg_pct_1yr(double chg_pct_1yr) {
		_chg_pct_1yr = chg_pct_1yr;
	}

	public double getChg_trr_5yr() {
		return _chg_trr_5yr;
	}

	public void setChg_trr_5yr(double chg_trr_5yr) {
		_chg_trr_5yr = chg_trr_5yr;
	}

	public double getCurrent_price() {
		return _current_price;
	}

	public void setCurrent_price(double current_price) {
		_current_price = current_price;
	}

	public double getLast_price() {
		return _last_price;
	}

	public void setLast_price(double last_price) {
		_last_price = last_price;
	}

	public double getBid_price() {
		return _bid_price;
	}

	public void setBid_price(double bid_price) {
		_bid_price = bid_price;
	}

	public double getAsk_price() {
		return _ask_price;
	}

	public void setAsk_price(double ask_price) {
		_ask_price = ask_price;
	}

	public String getSecurity_des() {
		return _security_des;
	}

	public void setSecurity_des(String security_des) {
		_security_des = security_des;
	}

	public String getParent_comp_name() {
		return _parent_comp_name;
	}

	public void setParent_comp_name(String parent_comp_name) {
		_parent_comp_name = parent_comp_name;
	}

	public int getSecurity_class() {
		return _security_class;
	}

	public void setSecurity_class(int security_class) {
		_security_class = security_class;
	}

	public double getVolatility_30d() {
		return _volatility_30d;
	}

	public void setVolatility_30d(double volatility_30d) {
		_volatility_30d = volatility_30d;
	}

	public double getVolatility_90d() {
		return _volatility_90d;
	}

	public void setVolatility_90d(double volatility_90d) {
		_volatility_90d = volatility_90d;
	}

	public double getVolatility_180d() {
		return _volatility_180d;
	}

	public void setVolatility_180d(double volatility_180d) {
		_volatility_180d = volatility_180d;
	}

	public double getVolatility_360d() {
		return _volatility_360d;
	}

	public void setVolatility_360d(double volatility_360d) {
		_volatility_360d = volatility_360d;
	}

	public String getCurrency() {
		return _currency;
	}

	public void setCurrency(String currency) {
		_currency = currency;
	}

	public long getCountry() {
		return _country;
	}

	public void setCountry(long country) {
		_country = country;
	}

	public long getCountry_of_risk() {
		return _country_of_risk;
	}

	public void setCountry_of_risk(long country_of_risk) {
		_country_of_risk = country_of_risk;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	private long _assetId;
	private String _security_ticker;
	private String _id_cusip;
	private String _id_isin;
	private String _id_bb_global;
	private long _id_bb_sec_num_src;
	private String _name;
	private double _chg_pct_mtd;
	private double _chg_pct_5d;
	private double _chg_pct_1m;
	private double _chg_pct_3m;
	private double _chg_pct_6m;
	private double _chg_pct_ytd;
	private double _chg_pct_high_52week;
	private double _chg_pct_low_52week;
	private double _chg_pct_1yr;
	private double _chg_trr_5yr;
	private double _current_price;
	private double _last_price;
	private double _bid_price;
	private double _ask_price;
	private String _security_des;
	private String _parent_comp_name;
	private int _security_class;
	private double _volatility_30d;
	private double _volatility_90d;
	private double _volatility_180d;
	private double _volatility_360d;
	private String _currency;
	private long _country;
	private long _country_of_risk;
	private Date _createDate;
	private Date _modifiedDate;
	private long _companyId;
	private long _userId;
	private String _userName;
}