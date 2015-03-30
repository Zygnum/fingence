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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.fingence.slayer.service.http.ReportConfigServiceSoap}.
 *
 * @author Ahmed Hasan
 * @see com.fingence.slayer.service.http.ReportConfigServiceSoap
 * @generated
 */
public class ReportConfigSoap implements Serializable {
	public static ReportConfigSoap toSoapModel(ReportConfig model) {
		ReportConfigSoap soapModel = new ReportConfigSoap();

		soapModel.setRecId(model.getRecId());
		soapModel.setReportId(model.getReportId());
		soapModel.setEnabled(model.getEnabled());
		soapModel.setClassPK(model.getClassPK());
		soapModel.setClassNameId(model.getClassNameId());

		return soapModel;
	}

	public static ReportConfigSoap[] toSoapModels(ReportConfig[] models) {
		ReportConfigSoap[] soapModels = new ReportConfigSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ReportConfigSoap[][] toSoapModels(ReportConfig[][] models) {
		ReportConfigSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ReportConfigSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ReportConfigSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ReportConfigSoap[] toSoapModels(List<ReportConfig> models) {
		List<ReportConfigSoap> soapModels = new ArrayList<ReportConfigSoap>(models.size());

		for (ReportConfig model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ReportConfigSoap[soapModels.size()]);
	}

	public ReportConfigSoap() {
	}

	public long getPrimaryKey() {
		return _recId;
	}

	public void setPrimaryKey(long pk) {
		setRecId(pk);
	}

	public long getRecId() {
		return _recId;
	}

	public void setRecId(long recId) {
		_recId = recId;
	}

	public long getReportId() {
		return _reportId;
	}

	public void setReportId(long reportId) {
		_reportId = reportId;
	}

	public boolean getEnabled() {
		return _enabled;
	}

	public boolean isEnabled() {
		return _enabled;
	}

	public void setEnabled(boolean enabled) {
		_enabled = enabled;
	}

	public long getClassPK() {
		return _classPK;
	}

	public void setClassPK(long classPK) {
		_classPK = classPK;
	}

	public long getClassNameId() {
		return _classNameId;
	}

	public void setClassNameId(long classNameId) {
		_classNameId = classNameId;
	}

	private long _recId;
	private long _reportId;
	private boolean _enabled;
	private long _classPK;
	private long _classNameId;
}