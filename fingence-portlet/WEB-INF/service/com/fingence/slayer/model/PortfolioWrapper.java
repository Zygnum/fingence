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
 * This class is a wrapper for {@link Portfolio}.
 * </p>
 *
 * @author Ahmed Hasan
 * @see Portfolio
 * @generated
 */
public class PortfolioWrapper implements Portfolio, ModelWrapper<Portfolio> {
	public PortfolioWrapper(Portfolio portfolio) {
		_portfolio = portfolio;
	}

	@Override
	public Class<?> getModelClass() {
		return Portfolio.class;
	}

	@Override
	public String getModelClassName() {
		return Portfolio.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("portfolioId", getPortfolioId());
		attributes.put("portfolioName", getPortfolioName());
		attributes.put("investorId", getInvestorId());
		attributes.put("wealthAdvisorId", getWealthAdvisorId());
		attributes.put("relationshipManagerId", getRelationshipManagerId());
		attributes.put("institutionId", getInstitutionId());
		attributes.put("trial", getTrial());
		attributes.put("primary", getPrimary());
		attributes.put("social", getSocial());
		attributes.put("baseCurrency", getBaseCurrency());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long portfolioId = (Long)attributes.get("portfolioId");

		if (portfolioId != null) {
			setPortfolioId(portfolioId);
		}

		String portfolioName = (String)attributes.get("portfolioName");

		if (portfolioName != null) {
			setPortfolioName(portfolioName);
		}

		Long investorId = (Long)attributes.get("investorId");

		if (investorId != null) {
			setInvestorId(investorId);
		}

		Long wealthAdvisorId = (Long)attributes.get("wealthAdvisorId");

		if (wealthAdvisorId != null) {
			setWealthAdvisorId(wealthAdvisorId);
		}

		Long relationshipManagerId = (Long)attributes.get(
				"relationshipManagerId");

		if (relationshipManagerId != null) {
			setRelationshipManagerId(relationshipManagerId);
		}

		Long institutionId = (Long)attributes.get("institutionId");

		if (institutionId != null) {
			setInstitutionId(institutionId);
		}

		Boolean trial = (Boolean)attributes.get("trial");

		if (trial != null) {
			setTrial(trial);
		}

		Boolean primary = (Boolean)attributes.get("primary");

		if (primary != null) {
			setPrimary(primary);
		}

		Boolean social = (Boolean)attributes.get("social");

		if (social != null) {
			setSocial(social);
		}

		String baseCurrency = (String)attributes.get("baseCurrency");

		if (baseCurrency != null) {
			setBaseCurrency(baseCurrency);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}
	}

	/**
	* Returns the primary key of this portfolio.
	*
	* @return the primary key of this portfolio
	*/
	@Override
	public long getPrimaryKey() {
		return _portfolio.getPrimaryKey();
	}

	/**
	* Sets the primary key of this portfolio.
	*
	* @param primaryKey the primary key of this portfolio
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_portfolio.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the portfolio ID of this portfolio.
	*
	* @return the portfolio ID of this portfolio
	*/
	@Override
	public long getPortfolioId() {
		return _portfolio.getPortfolioId();
	}

	/**
	* Sets the portfolio ID of this portfolio.
	*
	* @param portfolioId the portfolio ID of this portfolio
	*/
	@Override
	public void setPortfolioId(long portfolioId) {
		_portfolio.setPortfolioId(portfolioId);
	}

	/**
	* Returns the portfolio name of this portfolio.
	*
	* @return the portfolio name of this portfolio
	*/
	@Override
	public java.lang.String getPortfolioName() {
		return _portfolio.getPortfolioName();
	}

	/**
	* Sets the portfolio name of this portfolio.
	*
	* @param portfolioName the portfolio name of this portfolio
	*/
	@Override
	public void setPortfolioName(java.lang.String portfolioName) {
		_portfolio.setPortfolioName(portfolioName);
	}

	/**
	* Returns the investor ID of this portfolio.
	*
	* @return the investor ID of this portfolio
	*/
	@Override
	public long getInvestorId() {
		return _portfolio.getInvestorId();
	}

	/**
	* Sets the investor ID of this portfolio.
	*
	* @param investorId the investor ID of this portfolio
	*/
	@Override
	public void setInvestorId(long investorId) {
		_portfolio.setInvestorId(investorId);
	}

	/**
	* Returns the wealth advisor ID of this portfolio.
	*
	* @return the wealth advisor ID of this portfolio
	*/
	@Override
	public long getWealthAdvisorId() {
		return _portfolio.getWealthAdvisorId();
	}

	/**
	* Sets the wealth advisor ID of this portfolio.
	*
	* @param wealthAdvisorId the wealth advisor ID of this portfolio
	*/
	@Override
	public void setWealthAdvisorId(long wealthAdvisorId) {
		_portfolio.setWealthAdvisorId(wealthAdvisorId);
	}

	/**
	* Returns the relationship manager ID of this portfolio.
	*
	* @return the relationship manager ID of this portfolio
	*/
	@Override
	public long getRelationshipManagerId() {
		return _portfolio.getRelationshipManagerId();
	}

	/**
	* Sets the relationship manager ID of this portfolio.
	*
	* @param relationshipManagerId the relationship manager ID of this portfolio
	*/
	@Override
	public void setRelationshipManagerId(long relationshipManagerId) {
		_portfolio.setRelationshipManagerId(relationshipManagerId);
	}

	/**
	* Returns the institution ID of this portfolio.
	*
	* @return the institution ID of this portfolio
	*/
	@Override
	public long getInstitutionId() {
		return _portfolio.getInstitutionId();
	}

	/**
	* Sets the institution ID of this portfolio.
	*
	* @param institutionId the institution ID of this portfolio
	*/
	@Override
	public void setInstitutionId(long institutionId) {
		_portfolio.setInstitutionId(institutionId);
	}

