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
import com.fingence.slayer.service.HistoryLocalServiceUtil;

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
public class HistoryClp extends BaseModelImpl<History> implements History {
	public HistoryClp() {
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

	@Override
	public long getRecId() {
		return _recId;
	}

	@Override
	public void setRecId(long recId) {
		_recId = recId;

		if (_historyRemoteModel != null) {
			try {
				Class<?> clazz = _historyRemoteModel.getClass();

				Method method = clazz.getMethod("setRecId", long.class);

				method.invoke(_historyRemoteModel, recId);
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

		if (_historyRemoteModel != null) {
			try {
				Class<?> clazz = _historyRemoteModel.getClass();

				Method method = clazz.getMethod("setAssetId", long.class);

				method.invoke(_historyRemoteModel, assetId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getLogDate() {
		return _logDate;
	}

	@Override
	public void setLogDate(Date logDate) {
		_logDate = logDate;

		if (_historyRemoteModel != null) {
			try {
				Class<?> clazz = _historyRemoteModel.getClass();

				Method method = clazz.getMethod("setLogDate", Date.class);

				method.invoke(_historyRemoteModel, logDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getValue() {
		return _value;
	}

	@Override
	public void setValue(double value) {
		_value = value;

		if (_historyRemoteModel != null) {
			try {
				Class<?> clazz = _historyRemoteModel.getClass();

				Method method = clazz.getMethod("setValue", double.class);

				method.invoke(_historyRemoteModel, value);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getType() {
		return _type;
	}

	@Override
	public void setType(int type) {
		_type = type;

		if (_historyRemoteModel != null) {
			try {
				Class<?> clazz = _historyRemoteModel.getClass();

				Method method = clazz.getMethod("setType", int.class);

				method.invoke(_historyRemoteModel, type);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getPrincipal() {
		return _principal;
	}

	@Override
	public void setPrincipal(double principal) {
		_principal = principal;

		if (_historyRemoteModel != null) {
			try {
				Class<?> clazz = _historyRemoteModel.getClass();

				Method method = clazz.getMethod("setPrincipal", double.class);

				method.invoke(_historyRemoteModel, principal);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getHistoryRemoteModel() {
		return _historyRemoteModel;
	}

	public void setHistoryRemoteModel(BaseModel<?> historyRemoteModel) {
		_historyRemoteModel = historyRemoteModel;
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

		Class<?> remoteModelClass = _historyRemoteModel.getClass();

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

		Object returnValue = method.invoke(_historyRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			HistoryLocalServiceUtil.addHistory(this);
		}
		else {
			HistoryLocalServiceUtil.updateHistory(this);
		}
	}

	@Override
	public History toEscapedModel() {
		return (History)ProxyUtil.newProxyInstance(History.class.getClassLoader(),
			new Class[] { History.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		HistoryClp clone = new HistoryClp();

		clone.setRecId(getRecId());
		clone.setAssetId(getAssetId());
		clone.setLogDate(getLogDate());
		clone.setValue(getValue());
		clone.setType(getType());
		clone.setPrincipal(getPrincipal());

		return clone;
	}

	@Override
	public int compareTo(History history) {
		long primaryKey = history.getPrimaryKey();

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

		if (!(obj instanceof HistoryClp)) {
			return false;
		}

		HistoryClp history = (HistoryClp)obj;

		long primaryKey = history.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{recId=");
		sb.append(getRecId());
		sb.append(", assetId=");
		sb.append(getAssetId());
		sb.append(", logDate=");
		sb.append(getLogDate());
		sb.append(", value=");
		sb.append(getValue());
		sb.append(", type=");
		sb.append(getType());
		sb.append(", principal=");
		sb.append(getPrincipal());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.fingence.slayer.model.History");
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
			"<column><column-name>logDate</column-name><column-value><![CDATA[");
		sb.append(getLogDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>value</column-name><column-value><![CDATA[");
		sb.append(getValue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>principal</column-name><column-value><![CDATA[");
		sb.append(getPrincipal());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _recId;
	private long _assetId;
	private Date _logDate;
	private double _value;
	private int _type;
	private double _principal;
	private BaseModel<?> _historyRemoteModel;
}