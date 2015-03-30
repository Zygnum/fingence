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

package com.fingence.slayer.service.http;

import com.fingence.slayer.service.BridgeServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.fingence.slayer.service.BridgeServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Ahmed Hasan
 * @see BridgeServiceHttp
 * @see com.fingence.slayer.service.BridgeServiceUtil
 * @generated
 */
public class BridgeServiceSoap {
	public static com.liferay.portal.model.Organization[] getInstitutions()
		throws RemoteException {
		try {
			java.util.List<com.liferay.portal.model.Organization> returnValue = BridgeServiceUtil.getInstitutions();

			return returnValue.toArray(new com.liferay.portal.model.Organization[returnValue.size()]);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int getUserType(long userId) throws RemoteException {
		try {
			int returnValue = BridgeServiceUtil.getUserType(userId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.model.User[] getUsersByTargetType(
		long loggedInUserId, int targetUserType) throws RemoteException {
		try {
			java.util.List<com.liferay.portal.model.User> returnValue = BridgeServiceUtil.getUsersByTargetType(loggedInUserId,
					targetUserType);

			return returnValue.toArray(new com.liferay.portal.model.User[returnValue.size()]);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.model.Organization getCurrentOrganization(
		long userId) throws RemoteException {
		try {
			com.liferay.portal.model.Organization returnValue = BridgeServiceUtil.getCurrentOrganization(userId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void assignRole(long loggedInUser, long createdUserId,
		int userType) throws RemoteException {
		try {
			BridgeServiceUtil.assignRole(loggedInUser, createdUserId, userType);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void addWealthAdvisorFirm(java.lang.String firmName,
		long wealthAdvisorId) throws RemoteException {
		try {
			BridgeServiceUtil.addWealthAdvisorFirm(firmName, wealthAdvisorId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.model.User addUser(long creatorUserId,
		java.lang.String firstName, java.lang.String lastName,
		java.lang.String emailAddress, boolean male, long countryId,
		java.lang.String jobTitle) throws RemoteException {
		try {
			com.liferay.portal.model.User returnValue = BridgeServiceUtil.addUser(creatorUserId,
					firstName, lastName, emailAddress, male, countryId, jobTitle);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String getFirmName(long userId)
		throws RemoteException {
		try {
			java.lang.String returnValue = BridgeServiceUtil.getFirmName(userId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String getOrganizationName(long organizationId)
		throws RemoteException {
		try {
			java.lang.String returnValue = BridgeServiceUtil.getOrganizationName(organizationId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String getUserName(long userId)
		throws RemoteException {
		try {
			java.lang.String returnValue = BridgeServiceUtil.getUserName(userId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static boolean isEmailExists(long companyId,
		java.lang.String emailAddress) throws RemoteException {
		try {
			boolean returnValue = BridgeServiceUtil.isEmailExists(companyId,
					emailAddress);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static boolean isFirmExists(long companyId, java.lang.String firmName)
		throws RemoteException {
		try {
			boolean returnValue = BridgeServiceUtil.isFirmExists(companyId,
					firmName);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(BridgeServiceSoap.class);
}