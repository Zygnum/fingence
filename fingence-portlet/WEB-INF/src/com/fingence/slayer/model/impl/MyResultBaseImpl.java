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

import com.fingence.slayer.model.MyResult;
import com.fingence.slayer.service.MyResultLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the MyResult service. Represents a row in the &quot;fing_MyResult&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MyResultImpl}.
 * </p>
 *
 * @author Ahmed Hasan
 * @see MyResultImpl
 * @see com.fingence.slayer.model.MyResult
 * @generated
 */
public abstract class MyResultBaseImpl extends MyResultModelImpl
	implements MyResult {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a my result model instance should use the {@link MyResult} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			MyResultLocalServiceUtil.addMyResult(this);
		}
		else {
			MyResultLocalServiceUtil.updateMyResult(this);
		}
	}
}