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
 * Provides a wrapper for {@link RatingLocalService}.
 *
 * @author Ahmed Hasan
 * @see RatingLocalService
 * @generated
 */
public class RatingLocalServiceWrapper implements RatingLocalService,
	ServiceWrapper<RatingLocalService> {
	public RatingLocalServiceWrapper(RatingLocalService ratingLocalService) {
		_ratingLocalService = ratingLocalService;
	}

	/**
	* Adds the rating to the database. Also notifies the appropriate model listeners.
	*
	* @param rating the rating
	* @return the rating that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.Rating addRating(
		com.fingence.slayer.model.Rating rating)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ratingLocalService.addRating(rating);
	}

	/**
	* Creates a new rating with the primary key. Does not add the rating to the database.
	*
	* @param ratingId the primary key for the new rating
	* @return the new rating
	*/
	@Override
	public com.fingence.slayer.model.Rating createRating(long ratingId) {
		return _ratingLocalService.createRating(ratingId);
	}

	/**
	* Deletes the rating with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ratingId the primary key of the rating
	* @return the rating that was removed
	* @throws PortalException if a rating with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.Rating deleteRating(long ratingId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _ratingLocalService.deleteRating(ratingId);
	}

	/**
	* Deletes the rating from the database. Also notifies the appropriate model listeners.
	*
	* @param rating the rating
	* @return the rating that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.Rating deleteRating(
		com.fingence.slayer.model.Rating rating)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ratingLocalService.deleteRating(rating);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ratingLocalService.dynamicQuery();
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
		return _ratingLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.RatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _ratingLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.RatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _ratingLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _ratingLocalService.dynamicQueryCount(dynamicQuery);
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
		return _ratingLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.fingence.slayer.model.Rating fetchRating(long ratingId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ratingLocalService.fetchRating(ratingId);
	}

	/**
	* Returns the rating with the primary key.
	*
	* @param ratingId the primary key of the rating
	* @return the rating
	* @throws PortalException if a rating with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.Rating getRating(long ratingId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _ratingLocalService.getRating(ratingId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _ratingLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.fingence.slayer.model.Rating> getRatings(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ratingLocalService.getRatings(start, end);
	}

	/**
	* Returns the number of ratings.
	*
	* @return the number of ratings
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getRatingsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ratingLocalService.getRatingsCount();
	}

	/**
	* Updates the rating in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param rating the rating
	* @return the rating that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.Rating updateRating(
		com.fingence.slayer.model.Rating rating)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _ratingLocalService.updateRating(rating);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _ratingLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_ratingLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _ratingLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public com.fingence.slayer.model.Rating findByFitch(java.lang.String fitch) {
		return _ratingLocalService.findByFitch(fitch);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public RatingLocalService getWrappedRatingLocalService() {
		return _ratingLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedRatingLocalService(
		RatingLocalService ratingLocalService) {
		_ratingLocalService = ratingLocalService;
	}

	@Override
	public RatingLocalService getWrappedService() {
		return _ratingLocalService;
	}

	@Override
	public void setWrappedService(RatingLocalService ratingLocalService) {
		_ratingLocalService = ratingLocalService;
	}

	private RatingLocalService _ratingLocalService;
}