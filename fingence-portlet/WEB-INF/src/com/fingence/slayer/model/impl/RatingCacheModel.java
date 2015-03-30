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

package com.fingence.slayer.model.impl;

import com.fingence.slayer.model.Rating;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Rating in entity cache.
 *
 * @author Ahmed Hasan
 * @see Rating
 * @generated
 */
public class RatingCacheModel implements CacheModel<Rating>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{ratingId=");
		sb.append(ratingId);
		sb.append(", moodys=");
		sb.append(moodys);
		sb.append(", sandp=");
		sb.append(sandp);
		sb.append(", fitch=");
		sb.append(fitch);
		sb.append(", general=");
		sb.append(general);
		sb.append(", description=");
		sb.append(description);
		sb.append(", creditWorthiness=");
		sb.append(creditWorthiness);
		sb.append(", category=");
		sb.append(category);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Rating toEntityModel() {
		RatingImpl ratingImpl = new RatingImpl();

		ratingImpl.setRatingId(ratingId);

		if (moodys == null) {
			ratingImpl.setMoodys(StringPool.BLANK);
		}
		else {
			ratingImpl.setMoodys(moodys);
		}

		if (sandp == null) {
			ratingImpl.setSandp(StringPool.BLANK);
		}
		else {
			ratingImpl.setSandp(sandp);
		}

		if (fitch == null) {
			ratingImpl.setFitch(StringPool.BLANK);
		}
		else {
			ratingImpl.setFitch(fitch);
		}

		if (general == null) {
			ratingImpl.setGeneral(StringPool.BLANK);
		}
		else {
			ratingImpl.setGeneral(general);
		}

		if (description == null) {
			ratingImpl.setDescription(StringPool.BLANK);
		}
		else {
			ratingImpl.setDescription(description);
		}

		if (creditWorthiness == null) {
			ratingImpl.setCreditWorthiness(StringPool.BLANK);
		}
		else {
			ratingImpl.setCreditWorthiness(creditWorthiness);
		}

		if (category == null) {
			ratingImpl.setCategory(StringPool.BLANK);
		}
		else {
			ratingImpl.setCategory(category);
		}

		ratingImpl.resetOriginalValues();

		return ratingImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ratingId = objectInput.readLong();
		moodys = objectInput.readUTF();
		sandp = objectInput.readUTF();
		fitch = objectInput.readUTF();
		general = objectInput.readUTF();
		description = objectInput.readUTF();
		creditWorthiness = objectInput.readUTF();
		category = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(ratingId);

		if (moodys == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(moodys);
		}

		if (sandp == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sandp);
		}

		if (fitch == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fitch);
		}

		if (general == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(general);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (creditWorthiness == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(creditWorthiness);
		}

		if (category == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(category);
		}
	}

	public long ratingId;
	public String moodys;
	public String sandp;
	public String fitch;
	public String general;
	public String description;
	public String creditWorthiness;
	public String category;
}