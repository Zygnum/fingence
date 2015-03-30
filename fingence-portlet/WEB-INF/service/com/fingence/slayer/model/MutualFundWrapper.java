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
 * This class is a wrapper for {@link MutualFund}.
 * </p>
 *
 * @author Ahmed Hasan
 * @see MutualFund
 * @generated
 */
public class MutualFundWrapper implements MutualFund, ModelWrapper<MutualFund> {
	public MutualFundWrapper(MutualFund mutualFund) {
		_mutualFund = mutualFund;
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

	/**
	* Returns the primary key of this mutual fund.
	*
	* @return the primary key of this mutual fund
	*/
	@Override
	public long getPrimaryKey() {
		return _mutualFund.getPrimaryKey();
	}

	/**
	* Sets the primary key of this mutual fund.
	*
	* @param primaryKey the primary key of this mutual fund
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_mutualFund.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the asset ID of this mutual fund.
	*
	* @return the asset ID of this mutual fund
	*/
	@Override
	public long getAssetId() {
		return _mutualFund.getAssetId();
	}

	/**
	* Sets the asset ID of this mutual fund.
	*
	* @param assetId the asset ID of this mutual fund
	*/
	@Override
	public void setAssetId(long assetId) {
		_mutualFund.setAssetId(assetId);
	}

	/**
	* Returns the fund_total_assets of this mutual fund.
	*
	* @return the fund_total_assets of this mutual fund
	*/
	@Override
	public double getFund_total_assets() {
		return _mutualFund.getFund_total_assets();
	}

	/**
	* Sets the fund_total_assets of this mutual fund.
	*
	* @param fund_total_assets the fund_total_assets of this mutual fund
	*/
	@Override
	public void setFund_total_assets(double fund_total_assets) {
		_mutualFund.setFund_total_assets(fund_total_assets);
	}

	/**
	* Returns the fund_asset_class_focus of this mutual fund.
	*
	* @return the fund_asset_class_focus of this mutual fund
	*/
	@Override
	public java.lang.String getFund_asset_class_focus() {
		return _mutualFund.getFund_asset_class_focus();
	}

	/**
	* Sets the fund_asset_class_focus of this mutual fund.
	*
	* @param fund_asset_class_focus the fund_asset_class_focus of this mutual fund
	*/
	@Override
	public void setFund_asset_class_focus(
		java.lang.String fund_asset_class_focus) {
		_mutualFund.setFund_asset_class_focus(fund_asset_class_focus);
	}

	/**
	* Returns the fund_geo_focus of this mutual fund.
	*
	* @return the fund_geo_focus of this mutual fund
	*/
	@Override
	public java.lang.String getFund_geo_focus() {
		return _mutualFund.getFund_geo_focus();
	}

	/**
	* Sets the fund_geo_focus of this mutual fund.
	*
	* @param fund_geo_focus the fund_geo_focus of this mutual fund
	*/
	@Override
	public void setFund_geo_focus(java.lang.String fund_geo_focus) {
		_mutualFund.setFund_geo_focus(fund_geo_focus);
	}

	@Override
	public boolean isNew() {
		return _mutualFund.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_mutualFund.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _mutualFund.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_mutualFund.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _mutualFund.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _mutualFund.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_mutualFund.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _mutualFund.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_mutualFund.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_mutualFund.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_mutualFund.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MutualFundWrapper((MutualFund)_mutualFund.clone());
	}

	@Override
	public int compareTo(MutualFund mutualFund) {
		return _mutualFund.compareTo(mutualFund);
	}

	@Override
	public int hashCode() {
		return _mutualFund.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<MutualFund> toCacheModel() {
		return _mutualFund.toCacheModel();
	}

	@Override
	public MutualFund toEscapedModel() {
		return new MutualFundWrapper(_mutualFund.toEscapedModel());
	}

	@Override
	public MutualFund toUnescapedModel() {
		return new MutualFundWrapper(_mutualFund.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _mutualFund.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _mutualFund.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_mutualFund.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MutualFundWrapper)) {
			return false;
		}

		MutualFundWrapper mutualFundWrapper = (MutualFundWrapper)obj;

		if (Validator.equals(_mutualFund, mutualFundWrapper._mutualFund)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public MutualFund getWrappedMutualFund() {
		return _mutualFund;
	}

	@Override
	public MutualFund getWrappedModel() {
		return _mutualFund;
	}

	@Override
	public void resetOriginalValues() {
		_mutualFund.resetOriginalValues();
	}

	private MutualFund _mutualFund;
}