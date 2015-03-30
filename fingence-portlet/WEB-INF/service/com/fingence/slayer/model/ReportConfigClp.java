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
import com.fingence.slayer.service.ReportConfigLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ahmed Hasan
 */
public class ReportConfigClp extends BaseModelImpl<ReportConfig>
	implements ReportConfig {
	public ReportConfigClp() {
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
	public long getPrimaryKey() {
		return _recId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setRecId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _recId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getRecId() {
		return _recId;
	}

	@Override
	public void setRecId(long recId) {
		_recId = recId;

		if (_reportConfigRemoteModel != null) {
			try {
				Class<?> clazz = _reportConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setRecId", long.class);

				method.invoke(_reportConfigRemoteModel, recId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getReportId() {
		return _reportId;
	}

	@Override
	public void setReportId(long reportId) {
		_reportId = reportId;

		if (_reportConfigRemoteModel != null) {
			try {
				Class<?> clazz = _reportConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setReportId", long.class);

				method.invoke(_reportConfigRemoteModel, reportId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getEnabled() {
		return _enabled;
	}

	@Override
	public boolean isEnabled() {
		return _enabled;
	}

	@Override
	public void setEnabled(boolean enabled) {
		_enabled = enabled;

		if (_reportConfigRemoteModel != null) {
			try {
				Class<?> clazz = _reportConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setEnabled", boolean.class);

				method.invoke(_reportConfigRemoteModel, enabled);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getClassPK() {
		return _classPK;
	}

	@Override
	public void setClassPK(long classPK) {
		_classPK = classPK;

		if (_reportConfigRemoteModel != null) {
			try {
				Class<?> clazz = _reportConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setClassPK", long.class);

				method.invoke(_reportConfigRemoteModel, classPK);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getClassName() {
		if (getClassNameId() <= 0) {
			return StringPool.BLANK;
		}

		return PortalUtil.getClassName(getClassNameId());
	}

	@Override
	public void setClassName(String className) {
		long classNameId = 0;

		if (Validator.isNotNull(className)) {
			classNameId = PortalUtil.getClassNameId(className);
		}

		setClassNameId(classNameId);
	}

	@Override
	public long getClassNameId() {
		return _classNameId;
	}

	@Override
	public void setClassNameId(long classNameId) {
		_classNameId = classNameId;

		if (_reportConfigRemoteModel != null) {
			try {
				Class<?> clazz = _reportConfigRemoteModel.getClass();

				Method method = clazz.getMethod("setClassNameId", long.class);

				method.invoke(_reportConfigRemoteModel, classNameId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getReportConfigRemoteModel() {
		return _reportConfigRemoteModel;
	}

	public void setReportConfigRemoteModel(BaseModel<?> reportConfigRemoteModel) {
		_reportConfigRemoteModel = reportConfigRemoteModel;
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

		Class<?> remoteModelClass = _reportConfigRemoteModel.getClass();

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

		Object returnValue = method.invoke(_reportConfigRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ReportConfigLocalServiceUtil.addReportConfig(this);
		}
		else {
			ReportConfigLocalServiceUtil.updateReportConfig(this);
		}
	}

	@Override
	public ReportConfig toEscapedModel() {
		return (ReportConfig)ProxyUtil.newProxyInstance(ReportConfig.class.getClassLoader(),
			new Class[] { ReportConfig.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ReportConfigClp clone = new ReportConfigClp();

		clone.setRecId(getRecId());
		clone.setReportId(getReportId());
		clone.setEnabled(getEnabled());
		clone.setClassPK(getClassPK());
		clone.setClassNameId(getClassNameId());

		return clone;
	}

	@Override
	public int compareTo(ReportConfig reportConfig) {
		long primaryKey = reportConfig.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ReportConfigClp)) {
			return false;
		}

		ReportConfigClp reportConfig = (ReportConfigClp)obj;

		long primaryKey = reportConfig.getPrimaryKey();

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
		StringBundler sb = new StringBundler(11);

		sb.append("{recId=");
		sb.append(getRecId());
		sb.append(", reportId=");
		sb.append(getReportId());
		sb.append(", enabled=");
		sb.append(getEnabled());
		sb.append(", classPK=");
		sb.append(getClassPK());
		sb.append(", classNameId=");
		sb.append(getClassNameId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.fingence.slayer.model.ReportConfig");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>recId</column-name><column-value><![CDATA[");
		sb.append(getRecId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reportId</column-name><column-value><![CDATA[");
		sb.append(getReportId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enabled</column-name><column-value><![CDATA[");
		sb.append(getEnabled());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>classPK</column-name><column-value><![CDATA[");
		sb.append(getClassPK());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>classNameId</column-name><column-value><![CDATA[");
		sb.append(getClassNameId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _recId;
	private long _reportId;
	private boolean _enabled;
	private long _classPK;
	private long _classNameId;
	private BaseModel<?> _reportConfigRemoteModel;
}