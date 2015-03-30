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
 * Provides a wrapper for {@link MutualFundLocalService}.
 *
 * @author Ahmed Hasan
 * @see MutualFundLocalService
 * @generated
 */
public class MutualFundLocalServiceWrapper implements MutualFundLocalService,
	ServiceWrapper<MutualFundLocalService> {
	public MutualFundLocalServiceWrapper(
		MutualFundLocalService mutualFundLocalService) {
		_mutualFundLocalService = mutualFundLocalService;
	}

	/**
	* Adds the mutual fund to the database. Also notifies the appropriate model listeners.
	*
	* @param mutualFund the mutual fund
	* @return the mutual fund that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.MutualFund addMutualFund(
		com.fingence.slayer.model.MutualFund mutualFund)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mutualFundLocalService.addMutualFund(mutualFund);
	}

	/**
	* Creates a new mutual fund with the primary key. Does not add the mutual fund to the database.
	*
	* @param assetId the primary key for the new mutual fund
	* @return the new mutual fund
	*/
	@Override
	public com.fingence.slayer.model.MutualFund createMutualFund(long assetId) {
		return _mutualFundLocalService.createMutualFund(assetId);
	}

	/**
	* Deletes the mutual fund with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assetId the primary key of the mutual fund
	* @return the mutual fund that was removed
	* @throws PortalException if a mutual fund with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.MutualFund deleteMutualFund(long assetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _mutualFundLocalService.deleteMutualFund(assetId);
	}

	/**
	* Deletes the mutual fund from the database. Also notifies the appropriate model listeners.
	*
	* @param mutualFund the mutual fund
	* @return the mutual fund that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.MutualFund deleteMutualFund(
		com.fingence.slayer.model.MutualFund mutualFund)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mutualFundLocalService.deleteMutualFund(mutualFund);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _mutualFundLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mutualFundLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.MutualFundModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _mutualFundLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.MutualFundModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mutualFundLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mutualFundLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mutualFundLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.fingence.slayer.model.MutualFund fetchMutualFund(long assetId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mutualFundLocalService.fetchMutualFund(assetId);
	}

	/**
	* Returns the mutual fund with the primary key.
	*
	* @param assetId the primary key of the mutual fund
	* @return the mutual fund
	* @throws PortalException if a mutual fund with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.MutualFund getMutualFund(long assetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _mutualFundLocalService.getMutualFund(assetId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _mutualFundLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the mutual funds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.MutualFundModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mutual funds
	* @param end the upper bound of the range of mutual funds (not inclusive)
	* @return the range of mutual funds
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.fingence.slayer.model.MutualFund> getMutualFunds(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mutualFundLocalService.getMutualFunds(start, end);
	}

	/**
	* Returns the number of mutual funds.
	*
	* @return the number of mutual funds
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getMutualFundsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mutualFundLocalService.getMutualFundsCount();
	}

	/**
	* Updates the mutual fund in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param mutualFund the mutual fund
	* @return the mutual fund that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.MutualFund updateMutualFund(
		com.fingence.slayer.model.MutualFund mutualFund)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mutualFundLocalService.updateMutualFund(mutualFund);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _mutualFundLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_mutualFundLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _mutualFundLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public MutualFundLocalService getWrappedMutualFundLocalService() {
		return _mutualFundLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedMutualFundLocalService(
		MutualFundLocalService mutualFundLocalService) {
		_mutualFundLocalService = mutualFundLocalService;
	}

	@Override
	public MutualFundLocalService getWrappedService() {
		return _mutualFundLocalService;
	}

	@Override
	public void setWrappedService(MutualFundLocalService mutualFundLocalService) {
		_mutualFundLocalService = mutualFundLocalService;
	}

	private MutualFundLocalService _mutualFundLocalService;
}