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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Dividend service. Represents a row in the &quot;fing_Dividend&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.fingence.slayer.model.impl.DividendModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.fingence.slayer.model.impl.DividendImpl}.
 * </p>
 *
 * @author Ahmed Hasan
 * @see Dividend
 * @see com.fingence.slayer.model.impl.DividendImpl
 * @see com.fingence.slayer.model.impl.DividendModelImpl
 * @generated
 */
public interface DividendModel extends BaseModel<Dividend> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dividend model instance should use the {@link Dividend} interface instead.
	 */

	/**
	 * Returns the primary key of this dividend.
	 *
	 * @return the primary key of this dividend
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this dividend.
	 *
	 * @param primaryKey the primary key of this dividend
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the rec ID of this dividend.
	 *
	 * @return the rec ID of this dividend
	 */
	public long getRecId();

	/**
	 * Sets the rec ID of this dividend.
	 *
	 * @param recId the rec ID of this dividend
	 */
	public void setRecId(long recId);

	/**
	 * Returns the asset ID of this dividend.
	 *
	 * @return the asset ID of this dividend
	 */
	public long getAssetId();

	/**
	 * Sets the asset ID of this dividend.
	 *
	 * @param assetId the asset ID of this dividend
	 */
	public void setAssetId(long assetId);

	/**
	 * Returns the declared date of this dividend.
	 *
	 * @return the declared date of this dividend
	 */
	public Date getDeclaredDate();

	/**
	 * Sets the declared date of this dividend.
	 *
	 * @param declaredDate the declared date of this dividend
	 */
	public void setDeclaredDate(Date declaredDate);

	/**
	 * Returns the ex date of this dividend.
	 *
	 * @return the ex date of this dividend
	 */
	public Date getExDate();

	/**
	 * Sets the ex date of this dividend.
	 *
	 * @param exDate the ex date of this dividend
	 */
	public void setExDate(Date exDate);

	/**
	 * Returns the record date of this dividend.
	 *
	 * @return the record date of this dividend
	 */
	public Date getRecordDate();

	/**
	 * Sets the record date of this dividend.
	 *
	 * @param recordDate the record date of this dividend
	 */
	public void setRecordDate(Date recordDate);

	/**
	 * Returns the payable date of this dividend.
	 *
	 * @return the payable date of this dividend
	 */
	public Date getPayableDate();

	/**
	 * Sets the payable date of this dividend.
	 *
	 * @param payableDate the payable date of this dividend
	 */
	public void setPayableDate(Date payableDate);

	/**
	 * Returns the amount of this dividend.
	 *
	 * @return the amount of this dividend
	 */
	public double getAmount();

	/**
	 * Sets the amount of this dividend.
	 *
	 * @param amount the amount of this dividend
	 */
	public void setAmount(double amount);

	/**
	 * Returns the frequency of this dividend.
	 *
	 * @return the frequency of this dividend
	 */
	@AutoEscape
	public String getFrequency();

	/**
	 * Sets the frequency of this dividend.
	 *
	 * @param frequency the frequency of this dividend
	 */
	public void setFrequency(String frequency);

	/**
	 * Returns the type of this dividend.
	 *
	 * @return the type of this dividend
	 */
	@AutoEscape
	public String getType();

	/**
	 * Sets the type of this dividend.
	 *
	 * @param type the type of this dividend
	 */
	public void setType(String type);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Dividend dividend);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Dividend> toCacheModel();

	@Override
	public Dividend toEscapedModel();

	@Override
	public Dividend toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}