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

import com.fingence.slayer.model.History;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the history service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ahmed Hasan
 * @see HistoryPersistenceImpl
 * @see HistoryUtil
 * @generated
 */
public interface HistoryPersistence extends BasePersistence<History> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HistoryUtil} to access the history persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the history where assetId = &#63; and logDate = &#63; and type = &#63; or throws a {@link com.fingence.slayer.NoSuchHistoryException} if it could not be found.
	*
	* @param assetId the asset ID
	* @param logDate the log date
	* @param type the type
	* @return the matching history
	* @throws com.fingence.slayer.NoSuchHistoryException if a matching history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.History findByAssetId_Date_Type(
		long assetId, java.util.Date logDate, int type)
		throws com.fingence.slayer.NoSuchHistoryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the history where assetId = &#63; and logDate = &#63; and type = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param assetId the asset ID
	* @param logDate the log date
	* @param type the type
	* @return the matching history, or <code>null</code> if a matching history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.History fetchByAssetId_Date_Type(
		long assetId, java.util.Date logDate, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the history where assetId = &#63; and logDate = &#63; and type = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param assetId the asset ID
	* @param logDate the log date
	* @param type the type
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching history, or <code>null</code> if a matching history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.History fetchByAssetId_Date_Type(
		long assetId, java.util.Date logDate, int type,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the history where assetId = &#63; and logDate = &#63; and type = &#63; from the database.
	*
	* @param assetId the asset ID
	* @param logDate the log date
	* @param type the type
	* @return the history that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.History removeByAssetId_Date_Type(
		long assetId, java.util.Date logDate, int type)
		throws com.fingence.slayer.NoSuchHistoryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of histories where assetId = &#63; and logDate = &#63; and type = &#63;.
	*
	* @param assetId the asset ID
	* @param logDate the log date
	* @param type the type
	* @return the number of matching histories
	* @throws SystemException if a system exception occurred
	*/
	public int countByAssetId_Date_Type(long assetId, java.util.Date logDate,
		int type) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the histories where assetId = &#63; and type = &#63;.
	*
	* @param assetId the asset ID
	* @param type the type
	* @return the matching histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.History> findByAssetId_Type(
		long assetId, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the histories where assetId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.HistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param assetId the asset ID
	* @param type the type
	* @param start the lower bound of the range of histories
	* @param end the upper bound of the range of histories (not inclusive)
	* @return the range of matching histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.History> findByAssetId_Type(
		long assetId, int type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the histories where assetId = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.HistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param assetId the asset ID
	* @param type the type
	* @param start the lower bound of the range of histories
	* @param end the upper bound of the range of histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.History> findByAssetId_Type(
		long assetId, int type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first history in the ordered set where assetId = &#63; and type = &#63;.
	*
	* @param assetId the asset ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching history
	* @throws com.fingence.slayer.NoSuchHistoryException if a matching history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.History findByAssetId_Type_First(
		long assetId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchHistoryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first history in the ordered set where assetId = &#63; and type = &#63;.
	*
	* @param assetId the asset ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching history, or <code>null</code> if a matching history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.History fetchByAssetId_Type_First(
		long assetId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last history in the ordered set where assetId = &#63; and type = &#63;.
	*
	* @param assetId the asset ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching history
	* @throws com.fingence.slayer.NoSuchHistoryException if a matching history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.History findByAssetId_Type_Last(
		long assetId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchHistoryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last history in the ordered set where assetId = &#63; and type = &#63;.
	*
	* @param assetId the asset ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching history, or <code>null</code> if a matching history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.History fetchByAssetId_Type_Last(
		long assetId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the histories before and after the current history in the ordered set where assetId = &#63; and type = &#63;.
	*
	* @param recId the primary key of the current history
	* @param assetId the asset ID
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next history
	* @throws com.fingence.slayer.NoSuchHistoryException if a history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.History[] findByAssetId_Type_PrevAndNext(
		long recId, long assetId, int type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchHistoryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the histories where assetId = &#63; and type = &#63; from the database.
	*
	* @param assetId the asset ID
	* @param type the type
	* @throws SystemException if a system exception occurred
	*/
	public void removeByAssetId_Type(long assetId, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of histories where assetId = &#63; and type = &#63;.
	*
	* @param assetId the asset ID
	* @param type the type
	* @return the number of matching histories
	* @throws SystemException if a system exception occurred
	*/
	public int countByAssetId_Type(long assetId, int type)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the histories where assetId = &#63;.
	*
	* @param assetId the asset ID
	* @return the matching histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.History> findByAssetId(
		long assetId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the histories where assetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.HistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param assetId the asset ID
	* @param start the lower bound of the range of histories
	* @param end the upper bound of the range of histories (not inclusive)
	* @return the range of matching histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.History> findByAssetId(
		long assetId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the histories where assetId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.HistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param assetId the asset ID
	* @param start the lower bound of the range of histories
	* @param end the upper bound of the range of histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.History> findByAssetId(
		long assetId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first history in the ordered set where assetId = &#63;.
	*
	* @param assetId the asset ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching history
	* @throws com.fingence.slayer.NoSuchHistoryException if a matching history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.History findByAssetId_First(long assetId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchHistoryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first history in the ordered set where assetId = &#63;.
	*
	* @param assetId the asset ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching history, or <code>null</code> if a matching history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.History fetchByAssetId_First(
		long assetId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last history in the ordered set where assetId = &#63;.
	*
	* @param assetId the asset ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching history
	* @throws com.fingence.slayer.NoSuchHistoryException if a matching history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.History findByAssetId_Last(long assetId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchHistoryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last history in the ordered set where assetId = &#63;.
	*
	* @param assetId the asset ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching history, or <code>null</code> if a matching history could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.History fetchByAssetId_Last(long assetId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the histories before and after the current history in the ordered set where assetId = &#63;.
	*
	* @param recId the primary key of the current history
	* @param assetId the asset ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next history
	* @throws com.fingence.slayer.NoSuchHistoryException if a history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.History[] findByAssetId_PrevAndNext(
		long recId, long assetId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchHistoryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the histories where assetId = &#63; from the database.
	*
	* @param assetId the asset ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByAssetId(long assetId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of histories where assetId = &#63;.
	*
	* @param assetId the asset ID
	* @return the number of matching histories
	* @throws SystemException if a system exception occurred
	*/
	public int countByAssetId(long assetId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the history in the entity cache if it is enabled.
	*
	* @param history the history
	*/
	public void cacheResult(com.fingence.slayer.model.History history);

	/**
	* Caches the histories in the entity cache if it is enabled.
	*
	* @param histories the histories
	*/
	public void cacheResult(
		java.util.List<com.fingence.slayer.model.History> histories);

	/**
	* Creates a new history with the primary key. Does not add the history to the database.
	*
	* @param recId the primary key for the new history
	* @return the new history
	*/
	public com.fingence.slayer.model.History create(long recId);

	/**
	* Removes the history with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param recId the primary key of the history
	* @return the history that was removed
	* @throws com.fingence.slayer.NoSuchHistoryException if a history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.History remove(long recId)
		throws com.fingence.slayer.NoSuchHistoryException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.fingence.slayer.model.History updateImpl(
		com.fingence.slayer.model.History history)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the history with the primary key or throws a {@link com.fingence.slayer.NoSuchHistoryException} if it could not be found.
	*
	* @param recId the primary key of the history
	* @return the history
	* @throws com.fingence.slayer.NoSuchHistoryException if a history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.History findByPrimaryKey(long recId)
		throws com.fingence.slayer.NoSuchHistoryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the history with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param recId the primary key of the history
	* @return the history, or <code>null</code> if a history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.History fetchByPrimaryKey(long recId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the histories.
	*
	* @return the histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.History> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.HistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of histories
	* @param end the upper bound of the range of histories (not inclusive)
	* @return the range of histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.History> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.HistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of histories
	* @param end the upper bound of the range of histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of histories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.History> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the histories from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of histories.
	*
	* @return the number of histories
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}