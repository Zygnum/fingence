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

package com.fingence.slayer.model.impl;

import com.fingence.slayer.model.PortfolioItem;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PortfolioItem in entity cache.
 *
 * @author Ahmed Hasan
 * @see PortfolioItem
 * @generated
 */
public class PortfolioItemCacheModel implements CacheModel<PortfolioItem>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{itemId=");
		sb.append(itemId);
		sb.append(", assetId=");
		sb.append(assetId);
		sb.append(", portfolioId=");
		sb.append(portfolioId);
		sb.append(", purchaseDate=");
		sb.append(purchaseDate);
		sb.append(", purchasePrice=");
		sb.append(purchasePrice);
		sb.append(", purchaseQty=");
		sb.append(purchaseQty);
		sb.append(", purchasedFx=");
		sb.append(purchasedFx);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PortfolioItem toEntityModel() {
		PortfolioItemImpl portfolioItemImpl = new PortfolioItemImpl();

		portfolioItemImpl.setItemId(itemId);
		portfolioItemImpl.setAssetId(assetId);
		portfolioItemImpl.setPortfolioId(portfolioId);

		if (purchaseDate == Long.MIN_VALUE) {
			portfolioItemImpl.setPurchaseDate(null);
		}
		else {
			portfolioItemImpl.setPurchaseDate(new Date(purchaseDate));
		}

		portfolioItemImpl.setPurchasePrice(purchasePrice);
		portfolioItemImpl.setPurchaseQty(purchaseQty);
		portfolioItemImpl.setPurchasedFx(purchasedFx);

		if (createDate == Long.MIN_VALUE) {
			portfolioItemImpl.setCreateDate(null);
		}
		else {
			portfolioItemImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			portfolioItemImpl.setModifiedDate(null);
		}
		else {
			portfolioItemImpl.setModifiedDate(new Date(modifiedDate));
		}

		portfolioItemImpl.resetOriginalValues();

		return portfolioItemImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		itemId = objectInput.readLong();
		assetId = objectInput.readLong();
		portfolioId = objectInput.readLong();
		purchaseDate = objectInput.readLong();
		purchasePrice = objectInput.readDouble();
		purchaseQty = objectInput.readDouble();
		purchasedFx = objectInput.readDouble();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(itemId);
		objectOutput.writeLong(assetId);
		objectOutput.writeLong(portfolioId);
		objectOutput.writeLong(purchaseDate);
		objectOutput.writeDouble(purchasePrice);
		objectOutput.writeDouble(purchaseQty);
		objectOutput.writeDouble(purchasedFx);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public long itemId;
	public long assetId;
	public long portfolioId;
	public long purchaseDate;
	public double purchasePrice;
	public double purchaseQty;
	public double purchasedFx;
	public long createDate;
	public long modifiedDate;
}