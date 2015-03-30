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

package com.fingence.slayer.model.impl;

import com.fingence.slayer.model.MyResult;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MyResult in entity cache.
 *
 * @author Ahmed Hasan
 * @see MyResult
 * @generated
 */
public class MyResultCacheModel implements CacheModel<MyResult>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(71);

		sb.append("{itemId=");
		sb.append(itemId);
		sb.append(", portfolioId=");
		sb.append(portfolioId);
		sb.append(", institution=");
		sb.append(institution);
		sb.append(", assetId=");
		sb.append(assetId);
		sb.append(", security_ticker=");
		sb.append(security_ticker);
		sb.append(", id_isin=");
		sb.append(id_isin);
		sb.append(", name=");
		sb.append(name);
		sb.append(", industry_sector=");
		sb.append(industry_sector);
		sb.append(", purchaseQty=");
		sb.append(purchaseQty);
		sb.append(", purchaseDate=");
		sb.append(purchaseDate);
		sb.append(", current_price=");
		sb.append(current_price);
		sb.append(", purchasedFx=");
		sb.append(purchasedFx);
		sb.append(", current_fx=");
		sb.append(current_fx);
		sb.append(", baseCurrency=");
		sb.append(baseCurrency);
		sb.append(", security_des=");
		sb.append(security_des);
		sb.append(", security_class_int=");
		sb.append(security_class_int);
		sb.append(", security_class=");
		sb.append(security_class);
		sb.append(", security_typ=");
		sb.append(security_typ);
		sb.append(", security_typ2=");
		sb.append(security_typ2);
		sb.append(", asset_class=");
		sb.append(asset_class);
		sb.append(", asset_sub_class=");
		sb.append(asset_sub_class);
		sb.append(", parent_comp_name=");
		sb.append(parent_comp_name);
		sb.append(", countryId=");
		sb.append(countryId);
		sb.append(", countryName=");
		sb.append(countryName);
		sb.append(", countryOfRisk=");
		sb.append(countryOfRisk);
		sb.append(", countryOfRiskName=");
		sb.append(countryOfRiskName);
		sb.append(", currency_=");
		sb.append(currency_);
		sb.append(", currencyDesc=");
		sb.append(currencyDesc);
		sb.append(", purchasedMarketValue=");
		sb.append(purchasedMarketValue);
		sb.append(", currentMarketValue=");
		sb.append(currentMarketValue);
		sb.append(", gain_loss=");
		sb.append(gain_loss);
		sb.append(", gain_loss_percent=");
		sb.append(gain_loss_percent);
		sb.append(", fx_gain_loss=");
		sb.append(fx_gain_loss);
		sb.append(", income=");
		sb.append(income);
		sb.append(", currencySymbol=");
		sb.append(currencySymbol);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MyResult toEntityModel() {
		MyResultImpl myResultImpl = new MyResultImpl();

		myResultImpl.setItemId(itemId);
		myResultImpl.setPortfolioId(portfolioId);

		if (institution == null) {
			myResultImpl.setInstitution(StringPool.BLANK);
		}
		else {
			myResultImpl.setInstitution(institution);
		}

		myResultImpl.setAssetId(assetId);

		if (security_ticker == null) {
			myResultImpl.setSecurity_ticker(StringPool.BLANK);
		}
		else {
			myResultImpl.setSecurity_ticker(security_ticker);
		}

		if (id_isin == null) {
			myResultImpl.setId_isin(StringPool.BLANK);
		}
		else {
			myResultImpl.setId_isin(id_isin);
		}

		if (name == null) {
			myResultImpl.setName(StringPool.BLANK);
		}
		else {
			myResultImpl.setName(name);
		}

		if (industry_sector == null) {
			myResultImpl.setIndustry_sector(StringPool.BLANK);
		}
		else {
			myResultImpl.setIndustry_sector(industry_sector);
		}

		myResultImpl.setPurchaseQty(purchaseQty);

		if (purchaseDate == Long.MIN_VALUE) {
			myResultImpl.setPurchaseDate(null);
		}
		else {
			myResultImpl.setPurchaseDate(new Date(purchaseDate));
		}

		myResultImpl.setCurrent_price(current_price);
		myResultImpl.setPurchasedFx(purchasedFx);
		myResultImpl.setCurrent_fx(current_fx);

		if (baseCurrency == null) {
			myResultImpl.setBaseCurrency(StringPool.BLANK);
		}
		else {
			myResultImpl.setBaseCurrency(baseCurrency);
		}

		if (security_des == null) {
			myResultImpl.setSecurity_des(StringPool.BLANK);
		}
		else {
			myResultImpl.setSecurity_des(security_des);
		}

		myResultImpl.setSecurity_class_int(security_class_int);

		if (security_class == null) {
			myResultImpl.setSecurity_class(StringPool.BLANK);
		}
		else {
			myResultImpl.setSecurity_class(security_class);
		}

		if (security_typ == null) {
			myResultImpl.setSecurity_typ(StringPool.BLANK);
		}
		else {
			myResultImpl.setSecurity_typ(security_typ);
		}

		if (security_typ2 == null) {
			myResultImpl.setSecurity_typ2(StringPool.BLANK);
		}
		else {
			myResultImpl.setSecurity_typ2(security_typ2);
		}

		if (asset_class == null) {
			myResultImpl.setAsset_class(StringPool.BLANK);
		}
		else {
			myResultImpl.setAsset_class(asset_class);
		}

		if (asset_sub_class == null) {
			myResultImpl.setAsset_sub_class(StringPool.BLANK);
		}
		else {
			myResultImpl.setAsset_sub_class(asset_sub_class);
		}

		if (parent_comp_name == null) {
			myResultImpl.setParent_comp_name(StringPool.BLANK);
		}
		else {
			myResultImpl.setParent_comp_name(parent_comp_name);
		}

		myResultImpl.setCountryId(countryId);

		if (countryName == null) {
			myResultImpl.setCountryName(StringPool.BLANK);
		}
		else {
			myResultImpl.setCountryName(countryName);
		}

		myResultImpl.setCountryOfRisk(countryOfRisk);

		if (countryOfRiskName == null) {
			myResultImpl.setCountryOfRiskName(StringPool.BLANK);
		}
		else {
			myResultImpl.setCountryOfRiskName(countryOfRiskName);
		}

		if (currency_ == null) {
			myResultImpl.setCurrency_(StringPool.BLANK);
		}
		else {
			myResultImpl.setCurrency_(currency_);
		}

		if (currencyDesc == null) {
			myResultImpl.setCurrencyDesc(StringPool.BLANK);
		}
		else {
			myResultImpl.setCurrencyDesc(currencyDesc);
		}

		myResultImpl.setPurchasedMarketValue(purchasedMarketValue);
		myResultImpl.setCurrentMarketValue(currentMarketValue);
		myResultImpl.setGain_loss(gain_loss);
		myResultImpl.setGain_loss_percent(gain_loss_percent);
		myResultImpl.setFx_gain_loss(fx_gain_loss);
		myResultImpl.setIncome(income);

		if (currencySymbol == null) {
			myResultImpl.setCurrencySymbol(StringPool.BLANK);
		}
		else {
			myResultImpl.setCurrencySymbol(currencySymbol);
		}

		myResultImpl.resetOriginalValues();

		return myResultImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		itemId = objectInput.readLong();
		portfolioId = objectInput.readLong();
		institution = objectInput.readUTF();
		assetId = objectInput.readLong();
		security_ticker = objectInput.readUTF();
		id_isin = objectInput.readUTF();
		name = objectInput.readUTF();
		industry_sector = objectInput.readUTF();
		purchaseQty = objectInput.readDouble();
		purchaseDate = objectInput.readLong();
		current_price = objectInput.readDouble();
		purchasedFx = objectInput.readDouble();
		current_fx = objectInput.readDouble();
		baseCurrency = objectInput.readUTF();
		security_des = objectInput.readUTF();
		security_class_int = objectInput.readInt();
		security_class = objectInput.readUTF();
		security_typ = objectInput.readUTF();
		security_typ2 = objectInput.readUTF();
		asset_class = objectInput.readUTF();
		asset_sub_class = objectInput.readUTF();
		parent_comp_name = objectInput.readUTF();
		countryId = objectInput.readLong();
		countryName = objectInput.readUTF();
		countryOfRisk = objectInput.readLong();
		countryOfRiskName = objectInput.readUTF();
		currency_ = objectInput.readUTF();
		currencyDesc = objectInput.readUTF();
		purchasedMarketValue = objectInput.readDouble();
		currentMarketValue = objectInput.readDouble();
		gain_loss = objectInput.readDouble();
		gain_loss_percent = objectInput.readDouble();
		fx_gain_loss = objectInput.readDouble();
		income = objectInput.readDouble();
		currencySymbol = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(itemId);
		objectOutput.writeLong(portfolioId);

		if (institution == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(institution);
		}

		objectOutput.writeLong(assetId);

		if (security_ticker == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(security_ticker);
		}

		if (id_isin == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(id_isin);
		}

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (industry_sector == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(industry_sector);
		}

		objectOutput.writeDouble(purchaseQty);
		objectOutput.writeLong(purchaseDate);
		objectOutput.writeDouble(current_price);
		objectOutput.writeDouble(purchasedFx);
		objectOutput.writeDouble(current_fx);

		if (baseCurrency == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(baseCurrency);
		}

		if (security_des == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(security_des);
		}

		objectOutput.writeInt(security_class_int);

		if (security_class == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(security_class);
		}

		if (security_typ == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(security_typ);
		}

		if (security_typ2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(security_typ2);
		}

		if (asset_class == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(asset_class);
		}

		if (asset_sub_class == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(asset_sub_class);
		}

		if (parent_comp_name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(parent_comp_name);
		}

		objectOutput.writeLong(countryId);

		if (countryName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(countryName);
		}

		objectOutput.writeLong(countryOfRisk);

		if (countryOfRiskName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(countryOfRiskName);
		}

		if (currency_ == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(currency_);
		}

		if (currencyDesc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(currencyDesc);
		}

		objectOutput.writeDouble(purchasedMarketValue);
		objectOutput.writeDouble(currentMarketValue);
		objectOutput.writeDouble(gain_loss);
		objectOutput.writeDouble(gain_loss_percent);
		objectOutput.writeDouble(fx_gain_loss);
		objectOutput.writeDouble(income);

		if (currencySymbol == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(currencySymbol);
		}
	}

	public long itemId;
	public long portfolioId;
	public String institution;
	public long assetId;
	public String security_ticker;
	public String id_isin;
	public String name;
	public String industry_sector;
	public double purchaseQty;
	public long purchaseDate;
	public double current_price;
	public double purchasedFx;
	public double current_fx;
	public String baseCurrency;
	public String security_des;
	public int security_class_int;
	public String security_class;
	public String security_typ;
	public String security_typ2;
	public String asset_class;
	public String asset_sub_class;
	public String parent_comp_name;
	public long countryId;
	public String countryName;
	public long countryOfRisk;
	public String countryOfRiskName;
	public String currency_;
	public String currencyDesc;
	public double purchasedMarketValue;
	public double currentMarketValue;
	public double gain_loss;
	public double gain_loss_percent;
	public double fx_gain_loss;
	public double income;
	public String currencySymbol;
}