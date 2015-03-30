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
 * Provides a wrapper for {@link BondLocalService}.
 *
 * @author Ahmed Hasan
 * @see BondLocalService
 * @generated
 */
public class BondLocalServiceWrapper implements BondLocalService,
	ServiceWrapper<BondLocalService> {
	public BondLocalServiceWrapper(BondLocalService bondLocalService) {
		_bondLocalService = bondLocalService;
	}

	/**
	* Adds the bond to the database. Also notifies the appropriate model listeners.
	*
	* @param bond the bond
	* @return the bond that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.Bond addBond(
		com.fingence.slayer.model.Bond bond)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bondLocalService.addBond(bond);
	}

	/**
	* Creates a new bond with the primary key. Does not add the bond to the database.
	*
	* @param assetId the primary key for the new bond
	* @return the new bond
	*/
	@Override
	public com.fingence.slayer.model.Bond createBond(long assetId) {
		return _bondLocalService.createBond(assetId);
	}

	/**
	* Deletes the bond with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assetId the primary key of the bond
	* @return the bond that was removed
	* @throws PortalException if a bond with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.Bond deleteBond(long assetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _bondLocalService.deleteBond(assetId);
	}

	/**
	* Deletes the bond from the database. Also notifies the appropriate model listeners.
	*
	* @param bond the bond
	* @return the bond that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.Bond deleteBond(
		com.fingence.slayer.model.Bond bond)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bondLocalService.deleteBond(bond);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _bondLocalService.dynamicQuery();
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
		return _bondLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.BondModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _bondLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.BondModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _bondLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _bondLocalService.dynamicQueryCount(dynamicQuery);
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
		return _bondLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.fingence.slayer.model.Bond fetchBond(long assetId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bondLocalService.fetchBond(assetId);
	}

	/**
	* Returns the bond with the primary key.
	*
	* @param assetId the primary key of the bond
	* @return the bond
	* @throws PortalException if a bond with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.Bond getBond(long assetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _bondLocalService.getBond(assetId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _bondLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the bonds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.BondModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bonds
	* @param end the upper bound of the range of bonds (not inclusive)
	* @return the range of bonds
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.fingence.slayer.model.Bond> getBonds(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _bondLocalService.getBonds(start, end);
	}

	/**
	* Returns the number of bonds.
	*
	* @return the number of bonds
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getBondsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bondLocalService.getBondsCount();
	}

	/**
	* Updates the bond in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param bond the bond
	* @return the bond that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.Bond updateBond(
		com.fingence.slayer.model.Bond bond)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bondLocalService.updateBond(bond);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _bondLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_bondLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _bondLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public BondLocalService getWrappedBondLocalService() {
		return _bondLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedBondLocalService(BondLocalService bondLocalService) {
		_bondLocalService = bondLocalService;
	}

	@Override
	public BondLocalService getWrappedService() {
		return _bondLocalService;
	}

	@Override
	public void setWrappedService(BondLocalService bondLocalService) {
		_bondLocalService = bondLocalService;
	}

	private BondLocalService _bondLocalService;
}