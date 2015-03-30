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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for ReportConfig. This utility wraps
 * {@link com.fingence.slayer.service.impl.ReportConfigServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Ahmed Hasan
 * @see ReportConfigService
 * @see com.fingence.slayer.service.base.ReportConfigServiceBaseImpl
 * @see com.fingence.slayer.service.impl.ReportConfigServiceImpl
 * @generated
 */
public class ReportConfigServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.fingence.slayer.service.impl.ReportConfigServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static com.liferay.portal.kernel.json.JSONArray getTreeStructure(
		java.lang.String title) {
		return getService().getTreeStructure(title);
	}

	public static com.fingence.slayer.model.ReportConfig getReportConfig(
		long reportId) {
		return getService().getReportConfig(reportId);
	}

	public static com.fingence.slayer.model.ReportConfig setReportConfig(
		long reportId, boolean enabled) {
		return getService().setReportConfig(reportId, enabled);
	}

	public static java.util.Map<java.lang.Long, java.lang.String> getMenuItems(
		long parentCategoryId) {
		return getService().getMenuItems(parentCategoryId);
	}

	public static void clearService() {
		_service = null;
	}

	public static ReportConfigService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ReportConfigService.class.getName());

			if (invokableService instanceof ReportConfigService) {
				_service = (ReportConfigService)invokableService;
			}
			else {
				_service = new ReportConfigServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(ReportConfigServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(ReportConfigService service) {
	}

	private static ReportConfigService _service;
}