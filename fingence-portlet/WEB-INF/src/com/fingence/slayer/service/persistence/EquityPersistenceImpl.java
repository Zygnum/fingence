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

import com.fingence.slayer.NoSuchEquityException;
import com.fingence.slayer.model.Equity;
import com.fingence.slayer.model.impl.EquityImpl;
import com.fingence.slayer.model.impl.EquityModelImpl;

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
 * The persistence implementation for the equity service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ahmed Hasan
 * @see EquityPersistence
 * @see EquityUtil
 * @generated
 */
public class EquityPersistenceImpl extends BasePersistenceImpl<Equity>
	implements EquityPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EquityUtil} to access the equity persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EquityImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EquityModelImpl.ENTITY_CACHE_ENABLED,
			EquityModelImpl.FINDER_CACHE_ENABLED, EquityImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EquityModelImpl.ENTITY_CACHE_ENABLED,
			EquityModelImpl.FINDER_CACHE_ENABLED, EquityImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EquityModelImpl.ENTITY_CACHE_ENABLED,
			EquityModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public EquityPersistenceImpl() {
		setModelClass(Equity.class);
	}

	/**
	 * Caches the equity in the entity cache if it is enabled.
	 *
	 * @param equity the equity
	 */
	@Override
	public void cacheResult(Equity equity) {
		EntityCacheUtil.putResult(EquityModelImpl.ENTITY_CACHE_ENABLED,
			EquityImpl.class, equity.getPrimaryKey(), equity);

		equity.resetOriginalValues();
	}

	/**
	 * Caches the equities in the entity cache if it is enabled.
	 *
	 * @param equities the equities
	 */
	@Override
	public void cacheResult(List<Equity> equities) {
		for (Equity equity : equities) {
			if (EntityCacheUtil.getResult(
						EquityModelImpl.ENTITY_CACHE_ENABLED, EquityImpl.class,
						equity.getPrimaryKey()) == null) {
				cacheResult(equity);
			}
			else {
				equity.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all equities.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EquityImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EquityImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the equity.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Equity equity) {
		EntityCacheUtil.removeResult(EquityModelImpl.ENTITY_CACHE_ENABLED,
			EquityImpl.class, equity.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Equity> equities) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Equity equity : equities) {
			EntityCacheUtil.removeResult(EquityModelImpl.ENTITY_CACHE_ENABLED,
				EquityImpl.class, equity.getPrimaryKey());
		}
	}

	/**
	 * Creates a new equity with the primary key. Does not add the equity to the database.
	 *
	 * @param assetId the primary key for the new equity
	 * @return the new equity
	 */
	@Override
	public Equity create(long assetId) {
		Equity equity = new EquityImpl();

		equity.setNew(true);
		equity.setPrimaryKey(assetId);

		return equity;
	}

	/**
	 * Removes the equity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param assetId the primary key of the equity
	 * @return the equity that was removed
	 * @throws com.fingence.slayer.NoSuchEquityException if a equity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Equity remove(long assetId)
		throws NoSuchEquityException, SystemException {
		return remove((Serializable)assetId);
	}

	/**
	 * Removes the equity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the equity
	 * @return the equity that was removed
	 * @throws com.fingence.slayer.NoSuchEquityException if a equity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Equity remove(Serializable primaryKey)
		throws NoSuchEquityException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Equity equity = (Equity)session.get(EquityImpl.class, primaryKey);

			if (equity == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEquityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(equity);
		}
		catch (NoSuchEquityException nsee) {
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
	protected Equity removeImpl(Equity equity) throws SystemException {
		equity = toUnwrappedModel(equity);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(equity)) {
				equity = (Equity)session.get(EquityImpl.class,
						equity.getPrimaryKeyObj());
			}

			if (equity != null) {
				session.delete(equity);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (equity != null) {
			clearCache(equity);
		}

		return equity;
	}

	@Override
	public Equity updateImpl(com.fingence.slayer.model.Equity equity)
		throws SystemException {
		equity = toUnwrappedModel(equity);

		boolean isNew = equity.isNew();

		Session session = null;

		try {
			session = openSession();

			if (equity.isNew()) {
				session.save(equity);

				equity.setNew(false);
			}
			else {
				session.merge(equity);
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

		EntityCacheUtil.putResult(EquityModelImpl.ENTITY_CACHE_ENABLED,
			EquityImpl.class, equity.getPrimaryKey(), equity);

		return equity;
	}

	protected Equity toUnwrappedModel(Equity equity) {
		if (equity instanceof EquityImpl) {
			return equity;
		}

		EquityImpl equityImpl = new EquityImpl();

		equityImpl.setNew(equity.isNew());
		equityImpl.setPrimaryKey(equity.getPrimaryKey());

		equityImpl.setAssetId(equity.getAssetId());
		equityImpl.setEqy_alpha(equity.getEqy_alpha());
		equityImpl.setDividend_yield(equity.getDividend_yield());
		equityImpl.setEqy_dvd_yld_12m(equity.getEqy_dvd_yld_12m());
		equityImpl.setEqy_dvd_yld_es(equity.getEqy_dvd_yld_es());
		equityImpl.setDvd_payout_ratio(equity.getDvd_payout_ratio());
		equityImpl.setPe_ratio(equity.getPe_ratio());
		equityImpl.setTot_debt_to_com_eqy(equity.getTot_debt_to_com_eqy());
		equityImpl.setEbitda_to_revenue(equity.getEbitda_to_revenue());
		equityImpl.setTrail_12m_prof_margin(equity.getTrail_12m_prof_margin());
		equityImpl.setBest_current_ev_best_opp(equity.getBest_current_ev_best_opp());
		equityImpl.setEqy_beta(equity.getEqy_beta());
		equityImpl.setReturn_sharpe_ratio(equity.getReturn_sharpe_ratio());
		equityImpl.setEqy_sharpe_ratio_1yr(equity.getEqy_sharpe_ratio_1yr());
		equityImpl.setEqy_sharpe_ratio_3yr(equity.getEqy_sharpe_ratio_3yr());
		equityImpl.setEqy_sharpe_ratio_5yr(equity.getEqy_sharpe_ratio_5yr());

		return equityImpl;
	}

	/**
	 * Returns the equity with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the equity
	 * @return the equity
	 * @throws com.fingence.slayer.NoSuchEquityException if a equity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Equity findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEquityException, SystemException {
		Equity equity = fetchByPrimaryKey(primaryKey);

		if (equity == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEquityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return equity;
	}

	/**
	 * Returns the equity with the primary key or throws a {@link com.fingence.slayer.NoSuchEquityException} if it could not be found.
	 *
	 * @param assetId the primary key of the equity
	 * @return the equity
	 * @throws com.fingence.slayer.NoSuchEquityException if a equity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Equity findByPrimaryKey(long assetId)
		throws NoSuchEquityException, SystemException {
		return findByPrimaryKey((Serializable)assetId);
	}

	/**
	 * Returns the equity with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the equity
	 * @return the equity, or <code>null</code> if a equity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Equity fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Equity equity = (Equity)EntityCacheUtil.getResult(EquityModelImpl.ENTITY_CACHE_ENABLED,
				EquityImpl.class, primaryKey);

		if (equity == _nullEquity) {
			return null;
		}

		if (equity == null) {
			Session session = null;

			try {
				session = openSession();

				equity = (Equity)session.get(EquityImpl.class, primaryKey);

				if (equity != null) {
					cacheResult(equity);
				}
				else {
					EntityCacheUtil.putResult(EquityModelImpl.ENTITY_CACHE_ENABLED,
						EquityImpl.class, primaryKey, _nullEquity);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(EquityModelImpl.ENTITY_CACHE_ENABLED,
					EquityImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return equity;
	}

	/**
	 * Returns the equity with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param assetId the primary key of the equity
	 * @return the equity, or <code>null</code> if a equity with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Equity fetchByPrimaryKey(long assetId) throws SystemException {
		return fetchByPrimaryKey((Serializable)assetId);
	}

	/**
	 * Returns all the equities.
	 *
	 * @return the equities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Equity> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the equities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.EquityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of equities
	 * @param end the upper bound of the range of equities (not inclusive)
	 * @return the range of equities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Equity> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the equities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.EquityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of equities
	 * @param end the upper bound of the range of equities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of equities
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Equity> findAll(int start, int end,
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

		List<Equity> list = (List<Equity>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EQUITY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EQUITY;

				if (pagination) {
					sql = sql.concat(EquityModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Equity>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Equity>(list);
				}
				else {
					list = (List<Equity>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the equities from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Equity equity : findAll()) {
			remove(equity);
		}
	}

	/**
	 * Returns the number of equities.
	 *
	 * @return the number of equities
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

				Query q = session.createQuery(_SQL_COUNT_EQUITY);

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
	 * Initializes the equity persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.fingence.slayer.model.Equity")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Equity>> listenersList = new ArrayList<ModelListener<Equity>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Equity>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EquityImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_EQUITY = "SELECT equity FROM Equity equity";
	private static final String _SQL_COUNT_EQUITY = "SELECT COUNT(equity) FROM Equity equity";
	private static final String _ORDER_BY_ENTITY_ALIAS = "equity.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Equity exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EquityPersistenceImpl.class);
	private static Equity _nullEquity = new EquityImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Equity> toCacheModel() {
				return _nullEquityCacheModel;
			}
		};

	private static CacheModel<Equity> _nullEquityCacheModel = new CacheModel<Equity>() {
			@Override
			public Equity toEntityModel() {
				return _nullEquity;
			}
		};
}