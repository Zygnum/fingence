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

import com.fingence.slayer.model.PortfolioItem;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the portfolio item service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ahmed Hasan
 * @see PortfolioItemPersistenceImpl
 * @see PortfolioItemUtil
 * @generated
 */
public interface PortfolioItemPersistence extends BasePersistence<PortfolioItem> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PortfolioItemUtil} to access the portfolio item persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the portfolio item where assetId = &#63; and portfolioId = &#63; or throws a {@link com.fingence.slayer.NoSuchPortfolioItemException} if it could not be found.
	*
	* @param assetId the asset ID
	* @param portfolioId the portfolio ID
	* @return the matching portfolio item
	* @throws com.fingence.slayer.NoSuchPortfolioItemException if a matching portfolio item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.PortfolioItem findByAssetId_PortfolioId(
		long assetId, long portfolioId)
		throws com.fingence.slayer.NoSuchPortfolioItemException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the portfolio item where assetId = &#63; and portfolioId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param assetId the asset ID
	* @param portfolioId the portfolio ID
	* @return the matching portfolio item, or <code>null</code> if a matching portfolio item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.PortfolioItem fetchByAssetId_PortfolioId(
		long assetId, long portfolioId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the portfolio item where assetId = &#63; and portfolioId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param assetId the asset ID
	* @param portfolioId the portfolio ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching portfolio item, or <code>null</code> if a matching portfolio item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.PortfolioItem fetchByAssetId_PortfolioId(
		long assetId, long portfolioId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the portfolio item where assetId = &#63; and portfolioId = &#63; from the database.
	*
	* @param assetId the asset ID
	* @param portfolioId the portfolio ID
	* @return the portfolio item that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.PortfolioItem removeByAssetId_PortfolioId(
		long assetId, long portfolioId)
		throws com.fingence.slayer.NoSuchPortfolioItemException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of portfolio items where assetId = &#63; and portfolioId = &#63;.
	*
	* @param assetId the asset ID
	* @param portfolioId the portfolio ID
	* @return the number of matching portfolio items
	* @throws SystemException if a system exception occurred
	*/
	public int countByAssetId_PortfolioId(long assetId, long portfolioId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the portfolio items where portfolioId = &#63;.
	*
	* @param portfolioId the portfolio ID
	* @return the matching portfolio items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.PortfolioItem> findByPortfolioId(
		long portfolioId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the portfolio items where portfolioId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.PortfolioItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portfolioId the portfolio ID
	* @param start the lower bound of the range of portfolio items
	* @param end the upper bound of the range of portfolio items (not inclusive)
	* @return the range of matching portfolio items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.PortfolioItem> findByPortfolioId(
		long portfolioId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the portfolio items where portfolioId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.PortfolioItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portfolioId the portfolio ID
	* @param start the lower bound of the range of portfolio items
	* @param end the upper bound of the range of portfolio items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching portfolio items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.PortfolioItem> findByPortfolioId(
		long portfolioId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first portfolio item in the ordered set where portfolioId = &#63;.
	*
	* @param portfolioId the portfolio ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching portfolio item
	* @throws com.fingence.slayer.NoSuchPortfolioItemException if a matching portfolio item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.PortfolioItem findByPortfolioId_First(
		long portfolioId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchPortfolioItemException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first portfolio item in the ordered set where portfolioId = &#63;.
	*
	* @param portfolioId the portfolio ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching portfolio item, or <code>null</code> if a matching portfolio item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.PortfolioItem fetchByPortfolioId_First(
		long portfolioId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last portfolio item in the ordered set where portfolioId = &#63;.
	*
	* @param portfolioId the portfolio ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching portfolio item
	* @throws com.fingence.slayer.NoSuchPortfolioItemException if a matching portfolio item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.PortfolioItem findByPortfolioId_Last(
		long portfolioId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchPortfolioItemException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last portfolio item in the ordered set where portfolioId = &#63;.
	*
	* @param portfolioId the portfolio ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching portfolio item, or <code>null</code> if a matching portfolio item could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.PortfolioItem fetchByPortfolioId_Last(
		long portfolioId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the portfolio items before and after the current portfolio item in the ordered set where portfolioId = &#63;.
	*
	* @param itemId the primary key of the current portfolio item
	* @param portfolioId the portfolio ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next portfolio item
	* @throws com.fingence.slayer.NoSuchPortfolioItemException if a portfolio item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.PortfolioItem[] findByPortfolioId_PrevAndNext(
		long itemId, long portfolioId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchPortfolioItemException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the portfolio items where portfolioId = &#63; from the database.
	*
	* @param portfolioId the portfolio ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPortfolioId(long portfolioId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of portfolio items where portfolioId = &#63;.
	*
	* @param portfolioId the portfolio ID
	* @return the number of matching portfolio items
	* @throws SystemException if a system exception occurred
	*/
	public int countByPortfolioId(long portfolioId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the portfolio item in the entity cache if it is enabled.
	*
	* @param portfolioItem the portfolio item
	*/
	public void cacheResult(
		com.fingence.slayer.model.PortfolioItem portfolioItem);

	/**
	* Caches the portfolio items in the entity cache if it is enabled.
	*
	* @param portfolioItems the portfolio items
	*/
	public void cacheResult(
		java.util.List<com.fingence.slayer.model.PortfolioItem> portfolioItems);

	/**
	* Creates a new portfolio item with the primary key. Does not add the portfolio item to the database.
	*
	* @param itemId the primary key for the new portfolio item
	* @return the new portfolio item
	*/
	public com.fingence.slayer.model.PortfolioItem create(long itemId);

	/**
	* Removes the portfolio item with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param itemId the primary key of the portfolio item
	* @return the portfolio item that was removed
	* @throws com.fingence.slayer.NoSuchPortfolioItemException if a portfolio item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.PortfolioItem remove(long itemId)
		throws com.fingence.slayer.NoSuchPortfolioItemException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.fingence.slayer.model.PortfolioItem updateImpl(
		com.fingence.slayer.model.PortfolioItem portfolioItem)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the portfolio item with the primary key or throws a {@link com.fingence.slayer.NoSuchPortfolioItemException} if it could not be found.
	*
	* @param itemId the primary key of the portfolio item
	* @return the portfolio item
	* @throws com.fingence.slayer.NoSuchPortfolioItemException if a portfolio item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.PortfolioItem findByPrimaryKey(long itemId)
		throws com.fingence.slayer.NoSuchPortfolioItemException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the portfolio item with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param itemId the primary key of the portfolio item
	* @return the portfolio item, or <code>null</code> if a portfolio item with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.PortfolioItem fetchByPrimaryKey(
		long itemId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the portfolio items.
	*
	* @return the portfolio items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.PortfolioItem> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.fingence.slayer.model.PortfolioItem> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the portfolio items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.PortfolioItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of portfolio items
	* @param end the upper bound of the range of portfolio items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of portfolio items
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.PortfolioItem> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the portfolio items from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of portfolio items.
	*
	* @return the number of portfolio items
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}