	/**
	* Returns the trial of this portfolio.
	*
	* @return the trial of this portfolio
	*/
	@Override
	public boolean getTrial() {
		return _portfolio.getTrial();
	}

	/**
	* Returns <code>true</code> if this portfolio is trial.
	*
	* @return <code>true</code> if this portfolio is trial; <code>false</code> otherwise
	*/
	@Override
	public boolean isTrial() {
		return _portfolio.isTrial();
	}

	/**
	* Sets whether this portfolio is trial.
	*
	* @param trial the trial of this portfolio
	*/
	@Override
	public void setTrial(boolean trial) {
		_portfolio.setTrial(trial);
	}

	/**
	* Returns the primary of this portfolio.
	*
	* @return the primary of this portfolio
	*/
	@Override
	public boolean getPrimary() {
		return _portfolio.getPrimary();
	}

	/**
	* Returns <code>true</code> if this portfolio is primary.
	*
	* @return <code>true</code> if this portfolio is primary; <code>false</code> otherwise
	*/
	@Override
	public boolean isPrimary() {
		return _portfolio.isPrimary();
	}

	/**
	* Sets whether this portfolio is primary.
	*
	* @param primary the primary of this portfolio
	*/
	@Override
	public void setPrimary(boolean primary) {
		_portfolio.setPrimary(primary);
	}

	/**
	* Returns the social of this portfolio.
	*
	* @return the social of this portfolio
	*/
	@Override
	public boolean getSocial() {
		return _portfolio.getSocial();
	}

	/**
	* Returns <code>true</code> if this portfolio is social.
	*
	* @return <code>true</code> if this portfolio is social; <code>false</code> otherwise
	*/
	@Override
	public boolean isSocial() {
		return _portfolio.isSocial();
	}

	/**
	* Sets whether this portfolio is social.
	*
	* @param social the social of this portfolio
	*/
	@Override
	public void setSocial(boolean social) {
		_portfolio.setSocial(social);
	}

	/**
	* Returns the base currency of this portfolio.
	*
	* @return the base currency of this portfolio
	*/
	@Override
	public java.lang.String getBaseCurrency() {
		return _portfolio.getBaseCurrency();
	}

	/**
	* Sets the base currency of this portfolio.
	*
	* @param baseCurrency the base currency of this portfolio
	*/
	@Override
	public void setBaseCurrency(java.lang.String baseCurrency) {
		_portfolio.setBaseCurrency(baseCurrency);
	}

	/**
	* Returns the create date of this portfolio.
	*
	* @return the create date of this portfolio
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _portfolio.getCreateDate();
	}

	/**
	* Sets the create date of this portfolio.
	*
	* @param createDate the create date of this portfolio
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_portfolio.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this portfolio.
	*
	* @return the modified date of this portfolio
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _portfolio.getModifiedDate();
	}

	/**
	* Sets the modified date of this portfolio.
	*
	* @param modifiedDate the modified date of this portfolio
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_portfolio.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the company ID of this portfolio.
	*
	* @return the company ID of this portfolio
	*/
	@Override
	public long getCompanyId() {
		return _portfolio.getCompanyId();
	}

	/**
	* Sets the company ID of this portfolio.
	*
	* @param companyId the company ID of this portfolio
	*/
	@Override
	public void setCompanyId(long companyId) {
		_portfolio.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this portfolio.
	*
	* @return the user ID of this portfolio
	*/
	@Override
	public long getUserId() {
		return _portfolio.getUserId();
	}

	/**
	* Sets the user ID of this portfolio.
	*
	* @param userId the user ID of this portfolio
	*/
	@Override
	public void setUserId(long userId) {
		_portfolio.setUserId(userId);
	}

	/**
	* Returns the user uuid of this portfolio.
	*
	* @return the user uuid of this portfolio
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _portfolio.getUserUuid();
	}

	/**
	* Sets the user uuid of this portfolio.
	*
	* @param userUuid the user uuid of this portfolio
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_portfolio.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this portfolio.
	*
	* @return the user name of this portfolio
	*/
	@Override
	public java.lang.String getUserName() {
		return _portfolio.getUserName();
	}

	/**
	* Sets the user name of this portfolio.
	*
	* @param userName the user name of this portfolio
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_portfolio.setUserName(userName);
	}

	@Override
	public boolean isNew() {
		return _portfolio.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_portfolio.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _portfolio.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_portfolio.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _portfolio.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _portfolio.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_portfolio.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _portfolio.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_portfolio.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_portfolio.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_portfolio.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PortfolioWrapper((Portfolio)_portfolio.clone());
	}

	@Override
	public int compareTo(Portfolio portfolio) {
		return _portfolio.compareTo(portfolio);
	}

	@Override
	public int hashCode() {
		return _portfolio.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<Portfolio> toCacheModel() {
		return _portfolio.toCacheModel();
	}

	@Override
	public Portfolio toEscapedModel() {
		return new PortfolioWrapper(_portfolio.toEscapedModel());
	}

	@Override
	public Portfolio toUnescapedModel() {
		return new PortfolioWrapper(_portfolio.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _portfolio.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _portfolio.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_portfolio.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PortfolioWrapper)) {
			return false;
		}

		PortfolioWrapper portfolioWrapper = (PortfolioWrapper)obj;

		if (Validator.equals(_portfolio, portfolioWrapper._portfolio)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Portfolio getWrappedPortfolio() {
		return _portfolio;
	}

	@Override
	public Portfolio getWrappedModel() {
		return _portfolio;
	}

	@Override
	public void resetOriginalValues() {
		_portfolio.resetOriginalValues();
	}

	private Portfolio _portfolio;
}