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

import com.fingence.slayer.model.Rating;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the rating service. This utility wraps {@link RatingPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ahmed Hasan
 * @see RatingPersistence
 * @see RatingPersistenceImpl
 * @generated
 */
public class RatingUtil {
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
	public static void clearCache(Rating rating) {
		getPersistence().clearCache(rating);
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
	public static List<Rating> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Rating> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Rating> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Rating update(Rating rating) throws SystemException {
		return getPersistence().update(rating);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Rating update(Rating rating, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(rating, serviceContext);
	}

	/**
	* Returns the rating where sandp = &#63; and moodys = &#63; or throws a {@link com.fingence.slayer.NoSuchRatingException} if it could not be found.
	*
	* @param sandp the sandp
	* @param moodys the moodys
	* @return the matching rating
	* @throws com.fingence.slayer.NoSuchRatingException if a matching rating could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Rating findBySP_Moody(
		java.lang.String sandp, java.lang.String moodys)
		throws com.fingence.slayer.NoSuchRatingException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBySP_Moody(sandp, moodys);
	}

	/**
	* Returns the rating where sandp = &#63; and moodys = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param sandp the sandp
	* @param moodys the moodys
	* @return the matching rating, or <code>null</code> if a matching rating could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Rating fetchBySP_Moody(
		java.lang.String sandp, java.lang.String moodys)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBySP_Moody(sandp, moodys);
	}

	/**
	* Returns the rating where sandp = &#63; and moodys = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param sandp the sandp
	* @param moodys the moodys
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching rating, or <code>null</code> if a matching rating could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Rating fetchBySP_Moody(
		java.lang.String sandp, java.lang.String moodys,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBySP_Moody(sandp, moodys, retrieveFromCache);
	}

	/**
	* Removes the rating where sandp = &#63; and moodys = &#63; from the database.
	*
	* @param sandp the sandp
	* @param moodys the moodys
	* @return the rating that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Rating removeBySP_Moody(
		java.lang.String sandp, java.lang.String moodys)
		throws com.fingence.slayer.NoSuchRatingException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeBySP_Moody(sandp, moodys);
	}

	/**
	* Returns the number of ratings where sandp = &#63; and moodys = &#63;.
	*
	* @param sandp the sandp
	* @param moodys the moodys
	* @return the number of matching ratings
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySP_Moody(java.lang.String sandp,
		java.lang.String moodys)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBySP_Moody(sandp, moodys);
	}

	/**
	* Returns the rating where fitch = &#63; or throws a {@link com.fingence.slayer.NoSuchRatingException} if it could not be found.
	*
	* @param fitch the fitch
	* @return the matching rating
	* @throws com.fingence.slayer.NoSuchRatingException if a matching rating could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Rating findByComposite(
		java.lang.String fitch)
		throws com.fingence.slayer.NoSuchRatingException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByComposite(fitch);
	}

	/**
	* Returns the rating where fitch = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param fitch the fitch
	* @return the matching rating, or <code>null</code> if a matching rating could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Rating fetchByComposite(
		java.lang.String fitch)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByComposite(fitch);
	}

	/**
	* Returns the rating where fitch = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param fitch the fitch
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching rating, or <code>null</code> if a matching rating could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Rating fetchByComposite(
		java.lang.String fitch, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByComposite(fitch, retrieveFromCache);
	}

	/**
	* Removes the rating where fitch = &#63; from the database.
	*
	* @param fitch the fitch
	* @return the rating that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Rating removeByComposite(
		java.lang.String fitch)
		throws com.fingence.slayer.NoSuchRatingException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByComposite(fitch);
	}

	/**
	* Returns the number of ratings where fitch = &#63;.
	*
	* @param fitch the fitch
	* @return the number of matching ratings
	* @throws SystemException if a system exception occurred
	*/
	public static int countByComposite(java.lang.String fitch)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByComposite(fitch);
	}

	/**
	* Returns all the ratings where description = &#63;.
	*
	* @param description the description
	* @return the matching ratings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.fingence.slayer.model.Rating> findByDescription(
		java.lang.String description)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDescription(description);
	}

	/**
	* Returns a range of all the ratings where description = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.RatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param description the description
	* @param start the lower bound of the range of ratings
	* @param end the upper bound of the range of ratings (not inclusive)
	* @return the range of matching ratings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.fingence.slayer.model.Rating> findByDescription(
		java.lang.String description, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDescription(description, start, end);
	}

	/**
	* Returns an ordered range of all the ratings where description = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.RatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param description the description
	* @param start the lower bound of the range of ratings
	* @param end the upper bound of the range of ratings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ratings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.fingence.slayer.model.Rating> findByDescription(
		java.lang.String description, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDescription(description, start, end, orderByComparator);
	}

	/**
	* Returns the first rating in the ordered set where description = &#63;.
	*
	* @param description the description
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rating
	* @throws com.fingence.slayer.NoSuchRatingException if a matching rating could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Rating findByDescription_First(
		java.lang.String description,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchRatingException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDescription_First(description, orderByComparator);
	}

	/**
	* Returns the first rating in the ordered set where description = &#63;.
	*
	* @param description the description
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rating, or <code>null</code> if a matching rating could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Rating fetchByDescription_First(
		java.lang.String description,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDescription_First(description, orderByComparator);
	}

	/**
	* Returns the last rating in the ordered set where description = &#63;.
	*
	* @param description the description
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rating
	* @throws com.fingence.slayer.NoSuchRatingException if a matching rating could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Rating findByDescription_Last(
		java.lang.String description,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchRatingException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDescription_Last(description, orderByComparator);
	}

	/**
	* Returns the last rating in the ordered set where description = &#63;.
	*
	* @param description the description
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rating, or <code>null</code> if a matching rating could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Rating fetchByDescription_Last(
		java.lang.String description,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDescription_Last(description, orderByComparator);
	}

	/**
	* Returns the ratings before and after the current rating in the ordered set where description = &#63;.
	*
	* @param ratingId the primary key of the current rating
	* @param description the description
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next rating
	* @throws com.fingence.slayer.NoSuchRatingException if a rating with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Rating[] findByDescription_PrevAndNext(
		long ratingId, java.lang.String description,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchRatingException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDescription_PrevAndNext(ratingId, description,
			orderByComparator);
	}

	/**
	* Removes all the ratings where description = &#63; from the database.
	*
	* @param description the description
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDescription(java.lang.String description)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDescription(description);
	}

	/**
	* Returns the number of ratings where description = &#63;.
	*
	* @param description the description
	* @return the number of matching ratings
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDescription(java.lang.String description)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDescription(description);
	}

	/**
	* Caches the rating in the entity cache if it is enabled.
	*
	* @param rating the rating
	*/
	public static void cacheResult(com.fingence.slayer.model.Rating rating) {
		getPersistence().cacheResult(rating);
	}

	/**
	* Caches the ratings in the entity cache if it is enabled.
	*
	* @param ratings the ratings
	*/
	public static void cacheResult(
		java.util.List<com.fingence.slayer.model.Rating> ratings) {
		getPersistence().cacheResult(ratings);
	}

	/**
	* Creates a new rating with the primary key. Does not add the rating to the database.
	*
	* @param ratingId the primary key for the new rating
	* @return the new rating
	*/
	public static com.fingence.slayer.model.Rating create(long ratingId) {
		return getPersistence().create(ratingId);
	}

	/**
	* Removes the rating with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ratingId the primary key of the rating
	* @return the rating that was removed
	* @throws com.fingence.slayer.NoSuchRatingException if a rating with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Rating remove(long ratingId)
		throws com.fingence.slayer.NoSuchRatingException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(ratingId);
	}

	public static com.fingence.slayer.model.Rating updateImpl(
		com.fingence.slayer.model.Rating rating)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(rating);
	}

	/**
	* Returns the rating with the primary key or throws a {@link com.fingence.slayer.NoSuchRatingException} if it could not be found.
	*
	* @param ratingId the primary key of the rating
	* @return the rating
	* @throws com.fingence.slayer.NoSuchRatingException if a rating with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Rating findByPrimaryKey(
		long ratingId)
		throws com.fingence.slayer.NoSuchRatingException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(ratingId);
	}

	/**
	* Returns the rating with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ratingId the primary key of the rating
	* @return the rating, or <code>null</code> if a rating with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Rating fetchByPrimaryKey(
		long ratingId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(ratingId);
	}

	/**
	* Returns all the ratings.
	*
	* @return the ratings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.fingence.slayer.model.Rating> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the ratings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.RatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ratings
	* @param end the upper bound of the range of ratings (not inclusive)
	* @return the range of ratings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.fingence.slayer.model.Rating> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the ratings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.RatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ratings
	* @param end the upper bound of the range of ratings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ratings
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.fingence.slayer.model.Rating> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the ratings from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ratings.
	*
	* @return the number of ratings
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static RatingPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (RatingPersistence)PortletBeanLocatorUtil.locate(com.fingence.slayer.service.ClpSerializer.getServletContextName(),
					RatingPersistence.class.getName());

			ReferenceRegistry.registerReference(RatingUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(RatingPersistence persistence) {
	}

	private static RatingPersistence _persistence;
}