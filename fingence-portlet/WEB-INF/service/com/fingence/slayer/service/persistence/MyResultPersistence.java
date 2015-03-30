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

import com.fingence.slayer.model.MyResult;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the my result service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ahmed Hasan
 * @see MyResultPersistenceImpl
 * @see MyResultUtil
 * @generated
 */
public interface MyResultPersistence extends BasePersistence<MyResult> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MyResultUtil} to access the my result persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the my results where portfolioId = &#63;.
	*
	* @param portfolioId the portfolio ID
	* @return the matching my results
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.MyResult> findByPortfolioId(
		long portfolioId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the my results where portfolioId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.MyResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portfolioId the portfolio ID
	* @param start the lower bound of the range of my results
	* @param end the upper bound of the range of my results (not inclusive)
	* @return the range of matching my results
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.MyResult> findByPortfolioId(
		long portfolioId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the my results where portfolioId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.MyResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portfolioId the portfolio ID
	* @param start the lower bound of the range of my results
	* @param end the upper bound of the range of my results (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching my results
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.MyResult> findByPortfolioId(
		long portfolioId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first my result in the ordered set where portfolioId = &#63;.
	*
	* @param portfolioId the portfolio ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching my result
	* @throws com.fingence.slayer.NoSuchMyResultException if a matching my result could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.MyResult findByPortfolioId_First(
		long portfolioId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchMyResultException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first my result in the ordered set where portfolioId = &#63;.
	*
	* @param portfolioId the portfolio ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching my result, or <code>null</code> if a matching my result could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.MyResult fetchByPortfolioId_First(
		long portfolioId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last my result in the ordered set where portfolioId = &#63;.
	*
	* @param portfolioId the portfolio ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching my result
	* @throws com.fingence.slayer.NoSuchMyResultException if a matching my result could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.MyResult findByPortfolioId_Last(
		long portfolioId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchMyResultException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last my result in the ordered set where portfolioId = &#63;.
	*
	* @param portfolioId the portfolio ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching my result, or <code>null</code> if a matching my result could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.MyResult fetchByPortfolioId_Last(
		long portfolioId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the my results before and after the current my result in the ordered set where portfolioId = &#63;.
	*
	* @param itemId the primary key of the current my result
	* @param portfolioId the portfolio ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next my result
	* @throws com.fingence.slayer.NoSuchMyResultException if a my result with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.MyResult[] findByPortfolioId_PrevAndNext(
		long itemId, long portfolioId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchMyResultException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the my results where portfolioId = &#63; from the database.
	*
	* @param portfolioId the portfolio ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPortfolioId(long portfolioId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of my results where portfolioId = &#63;.
	*
	* @param portfolioId the portfolio ID
	* @return the number of matching my results
	* @throws SystemException if a system exception occurred
	*/
	public int countByPortfolioId(long portfolioId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the my result in the entity cache if it is enabled.
	*
	* @param myResult the my result
	*/
	public void cacheResult(com.fingence.slayer.model.MyResult myResult);

	/**
	* Caches the my results in the entity cache if it is enabled.
	*
	* @param myResults the my results
	*/
	public void cacheResult(
		java.util.List<com.fingence.slayer.model.MyResult> myResults);

	/**
	* Creates a new my result with the primary key. Does not add the my result to the database.
	*
	* @param itemId the primary key for the new my result
	* @return the new my result
	*/
	public com.fingence.slayer.model.MyResult create(long itemId);

	/**
	* Removes the my result with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param itemId the primary key of the my result
	* @return the my result that was removed
	* @throws com.fingence.slayer.NoSuchMyResultException if a my result with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.MyResult remove(long itemId)
		throws com.fingence.slayer.NoSuchMyResultException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.fingence.slayer.model.MyResult updateImpl(
		com.fingence.slayer.model.MyResult myResult)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the my result with the primary key or throws a {@link com.fingence.slayer.NoSuchMyResultException} if it could not be found.
	*
	* @param itemId the primary key of the my result
	* @return the my result
	* @throws com.fingence.slayer.NoSuchMyResultException if a my result with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.MyResult findByPrimaryKey(long itemId)
		throws com.fingence.slayer.NoSuchMyResultException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the my result with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param itemId the primary key of the my result
	* @return the my result, or <code>null</code> if a my result with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.MyResult fetchByPrimaryKey(long itemId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the my results.
	*
	* @return the my results
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.MyResult> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the my results.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.MyResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of my results
	* @param end the upper bound of the range of my results (not inclusive)
	* @return the range of my results
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.MyResult> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the my results.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.MyResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of my results
	* @param end the upper bound of the range of my results (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of my results
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.MyResult> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the my results from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of my results.
	*
	* @return the number of my results
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}