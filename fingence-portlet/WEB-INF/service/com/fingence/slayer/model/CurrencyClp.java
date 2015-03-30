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
import com.fingence.slayer.service.CurrencyLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ahmed Hasan
 */
public class CurrencyClp extends BaseModelImpl<Currency> implements Currency {
	public CurrencyClp() {
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
	public long getPrimaryKey() {
		return _currencyId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCurrencyId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _currencyId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getCurrencyId() {
		return _currencyId;
	}

	@Override
	public void setCurrencyId(long currencyId) {
		_currencyId = currencyId;

		if (_currencyRemoteModel != null) {
			try {
				Class<?> clazz = _currencyRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrencyId", long.class);

				method.invoke(_currencyRemoteModel, currencyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCurrencyCode() {
		return _currencyCode;
	}

	@Override
	public void setCurrencyCode(String currencyCode) {
		_currencyCode = currencyCode;

		if (_currencyRemoteModel != null) {
			try {
				Class<?> clazz = _currencyRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrencyCode", String.class);

				method.invoke(_currencyRemoteModel, currencyCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCurrencyDesc() {
		return _currencyDesc;
	}

	@Override
	public void setCurrencyDesc(String currencyDesc) {
		_currencyDesc = currencyDesc;

		if (_currencyRemoteModel != null) {
			try {
				Class<?> clazz = _currencyRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrencyDesc", String.class);

				method.invoke(_currencyRemoteModel, currencyDesc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getConversion() {
		return _conversion;
	}

	@Override
	public void setConversion(double conversion) {
		_conversion = conversion;

		if (_currencyRemoteModel != null) {
			try {
				Class<?> clazz = _currencyRemoteModel.getClass();

				Method method = clazz.getMethod("setConversion", double.class);

				method.invoke(_currencyRemoteModel, conversion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCurrencySymbol() {
		return _currencySymbol;
	}

	@Override
	public void setCurrencySymbol(String currencySymbol) {
		_currencySymbol = currencySymbol;

		if (_currencyRemoteModel != null) {
			try {
				Class<?> clazz = _currencyRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrencySymbol",
						String.class);

				method.invoke(_currencyRemoteModel, currencySymbol);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCurrencyRemoteModel() {
		return _currencyRemoteModel;
	}

	public void setCurrencyRemoteModel(BaseModel<?> currencyRemoteModel) {
		_currencyRemoteModel = currencyRemoteModel;
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

		Class<?> remoteModelClass = _currencyRemoteModel.getClass();

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

		Object returnValue = method.invoke(_currencyRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CurrencyLocalServiceUtil.addCurrency(this);
		}
		else {
			CurrencyLocalServiceUtil.updateCurrency(this);
		}
	}

	@Override
	public Currency toEscapedModel() {
		return (Currency)ProxyUtil.newProxyInstance(Currency.class.getClassLoader(),
			new Class[] { Currency.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CurrencyClp clone = new CurrencyClp();

		clone.setCurrencyId(getCurrencyId());
		clone.setCurrencyCode(getCurrencyCode());
		clone.setCurrencyDesc(getCurrencyDesc());
		clone.setConversion(getConversion());
		clone.setCurrencySymbol(getCurrencySymbol());

		return clone;
	}

	@Override
	public int compareTo(Currency currency) {
		int value = 0;

		value = getCurrencyCode().compareTo(currency.getCurrencyCode());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CurrencyClp)) {
			return false;
		}

		CurrencyClp currency = (CurrencyClp)obj;

		long primaryKey = currency.getPrimaryKey();

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
		StringBundler sb = new StringBundler(11);

		sb.append("{currencyId=");
		sb.append(getCurrencyId());
		sb.append(", currencyCode=");
		sb.append(getCurrencyCode());
		sb.append(", currencyDesc=");
		sb.append(getCurrencyDesc());
		sb.append(", conversion=");
		sb.append(getConversion());
		sb.append(", currencySymbol=");
		sb.append(getCurrencySymbol());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.fingence.slayer.model.Currency");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>currencyId</column-name><column-value><![CDATA[");
		sb.append(getCurrencyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currencyCode</column-name><column-value><![CDATA[");
		sb.append(getCurrencyCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currencyDesc</column-name><column-value><![CDATA[");
		sb.append(getCurrencyDesc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>conversion</column-name><column-value><![CDATA[");
		sb.append(getConversion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currencySymbol</column-name><column-value><![CDATA[");
		sb.append(getCurrencySymbol());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _currencyId;
	private String _currencyCode;
	private String _currencyDesc;
	private double _conversion;
	private String _currencySymbol;
	private BaseModel<?> _currencyRemoteModel;
}