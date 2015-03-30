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
 * Provides a wrapper for {@link PortfolioService}.
 *
 * @author Ahmed Hasan
 * @see PortfolioService
 * @generated
 */
public class PortfolioServiceWrapper implements PortfolioService,
	ServiceWrapper<PortfolioService> {
	public PortfolioServiceWrapper(PortfolioService portfolioService) {
		_portfolioService = portfolioService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _portfolioService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_portfolioService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _portfolioService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public void makePrimary(long portfolioId) {
		_portfolioService.makePrimary(portfolioId);
	}

	@Override
	public java.util.List<com.fingence.slayer.model.Portfolio> getPortfolios(
		long userId) {
		return _portfolioService.getPortfolios(userId);
	}

	@Override
	public long getDefault(long userId) {
		return _portfolioService.getDefault(userId);
	}

	@Override
	public int getPortoliosCount(long userId) {
		return _portfolioService.getPortoliosCount(userId);
	}

	@Override
	public com.fingence.slayer.model.Portfolio getPortfolio(long portfolioId) {
		return _portfolioService.getPortfolio(portfolioId);
	}

	@Override
	public java.lang.String getPortfolioName(long portfolioId) {
		return _portfolioService.getPortfolioName(portfolioId);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray getPortfolioSummary(
		long userId) {
		return _portfolioService.getPortfolioSummary(userId);
	}

	@Override
	public void deletePortfolio(long portfolioId) {
		_portfolioService.deletePortfolio(portfolioId);
	}

	@Override
	public java.lang.String getBaseCurrency(long portfolioId) {
		return _portfolioService.getBaseCurrency(portfolioId);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray getSnapshot(
		java.lang.String portfolioIds, int allocationBy) {
		return _portfolioService.getSnapshot(portfolioIds, allocationBy);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PortfolioService getWrappedPortfolioService() {
		return _portfolioService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPortfolioService(PortfolioService portfolioService) {
		_portfolioService = portfolioService;
	}

	@Override
	public PortfolioService getWrappedService() {
		return _portfolioService;
	}

	@Override
	public void setWrappedService(PortfolioService portfolioService) {
		_portfolioService = portfolioService;
	}

	private PortfolioService _portfolioService;
}