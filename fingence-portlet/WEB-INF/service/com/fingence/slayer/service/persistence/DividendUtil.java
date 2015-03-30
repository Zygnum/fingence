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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the dividend service. This utility wraps {@link DividendPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ahmed Hasan
 * @see DividendPersistence
 * @see DividendPersistenceImpl
 * @generated
 */
public class DividendUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Dividend dividend) {
		getPersistence().clearCache(dividend);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Dividend> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Dividend> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Dividend> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Dividend update(Dividend dividend) throws SystemException {
		return getPersistence().update(dividend);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Dividend update(Dividend dividend,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(dividend, serviceContext);
	}

	/**
	* Returns the dividend where assetId = &#63; and declaredDate = &#63; or throws a {@link com.fingence.slayer.NoSuchDividendException} if it could not be found.
	*
	* @param assetId the asset ID
	* @param declaredDate the declared date
	* @return the matching dividend
	* @throws com.fingence.slayer.NoSuchDividendException if a matching dividend could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Dividend findByAssetId_DeclaredDate(
		long assetId, java.util.Date declaredDate)
		throws com.fingence.slayer.NoSuchDividendException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAssetId_DeclaredDate(assetId, declaredDate);
	}

	/**
	* Returns the dividend where assetId = &#63; and declaredDate = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param assetId the asset ID
	* @param declaredDate the declared date
	* @return the matching dividend, or <code>null</code> if a matching dividend could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Dividend fetchByAssetId_DeclaredDate(
		long assetId, java.util.Date declaredDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAssetId_DeclaredDate(assetId, declaredDate);
	}

	/**
	* Returns the dividend where assetId = &#63; and declaredDate = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param assetId the asset ID
	* @param declaredDate the declared date
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching dividend, or <code>null</code> if a matching dividend could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Dividend fetchByAssetId_DeclaredDate(
		long assetId, java.util.Date declaredDate, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAssetId_DeclaredDate(assetId, declaredDate,
			retrieveFromCache);
	}

	/**
	* Removes the dividend where assetId = &#63; and declaredDate = &#63; from the database.
	*
	* @param assetId the asset ID
	* @param declaredDate the declared date
	* @return the dividend that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Dividend removeByAssetId_DeclaredDate(
		long assetId, java.util.Date declaredDate)
		throws com.fingence.slayer.NoSuchDividendException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .removeByAssetId_DeclaredDate(assetId, declaredDate);
	}

	/**
	* Returns the number of dividends where assetId = &#63; and declaredDate = &#63;.
	*
	* @param assetId the asset ID
	* @param declaredDate the declared date
	* @return the number of matching dividends
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAssetId_DeclaredDate(long assetId,
		java.util.Date declaredDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByAssetId_DeclaredDate(assetId, declaredDate);
	}

	/**
	* Returns all the dividends where assetId = &#63;.
	*
	* @param assetId the asset ID
	* @return the matching dividends
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.fingence.slayer.model.Dividend> findByAssetId(
		long assetId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAssetId(assetId);
	}

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
	public static java.util.List<com.fingence.slayer.model.Dividend> findByAssetId(
		long assetId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAssetId(assetId, start, end);
	}

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
	public static java.util.List<com.fingence.slayer.model.Dividend> findByAssetId(
		long assetId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssetId(assetId, start, end, orderByComparator);
	}

	/**
	* Returns the first dividend in the ordered set where assetId = &#63;.
	*
	* @param assetId the asset ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dividend
	* @throws com.fingence.slayer.NoSuchDividendException if a matching dividend could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Dividend findByAssetId_First(
		long assetId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchDividendException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAssetId_First(assetId, orderByComparator);
	}

	/**
	* Returns the first dividend in the ordered set where assetId = &#63;.
	*
	* @param assetId the asset ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dividend, or <code>null</code> if a matching dividend could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Dividend fetchByAssetId_First(
		long assetId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByAssetId_First(assetId, orderByComparator);
	}

	/**
	* Returns the last dividend in the ordered set where assetId = &#63;.
	*
	* @param assetId the asset ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dividend
	* @throws com.fingence.slayer.NoSuchDividendException if a matching dividend could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Dividend findByAssetId_Last(
		long assetId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchDividendException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAssetId_Last(assetId, orderByComparator);
	}

	/**
	* Returns the last dividend in the ordered set where assetId = &#63;.
	*
	* @param assetId the asset ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dividend, or <code>null</code> if a matching dividend could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Dividend fetchByAssetId_Last(
		long assetId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByAssetId_Last(assetId, orderByComparator);
	}

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
	public static com.fingence.slayer.model.Dividend[] findByAssetId_PrevAndNext(
		long recId, long assetId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchDividendException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByAssetId_PrevAndNext(recId, assetId, orderByComparator);
	}

	/**
	* Removes all the dividends where assetId = &#63; from the database.
	*
	* @param assetId the asset ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByAssetId(long assetId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByAssetId(assetId);
	}

	/**
	* Returns the number of dividends where assetId = &#63;.
	*
	* @param assetId the asset ID
	* @return the number of matching dividends
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAssetId(long assetId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByAssetId(assetId);
	}

	/**
	* Caches the dividend in the entity cache if it is enabled.
	*
	* @param dividend the dividend
	*/
	public static void cacheResult(com.fingence.slayer.model.Dividend dividend) {
		getPersistence().cacheResult(dividend);
	}

	/**
	* Caches the dividends in the entity cache if it is enabled.
	*
	* @param dividends the dividends
	*/
	public static void cacheResult(
		java.util.List<com.fingence.slayer.model.Dividend> dividends) {
		getPersistence().cacheResult(dividends);
	}

	/**
	* Creates a new dividend with the primary key. Does not add the dividend to the database.
	*
	* @param recId the primary key for the new dividend
	* @return the new dividend
	*/
	public static com.fingence.slayer.model.Dividend create(long recId) {
		return getPersistence().create(recId);
	}

	/**
	* Removes the dividend with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param recId the primary key of the dividend
	* @return the dividend that was removed
	* @throws com.fingence.slayer.NoSuchDividendException if a dividend with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Dividend remove(long recId)
		throws com.fingence.slayer.NoSuchDividendException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(recId);
	}

	public static com.fingence.slayer.model.Dividend updateImpl(
		com.fingence.slayer.model.Dividend dividend)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(dividend);
	}

	/**
	* Returns the dividend with the primary key or throws a {@link com.fingence.slayer.NoSuchDividendException} if it could not be found.
	*
	* @param recId the primary key of the dividend
	* @return the dividend
	* @throws com.fingence.slayer.NoSuchDividendException if a dividend with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Dividend findByPrimaryKey(
		long recId)
		throws com.fingence.slayer.NoSuchDividendException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(recId);
	}

	/**
	* Returns the dividend with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param recId the primary key of the dividend
	* @return the dividend, or <code>null</code> if a dividend with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Dividend fetchByPrimaryKey(
		long recId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(recId);
	}

	/**
	* Returns all the dividends.
	*
	* @return the dividends
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.fingence.slayer.model.Dividend> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.fingence.slayer.model.Dividend> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.fingence.slayer.model.Dividend> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dividends from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dividends.
	*
	* @return the number of dividends
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DividendPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DividendPersistence)PortletBeanLocatorUtil.locate(com.fingence.slayer.service.ClpSerializer.getServletContextName(),
					DividendPersistence.class.getName());

			ReferenceRegistry.registerReference(DividendUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DividendPersistence persistence) {
	}

	private static DividendPersistence _persistence;
}