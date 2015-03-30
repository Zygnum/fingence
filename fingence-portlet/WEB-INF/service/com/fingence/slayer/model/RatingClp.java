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

import com.fingence.slayer.service.ClpSerializer;
import com.fingence.slayer.service.RatingLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ahmed Hasan
 */
public class RatingClp extends BaseModelImpl<Rating> implements Rating {
	public RatingClp() {
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
	public long getPrimaryKey() {
		return _ratingId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setRatingId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ratingId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getRatingId() {
		return _ratingId;
	}

	@Override
	public void setRatingId(long ratingId) {
		_ratingId = ratingId;

		if (_ratingRemoteModel != null) {
			try {
				Class<?> clazz = _ratingRemoteModel.getClass();

				Method method = clazz.getMethod("setRatingId", long.class);

				method.invoke(_ratingRemoteModel, ratingId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMoodys() {
		return _moodys;
	}

	@Override
	public void setMoodys(String moodys) {
		_moodys = moodys;

		if (_ratingRemoteModel != null) {
			try {
				Class<?> clazz = _ratingRemoteModel.getClass();

				Method method = clazz.getMethod("setMoodys", String.class);

				method.invoke(_ratingRemoteModel, moodys);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSandp() {
		return _sandp;
	}

	@Override
	public void setSandp(String sandp) {
		_sandp = sandp;

		if (_ratingRemoteModel != null) {
			try {
				Class<?> clazz = _ratingRemoteModel.getClass();

				Method method = clazz.getMethod("setSandp", String.class);

				method.invoke(_ratingRemoteModel, sandp);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFitch() {
		return _fitch;
	}

	@Override
	public void setFitch(String fitch) {
		_fitch = fitch;

		if (_ratingRemoteModel != null) {
			try {
				Class<?> clazz = _ratingRemoteModel.getClass();

				Method method = clazz.getMethod("setFitch", String.class);

				method.invoke(_ratingRemoteModel, fitch);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGeneral() {
		return _general;
	}

	@Override
	public void setGeneral(String general) {
		_general = general;

		if (_ratingRemoteModel != null) {
			try {
				Class<?> clazz = _ratingRemoteModel.getClass();

				Method method = clazz.getMethod("setGeneral", String.class);

				method.invoke(_ratingRemoteModel, general);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_ratingRemoteModel != null) {
			try {
				Class<?> clazz = _ratingRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_ratingRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCreditWorthiness() {
		return _creditWorthiness;
	}

	@Override
	public void setCreditWorthiness(String creditWorthiness) {
		_creditWorthiness = creditWorthiness;

		if (_ratingRemoteModel != null) {
			try {
				Class<?> clazz = _ratingRemoteModel.getClass();

				Method method = clazz.getMethod("setCreditWorthiness",
						String.class);

				method.invoke(_ratingRemoteModel, creditWorthiness);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCategory() {
		return _category;
	}

	@Override
	public void setCategory(String category) {
		_category = category;

		if (_ratingRemoteModel != null) {
			try {
				Class<?> clazz = _ratingRemoteModel.getClass();

				Method method = clazz.getMethod("setCategory", String.class);

				method.invoke(_ratingRemoteModel, category);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getRatingRemoteModel() {
		return _ratingRemoteModel;
	}

	public void setRatingRemoteModel(BaseModel<?> ratingRemoteModel) {
		_ratingRemoteModel = ratingRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _ratingRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_ratingRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			RatingLocalServiceUtil.addRating(this);
		}
		else {
			RatingLocalServiceUtil.updateRating(this);
		}
	}

	@Override
	public Rating toEscapedModel() {
		return (Rating)ProxyUtil.newProxyInstance(Rating.class.getClassLoader(),
			new Class[] { Rating.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		RatingClp clone = new RatingClp();

		clone.setRatingId(getRatingId());
		clone.setMoodys(getMoodys());
		clone.setSandp(getSandp());
		clone.setFitch(getFitch());
		clone.setGeneral(getGeneral());
		clone.setDescription(getDescription());
		clone.setCreditWorthiness(getCreditWorthiness());
		clone.setCategory(getCategory());

		return clone;
	}

	@Override
	public int compareTo(Rating rating) {
		long primaryKey = rating.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RatingClp)) {
			return false;
		}

		RatingClp rating = (RatingClp)obj;

		long primaryKey = rating.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{ratingId=");
		sb.append(getRatingId());
		sb.append(", moodys=");
		sb.append(getMoodys());
		sb.append(", sandp=");
		sb.append(getSandp());
		sb.append(", fitch=");
		sb.append(getFitch());
		sb.append(", general=");
		sb.append(getGeneral());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", creditWorthiness=");
		sb.append(getCreditWorthiness());
		sb.append(", category=");
		sb.append(getCategory());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.fingence.slayer.model.Rating");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ratingId</column-name><column-value><![CDATA[");
		sb.append(getRatingId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>moodys</column-name><column-value><![CDATA[");
		sb.append(getMoodys());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sandp</column-name><column-value><![CDATA[");
		sb.append(getSandp());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fitch</column-name><column-value><![CDATA[");
		sb.append(getFitch());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>general</column-name><column-value><![CDATA[");
		sb.append(getGeneral());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>creditWorthiness</column-name><column-value><![CDATA[");
		sb.append(getCreditWorthiness());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>category</column-name><column-value><![CDATA[");
		sb.append(getCategory());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _ratingId;
	private String _moodys;
	private String _sandp;
	private String _fitch;
	private String _general;
	private String _description;
	private String _creditWorthiness;
	private String _category;
	private BaseModel<?> _ratingRemoteModel;
}