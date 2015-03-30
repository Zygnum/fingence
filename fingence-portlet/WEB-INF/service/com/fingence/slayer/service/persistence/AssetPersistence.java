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

import com.fingence.slayer.model.Asset;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the asset service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ahmed Hasan
 * @see AssetPersistenceImpl
 * @see AssetUtil
 * @generated
 */
public interface AssetPersistence extends BasePersistence<Asset> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AssetUtil} to access the asset persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the asset where id_isin = &#63; or throws a {@link com.fingence.slayer.NoSuchAssetException} if it could not be found.
	*
	* @param id_isin the id_isin
	* @return the matching asset
	* @throws com.fingence.slayer.NoSuchAssetException if a matching asset could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Asset findByIdISIN(
		java.lang.String id_isin)
		throws com.fingence.slayer.NoSuchAssetException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the asset where id_isin = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param id_isin the id_isin
	* @return the matching asset, or <code>null</code> if a matching asset could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Asset fetchByIdISIN(
		java.lang.String id_isin)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the asset where id_isin = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param id_isin the id_isin
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching asset, or <code>null</code> if a matching asset could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Asset fetchByIdISIN(
		java.lang.String id_isin, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the asset where id_isin = &#63; from the database.
	*
	* @param id_isin the id_isin
	* @return the asset that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Asset removeByIdISIN(
		java.lang.String id_isin)
		throws com.fingence.slayer.NoSuchAssetException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assets where id_isin = &#63;.
	*
	* @param id_isin the id_isin
	* @return the number of matching assets
	* @throws SystemException if a system exception occurred
	*/
	public int countByIdISIN(java.lang.String id_isin)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the asset where id_isin = &#63; and security_ticker = &#63; or throws a {@link com.fingence.slayer.NoSuchAssetException} if it could not be found.
	*
	* @param id_isin the id_isin
	* @param security_ticker the security_ticker
	* @return the matching asset
	* @throws com.fingence.slayer.NoSuchAssetException if a matching asset could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Asset findByIdISIN_Ticker(
		java.lang.String id_isin, java.lang.String security_ticker)
		throws com.fingence.slayer.NoSuchAssetException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the asset where id_isin = &#63; and security_ticker = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param id_isin the id_isin
	* @param security_ticker the security_ticker
	* @return the matching asset, or <code>null</code> if a matching asset could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Asset fetchByIdISIN_Ticker(
		java.lang.String id_isin, java.lang.String security_ticker)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the asset where id_isin = &#63; and security_ticker = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param id_isin the id_isin
	* @param security_ticker the security_ticker
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching asset, or <code>null</code> if a matching asset could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Asset fetchByIdISIN_Ticker(
		java.lang.String id_isin, java.lang.String security_ticker,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the asset where id_isin = &#63; and security_ticker = &#63; from the database.
	*
	* @param id_isin the id_isin
	* @param security_ticker the security_ticker
	* @return the asset that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Asset removeByIdISIN_Ticker(
		java.lang.String id_isin, java.lang.String security_ticker)
		throws com.fingence.slayer.NoSuchAssetException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assets where id_isin = &#63; and security_ticker = &#63;.
	*
	* @param id_isin the id_isin
	* @param security_ticker the security_ticker
	* @return the number of matching assets
	* @throws SystemException if a system exception occurred
	*/
	public int countByIdISIN_Ticker(java.lang.String id_isin,
		java.lang.String security_ticker)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the asset in the entity cache if it is enabled.
	*
	* @param asset the asset
	*/
	public void cacheResult(com.fingence.slayer.model.Asset asset);

	/**
	* Caches the assets in the entity cache if it is enabled.
	*
	* @param assets the assets
	*/
	public void cacheResult(
		java.util.List<com.fingence.slayer.model.Asset> assets);

	/**
	* Creates a new asset with the primary key. Does not add the asset to the database.
	*
	* @param assetId the primary key for the new asset
	* @return the new asset
	*/
	public com.fingence.slayer.model.Asset create(long assetId);

	/**
	* Removes the asset with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param assetId the primary key of the asset
	* @return the asset that was removed
	* @throws com.fingence.slayer.NoSuchAssetException if a asset with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Asset remove(long assetId)
		throws com.fingence.slayer.NoSuchAssetException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.fingence.slayer.model.Asset updateImpl(
		com.fingence.slayer.model.Asset asset)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the asset with the primary key or throws a {@link com.fingence.slayer.NoSuchAssetException} if it could not be found.
	*
	* @param assetId the primary key of the asset
	* @return the asset
	* @throws com.fingence.slayer.NoSuchAssetException if a asset with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Asset findByPrimaryKey(long assetId)
		throws com.fingence.slayer.NoSuchAssetException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the asset with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param assetId the primary key of the asset
	* @return the asset, or <code>null</code> if a asset with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Asset fetchByPrimaryKey(long assetId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the assets.
	*
	* @return the assets
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.Asset> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the assets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.AssetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assets
	* @param end the upper bound of the range of assets (not inclusive)
	* @return the range of assets
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.Asset> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the assets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.AssetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of assets
	* @param end the upper bound of the range of assets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of assets
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.Asset> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the assets from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of assets.
	*
	* @return the number of assets
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}