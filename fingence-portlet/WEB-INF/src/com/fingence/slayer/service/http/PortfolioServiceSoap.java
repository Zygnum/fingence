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

import com.fingence.slayer.service.PortfolioServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.fingence.slayer.service.PortfolioServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.fingence.slayer.model.PortfolioSoap}.
 * If the method in the service utility returns a
 * {@link com.fingence.slayer.model.Portfolio}, that is translated to a
 * {@link com.fingence.slayer.model.PortfolioSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
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
 * @see PortfolioServiceHttp
 * @see com.fingence.slayer.model.PortfolioSoap
 * @see com.fingence.slayer.service.PortfolioServiceUtil
 * @generated
 */
public class PortfolioServiceSoap {
	public static void makePrimary(long portfolioId) throws RemoteException {
		try {
			PortfolioServiceUtil.makePrimary(portfolioId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.fingence.slayer.model.PortfolioSoap[] getPortfolios(
		long userId) throws RemoteException {
		try {
			java.util.List<com.fingence.slayer.model.Portfolio> returnValue = PortfolioServiceUtil.getPortfolios(userId);

			return com.fingence.slayer.model.PortfolioSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static long getDefault(long userId) throws RemoteException {
		try {
			long returnValue = PortfolioServiceUtil.getDefault(userId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int getPortoliosCount(long userId) throws RemoteException {
		try {
			int returnValue = PortfolioServiceUtil.getPortoliosCount(userId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.fingence.slayer.model.PortfolioSoap getPortfolio(
		long portfolioId) throws RemoteException {
		try {
			com.fingence.slayer.model.Portfolio returnValue = PortfolioServiceUtil.getPortfolio(portfolioId);

			return com.fingence.slayer.model.PortfolioSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String getPortfolioName(long portfolioId)
		throws RemoteException {
		try {
			java.lang.String returnValue = PortfolioServiceUtil.getPortfolioName(portfolioId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String getPortfolioSummary(long userId)
		throws RemoteException {
		try {
			com.liferay.portal.kernel.json.JSONArray returnValue = PortfolioServiceUtil.getPortfolioSummary(userId);

			return returnValue.toString();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deletePortfolio(long portfolioId)
		throws RemoteException {
		try {
			PortfolioServiceUtil.deletePortfolio(portfolioId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String getBaseCurrency(long portfolioId)
		throws RemoteException {
		try {
			java.lang.String returnValue = PortfolioServiceUtil.getBaseCurrency(portfolioId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String getSnapshot(java.lang.String portfolioIds,
		int allocationBy) throws RemoteException {
		try {
			com.liferay.portal.kernel.json.JSONArray returnValue = PortfolioServiceUtil.getSnapshot(portfolioIds,
					allocationBy);

			return returnValue.toString();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(PortfolioServiceSoap.class);
}