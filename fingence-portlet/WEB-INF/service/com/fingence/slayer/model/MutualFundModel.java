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

/**
 * The base model interface for the MutualFund service. Represents a row in the &quot;fing_MutualFund&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.fingence.slayer.model.impl.MutualFundModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.fingence.slayer.model.impl.MutualFundImpl}.
 * </p>
 *
 * @author Ahmed Hasan
 * @see MutualFund
 * @see com.fingence.slayer.model.impl.MutualFundImpl
 * @see com.fingence.slayer.model.impl.MutualFundModelImpl
 * @generated
 */
public interface MutualFundModel extends BaseModel<MutualFund> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a mutual fund model instance should use the {@link MutualFund} interface instead.
	 */

	/**
	 * Returns the primary key of this mutual fund.
	 *
	 * @return the primary key of this mutual fund
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this mutual fund.
	 *
	 * @param primaryKey the primary key of this mutual fund
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the asset ID of this mutual fund.
	 *
	 * @return the asset ID of this mutual fund
	 */
	public long getAssetId();

	/**
	 * Sets the asset ID of this mutual fund.
	 *
	 * @param assetId the asset ID of this mutual fund
	 */
	public void setAssetId(long assetId);

	/**
	 * Returns the fund_total_assets of this mutual fund.
	 *
	 * @return the fund_total_assets of this mutual fund
	 */
	public double getFund_total_assets();

	/**
	 * Sets the fund_total_assets of this mutual fund.
	 *
	 * @param fund_total_assets the fund_total_assets of this mutual fund
	 */
	public void setFund_total_assets(double fund_total_assets);

	/**
	 * Returns the fund_asset_class_focus of this mutual fund.
	 *
	 * @return the fund_asset_class_focus of this mutual fund
	 */
	@AutoEscape
	public String getFund_asset_class_focus();

	/**
	 * Sets the fund_asset_class_focus of this mutual fund.
	 *
	 * @param fund_asset_class_focus the fund_asset_class_focus of this mutual fund
	 */
	public void setFund_asset_class_focus(String fund_asset_class_focus);

	/**
	 * Returns the fund_geo_focus of this mutual fund.
	 *
	 * @return the fund_geo_focus of this mutual fund
	 */
	@AutoEscape
	public String getFund_geo_focus();

	/**
	 * Sets the fund_geo_focus of this mutual fund.
	 *
	 * @param fund_geo_focus the fund_geo_focus of this mutual fund
	 */
	public void setFund_geo_focus(String fund_geo_focus);

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
	public int compareTo(MutualFund mutualFund);

	@Override
	public int hashCode();

	@Override
	public CacheModel<MutualFund> toCacheModel();

	@Override
	public MutualFund toEscapedModel();

	@Override
	public MutualFund toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}