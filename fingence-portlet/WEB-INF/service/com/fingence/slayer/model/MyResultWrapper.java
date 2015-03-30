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
 * This class is a wrapper for {@link MyResult}.
 * </p>
 *
 * @author Ahmed Hasan
 * @see MyResult
 * @generated
 */
public class MyResultWrapper implements MyResult, ModelWrapper<MyResult> {
	public MyResultWrapper(MyResult myResult) {
		_myResult = myResult;
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

	/**
	* Returns the primary key of this my result.
	*
	* @return the primary key of this my result
	*/
	@Override
	public long getPrimaryKey() {
		return _myResult.getPrimaryKey();
	}

	/**
	* Sets the primary key of this my result.
	*
	* @param primaryKey the primary key of this my result
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_myResult.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the item ID of this my result.
	*
	* @return the item ID of this my result
	*/
	@Override
	public long getItemId() {
		return _myResult.getItemId();
	}

	/**
	* Sets the item ID of this my result.
	*
	* @param itemId the item ID of this my result
	*/
	@Override
	public void setItemId(long itemId) {
		_myResult.setItemId(itemId);
	}

	/**
	* Returns the portfolio ID of this my result.
	*
	* @return the portfolio ID of this my result
	*/
	@Override
	public long getPortfolioId() {
		return _myResult.getPortfolioId();
	}

	/**
	* Sets the portfolio ID of this my result.
	*
	* @param portfolioId the portfolio ID of this my result
	*/
	@Override
	public void setPortfolioId(long portfolioId) {
		_myResult.setPortfolioId(portfolioId);
	}

	/**
	* Returns the institution of this my result.
	*
	* @return the institution of this my result
	*/
	@Override
	public java.lang.String getInstitution() {
		return _myResult.getInstitution();
	}

	/**
	* Sets the institution of this my result.
	*
	* @param institution the institution of this my result
	*/
	@Override
	public void setInstitution(java.lang.String institution) {
		_myResult.setInstitution(institution);
	}

	/**
	* Returns the asset ID of this my result.
	*
	* @return the asset ID of this my result
	*/
	@Override
	public long getAssetId() {
		return _myResult.getAssetId();
	}

	/**
	* Sets the asset ID of this my result.
	*
	* @param assetId the asset ID of this my result
	*/
	@Override
	public void setAssetId(long assetId) {
		_myResult.setAssetId(assetId);
	}

	/**
	* Returns the security_ticker of this my result.
	*
	* @return the security_ticker of this my result
	*/
	@Override
	public java.lang.String getSecurity_ticker() {
		return _myResult.getSecurity_ticker();
	}

	/**
	* Sets the security_ticker of this my result.
	*
	* @param security_ticker the security_ticker of this my result
	*/
	@Override
	public void setSecurity_ticker(java.lang.String security_ticker) {
		_myResult.setSecurity_ticker(security_ticker);
	}

	/**
	* Returns the id_isin of this my result.
	*
	* @return the id_isin of this my result
	*/
	@Override
	public java.lang.String getId_isin() {
		return _myResult.getId_isin();
	}

	/**
	* Sets the id_isin of this my result.
	*
	* @param id_isin the id_isin of this my result
	*/
	@Override
	public void setId_isin(java.lang.String id_isin) {
		_myResult.setId_isin(id_isin);
	}

	/**
	* Returns the name of this my result.
	*
	* @return the name of this my result
	*/
	@Override
	public java.lang.String getName() {
		return _myResult.getName();
	}

	/**
	* Sets the name of this my result.
	*
	* @param name the name of this my result
	*/
	@Override
	public void setName(java.lang.String name) {
		_myResult.setName(name);
	}

	/**
	* Returns the industry_sector of this my result.
	*
	* @return the industry_sector of this my result
	*/
	@Override
	public java.lang.String getIndustry_sector() {
		return _myResult.getIndustry_sector();
	}

	/**
	* Sets the industry_sector of this my result.
	*
	* @param industry_sector the industry_sector of this my result
	*/
	@Override
	public void setIndustry_sector(java.lang.String industry_sector) {
		_myResult.setIndustry_sector(industry_sector);
	}

	/**
	* Returns the purchase qty of this my result.
	*
	* @return the purchase qty of this my result
	*/
	@Override
	public double getPurchaseQty() {
		return _myResult.getPurchaseQty();
	}

	/**
	* Sets the purchase qty of this my result.
	*
	* @param purchaseQty the purchase qty of this my result
	*/
	@Override
	public void setPurchaseQty(double purchaseQty) {
		_myResult.setPurchaseQty(purchaseQty);
	}

	/**
	* Returns the purchase date of this my result.
	*
	* @return the purchase date of this my result
	*/
	@Override
	public java.util.Date getPurchaseDate() {
		return _myResult.getPurchaseDate();
	}

	/**
	* Sets the purchase date of this my result.
	*
	* @param purchaseDate the purchase date of this my result
	*/
	@Override
	public void setPurchaseDate(java.util.Date purchaseDate) {
		_myResult.setPurchaseDate(purchaseDate);
	}

	/**
	* Returns the current_price of this my result.
	*
	* @return the current_price of this my result
	*/
	@Override
	public double getCurrent_price() {
		return _myResult.getCurrent_price();
	}

	/**
	* Sets the current_price of this my result.
	*
	* @param current_price the current_price of this my result
	*/
	@Override
	public void setCurrent_price(double current_price) {
		_myResult.setCurrent_price(current_price);
	}

	/**
	* Returns the purchased fx of this my result.
	*
	* @return the purchased fx of this my result
	*/
	@Override
	public double getPurchasedFx() {
		return _myResult.getPurchasedFx();
	}

	/**
	* Sets the purchased fx of this my result.
	*
	* @param purchasedFx the purchased fx of this my result
	*/
	@Override
	public void setPurchasedFx(double purchasedFx) {
		_myResult.setPurchasedFx(purchasedFx);
	}

	/**
	* Returns the current_fx of this my result.
	*
	* @return the current_fx of this my result
	*/
	@Override
	public double getCurrent_fx() {
		return _myResult.getCurrent_fx();
	}

	/**
	* Sets the current_fx of this my result.
	*
	* @param current_fx the current_fx of this my result
	*/
	@Override
	public void setCurrent_fx(double current_fx) {
		_myResult.setCurrent_fx(current_fx);
	}

	/**
	* Returns the base currency of this my result.
	*
	* @return the base currency of this my result
	*/
	@Override
	public java.lang.String getBaseCurrency() {
		return _myResult.getBaseCurrency();
	}

	/**
	* Sets the base currency of this my result.
	*
	* @param baseCurrency the base currency of this my result
	*/
	@Override
	public void setBaseCurrency(java.lang.String baseCurrency) {
		_myResult.setBaseCurrency(baseCurrency);
	}

	/**
	* Returns the security_des of this my result.
	*
	* @return the security_des of this my result
	*/
	@Override
	public java.lang.String getSecurity_des() {
		return _myResult.getSecurity_des();
	}

	/**
	* Sets the security_des of this my result.
	*
	* @param security_des the security_des of this my result
	*/
	@Override
	public void setSecurity_des(java.lang.String security_des) {
		_myResult.setSecurity_des(security_des);
	}

	/**
	* Returns the security_class_int of this my result.
	*
	* @return the security_class_int of this my result
	*/
	@Override
	public int getSecurity_class_int() {
		return _myResult.getSecurity_class_int();
	}

	/**
	* Sets the security_class_int of this my result.
	*
	* @param security_class_int the security_class_int of this my result
	*/
	@Override
	public void setSecurity_class_int(int security_class_int) {
		_myResult.setSecurity_class_int(security_class_int);
	}

	/**
	* Returns the security_class of this my result.
	*
	* @return the security_class of this my result
	*/
	@Override
	public java.lang.String getSecurity_class() {
		return _myResult.getSecurity_class();
	}

	/**
	* Sets the security_class of this my result.
	*
	* @param security_class the security_class of this my result
	*/
	@Override
	public void setSecurity_class(java.lang.String security_class) {
		_myResult.setSecurity_class(security_class);
	}

	/**
	* Returns the security_typ of this my result.
	*
	* @return the security_typ of this my result
	*/
	@Override
	public java.lang.String getSecurity_typ() {
		return _myResult.getSecurity_typ();
	}

	/**
	* Sets the security_typ of this my result.
	*
	* @param security_typ the security_typ of this my result
	*/
	@Override
	public void setSecurity_typ(java.lang.String security_typ) {
		_myResult.setSecurity_typ(security_typ);
	}

	/**
	* Returns the security_typ2 of this my result.
	*
	* @return the security_typ2 of this my result
	*/
	@Override
	public java.lang.String getSecurity_typ2() {
		return _myResult.getSecurity_typ2();
	}

	/**
	* Sets the security_typ2 of this my result.
	*
	* @param security_typ2 the security_typ2 of this my result
	*/
	@Override
	public void setSecurity_typ2(java.lang.String security_typ2) {
		_myResult.setSecurity_typ2(security_typ2);
	}

	/**
	* Returns the asset_class of this my result.
	*
	* @return the asset_class of this my result
	*/
	@Override
	public java.lang.String getAsset_class() {
		return _myResult.getAsset_class();
	}

	/**
	* Sets the asset_class of this my result.
	*
	* @param asset_class the asset_class of this my result
	*/
	@Override
	public void setAsset_class(java.lang.String asset_class) {
		_myResult.setAsset_class(asset_class);
	}

	/**
	* Returns the asset_sub_class of this my result.
	*
	* @return the asset_sub_class of this my result
	*/
	@Override
	public java.lang.String getAsset_sub_class() {
		return _myResult.getAsset_sub_class();
	}

	/**
	* Sets the asset_sub_class of this my result.
	*
	* @param asset_sub_class the asset_sub_class of this my result
	*/
	@Override
	public void setAsset_sub_class(java.lang.String asset_sub_class) {
		_myResult.setAsset_sub_class(asset_sub_class);
	}

	/**
	* Returns the parent_comp_name of this my result.
	*
	* @return the parent_comp_name of this my result
	*/
	@Override
	public java.lang.String getParent_comp_name() {
		return _myResult.getParent_comp_name();
	}

	/**
	* Sets the parent_comp_name of this my result.
	*
	* @param parent_comp_name the parent_comp_name of this my result
	*/
	@Override
	public void setParent_comp_name(java.lang.String parent_comp_name) {
		_myResult.setParent_comp_name(parent_comp_name);
	}

	/**
	* Returns the country ID of this my result.
	*
	* @return the country ID of this my result
	*/
	@Override
	public long getCountryId() {
		return _myResult.getCountryId();
	}

	/**
	* Sets the country ID of this my result.
	*
	* @param countryId the country ID of this my result
	*/
	@Override
	public void setCountryId(long countryId) {
		_myResult.setCountryId(countryId);
	}

	/**
	* Returns the country name of this my result.
	*
	* @return the country name of this my result
	*/
	@Override
	public java.lang.String getCountryName() {
		return _myResult.getCountryName();
	}

	/**
	* Sets the country name of this my result.
	*
	* @param countryName the country name of this my result
	*/
	@Override
	public void setCountryName(java.lang.String countryName) {
		_myResult.setCountryName(countryName);
	}

	/**
	* Returns the country of risk of this my result.
	*
	* @return the country of risk of this my result
	*/
	@Override
	public long getCountryOfRisk() {
		return _myResult.getCountryOfRisk();
	}

	/**
	* Sets the country of risk of this my result.
	*
	* @param countryOfRisk the country of risk of this my result
	*/
	@Override
	public void setCountryOfRisk(long countryOfRisk) {
		_myResult.setCountryOfRisk(countryOfRisk);
	}

	/**
	* Returns the country of risk name of this my result.
	*
	* @return the country of risk name of this my result
	*/
	@Override
	public java.lang.String getCountryOfRiskName() {
		return _myResult.getCountryOfRiskName();
	}

	/**
	* Sets the country of risk name of this my result.
	*
	* @param countryOfRiskName the country of risk name of this my result
	*/
	@Override
	public void setCountryOfRiskName(java.lang.String countryOfRiskName) {
		_myResult.setCountryOfRiskName(countryOfRiskName);
	}

	/**
	* Returns the currency_ of this my result.
	*
	* @return the currency_ of this my result
	*/
	@Override
	public java.lang.String getCurrency_() {
		return _myResult.getCurrency_();
	}

	/**
	* Sets the currency_ of this my result.
	*
	* @param currency_ the currency_ of this my result
	*/
	@Override
	public void setCurrency_(java.lang.String currency_) {
		_myResult.setCurrency_(currency_);
	}

	/**
	* Returns the currency desc of this my result.
	*
	* @return the currency desc of this my result
	*/
	@Override
	public java.lang.String getCurrencyDesc() {
		return _myResult.getCurrencyDesc();
	}

	/**
	* Sets the currency desc of this my result.
	*
	* @param currencyDesc the currency desc of this my result
	*/
	@Override
	public void setCurrencyDesc(java.lang.String currencyDesc) {
		_myResult.setCurrencyDesc(currencyDesc);
	}

	/**
	* Returns the purchased market value of this my result.
	*
	* @return the purchased market value of this my result
	*/
	@Override
	public double getPurchasedMarketValue() {
		return _myResult.getPurchasedMarketValue();
	}

	/**
	* Sets the purchased market value of this my result.
	*
	* @param purchasedMarketValue the purchased market value of this my result
	*/
	@Override
	public void setPurchasedMarketValue(double purchasedMarketValue) {
		_myResult.setPurchasedMarketValue(purchasedMarketValue);
	}

	/**
	* Returns the current market value of this my result.
	*
	* @return the current market value of this my result
	*/
	@Override
	public double getCurrentMarketValue() {
		return _myResult.getCurrentMarketValue();
	}

	/**
	* Sets the current market value of this my result.
	*
	* @param currentMarketValue the current market value of this my result
	*/
	@Override
	public void setCurrentMarketValue(double currentMarketValue) {
		_myResult.setCurrentMarketValue(currentMarketValue);
	}

	/**
	* Returns the gain_loss of this my result.
	*
	* @return the gain_loss of this my result
	*/
	@Override
	public double getGain_loss() {
		return _myResult.getGain_loss();
	}

	/**
	* Sets the gain_loss of this my result.
	*
	* @param gain_loss the gain_loss of this my result
	*/
	@Override
	public void setGain_loss(double gain_loss) {
		_myResult.setGain_loss(gain_loss);
	}

	/**
	* Returns the gain_loss_percent of this my result.
	*
	* @return the gain_loss_percent of this my result
	*/
	@Override
	public double getGain_loss_percent() {
		return _myResult.getGain_loss_percent();
	}

	/**
	* Sets the gain_loss_percent of this my result.
	*
	* @param gain_loss_percent the gain_loss_percent of this my result
	*/
	@Override
	public void setGain_loss_percent(double gain_loss_percent) {
		_myResult.setGain_loss_percent(gain_loss_percent);
	}

	/**
	* Returns the fx_gain_loss of this my result.
	*
	* @return the fx_gain_loss of this my result
	*/
	@Override
	public double getFx_gain_loss() {
		return _myResult.getFx_gain_loss();
	}

	/**
	* Sets the fx_gain_loss of this my result.
	*
	* @param fx_gain_loss the fx_gain_loss of this my result
	*/
	@Override
	public void setFx_gain_loss(double fx_gain_loss) {
		_myResult.setFx_gain_loss(fx_gain_loss);
	}

	/**
	* Returns the income of this my result.
	*
	* @return the income of this my result
	*/
	@Override
	public double getIncome() {
		return _myResult.getIncome();
	}

	/**
	* Sets the income of this my result.
	*
	* @param income the income of this my result
	*/
	@Override
	public void setIncome(double income) {
		_myResult.setIncome(income);
	}

	/**
	* Returns the currency symbol of this my result.
	*
	* @return the currency symbol of this my result
	*/
	@Override
	public java.lang.String getCurrencySymbol() {
		return _myResult.getCurrencySymbol();
	}

	/**
	* Sets the currency symbol of this my result.
	*
	* @param currencySymbol the currency symbol of this my result
	*/
	@Override
	public void setCurrencySymbol(java.lang.String currencySymbol) {
		_myResult.setCurrencySymbol(currencySymbol);
	}

	@Override
	public boolean isNew() {
		return _myResult.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_myResult.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _myResult.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_myResult.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _myResult.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _myResult.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_myResult.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _myResult.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_myResult.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_myResult.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_myResult.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MyResultWrapper((MyResult)_myResult.clone());
	}

	@Override
	public int compareTo(MyResult myResult) {
		return _myResult.compareTo(myResult);
	}

	@Override
	public int hashCode() {
		return _myResult.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<MyResult> toCacheModel() {
		return _myResult.toCacheModel();
	}

	@Override
	public MyResult toEscapedModel() {
		return new MyResultWrapper(_myResult.toEscapedModel());
	}

	@Override
	public MyResult toUnescapedModel() {
		return new MyResultWrapper(_myResult.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _myResult.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _myResult.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_myResult.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MyResultWrapper)) {
			return false;
		}

		MyResultWrapper myResultWrapper = (MyResultWrapper)obj;

		if (Validator.equals(_myResult, myResultWrapper._myResult)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public MyResult getWrappedMyResult() {
		return _myResult;
	}

	@Override
	public MyResult getWrappedModel() {
		return _myResult;
	}

	@Override
	public void resetOriginalValues() {
		_myResult.resetOriginalValues();
	}

	private MyResult _myResult;
}