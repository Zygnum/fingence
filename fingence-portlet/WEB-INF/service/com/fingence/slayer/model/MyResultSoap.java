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
 * This class is used by SOAP remote services, specifically {@link com.fingence.slayer.service.http.MyResultServiceSoap}.
 *
 * @author Ahmed Hasan
 * @see com.fingence.slayer.service.http.MyResultServiceSoap
 * @generated
 */
public class MyResultSoap implements Serializable {
	public static MyResultSoap toSoapModel(MyResult model) {
		MyResultSoap soapModel = new MyResultSoap();

		soapModel.setItemId(model.getItemId());
		soapModel.setPortfolioId(model.getPortfolioId());
		soapModel.setInstitution(model.getInstitution());
		soapModel.setAssetId(model.getAssetId());
		soapModel.setSecurity_ticker(model.getSecurity_ticker());
		soapModel.setId_isin(model.getId_isin());
		soapModel.setName(model.getName());
		soapModel.setIndustry_sector(model.getIndustry_sector());
		soapModel.setPurchaseQty(model.getPurchaseQty());
		soapModel.setPurchaseDate(model.getPurchaseDate());
		soapModel.setCurrent_price(model.getCurrent_price());
		soapModel.setPurchasedFx(model.getPurchasedFx());
		soapModel.setCurrent_fx(model.getCurrent_fx());
		soapModel.setBaseCurrency(model.getBaseCurrency());
		soapModel.setSecurity_des(model.getSecurity_des());
		soapModel.setSecurity_class_int(model.getSecurity_class_int());
		soapModel.setSecurity_class(model.getSecurity_class());
		soapModel.setSecurity_typ(model.getSecurity_typ());
		soapModel.setSecurity_typ2(model.getSecurity_typ2());
		soapModel.setAsset_class(model.getAsset_class());
		soapModel.setAsset_sub_class(model.getAsset_sub_class());
		soapModel.setParent_comp_name(model.getParent_comp_name());
		soapModel.setCountryId(model.getCountryId());
		soapModel.setCountryName(model.getCountryName());
		soapModel.setCountryOfRisk(model.getCountryOfRisk());
		soapModel.setCountryOfRiskName(model.getCountryOfRiskName());
		soapModel.setCurrency_(model.getCurrency_());
		soapModel.setCurrencyDesc(model.getCurrencyDesc());
		soapModel.setPurchasedMarketValue(model.getPurchasedMarketValue());
		soapModel.setCurrentMarketValue(model.getCurrentMarketValue());
		soapModel.setGain_loss(model.getGain_loss());
		soapModel.setGain_loss_percent(model.getGain_loss_percent());
		soapModel.setFx_gain_loss(model.getFx_gain_loss());
		soapModel.setIncome(model.getIncome());
		soapModel.setCurrencySymbol(model.getCurrencySymbol());

		return soapModel;
	}

