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

import com.fingence.slayer.service.ClpSerializer;
import com.fingence.slayer.service.MyResultLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ahmed Hasan
 */
public class MyResultClp extends BaseModelImpl<MyResult> implements MyResult {
	public MyResultClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return MyResult.class;
	}

	@Override
	public String getModelClassName() {
		return MyResult.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _itemId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setItemId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _itemId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("itemId", getItemId());
		attributes.put("portfolioId", getPortfolioId());
		attributes.put("institution", getInstitution());
		attributes.put("assetId", getAssetId());
		attributes.put("security_ticker", getSecurity_ticker());
		attributes.put("id_isin", getId_isin());
		attributes.put("name", getName());
		attributes.put("industry_sector", getIndustry_sector());
		attributes.put("purchaseQty", getPurchaseQty());
		attributes.put("purchaseDate", getPurchaseDate());
		attributes.put("current_price", getCurrent_price());
		attributes.put("purchasedFx", getPurchasedFx());
		attributes.put("current_fx", getCurrent_fx());
		attributes.put("baseCurrency", getBaseCurrency());
		attributes.put("security_des", getSecurity_des());
		attributes.put("security_class_int", getSecurity_class_int());
		attributes.put("security_class", getSecurity_class());
		attributes.put("security_typ", getSecurity_typ());
		attributes.put("security_typ2", getSecurity_typ2());
		attributes.put("asset_class", getAsset_class());
		attributes.put("asset_sub_class", getAsset_sub_class());
		attributes.put("parent_comp_name", getParent_comp_name());
		attributes.put("countryId", getCountryId());
		attributes.put("countryName", getCountryName());
		attributes.put("countryOfRisk", getCountryOfRisk());
		attributes.put("countryOfRiskName", getCountryOfRiskName());
		attributes.put("currency_", getCurrency_());
		attributes.put("currencyDesc", getCurrencyDesc());
		attributes.put("purchasedMarketValue", getPurchasedMarketValue());
		attributes.put("currentMarketValue", getCurrentMarketValue());
		attributes.put("gain_loss", getGain_loss());
		attributes.put("gain_loss_percent", getGain_loss_percent());
		attributes.put("fx_gain_loss", getFx_gain_loss());
		attributes.put("income", getIncome());
		attributes.put("currencySymbol", getCurrencySymbol());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long itemId = (Long)attributes.get("itemId");

		if (itemId != null) {
			setItemId(itemId);
		}

		Long portfolioId = (Long)attributes.get("portfolioId");

		if (portfolioId != null) {
			setPortfolioId(portfolioId);
		}

		String institution = (String)attributes.get("institution");

		if (institution != null) {
			setInstitution(institution);
		}

		Long assetId = (Long)attributes.get("assetId");

		if (assetId != null) {
			setAssetId(assetId);
		}

		String security_ticker = (String)attributes.get("security_ticker");

		if (security_ticker != null) {
			setSecurity_ticker(security_ticker);
		}

		String id_isin = (String)attributes.get("id_isin");

		if (id_isin != null) {
			setId_isin(id_isin);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String industry_sector = (String)attributes.get("industry_sector");

		if (industry_sector != null) {
			setIndustry_sector(industry_sector);
		}

		Double purchaseQty = (Double)attributes.get("purchaseQty");

		if (purchaseQty != null) {
			setPurchaseQty(purchaseQty);
		}

		Date purchaseDate = (Date)attributes.get("purchaseDate");

		if (purchaseDate != null) {
			setPurchaseDate(purchaseDate);
		}

		Double current_price = (Double)attributes.get("current_price");

		if (current_price != null) {
			setCurrent_price(current_price);
		}

		Double purchasedFx = (Double)attributes.get("purchasedFx");

		if (purchasedFx != null) {
			setPurchasedFx(purchasedFx);
		}

		Double current_fx = (Double)attributes.get("current_fx");

		if (current_fx != null) {
			setCurrent_fx(current_fx);
		}

		String baseCurrency = (String)attributes.get("baseCurrency");

		if (baseCurrency != null) {
			setBaseCurrency(baseCurrency);
		}

		String security_des = (String)attributes.get("security_des");

		if (security_des != null) {
			setSecurity_des(security_des);
		}

		Integer security_class_int = (Integer)attributes.get(
				"security_class_int");

		if (security_class_int != null) {
			setSecurity_class_int(security_class_int);
		}

		String security_class = (String)attributes.get("security_class");

		if (security_class != null) {
			setSecurity_class(security_class);
		}

		String security_typ = (String)attributes.get("security_typ");

		if (security_typ != null) {
			setSecurity_typ(security_typ);
		}

		String security_typ2 = (String)attributes.get("security_typ2");

		if (security_typ2 != null) {
			setSecurity_typ2(security_typ2);
		}

		String asset_class = (String)attributes.get("asset_class");

		if (asset_class != null) {
			setAsset_class(asset_class);
		}

		String asset_sub_class = (String)attributes.get("asset_sub_class");

		if (asset_sub_class != null) {
			setAsset_sub_class(asset_sub_class);
		}

		String parent_comp_name = (String)attributes.get("parent_comp_name");

		if (parent_comp_name != null) {
			setParent_comp_name(parent_comp_name);
		}

		Long countryId = (Long)attributes.get("countryId");

		if (countryId != null) {
			setCountryId(countryId);
		}

		String countryName = (String)attributes.get("countryName");

		if (countryName != null) {
			setCountryName(countryName);
		}

		Long countryOfRisk = (Long)attributes.get("countryOfRisk");

		if (countryOfRisk != null) {
			setCountryOfRisk(countryOfRisk);
		}

		String countryOfRiskName = (String)attributes.get("countryOfRiskName");

		if (countryOfRiskName != null) {
			setCountryOfRiskName(countryOfRiskName);
		}

		String currency_ = (String)attributes.get("currency_");

		if (currency_ != null) {
			setCurrency_(currency_);
		}

		String currencyDesc = (String)attributes.get("currencyDesc");

		if (currencyDesc != null) {
			setCurrencyDesc(currencyDesc);
		}

		Double purchasedMarketValue = (Double)attributes.get(
				"purchasedMarketValue");

		if (purchasedMarketValue != null) {
			setPurchasedMarketValue(purchasedMarketValue);
		}

		Double currentMarketValue = (Double)attributes.get("currentMarketValue");

		if (currentMarketValue != null) {
			setCurrentMarketValue(currentMarketValue);
		}

		Double gain_loss = (Double)attributes.get("gain_loss");

		if (gain_loss != null) {
			setGain_loss(gain_loss);
		}

		Double gain_loss_percent = (Double)attributes.get("gain_loss_percent");

		if (gain_loss_percent != null) {
			setGain_loss_percent(gain_loss_percent);
		}

		Double fx_gain_loss = (Double)attributes.get("fx_gain_loss");

		if (fx_gain_loss != null) {
			setFx_gain_loss(fx_gain_loss);
		}

		Double income = (Double)attributes.get("income");

		if (income != null) {
			setIncome(income);
		}

		String currencySymbol = (String)attributes.get("currencySymbol");

		if (currencySymbol != null) {
			setCurrencySymbol(currencySymbol);
		}
	}

	@Override
	public long getItemId() {
		return _itemId;
	}

	@Override
	public void setItemId(long itemId) {
		_itemId = itemId;

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setItemId", long.class);

				method.invoke(_myResultRemoteModel, itemId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPortfolioId() {
		return _portfolioId;
	}

	@Override
	public void setPortfolioId(long portfolioId) {
		_portfolioId = portfolioId;

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setPortfolioId", long.class);

				method.invoke(_myResultRemoteModel, portfolioId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getInstitution() {
		return _institution;
	}

	@Override
	public void setInstitution(String institution) {
		_institution = institution;

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setInstitution", String.class);

				method.invoke(_myResultRemoteModel, institution);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAssetId() {
		return _assetId;
	}

	@Override
	public void setAssetId(long assetId) {
		_assetId = assetId;

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setAssetId", long.class);

				method.invoke(_myResultRemoteModel, assetId);
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

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setSecurity_ticker",
						String.class);

				method.invoke(_myResultRemoteModel, security_ticker);
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

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setId_isin", String.class);

				method.invoke(_myResultRemoteModel, id_isin);
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

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_myResultRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIndustry_sector() {
		return _industry_sector;
	}

	@Override
	public void setIndustry_sector(String industry_sector) {
		_industry_sector = industry_sector;

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setIndustry_sector",
						String.class);

				method.invoke(_myResultRemoteModel, industry_sector);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getPurchaseQty() {
		return _purchaseQty;
	}

	@Override
	public void setPurchaseQty(double purchaseQty) {
		_purchaseQty = purchaseQty;

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setPurchaseQty", double.class);

				method.invoke(_myResultRemoteModel, purchaseQty);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getPurchaseDate() {
		return _purchaseDate;
	}

	@Override
	public void setPurchaseDate(Date purchaseDate) {
		_purchaseDate = purchaseDate;

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setPurchaseDate", Date.class);

				method.invoke(_myResultRemoteModel, purchaseDate);
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

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrent_price", double.class);

				method.invoke(_myResultRemoteModel, current_price);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getPurchasedFx() {
		return _purchasedFx;
	}

	@Override
	public void setPurchasedFx(double purchasedFx) {
		_purchasedFx = purchasedFx;

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setPurchasedFx", double.class);

				method.invoke(_myResultRemoteModel, purchasedFx);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getCurrent_fx() {
		return _current_fx;
	}

	@Override
	public void setCurrent_fx(double current_fx) {
		_current_fx = current_fx;

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrent_fx", double.class);

				method.invoke(_myResultRemoteModel, current_fx);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBaseCurrency() {
		return _baseCurrency;
	}

	@Override
	public void setBaseCurrency(String baseCurrency) {
		_baseCurrency = baseCurrency;

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setBaseCurrency", String.class);

				method.invoke(_myResultRemoteModel, baseCurrency);
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

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setSecurity_des", String.class);

				method.invoke(_myResultRemoteModel, security_des);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSecurity_class_int() {
		return _security_class_int;
	}

	@Override
	public void setSecurity_class_int(int security_class_int) {
		_security_class_int = security_class_int;

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setSecurity_class_int",
						int.class);

				method.invoke(_myResultRemoteModel, security_class_int);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSecurity_class() {
		return _security_class;
	}

	@Override
	public void setSecurity_class(String security_class) {
		_security_class = security_class;

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setSecurity_class",
						String.class);

				method.invoke(_myResultRemoteModel, security_class);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSecurity_typ() {
		return _security_typ;
	}

	@Override
	public void setSecurity_typ(String security_typ) {
		_security_typ = security_typ;

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setSecurity_typ", String.class);

				method.invoke(_myResultRemoteModel, security_typ);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSecurity_typ2() {
		return _security_typ2;
	}

	@Override
	public void setSecurity_typ2(String security_typ2) {
		_security_typ2 = security_typ2;

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setSecurity_typ2", String.class);

				method.invoke(_myResultRemoteModel, security_typ2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAsset_class() {
		return _asset_class;
	}

	@Override
	public void setAsset_class(String asset_class) {
		_asset_class = asset_class;

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setAsset_class", String.class);

				method.invoke(_myResultRemoteModel, asset_class);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAsset_sub_class() {
		return _asset_sub_class;
	}

	@Override
	public void setAsset_sub_class(String asset_sub_class) {
		_asset_sub_class = asset_sub_class;

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setAsset_sub_class",
						String.class);

				method.invoke(_myResultRemoteModel, asset_sub_class);
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

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setParent_comp_name",
						String.class);

				method.invoke(_myResultRemoteModel, parent_comp_name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCountryId() {
		return _countryId;
	}

	@Override
	public void setCountryId(long countryId) {
		_countryId = countryId;

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setCountryId", long.class);

				method.invoke(_myResultRemoteModel, countryId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCountryName() {
		return _countryName;
	}

	@Override
	public void setCountryName(String countryName) {
		_countryName = countryName;

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setCountryName", String.class);

				method.invoke(_myResultRemoteModel, countryName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCountryOfRisk() {
		return _countryOfRisk;
	}

	@Override
	public void setCountryOfRisk(long countryOfRisk) {
		_countryOfRisk = countryOfRisk;

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setCountryOfRisk", long.class);

				method.invoke(_myResultRemoteModel, countryOfRisk);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCountryOfRiskName() {
		return _countryOfRiskName;
	}

	@Override
	public void setCountryOfRiskName(String countryOfRiskName) {
		_countryOfRiskName = countryOfRiskName;

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setCountryOfRiskName",
						String.class);

				method.invoke(_myResultRemoteModel, countryOfRiskName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCurrency_() {
		return _currency_;
	}

	@Override
	public void setCurrency_(String currency_) {
		_currency_ = currency_;

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrency_", String.class);

				method.invoke(_myResultRemoteModel, currency_);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCurrencyDesc() {
		return _currencyDesc;
	}

	@Override
	public void setCurrencyDesc(String currencyDesc) {
		_currencyDesc = currencyDesc;

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrencyDesc", String.class);

				method.invoke(_myResultRemoteModel, currencyDesc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getPurchasedMarketValue() {
		return _purchasedMarketValue;
	}

	@Override
	public void setPurchasedMarketValue(double purchasedMarketValue) {
		_purchasedMarketValue = purchasedMarketValue;

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setPurchasedMarketValue",
						double.class);

				method.invoke(_myResultRemoteModel, purchasedMarketValue);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getCurrentMarketValue() {
		return _currentMarketValue;
	}

	@Override
	public void setCurrentMarketValue(double currentMarketValue) {
		_currentMarketValue = currentMarketValue;

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrentMarketValue",
						double.class);

				method.invoke(_myResultRemoteModel, currentMarketValue);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getGain_loss() {
		return _gain_loss;
	}

	@Override
	public void setGain_loss(double gain_loss) {
		_gain_loss = gain_loss;

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setGain_loss", double.class);

				method.invoke(_myResultRemoteModel, gain_loss);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getGain_loss_percent() {
		return _gain_loss_percent;
	}

	@Override
	public void setGain_loss_percent(double gain_loss_percent) {
		_gain_loss_percent = gain_loss_percent;

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setGain_loss_percent",
						double.class);

				method.invoke(_myResultRemoteModel, gain_loss_percent);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getFx_gain_loss() {
		return _fx_gain_loss;
	}

	@Override
	public void setFx_gain_loss(double fx_gain_loss) {
		_fx_gain_loss = fx_gain_loss;

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setFx_gain_loss", double.class);

				method.invoke(_myResultRemoteModel, fx_gain_loss);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getIncome() {
		return _income;
	}

	@Override
	public void setIncome(double income) {
		_income = income;

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setIncome", double.class);

				method.invoke(_myResultRemoteModel, income);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCurrencySymbol() {
		return _currencySymbol;
	}

	@Override
	public void setCurrencySymbol(String currencySymbol) {
		_currencySymbol = currencySymbol;

		if (_myResultRemoteModel != null) {
			try {
				Class<?> clazz = _myResultRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrencySymbol",
						String.class);

				method.invoke(_myResultRemoteModel, currencySymbol);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getMyResultRemoteModel() {
		return _myResultRemoteModel;
	}

	public void setMyResultRemoteModel(BaseModel<?> myResultRemoteModel) {
		_myResultRemoteModel = myResultRemoteModel;
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

		Class<?> remoteModelClass = _myResultRemoteModel.getClass();

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

		Object returnValue = method.invoke(_myResultRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			MyResultLocalServiceUtil.addMyResult(this);
		}
		else {
			MyResultLocalServiceUtil.updateMyResult(this);
		}
	}

	@Override
	public MyResult toEscapedModel() {
		return (MyResult)ProxyUtil.newProxyInstance(MyResult.class.getClassLoader(),
			new Class[] { MyResult.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		MyResultClp clone = new MyResultClp();

		clone.setItemId(getItemId());
		clone.setPortfolioId(getPortfolioId());
		clone.setInstitution(getInstitution());
		clone.setAssetId(getAssetId());
		clone.setSecurity_ticker(getSecurity_ticker());
		clone.setId_isin(getId_isin());
		clone.setName(getName());
		clone.setIndustry_sector(getIndustry_sector());
		clone.setPurchaseQty(getPurchaseQty());
		clone.setPurchaseDate(getPurchaseDate());
		clone.setCurrent_price(getCurrent_price());
		clone.setPurchasedFx(getPurchasedFx());
		clone.setCurrent_fx(getCurrent_fx());
		clone.setBaseCurrency(getBaseCurrency());
		clone.setSecurity_des(getSecurity_des());
		clone.setSecurity_class_int(getSecurity_class_int());
		clone.setSecurity_class(getSecurity_class());
		clone.setSecurity_typ(getSecurity_typ());
		clone.setSecurity_typ2(getSecurity_typ2());
		clone.setAsset_class(getAsset_class());
		clone.setAsset_sub_class(getAsset_sub_class());
		clone.setParent_comp_name(getParent_comp_name());
		clone.setCountryId(getCountryId());
		clone.setCountryName(getCountryName());
		clone.setCountryOfRisk(getCountryOfRisk());
		clone.setCountryOfRiskName(getCountryOfRiskName());
		clone.setCurrency_(getCurrency_());
		clone.setCurrencyDesc(getCurrencyDesc());
		clone.setPurchasedMarketValue(getPurchasedMarketValue());
		clone.setCurrentMarketValue(getCurrentMarketValue());
		clone.setGain_loss(getGain_loss());
		clone.setGain_loss_percent(getGain_loss_percent());
		clone.setFx_gain_loss(getFx_gain_loss());
		clone.setIncome(getIncome());
		clone.setCurrencySymbol(getCurrencySymbol());

		return clone;
	}

	@Override
	public int compareTo(MyResult myResult) {
		long primaryKey = myResult.getPrimaryKey();

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

		if (!(obj instanceof MyResultClp)) {
			return false;
		}

		MyResultClp myResult = (MyResultClp)obj;

		long primaryKey = myResult.getPrimaryKey();

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
		StringBundler sb = new StringBundler(71);

		sb.append("{itemId=");
		sb.append(getItemId());
		sb.append(", portfolioId=");
		sb.append(getPortfolioId());
		sb.append(", institution=");
		sb.append(getInstitution());
		sb.append(", assetId=");
		sb.append(getAssetId());
		sb.append(", security_ticker=");
		sb.append(getSecurity_ticker());
		sb.append(", id_isin=");
		sb.append(getId_isin());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", industry_sector=");
		sb.append(getIndustry_sector());
		sb.append(", purchaseQty=");
		sb.append(getPurchaseQty());
		sb.append(", purchaseDate=");
		sb.append(getPurchaseDate());
		sb.append(", current_price=");
		sb.append(getCurrent_price());
		sb.append(", purchasedFx=");
		sb.append(getPurchasedFx());
		sb.append(", current_fx=");
		sb.append(getCurrent_fx());
		sb.append(", baseCurrency=");
		sb.append(getBaseCurrency());
		sb.append(", security_des=");
		sb.append(getSecurity_des());
		sb.append(", security_class_int=");
		sb.append(getSecurity_class_int());
		sb.append(", security_class=");
		sb.append(getSecurity_class());
		sb.append(", security_typ=");
		sb.append(getSecurity_typ());
		sb.append(", security_typ2=");
		sb.append(getSecurity_typ2());
		sb.append(", asset_class=");
		sb.append(getAsset_class());
		sb.append(", asset_sub_class=");
		sb.append(getAsset_sub_class());
		sb.append(", parent_comp_name=");
		sb.append(getParent_comp_name());
		sb.append(", countryId=");
		sb.append(getCountryId());
		sb.append(", countryName=");
		sb.append(getCountryName());
		sb.append(", countryOfRisk=");
		sb.append(getCountryOfRisk());
		sb.append(", countryOfRiskName=");
		sb.append(getCountryOfRiskName());
		sb.append(", currency_=");
		sb.append(getCurrency_());
		sb.append(", currencyDesc=");
		sb.append(getCurrencyDesc());
		sb.append(", purchasedMarketValue=");
		sb.append(getPurchasedMarketValue());
		sb.append(", currentMarketValue=");
		sb.append(getCurrentMarketValue());
		sb.append(", gain_loss=");
		sb.append(getGain_loss());
		sb.append(", gain_loss_percent=");
		sb.append(getGain_loss_percent());
		sb.append(", fx_gain_loss=");
		sb.append(getFx_gain_loss());
		sb.append(", income=");
		sb.append(getIncome());
		sb.append(", currencySymbol=");
		sb.append(getCurrencySymbol());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(109);

		sb.append("<model><model-name>");
		sb.append("com.fingence.slayer.model.MyResult");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>itemId</column-name><column-value><![CDATA[");
		sb.append(getItemId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portfolioId</column-name><column-value><![CDATA[");
		sb.append(getPortfolioId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>institution</column-name><column-value><![CDATA[");
		sb.append(getInstitution());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assetId</column-name><column-value><![CDATA[");
		sb.append(getAssetId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>security_ticker</column-name><column-value><![CDATA[");
		sb.append(getSecurity_ticker());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>id_isin</column-name><column-value><![CDATA[");
		sb.append(getId_isin());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>industry_sector</column-name><column-value><![CDATA[");
		sb.append(getIndustry_sector());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>purchaseQty</column-name><column-value><![CDATA[");
		sb.append(getPurchaseQty());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>purchaseDate</column-name><column-value><![CDATA[");
		sb.append(getPurchaseDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>current_price</column-name><column-value><![CDATA[");
		sb.append(getCurrent_price());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>purchasedFx</column-name><column-value><![CDATA[");
		sb.append(getPurchasedFx());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>current_fx</column-name><column-value><![CDATA[");
		sb.append(getCurrent_fx());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>baseCurrency</column-name><column-value><![CDATA[");
		sb.append(getBaseCurrency());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>security_des</column-name><column-value><![CDATA[");
		sb.append(getSecurity_des());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>security_class_int</column-name><column-value><![CDATA[");
		sb.append(getSecurity_class_int());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>security_class</column-name><column-value><![CDATA[");
		sb.append(getSecurity_class());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>security_typ</column-name><column-value><![CDATA[");
		sb.append(getSecurity_typ());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>security_typ2</column-name><column-value><![CDATA[");
		sb.append(getSecurity_typ2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>asset_class</column-name><column-value><![CDATA[");
		sb.append(getAsset_class());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>asset_sub_class</column-name><column-value><![CDATA[");
		sb.append(getAsset_sub_class());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parent_comp_name</column-name><column-value><![CDATA[");
		sb.append(getParent_comp_name());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>countryId</column-name><column-value><![CDATA[");
		sb.append(getCountryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>countryName</column-name><column-value><![CDATA[");
		sb.append(getCountryName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>countryOfRisk</column-name><column-value><![CDATA[");
		sb.append(getCountryOfRisk());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>countryOfRiskName</column-name><column-value><![CDATA[");
		sb.append(getCountryOfRiskName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currency_</column-name><column-value><![CDATA[");
		sb.append(getCurrency_());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currencyDesc</column-name><column-value><![CDATA[");
		sb.append(getCurrencyDesc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>purchasedMarketValue</column-name><column-value><![CDATA[");
		sb.append(getPurchasedMarketValue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currentMarketValue</column-name><column-value><![CDATA[");
		sb.append(getCurrentMarketValue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gain_loss</column-name><column-value><![CDATA[");
		sb.append(getGain_loss());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gain_loss_percent</column-name><column-value><![CDATA[");
		sb.append(getGain_loss_percent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fx_gain_loss</column-name><column-value><![CDATA[");
		sb.append(getFx_gain_loss());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>income</column-name><column-value><![CDATA[");
		sb.append(getIncome());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currencySymbol</column-name><column-value><![CDATA[");
		sb.append(getCurrencySymbol());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _itemId;
	private long _portfolioId;
	private String _institution;
	private long _assetId;
	private String _security_ticker;
	private String _id_isin;
	private String _name;
	private String _industry_sector;
	private double _purchaseQty;
	private Date _purchaseDate;
	private double _current_price;
	private double _purchasedFx;
	private double _current_fx;
	private String _baseCurrency;
	private String _security_des;
	private int _security_class_int;
	private String _security_class;
	private String _security_typ;
	private String _security_typ2;
	private String _asset_class;
	private String _asset_sub_class;
	private String _parent_comp_name;
	private long _countryId;
	private String _countryName;
	private long _countryOfRisk;
	private String _countryOfRiskName;
	private String _currency_;
	private String _currencyDesc;
	private double _purchasedMarketValue;
	private double _currentMarketValue;
	private double _gain_loss;
	private double _gain_loss_percent;
	private double _fx_gain_loss;
	private double _income;
	private String _currencySymbol;
	private BaseModel<?> _myResultRemoteModel;
}