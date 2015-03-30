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
 * Provides a wrapper for {@link MyResultService}.
 *
 * @author Ahmed Hasan
 * @see MyResultService
 * @generated
 */
public class MyResultServiceWrapper implements MyResultService,
	ServiceWrapper<MyResultService> {
	public MyResultServiceWrapper(MyResultService myResultService) {
		_myResultService = myResultService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _myResultService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_myResultService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _myResultService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.util.List<com.fingence.slayer.model.MyResult> getMyResults(
		java.lang.String portfolioIds) {
		return _myResultService.getMyResults(portfolioIds);
	}

	@Override
	public java.util.List<com.fingence.slayer.model.MyResult> getMyResults(
		java.lang.String portfolioIds, int allocationBy) {
		return _myResultService.getMyResults(portfolioIds, allocationBy);
	}

	@Override
	public java.util.List<com.fingence.slayer.model.MyResult> getBondsByMaturity(
		java.lang.String bucketName, java.lang.String portfolioIds) {
		return _myResultService.getBondsByMaturity(bucketName, portfolioIds);
	}

	@Override
	public java.util.List<com.fingence.slayer.model.MyResult> getBondsByCollateral(
		java.lang.String bucketName, java.lang.String portfolioIds) {
		return _myResultService.getBondsByCollateral(bucketName, portfolioIds);
	}

	@Override
	public java.util.List<com.fingence.slayer.model.MyResult> getBondsByYldToMaturity(
		java.lang.String index, java.lang.String portfolioIds) {
		return _myResultService.getBondsByYldToMaturity(index, portfolioIds);
	}

	@Override
	public java.util.List<com.fingence.slayer.model.MyResult> getBondsByCpnTypVsMtyTyp(
		java.lang.String combo, java.lang.String portfolioIds) {
		return _myResultService.getBondsByCpnTypVsMtyTyp(combo, portfolioIds);
	}

	@Override
	public java.util.List<com.fingence.slayer.model.MyResult> getBondsByQuality(
		java.lang.String bucketName, java.lang.String portfolioIds) {
		return _myResultService.getBondsByQuality(bucketName, portfolioIds);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray getCollateralBreakdown(
		java.lang.String portfolioIds) {
		return _myResultService.getCollateralBreakdown(portfolioIds);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray getCashFlow(
		java.lang.String portfolioIds) {
		return _myResultService.getCashFlow(portfolioIds);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray getBondsMaturing(
		java.lang.String portfolioIds) {
		return _myResultService.getBondsMaturing(portfolioIds);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray getYldToMaturity(
		java.lang.String portfolioIds) {
		return _myResultService.getYldToMaturity(portfolioIds);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray getCpnTypVsMtyTyp(
		java.lang.String portfolioIds) {
		return _myResultService.getCpnTypVsMtyTyp(portfolioIds);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray getBondsQuality(
		java.lang.String portfolioIds) {
		return _myResultService.getBondsQuality(portfolioIds);
	}

	@Override
	public double getTotalMarketValue(java.lang.String portfolioIds) {
		return _myResultService.getTotalMarketValue(portfolioIds);
	}

	@Override
	public java.util.List<java.lang.String> getDistinctValues(
		java.lang.String columnName, java.lang.String portfolioIds) {
		return _myResultService.getDistinctValues(columnName, portfolioIds);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public MyResultService getWrappedMyResultService() {
		return _myResultService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedMyResultService(MyResultService myResultService) {
		_myResultService = myResultService;
	}

	@Override
	public MyResultService getWrappedService() {
		return _myResultService;
	}

	@Override
	public void setWrappedService(MyResultService myResultService) {
		_myResultService = myResultService;
	}

	private MyResultService _myResultService;
}