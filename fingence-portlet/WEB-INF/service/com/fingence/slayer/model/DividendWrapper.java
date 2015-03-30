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
 * This class is a wrapper for {@link Dividend}.
 * </p>
 *
 * @author Ahmed Hasan
 * @see Dividend
 * @generated
 */
public class DividendWrapper implements Dividend, ModelWrapper<Dividend> {
	public DividendWrapper(Dividend dividend) {
		_dividend = dividend;
	}

	@Override
	public Class<?> getModelClass() {
		return Dividend.class;
	}

	@Override
	public String getModelClassName() {
		return Dividend.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("recId", getRecId());
		attributes.put("assetId", getAssetId());
		attributes.put("declaredDate", getDeclaredDate());
		attributes.put("exDate", getExDate());
		attributes.put("recordDate", getRecordDate());
		attributes.put("payableDate", getPayableDate());
		attributes.put("amount", getAmount());
		attributes.put("frequency", getFrequency());
		attributes.put("type", getType());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long recId = (Long)attributes.get("recId");

		if (recId != null) {
			setRecId(recId);
		}

		Long assetId = (Long)attributes.get("assetId");

		if (assetId != null) {
			setAssetId(assetId);
		}

		Date declaredDate = (Date)attributes.get("declaredDate");

		if (declaredDate != null) {
			setDeclaredDate(declaredDate);
		}

		Date exDate = (Date)attributes.get("exDate");

		if (exDate != null) {
			setExDate(exDate);
		}

		Date recordDate = (Date)attributes.get("recordDate");

		if (recordDate != null) {
			setRecordDate(recordDate);
		}

		Date payableDate = (Date)attributes.get("payableDate");

		if (payableDate != null) {
			setPayableDate(payableDate);
		}

		Double amount = (Double)attributes.get("amount");

		if (amount != null) {
			setAmount(amount);
		}

		String frequency = (String)attributes.get("frequency");

		if (frequency != null) {
			setFrequency(frequency);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}
	}

	/**
	* Returns the primary key of this dividend.
	*
	* @return the primary key of this dividend
	*/
	@Override
	public long getPrimaryKey() {
		return _dividend.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dividend.
	*
	* @param primaryKey the primary key of this dividend
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dividend.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the rec ID of this dividend.
	*
	* @return the rec ID of this dividend
	*/
	@Override
	public long getRecId() {
		return _dividend.getRecId();
	}

	/**
	* Sets the rec ID of this dividend.
	*
	* @param recId the rec ID of this dividend
	*/
	@Override
	public void setRecId(long recId) {
		_dividend.setRecId(recId);
	}

	/**
	* Returns the asset ID of this dividend.
	*
	* @return the asset ID of this dividend
	*/
	@Override
	public long getAssetId() {
		return _dividend.getAssetId();
	}

	/**
	* Sets the asset ID of this dividend.
	*
	* @param assetId the asset ID of this dividend
	*/
	@Override
	public void setAssetId(long assetId) {
		_dividend.setAssetId(assetId);
	}

	/**
	* Returns the declared date of this dividend.
	*
	* @return the declared date of this dividend
	*/
	@Override
	public java.util.Date getDeclaredDate() {
		return _dividend.getDeclaredDate();
	}

	/**
	* Sets the declared date of this dividend.
	*
	* @param declaredDate the declared date of this dividend
	*/
	@Override
	public void setDeclaredDate(java.util.Date declaredDate) {
		_dividend.setDeclaredDate(declaredDate);
	}

	/**
	* Returns the ex date of this dividend.
	*
	* @return the ex date of this dividend
	*/
	@Override
	public java.util.Date getExDate() {
		return _dividend.getExDate();
	}

	/**
	* Sets the ex date of this dividend.
	*
	* @param exDate the ex date of this dividend
	*/
	@Override
	public void setExDate(java.util.Date exDate) {
		_dividend.setExDate(exDate);
	}

	/**
	* Returns the record date of this dividend.
	*
	* @return the record date of this dividend
	*/
	@Override
	public java.util.Date getRecordDate() {
		return _dividend.getRecordDate();
	}

	/**
	* Sets the record date of this dividend.
	*
	* @param recordDate the record date of this dividend
	*/
	@Override
	public void setRecordDate(java.util.Date recordDate) {
		_dividend.setRecordDate(recordDate);
	}

	/**
	* Returns the payable date of this dividend.
	*
	* @return the payable date of this dividend
	*/
	@Override
	public java.util.Date getPayableDate() {
		return _dividend.getPayableDate();
	}

	/**
	* Sets the payable date of this dividend.
	*
	* @param payableDate the payable date of this dividend
	*/
	@Override
	public void setPayableDate(java.util.Date payableDate) {
		_dividend.setPayableDate(payableDate);
	}

	/**
	* Returns the amount of this dividend.
	*
	* @return the amount of this dividend
	*/
	@Override
	public double getAmount() {
		return _dividend.getAmount();
	}

	/**
	* Sets the amount of this dividend.
	*
	* @param amount the amount of this dividend
	*/
	@Override
	public void setAmount(double amount) {
		_dividend.setAmount(amount);
	}

	/**
	* Returns the frequency of this dividend.
	*
	* @return the frequency of this dividend
	*/
	@Override
	public java.lang.String getFrequency() {
		return _dividend.getFrequency();
	}

	/**
	* Sets the frequency of this dividend.
	*
	* @param frequency the frequency of this dividend
	*/
	@Override
	public void setFrequency(java.lang.String frequency) {
		_dividend.setFrequency(frequency);
	}

	/**
	* Returns the type of this dividend.
	*
	* @return the type of this dividend
	*/
	@Override
	public java.lang.String getType() {
		return _dividend.getType();
	}

	/**
	* Sets the type of this dividend.
	*
	* @param type the type of this dividend
	*/
	@Override
	public void setType(java.lang.String type) {
		_dividend.setType(type);
	}

	@Override
	public boolean isNew() {
		return _dividend.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dividend.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dividend.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dividend.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dividend.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dividend.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dividend.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dividend.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dividend.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dividend.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dividend.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DividendWrapper((Dividend)_dividend.clone());
	}

	@Override
	public int compareTo(Dividend dividend) {
		return _dividend.compareTo(dividend);
	}

	@Override
	public int hashCode() {
		return _dividend.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<Dividend> toCacheModel() {
		return _dividend.toCacheModel();
	}

	@Override
	public Dividend toEscapedModel() {
		return new DividendWrapper(_dividend.toEscapedModel());
	}

	@Override
	public Dividend toUnescapedModel() {
		return new DividendWrapper(_dividend.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dividend.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dividend.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dividend.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DividendWrapper)) {
			return false;
		}

		DividendWrapper dividendWrapper = (DividendWrapper)obj;

		if (Validator.equals(_dividend, dividendWrapper._dividend)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Dividend getWrappedDividend() {
		return _dividend;
	}

	@Override
	public Dividend getWrappedModel() {
		return _dividend;
	}

	@Override
	public void resetOriginalValues() {
		_dividend.resetOriginalValues();
	}

	private Dividend _dividend;
}