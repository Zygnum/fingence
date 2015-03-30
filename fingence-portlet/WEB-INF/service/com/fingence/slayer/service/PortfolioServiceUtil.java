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
 * Provides the remote service utility for Portfolio. This utility wraps
 * {@link com.fingence.slayer.service.impl.PortfolioServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Ahmed Hasan
 * @see PortfolioService
 * @see com.fingence.slayer.service.base.PortfolioServiceBaseImpl
 * @see com.fingence.slayer.service.impl.PortfolioServiceImpl
 * @generated
 */
public class PortfolioServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.fingence.slayer.service.impl.PortfolioServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static void makePrimary(long portfolioId) {
		getService().makePrimary(portfolioId);
	}

	public static java.util.List<com.fingence.slayer.model.Portfolio> getPortfolios(
		long userId) {
		return getService().getPortfolios(userId);
	}

	public static long getDefault(long userId) {
		return getService().getDefault(userId);
	}

	public static int getPortoliosCount(long userId) {
		return getService().getPortoliosCount(userId);
	}

	public static com.fingence.slayer.model.Portfolio getPortfolio(
		long portfolioId) {
		return getService().getPortfolio(portfolioId);
	}

	public static java.lang.String getPortfolioName(long portfolioId) {
		return getService().getPortfolioName(portfolioId);
	}

	public static com.liferay.portal.kernel.json.JSONArray getPortfolioSummary(
		long userId) {
		return getService().getPortfolioSummary(userId);
	}

	public static void deletePortfolio(long portfolioId) {
		getService().deletePortfolio(portfolioId);
	}

	public static java.lang.String getBaseCurrency(long portfolioId) {
		return getService().getBaseCurrency(portfolioId);
	}

	public static com.liferay.portal.kernel.json.JSONArray getSnapshot(
		java.lang.String portfolioIds, int allocationBy) {
		return getService().getSnapshot(portfolioIds, allocationBy);
	}

	public static void clearService() {
		_service = null;
	}

	public static PortfolioService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					PortfolioService.class.getName());

			if (invokableService instanceof PortfolioService) {
				_service = (PortfolioService)invokableService;
			}
			else {
				_service = new PortfolioServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(PortfolioServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(PortfolioService service) {
	}

	private static PortfolioService _service;
}