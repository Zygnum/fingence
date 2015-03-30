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
 * Provides a wrapper for {@link PortfolioItemService}.
 *
 * @author Ahmed Hasan
 * @see PortfolioItemService
 * @generated
 */
public class PortfolioItemServiceWrapper implements PortfolioItemService,
	ServiceWrapper<PortfolioItemService> {
	public PortfolioItemServiceWrapper(
		PortfolioItemService portfolioItemService) {
		_portfolioItemService = portfolioItemService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _portfolioItemService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_portfolioItemService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _portfolioItemService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<com.fingence.slayer.model.PortfolioItem> getPortfolioItems(
		long portfolioId) {
		return _portfolioItemService.getPortfolioItems(portfolioId);
	}

	@Override
	public void deleteItem(long portfolioItemId) {
		_portfolioItemService.deleteItem(portfolioItemId);
	}

	@Override
	public void updateItem(long portfolioItemId, long portfolioId,
		java.lang.String isinId, java.lang.String ticker, double purchasePrice,
		double purchaseQty, double purchasedFx, java.lang.String purchaseDate) {
		_portfolioItemService.updateItem(portfolioItemId, portfolioId, isinId,
			ticker, purchasePrice, purchaseQty, purchasedFx, purchaseDate);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PortfolioItemService getWrappedPortfolioItemService() {
		return _portfolioItemService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPortfolioItemService(
		PortfolioItemService portfolioItemService) {
		_portfolioItemService = portfolioItemService;
	}

	@Override
	public PortfolioItemService getWrappedService() {
		return _portfolioItemService;
	}

	@Override
	public void setWrappedService(PortfolioItemService portfolioItemService) {
		_portfolioItemService = portfolioItemService;
	}

	private PortfolioItemService _portfolioItemService;
}