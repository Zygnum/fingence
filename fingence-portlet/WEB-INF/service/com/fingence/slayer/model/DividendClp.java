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

import com.fingence.slayer.service.ClpSerializer;
import com.fingence.slayer.service.DividendLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ahmed Hasan
 */
public class DividendClp extends BaseModelImpl<Dividend> implements Dividend {
	public DividendClp() {
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
	public long getPrimaryKey() {
		return _recId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setRecId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _recId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getRecId() {
		return _recId;
	}

	@Override
	public void setRecId(long recId) {
		_recId = recId;

		if (_dividendRemoteModel != null) {
			try {
				Class<?> clazz = _dividendRemoteModel.getClass();

				Method method = clazz.getMethod("setRecId", long.class);

				method.invoke(_dividendRemoteModel, recId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAssetId() {
		return _assetId;
	}

	@Override
	public void setAssetId(long assetId) {
		_assetId = assetId;

		if (_dividendRemoteModel != null) {
			try {
				Class<?> clazz = _dividendRemoteModel.getClass();

				Method method = clazz.getMethod("setAssetId", long.class);

				method.invoke(_dividendRemoteModel, assetId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDeclaredDate() {
		return _declaredDate;
	}

	@Override
	public void setDeclaredDate(Date declaredDate) {
		_declaredDate = declaredDate;

		if (_dividendRemoteModel != null) {
			try {
				Class<?> clazz = _dividendRemoteModel.getClass();

				Method method = clazz.getMethod("setDeclaredDate", Date.class);

				method.invoke(_dividendRemoteModel, declaredDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getExDate() {
		return _exDate;
	}

	@Override
	public void setExDate(Date exDate) {
		_exDate = exDate;

		if (_dividendRemoteModel != null) {
			try {
				Class<?> clazz = _dividendRemoteModel.getClass();

				Method method = clazz.getMethod("setExDate", Date.class);

				method.invoke(_dividendRemoteModel, exDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getRecordDate() {
		return _recordDate;
	}

	@Override
	public void setRecordDate(Date recordDate) {
		_recordDate = recordDate;

		if (_dividendRemoteModel != null) {
			try {
				Class<?> clazz = _dividendRemoteModel.getClass();

				Method method = clazz.getMethod("setRecordDate", Date.class);

				method.invoke(_dividendRemoteModel, recordDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getPayableDate() {
		return _payableDate;
	}

	@Override
	public void setPayableDate(Date payableDate) {
		_payableDate = payableDate;

		if (_dividendRemoteModel != null) {
			try {
				Class<?> clazz = _dividendRemoteModel.getClass();

				Method method = clazz.getMethod("setPayableDate", Date.class);

				method.invoke(_dividendRemoteModel, payableDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getAmount() {
		return _amount;
	}

	@Override
	public void setAmount(double amount) {
		_amount = amount;

		if (_dividendRemoteModel != null) {
			try {
				Class<?> clazz = _dividendRemoteModel.getClass();

				Method method = clazz.getMethod("setAmount", double.class);

				method.invoke(_dividendRemoteModel, amount);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFrequency() {
		return _frequency;
	}

	@Override
	public void setFrequency(String frequency) {
		_frequency = frequency;

		if (_dividendRemoteModel != null) {
			try {
				Class<?> clazz = _dividendRemoteModel.getClass();

				Method method = clazz.getMethod("setFrequency", String.class);

				method.invoke(_dividendRemoteModel, frequency);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getType() {
		return _type;
	}

	@Override
	public void setType(String type) {
		_type = type;

		if (_dividendRemoteModel != null) {
			try {
				Class<?> clazz = _dividendRemoteModel.getClass();

				Method method = clazz.getMethod("setType", String.class);

				method.invoke(_dividendRemoteModel, type);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDividendRemoteModel() {
		return _dividendRemoteModel;
	}

	public void setDividendRemoteModel(BaseModel<?> dividendRemoteModel) {
		_dividendRemoteModel = dividendRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _dividendRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_dividendRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DividendLocalServiceUtil.addDividend(this);
		}
		else {
			DividendLocalServiceUtil.updateDividend(this);
		}
	}

	@Override
	public Dividend toEscapedModel() {
		return (Dividend)ProxyUtil.newProxyInstance(Dividend.class.getClassLoader(),
			new Class[] { Dividend.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DividendClp clone = new DividendClp();

		clone.setRecId(getRecId());
		clone.setAssetId(getAssetId());
		clone.setDeclaredDate(getDeclaredDate());
		clone.setExDate(getExDate());
		clone.setRecordDate(getRecordDate());
		clone.setPayableDate(getPayableDate());
		clone.setAmount(getAmount());
		clone.setFrequency(getFrequency());
		clone.setType(getType());

		return clone;
	}

	@Override
	public int compareTo(Dividend dividend) {
		long primaryKey = dividend.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DividendClp)) {
			return false;
		}

		DividendClp dividend = (DividendClp)obj;

		long primaryKey = dividend.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{recId=");
		sb.append(getRecId());
		sb.append(", assetId=");
		sb.append(getAssetId());
		sb.append(", declaredDate=");
		sb.append(getDeclaredDate());
		sb.append(", exDate=");
		sb.append(getExDate());
		sb.append(", recordDate=");
		sb.append(getRecordDate());
		sb.append(", payableDate=");
		sb.append(getPayableDate());
		sb.append(", amount=");
		sb.append(getAmount());
		sb.append(", frequency=");
		sb.append(getFrequency());
		sb.append(", type=");
		sb.append(getType());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.fingence.slayer.model.Dividend");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>recId</column-name><column-value><![CDATA[");
		sb.append(getRecId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assetId</column-name><column-value><![CDATA[");
		sb.append(getAssetId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>declaredDate</column-name><column-value><![CDATA[");
		sb.append(getDeclaredDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>exDate</column-name><column-value><![CDATA[");
		sb.append(getExDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>recordDate</column-name><column-value><![CDATA[");
		sb.append(getRecordDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>payableDate</column-name><column-value><![CDATA[");
		sb.append(getPayableDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>amount</column-name><column-value><![CDATA[");
		sb.append(getAmount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>frequency</column-name><column-value><![CDATA[");
		sb.append(getFrequency());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _dividendRemoteModel;
}