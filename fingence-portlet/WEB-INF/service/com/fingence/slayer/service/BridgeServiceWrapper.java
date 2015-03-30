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
 * Provides a wrapper for {@link BridgeService}.
 *
 * @author Ahmed Hasan
 * @see BridgeService
 * @generated
 */
public class BridgeServiceWrapper implements BridgeService,
	ServiceWrapper<BridgeService> {
	public BridgeServiceWrapper(BridgeService bridgeService) {
		_bridgeService = bridgeService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _bridgeService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_bridgeService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _bridgeService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.util.List<com.liferay.portal.model.Organization> getInstitutions() {
		return _bridgeService.getInstitutions();
	}

	@Override
	public int getUserType(long userId) {
		return _bridgeService.getUserType(userId);
	}

	@Override
	public java.util.List<com.liferay.portal.model.User> getUsersByTargetType(
		long loggedInUserId, int targetUserType) {
		return _bridgeService.getUsersByTargetType(loggedInUserId,
			targetUserType);
	}

	@Override
	public com.liferay.portal.model.Organization getCurrentOrganization(
		long userId) {
		return _bridgeService.getCurrentOrganization(userId);
	}

	@Override
	public void assignRole(long loggedInUser, long createdUserId, int userType) {
		_bridgeService.assignRole(loggedInUser, createdUserId, userType);
	}

	@Override
	public void addWealthAdvisorFirm(java.lang.String firmName,
		long wealthAdvisorId) {
		_bridgeService.addWealthAdvisorFirm(firmName, wealthAdvisorId);
	}

	@Override
	public com.liferay.portal.model.User addUser(long creatorUserId,
		java.lang.String firstName, java.lang.String lastName,
		java.lang.String emailAddress, boolean male, long countryId,
		java.lang.String jobTitle) {
		return _bridgeService.addUser(creatorUserId, firstName, lastName,
			emailAddress, male, countryId, jobTitle);
	}

	@Override
	public java.lang.String getFirmName(long userId) {
		return _bridgeService.getFirmName(userId);
	}

	@Override
	public java.lang.String getOrganizationName(long organizationId) {
		return _bridgeService.getOrganizationName(organizationId);
	}

	@Override
	public java.lang.String getUserName(long userId) {
		return _bridgeService.getUserName(userId);
	}

	@Override
	public boolean isEmailExists(long companyId, java.lang.String emailAddress) {
		return _bridgeService.isEmailExists(companyId, emailAddress);
	}

	@Override
	public boolean isFirmExists(long companyId, java.lang.String firmName) {
		return _bridgeService.isFirmExists(companyId, firmName);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public BridgeService getWrappedBridgeService() {
		return _bridgeService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedBridgeService(BridgeService bridgeService) {
		_bridgeService = bridgeService;
	}

	@Override
	public BridgeService getWrappedService() {
		return _bridgeService;
	}

	@Override
	public void setWrappedService(BridgeService bridgeService) {
		_bridgeService = bridgeService;
	}

	private BridgeService _bridgeService;
}