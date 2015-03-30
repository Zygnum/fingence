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

package com.fingence.slayer.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Rating}.
 * </p>
 *
 * @author Ahmed Hasan
 * @see Rating
 * @generated
 */
public class RatingWrapper implements Rating, ModelWrapper<Rating> {
	public RatingWrapper(Rating rating) {
		_rating = rating;
	}

	@Override
	public Class<?> getModelClass() {
		return Rating.class;
	}

	@Override
	public String getModelClassName() {
		return Rating.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ratingId", getRatingId());
		attributes.put("moodys", getMoodys());
		attributes.put("sandp", getSandp());
		attributes.put("fitch", getFitch());
		attributes.put("general", getGeneral());
		attributes.put("description", getDescription());
		attributes.put("creditWorthiness", getCreditWorthiness());
		attributes.put("category", getCategory());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ratingId = (Long)attributes.get("ratingId");

		if (ratingId != null) {
			setRatingId(ratingId);
		}

		String moodys = (String)attributes.get("moodys");

		if (moodys != null) {
			setMoodys(moodys);
		}

		String sandp = (String)attributes.get("sandp");

		if (sandp != null) {
			setSandp(sandp);
		}

		String fitch = (String)attributes.get("fitch");

		if (fitch != null) {
			setFitch(fitch);
		}

		String general = (String)attributes.get("general");

		if (general != null) {
			setGeneral(general);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String creditWorthiness = (String)attributes.get("creditWorthiness");

		if (creditWorthiness != null) {
			setCreditWorthiness(creditWorthiness);
		}

		String category = (String)attributes.get("category");

		if (category != null) {
			setCategory(category);
		}
	}

	/**
	* Returns the primary key of this rating.
	*
	* @return the primary key of this rating
	*/
	@Override
	public long getPrimaryKey() {
		return _rating.getPrimaryKey();
	}

	/**
	* Sets the primary key of this rating.
	*
	* @param primaryKey the primary key of this rating
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_rating.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the rating ID of this rating.
	*
	* @return the rating ID of this rating
	*/
	@Override
	public long getRatingId() {
		return _rating.getRatingId();
	}

	/**
	* Sets the rating ID of this rating.
	*
	* @param ratingId the rating ID of this rating
	*/
	@Override
	public void setRatingId(long ratingId) {
		_rating.setRatingId(ratingId);
	}

	/**
	* Returns the moodys of this rating.
	*
	* @return the moodys of this rating
	*/
	@Override
	public java.lang.String getMoodys() {
		return _rating.getMoodys();
	}

	/**
	* Sets the moodys of this rating.
	*
	* @param moodys the moodys of this rating
	*/
	@Override
	public void setMoodys(java.lang.String moodys) {
		_rating.setMoodys(moodys);
	}

	/**
	* Returns the sandp of this rating.
	*
	* @return the sandp of this rating
	*/
	@Override
	public java.lang.String getSandp() {
		return _rating.getSandp();
	}

	/**
	* Sets the sandp of this rating.
	*
	* @param sandp the sandp of this rating
	*/
	@Override
	public void setSandp(java.lang.String sandp) {
		_rating.setSandp(sandp);
	}

	/**
	* Returns the fitch of this rating.
	*
	* @return the fitch of this rating
	*/
	@Override
	public java.lang.String getFitch() {
		return _rating.getFitch();
	}

	/**
	* Sets the fitch of this rating.
	*
	* @param fitch the fitch of this rating
	*/
	@Override
	public void setFitch(java.lang.String fitch) {
		_rating.setFitch(fitch);
	}

	/**
	* Returns the general of this rating.
	*
	* @return the general of this rating
	*/
	@Override
	public java.lang.String getGeneral() {
		return _rating.getGeneral();
	}

	/**
	* Sets the general of this rating.
	*
	* @param general the general of this rating
	*/
	@Override
	public void setGeneral(java.lang.String general) {
		_rating.setGeneral(general);
	}

	/**
	* Returns the description of this rating.
	*
	* @return the description of this rating
	*/
	@Override
	public java.lang.String getDescription() {
		return _rating.getDescription();
	}

	/**
	* Sets the description of this rating.
	*
	* @param description the description of this rating
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_rating.setDescription(description);
	}

	/**
	* Returns the credit worthiness of this rating.
	*
	* @return the credit worthiness of this rating
	*/
	@Override
	public java.lang.String getCreditWorthiness() {
		return _rating.getCreditWorthiness();
	}

	/**
	* Sets the credit worthiness of this rating.
	*
	* @param creditWorthiness the credit worthiness of this rating
	*/
	@Override
	public void setCreditWorthiness(java.lang.String creditWorthiness) {
		_rating.setCreditWorthiness(creditWorthiness);
	}

	/**
	* Returns the category of this rating.
	*
	* @return the category of this rating
	*/
	@Override
	public java.lang.String getCategory() {
		return _rating.getCategory();
	}

	/**
	* Sets the category of this rating.
	*
	* @param category the category of this rating
	*/
	@Override
	public void setCategory(java.lang.String category) {
		_rating.setCategory(category);
	}

	@Override
	public boolean isNew() {
		return _rating.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_rating.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _rating.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_rating.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _rating.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _rating.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_rating.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _rating.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_rating.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_rating.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_rating.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new RatingWrapper((Rating)_rating.clone());
	}

	@Override
	public int compareTo(Rating rating) {
		return _rating.compareTo(rating);
	}

	@Override
	public int hashCode() {
		return _rating.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<Rating> toCacheModel() {
		return _rating.toCacheModel();
	}

	@Override
	public Rating toEscapedModel() {
		return new RatingWrapper(_rating.toEscapedModel());
	}

	@Override
	public Rating toUnescapedModel() {
		return new RatingWrapper(_rating.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _rating.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _rating.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_rating.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RatingWrapper)) {
			return false;
		}

		RatingWrapper ratingWrapper = (RatingWrapper)obj;

		if (Validator.equals(_rating, ratingWrapper._rating)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Rating getWrappedRating() {
		return _rating;
	}

	@Override
	public Rating getWrappedModel() {
		return _rating;
	}

	@Override
	public void resetOriginalValues() {
		_rating.resetOriginalValues();
	}

	private Rating _rating;
}