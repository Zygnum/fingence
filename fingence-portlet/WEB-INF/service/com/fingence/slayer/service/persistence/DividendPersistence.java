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

import com.fingence.slayer.model.Dividend;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the dividend service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ahmed Hasan
 * @see DividendPersistenceImpl
 * @see DividendUtil
 * @generated
 */
public interface DividendPersistence extends BasePersistence<Dividend> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DividendUtil} to access the dividend persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the dividend where assetId = &#63; and declaredDate = &#63; or throws a {@link com.fingence.slayer.NoSuchDividendException} if it could not be found.
	*
	* @param assetId the asset ID
	* @param declaredDate the declared date
	* @return the matching dividend
	* @throws com.fingence.slayer.NoSuchDividendException if a matching dividend could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Dividend findByAssetId_DeclaredDate(
		long assetId, java.util.Date declaredDate)
		throws com.fingence.slayer.NoSuchDividendException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dividend where assetId = &#63; and declaredDate = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param assetId the asset ID
	* @param declaredDate the declared date
	* @return the matching dividend, or <code>null</code> if a matching dividend could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Dividend fetchByAssetId_DeclaredDate(
		long assetId, java.util.Date declaredDate)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dividend where assetId = &#63; and declaredDate = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param assetId the asset ID
	* @param declaredDate the declared date
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dividend, or <code>null</code> if a matching dividend could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Dividend fetchByAssetId_DeclaredDate(
		long assetId, java.util.Date declaredDate, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the dividend where assetId = &#63; and declaredDate = &#63; from the database.
	*
	* @param assetId the asset ID
	* @param declaredDate the declared date
	* @return the dividend that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Dividend removeByAssetId_DeclaredDate(
		long assetId, java.util.Date declaredDate)
		throws com.fingence.slayer.NoSuchDividendException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dividends where assetId = &#63; and declaredDate = &#63;.
	*
	* @param assetId the asset ID
	* @param declaredDate the declared date
	* @return the number of matching dividends
	* @throws SystemException if a system exception occurred
	*/
	public int countByAssetId_DeclaredDate(long assetId,
		java.util.Date declaredDate)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dividends where assetId = &#63;.
	*
	* @param assetId the asset ID
	* @return the matching dividends
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.Dividend> findByAssetId(
		long assetId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dividends where assetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.DividendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param assetId the asset ID
	* @param start the lower bound of the range of dividends
	* @param end the upper bound of the range of dividends (not inclusive)
	* @return the range of matching dividends
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.Dividend> findByAssetId(
		long assetId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dividends where assetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.DividendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param assetId the asset ID
	* @param start the lower bound of the range of dividends
	* @param end the upper bound of the range of dividends (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dividends
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.Dividend> findByAssetId(
		long assetId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dividend in the ordered set where assetId = &#63;.
	*
	* @param assetId the asset ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dividend
	* @throws com.fingence.slayer.NoSuchDividendException if a matching dividend could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Dividend findByAssetId_First(
		long assetId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchDividendException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dividend in the ordered set where assetId = &#63;.
	*
	* @param assetId the asset ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dividend, or <code>null</code> if a matching dividend could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Dividend fetchByAssetId_First(
		long assetId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dividend in the ordered set where assetId = &#63;.
	*
	* @param assetId the asset ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dividend
	* @throws com.fingence.slayer.NoSuchDividendException if a matching dividend could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Dividend findByAssetId_Last(long assetId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchDividendException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dividend in the ordered set where assetId = &#63;.
	*
	* @param assetId the asset ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dividend, or <code>null</code> if a matching dividend could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Dividend fetchByAssetId_Last(
		long assetId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dividends before and after the current dividend in the ordered set where assetId = &#63;.
	*
	* @param recId the primary key of the current dividend
	* @param assetId the asset ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dividend
	* @throws com.fingence.slayer.NoSuchDividendException if a dividend with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Dividend[] findByAssetId_PrevAndNext(
		long recId, long assetId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchDividendException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dividends where assetId = &#63; from the database.
	*
	* @param assetId the asset ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByAssetId(long assetId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dividends where assetId = &#63;.
	*
	* @param assetId the asset ID
	* @return the number of matching dividends
	* @throws SystemException if a system exception occurred
	*/
	public int countByAssetId(long assetId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dividend in the entity cache if it is enabled.
	*
	* @param dividend the dividend
	*/
	public void cacheResult(com.fingence.slayer.model.Dividend dividend);

	/**
	* Caches the dividends in the entity cache if it is enabled.
	*
	* @param dividends the dividends
	*/
	public void cacheResult(
		java.util.List<com.fingence.slayer.model.Dividend> dividends);

	/**
	* Creates a new dividend with the primary key. Does not add the dividend to the database.
	*
	* @param recId the primary key for the new dividend
	* @return the new dividend
	*/
	public com.fingence.slayer.model.Dividend create(long recId);

	/**
	* Removes the dividend with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param recId the primary key of the dividend
	* @return the dividend that was removed
	* @throws com.fingence.slayer.NoSuchDividendException if a dividend with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Dividend remove(long recId)
		throws com.fingence.slayer.NoSuchDividendException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.fingence.slayer.model.Dividend updateImpl(
		com.fingence.slayer.model.Dividend dividend)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dividend with the primary key or throws a {@link com.fingence.slayer.NoSuchDividendException} if it could not be found.
	*
	* @param recId the primary key of the dividend
	* @return the dividend
	* @throws com.fingence.slayer.NoSuchDividendException if a dividend with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Dividend findByPrimaryKey(long recId)
		throws com.fingence.slayer.NoSuchDividendException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dividend with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param recId the primary key of the dividend
	* @return the dividend, or <code>null</code> if a dividend with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Dividend fetchByPrimaryKey(long recId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dividends.
	*
	* @return the dividends
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.Dividend> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.fingence.slayer.model.Dividend> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dividends.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.DividendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dividends
	* @param end the upper bound of the range of dividends (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dividends
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.Dividend> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dividends from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dividends.
	*
	* @return the number of dividends
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}