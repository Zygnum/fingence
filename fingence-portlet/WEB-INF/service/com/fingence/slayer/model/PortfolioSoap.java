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
 * This class is used by SOAP remote services, specifically {@link com.fingence.slayer.service.http.PortfolioServiceSoap}.
 *
 * @author Ahmed Hasan
 * @see com.fingence.slayer.service.http.PortfolioServiceSoap
 * @generated
 */
public class PortfolioSoap implements Serializable {
	public static PortfolioSoap toSoapModel(Portfolio model) {
		PortfolioSoap soapModel = new PortfolioSoap();

		soapModel.setPortfolioId(model.getPortfolioId());
		soapModel.setPortfolioName(model.getPortfolioName());
		soapModel.setInvestorId(model.getInvestorId());
		soapModel.setWealthAdvisorId(model.getWealthAdvisorId());
		soapModel.setRelationshipManagerId(model.getRelationshipManagerId());
		soapModel.setInstitutionId(model.getInstitutionId());
		soapModel.setTrial(model.getTrial());
		soapModel.setPrimary(model.getPrimary());
		soapModel.setSocial(model.getSocial());
		soapModel.setBaseCurrency(model.getBaseCurrency());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());

		return soapModel;
	}

	public static PortfolioSoap[] toSoapModels(Portfolio[] models) {
		PortfolioSoap[] soapModels = new PortfolioSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PortfolioSoap[][] toSoapModels(Portfolio[][] models) {
		PortfolioSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PortfolioSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PortfolioSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PortfolioSoap[] toSoapModels(List<Portfolio> models) {
		List<PortfolioSoap> soapModels = new ArrayList<PortfolioSoap>(models.size());

		for (Portfolio model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PortfolioSoap[soapModels.size()]);
	}

	public PortfolioSoap() {
	}

	public long getPrimaryKey() {
		return _portfolioId;
	}

	public void setPrimaryKey(long pk) {
		setPortfolioId(pk);
	}

	public long getPortfolioId() {
		return _portfolioId;
	}

	public void setPortfolioId(long portfolioId) {
		_portfolioId = portfolioId;
	}

	public String getPortfolioName() {
		return _portfolioName;
	}

	public void setPortfolioName(String portfolioName) {
		_portfolioName = portfolioName;
	}

	public long getInvestorId() {
		return _investorId;
	}

	public void setInvestorId(long investorId) {
		_investorId = investorId;
	}

	public long getWealthAdvisorId() {
		return _wealthAdvisorId;
	}

	public void setWealthAdvisorId(long wealthAdvisorId) {
		_wealthAdvisorId = wealthAdvisorId;
	}

	public long getRelationshipManagerId() {
		return _relationshipManagerId;
	}

	public void setRelationshipManagerId(long relationshipManagerId) {
		_relationshipManagerId = relationshipManagerId;
	}

	public long getInstitutionId() {
		return _institutionId;
	}

	public void setInstitutionId(long institutionId) {
		_institutionId = institutionId;
	}

	public boolean getTrial() {
		return _trial;
	}

	public boolean isTrial() {
		return _trial;
	}

	public void setTrial(boolean trial) {
		_trial = trial;
	}

	public boolean getPrimary() {
		return _primary;
	}

	public boolean isPrimary() {
		return _primary;
	}

	public void setPrimary(boolean primary) {
		_primary = primary;
	}

	public boolean getSocial() {
		return _social;
	}

	public boolean isSocial() {
		return _social;
	}

	public void setSocial(boolean social) {
		_social = social;
	}

	public String getBaseCurrency() {
		return _baseCurrency;
	}

	public void setBaseCurrency(String baseCurrency) {
		_baseCurrency = baseCurrency;
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

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	private long _portfolioId;
	private String _portfolioName;
	private long _investorId;
	private long _wealthAdvisorId;
	private long _relationshipManagerId;
	private long _institutionId;
	private boolean _trial;
	private boolean _primary;
	private boolean _social;
	private String _baseCurrency;
	private Date _createDate;
	private Date _modifiedDate;
	private long _companyId;
	private long _userId;
	private String _userName;
}