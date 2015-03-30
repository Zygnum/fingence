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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.fingence.slayer.service.http.MutualFundServiceSoap}.
 *
 * @author Ahmed Hasan
 * @see com.fingence.slayer.service.http.MutualFundServiceSoap
 * @generated
 */
public class MutualFundSoap implements Serializable {
	public static MutualFundSoap toSoapModel(MutualFund model) {
		MutualFundSoap soapModel = new MutualFundSoap();

		soapModel.setAssetId(model.getAssetId());
		soapModel.setFund_total_assets(model.getFund_total_assets());
		soapModel.setFund_asset_class_focus(model.getFund_asset_class_focus());
		soapModel.setFund_geo_focus(model.getFund_geo_focus());

		return soapModel;
	}

	public static MutualFundSoap[] toSoapModels(MutualFund[] models) {
		MutualFundSoap[] soapModels = new MutualFundSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MutualFundSoap[][] toSoapModels(MutualFund[][] models) {
		MutualFundSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MutualFundSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MutualFundSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MutualFundSoap[] toSoapModels(List<MutualFund> models) {
		List<MutualFundSoap> soapModels = new ArrayList<MutualFundSoap>(models.size());

		for (MutualFund model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MutualFundSoap[soapModels.size()]);
	}

	public MutualFundSoap() {
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

	public double getFund_total_assets() {
		return _fund_total_assets;
	}

	public void setFund_total_assets(double fund_total_assets) {
		_fund_total_assets = fund_total_assets;
	}

	public String getFund_asset_class_focus() {
		return _fund_asset_class_focus;
	}

	public void setFund_asset_class_focus(String fund_asset_class_focus) {
		_fund_asset_class_focus = fund_asset_class_focus;
	}

	public String getFund_geo_focus() {
		return _fund_geo_focus;
	}

	public void setFund_geo_focus(String fund_geo_focus) {
		_fund_geo_focus = fund_geo_focus;
	}

	private long _assetId;
	private double _fund_total_assets;
	private String _fund_asset_class_focus;
	private String _fund_geo_focus;
}