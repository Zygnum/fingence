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

import com.fingence.slayer.NoSuchAssetException;
import com.fingence.slayer.model.Asset;
import com.fingence.slayer.model.impl.AssetImpl;
import com.fingence.slayer.model.impl.AssetModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the asset service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ahmed Hasan
 * @see AssetPersistence
 * @see AssetUtil
 * @generated
 */
public class AssetPersistenceImpl extends BasePersistenceImpl<Asset>
	implements AssetPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AssetUtil} to access the asset persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AssetImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AssetModelImpl.ENTITY_CACHE_ENABLED,
			AssetModelImpl.FINDER_CACHE_ENABLED, AssetImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AssetModelImpl.ENTITY_CACHE_ENABLED,
			AssetModelImpl.FINDER_CACHE_ENABLED, AssetImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AssetModelImpl.ENTITY_CACHE_ENABLED,
			AssetModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_IDISIN = new FinderPath(AssetModelImpl.ENTITY_CACHE_ENABLED,
			AssetModelImpl.FINDER_CACHE_ENABLED, AssetImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByIdISIN",
			new String[] { String.class.getName() },
			AssetModelImpl.ID_ISIN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_IDISIN = new FinderPath(AssetModelImpl.ENTITY_CACHE_ENABLED,
			AssetModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByIdISIN",
			new String[] { String.class.getName() });

	/**
	 * Returns the asset where id_isin = &#63; or throws a {@link com.fingence.slayer.NoSuchAssetException} if it could not be found.
	 *
	 * @param id_isin the id_isin
	 * @return the matching asset
	 * @throws com.fingence.slayer.NoSuchAssetException if a matching asset could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Asset findByIdISIN(String id_isin)
		throws NoSuchAssetException, SystemException {
		Asset asset = fetchByIdISIN(id_isin);

		if (asset == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("id_isin=");
			msg.append(id_isin);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchAssetException(msg.toString());
		}

		return asset;
	}

	/**
	 * Returns the asset where id_isin = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param id_isin the id_isin
	 * @return the matching asset, or <code>null</code> if a matching asset could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Asset fetchByIdISIN(String id_isin) throws SystemException {
		return fetchByIdISIN(id_isin, true);
	}

	/**
	 * Returns the asset where id_isin = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param id_isin the id_isin
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching asset, or <code>null</code> if a matching asset could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Asset fetchByIdISIN(String id_isin, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { id_isin };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_IDISIN,
					finderArgs, this);
		}

		if (result instanceof Asset) {
			Asset asset = (Asset)result;

			if (!Validator.equals(id_isin, asset.getId_isin())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_ASSET_WHERE);

			boolean bindId_isin = false;

			if (id_isin == null) {
				query.append(_FINDER_COLUMN_IDISIN_ID_ISIN_1);
			}
			else if (id_isin.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IDISIN_ID_ISIN_3);
			}
			else {
				bindId_isin = true;

				query.append(_FINDER_COLUMN_IDISIN_ID_ISIN_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindId_isin) {
					qPos.add(id_isin);
				}

				List<Asset> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_IDISIN,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"AssetPersistenceImpl.fetchByIdISIN(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					Asset asset = list.get(0);

					result = asset;

					cacheResult(asset);

					if ((asset.getId_isin() == null) ||
							!asset.getId_isin().equals(id_isin)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_IDISIN,
							finderArgs, asset);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_IDISIN,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Asset)result;
		}
	}

	/**
	 * Removes the asset where id_isin = &#63; from the database.
	 *
	 * @param id_isin the id_isin
	 * @return the asset that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Asset removeByIdISIN(String id_isin)
		throws NoSuchAssetException, SystemException {
		Asset asset = findByIdISIN(id_isin);

		return remove(asset);
	}

	/**
	 * Returns the number of assets where id_isin = &#63;.
	 *
	 * @param id_isin the id_isin
	 * @return the number of matching assets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByIdISIN(String id_isin) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_IDISIN;

		Object[] finderArgs = new Object[] { id_isin };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ASSET_WHERE);

			boolean bindId_isin = false;

			if (id_isin == null) {
				query.append(_FINDER_COLUMN_IDISIN_ID_ISIN_1);
			}
			else if (id_isin.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IDISIN_ID_ISIN_3);
			}
			else {
				bindId_isin = true;

				query.append(_FINDER_COLUMN_IDISIN_ID_ISIN_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindId_isin) {
					qPos.add(id_isin);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_IDISIN_ID_ISIN_1 = "asset.id_isin IS NULL";
	private static final String _FINDER_COLUMN_IDISIN_ID_ISIN_2 = "asset.id_isin = ?";
	private static final String _FINDER_COLUMN_IDISIN_ID_ISIN_3 = "(asset.id_isin IS NULL OR asset.id_isin = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_IDISIN_TICKER = new FinderPath(AssetModelImpl.ENTITY_CACHE_ENABLED,
			AssetModelImpl.FINDER_CACHE_ENABLED, AssetImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByIdISIN_Ticker",
			new String[] { String.class.getName(), String.class.getName() },
			AssetModelImpl.ID_ISIN_COLUMN_BITMASK |
			AssetModelImpl.SECURITY_TICKER_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_IDISIN_TICKER = new FinderPath(AssetModelImpl.ENTITY_CACHE_ENABLED,
			AssetModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByIdISIN_Ticker",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns the asset where id_isin = &#63; and security_ticker = &#63; or throws a {@link com.fingence.slayer.NoSuchAssetException} if it could not be found.
	 *
	 * @param id_isin the id_isin
	 * @param security_ticker the security_ticker
	 * @return the matching asset
	 * @throws com.fingence.slayer.NoSuchAssetException if a matching asset could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Asset findByIdISIN_Ticker(String id_isin, String security_ticker)
		throws NoSuchAssetException, SystemException {
		Asset asset = fetchByIdISIN_Ticker(id_isin, security_ticker);

		if (asset == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("id_isin=");
			msg.append(id_isin);

			msg.append(", security_ticker=");
			msg.append(security_ticker);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchAssetException(msg.toString());
		}

		return asset;
	}

	/**
	 * Returns the asset where id_isin = &#63; and security_ticker = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param id_isin the id_isin
	 * @param security_ticker the security_ticker
	 * @return the matching asset, or <code>null</code> if a matching asset could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Asset fetchByIdISIN_Ticker(String id_isin, String security_ticker)
		throws SystemException {
		return fetchByIdISIN_Ticker(id_isin, security_ticker, true);
	}

	/**
	 * Returns the asset where id_isin = &#63; and security_ticker = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param id_isin the id_isin
	 * @param security_ticker the security_ticker
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching asset, or <code>null</code> if a matching asset could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Asset fetchByIdISIN_Ticker(String id_isin, String security_ticker,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { id_isin, security_ticker };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_IDISIN_TICKER,
					finderArgs, this);
		}

		if (result instanceof Asset) {
			Asset asset = (Asset)result;

			if (!Validator.equals(id_isin, asset.getId_isin()) ||
					!Validator.equals(security_ticker,
						asset.getSecurity_ticker())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_ASSET_WHERE);

			boolean bindId_isin = false;

			if (id_isin == null) {
				query.append(_FINDER_COLUMN_IDISIN_TICKER_ID_ISIN_1);
			}
			else if (id_isin.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IDISIN_TICKER_ID_ISIN_3);
			}
			else {
				bindId_isin = true;

				query.append(_FINDER_COLUMN_IDISIN_TICKER_ID_ISIN_2);
			}

			boolean bindSecurity_ticker = false;

			if (security_ticker == null) {
				query.append(_FINDER_COLUMN_IDISIN_TICKER_SECURITY_TICKER_1);
			}
			else if (security_ticker.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IDISIN_TICKER_SECURITY_TICKER_3);
			}
			else {
				bindSecurity_ticker = true;

				query.append(_FINDER_COLUMN_IDISIN_TICKER_SECURITY_TICKER_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindId_isin) {
					qPos.add(id_isin);
				}

				if (bindSecurity_ticker) {
					qPos.add(security_ticker);
				}

				List<Asset> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_IDISIN_TICKER,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"AssetPersistenceImpl.fetchByIdISIN_Ticker(String, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					Asset asset = list.get(0);

					result = asset;

					cacheResult(asset);

					if ((asset.getId_isin() == null) ||
							!asset.getId_isin().equals(id_isin) ||
							(asset.getSecurity_ticker() == null) ||
							!asset.getSecurity_ticker().equals(security_ticker)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_IDISIN_TICKER,
							finderArgs, asset);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_IDISIN_TICKER,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Asset)result;
		}
	}

	/**
	 * Removes the asset where id_isin = &#63; and security_ticker = &#63; from the database.
	 *
	 * @param id_isin the id_isin
	 * @param security_ticker the security_ticker
	 * @return the asset that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Asset removeByIdISIN_Ticker(String id_isin, String security_ticker)
		throws NoSuchAssetException, SystemException {
		Asset asset = findByIdISIN_Ticker(id_isin, security_ticker);

		return remove(asset);
	}

	/**
	 * Returns the number of assets where id_isin = &#63; and security_ticker = &#63;.
	 *
	 * @param id_isin the id_isin
	 * @param security_ticker the security_ticker
	 * @return the number of matching assets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByIdISIN_Ticker(String id_isin, String security_ticker)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_IDISIN_TICKER;

		Object[] finderArgs = new Object[] { id_isin, security_ticker };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ASSET_WHERE);

			boolean bindId_isin = false;

			if (id_isin == null) {
				query.append(_FINDER_COLUMN_IDISIN_TICKER_ID_ISIN_1);
			}
			else if (id_isin.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IDISIN_TICKER_ID_ISIN_3);
			}
			else {
				bindId_isin = true;

				query.append(_FINDER_COLUMN_IDISIN_TICKER_ID_ISIN_2);
			}

			boolean bindSecurity_ticker = false;

			if (security_ticker == null) {
				query.append(_FINDER_COLUMN_IDISIN_TICKER_SECURITY_TICKER_1);
			}
			else if (security_ticker.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IDISIN_TICKER_SECURITY_TICKER_3);
			}
			else {
				bindSecurity_ticker = true;

				query.append(_FINDER_COLUMN_IDISIN_TICKER_SECURITY_TICKER_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindId_isin) {
					qPos.add(id_isin);
				}

				if (bindSecurity_ticker) {
					qPos.add(security_ticker);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_IDISIN_TICKER_ID_ISIN_1 = "asset.id_isin IS NULL AND ";
	private static final String _FINDER_COLUMN_IDISIN_TICKER_ID_ISIN_2 = "asset.id_isin = ? AND ";
	private static final String _FINDER_COLUMN_IDISIN_TICKER_ID_ISIN_3 = "(asset.id_isin IS NULL OR asset.id_isin = '') AND ";
	private static final String _FINDER_COLUMN_IDISIN_TICKER_SECURITY_TICKER_1 = "asset.security_ticker IS NULL";
	private static final String _FINDER_COLUMN_IDISIN_TICKER_SECURITY_TICKER_2 = "asset.security_ticker = ?";
	private static final String _FINDER_COLUMN_IDISIN_TICKER_SECURITY_TICKER_3 = "(asset.security_ticker IS NULL OR asset.security_ticker = '')";

	public AssetPersistenceImpl() {
		setModelClass(Asset.class);
	}

	/**
	 * Caches the asset in the entity cache if it is enabled.
	 *
	 * @param asset the asset
	 */
	@Override
	public void cacheResult(Asset asset) {
		EntityCacheUtil.putResult(AssetModelImpl.ENTITY_CACHE_ENABLED,
			AssetImpl.class, asset.getPrimaryKey(), asset);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_IDISIN,
			new Object[] { asset.getId_isin() }, asset);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_IDISIN_TICKER,
			new Object[] { asset.getId_isin(), asset.getSecurity_ticker() },
			asset);

		asset.resetOriginalValues();
	}

	/**
	 * Caches the assets in the entity cache if it is enabled.
	 *
	 * @param assets the assets
	 */
	@Override
	public void cacheResult(List<Asset> assets) {
		for (Asset asset : assets) {
			if (EntityCacheUtil.getResult(AssetModelImpl.ENTITY_CACHE_ENABLED,
						AssetImpl.class, asset.getPrimaryKey()) == null) {
				cacheResult(asset);
			}
			else {
				asset.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all assets.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AssetImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AssetImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the asset.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Asset asset) {
		EntityCacheUtil.removeResult(AssetModelImpl.ENTITY_CACHE_ENABLED,
			AssetImpl.class, asset.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(asset);
	}

	@Override
	public void clearCache(List<Asset> assets) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Asset asset : assets) {
			EntityCacheUtil.removeResult(AssetModelImpl.ENTITY_CACHE_ENABLED,
				AssetImpl.class, asset.getPrimaryKey());

			clearUniqueFindersCache(asset);
		}
	}

	protected void cacheUniqueFindersCache(Asset asset) {
		if (asset.isNew()) {
			Object[] args = new Object[] { asset.getId_isin() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_IDISIN, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_IDISIN, args, asset);

			args = new Object[] { asset.getId_isin(), asset.getSecurity_ticker() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_IDISIN_TICKER, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_IDISIN_TICKER, args,
				asset);
		}
		else {
			AssetModelImpl assetModelImpl = (AssetModelImpl)asset;

			if ((assetModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_IDISIN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { asset.getId_isin() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_IDISIN, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_IDISIN, args,
					asset);
			}

			if ((assetModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_IDISIN_TICKER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						asset.getId_isin(), asset.getSecurity_ticker()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_IDISIN_TICKER,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_IDISIN_TICKER,
					args, asset);
			}
		}
	}

	protected void clearUniqueFindersCache(Asset asset) {
		AssetModelImpl assetModelImpl = (AssetModelImpl)asset;

		Object[] args = new Object[] { asset.getId_isin() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IDISIN, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_IDISIN, args);

		if ((assetModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_IDISIN.getColumnBitmask()) != 0) {
			args = new Object[] { assetModelImpl.getOriginalId_isin() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IDISIN, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_IDISIN, args);
		}

		args = new Object[] { asset.getId_isin(), asset.getSecurity_ticker() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IDISIN_TICKER, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_IDISIN_TICKER, args);

		if ((assetModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_IDISIN_TICKER.getColumnBitmask()) != 0) {
			args = new Object[] {
					assetModelImpl.getOriginalId_isin(),
					assetModelImpl.getOriginalSecurity_ticker()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IDISIN_TICKER,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_IDISIN_TICKER,
				args);
		}
	}

	/**
	 * Creates a new asset with the primary key. Does not add the asset to the database.
	 *
	 * @param assetId the primary key for the new asset
	 * @return the new asset
	 */
	@Override
	public Asset create(long assetId) {
		Asset asset = new AssetImpl();

		asset.setNew(true);
		asset.setPrimaryKey(assetId);

		return asset;
	}

	/**
	 * Removes the asset with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param assetId the primary key of the asset
	 * @return the asset that was removed
	 * @throws com.fingence.slayer.NoSuchAssetException if a asset with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Asset remove(long assetId)
		throws NoSuchAssetException, SystemException {
		return remove((Serializable)assetId);
	}

	/**
	 * Removes the asset with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the asset
	 * @return the asset that was removed
	 * @throws com.fingence.slayer.NoSuchAssetException if a asset with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Asset remove(Serializable primaryKey)
		throws NoSuchAssetException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Asset asset = (Asset)session.get(AssetImpl.class, primaryKey);

			if (asset == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAssetException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(asset);
		}
		catch (NoSuchAssetException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Asset removeImpl(Asset asset) throws SystemException {
		asset = toUnwrappedModel(asset);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(asset)) {
				asset = (Asset)session.get(AssetImpl.class,
						asset.getPrimaryKeyObj());
			}

			if (asset != null) {
				session.delete(asset);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (asset != null) {
			clearCache(asset);
		}

		return asset;
	}

	@Override
	public Asset updateImpl(com.fingence.slayer.model.Asset asset)
		throws SystemException {
		asset = toUnwrappedModel(asset);

		boolean isNew = asset.isNew();

		Session session = null;

		try {
			session = openSession();

			if (asset.isNew()) {
				session.save(asset);

				asset.setNew(false);
			}
			else {
				session.merge(asset);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !AssetModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(AssetModelImpl.ENTITY_CACHE_ENABLED,
			AssetImpl.class, asset.getPrimaryKey(), asset);

		clearUniqueFindersCache(asset);
		cacheUniqueFindersCache(asset);

		return asset;
	}

	protected Asset toUnwrappedModel(Asset asset) {
		if (asset instanceof AssetImpl) {
			return asset;
		}

		AssetImpl assetImpl = new AssetImpl();

		assetImpl.setNew(asset.isNew());
		assetImpl.setPrimaryKey(asset.getPrimaryKey());

		assetImpl.setAssetId(asset.getAssetId());
		assetImpl.setSecurity_ticker(asset.getSecurity_ticker());
		assetImpl.setId_cusip(asset.getId_cusip());
		assetImpl.setId_isin(asset.getId_isin());
		assetImpl.setId_bb_global(asset.getId_bb_global());
		assetImpl.setId_bb_sec_num_src(asset.getId_bb_sec_num_src());
		assetImpl.setName(asset.getName());
		assetImpl.setChg_pct_mtd(asset.getChg_pct_mtd());
		assetImpl.setChg_pct_5d(asset.getChg_pct_5d());
		assetImpl.setChg_pct_1m(asset.getChg_pct_1m());
		assetImpl.setChg_pct_3m(asset.getChg_pct_3m());
		assetImpl.setChg_pct_6m(asset.getChg_pct_6m());
		assetImpl.setChg_pct_ytd(asset.getChg_pct_ytd());
		assetImpl.setChg_pct_high_52week(asset.getChg_pct_high_52week());
		assetImpl.setChg_pct_low_52week(asset.getChg_pct_low_52week());
		assetImpl.setChg_pct_1yr(asset.getChg_pct_1yr());
		assetImpl.setChg_trr_5yr(asset.getChg_trr_5yr());
		assetImpl.setCurrent_price(asset.getCurrent_price());
		assetImpl.setLast_price(asset.getLast_price());
		assetImpl.setBid_price(asset.getBid_price());
		assetImpl.setAsk_price(asset.getAsk_price());
		assetImpl.setSecurity_des(asset.getSecurity_des());
		assetImpl.setParent_comp_name(asset.getParent_comp_name());
		assetImpl.setSecurity_class(asset.getSecurity_class());
		assetImpl.setVolatility_30d(asset.getVolatility_30d());
		assetImpl.setVolatility_90d(asset.getVolatility_90d());
		assetImpl.setVolatility_180d(asset.getVolatility_180d());
		assetImpl.setVolatility_360d(asset.getVolatility_360d());
		assetImpl.setCurrency(asset.getCurrency());
		assetImpl.setCountry(asset.getCountry());
		assetImpl.setCountry_of_risk(asset.getCountry_of_risk());
		assetImpl.setCreateDate(asset.getCreateDate());
		assetImpl.setModifiedDate(asset.getModifiedDate());
		assetImpl.setCompanyId(asset.getCompanyId());
		assetImpl.setUserId(asset.getUserId());
		assetImpl.setUserName(asset.getUserName());

		return assetImpl;
	}

	/**
	 * Returns the asset with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the asset
	 * @return the asset
	 * @throws com.fingence.slayer.NoSuchAssetException if a asset with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Asset findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAssetException, SystemException {
		Asset asset = fetchByPrimaryKey(primaryKey);

		if (asset == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAssetException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return asset;
	}

	/**
	 * Returns the asset with the primary key or throws a {@link com.fingence.slayer.NoSuchAssetException} if it could not be found.
	 *
	 * @param assetId the primary key of the asset
	 * @return the asset
	 * @throws com.fingence.slayer.NoSuchAssetException if a asset with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Asset findByPrimaryKey(long assetId)
		throws NoSuchAssetException, SystemException {
		return findByPrimaryKey((Serializable)assetId);
	}

	/**
	 * Returns the asset with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the asset
	 * @return the asset, or <code>null</code> if a asset with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Asset fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Asset asset = (Asset)EntityCacheUtil.getResult(AssetModelImpl.ENTITY_CACHE_ENABLED,
				AssetImpl.class, primaryKey);

		if (asset == _nullAsset) {
			return null;
		}

		if (asset == null) {
			Session session = null;

			try {
				session = openSession();

				asset = (Asset)session.get(AssetImpl.class, primaryKey);

				if (asset != null) {
					cacheResult(asset);
				}
				else {
					EntityCacheUtil.putResult(AssetModelImpl.ENTITY_CACHE_ENABLED,
						AssetImpl.class, primaryKey, _nullAsset);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AssetModelImpl.ENTITY_CACHE_ENABLED,
					AssetImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return asset;
	}

	/**
	 * Returns the asset with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param assetId the primary key of the asset
	 * @return the asset, or <code>null</code> if a asset with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Asset fetchByPrimaryKey(long assetId) throws SystemException {
		return fetchByPrimaryKey((Serializable)assetId);
	}

	/**
	 * Returns all the assets.
	 *
	 * @return the assets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Asset> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<Asset> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

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
	@Override
	public List<Asset> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Asset> list = (List<Asset>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ASSET);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ASSET;

				if (pagination) {
					sql = sql.concat(AssetModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Asset>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Asset>(list);
				}
				else {
					list = (List<Asset>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the assets from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Asset asset : findAll()) {
			remove(asset);
		}
	}

	/**
	 * Returns the number of assets.
	 *
	 * @return the number of assets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ASSET);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the asset persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.fingence.slayer.model.Asset")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Asset>> listenersList = new ArrayList<ModelListener<Asset>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Asset>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(AssetImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ASSET = "SELECT asset FROM Asset asset";
	private static final String _SQL_SELECT_ASSET_WHERE = "SELECT asset FROM Asset asset WHERE ";
	private static final String _SQL_COUNT_ASSET = "SELECT COUNT(asset) FROM Asset asset";
	private static final String _SQL_COUNT_ASSET_WHERE = "SELECT COUNT(asset) FROM Asset asset WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "asset.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Asset exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Asset exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AssetPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"currency"
			});
	private static Asset _nullAsset = new AssetImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Asset> toCacheModel() {
				return _nullAssetCacheModel;
			}
		};

	private static CacheModel<Asset> _nullAssetCacheModel = new CacheModel<Asset>() {
			@Override
			public Asset toEntityModel() {
				return _nullAsset;
			}
		};
}