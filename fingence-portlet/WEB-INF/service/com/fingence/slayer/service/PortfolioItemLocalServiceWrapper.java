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
 * Provides a wrapper for {@link PortfolioItemLocalService}.
 *
 * @author Ahmed Hasan
 * @see PortfolioItemLocalService
 * @generated
 */
public class PortfolioItemLocalServiceWrapper
	implements PortfolioItemLocalService,
		ServiceWrapper<PortfolioItemLocalService> {
	public PortfolioItemLocalServiceWrapper(
		PortfolioItemLocalService portfolioItemLocalService) {
		_portfolioItemLocalService = portfolioItemLocalService;
	}

	/**
	* Adds the portfolio item to the database. Also notifies the appropriate model listeners.
	*
	* @param portfolioItem the portfolio item
	* @return the portfolio item that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.PortfolioItem addPortfolioItem(
		com.fingence.slayer.model.PortfolioItem portfolioItem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _portfolioItemLocalService.addPortfolioItem(portfolioItem);
	}

	/**
	* Creates a new portfolio item with the primary key. Does not add the portfolio item to the database.
	*
	* @param itemId the primary key for the new portfolio item
	* @return the new portfolio item
	*/
	@Override
	public com.fingence.slayer.model.PortfolioItem createPortfolioItem(
		long itemId) {
		return _portfolioItemLocalService.createPortfolioItem(itemId);
	}

	/**
	* Deletes the portfolio item with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param itemId the primary key of the portfolio item
	* @return the portfolio item that was removed
	* @throws PortalException if a portfolio item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.PortfolioItem deletePortfolioItem(
		long itemId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _portfolioItemLocalService.deletePortfolioItem(itemId);
	}

	/**
	* Deletes the portfolio item from the database. Also notifies the appropriate model listeners.
	*
	* @param portfolioItem the portfolio item
	* @return the portfolio item that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.PortfolioItem deletePortfolioItem(
		com.fingence.slayer.model.PortfolioItem portfolioItem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _portfolioItemLocalService.deletePortfolioItem(portfolioItem);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _portfolioItemLocalService.dynamicQuery();
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
		return _portfolioItemLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.PortfolioItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _portfolioItemLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.PortfolioItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _portfolioItemLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _portfolioItemLocalService.dynamicQueryCount(dynamicQuery);
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
		return _portfolioItemLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.fingence.slayer.model.PortfolioItem fetchPortfolioItem(
		long itemId) throws com.liferay.portal.kernel.exception.SystemException {
		return _portfolioItemLocalService.fetchPortfolioItem(itemId);
	}

	/**
	* Returns the portfolio item with the primary key.
	*
	* @param itemId the primary key of the portfolio item
	* @return the portfolio item
	* @throws PortalException if a portfolio item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.PortfolioItem getPortfolioItem(long itemId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _portfolioItemLocalService.getPortfolioItem(itemId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _portfolioItemLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the portfolio items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.PortfolioItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of portfolio items
	* @param end the upper bound of the range of portfolio items (not inclusive)
	* @return the range of portfolio items
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.fingence.slayer.model.PortfolioItem> getPortfolioItems(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _portfolioItemLocalService.getPortfolioItems(start, end);
	}

	/**
	* Returns the number of portfolio items.
	*
	* @return the number of portfolio items
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPortfolioItemsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _portfolioItemLocalService.getPortfolioItemsCount();
	}

	/**
	* Updates the portfolio item in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param portfolioItem the portfolio item
	* @return the portfolio item that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.PortfolioItem updatePortfolioItem(
		com.fingence.slayer.model.PortfolioItem portfolioItem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _portfolioItemLocalService.updatePortfolioItem(portfolioItem);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _portfolioItemLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_portfolioItemLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _portfolioItemLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PortfolioItemLocalService getWrappedPortfolioItemLocalService() {
		return _portfolioItemLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPortfolioItemLocalService(
		PortfolioItemLocalService portfolioItemLocalService) {
		_portfolioItemLocalService = portfolioItemLocalService;
	}

	@Override
	public PortfolioItemLocalService getWrappedService() {
		return _portfolioItemLocalService;
	}

	@Override
	public void setWrappedService(
		PortfolioItemLocalService portfolioItemLocalService) {
		_portfolioItemLocalService = portfolioItemLocalService;
	}

	private PortfolioItemLocalService _portfolioItemLocalService;
}