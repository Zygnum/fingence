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

import com.fingence.slayer.model.MutualFund;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing MutualFund in entity cache.
 *
 * @author Ahmed Hasan
 * @see MutualFund
 * @generated
 */
public class MutualFundCacheModel implements CacheModel<MutualFund>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{assetId=");
		sb.append(assetId);
		sb.append(", fund_total_assets=");
		sb.append(fund_total_assets);
		sb.append(", fund_asset_class_focus=");
		sb.append(fund_asset_class_focus);
		sb.append(", fund_geo_focus=");
		sb.append(fund_geo_focus);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MutualFund toEntityModel() {
		MutualFundImpl mutualFundImpl = new MutualFundImpl();

		mutualFundImpl.setAssetId(assetId);
		mutualFundImpl.setFund_total_assets(fund_total_assets);

		if (fund_asset_class_focus == null) {
			mutualFundImpl.setFund_asset_class_focus(StringPool.BLANK);
		}
		else {
			mutualFundImpl.setFund_asset_class_focus(fund_asset_class_focus);
		}

		if (fund_geo_focus == null) {
			mutualFundImpl.setFund_geo_focus(StringPool.BLANK);
		}
		else {
			mutualFundImpl.setFund_geo_focus(fund_geo_focus);
		}

		mutualFundImpl.resetOriginalValues();

		return mutualFundImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		assetId = objectInput.readLong();
		fund_total_assets = objectInput.readDouble();
		fund_asset_class_focus = objectInput.readUTF();
		fund_geo_focus = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(assetId);
		objectOutput.writeDouble(fund_total_assets);

		if (fund_asset_class_focus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fund_asset_class_focus);
		}

		if (fund_geo_focus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fund_geo_focus);
		}
	}

	public long assetId;
	public double fund_total_assets;
	public String fund_asset_class_focus;
	public String fund_geo_focus;
}