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

import com.fingence.slayer.model.Asset;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Asset in entity cache.
 *
 * @author Ahmed Hasan
 * @see Asset
 * @generated
 */
public class AssetCacheModel implements CacheModel<Asset>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(73);

		sb.append("{assetId=");
		sb.append(assetId);
		sb.append(", security_ticker=");
		sb.append(security_ticker);
		sb.append(", id_cusip=");
		sb.append(id_cusip);
		sb.append(", id_isin=");
		sb.append(id_isin);
		sb.append(", id_bb_global=");
		sb.append(id_bb_global);
		sb.append(", id_bb_sec_num_src=");
		sb.append(id_bb_sec_num_src);
		sb.append(", name=");
		sb.append(name);
		sb.append(", chg_pct_mtd=");
		sb.append(chg_pct_mtd);
		sb.append(", chg_pct_5d=");
		sb.append(chg_pct_5d);
		sb.append(", chg_pct_1m=");
		sb.append(chg_pct_1m);
		sb.append(", chg_pct_3m=");
		sb.append(chg_pct_3m);
		sb.append(", chg_pct_6m=");
		sb.append(chg_pct_6m);
		sb.append(", chg_pct_ytd=");
		sb.append(chg_pct_ytd);
		sb.append(", chg_pct_high_52week=");
		sb.append(chg_pct_high_52week);
		sb.append(", chg_pct_low_52week=");
		sb.append(chg_pct_low_52week);
		sb.append(", chg_pct_1yr=");
		sb.append(chg_pct_1yr);
		sb.append(", chg_trr_5yr=");
		sb.append(chg_trr_5yr);
		sb.append(", current_price=");
		sb.append(current_price);
		sb.append(", last_price=");
		sb.append(last_price);
		sb.append(", bid_price=");
		sb.append(bid_price);
		sb.append(", ask_price=");
		sb.append(ask_price);
		sb.append(", security_des=");
		sb.append(security_des);
		sb.append(", parent_comp_name=");
		sb.append(parent_comp_name);
		sb.append(", security_class=");
		sb.append(security_class);
		sb.append(", volatility_30d=");
		sb.append(volatility_30d);
		sb.append(", volatility_90d=");
		sb.append(volatility_90d);
		sb.append(", volatility_180d=");
		sb.append(volatility_180d);
		sb.append(", volatility_360d=");
		sb.append(volatility_360d);
		sb.append(", currency=");
		sb.append(currency);
		sb.append(", country=");
		sb.append(country);
		sb.append(", country_of_risk=");
		sb.append(country_of_risk);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Asset toEntityModel() {
		AssetImpl assetImpl = new AssetImpl();

		assetImpl.setAssetId(assetId);

		if (security_ticker == null) {
			assetImpl.setSecurity_ticker(StringPool.BLANK);
		}
		else {
			assetImpl.setSecurity_ticker(security_ticker);
		}

		if (id_cusip == null) {
			assetImpl.setId_cusip(StringPool.BLANK);
		}
		else {
			assetImpl.setId_cusip(id_cusip);
		}

		if (id_isin == null) {
			assetImpl.setId_isin(StringPool.BLANK);
		}
		else {
			assetImpl.setId_isin(id_isin);
		}

		if (id_bb_global == null) {
			assetImpl.setId_bb_global(StringPool.BLANK);
		}
		else {
			assetImpl.setId_bb_global(id_bb_global);
		}

		assetImpl.setId_bb_sec_num_src(id_bb_sec_num_src);

		if (name == null) {
			assetImpl.setName(StringPool.BLANK);
		}
		else {
			assetImpl.setName(name);
		}

		assetImpl.setChg_pct_mtd(chg_pct_mtd);
		assetImpl.setChg_pct_5d(chg_pct_5d);
		assetImpl.setChg_pct_1m(chg_pct_1m);
		assetImpl.setChg_pct_3m(chg_pct_3m);
		assetImpl.setChg_pct_6m(chg_pct_6m);
		assetImpl.setChg_pct_ytd(chg_pct_ytd);
		assetImpl.setChg_pct_high_52week(chg_pct_high_52week);
		assetImpl.setChg_pct_low_52week(chg_pct_low_52week);
		assetImpl.setChg_pct_1yr(chg_pct_1yr);
		assetImpl.setChg_trr_5yr(chg_trr_5yr);
		assetImpl.setCurrent_price(current_price);
		assetImpl.setLast_price(last_price);
		assetImpl.setBid_price(bid_price);
		assetImpl.setAsk_price(ask_price);

		if (security_des == null) {
			assetImpl.setSecurity_des(StringPool.BLANK);
		}
		else {
			assetImpl.setSecurity_des(security_des);
		}

		if (parent_comp_name == null) {
			assetImpl.setParent_comp_name(StringPool.BLANK);
		}
		else {
			assetImpl.setParent_comp_name(parent_comp_name);
		}

		assetImpl.setSecurity_class(security_class);
		assetImpl.setVolatility_30d(volatility_30d);
		assetImpl.setVolatility_90d(volatility_90d);
		assetImpl.setVolatility_180d(volatility_180d);
		assetImpl.setVolatility_360d(volatility_360d);

		if (currency == null) {
			assetImpl.setCurrency(StringPool.BLANK);
		}
		else {
			assetImpl.setCurrency(currency);
		}

		assetImpl.setCountry(country);
		assetImpl.setCountry_of_risk(country_of_risk);

		if (createDate == Long.MIN_VALUE) {
			assetImpl.setCreateDate(null);
		}
		else {
			assetImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			assetImpl.setModifiedDate(null);
		}
		else {
			assetImpl.setModifiedDate(new Date(modifiedDate));
		}

		assetImpl.setCompanyId(companyId);
		assetImpl.setUserId(userId);

		if (userName == null) {
			assetImpl.setUserName(StringPool.BLANK);
		}
		else {
			assetImpl.setUserName(userName);
		}

		assetImpl.resetOriginalValues();

		return assetImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		assetId = objectInput.readLong();
		security_ticker = objectInput.readUTF();
		id_cusip = objectInput.readUTF();
		id_isin = objectInput.readUTF();
		id_bb_global = objectInput.readUTF();
		id_bb_sec_num_src = objectInput.readLong();
		name = objectInput.readUTF();
		chg_pct_mtd = objectInput.readDouble();
		chg_pct_5d = objectInput.readDouble();
		chg_pct_1m = objectInput.readDouble();
		chg_pct_3m = objectInput.readDouble();
		chg_pct_6m = objectInput.readDouble();
		chg_pct_ytd = objectInput.readDouble();
		chg_pct_high_52week = objectInput.readDouble();
		chg_pct_low_52week = objectInput.readDouble();
		chg_pct_1yr = objectInput.readDouble();
		chg_trr_5yr = objectInput.readDouble();
		current_price = objectInput.readDouble();
		last_price = objectInput.readDouble();
		bid_price = objectInput.readDouble();
		ask_price = objectInput.readDouble();
		security_des = objectInput.readUTF();
		parent_comp_name = objectInput.readUTF();
		security_class = objectInput.readInt();
		volatility_30d = objectInput.readDouble();
		volatility_90d = objectInput.readDouble();
		volatility_180d = objectInput.readDouble();
		volatility_360d = objectInput.readDouble();
		currency = objectInput.readUTF();
		country = objectInput.readLong();
		country_of_risk = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(assetId);

		if (security_ticker == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(security_ticker);
		}

		if (id_cusip == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(id_cusip);
		}

		if (id_isin == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(id_isin);
		}

		if (id_bb_global == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(id_bb_global);
		}

		objectOutput.writeLong(id_bb_sec_num_src);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeDouble(chg_pct_mtd);
		objectOutput.writeDouble(chg_pct_5d);
		objectOutput.writeDouble(chg_pct_1m);
		objectOutput.writeDouble(chg_pct_3m);
		objectOutput.writeDouble(chg_pct_6m);
		objectOutput.writeDouble(chg_pct_ytd);
		objectOutput.writeDouble(chg_pct_high_52week);
		objectOutput.writeDouble(chg_pct_low_52week);
		objectOutput.writeDouble(chg_pct_1yr);
		objectOutput.writeDouble(chg_trr_5yr);
		objectOutput.writeDouble(current_price);
		objectOutput.writeDouble(last_price);
		objectOutput.writeDouble(bid_price);
		objectOutput.writeDouble(ask_price);

		if (security_des == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(security_des);
		}

		if (parent_comp_name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(parent_comp_name);
		}

		objectOutput.writeInt(security_class);
		objectOutput.writeDouble(volatility_30d);
		objectOutput.writeDouble(volatility_90d);
		objectOutput.writeDouble(volatility_180d);
		objectOutput.writeDouble(volatility_360d);

		if (currency == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(currency);
		}

		objectOutput.writeLong(country);
		objectOutput.writeLong(country_of_risk);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}
	}

	public long assetId;
	public String security_ticker;
	public String id_cusip;
	public String id_isin;
	public String id_bb_global;
	public long id_bb_sec_num_src;
	public String name;
	public double chg_pct_mtd;
	public double chg_pct_5d;
	public double chg_pct_1m;
	public double chg_pct_3m;
	public double chg_pct_6m;
	public double chg_pct_ytd;
	public double chg_pct_high_52week;
	public double chg_pct_low_52week;
	public double chg_pct_1yr;
	public double chg_trr_5yr;
	public double current_price;
	public double last_price;
	public double bid_price;
	public double ask_price;
	public String security_des;
	public String parent_comp_name;
	public int security_class;
	public double volatility_30d;
	public double volatility_90d;
	public double volatility_180d;
	public double volatility_360d;
	public String currency;
	public long country;
	public long country_of_risk;
	public long createDate;
	public long modifiedDate;
	public long companyId;
	public long userId;
	public String userName;
}