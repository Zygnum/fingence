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
 * This class is used by SOAP remote services, specifically {@link com.fingence.slayer.service.http.CurrencyServiceSoap}.
 *
 * @author Ahmed Hasan
 * @see com.fingence.slayer.service.http.CurrencyServiceSoap
 * @generated
 */
public class CurrencySoap implements Serializable {
	public static CurrencySoap toSoapModel(Currency model) {
		CurrencySoap soapModel = new CurrencySoap();

		soapModel.setCurrencyId(model.getCurrencyId());
		soapModel.setCurrencyCode(model.getCurrencyCode());
		soapModel.setCurrencyDesc(model.getCurrencyDesc());
		soapModel.setConversion(model.getConversion());
		soapModel.setCurrencySymbol(model.getCurrencySymbol());

		return soapModel;
	}

	public static CurrencySoap[] toSoapModels(Currency[] models) {
		CurrencySoap[] soapModels = new CurrencySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CurrencySoap[][] toSoapModels(Currency[][] models) {
		CurrencySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CurrencySoap[models.length][models[0].length];
		}
		else {
			soapModels = new CurrencySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CurrencySoap[] toSoapModels(List<Currency> models) {
		List<CurrencySoap> soapModels = new ArrayList<CurrencySoap>(models.size());

		for (Currency model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CurrencySoap[soapModels.size()]);
	}

	public CurrencySoap() {
	}

	public long getPrimaryKey() {
		return _currencyId;
	}

	public void setPrimaryKey(long pk) {
		setCurrencyId(pk);
	}

	public long getCurrencyId() {
		return _currencyId;
	}

	public void setCurrencyId(long currencyId) {
		_currencyId = currencyId;
	}

	public String getCurrencyCode() {
		return _currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		_currencyCode = currencyCode;
	}

	public String getCurrencyDesc() {
		return _currencyDesc;
	}

	public void setCurrencyDesc(String currencyDesc) {
		_currencyDesc = currencyDesc;
	}

	public double getConversion() {
		return _conversion;
	}

	public void setConversion(double conversion) {
		_conversion = conversion;
	}

	public String getCurrencySymbol() {
		return _currencySymbol;
	}

	public void setCurrencySymbol(String currencySymbol) {
		_currencySymbol = currencySymbol;
	}

	private long _currencyId;
	private String _currencyCode;
	private String _currencyDesc;
	private double _conversion;
	private String _currencySymbol;
}