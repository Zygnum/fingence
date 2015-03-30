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
 * Provides the remote service utility for MyResult. This utility wraps
 * {@link com.fingence.slayer.service.impl.MyResultServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Ahmed Hasan
 * @see MyResultService
 * @see com.fingence.slayer.service.base.MyResultServiceBaseImpl
 * @see com.fingence.slayer.service.impl.MyResultServiceImpl
 * @generated
 */
public class MyResultServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.fingence.slayer.service.impl.MyResultServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static java.util.List<com.fingence.slayer.model.MyResult> getMyResults(
		java.lang.String portfolioIds) {
		return getService().getMyResults(portfolioIds);
	}

	public static java.util.List<com.fingence.slayer.model.MyResult> getMyResults(
		java.lang.String portfolioIds, int allocationBy) {
		return getService().getMyResults(portfolioIds, allocationBy);
	}

	public static java.util.List<com.fingence.slayer.model.MyResult> getBondsByMaturity(
		java.lang.String bucketName, java.lang.String portfolioIds) {
		return getService().getBondsByMaturity(bucketName, portfolioIds);
	}

	public static java.util.List<com.fingence.slayer.model.MyResult> getBondsByCollateral(
		java.lang.String bucketName, java.lang.String portfolioIds) {
		return getService().getBondsByCollateral(bucketName, portfolioIds);
	}

	public static java.util.List<com.fingence.slayer.model.MyResult> getBondsByYldToMaturity(
		java.lang.String index, java.lang.String portfolioIds) {
		return getService().getBondsByYldToMaturity(index, portfolioIds);
	}

	public static java.util.List<com.fingence.slayer.model.MyResult> getBondsByCpnTypVsMtyTyp(
		java.lang.String combo, java.lang.String portfolioIds) {
		return getService().getBondsByCpnTypVsMtyTyp(combo, portfolioIds);
	}

	public static java.util.List<com.fingence.slayer.model.MyResult> getBondsByQuality(
		java.lang.String bucketName, java.lang.String portfolioIds) {
		return getService().getBondsByQuality(bucketName, portfolioIds);
	}

	public static com.liferay.portal.kernel.json.JSONArray getCollateralBreakdown(
		java.lang.String portfolioIds) {
		return getService().getCollateralBreakdown(portfolioIds);
	}

	public static com.liferay.portal.kernel.json.JSONArray getCashFlow(
		java.lang.String portfolioIds) {
		return getService().getCashFlow(portfolioIds);
	}

	public static com.liferay.portal.kernel.json.JSONArray getBondsMaturing(
		java.lang.String portfolioIds) {
		return getService().getBondsMaturing(portfolioIds);
	}

	public static com.liferay.portal.kernel.json.JSONArray getYldToMaturity(
		java.lang.String portfolioIds) {
		return getService().getYldToMaturity(portfolioIds);
	}

	public static com.liferay.portal.kernel.json.JSONArray getCpnTypVsMtyTyp(
		java.lang.String portfolioIds) {
		return getService().getCpnTypVsMtyTyp(portfolioIds);
	}

	public static com.liferay.portal.kernel.json.JSONArray getBondsQuality(
		java.lang.String portfolioIds) {
		return getService().getBondsQuality(portfolioIds);
	}

	public static double getTotalMarketValue(java.lang.String portfolioIds) {
		return getService().getTotalMarketValue(portfolioIds);
	}

	public static java.util.List<java.lang.String> getDistinctValues(
		java.lang.String columnName, java.lang.String portfolioIds) {
		return getService().getDistinctValues(columnName, portfolioIds);
	}

	public static void clearService() {
		_service = null;
	}

	public static MyResultService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					MyResultService.class.getName());

			if (invokableService instanceof MyResultService) {
				_service = (MyResultService)invokableService;
			}
			else {
				_service = new MyResultServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(MyResultServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(MyResultService service) {
	}

	private static MyResultService _service;
}