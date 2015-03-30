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
import com.fingence.slayer.service.MutualFundLocalServiceUtil;

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
public class MutualFundClp extends BaseModelImpl<MutualFund>
	implements MutualFund {
	public MutualFundClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return MutualFund.class;
	}

	@Override
	public String getModelClassName() {
		return MutualFund.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _assetId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAssetId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _assetId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("assetId", getAssetId());
		attributes.put("fund_total_assets", getFund_total_assets());
		attributes.put("fund_asset_class_focus", getFund_asset_class_focus());
		attributes.put("fund_geo_focus", getFund_geo_focus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long assetId = (Long)attributes.get("assetId");

		if (assetId != null) {
			setAssetId(assetId);
		}

		Double fund_total_assets = (Double)attributes.get("fund_total_assets");

		if (fund_total_assets != null) {
			setFund_total_assets(fund_total_assets);
		}

		String fund_asset_class_focus = (String)attributes.get(
				"fund_asset_class_focus");

		if (fund_asset_class_focus != null) {
			setFund_asset_class_focus(fund_asset_class_focus);
		}

		String fund_geo_focus = (String)attributes.get("fund_geo_focus");

		if (fund_geo_focus != null) {
			setFund_geo_focus(fund_geo_focus);
		}
	}

	@Override
	public long getAssetId() {
		return _assetId;
	}

	@Override
	public void setAssetId(long assetId) {
		_assetId = assetId;

		if (_mutualFundRemoteModel != null) {
			try {
				Class<?> clazz = _mutualFundRemoteModel.getClass();

				Method method = clazz.getMethod("setAssetId", long.class);

				method.invoke(_mutualFundRemoteModel, assetId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getFund_total_assets() {
		return _fund_total_assets;
	}

	@Override
	public void setFund_total_assets(double fund_total_assets) {
		_fund_total_assets = fund_total_assets;

		if (_mutualFundRemoteModel != null) {
			try {
				Class<?> clazz = _mutualFundRemoteModel.getClass();

				Method method = clazz.getMethod("setFund_total_assets",
						double.class);

				method.invoke(_mutualFundRemoteModel, fund_total_assets);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFund_asset_class_focus() {
		return _fund_asset_class_focus;
	}

	@Override
	public void setFund_asset_class_focus(String fund_asset_class_focus) {
		_fund_asset_class_focus = fund_asset_class_focus;

		if (_mutualFundRemoteModel != null) {
			try {
				Class<?> clazz = _mutualFundRemoteModel.getClass();

				Method method = clazz.getMethod("setFund_asset_class_focus",
						String.class);

				method.invoke(_mutualFundRemoteModel, fund_asset_class_focus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFund_geo_focus() {
		return _fund_geo_focus;
	}

	@Override
	public void setFund_geo_focus(String fund_geo_focus) {
		_fund_geo_focus = fund_geo_focus;

		if (_mutualFundRemoteModel != null) {
			try {
				Class<?> clazz = _mutualFundRemoteModel.getClass();

				Method method = clazz.getMethod("setFund_geo_focus",
						String.class);

				method.invoke(_mutualFundRemoteModel, fund_geo_focus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getMutualFundRemoteModel() {
		return _mutualFundRemoteModel;
	}

	public void setMutualFundRemoteModel(BaseModel<?> mutualFundRemoteModel) {
		_mutualFundRemoteModel = mutualFundRemoteModel;
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

		Class<?> remoteModelClass = _mutualFundRemoteModel.getClass();

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

		Object returnValue = method.invoke(_mutualFundRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			MutualFundLocalServiceUtil.addMutualFund(this);
		}
		else {
			MutualFundLocalServiceUtil.updateMutualFund(this);
		}
	}

	@Override
	public MutualFund toEscapedModel() {
		return (MutualFund)ProxyUtil.newProxyInstance(MutualFund.class.getClassLoader(),
			new Class[] { MutualFund.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		MutualFundClp clone = new MutualFundClp();

		clone.setAssetId(getAssetId());
		clone.setFund_total_assets(getFund_total_assets());
		clone.setFund_asset_class_focus(getFund_asset_class_focus());
		clone.setFund_geo_focus(getFund_geo_focus());

		return clone;
	}

	@Override
	public int compareTo(MutualFund mutualFund) {
		long primaryKey = mutualFund.getPrimaryKey();

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

		if (!(obj instanceof MutualFundClp)) {
			return false;
		}

		MutualFundClp mutualFund = (MutualFundClp)obj;

		long primaryKey = mutualFund.getPrimaryKey();

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
		StringBundler sb = new StringBundler(9);

		sb.append("{assetId=");
		sb.append(getAssetId());
		sb.append(", fund_total_assets=");
		sb.append(getFund_total_assets());
		sb.append(", fund_asset_class_focus=");
		sb.append(getFund_asset_class_focus());
		sb.append(", fund_geo_focus=");
		sb.append(getFund_geo_focus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.fingence.slayer.model.MutualFund");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>assetId</column-name><column-value><![CDATA[");
		sb.append(getAssetId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fund_total_assets</column-name><column-value><![CDATA[");
		sb.append(getFund_total_assets());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fund_asset_class_focus</column-name><column-value><![CDATA[");
		sb.append(getFund_asset_class_focus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fund_geo_focus</column-name><column-value><![CDATA[");
		sb.append(getFund_geo_focus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _assetId;
	private double _fund_total_assets;
	private String _fund_asset_class_focus;
	private String _fund_geo_focus;
	private BaseModel<?> _mutualFundRemoteModel;
}