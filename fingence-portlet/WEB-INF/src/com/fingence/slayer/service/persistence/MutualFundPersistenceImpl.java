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

import com.fingence.slayer.NoSuchMutualFundException;
import com.fingence.slayer.model.MutualFund;
import com.fingence.slayer.model.impl.MutualFundImpl;
import com.fingence.slayer.model.impl.MutualFundModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the mutual fund service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ahmed Hasan
 * @see MutualFundPersistence
 * @see MutualFundUtil
 * @generated
 */
public class MutualFundPersistenceImpl extends BasePersistenceImpl<MutualFund>
	implements MutualFundPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MutualFundUtil} to access the mutual fund persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MutualFundImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MutualFundModelImpl.ENTITY_CACHE_ENABLED,
			MutualFundModelImpl.FINDER_CACHE_ENABLED, MutualFundImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MutualFundModelImpl.ENTITY_CACHE_ENABLED,
			MutualFundModelImpl.FINDER_CACHE_ENABLED, MutualFundImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MutualFundModelImpl.ENTITY_CACHE_ENABLED,
			MutualFundModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public MutualFundPersistenceImpl() {
		setModelClass(MutualFund.class);
	}

	/**
	 * Caches the mutual fund in the entity cache if it is enabled.
	 *
	 * @param mutualFund the mutual fund
	 */
	@Override
	public void cacheResult(MutualFund mutualFund) {
		EntityCacheUtil.putResult(MutualFundModelImpl.ENTITY_CACHE_ENABLED,
			MutualFundImpl.class, mutualFund.getPrimaryKey(), mutualFund);

		mutualFund.resetOriginalValues();
	}

	/**
	 * Caches the mutual funds in the entity cache if it is enabled.
	 *
	 * @param mutualFunds the mutual funds
	 */
	@Override
	public void cacheResult(List<MutualFund> mutualFunds) {
		for (MutualFund mutualFund : mutualFunds) {
			if (EntityCacheUtil.getResult(
						MutualFundModelImpl.ENTITY_CACHE_ENABLED,
						MutualFundImpl.class, mutualFund.getPrimaryKey()) == null) {
				cacheResult(mutualFund);
			}
			else {
				mutualFund.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all mutual funds.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(MutualFundImpl.class.getName());
		}

		EntityCacheUtil.clearCache(MutualFundImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the mutual fund.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MutualFund mutualFund) {
		EntityCacheUtil.removeResult(MutualFundModelImpl.ENTITY_CACHE_ENABLED,
			MutualFundImpl.class, mutualFund.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<MutualFund> mutualFunds) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MutualFund mutualFund : mutualFunds) {
			EntityCacheUtil.removeResult(MutualFundModelImpl.ENTITY_CACHE_ENABLED,
				MutualFundImpl.class, mutualFund.getPrimaryKey());
		}
	}

	/**
	 * Creates a new mutual fund with the primary key. Does not add the mutual fund to the database.
	 *
	 * @param assetId the primary key for the new mutual fund
	 * @return the new mutual fund
	 */
	@Override
	public MutualFund create(long assetId) {
		MutualFund mutualFund = new MutualFundImpl();

		mutualFund.setNew(true);
		mutualFund.setPrimaryKey(assetId);

		return mutualFund;
	}

	/**
	 * Removes the mutual fund with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param assetId the primary key of the mutual fund
	 * @return the mutual fund that was removed
	 * @throws com.fingence.slayer.NoSuchMutualFundException if a mutual fund with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MutualFund remove(long assetId)
		throws NoSuchMutualFundException, SystemException {
		return remove((Serializable)assetId);
	}

	/**
	 * Removes the mutual fund with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mutual fund
	 * @return the mutual fund that was removed
	 * @throws com.fingence.slayer.NoSuchMutualFundException if a mutual fund with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MutualFund remove(Serializable primaryKey)
		throws NoSuchMutualFundException, SystemException {
		Session session = null;

		try {
			session = openSession();

			MutualFund mutualFund = (MutualFund)session.get(MutualFundImpl.class,
					primaryKey);

			if (mutualFund == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMutualFundException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(mutualFund);
		}
		catch (NoSuchMutualFundException nsee) {
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
	protected MutualFund removeImpl(MutualFund mutualFund)
		throws SystemException {
		mutualFund = toUnwrappedModel(mutualFund);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(mutualFund)) {
				mutualFund = (MutualFund)session.get(MutualFundImpl.class,
						mutualFund.getPrimaryKeyObj());
			}

			if (mutualFund != null) {
				session.delete(mutualFund);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (mutualFund != null) {
			clearCache(mutualFund);
		}

		return mutualFund;
	}

	@Override
	public MutualFund updateImpl(
		com.fingence.slayer.model.MutualFund mutualFund)
		throws SystemException {
		mutualFund = toUnwrappedModel(mutualFund);

		boolean isNew = mutualFund.isNew();

		Session session = null;

		try {
			session = openSession();

			if (mutualFund.isNew()) {
				session.save(mutualFund);

				mutualFund.setNew(false);
			}
			else {
				session.merge(mutualFund);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(MutualFundModelImpl.ENTITY_CACHE_ENABLED,
			MutualFundImpl.class, mutualFund.getPrimaryKey(), mutualFund);

		return mutualFund;
	}

	protected MutualFund toUnwrappedModel(MutualFund mutualFund) {
		if (mutualFund instanceof MutualFundImpl) {
			return mutualFund;
		}

		MutualFundImpl mutualFundImpl = new MutualFundImpl();

		mutualFundImpl.setNew(mutualFund.isNew());
		mutualFundImpl.setPrimaryKey(mutualFund.getPrimaryKey());

		mutualFundImpl.setAssetId(mutualFund.getAssetId());
		mutualFundImpl.setFund_total_assets(mutualFund.getFund_total_assets());
		mutualFundImpl.setFund_asset_class_focus(mutualFund.getFund_asset_class_focus());
		mutualFundImpl.setFund_geo_focus(mutualFund.getFund_geo_focus());

		return mutualFundImpl;
	}

	/**
	 * Returns the mutual fund with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the mutual fund
	 * @return the mutual fund
	 * @throws com.fingence.slayer.NoSuchMutualFundException if a mutual fund with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MutualFund findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMutualFundException, SystemException {
		MutualFund mutualFund = fetchByPrimaryKey(primaryKey);

		if (mutualFund == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMutualFundException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return mutualFund;
	}

	/**
	 * Returns the mutual fund with the primary key or throws a {@link com.fingence.slayer.NoSuchMutualFundException} if it could not be found.
	 *
	 * @param assetId the primary key of the mutual fund
	 * @return the mutual fund
	 * @throws com.fingence.slayer.NoSuchMutualFundException if a mutual fund with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MutualFund findByPrimaryKey(long assetId)
		throws NoSuchMutualFundException, SystemException {
		return findByPrimaryKey((Serializable)assetId);
	}

	/**
	 * Returns the mutual fund with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mutual fund
	 * @return the mutual fund, or <code>null</code> if a mutual fund with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MutualFund fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		MutualFund mutualFund = (MutualFund)EntityCacheUtil.getResult(MutualFundModelImpl.ENTITY_CACHE_ENABLED,
				MutualFundImpl.class, primaryKey);

		if (mutualFund == _nullMutualFund) {
			return null;
		}

		if (mutualFund == null) {
			Session session = null;

			try {
				session = openSession();

				mutualFund = (MutualFund)session.get(MutualFundImpl.class,
						primaryKey);

				if (mutualFund != null) {
					cacheResult(mutualFund);
				}
				else {
					EntityCacheUtil.putResult(MutualFundModelImpl.ENTITY_CACHE_ENABLED,
						MutualFundImpl.class, primaryKey, _nullMutualFund);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(MutualFundModelImpl.ENTITY_CACHE_ENABLED,
					MutualFundImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return mutualFund;
	}

	/**
	 * Returns the mutual fund with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param assetId the primary key of the mutual fund
	 * @return the mutual fund, or <code>null</code> if a mutual fund with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MutualFund fetchByPrimaryKey(long assetId) throws SystemException {
		return fetchByPrimaryKey((Serializable)assetId);
	}

	/**
	 * Returns all the mutual funds.
	 *
	 * @return the mutual funds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MutualFund> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mutual funds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.MutualFundModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mutual funds
	 * @param end the upper bound of the range of mutual funds (not inclusive)
	 * @return the range of mutual funds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MutualFund> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the mutual funds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.MutualFundModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mutual funds
	 * @param end the upper bound of the range of mutual funds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mutual funds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MutualFund> findAll(int start, int end,
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

		List<MutualFund> list = (List<MutualFund>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MUTUALFUND);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MUTUALFUND;

				if (pagination) {
					sql = sql.concat(MutualFundModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<MutualFund>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MutualFund>(list);
				}
				else {
					list = (List<MutualFund>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the mutual funds from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (MutualFund mutualFund : findAll()) {
			remove(mutualFund);
		}
	}

	/**
	 * Returns the number of mutual funds.
	 *
	 * @return the number of mutual funds
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

				Query q = session.createQuery(_SQL_COUNT_MUTUALFUND);

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

	/**
	 * Initializes the mutual fund persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.fingence.slayer.model.MutualFund")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<MutualFund>> listenersList = new ArrayList<ModelListener<MutualFund>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<MutualFund>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(MutualFundImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MUTUALFUND = "SELECT mutualFund FROM MutualFund mutualFund";
	private static final String _SQL_COUNT_MUTUALFUND = "SELECT COUNT(mutualFund) FROM MutualFund mutualFund";
	private static final String _ORDER_BY_ENTITY_ALIAS = "mutualFund.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MutualFund exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(MutualFundPersistenceImpl.class);
	private static MutualFund _nullMutualFund = new MutualFundImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<MutualFund> toCacheModel() {
				return _nullMutualFundCacheModel;
			}
		};

	private static CacheModel<MutualFund> _nullMutualFundCacheModel = new CacheModel<MutualFund>() {
			@Override
			public MutualFund toEntityModel() {
				return _nullMutualFund;
			}
		};
}