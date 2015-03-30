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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.fingence.slayer.service.http.RatingServiceSoap}.
 *
 * @author Ahmed Hasan
 * @see com.fingence.slayer.service.http.RatingServiceSoap
 * @generated
 */
public class RatingSoap implements Serializable {
	public static RatingSoap toSoapModel(Rating model) {
		RatingSoap soapModel = new RatingSoap();

		soapModel.setRatingId(model.getRatingId());
		soapModel.setMoodys(model.getMoodys());
		soapModel.setSandp(model.getSandp());
		soapModel.setFitch(model.getFitch());
		soapModel.setGeneral(model.getGeneral());
		soapModel.setDescription(model.getDescription());
		soapModel.setCreditWorthiness(model.getCreditWorthiness());
		soapModel.setCategory(model.getCategory());

		return soapModel;
	}

	public static RatingSoap[] toSoapModels(Rating[] models) {
		RatingSoap[] soapModels = new RatingSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RatingSoap[][] toSoapModels(Rating[][] models) {
		RatingSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RatingSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RatingSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RatingSoap[] toSoapModels(List<Rating> models) {
		List<RatingSoap> soapModels = new ArrayList<RatingSoap>(models.size());

		for (Rating model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RatingSoap[soapModels.size()]);
	}

	public RatingSoap() {
	}

	public long getPrimaryKey() {
		return _ratingId;
	}

	public void setPrimaryKey(long pk) {
		setRatingId(pk);
	}

	public long getRatingId() {
		return _ratingId;
	}

	public void setRatingId(long ratingId) {
		_ratingId = ratingId;
	}

	public String getMoodys() {
		return _moodys;
	}

	public void setMoodys(String moodys) {
		_moodys = moodys;
	}

	public String getSandp() {
		return _sandp;
	}

	public void setSandp(String sandp) {
		_sandp = sandp;
	}

	public String getFitch() {
		return _fitch;
	}

	public void setFitch(String fitch) {
		_fitch = fitch;
	}

	public String getGeneral() {
		return _general;
	}

	public void setGeneral(String general) {
		_general = general;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getCreditWorthiness() {
		return _creditWorthiness;
	}

	public void setCreditWorthiness(String creditWorthiness) {
		_creditWorthiness = creditWorthiness;
	}

	public String getCategory() {
		return _category;
	}

	public void setCategory(String category) {
		_category = category;
	}

	private long _ratingId;
	private String _moodys;
	private String _sandp;
	private String _fitch;
	private String _general;
	private String _description;
	private String _creditWorthiness;
	private String _category;
}