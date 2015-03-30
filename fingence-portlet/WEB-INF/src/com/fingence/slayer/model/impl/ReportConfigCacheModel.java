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

import com.fingence.slayer.model.ReportConfig;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ReportConfig in entity cache.
 *
 * @author Ahmed Hasan
 * @see ReportConfig
 * @generated
 */
public class ReportConfigCacheModel implements CacheModel<ReportConfig>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{recId=");
		sb.append(recId);
		sb.append(", reportId=");
		sb.append(reportId);
		sb.append(", enabled=");
		sb.append(enabled);
		sb.append(", classPK=");
		sb.append(classPK);
		sb.append(", classNameId=");
		sb.append(classNameId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ReportConfig toEntityModel() {
		ReportConfigImpl reportConfigImpl = new ReportConfigImpl();

		reportConfigImpl.setRecId(recId);
		reportConfigImpl.setReportId(reportId);
		reportConfigImpl.setEnabled(enabled);
		reportConfigImpl.setClassPK(classPK);
		reportConfigImpl.setClassNameId(classNameId);

		reportConfigImpl.resetOriginalValues();

		return reportConfigImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		recId = objectInput.readLong();
		reportId = objectInput.readLong();
		enabled = objectInput.readBoolean();
		classPK = objectInput.readLong();
		classNameId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(recId);
		objectOutput.writeLong(reportId);
		objectOutput.writeBoolean(enabled);
		objectOutput.writeLong(classPK);
		objectOutput.writeLong(classNameId);
	}

	public long recId;
	public long reportId;
	public boolean enabled;
	public long classPK;
	public long classNameId;
}