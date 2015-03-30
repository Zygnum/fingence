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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.fingence.slayer.service.http.PortfolioItemServiceSoap}.
 *
 * @author Ahmed Hasan
 * @see com.fingence.slayer.service.http.PortfolioItemServiceSoap
 * @generated
 */
public class PortfolioItemSoap implements Serializable {
	public static PortfolioItemSoap toSoapModel(PortfolioItem model) {
		PortfolioItemSoap soapModel = new PortfolioItemSoap();

		soapModel.setItemId(model.getItemId());
		soapModel.setAssetId(model.getAssetId());
		soapModel.setPortfolioId(model.getPortfolioId());
		soapModel.setPurchaseDate(model.getPurchaseDate());
		soapModel.setPurchasePrice(model.getPurchasePrice());
		soapModel.setPurchaseQty(model.getPurchaseQty());
		soapModel.setPurchasedFx(model.getPurchasedFx());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static PortfolioItemSoap[] toSoapModels(PortfolioItem[] models) {
		PortfolioItemSoap[] soapModels = new PortfolioItemSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PortfolioItemSoap[][] toSoapModels(PortfolioItem[][] models) {
		PortfolioItemSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PortfolioItemSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PortfolioItemSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PortfolioItemSoap[] toSoapModels(List<PortfolioItem> models) {
		List<PortfolioItemSoap> soapModels = new ArrayList<PortfolioItemSoap>(models.size());

		for (PortfolioItem model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PortfolioItemSoap[soapModels.size()]);
	}

	public PortfolioItemSoap() {
	}

	public long getPrimaryKey() {
		return _itemId;
	}

	public void setPrimaryKey(long pk) {
		setItemId(pk);
	}

	public long getItemId() {
		return _itemId;
	}

	public void setItemId(long itemId) {
		_itemId = itemId;
	}

	public long getAssetId() {
		return _assetId;
	}

	public void setAssetId(long assetId) {
		_assetId = assetId;
	}

	public long getPortfolioId() {
		return _portfolioId;
	}

	public void setPortfolioId(long portfolioId) {
		_portfolioId = portfolioId;
	}

	public Date getPurchaseDate() {
		return _purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		_purchaseDate = purchaseDate;
	}

	public double getPurchasePrice() {
		return _purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		_purchasePrice = purchasePrice;
	}

	public double getPurchaseQty() {
		return _purchaseQty;
	}

	public void setPurchaseQty(double purchaseQty) {
		_purchaseQty = purchaseQty;
	}

	public double getPurchasedFx() {
		return _purchasedFx;
	}

	public void setPurchasedFx(double purchasedFx) {
		_purchasedFx = purchasedFx;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
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
}