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
 * Provides the remote service utility for Bridge. This utility wraps
 * {@link com.fingence.slayer.service.impl.BridgeServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Ahmed Hasan
 * @see BridgeService
 * @see com.fingence.slayer.service.base.BridgeServiceBaseImpl
 * @see com.fingence.slayer.service.impl.BridgeServiceImpl
 * @generated
 */
public class BridgeServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.fingence.slayer.service.impl.BridgeServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static java.util.List<com.liferay.portal.model.Organization> getInstitutions() {
		return getService().getInstitutions();
	}

	public static int getUserType(long userId) {
		return getService().getUserType(userId);
	}

	public static java.util.List<com.liferay.portal.model.User> getUsersByTargetType(
		long loggedInUserId, int targetUserType) {
		return getService().getUsersByTargetType(loggedInUserId, targetUserType);
	}

	public static com.liferay.portal.model.Organization getCurrentOrganization(
		long userId) {
		return getService().getCurrentOrganization(userId);
	}

	public static void assignRole(long loggedInUser, long createdUserId,
		int userType) {
		getService().assignRole(loggedInUser, createdUserId, userType);
	}

	public static void addWealthAdvisorFirm(java.lang.String firmName,
		long wealthAdvisorId) {
		getService().addWealthAdvisorFirm(firmName, wealthAdvisorId);
	}

	public static com.liferay.portal.model.User addUser(long creatorUserId,
		java.lang.String firstName, java.lang.String lastName,
		java.lang.String emailAddress, boolean male, long countryId,
		java.lang.String jobTitle) {
		return getService()
				   .addUser(creatorUserId, firstName, lastName, emailAddress,
			male, countryId, jobTitle);
	}

	public static java.lang.String getFirmName(long userId) {
		return getService().getFirmName(userId);
	}

	public static java.lang.String getOrganizationName(long organizationId) {
		return getService().getOrganizationName(organizationId);
	}

	public static java.lang.String getUserName(long userId) {
		return getService().getUserName(userId);
	}

	public static boolean isEmailExists(long companyId,
		java.lang.String emailAddress) {
		return getService().isEmailExists(companyId, emailAddress);
	}

	public static boolean isFirmExists(long companyId, java.lang.String firmName) {
		return getService().isFirmExists(companyId, firmName);
	}

	public static void clearService() {
		_service = null;
	}

	public static BridgeService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					BridgeService.class.getName());

			if (invokableService instanceof BridgeService) {
				_service = (BridgeService)invokableService;
			}
			else {
				_service = new BridgeServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(BridgeServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(BridgeService service) {
	}

	private static BridgeService _service;
}