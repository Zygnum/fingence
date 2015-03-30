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

package com.fingence.slayer.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ReportConfigService}.
 *
 * @author Ahmed Hasan
 * @see ReportConfigService
 * @generated
 */
public class ReportConfigServiceWrapper implements ReportConfigService,
	ServiceWrapper<ReportConfigService> {
	public ReportConfigServiceWrapper(ReportConfigService reportConfigService) {
		_reportConfigService = reportConfigService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _reportConfigService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_reportConfigService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _reportConfigService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray getTreeStructure(
		java.lang.String title) {
		return _reportConfigService.getTreeStructure(title);
	}

	@Override
	public com.fingence.slayer.model.ReportConfig getReportConfig(long reportId) {
		return _reportConfigService.getReportConfig(reportId);
	}

	@Override
	public com.fingence.slayer.model.ReportConfig setReportConfig(
		long reportId, boolean enabled) {
		return _reportConfigService.setReportConfig(reportId, enabled);
	}

	@Override
	public java.util.Map<java.lang.Long, java.lang.String> getMenuItems(
		long parentCategoryId) {
		return _reportConfigService.getMenuItems(parentCategoryId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ReportConfigService getWrappedReportConfigService() {
		return _reportConfigService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedReportConfigService(
		ReportConfigService reportConfigService) {
		_reportConfigService = reportConfigService;
	}

	@Override
	public ReportConfigService getWrappedService() {
		return _reportConfigService;
	}

	@Override
	public void setWrappedService(ReportConfigService reportConfigService) {
		_reportConfigService = reportConfigService;
	}

	private ReportConfigService _reportConfigService;
}