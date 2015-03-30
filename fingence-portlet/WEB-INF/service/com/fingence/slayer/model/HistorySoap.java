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
 * This class is used by SOAP remote services, specifically {@link com.fingence.slayer.service.http.HistoryServiceSoap}.
 *
 * @author Ahmed Hasan
 * @see com.fingence.slayer.service.http.HistoryServiceSoap
 * @generated
 */
public class HistorySoap implements Serializable {
	public static HistorySoap toSoapModel(History model) {
		HistorySoap soapModel = new HistorySoap();

		soapModel.setRecId(model.getRecId());
		soapModel.setAssetId(model.getAssetId());
		soapModel.setLogDate(model.getLogDate());
		soapModel.setValue(model.getValue());
		soapModel.setType(model.getType());
		soapModel.setPrincipal(model.getPrincipal());

		return soapModel;
	}

	public static HistorySoap[] toSoapModels(History[] models) {
		HistorySoap[] soapModels = new HistorySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static HistorySoap[][] toSoapModels(History[][] models) {
		HistorySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new HistorySoap[models.length][models[0].length];
		}
		else {
			soapModels = new HistorySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static HistorySoap[] toSoapModels(List<History> models) {
		List<HistorySoap> soapModels = new ArrayList<HistorySoap>(models.size());

		for (History model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new HistorySoap[soapModels.size()]);
	}

	public HistorySoap() {
	}

	public long getPrimaryKey() {
		return _recId;
	}

	public void setPrimaryKey(long pk) {
		setRecId(pk);
	}

	public long getRecId() {
		return _recId;
	}

	public void setRecId(long recId) {
		_recId = recId;
	}

	public long getAssetId() {
		return _assetId;
	}

	public void setAssetId(long assetId) {
		_assetId = assetId;
	}

	public Date getLogDate() {
		return _logDate;
	}

	public void setLogDate(Date logDate) {
		_logDate = logDate;
	}

	public double getValue() {
		return _value;
	}

	public void setValue(double value) {
		_value = value;
	}

	public int getType() {
		return _type;
	}

	public void setType(int type) {
		_type = type;
	}

	public double getPrincipal() {
		return _principal;
	}

	public void setPrincipal(double principal) {
		_principal = principal;
	}

	private long _recId;
	private long _assetId;
	private Date _logDate;
	private double _value;
	private int _type;
	private double _principal;
}