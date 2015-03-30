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

import com.fingence.slayer.model.MutualFund;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the mutual fund service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ahmed Hasan
 * @see MutualFundPersistenceImpl
 * @see MutualFundUtil
 * @generated
 */
public interface MutualFundPersistence extends BasePersistence<MutualFund> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MutualFundUtil} to access the mutual fund persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the mutual fund in the entity cache if it is enabled.
	*
	* @param mutualFund the mutual fund
	*/
	public void cacheResult(com.fingence.slayer.model.MutualFund mutualFund);

	/**
	* Caches the mutual funds in the entity cache if it is enabled.
	*
	* @param mutualFunds the mutual funds
	*/
	public void cacheResult(
		java.util.List<com.fingence.slayer.model.MutualFund> mutualFunds);

	/**
	* Creates a new mutual fund with the primary key. Does not add the mutual fund to the database.
	*
	* @param assetId the primary key for the new mutual fund
	* @return the new mutual fund
	*/
	public com.fingence.slayer.model.MutualFund create(long assetId);

	/**
	* Removes the mutual fund with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assetId the primary key of the mutual fund
	* @return the mutual fund that was removed
	* @throws com.fingence.slayer.NoSuchMutualFundException if a mutual fund with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.MutualFund remove(long assetId)
		throws com.fingence.slayer.NoSuchMutualFundException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.fingence.slayer.model.MutualFund updateImpl(
		com.fingence.slayer.model.MutualFund mutualFund)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mutual fund with the primary key or throws a {@link com.fingence.slayer.NoSuchMutualFundException} if it could not be found.
	*
	* @param assetId the primary key of the mutual fund
	* @return the mutual fund
	* @throws com.fingence.slayer.NoSuchMutualFundException if a mutual fund with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.MutualFund findByPrimaryKey(long assetId)
		throws com.fingence.slayer.NoSuchMutualFundException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mutual fund with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param assetId the primary key of the mutual fund
	* @return the mutual fund, or <code>null</code> if a mutual fund with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.MutualFund fetchByPrimaryKey(long assetId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mutual funds.
	*
	* @return the mutual funds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.MutualFund> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.fingence.slayer.model.MutualFund> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mutual funds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.MutualFundModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mutual funds
	* @param end the upper bound of the range of mutual funds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of mutual funds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.MutualFund> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the mutual funds from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mutual funds.
	*
	* @return the number of mutual funds
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}