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
 * Provides a wrapper for {@link DividendLocalService}.
 *
 * @author Ahmed Hasan
 * @see DividendLocalService
 * @generated
 */
public class DividendLocalServiceWrapper implements DividendLocalService,
	ServiceWrapper<DividendLocalService> {
	public DividendLocalServiceWrapper(
		DividendLocalService dividendLocalService) {
		_dividendLocalService = dividendLocalService;
	}

	/**
	* Adds the dividend to the database. Also notifies the appropriate model listeners.
	*
	* @param dividend the dividend
	* @return the dividend that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.Dividend addDividend(
		com.fingence.slayer.model.Dividend dividend)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dividendLocalService.addDividend(dividend);
	}

	/**
	* Creates a new dividend with the primary key. Does not add the dividend to the database.
	*
	* @param recId the primary key for the new dividend
	* @return the new dividend
	*/
	@Override
	public com.fingence.slayer.model.Dividend createDividend(long recId) {
		return _dividendLocalService.createDividend(recId);
	}

	/**
	* Deletes the dividend with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param recId the primary key of the dividend
	* @return the dividend that was removed
	* @throws PortalException if a dividend with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.Dividend deleteDividend(long recId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dividendLocalService.deleteDividend(recId);
	}

	/**
	* Deletes the dividend from the database. Also notifies the appropriate model listeners.
	*
	* @param dividend the dividend
	* @return the dividend that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.Dividend deleteDividend(
		com.fingence.slayer.model.Dividend dividend)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dividendLocalService.deleteDividend(dividend);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dividendLocalService.dynamicQuery();
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
		return _dividendLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.DividendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dividendLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.DividendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dividendLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _dividendLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dividendLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.fingence.slayer.model.Dividend fetchDividend(long recId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dividendLocalService.fetchDividend(recId);
	}

	/**
	* Returns the dividend with the primary key.
	*
	* @param recId the primary key of the dividend
	* @return the dividend
	* @throws PortalException if a dividend with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.Dividend getDividend(long recId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dividendLocalService.getDividend(recId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dividendLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dividends.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.DividendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dividends
	* @param end the upper bound of the range of dividends (not inclusive)
	* @return the range of dividends
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.fingence.slayer.model.Dividend> getDividends(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dividendLocalService.getDividends(start, end);
	}

	/**
	* Returns the number of dividends.
	*
	* @return the number of dividends
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDividendsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dividendLocalService.getDividendsCount();
	}

	/**
	* Updates the dividend in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dividend the dividend
	* @return the dividend that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.Dividend updateDividend(
		com.fingence.slayer.model.Dividend dividend)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dividendLocalService.updateDividend(dividend);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dividendLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dividendLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dividendLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public double getIncome(long assetId, java.util.Date purchaseDate,
		double purchaseQty) {
		return _dividendLocalService.getIncome(assetId, purchaseDate,
			purchaseQty);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DividendLocalService getWrappedDividendLocalService() {
		return _dividendLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDividendLocalService(
		DividendLocalService dividendLocalService) {
		_dividendLocalService = dividendLocalService;
	}

	@Override
	public DividendLocalService getWrappedService() {
		return _dividendLocalService;
	}

	@Override
	public void setWrappedService(DividendLocalService dividendLocalService) {
		_dividendLocalService = dividendLocalService;
	}

	private DividendLocalService _dividendLocalService;
}