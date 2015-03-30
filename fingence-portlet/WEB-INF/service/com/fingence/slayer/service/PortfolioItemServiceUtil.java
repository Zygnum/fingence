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
 * Provides the remote service utility for PortfolioItem. This utility wraps
 * {@link com.fingence.slayer.service.impl.PortfolioItemServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Ahmed Hasan
 * @see PortfolioItemService
 * @see com.fingence.slayer.service.base.PortfolioItemServiceBaseImpl
 * @see com.fingence.slayer.service.impl.PortfolioItemServiceImpl
 * @generated
 */
public class PortfolioItemServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.fingence.slayer.service.impl.PortfolioItemServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static java.util.List<com.fingence.slayer.model.PortfolioItem> getPortfolioItems(
		long portfolioId) {
		return getService().getPortfolioItems(portfolioId);
	}

	public static void deleteItem(long portfolioItemId) {
		getService().deleteItem(portfolioItemId);
	}

	public static void updateItem(long portfolioItemId, long portfolioId,
		java.lang.String isinId, java.lang.String ticker, double purchasePrice,
		double purchaseQty, double purchasedFx, java.lang.String purchaseDate) {
		getService()
			.updateItem(portfolioItemId, portfolioId, isinId, ticker,
			purchasePrice, purchaseQty, purchasedFx, purchaseDate);
	}

	public static void clearService() {
		_service = null;
	}

	public static PortfolioItemService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					PortfolioItemService.class.getName());

			if (invokableService instanceof PortfolioItemService) {
				_service = (PortfolioItemService)invokableService;
			}
			else {
				_service = new PortfolioItemServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(PortfolioItemServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(PortfolioItemService service) {
	}

	private static PortfolioItemService _service;
}