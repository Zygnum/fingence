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
 * Provides a wrapper for {@link EquityLocalService}.
 *
 * @author Ahmed Hasan
 * @see EquityLocalService
 * @generated
 */
public class EquityLocalServiceWrapper implements EquityLocalService,
	ServiceWrapper<EquityLocalService> {
	public EquityLocalServiceWrapper(EquityLocalService equityLocalService) {
		_equityLocalService = equityLocalService;
	}

	/**
	* Adds the equity to the database. Also notifies the appropriate model listeners.
	*
	* @param equity the equity
	* @return the equity that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.Equity addEquity(
		com.fingence.slayer.model.Equity equity)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _equityLocalService.addEquity(equity);
	}

	/**
	* Creates a new equity with the primary key. Does not add the equity to the database.
	*
	* @param assetId the primary key for the new equity
	* @return the new equity
	*/
	@Override
	public com.fingence.slayer.model.Equity createEquity(long assetId) {
		return _equityLocalService.createEquity(assetId);
	}

	/**
	* Deletes the equity with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assetId the primary key of the equity
	* @return the equity that was removed
	* @throws PortalException if a equity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.Equity deleteEquity(long assetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _equityLocalService.deleteEquity(assetId);
	}

	/**
	* Deletes the equity from the database. Also notifies the appropriate model listeners.
	*
	* @param equity the equity
	* @return the equity that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.Equity deleteEquity(
		com.fingence.slayer.model.Equity equity)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _equityLocalService.deleteEquity(equity);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _equityLocalService.dynamicQuery();
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
		return _equityLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.EquityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _equityLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.EquityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _equityLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _equityLocalService.dynamicQueryCount(dynamicQuery);
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
		return _equityLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.fingence.slayer.model.Equity fetchEquity(long assetId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _equityLocalService.fetchEquity(assetId);
	}

	/**
	* Returns the equity with the primary key.
	*
	* @param assetId the primary key of the equity
	* @return the equity
	* @throws PortalException if a equity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.Equity getEquity(long assetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _equityLocalService.getEquity(assetId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _equityLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the equities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.EquityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of equities
	* @param end the upper bound of the range of equities (not inclusive)
	* @return the range of equities
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.fingence.slayer.model.Equity> getEquities(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _equityLocalService.getEquities(start, end);
	}

	/**
	* Returns the number of equities.
	*
	* @return the number of equities
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getEquitiesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _equityLocalService.getEquitiesCount();
	}

	/**
	* Updates the equity in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param equity the equity
	* @return the equity that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.Equity updateEquity(
		com.fingence.slayer.model.Equity equity)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _equityLocalService.updateEquity(equity);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _equityLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_equityLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _equityLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public EquityLocalService getWrappedEquityLocalService() {
		return _equityLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedEquityLocalService(
		EquityLocalService equityLocalService) {
		_equityLocalService = equityLocalService;
	}

	@Override
	public EquityLocalService getWrappedService() {
		return _equityLocalService;
	}

	@Override
	public void setWrappedService(EquityLocalService equityLocalService) {
		_equityLocalService = equityLocalService;
	}

	private EquityLocalService _equityLocalService;
}