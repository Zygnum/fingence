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

import com.fingence.slayer.service.MyResultServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.fingence.slayer.service.MyResultServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.fingence.slayer.model.MyResultSoap}.
 * If the method in the service utility returns a
 * {@link com.fingence.slayer.model.MyResult}, that is translated to a
 * {@link com.fingence.slayer.model.MyResultSoap}. Methods that SOAP cannot
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
 * @see MyResultServiceHttp
 * @see com.fingence.slayer.model.MyResultSoap
 * @see com.fingence.slayer.service.MyResultServiceUtil
 * @generated
 */
public class MyResultServiceSoap {
	public static com.fingence.slayer.model.MyResultSoap[] getMyResults(
		java.lang.String portfolioIds) throws RemoteException {
		try {
			java.util.List<com.fingence.slayer.model.MyResult> returnValue = MyResultServiceUtil.getMyResults(portfolioIds);

			return com.fingence.slayer.model.MyResultSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.fingence.slayer.model.MyResultSoap[] getMyResults(
		java.lang.String portfolioIds, int allocationBy)
		throws RemoteException {
		try {
			java.util.List<com.fingence.slayer.model.MyResult> returnValue = MyResultServiceUtil.getMyResults(portfolioIds,
					allocationBy);

			return com.fingence.slayer.model.MyResultSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.fingence.slayer.model.MyResultSoap[] getBondsByMaturity(
		java.lang.String bucketName, java.lang.String portfolioIds)
		throws RemoteException {
		try {
			java.util.List<com.fingence.slayer.model.MyResult> returnValue = MyResultServiceUtil.getBondsByMaturity(bucketName,
					portfolioIds);

			return com.fingence.slayer.model.MyResultSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.fingence.slayer.model.MyResultSoap[] getBondsByCollateral(
		java.lang.String bucketName, java.lang.String portfolioIds)
		throws RemoteException {
		try {
			java.util.List<com.fingence.slayer.model.MyResult> returnValue = MyResultServiceUtil.getBondsByCollateral(bucketName,
					portfolioIds);

			return com.fingence.slayer.model.MyResultSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.fingence.slayer.model.MyResultSoap[] getBondsByYldToMaturity(
		java.lang.String index, java.lang.String portfolioIds)
		throws RemoteException {
		try {
			java.util.List<com.fingence.slayer.model.MyResult> returnValue = MyResultServiceUtil.getBondsByYldToMaturity(index,
					portfolioIds);

			return com.fingence.slayer.model.MyResultSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.fingence.slayer.model.MyResultSoap[] getBondsByCpnTypVsMtyTyp(
		java.lang.String combo, java.lang.String portfolioIds)
		throws RemoteException {
		try {
			java.util.List<com.fingence.slayer.model.MyResult> returnValue = MyResultServiceUtil.getBondsByCpnTypVsMtyTyp(combo,
					portfolioIds);

			return com.fingence.slayer.model.MyResultSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.fingence.slayer.model.MyResultSoap[] getBondsByQuality(
		java.lang.String bucketName, java.lang.String portfolioIds)
		throws RemoteException {
		try {
			java.util.List<com.fingence.slayer.model.MyResult> returnValue = MyResultServiceUtil.getBondsByQuality(bucketName,
					portfolioIds);

			return com.fingence.slayer.model.MyResultSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String getCollateralBreakdown(
		java.lang.String portfolioIds) throws RemoteException {
		try {
			com.liferay.portal.kernel.json.JSONArray returnValue = MyResultServiceUtil.getCollateralBreakdown(portfolioIds);

			return returnValue.toString();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String getCashFlow(java.lang.String portfolioIds)
		throws RemoteException {
		try {
			com.liferay.portal.kernel.json.JSONArray returnValue = MyResultServiceUtil.getCashFlow(portfolioIds);

			return returnValue.toString();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String getBondsMaturing(
		java.lang.String portfolioIds) throws RemoteException {
		try {
			com.liferay.portal.kernel.json.JSONArray returnValue = MyResultServiceUtil.getBondsMaturing(portfolioIds);

			return returnValue.toString();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String getYldToMaturity(
		java.lang.String portfolioIds) throws RemoteException {
		try {
			com.liferay.portal.kernel.json.JSONArray returnValue = MyResultServiceUtil.getYldToMaturity(portfolioIds);

			return returnValue.toString();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String getCpnTypVsMtyTyp(
		java.lang.String portfolioIds) throws RemoteException {
		try {
			com.liferay.portal.kernel.json.JSONArray returnValue = MyResultServiceUtil.getCpnTypVsMtyTyp(portfolioIds);

			return returnValue.toString();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String getBondsQuality(
		java.lang.String portfolioIds) throws RemoteException {
		try {
			com.liferay.portal.kernel.json.JSONArray returnValue = MyResultServiceUtil.getBondsQuality(portfolioIds);

			return returnValue.toString();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static double getTotalMarketValue(java.lang.String portfolioIds)
		throws RemoteException {
		try {
			double returnValue = MyResultServiceUtil.getTotalMarketValue(portfolioIds);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static java.lang.String[] getDistinctValues(
		java.lang.String columnName, java.lang.String portfolioIds)
		throws RemoteException {
		try {
			java.util.List<java.lang.String> returnValue = MyResultServiceUtil.getDistinctValues(columnName,
					portfolioIds);

			return returnValue.toArray(new java.lang.String[returnValue.size()]);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(MyResultServiceSoap.class);
}