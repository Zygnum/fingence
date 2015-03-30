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
import com.fingence.slayer.service.PortfolioItemLocalServiceUtil;

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
public class PortfolioItemClp extends BaseModelImpl<PortfolioItem>
	implements PortfolioItem {
	public PortfolioItemClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return PortfolioItem.class;
	}

	@Override
	public String getModelClassName() {
		return PortfolioItem.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _itemId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setItemId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _itemId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("itemId", getItemId());
		attributes.put("assetId", getAssetId());
		attributes.put("portfolioId", getPortfolioId());
		attributes.put("purchaseDate", getPurchaseDate());
		attributes.put("purchasePrice", getPurchasePrice());
		attributes.put("purchaseQty", getPurchaseQty());
		attributes.put("purchasedFx", getPurchasedFx());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long itemId = (Long)attributes.get("itemId");

		if (itemId != null) {
			setItemId(itemId);
		}

		Long assetId = (Long)attributes.get("assetId");

		if (assetId != null) {
			setAssetId(assetId);
		}

		Long portfolioId = (Long)attributes.get("portfolioId");

		if (portfolioId != null) {
			setPortfolioId(portfolioId);
		}

		Date purchaseDate = (Date)attributes.get("purchaseDate");

		if (purchaseDate != null) {
			setPurchaseDate(purchaseDate);
		}

		Double purchasePrice = (Double)attributes.get("purchasePrice");

		if (purchasePrice != null) {
			setPurchasePrice(purchasePrice);
		}

		Double purchaseQty = (Double)attributes.get("purchaseQty");

		if (purchaseQty != null) {
			setPurchaseQty(purchaseQty);
		}

		Double purchasedFx = (Double)attributes.get("purchasedFx");

		if (purchasedFx != null) {
			setPurchasedFx(purchasedFx);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@Override
	public long getItemId() {
		return _itemId;
	}

	@Override
	public void setItemId(long itemId) {
		_itemId = itemId;

		if (_portfolioItemRemoteModel != null) {
			try {
				Class<?> clazz = _portfolioItemRemoteModel.getClass();

				Method method = clazz.getMethod("setItemId", long.class);

				method.invoke(_portfolioItemRemoteModel, itemId);
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

		if (_portfolioItemRemoteModel != null) {
			try {
				Class<?> clazz = _portfolioItemRemoteModel.getClass();

				Method method = clazz.getMethod("setAssetId", long.class);

				method.invoke(_portfolioItemRemoteModel, assetId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPortfolioId() {
		return _portfolioId;
	}

	@Override
	public void setPortfolioId(long portfolioId) {
		_portfolioId = portfolioId;

		if (_portfolioItemRemoteModel != null) {
			try {
				Class<?> clazz = _portfolioItemRemoteModel.getClass();

				Method method = clazz.getMethod("setPortfolioId", long.class);

				method.invoke(_portfolioItemRemoteModel, portfolioId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getPurchaseDate() {
		return _purchaseDate;
	}

	@Override
	public void setPurchaseDate(Date purchaseDate) {
		_purchaseDate = purchaseDate;

		if (_portfolioItemRemoteModel != null) {
			try {
				Class<?> clazz = _portfolioItemRemoteModel.getClass();

				Method method = clazz.getMethod("setPurchaseDate", Date.class);

				method.invoke(_portfolioItemRemoteModel, purchaseDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getPurchasePrice() {
		return _purchasePrice;
	}

	@Override
	public void setPurchasePrice(double purchasePrice) {
		_purchasePrice = purchasePrice;

		if (_portfolioItemRemoteModel != null) {
			try {
				Class<?> clazz = _portfolioItemRemoteModel.getClass();

				Method method = clazz.getMethod("setPurchasePrice", double.class);

				method.invoke(_portfolioItemRemoteModel, purchasePrice);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getPurchaseQty() {
		return _purchaseQty;
	}

	@Override
	public void setPurchaseQty(double purchaseQty) {
		_purchaseQty = purchaseQty;

		if (_portfolioItemRemoteModel != null) {
			try {
				Class<?> clazz = _portfolioItemRemoteModel.getClass();

				Method method = clazz.getMethod("setPurchaseQty", double.class);

				method.invoke(_portfolioItemRemoteModel, purchaseQty);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getPurchasedFx() {
		return _purchasedFx;
	}

	@Override
	public void setPurchasedFx(double purchasedFx) {
		_purchasedFx = purchasedFx;

		if (_portfolioItemRemoteModel != null) {
			try {
				Class<?> clazz = _portfolioItemRemoteModel.getClass();

				Method method = clazz.getMethod("setPurchasedFx", double.class);

				method.invoke(_portfolioItemRemoteModel, purchasedFx);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_portfolioItemRemoteModel != null) {
			try {
				Class<?> clazz = _portfolioItemRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_portfolioItemRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_portfolioItemRemoteModel != null) {
			try {
				Class<?> clazz = _portfolioItemRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_portfolioItemRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPortfolioItemRemoteModel() {
		return _portfolioItemRemoteModel;
	}

	public void setPortfolioItemRemoteModel(
		BaseModel<?> portfolioItemRemoteModel) {
		_portfolioItemRemoteModel = portfolioItemRemoteModel;
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

		Class<?> remoteModelClass = _portfolioItemRemoteModel.getClass();

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

		Object returnValue = method.invoke(_portfolioItemRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PortfolioItemLocalServiceUtil.addPortfolioItem(this);
		}
		else {
			PortfolioItemLocalServiceUtil.updatePortfolioItem(this);
		}
	}

	@Override
	public PortfolioItem toEscapedModel() {
		return (PortfolioItem)ProxyUtil.newProxyInstance(PortfolioItem.class.getClassLoader(),
			new Class[] { PortfolioItem.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PortfolioItemClp clone = new PortfolioItemClp();

		clone.setItemId(getItemId());
		clone.setAssetId(getAssetId());
		clone.setPortfolioId(getPortfolioId());
		clone.setPurchaseDate(getPurchaseDate());
		clone.setPurchasePrice(getPurchasePrice());
		clone.setPurchaseQty(getPurchaseQty());
		clone.setPurchasedFx(getPurchasedFx());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	@Override
	public int compareTo(PortfolioItem portfolioItem) {
		long primaryKey = portfolioItem.getPrimaryKey();

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

		if (!(obj instanceof PortfolioItemClp)) {
			return false;
		}

		PortfolioItemClp portfolioItem = (PortfolioItemClp)obj;

		long primaryKey = portfolioItem.getPrimaryKey();

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

		sb.append("{itemId=");
		sb.append(getItemId());
		sb.append(", assetId=");
		sb.append(getAssetId());
		sb.append(", portfolioId=");
		sb.append(getPortfolioId());
		sb.append(", purchaseDate=");
		sb.append(getPurchaseDate());
		sb.append(", purchasePrice=");
		sb.append(getPurchasePrice());
		sb.append(", purchaseQty=");
		sb.append(getPurchaseQty());
		sb.append(", purchasedFx=");
		sb.append(getPurchasedFx());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.fingence.slayer.model.PortfolioItem");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>itemId</column-name><column-value><![CDATA[");
		sb.append(getItemId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>assetId</column-name><column-value><![CDATA[");
		sb.append(getAssetId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portfolioId</column-name><column-value><![CDATA[");
		sb.append(getPortfolioId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>purchaseDate</column-name><column-value><![CDATA[");
		sb.append(getPurchaseDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>purchasePrice</column-name><column-value><![CDATA[");
		sb.append(getPurchasePrice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>purchaseQty</column-name><column-value><![CDATA[");
		sb.append(getPurchaseQty());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>purchasedFx</column-name><column-value><![CDATA[");
		sb.append(getPurchasedFx());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _itemId;
	private long _assetId;
	private long _portfolioId;
	private Date _purchaseDate;
	private double _purchasePrice;
	private double _purchaseQty;
	private double _purchasedFx;
	private Date _createDate;
	private Date _modifiedDate;
	private BaseModel<?> _portfolioItemRemoteModel;
}