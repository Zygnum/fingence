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

import com.fingence.slayer.model.Currency;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Currency in entity cache.
 *
 * @author Ahmed Hasan
 * @see Currency
 * @generated
 */
public class CurrencyCacheModel implements CacheModel<Currency>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{currencyId=");
		sb.append(currencyId);
		sb.append(", currencyCode=");
		sb.append(currencyCode);
		sb.append(", currencyDesc=");
		sb.append(currencyDesc);
		sb.append(", conversion=");
		sb.append(conversion);
		sb.append(", currencySymbol=");
		sb.append(currencySymbol);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Currency toEntityModel() {
		CurrencyImpl currencyImpl = new CurrencyImpl();

		currencyImpl.setCurrencyId(currencyId);

		if (currencyCode == null) {
			currencyImpl.setCurrencyCode(StringPool.BLANK);
		}
		else {
			currencyImpl.setCurrencyCode(currencyCode);
		}

		if (currencyDesc == null) {
			currencyImpl.setCurrencyDesc(StringPool.BLANK);
		}
		else {
			currencyImpl.setCurrencyDesc(currencyDesc);
		}

		currencyImpl.setConversion(conversion);

		if (currencySymbol == null) {
			currencyImpl.setCurrencySymbol(StringPool.BLANK);
		}
		else {
			currencyImpl.setCurrencySymbol(currencySymbol);
		}

		currencyImpl.resetOriginalValues();

		return currencyImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		currencyId = objectInput.readLong();
		currencyCode = objectInput.readUTF();
		currencyDesc = objectInput.readUTF();
		conversion = objectInput.readDouble();
		currencySymbol = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(currencyId);

		if (currencyCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(currencyCode);
		}

		if (currencyDesc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(currencyDesc);
		}

		objectOutput.writeDouble(conversion);

		if (currencySymbol == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(currencySymbol);
		}
	}

	public long currencyId;
	public String currencyCode;
	public String currencyDesc;
	public double conversion;
	public String currencySymbol;
}