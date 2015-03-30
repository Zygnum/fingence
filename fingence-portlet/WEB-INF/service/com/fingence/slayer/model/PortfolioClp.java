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

import com.fingence.slayer.service.ClpSerializer;
import com.fingence.slayer.service.PortfolioLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ahmed Hasan
 */
public class PortfolioClp extends BaseModelImpl<Portfolio> implements Portfolio {
	public PortfolioClp() {
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
	public long getPrimaryKey() {
		return _portfolioId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPortfolioId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _portfolioId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getPortfolioId() {
		return _portfolioId;
	}

	@Override
	public void setPortfolioId(long portfolioId) {
		_portfolioId = portfolioId;

		if (_portfolioRemoteModel != null) {
			try {
				Class<?> clazz = _portfolioRemoteModel.getClass();

				Method method = clazz.getMethod("setPortfolioId", long.class);

				method.invoke(_portfolioRemoteModel, portfolioId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPortfolioName() {
		return _portfolioName;
	}

	@Override
	public void setPortfolioName(String portfolioName) {
		_portfolioName = portfolioName;

		if (_portfolioRemoteModel != null) {
			try {
				Class<?> clazz = _portfolioRemoteModel.getClass();

				Method method = clazz.getMethod("setPortfolioName", String.class);

				method.invoke(_portfolioRemoteModel, portfolioName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getInvestorId() {
		return _investorId;
	}

	@Override
	public void setInvestorId(long investorId) {
		_investorId = investorId;

		if (_portfolioRemoteModel != null) {
			try {
				Class<?> clazz = _portfolioRemoteModel.getClass();

				Method method = clazz.getMethod("setInvestorId", long.class);

				method.invoke(_portfolioRemoteModel, investorId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getWealthAdvisorId() {
		return _wealthAdvisorId;
	}

	@Override
	public void setWealthAdvisorId(long wealthAdvisorId) {
		_wealthAdvisorId = wealthAdvisorId;

		if (_portfolioRemoteModel != null) {
			try {
				Class<?> clazz = _portfolioRemoteModel.getClass();

				Method method = clazz.getMethod("setWealthAdvisorId", long.class);

				method.invoke(_portfolioRemoteModel, wealthAdvisorId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getRelationshipManagerId() {
		return _relationshipManagerId;
	}

	@Override
	public void setRelationshipManagerId(long relationshipManagerId) {
		_relationshipManagerId = relationshipManagerId;

		if (_portfolioRemoteModel != null) {
			try {
				Class<?> clazz = _portfolioRemoteModel.getClass();

				Method method = clazz.getMethod("setRelationshipManagerId",
						long.class);

				method.invoke(_portfolioRemoteModel, relationshipManagerId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getInstitutionId() {
		return _institutionId;
	}

	@Override
	public void setInstitutionId(long institutionId) {
		_institutionId = institutionId;

		if (_portfolioRemoteModel != null) {
			try {
				Class<?> clazz = _portfolioRemoteModel.getClass();

				Method method = clazz.getMethod("setInstitutionId", long.class);

				method.invoke(_portfolioRemoteModel, institutionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getTrial() {
		return _trial;
	}

	@Override
	public boolean isTrial() {
		return _trial;
	}

	@Override
	public void setTrial(boolean trial) {
		_trial = trial;

		if (_portfolioRemoteModel != null) {
			try {
				Class<?> clazz = _portfolioRemoteModel.getClass();

				Method method = clazz.getMethod("setTrial", boolean.class);

				method.invoke(_portfolioRemoteModel, trial);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getPrimary() {
		return _primary;
	}

	@Override
	public boolean isPrimary() {
		return _primary;
	}

	@Override
	public void setPrimary(boolean primary) {
		_primary = primary;

		if (_portfolioRemoteModel != null) {
			try {
				Class<?> clazz = _portfolioRemoteModel.getClass();

				Method method = clazz.getMethod("setPrimary", boolean.class);

				method.invoke(_portfolioRemoteModel, primary);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getSocial() {
		return _social;
	}

	@Override
	public boolean isSocial() {
		return _social;
	}

	@Override
	public void setSocial(boolean social) {
		_social = social;

		if (_portfolioRemoteModel != null) {
			try {
				Class<?> clazz = _portfolioRemoteModel.getClass();

				Method method = clazz.getMethod("setSocial", boolean.class);

				method.invoke(_portfolioRemoteModel, social);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBaseCurrency() {
		return _baseCurrency;
	}

	@Override
	public void setBaseCurrency(String baseCurrency) {
		_baseCurrency = baseCurrency;

		if (_portfolioRemoteModel != null) {
			try {
				Class<?> clazz = _portfolioRemoteModel.getClass();

				Method method = clazz.getMethod("setBaseCurrency", String.class);

				method.invoke(_portfolioRemoteModel, baseCurrency);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_portfolioRemoteModel != null) {
			try {
				Class<?> clazz = _portfolioRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_portfolioRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_portfolioRemoteModel != null) {
			try {
				Class<?> clazz = _portfolioRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_portfolioRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_portfolioRemoteModel != null) {
			try {
				Class<?> clazz = _portfolioRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_portfolioRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_portfolioRemoteModel != null) {
			try {
				Class<?> clazz = _portfolioRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_portfolioRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_portfolioRemoteModel != null) {
			try {
				Class<?> clazz = _portfolioRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_portfolioRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPortfolioRemoteModel() {
		return _portfolioRemoteModel;
	}

	public void setPortfolioRemoteModel(BaseModel<?> portfolioRemoteModel) {
		_portfolioRemoteModel = portfolioRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _portfolioRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_portfolioRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PortfolioLocalServiceUtil.addPortfolio(this);
		}
		else {
			PortfolioLocalServiceUtil.updatePortfolio(this);
		}
	}

	@Override
	public Portfolio toEscapedModel() {
		return (Portfolio)ProxyUtil.newProxyInstance(Portfolio.class.getClassLoader(),
			new Class[] { Portfolio.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PortfolioClp clone = new PortfolioClp();

		clone.setPortfolioId(getPortfolioId());
		clone.setPortfolioName(getPortfolioName());
		clone.setInvestorId(getInvestorId());
		clone.setWealthAdvisorId(getWealthAdvisorId());
		clone.setRelationshipManagerId(getRelationshipManagerId());
		clone.setInstitutionId(getInstitutionId());
		clone.setTrial(getTrial());
		clone.setPrimary(getPrimary());
		clone.setSocial(getSocial());
		clone.setBaseCurrency(getBaseCurrency());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());

		return clone;
	}

	@Override
	public int compareTo(Portfolio portfolio) {
		int value = 0;

		if (getPrimary() == portfolio.getPrimary()) {
			value = -1;
		}
		else if (getPrimary() != portfolio.getPrimary()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PortfolioClp)) {
			return false;
		}

		PortfolioClp portfolio = (PortfolioClp)obj;

		long primaryKey = portfolio.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{portfolioId=");
		sb.append(getPortfolioId());
		sb.append(", portfolioName=");
		sb.append(getPortfolioName());
		sb.append(", investorId=");
		sb.append(getInvestorId());
		sb.append(", wealthAdvisorId=");
		sb.append(getWealthAdvisorId());
		sb.append(", relationshipManagerId=");
		sb.append(getRelationshipManagerId());
		sb.append(", institutionId=");
		sb.append(getInstitutionId());
		sb.append(", trial=");
		sb.append(getTrial());
		sb.append(", primary=");
		sb.append(getPrimary());
		sb.append(", social=");
		sb.append(getSocial());
		sb.append(", baseCurrency=");
		sb.append(getBaseCurrency());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("com.fingence.slayer.model.Portfolio");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>portfolioId</column-name><column-value><![CDATA[");
		sb.append(getPortfolioId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>portfolioName</column-name><column-value><![CDATA[");
		sb.append(getPortfolioName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>investorId</column-name><column-value><![CDATA[");
		sb.append(getInvestorId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wealthAdvisorId</column-name><column-value><![CDATA[");
		sb.append(getWealthAdvisorId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>relationshipManagerId</column-name><column-value><![CDATA[");
		sb.append(getRelationshipManagerId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>institutionId</column-name><column-value><![CDATA[");
		sb.append(getInstitutionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trial</column-name><column-value><![CDATA[");
		sb.append(getTrial());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>primary</column-name><column-value><![CDATA[");
		sb.append(getPrimary());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>social</column-name><column-value><![CDATA[");
		sb.append(getSocial());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>baseCurrency</column-name><column-value><![CDATA[");
		sb.append(getBaseCurrency());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private String _userUuid;
	private String _userName;
	private BaseModel<?> _portfolioRemoteModel;
}