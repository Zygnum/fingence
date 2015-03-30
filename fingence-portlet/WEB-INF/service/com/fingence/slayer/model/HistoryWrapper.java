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
 * This class is a wrapper for {@link History}.
 * </p>
 *
 * @author Ahmed Hasan
 * @see History
 * @generated
 */
public class HistoryWrapper implements History, ModelWrapper<History> {
	public HistoryWrapper(History history) {
		_history = history;
	}

	@Override
	public Class<?> getModelClass() {
		return History.class;
	}

	@Override
	public String getModelClassName() {
		return History.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("recId", getRecId());
		attributes.put("assetId", getAssetId());
		attributes.put("logDate", getLogDate());
		attributes.put("value", getValue());
		attributes.put("type", getType());
		attributes.put("principal", getPrincipal());

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

		Date logDate = (Date)attributes.get("logDate");

		if (logDate != null) {
			setLogDate(logDate);
		}

		Double value = (Double)attributes.get("value");

		if (value != null) {
			setValue(value);
		}

		Integer type = (Integer)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		Double principal = (Double)attributes.get("principal");

		if (principal != null) {
			setPrincipal(principal);
		}
	}

	/**
	* Returns the primary key of this history.
	*
	* @return the primary key of this history
	*/
	@Override
	public long getPrimaryKey() {
		return _history.getPrimaryKey();
	}

	/**
	* Sets the primary key of this history.
	*
	* @param primaryKey the primary key of this history
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_history.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the rec ID of this history.
	*
	* @return the rec ID of this history
	*/
	@Override
	public long getRecId() {
		return _history.getRecId();
	}

	/**
	* Sets the rec ID of this history.
	*
	* @param recId the rec ID of this history
	*/
	@Override
	public void setRecId(long recId) {
		_history.setRecId(recId);
	}

	/**
	* Returns the asset ID of this history.
	*
	* @return the asset ID of this history
	*/
	@Override
	public long getAssetId() {
		return _history.getAssetId();
	}

	/**
	* Sets the asset ID of this history.
	*
	* @param assetId the asset ID of this history
	*/
	@Override
	public void setAssetId(long assetId) {
		_history.setAssetId(assetId);
	}

	/**
	* Returns the log date of this history.
	*
	* @return the log date of this history
	*/
	@Override
	public java.util.Date getLogDate() {
		return _history.getLogDate();
	}

	/**
	* Sets the log date of this history.
	*
	* @param logDate the log date of this history
	*/
	@Override
	public void setLogDate(java.util.Date logDate) {
		_history.setLogDate(logDate);
	}

	/**
	* Returns the value of this history.
	*
	* @return the value of this history
	*/
	@Override
	public double getValue() {
		return _history.getValue();
	}

	/**
	* Sets the value of this history.
	*
	* @param value the value of this history
	*/
	@Override
	public void setValue(double value) {
		_history.setValue(value);
	}

	/**
	* Returns the type of this history.
	*
	* @return the type of this history
	*/
	@Override
	public int getType() {
		return _history.getType();
	}

	/**
	* Sets the type of this history.
	*
	* @param type the type of this history
	*/
	@Override
	public void setType(int type) {
		_history.setType(type);
	}

	/**
	* Returns the principal of this history.
	*
	* @return the principal of this history
	*/
	@Override
	public double getPrincipal() {
		return _history.getPrincipal();
	}

	/**
	* Sets the principal of this history.
	*
	* @param principal the principal of this history
	*/
	@Override
	public void setPrincipal(double principal) {
		_history.setPrincipal(principal);
	}

	@Override
	public boolean isNew() {
		return _history.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_history.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _history.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_history.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _history.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _history.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_history.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _history.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_history.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_history.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_history.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new HistoryWrapper((History)_history.clone());
	}

	@Override
	public int compareTo(History history) {
		return _history.compareTo(history);
	}

	@Override
	public int hashCode() {
		return _history.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<History> toCacheModel() {
		return _history.toCacheModel();
	}

	@Override
	public History toEscapedModel() {
		return new HistoryWrapper(_history.toEscapedModel());
	}

	@Override
	public History toUnescapedModel() {
		return new HistoryWrapper(_history.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _history.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _history.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_history.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof HistoryWrapper)) {
			return false;
		}

		HistoryWrapper historyWrapper = (HistoryWrapper)obj;

		if (Validator.equals(_history, historyWrapper._history)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public History getWrappedHistory() {
		return _history;
	}

	@Override
	public History getWrappedModel() {
		return _history;
	}

	@Override
	public void resetOriginalValues() {
		_history.resetOriginalValues();
	}

	private History _history;
}