	public static MyResultSoap[] toSoapModels(MyResult[] models) {
		MyResultSoap[] soapModels = new MyResultSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MyResultSoap[][] toSoapModels(MyResult[][] models) {
		MyResultSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MyResultSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MyResultSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MyResultSoap[] toSoapModels(List<MyResult> models) {
		List<MyResultSoap> soapModels = new ArrayList<MyResultSoap>(models.size());

		for (MyResult model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MyResultSoap[soapModels.size()]);
	}

	public MyResultSoap() {
	}

	public long getPrimaryKey() {
		return _itemId;
	}

	public void setPrimaryKey(long pk) {
		setItemId(pk);
	}

	public long getItemId() {
		return _itemId;
	}

	public void setItemId(long itemId) {
		_itemId = itemId;
	}

	public long getPortfolioId() {
		return _portfolioId;
	}

	public void setPortfolioId(long portfolioId) {
		_portfolioId = portfolioId;
	}

	public String getInstitution() {
		return _institution;
	}

	public void setInstitution(String institution) {
		_institution = institution;
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

	public String getId_isin() {
		return _id_isin;
	}

	public void setId_isin(String id_isin) {
		_id_isin = id_isin;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getIndustry_sector() {
		return _industry_sector;
	}

	public void setIndustry_sector(String industry_sector) {
		_industry_sector = industry_sector;
	}

	public double getPurchaseQty() {
		return _purchaseQty;
	}

	public void setPurchaseQty(double purchaseQty) {
		_purchaseQty = purchaseQty;
	}

	public Date getPurchaseDate() {
		return _purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		_purchaseDate = purchaseDate;
	}

	public double getCurrent_price() {
		return _current_price;
	}

	public void setCurrent_price(double current_price) {
		_current_price = current_price;
	}

	public double getPurchasedFx() {
		return _purchasedFx;
	}

	public void setPurchasedFx(double purchasedFx) {
		_purchasedFx = purchasedFx;
	}

	public double getCurrent_fx() {
		return _current_fx;
	}

	public void setCurrent_fx(double current_fx) {
		_current_fx = current_fx;
	}

	public String getBaseCurrency() {
		return _baseCurrency;
	}

	public void setBaseCurrency(String baseCurrency) {
		_baseCurrency = baseCurrency;
	}

	public String getSecurity_des() {
		return _security_des;
	}

	public void setSecurity_des(String security_des) {
		_security_des = security_des;
	}

	public int getSecurity_class_int() {
		return _security_class_int;
	}

	public void setSecurity_class_int(int security_class_int) {
		_security_class_int = security_class_int;
	}

	public String getSecurity_class() {
		return _security_class;
	}

	public void setSecurity_class(String security_class) {
		_security_class = security_class;
	}

	public String getSecurity_typ() {
		return _security_typ;
	}

	public void setSecurity_typ(String security_typ) {
		_security_typ = security_typ;
	}

	public String getSecurity_typ2() {
		return _security_typ2;
	}

	public void setSecurity_typ2(String security_typ2) {
		_security_typ2 = security_typ2;
	}

	public String getAsset_class() {
		return _asset_class;
	}

	public void setAsset_class(String asset_class) {
		_asset_class = asset_class;
	}

	public String getAsset_sub_class() {
		return _asset_sub_class;
	}

	public void setAsset_sub_class(String asset_sub_class) {
		_asset_sub_class = asset_sub_class;
	}

	public String getParent_comp_name() {
		return _parent_comp_name;
	}

	public void setParent_comp_name(String parent_comp_name) {
		_parent_comp_name = parent_comp_name;
	}

	public long getCountryId() {
		return _countryId;
	}

	public void setCountryId(long countryId) {
		_countryId = countryId;
	}

	public String getCountryName() {
		return _countryName;
	}

	public void setCountryName(String countryName) {
		_countryName = countryName;
	}

	public long getCountryOfRisk() {
		return _countryOfRisk;
	}

	public void setCountryOfRisk(long countryOfRisk) {
		_countryOfRisk = countryOfRisk;
	}

	public String getCountryOfRiskName() {
		return _countryOfRiskName;
	}

	public void setCountryOfRiskName(String countryOfRiskName) {
		_countryOfRiskName = countryOfRiskName;
	}

	public String getCurrency_() {
		return _currency_;
	}

	public void setCurrency_(String currency_) {
		_currency_ = currency_;
	}

	public String getCurrencyDesc() {
		return _currencyDesc;
	}

	public void setCurrencyDesc(String currencyDesc) {
		_currencyDesc = currencyDesc;
	}

	public double getPurchasedMarketValue() {
		return _purchasedMarketValue;
	}

	public void setPurchasedMarketValue(double purchasedMarketValue) {
		_purchasedMarketValue = purchasedMarketValue;
	}

	public double getCurrentMarketValue() {
		return _currentMarketValue;
	}

	public void setCurrentMarketValue(double currentMarketValue) {
		_currentMarketValue = currentMarketValue;
	}

	public double getGain_loss() {
		return _gain_loss;
	}

	public void setGain_loss(double gain_loss) {
		_gain_loss = gain_loss;
	}

	public double getGain_loss_percent() {
		return _gain_loss_percent;
	}

	public void setGain_loss_percent(double gain_loss_percent) {
		_gain_loss_percent = gain_loss_percent;
	}

	public double getFx_gain_loss() {
		return _fx_gain_loss;
	}

	public void setFx_gain_loss(double fx_gain_loss) {
		_fx_gain_loss = fx_gain_loss;
	}

	public double getIncome() {
		return _income;
	}

	public void setIncome(double income) {
		_income = income;
	}

	public String getCurrencySymbol() {
		return _currencySymbol;
	}

	public void setCurrencySymbol(String currencySymbol) {
		_currencySymbol = currencySymbol;
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
}