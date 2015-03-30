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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author Ahmed Hasan
 */
public class MyResultFinderUtil {
	public static java.util.List<com.fingence.slayer.model.MyResult> findResults(
		java.lang.String portfolioIds) {
		return getFinder().findResults(portfolioIds);
	}

	public static java.util.List<com.fingence.slayer.model.MyResult> findResults(
		java.lang.String portfolioIds, java.lang.String[] tokens,
		java.lang.String[] replacements) {
		return getFinder().findResults(portfolioIds, tokens, replacements);
	}

	public static MyResultFinder getFinder() {
		if (_finder == null) {
			_finder = (MyResultFinder)PortletBeanLocatorUtil.locate(com.fingence.slayer.service.ClpSerializer.getServletContextName(),
					MyResultFinder.class.getName());

			ReferenceRegistry.registerReference(MyResultFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(MyResultFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(MyResultFinderUtil.class, "_finder");
	}

	private static MyResultFinder _finder;
}