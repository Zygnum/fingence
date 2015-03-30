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
 * Provides the remote service interface for MyResult. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Ahmed Hasan
 * @see MyResultServiceUtil
 * @see com.fingence.slayer.service.base.MyResultServiceBaseImpl
 * @see com.fingence.slayer.service.impl.MyResultServiceImpl
 * @generated
 */
@AccessControlled
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface MyResultService extends BaseService, InvokableService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MyResultServiceUtil} to access the my result remote service. Add custom service methods to {@link com.fingence.slayer.service.impl.MyResultServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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
	public java.util.List<com.fingence.slayer.model.MyResult> getMyResults(
		java.lang.String portfolioIds);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.fingence.slayer.model.MyResult> getMyResults(
		java.lang.String portfolioIds, int allocationBy);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.fingence.slayer.model.MyResult> getBondsByMaturity(
		java.lang.String bucketName, java.lang.String portfolioIds);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.fingence.slayer.model.MyResult> getBondsByCollateral(
		java.lang.String bucketName, java.lang.String portfolioIds);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.fingence.slayer.model.MyResult> getBondsByYldToMaturity(
		java.lang.String index, java.lang.String portfolioIds);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.fingence.slayer.model.MyResult> getBondsByCpnTypVsMtyTyp(
		java.lang.String combo, java.lang.String portfolioIds);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.fingence.slayer.model.MyResult> getBondsByQuality(
		java.lang.String bucketName, java.lang.String portfolioIds);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.kernel.json.JSONArray getCollateralBreakdown(
		java.lang.String portfolioIds);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.kernel.json.JSONArray getCashFlow(
		java.lang.String portfolioIds);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.kernel.json.JSONArray getBondsMaturing(
		java.lang.String portfolioIds);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.kernel.json.JSONArray getYldToMaturity(
		java.lang.String portfolioIds);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.kernel.json.JSONArray getCpnTypVsMtyTyp(
		java.lang.String portfolioIds);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.kernel.json.JSONArray getBondsQuality(
		java.lang.String portfolioIds);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public double getTotalMarketValue(java.lang.String portfolioIds);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<java.lang.String> getDistinctValues(
		java.lang.String columnName, java.lang.String portfolioIds);
}