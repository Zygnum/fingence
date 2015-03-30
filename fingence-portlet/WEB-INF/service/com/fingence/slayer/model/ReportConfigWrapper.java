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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ReportConfig}.
 * </p>
 *
 * @author Ahmed Hasan
 * @see ReportConfig
 * @generated
 */
public class ReportConfigWrapper implements ReportConfig,
	ModelWrapper<ReportConfig> {
	public ReportConfigWrapper(ReportConfig reportConfig) {
		_reportConfig = reportConfig;
	}

	@Override
	public Class<?> getModelClass() {
		return ReportConfig.class;
	}

	@Override
	public String getModelClassName() {
		return ReportConfig.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("recId", getRecId());
		attributes.put("reportId", getReportId());
		attributes.put("enabled", getEnabled());
		attributes.put("classPK", getClassPK());
		attributes.put("classNameId", getClassNameId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long recId = (Long)attributes.get("recId");

		if (recId != null) {
			setRecId(recId);
		}

		Long reportId = (Long)attributes.get("reportId");

		if (reportId != null) {
			setReportId(reportId);
		}

		Boolean enabled = (Boolean)attributes.get("enabled");

		if (enabled != null) {
			setEnabled(enabled);
		}

		Long classPK = (Long)attributes.get("classPK");

		if (classPK != null) {
			setClassPK(classPK);
		}

		Long classNameId = (Long)attributes.get("classNameId");

		if (classNameId != null) {
			setClassNameId(classNameId);
		}
	}

	/**
	* Returns the primary key of this report config.
	*
	* @return the primary key of this report config
	*/
	@Override
	public long getPrimaryKey() {
		return _reportConfig.getPrimaryKey();
	}

	/**
	* Sets the primary key of this report config.
	*
	* @param primaryKey the primary key of this report config
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_reportConfig.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the rec ID of this report config.
	*
	* @return the rec ID of this report config
	*/
	@Override
	public long getRecId() {
		return _reportConfig.getRecId();
	}

	/**
	* Sets the rec ID of this report config.
	*
	* @param recId the rec ID of this report config
	*/
	@Override
	public void setRecId(long recId) {
		_reportConfig.setRecId(recId);
	}

	/**
	* Returns the report ID of this report config.
	*
	* @return the report ID of this report config
	*/
	@Override
	public long getReportId() {
		return _reportConfig.getReportId();
	}

	/**
	* Sets the report ID of this report config.
	*
	* @param reportId the report ID of this report config
	*/
	@Override
	public void setReportId(long reportId) {
		_reportConfig.setReportId(reportId);
	}

	/**
	* Returns the enabled of this report config.
	*
	* @return the enabled of this report config
	*/
	@Override
	public boolean getEnabled() {
		return _reportConfig.getEnabled();
	}

	/**
	* Returns <code>true</code> if this report config is enabled.
	*
	* @return <code>true</code> if this report config is enabled; <code>false</code> otherwise
	*/
	@Override
	public boolean isEnabled() {
		return _reportConfig.isEnabled();
	}

	/**
	* Sets whether this report config is enabled.
	*
	* @param enabled the enabled of this report config
	*/
	@Override
	public void setEnabled(boolean enabled) {
		_reportConfig.setEnabled(enabled);
	}

	/**
	* Returns the class p k of this report config.
	*
	* @return the class p k of this report config
	*/
	@Override
	public long getClassPK() {
		return _reportConfig.getClassPK();
	}

	/**
	* Sets the class p k of this report config.
	*
	* @param classPK the class p k of this report config
	*/
	@Override
	public void setClassPK(long classPK) {
		_reportConfig.setClassPK(classPK);
	}

	/**
	* Returns the fully qualified class name of this report config.
	*
	* @return the fully qualified class name of this report config
	*/
	@Override
	public java.lang.String getClassName() {
		return _reportConfig.getClassName();
	}

	@Override
	public void setClassName(java.lang.String className) {
		_reportConfig.setClassName(className);
	}

	/**
	* Returns the class name ID of this report config.
	*
	* @return the class name ID of this report config
	*/
	@Override
	public long getClassNameId() {
		return _reportConfig.getClassNameId();
	}

	/**
	* Sets the class name ID of this report config.
	*
	* @param classNameId the class name ID of this report config
	*/
	@Override
	public void setClassNameId(long classNameId) {
		_reportConfig.setClassNameId(classNameId);
	}

	@Override
	public boolean isNew() {
		return _reportConfig.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_reportConfig.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _reportConfig.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_reportConfig.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _reportConfig.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _reportConfig.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_reportConfig.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _reportConfig.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_reportConfig.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_reportConfig.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_reportConfig.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ReportConfigWrapper((ReportConfig)_reportConfig.clone());
	}

	@Override
	public int compareTo(ReportConfig reportConfig) {
		return _reportConfig.compareTo(reportConfig);
	}

	@Override
	public int hashCode() {
		return _reportConfig.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<ReportConfig> toCacheModel() {
		return _reportConfig.toCacheModel();
	}

	@Override
	public ReportConfig toEscapedModel() {
		return new ReportConfigWrapper(_reportConfig.toEscapedModel());
	}

	@Override
	public ReportConfig toUnescapedModel() {
		return new ReportConfigWrapper(_reportConfig.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _reportConfig.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _reportConfig.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_reportConfig.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ReportConfigWrapper)) {
			return false;
		}

		ReportConfigWrapper reportConfigWrapper = (ReportConfigWrapper)obj;

		if (Validator.equals(_reportConfig, reportConfigWrapper._reportConfig)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ReportConfig getWrappedReportConfig() {
		return _reportConfig;
	}

	@Override
	public ReportConfig getWrappedModel() {
		return _reportConfig;
	}

	@Override
	public void resetOriginalValues() {
		_reportConfig.resetOriginalValues();
	}

	private ReportConfig _reportConfig;
}