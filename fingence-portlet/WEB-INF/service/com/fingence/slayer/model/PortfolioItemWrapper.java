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
 * This class is a wrapper for {@link PortfolioItem}.
 * </p>
 *
 * @author Ahmed Hasan
 * @see PortfolioItem
 * @generated
 */
public class PortfolioItemWrapper implements PortfolioItem,
	ModelWrapper<PortfolioItem> {
	public PortfolioItemWrapper(PortfolioItem portfolioItem) {
		_portfolioItem = portfolioItem;
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

	/**
	* Returns the primary key of this portfolio item.
	*
	* @return the primary key of this portfolio item
	*/
	@Override
	public long getPrimaryKey() {
		return _portfolioItem.getPrimaryKey();
	}

	/**
	* Sets the primary key of this portfolio item.
	*
	* @param primaryKey the primary key of this portfolio item
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_portfolioItem.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the item ID of this portfolio item.
	*
	* @return the item ID of this portfolio item
	*/
	@Override
	public long getItemId() {
		return _portfolioItem.getItemId();
	}

	/**
	* Sets the item ID of this portfolio item.
	*
	* @param itemId the item ID of this portfolio item
	*/
	@Override
	public void setItemId(long itemId) {
		_portfolioItem.setItemId(itemId);
	}

	/**
	* Returns the asset ID of this portfolio item.
	*
	* @return the asset ID of this portfolio item
	*/
	@Override
	public long getAssetId() {
		return _portfolioItem.getAssetId();
	}

	/**
	* Sets the asset ID of this portfolio item.
	*
	* @param assetId the asset ID of this portfolio item
	*/
	@Override
	public void setAssetId(long assetId) {
		_portfolioItem.setAssetId(assetId);
	}

	/**
	* Returns the portfolio ID of this portfolio item.
	*
	* @return the portfolio ID of this portfolio item
	*/
	@Override
	public long getPortfolioId() {
		return _portfolioItem.getPortfolioId();
	}

	/**
	* Sets the portfolio ID of this portfolio item.
	*
	* @param portfolioId the portfolio ID of this portfolio item
	*/
	@Override
	public void setPortfolioId(long portfolioId) {
		_portfolioItem.setPortfolioId(portfolioId);
	}

	/**
	* Returns the purchase date of this portfolio item.
	*
	* @return the purchase date of this portfolio item
	*/
	@Override
	public java.util.Date getPurchaseDate() {
		return _portfolioItem.getPurchaseDate();
	}

	/**
	* Sets the purchase date of this portfolio item.
	*
	* @param purchaseDate the purchase date of this portfolio item
	*/
	@Override
	public void setPurchaseDate(java.util.Date purchaseDate) {
		_portfolioItem.setPurchaseDate(purchaseDate);
	}

	/**
	* Returns the purchase price of this portfolio item.
	*
	* @return the purchase price of this portfolio item
	*/
	@Override
	public double getPurchasePrice() {
		return _portfolioItem.getPurchasePrice();
	}

	/**
	* Sets the purchase price of this portfolio item.
	*
	* @param purchasePrice the purchase price of this portfolio item
	*/
	@Override
	public void setPurchasePrice(double purchasePrice) {
		_portfolioItem.setPurchasePrice(purchasePrice);
	}

	/**
	* Returns the purchase qty of this portfolio item.
	*
	* @return the purchase qty of this portfolio item
	*/
	@Override
	public double getPurchaseQty() {
		return _portfolioItem.getPurchaseQty();
	}

	/**
	* Sets the purchase qty of this portfolio item.
	*
	* @param purchaseQty the purchase qty of this portfolio item
	*/
	@Override
	public void setPurchaseQty(double purchaseQty) {
		_portfolioItem.setPurchaseQty(purchaseQty);
	}

	/**
	* Returns the purchased fx of this portfolio item.
	*
	* @return the purchased fx of this portfolio item
	*/
	@Override
	public double getPurchasedFx() {
		return _portfolioItem.getPurchasedFx();
	}

	/**
	* Sets the purchased fx of this portfolio item.
	*
	* @param purchasedFx the purchased fx of this portfolio item
	*/
	@Override
	public void setPurchasedFx(double purchasedFx) {
		_portfolioItem.setPurchasedFx(purchasedFx);
	}

	/**
	* Returns the create date of this portfolio item.
	*
	* @return the create date of this portfolio item
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _portfolioItem.getCreateDate();
	}

	/**
	* Sets the create date of this portfolio item.
	*
	* @param createDate the create date of this portfolio item
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_portfolioItem.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this portfolio item.
	*
	* @return the modified date of this portfolio item
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _portfolioItem.getModifiedDate();
	}

	/**
	* Sets the modified date of this portfolio item.
	*
	* @param modifiedDate the modified date of this portfolio item
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_portfolioItem.setModifiedDate(modifiedDate);
	}

	@Override
	public boolean isNew() {
		return _portfolioItem.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_portfolioItem.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _portfolioItem.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_portfolioItem.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _portfolioItem.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _portfolioItem.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_portfolioItem.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _portfolioItem.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_portfolioItem.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_portfolioItem.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_portfolioItem.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PortfolioItemWrapper((PortfolioItem)_portfolioItem.clone());
	}

	@Override
	public int compareTo(PortfolioItem portfolioItem) {
		return _portfolioItem.compareTo(portfolioItem);
	}

	@Override
	public int hashCode() {
		return _portfolioItem.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<PortfolioItem> toCacheModel() {
		return _portfolioItem.toCacheModel();
	}

	@Override
	public PortfolioItem toEscapedModel() {
		return new PortfolioItemWrapper(_portfolioItem.toEscapedModel());
	}

	@Override
	public PortfolioItem toUnescapedModel() {
		return new PortfolioItemWrapper(_portfolioItem.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _portfolioItem.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _portfolioItem.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_portfolioItem.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PortfolioItemWrapper)) {
			return false;
		}

		PortfolioItemWrapper portfolioItemWrapper = (PortfolioItemWrapper)obj;

		if (Validator.equals(_portfolioItem, portfolioItemWrapper._portfolioItem)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PortfolioItem getWrappedPortfolioItem() {
		return _portfolioItem;
	}

	@Override
	public PortfolioItem getWrappedModel() {
		return _portfolioItem;
	}

	@Override
	public void resetOriginalValues() {
		_portfolioItem.resetOriginalValues();
	}

	private PortfolioItem _portfolioItem;
}