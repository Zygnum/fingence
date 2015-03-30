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

import com.fingence.slayer.model.Portfolio;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Portfolio in entity cache.
 *
 * @author Ahmed Hasan
 * @see Portfolio
 * @generated
 */
public class PortfolioCacheModel implements CacheModel<Portfolio>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{portfolioId=");
		sb.append(portfolioId);
		sb.append(", portfolioName=");
		sb.append(portfolioName);
		sb.append(", investorId=");
		sb.append(investorId);
		sb.append(", wealthAdvisorId=");
		sb.append(wealthAdvisorId);
		sb.append(", relationshipManagerId=");
		sb.append(relationshipManagerId);
		sb.append(", institutionId=");
		sb.append(institutionId);
		sb.append(", trial=");
		sb.append(trial);
		sb.append(", primary=");
		sb.append(primary);
		sb.append(", social=");
		sb.append(social);
		sb.append(", baseCurrency=");
		sb.append(baseCurrency);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Portfolio toEntityModel() {
		PortfolioImpl portfolioImpl = new PortfolioImpl();

		portfolioImpl.setPortfolioId(portfolioId);

		if (portfolioName == null) {
			portfolioImpl.setPortfolioName(StringPool.BLANK);
		}
		else {
			portfolioImpl.setPortfolioName(portfolioName);
		}

		portfolioImpl.setInvestorId(investorId);
		portfolioImpl.setWealthAdvisorId(wealthAdvisorId);
		portfolioImpl.setRelationshipManagerId(relationshipManagerId);
		portfolioImpl.setInstitutionId(institutionId);
		portfolioImpl.setTrial(trial);
		portfolioImpl.setPrimary(primary);
		portfolioImpl.setSocial(social);

		if (baseCurrency == null) {
			portfolioImpl.setBaseCurrency(StringPool.BLANK);
		}
		else {
			portfolioImpl.setBaseCurrency(baseCurrency);
		}

		if (createDate == Long.MIN_VALUE) {
			portfolioImpl.setCreateDate(null);
		}
		else {
			portfolioImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			portfolioImpl.setModifiedDate(null);
		}
		else {
			portfolioImpl.setModifiedDate(new Date(modifiedDate));
		}

		portfolioImpl.setCompanyId(companyId);
		portfolioImpl.setUserId(userId);

		if (userName == null) {
			portfolioImpl.setUserName(StringPool.BLANK);
		}
		else {
			portfolioImpl.setUserName(userName);
		}

		portfolioImpl.resetOriginalValues();

		return portfolioImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		portfolioId = objectInput.readLong();
		portfolioName = objectInput.readUTF();
		investorId = objectInput.readLong();
		wealthAdvisorId = objectInput.readLong();
		relationshipManagerId = objectInput.readLong();
		institutionId = objectInput.readLong();
		trial = objectInput.readBoolean();
		primary = objectInput.readBoolean();
		social = objectInput.readBoolean();
		baseCurrency = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(portfolioId);

		if (portfolioName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portfolioName);
		}

		objectOutput.writeLong(investorId);
		objectOutput.writeLong(wealthAdvisorId);
		objectOutput.writeLong(relationshipManagerId);
		objectOutput.writeLong(institutionId);
		objectOutput.writeBoolean(trial);
		objectOutput.writeBoolean(primary);
		objectOutput.writeBoolean(social);

		if (baseCurrency == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(baseCurrency);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}
	}

	public long portfolioId;
	public String portfolioName;
	public long investorId;
	public long wealthAdvisorId;
	public long relationshipManagerId;
	public long institutionId;
	public boolean trial;
	public boolean primary;
	public boolean social;
	public String baseCurrency;
	public long createDate;
	public long modifiedDate;
	public long companyId;
	public long userId;
	public String userName;
}