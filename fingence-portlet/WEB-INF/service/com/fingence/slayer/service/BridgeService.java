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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.security.ac.AccessControlled;
import com.liferay.portal.service.BaseService;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service interface for Bridge. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Ahmed Hasan
 * @see BridgeServiceUtil
 * @see com.fingence.slayer.service.base.BridgeServiceBaseImpl
 * @see com.fingence.slayer.service.impl.BridgeServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface BridgeService extends BaseService, InvokableService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BridgeServiceUtil} to access the bridge remote service. Add custom service methods to {@link com.fingence.slayer.service.impl.BridgeServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portal.model.Organization> getInstitutions();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getUserType(long userId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.liferay.portal.model.User> getUsersByTargetType(
		long loggedInUserId, int targetUserType);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.Organization getCurrentOrganization(
		long userId);

	public void assignRole(long loggedInUser, long createdUserId, int userType);

	public void addWealthAdvisorFirm(java.lang.String firmName,
		long wealthAdvisorId);

	public com.liferay.portal.model.User addUser(long creatorUserId,
		java.lang.String firstName, java.lang.String lastName,
		java.lang.String emailAddress, boolean male, long countryId,
		java.lang.String jobTitle);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.lang.String getFirmName(long userId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.lang.String getOrganizationName(long organizationId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.lang.String getUserName(long userId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean isEmailExists(long companyId, java.lang.String emailAddress);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean isFirmExists(long companyId, java.lang.String firmName);
}