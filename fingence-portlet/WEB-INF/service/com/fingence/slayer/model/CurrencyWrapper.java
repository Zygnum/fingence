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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Currency}.
 * </p>
 *
 * @author Ahmed Hasan
 * @see Currency
 * @generated
 */
public class CurrencyWrapper implements Currency, ModelWrapper<Currency> {
	public CurrencyWrapper(Currency currency) {
		_currency = currency;
	}

	@Override
	public Class<?> getModelClass() {
		return Currency.class;
	}

	@Override
	public String getModelClassName() {
		return Currency.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("currencyId", getCurrencyId());
		attributes.put("currencyCode", getCurrencyCode());
		attributes.put("currencyDesc", getCurrencyDesc());
		attributes.put("conversion", getConversion());
		attributes.put("currencySymbol", getCurrencySymbol());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long currencyId = (Long)attributes.get("currencyId");

		if (currencyId != null) {
			setCurrencyId(currencyId);
		}

		String currencyCode = (String)attributes.get("currencyCode");

		if (currencyCode != null) {
			setCurrencyCode(currencyCode);
		}

		String currencyDesc = (String)attributes.get("currencyDesc");

		if (currencyDesc != null) {
			setCurrencyDesc(currencyDesc);
		}

		Double conversion = (Double)attributes.get("conversion");

		if (conversion != null) {
			setConversion(conversion);
		}

		String currencySymbol = (String)attributes.get("currencySymbol");

		if (currencySymbol != null) {
			setCurrencySymbol(currencySymbol);
		}
	}

	/**
	* Returns the primary key of this currency.
	*
	* @return the primary key of this currency
	*/
	@Override
	public long getPrimaryKey() {
		return _currency.getPrimaryKey();
	}

	/**
	* Sets the primary key of this currency.
	*
	* @param primaryKey the primary key of this currency
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_currency.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the currency ID of this currency.
	*
	* @return the currency ID of this currency
	*/
	@Override
	public long getCurrencyId() {
		return _currency.getCurrencyId();
	}

	/**
	* Sets the currency ID of this currency.
	*
	* @param currencyId the currency ID of this currency
	*/
	@Override
	public void setCurrencyId(long currencyId) {
		_currency.setCurrencyId(currencyId);
	}

	/**
	* Returns the currency code of this currency.
	*
	* @return the currency code of this currency
	*/
	@Override
	public java.lang.String getCurrencyCode() {
		return _currency.getCurrencyCode();
	}

	/**
	* Sets the currency code of this currency.
	*
	* @param currencyCode the currency code of this currency
	*/
	@Override
	public void setCurrencyCode(java.lang.String currencyCode) {
		_currency.setCurrencyCode(currencyCode);
	}

	/**
	* Returns the currency desc of this currency.
	*
	* @return the currency desc of this currency
	*/
	@Override
	public java.lang.String getCurrencyDesc() {
		return _currency.getCurrencyDesc();
	}

	/**
	* Sets the currency desc of this currency.
	*
	* @param currencyDesc the currency desc of this currency
	*/
	@Override
	public void setCurrencyDesc(java.lang.String currencyDesc) {
		_currency.setCurrencyDesc(currencyDesc);
	}

	/**
	* Returns the conversion of this currency.
	*
	* @return the conversion of this currency
	*/
	@Override
	public double getConversion() {
		return _currency.getConversion();
	}

	/**
	* Sets the conversion of this currency.
	*
	* @param conversion the conversion of this currency
	*/
	@Override
	public void setConversion(double conversion) {
		_currency.setConversion(conversion);
	}

	/**
	* Returns the currency symbol of this currency.
	*
	* @return the currency symbol of this currency
	*/
	@Override
	public java.lang.String getCurrencySymbol() {
		return _currency.getCurrencySymbol();
	}

	/**
	* Sets the currency symbol of this currency.
	*
	* @param currencySymbol the currency symbol of this currency
	*/
	@Override
	public void setCurrencySymbol(java.lang.String currencySymbol) {
		_currency.setCurrencySymbol(currencySymbol);
	}

	@Override
	public boolean isNew() {
		return _currency.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_currency.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _currency.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_currency.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _currency.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _currency.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_currency.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _currency.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_currency.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_currency.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_currency.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CurrencyWrapper((Currency)_currency.clone());
	}

	@Override
	public int compareTo(Currency currency) {
		return _currency.compareTo(currency);
	}

	@Override
	public int hashCode() {
		return _currency.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<Currency> toCacheModel() {
		return _currency.toCacheModel();
	}

	@Override
	public Currency toEscapedModel() {
		return new CurrencyWrapper(_currency.toEscapedModel());
	}

	@Override
	public Currency toUnescapedModel() {
		return new CurrencyWrapper(_currency.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _currency.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _currency.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_currency.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CurrencyWrapper)) {
			return false;
		}

		CurrencyWrapper currencyWrapper = (CurrencyWrapper)obj;

		if (Validator.equals(_currency, currencyWrapper._currency)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Currency getWrappedCurrency() {
		return _currency;
	}

	@Override
	public Currency getWrappedModel() {
		return _currency;
	}

	@Override
	public void resetOriginalValues() {
		_currency.resetOriginalValues();
	}

	private Currency _currency;
}