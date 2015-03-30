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
 * This class is used by SOAP remote services, specifically {@link com.fingence.slayer.service.http.DividendServiceSoap}.
 *
 * @author Ahmed Hasan
 * @see com.fingence.slayer.service.http.DividendServiceSoap
 * @generated
 */
public class DividendSoap implements Serializable {
	public static DividendSoap toSoapModel(Dividend model) {
		DividendSoap soapModel = new DividendSoap();

		soapModel.setRecId(model.getRecId());
		soapModel.setAssetId(model.getAssetId());
		soapModel.setDeclaredDate(model.getDeclaredDate());
		soapModel.setExDate(model.getExDate());
		soapModel.setRecordDate(model.getRecordDate());
		soapModel.setPayableDate(model.getPayableDate());
		soapModel.setAmount(model.getAmount());
		soapModel.setFrequency(model.getFrequency());
		soapModel.setType(model.getType());

		return soapModel;
	}

	public static DividendSoap[] toSoapModels(Dividend[] models) {
		DividendSoap[] soapModels = new DividendSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DividendSoap[][] toSoapModels(Dividend[][] models) {
		DividendSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DividendSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DividendSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DividendSoap[] toSoapModels(List<Dividend> models) {
		List<DividendSoap> soapModels = new ArrayList<DividendSoap>(models.size());

		for (Dividend model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DividendSoap[soapModels.size()]);
	}

	public DividendSoap() {
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

	public Date getDeclaredDate() {
		return _declaredDate;
	}

	public void setDeclaredDate(Date declaredDate) {
		_declaredDate = declaredDate;
	}

	public Date getExDate() {
		return _exDate;
	}

	public void setExDate(Date exDate) {
		_exDate = exDate;
	}

	public Date getRecordDate() {
		return _recordDate;
	}

	public void setRecordDate(Date recordDate) {
		_recordDate = recordDate;
	}

	public Date getPayableDate() {
		return _payableDate;
	}

	public void setPayableDate(Date payableDate) {
		_payableDate = payableDate;
	}

	public double getAmount() {
		return _amount;
	}

	public void setAmount(double amount) {
		_amount = amount;
	}

	public String getFrequency() {
		return _frequency;
	}

	public void setFrequency(String frequency) {
		_frequency = frequency;
	}

	public String getType() {
		return _type;
	}

	public void setType(String type) {
		_type = type;
	}

	private long _recId;
	private long _assetId;
	private Date _declaredDate;
	private Date _exDate;
	private Date _recordDate;
	private Date _payableDate;
	private double _amount;
	private String _frequency;
	private String _type;
}