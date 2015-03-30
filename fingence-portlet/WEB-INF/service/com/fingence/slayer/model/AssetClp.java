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

import com.fingence.slayer.service.AssetLocalServiceUtil;
import com.fingence.slayer.service.ClpSerializer;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ahmed Hasan
 */
public class AssetClp extends BaseModelImpl<Asset> implements Asset {
	public AssetClp() {
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
	public long getPrimaryKey() {
		return _assetId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAssetId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _assetId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getAssetId() {
		return _assetId;
	}

	@Override
	public void setAssetId(long assetId) {
		_assetId = assetId;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setAssetId", long.class);

				method.invoke(_assetRemoteModel, assetId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSecurity_ticker() {
		return _security_ticker;
	}

	@Override
	public void setSecurity_ticker(String security_ticker) {
		_security_ticker = security_ticker;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setSecurity_ticker",
						String.class);

				method.invoke(_assetRemoteModel, security_ticker);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getId_cusip() {
		return _id_cusip;
	}

	@Override
	public void setId_cusip(String id_cusip) {
		_id_cusip = id_cusip;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setId_cusip", String.class);

				method.invoke(_assetRemoteModel, id_cusip);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getId_isin() {
		return _id_isin;
	}

	@Override
	public void setId_isin(String id_isin) {
		_id_isin = id_isin;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setId_isin", String.class);

				method.invoke(_assetRemoteModel, id_isin);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getId_bb_global() {
		return _id_bb_global;
	}

	@Override
	public void setId_bb_global(String id_bb_global) {
		_id_bb_global = id_bb_global;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setId_bb_global", String.class);

				method.invoke(_assetRemoteModel, id_bb_global);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getId_bb_sec_num_src() {
		return _id_bb_sec_num_src;
	}

	@Override
	public void setId_bb_sec_num_src(long id_bb_sec_num_src) {
		_id_bb_sec_num_src = id_bb_sec_num_src;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setId_bb_sec_num_src",
						long.class);

				method.invoke(_assetRemoteModel, id_bb_sec_num_src);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_assetRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getChg_pct_mtd() {
		return _chg_pct_mtd;
	}

	@Override
	public void setChg_pct_mtd(double chg_pct_mtd) {
		_chg_pct_mtd = chg_pct_mtd;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setChg_pct_mtd", double.class);

				method.invoke(_assetRemoteModel, chg_pct_mtd);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getChg_pct_5d() {
		return _chg_pct_5d;
	}

	@Override
	public void setChg_pct_5d(double chg_pct_5d) {
		_chg_pct_5d = chg_pct_5d;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setChg_pct_5d", double.class);

				method.invoke(_assetRemoteModel, chg_pct_5d);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getChg_pct_1m() {
		return _chg_pct_1m;
	}

	@Override
	public void setChg_pct_1m(double chg_pct_1m) {
		_chg_pct_1m = chg_pct_1m;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setChg_pct_1m", double.class);

				method.invoke(_assetRemoteModel, chg_pct_1m);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getChg_pct_3m() {
		return _chg_pct_3m;
	}

	@Override
	public void setChg_pct_3m(double chg_pct_3m) {
		_chg_pct_3m = chg_pct_3m;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setChg_pct_3m", double.class);

				method.invoke(_assetRemoteModel, chg_pct_3m);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getChg_pct_6m() {
		return _chg_pct_6m;
	}

	@Override
	public void setChg_pct_6m(double chg_pct_6m) {
		_chg_pct_6m = chg_pct_6m;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setChg_pct_6m", double.class);

				method.invoke(_assetRemoteModel, chg_pct_6m);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getChg_pct_ytd() {
		return _chg_pct_ytd;
	}

	@Override
	public void setChg_pct_ytd(double chg_pct_ytd) {
		_chg_pct_ytd = chg_pct_ytd;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setChg_pct_ytd", double.class);

				method.invoke(_assetRemoteModel, chg_pct_ytd);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getChg_pct_high_52week() {
		return _chg_pct_high_52week;
	}

	@Override
	public void setChg_pct_high_52week(double chg_pct_high_52week) {
		_chg_pct_high_52week = chg_pct_high_52week;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setChg_pct_high_52week",
						double.class);

				method.invoke(_assetRemoteModel, chg_pct_high_52week);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getChg_pct_low_52week() {
		return _chg_pct_low_52week;
	}

	@Override
	public void setChg_pct_low_52week(double chg_pct_low_52week) {
		_chg_pct_low_52week = chg_pct_low_52week;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setChg_pct_low_52week",
						double.class);

				method.invoke(_assetRemoteModel, chg_pct_low_52week);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getChg_pct_1yr() {
		return _chg_pct_1yr;
	}

	@Override
	public void setChg_pct_1yr(double chg_pct_1yr) {
		_chg_pct_1yr = chg_pct_1yr;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setChg_pct_1yr", double.class);

				method.invoke(_assetRemoteModel, chg_pct_1yr);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getChg_trr_5yr() {
		return _chg_trr_5yr;
	}

	@Override
	public void setChg_trr_5yr(double chg_trr_5yr) {
		_chg_trr_5yr = chg_trr_5yr;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setChg_trr_5yr", double.class);

				method.invoke(_assetRemoteModel, chg_trr_5yr);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getCurrent_price() {
		return _current_price;
	}

	@Override
	public void setCurrent_price(double current_price) {
		_current_price = current_price;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrent_price", double.class);

				method.invoke(_assetRemoteModel, current_price);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getLast_price() {
		return _last_price;
	}

	@Override
	public void setLast_price(double last_price) {
		_last_price = last_price;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setLast_price", double.class);

				method.invoke(_assetRemoteModel, last_price);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getBid_price() {
		return _bid_price;
	}

	@Override
	public void setBid_price(double bid_price) {
		_bid_price = bid_price;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setBid_price", double.class);

				method.invoke(_assetRemoteModel, bid_price);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getAsk_price() {
		return _ask_price;
	}

	@Override
	public void setAsk_price(double ask_price) {
		_ask_price = ask_price;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setAsk_price", double.class);

				method.invoke(_assetRemoteModel, ask_price);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSecurity_des() {
		return _security_des;
	}

	@Override
	public void setSecurity_des(String security_des) {
		_security_des = security_des;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setSecurity_des", String.class);

				method.invoke(_assetRemoteModel, security_des);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getParent_comp_name() {
		return _parent_comp_name;
	}

	@Override
	public void setParent_comp_name(String parent_comp_name) {
		_parent_comp_name = parent_comp_name;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setParent_comp_name",
						String.class);

				method.invoke(_assetRemoteModel, parent_comp_name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSecurity_class() {
		return _security_class;
	}

	@Override
	public void setSecurity_class(int security_class) {
		_security_class = security_class;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setSecurity_class", int.class);

				method.invoke(_assetRemoteModel, security_class);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getVolatility_30d() {
		return _volatility_30d;
	}

	@Override
	public void setVolatility_30d(double volatility_30d) {
		_volatility_30d = volatility_30d;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setVolatility_30d",
						double.class);

				method.invoke(_assetRemoteModel, volatility_30d);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getVolatility_90d() {
		return _volatility_90d;
	}

	@Override
	public void setVolatility_90d(double volatility_90d) {
		_volatility_90d = volatility_90d;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setVolatility_90d",
						double.class);

				method.invoke(_assetRemoteModel, volatility_90d);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getVolatility_180d() {
		return _volatility_180d;
	}

	@Override
	public void setVolatility_180d(double volatility_180d) {
		_volatility_180d = volatility_180d;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setVolatility_180d",
						double.class);

				method.invoke(_assetRemoteModel, volatility_180d);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getVolatility_360d() {
		return _volatility_360d;
	}

	@Override
	public void setVolatility_360d(double volatility_360d) {
		_volatility_360d = volatility_360d;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setVolatility_360d",
						double.class);

				method.invoke(_assetRemoteModel, volatility_360d);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCurrency() {
		return _currency;
	}

	@Override
	public void setCurrency(String currency) {
		_currency = currency;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrency", String.class);

				method.invoke(_assetRemoteModel, currency);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCountry() {
		return _country;
	}

	@Override
	public void setCountry(long country) {
		_country = country;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setCountry", long.class);

				method.invoke(_assetRemoteModel, country);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCountry_of_risk() {
		return _country_of_risk;
	}

	@Override
	public void setCountry_of_risk(long country_of_risk) {
		_country_of_risk = country_of_risk;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setCountry_of_risk", long.class);

				method.invoke(_assetRemoteModel, country_of_risk);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_assetRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_assetRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_assetRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_assetRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_assetRemoteModel != null) {
			try {
				Class<?> clazz = _assetRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_assetRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getAssetRemoteModel() {
		return _assetRemoteModel;
	}

	public void setAssetRemoteModel(BaseModel<?> assetRemoteModel) {
		_assetRemoteModel = assetRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _assetRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_assetRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AssetLocalServiceUtil.addAsset(this);
		}
		else {
			AssetLocalServiceUtil.updateAsset(this);
		}
	}

	@Override
	public Asset toEscapedModel() {
		return (Asset)ProxyUtil.newProxyInstance(Asset.class.getClassLoader(),
			new Class[] { Asset.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AssetClp clone = new AssetClp();

		clone.setAssetId(getAssetId());
		clone.setSecurity_ticker(getSecurity_ticker());
		clone.setId_cusip(getId_cusip());
		clone.setId_isin(getId_isin());
		clone.setId_bb_global(getId_bb_global());
		clone.setId_bb_sec_num_src(getId_bb_sec_num_src());
		clone.setName(getName());
		clone.setChg_pct_mtd(getChg_pct_mtd());
		clone.setChg_pct_5d(getChg_pct_5d());
		clone.setChg_pct_1m(getChg_pct_1m());
		clone.setChg_pct_3m(getChg_pct_3m());
		clone.setChg_pct_6m(getChg_pct_6m());
		clone.setChg_pct_ytd(getChg_pct_ytd());
		clone.setChg_pct_high_52week(getChg_pct_high_52week());
		clone.setChg_pct_low_52week(getChg_pct_low_52week());
		clone.setChg_pct_1yr(getChg_pct_1yr());
		clone.setChg_trr_5yr(getChg_trr_5yr());
		clone.setCurrent_price(getCurrent_price());
		clone.setLast_price(getLast_price());
		clone.setBid_price(getBid_price());
		clone.setAsk_price(getAsk_price());
		clone.setSecurity_des(getSecurity_des());
		clone.setParent_comp_name(getParent_comp_name());
		clone.setSecurity_class(getSecurity_class());
		clone.setVolatility_30d(getVolatility_30d());
		clone.setVolatility_90d(getVolatility_90d());
		clone.setVolatility_180d(getVolatility_180d());
		clone.setVolatility_360d(getVolatility_360d());
		clone.setCurrency(getCurrency());
		clone.setCountry(getCountry());
		clone.setCountry_of_risk(getCountry_of_risk());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());

		return clone;
	}

	@Override
	public int compareTo(Asset asset) {
		long primaryKey = asset.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AssetClp)) {
			return false;
		}

		AssetClp asset = (AssetClp)obj;

		long primaryKey = asset.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(73);

		sb.append("{assetId=");
		sb.append(getAssetId());
		sb.append(", security_ticker=");
		sb.append(getSecurity_ticker());
		sb.append(", id_cusip=");
		sb.append(getId_cusip());
		sb.append(", id_isin=");
		sb.append(getId_isin());
		sb.append(", id_bb_global=");
		sb.append(getId_bb_global());
		sb.append(", id_bb_sec_num_src=");
		sb.append(getId_bb_sec_num_src());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", chg_pct_mtd=");
		sb.append(getChg_pct_mtd());
		sb.append(", chg_pct_5d=");
		sb.append(getChg_pct_5d());
		sb.append(", chg_pct_1m=");
		sb.append(getChg_pct_1m());
		sb.append(", chg_pct_3m=");
		sb.append(getChg_pct_3m());
		sb.append(", chg_pct_6m=");
		sb.append(getChg_pct_6m());
		sb.append(", chg_pct_ytd=");
		sb.append(getChg_pct_ytd());
		sb.append(", chg_pct_high_52week=");
		sb.append(getChg_pct_high_52week());
		sb.append(", chg_pct_low_52week=");
		sb.append(getChg_pct_low_52week());
		sb.append(", chg_pct_1yr=");
		sb.append(getChg_pct_1yr());
		sb.append(", chg_trr_5yr=");
		sb.append(getChg_trr_5yr());
		sb.append(", current_price=");
		sb.append(getCurrent_price());
		sb.append(", last_price=");
		sb.append(getLast_price());
		sb.append(", bid_price=");
		sb.append(getBid_price());
		sb.append(", ask_price=");
		sb.append(getAsk_price());
		sb.append(", security_des=");
		sb.append(getSecurity_des());
		sb.append(", parent_comp_name=");
		sb.append(getParent_comp_name());
		sb.append(", security_class=");
		sb.append(getSecurity_class());
		sb.append(", volatility_30d=");
		sb.append(getVolatility_30d());
		sb.append(", volatility_90d=");
		sb.append(getVolatility_90d());
		sb.append(", volatility_180d=");
		sb.append(getVolatility_180d());
		sb.append(", volatility_360d=");
		sb.append(getVolatility_360d());
		sb.append(", currency=");
		sb.append(getCurrency());
		sb.append(", country=");
		sb.append(getCountry());
		sb.append(", country_of_risk=");
		sb.append(getCountry_of_risk());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(112);

		sb.append("<model><model-name>");
		sb.append("com.fingence.slayer.model.Asset");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>assetId</column-name><column-value><![CDATA[");
		sb.append(getAssetId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>security_ticker</column-name><column-value><![CDATA[");
		sb.append(getSecurity_ticker());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>id_cusip</column-name><column-value><![CDATA[");
		sb.append(getId_cusip());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>id_isin</column-name><column-value><![CDATA[");
		sb.append(getId_isin());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>id_bb_global</column-name><column-value><![CDATA[");
		sb.append(getId_bb_global());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>id_bb_sec_num_src</column-name><column-value><![CDATA[");
		sb.append(getId_bb_sec_num_src());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chg_pct_mtd</column-name><column-value><![CDATA[");
		sb.append(getChg_pct_mtd());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chg_pct_5d</column-name><column-value><![CDATA[");
		sb.append(getChg_pct_5d());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chg_pct_1m</column-name><column-value><![CDATA[");
		sb.append(getChg_pct_1m());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chg_pct_3m</column-name><column-value><![CDATA[");
		sb.append(getChg_pct_3m());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chg_pct_6m</column-name><column-value><![CDATA[");
		sb.append(getChg_pct_6m());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chg_pct_ytd</column-name><column-value><![CDATA[");
		sb.append(getChg_pct_ytd());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chg_pct_high_52week</column-name><column-value><![CDATA[");
		sb.append(getChg_pct_high_52week());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chg_pct_low_52week</column-name><column-value><![CDATA[");
		sb.append(getChg_pct_low_52week());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chg_pct_1yr</column-name><column-value><![CDATA[");
		sb.append(getChg_pct_1yr());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chg_trr_5yr</column-name><column-value><![CDATA[");
		sb.append(getChg_trr_5yr());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>current_price</column-name><column-value><![CDATA[");
		sb.append(getCurrent_price());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>last_price</column-name><column-value><![CDATA[");
		sb.append(getLast_price());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bid_price</column-name><column-value><![CDATA[");
		sb.append(getBid_price());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ask_price</column-name><column-value><![CDATA[");
		sb.append(getAsk_price());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>security_des</column-name><column-value><![CDATA[");
		sb.append(getSecurity_des());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parent_comp_name</column-name><column-value><![CDATA[");
		sb.append(getParent_comp_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>security_class</column-name><column-value><![CDATA[");
		sb.append(getSecurity_class());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>volatility_30d</column-name><column-value><![CDATA[");
		sb.append(getVolatility_30d());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>volatility_90d</column-name><column-value><![CDATA[");
		sb.append(getVolatility_90d());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>volatility_180d</column-name><column-value><![CDATA[");
		sb.append(getVolatility_180d());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>volatility_360d</column-name><column-value><![CDATA[");
		sb.append(getVolatility_360d());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currency</column-name><column-value><![CDATA[");
		sb.append(getCurrency());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>country</column-name><column-value><![CDATA[");
		sb.append(getCountry());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>country_of_risk</column-name><column-value><![CDATA[");
		sb.append(getCountry_of_risk());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private String _userUuid;
	private String _userName;
	private BaseModel<?> _assetRemoteModel;
}