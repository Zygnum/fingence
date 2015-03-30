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

import com.fingence.slayer.model.History;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing History in entity cache.
 *
 * @author Ahmed Hasan
 * @see History
 * @generated
 */
public class HistoryCacheModel implements CacheModel<History>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{recId=");
		sb.append(recId);
		sb.append(", assetId=");
		sb.append(assetId);
		sb.append(", logDate=");
		sb.append(logDate);
		sb.append(", value=");
		sb.append(value);
		sb.append(", type=");
		sb.append(type);
		sb.append(", principal=");
		sb.append(principal);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public History toEntityModel() {
		HistoryImpl historyImpl = new HistoryImpl();

		historyImpl.setRecId(recId);
		historyImpl.setAssetId(assetId);

		if (logDate == Long.MIN_VALUE) {
			historyImpl.setLogDate(null);
		}
		else {
			historyImpl.setLogDate(new Date(logDate));
		}

		historyImpl.setValue(value);
		historyImpl.setType(type);
		historyImpl.setPrincipal(principal);

		historyImpl.resetOriginalValues();

		return historyImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		recId = objectInput.readLong();
		assetId = objectInput.readLong();
		logDate = objectInput.readLong();
		value = objectInput.readDouble();
		type = objectInput.readInt();
		principal = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(recId);
		objectOutput.writeLong(assetId);
		objectOutput.writeLong(logDate);
		objectOutput.writeDouble(value);
		objectOutput.writeInt(type);
		objectOutput.writeDouble(principal);
	}

	public long recId;
	public long assetId;
	public long logDate;
	public double value;
	public int type;
	public double principal;
}