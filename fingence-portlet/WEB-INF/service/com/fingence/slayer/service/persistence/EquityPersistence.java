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

package com.fingence.slayer.service.persistence;

import com.fingence.slayer.model.Equity;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the equity service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ahmed Hasan
 * @see EquityPersistenceImpl
 * @see EquityUtil
 * @generated
 */
public interface EquityPersistence extends BasePersistence<Equity> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EquityUtil} to access the equity persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the equity in the entity cache if it is enabled.
	*
	* @param equity the equity
	*/
	public void cacheResult(com.fingence.slayer.model.Equity equity);

	/**
	* Caches the equities in the entity cache if it is enabled.
	*
	* @param equities the equities
	*/
	public void cacheResult(
		java.util.List<com.fingence.slayer.model.Equity> equities);

	/**
	* Creates a new equity with the primary key. Does not add the equity to the database.
	*
	* @param assetId the primary key for the new equity
	* @return the new equity
	*/
	public com.fingence.slayer.model.Equity create(long assetId);

	/**
	* Removes the equity with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assetId the primary key of the equity
	* @return the equity that was removed
	* @throws com.fingence.slayer.NoSuchEquityException if a equity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Equity remove(long assetId)
		throws com.fingence.slayer.NoSuchEquityException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.fingence.slayer.model.Equity updateImpl(
		com.fingence.slayer.model.Equity equity)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the equity with the primary key or throws a {@link com.fingence.slayer.NoSuchEquityException} if it could not be found.
	*
	* @param assetId the primary key of the equity
	* @return the equity
	* @throws com.fingence.slayer.NoSuchEquityException if a equity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Equity findByPrimaryKey(long assetId)
		throws com.fingence.slayer.NoSuchEquityException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the equity with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param assetId the primary key of the equity
	* @return the equity, or <code>null</code> if a equity with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Equity fetchByPrimaryKey(long assetId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the equities.
	*
	* @return the equities
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.Equity> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.fingence.slayer.model.Equity> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the equities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.EquityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of equities
	* @param end the upper bound of the range of equities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of equities
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.Equity> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the equities from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of equities.
	*
	* @return the number of equities
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}