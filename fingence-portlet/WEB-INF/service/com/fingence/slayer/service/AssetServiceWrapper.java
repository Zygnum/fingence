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
 * Provides a wrapper for {@link AssetService}.
 *
 * @author Ahmed Hasan
 * @see AssetService
 * @generated
 */
public class AssetServiceWrapper implements AssetService,
	ServiceWrapper<AssetService> {
	public AssetServiceWrapper(AssetService assetService) {
		_assetService = assetService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _assetService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_assetService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _assetService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.util.List<com.fingence.slayer.model.Asset> getAssets(
		java.lang.String pattern, boolean ticker) {
		return _assetService.getAssets(pattern, ticker);
	}

	@Override
	public boolean isAssetPresent(java.lang.String id_isin,
		java.lang.String security_ticker) {
		return _assetService.isAssetPresent(id_isin, security_ticker);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AssetService getWrappedAssetService() {
		return _assetService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAssetService(AssetService assetService) {
		_assetService = assetService;
	}

	@Override
	public AssetService getWrappedService() {
		return _assetService;
	}

	@Override
	public void setWrappedService(AssetService assetService) {
		_assetService = assetService;
	}

	private AssetService _assetService;
}