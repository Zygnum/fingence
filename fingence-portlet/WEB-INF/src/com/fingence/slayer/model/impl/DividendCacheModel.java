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

import com.fingence.slayer.model.Dividend;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Dividend in entity cache.
 *
 * @author Ahmed Hasan
 * @see Dividend
 * @generated
 */
public class DividendCacheModel implements CacheModel<Dividend>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{recId=");
		sb.append(recId);
		sb.append(", assetId=");
		sb.append(assetId);
		sb.append(", declaredDate=");
		sb.append(declaredDate);
		sb.append(", exDate=");
		sb.append(exDate);
		sb.append(", recordDate=");
		sb.append(recordDate);
		sb.append(", payableDate=");
		sb.append(payableDate);
		sb.append(", amount=");
		sb.append(amount);
		sb.append(", frequency=");
		sb.append(frequency);
		sb.append(", type=");
		sb.append(type);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Dividend toEntityModel() {
		DividendImpl dividendImpl = new DividendImpl();

		dividendImpl.setRecId(recId);
		dividendImpl.setAssetId(assetId);

		if (declaredDate == Long.MIN_VALUE) {
			dividendImpl.setDeclaredDate(null);
		}
		else {
			dividendImpl.setDeclaredDate(new Date(declaredDate));
		}

		if (exDate == Long.MIN_VALUE) {
			dividendImpl.setExDate(null);
		}
		else {
			dividendImpl.setExDate(new Date(exDate));
		}

		if (recordDate == Long.MIN_VALUE) {
			dividendImpl.setRecordDate(null);
		}
		else {
			dividendImpl.setRecordDate(new Date(recordDate));
		}

		if (payableDate == Long.MIN_VALUE) {
			dividendImpl.setPayableDate(null);
		}
		else {
			dividendImpl.setPayableDate(new Date(payableDate));
		}

		dividendImpl.setAmount(amount);

		if (frequency == null) {
			dividendImpl.setFrequency(StringPool.BLANK);
		}
		else {
			dividendImpl.setFrequency(frequency);
		}

		if (type == null) {
			dividendImpl.setType(StringPool.BLANK);
		}
		else {
			dividendImpl.setType(type);
		}

		dividendImpl.resetOriginalValues();

		return dividendImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		recId = objectInput.readLong();
		assetId = objectInput.readLong();
		declaredDate = objectInput.readLong();
		exDate = objectInput.readLong();
		recordDate = objectInput.readLong();
		payableDate = objectInput.readLong();
		amount = objectInput.readDouble();
		frequency = objectInput.readUTF();
		type = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(recId);
		objectOutput.writeLong(assetId);
		objectOutput.writeLong(declaredDate);
		objectOutput.writeLong(exDate);
		objectOutput.writeLong(recordDate);
		objectOutput.writeLong(payableDate);
		objectOutput.writeDouble(amount);

		if (frequency == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(frequency);
		}

		if (type == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(type);
		}
	}

	public long recId;
	public long assetId;
	public long declaredDate;
	public long exDate;
	public long recordDate;
	public long payableDate;
	public double amount;
	public String frequency;
	public String type;
}