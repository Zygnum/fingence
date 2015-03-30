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
import com.fingence.slayer.service.ReportConfigLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the ReportConfig service. Represents a row in the &quot;fing_ReportConfig&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ReportConfigImpl}.
 * </p>
 *
 * @author Ahmed Hasan
 * @see ReportConfigImpl
 * @see com.fingence.slayer.model.ReportConfig
 * @generated
 */
public abstract class ReportConfigBaseImpl extends ReportConfigModelImpl
	implements ReportConfig {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a report config model instance should use the {@link ReportConfig} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ReportConfigLocalServiceUtil.addReportConfig(this);
		}
		else {
			ReportConfigLocalServiceUtil.updateReportConfig(this);
		}
	}
}