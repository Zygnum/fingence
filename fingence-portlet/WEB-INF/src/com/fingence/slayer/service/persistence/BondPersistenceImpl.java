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

import com.fingence.slayer.NoSuchBondException;
import com.fingence.slayer.model.Bond;
import com.fingence.slayer.model.impl.BondImpl;
import com.fingence.slayer.model.impl.BondModelImpl;

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
 * The persistence implementation for the bond service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ahmed Hasan
 * @see BondPersistence
 * @see BondUtil
 * @generated
 */
public class BondPersistenceImpl extends BasePersistenceImpl<Bond>
	implements BondPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link BondUtil} to access the bond persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = BondImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BondModelImpl.ENTITY_CACHE_ENABLED,
			BondModelImpl.FINDER_CACHE_ENABLED, BondImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BondModelImpl.ENTITY_CACHE_ENABLED,
			BondModelImpl.FINDER_CACHE_ENABLED, BondImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BondModelImpl.ENTITY_CACHE_ENABLED,
			BondModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public BondPersistenceImpl() {
		setModelClass(Bond.class);
	}

	/**
	 * Caches the bond in the entity cache if it is enabled.
	 *
	 * @param bond the bond
	 */
	@Override
	public void cacheResult(Bond bond) {
		EntityCacheUtil.putResult(BondModelImpl.ENTITY_CACHE_ENABLED,
			BondImpl.class, bond.getPrimaryKey(), bond);

		bond.resetOriginalValues();
	}

	/**
	 * Caches the bonds in the entity cache if it is enabled.
	 *
	 * @param bonds the bonds
	 */
	@Override
	public void cacheResult(List<Bond> bonds) {
		for (Bond bond : bonds) {
			if (EntityCacheUtil.getResult(BondModelImpl.ENTITY_CACHE_ENABLED,
						BondImpl.class, bond.getPrimaryKey()) == null) {
				cacheResult(bond);
			}
			else {
				bond.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all bonds.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(BondImpl.class.getName());
		}

		EntityCacheUtil.clearCache(BondImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the bond.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Bond bond) {
		EntityCacheUtil.removeResult(BondModelImpl.ENTITY_CACHE_ENABLED,
			BondImpl.class, bond.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Bond> bonds) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Bond bond : bonds) {
			EntityCacheUtil.removeResult(BondModelImpl.ENTITY_CACHE_ENABLED,
				BondImpl.class, bond.getPrimaryKey());
		}
	}

	/**
	 * Creates a new bond with the primary key. Does not add the bond to the database.
	 *
	 * @param assetId the primary key for the new bond
	 * @return the new bond
	 */
	@Override
	public Bond create(long assetId) {
		Bond bond = new BondImpl();

		bond.setNew(true);
		bond.setPrimaryKey(assetId);

		return bond;
	}

	/**
	 * Removes the bond with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param assetId the primary key of the bond
	 * @return the bond that was removed
	 * @throws com.fingence.slayer.NoSuchBondException if a bond with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Bond remove(long assetId)
		throws NoSuchBondException, SystemException {
		return remove((Serializable)assetId);
	}

	/**
	 * Removes the bond with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the bond
	 * @return the bond that was removed
	 * @throws com.fingence.slayer.NoSuchBondException if a bond with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Bond remove(Serializable primaryKey)
		throws NoSuchBondException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Bond bond = (Bond)session.get(BondImpl.class, primaryKey);

			if (bond == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBondException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(bond);
		}
		catch (NoSuchBondException nsee) {
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
	protected Bond removeImpl(Bond bond) throws SystemException {
		bond = toUnwrappedModel(bond);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(bond)) {
				bond = (Bond)session.get(BondImpl.class, bond.getPrimaryKeyObj());
			}

			if (bond != null) {
				session.delete(bond);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (bond != null) {
			clearCache(bond);
		}

		return bond;
	}

	@Override
	public Bond updateImpl(com.fingence.slayer.model.Bond bond)
		throws SystemException {
		bond = toUnwrappedModel(bond);

		boolean isNew = bond.isNew();

		Session session = null;

		try {
			session = openSession();

			if (bond.isNew()) {
				session.save(bond);

				bond.setNew(false);
			}
			else {
				session.merge(bond);
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

		EntityCacheUtil.putResult(BondModelImpl.ENTITY_CACHE_ENABLED,
			BondImpl.class, bond.getPrimaryKey(), bond);

		return bond;
	}

	protected Bond toUnwrappedModel(Bond bond) {
		if (bond instanceof BondImpl) {
			return bond;
		}

		BondImpl bondImpl = new BondImpl();

		bondImpl.setNew(bond.isNew());
		bondImpl.setPrimaryKey(bond.getPrimaryKey());

		bondImpl.setAssetId(bond.getAssetId());
		bondImpl.setIssuer_bulk(bond.getIssuer_bulk());
		bondImpl.setCpn(bond.getCpn());
		bondImpl.setCpn_typ(bond.getCpn_typ());
		bondImpl.setMty_typ(bond.getMty_typ());
		bondImpl.setMty_years_tdy(bond.getMty_years_tdy());
		bondImpl.setYld_ytm_ask(bond.getYld_ytm_ask());
		bondImpl.setYld_ytm_bid(bond.getYld_ytm_bid());
		bondImpl.setYld_cur_mid(bond.getYld_cur_mid());
		bondImpl.setIssue_dt(bond.getIssue_dt());
		bondImpl.setMaturity_dt(bond.getMaturity_dt());
		bondImpl.setCalc_typ(bond.getCalc_typ());
		bondImpl.setIs_bond_no_calctyp(bond.isIs_bond_no_calctyp());
		bondImpl.setCollat_typ(bond.getCollat_typ());
		bondImpl.setBb_composite(bond.getBb_composite());
		bondImpl.setRtg_sp(bond.getRtg_sp());
		bondImpl.setRtg_moody(bond.getRtg_moody());
		bondImpl.setRtg_fitch(bond.getRtg_fitch());
		bondImpl.setCpn_freq(bond.getCpn_freq());
		bondImpl.setFive_y_bid_cds_spread(bond.getFive_y_bid_cds_spread());
		bondImpl.setDur_mid(bond.getDur_mid());
		bondImpl.setPrice_to_cash_flow(bond.getPrice_to_cash_flow());
		bondImpl.setAmount_issued(bond.getAmount_issued());
		bondImpl.setAmount_outstanding(bond.getAmount_outstanding());

		return bondImpl;
	}

	/**
	 * Returns the bond with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the bond
	 * @return the bond
	 * @throws com.fingence.slayer.NoSuchBondException if a bond with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Bond findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBondException, SystemException {
		Bond bond = fetchByPrimaryKey(primaryKey);

		if (bond == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBondException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return bond;
	}

	/**
	 * Returns the bond with the primary key or throws a {@link com.fingence.slayer.NoSuchBondException} if it could not be found.
	 *
	 * @param assetId the primary key of the bond
	 * @return the bond
	 * @throws com.fingence.slayer.NoSuchBondException if a bond with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Bond findByPrimaryKey(long assetId)
		throws NoSuchBondException, SystemException {
		return findByPrimaryKey((Serializable)assetId);
	}

	/**
	 * Returns the bond with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the bond
	 * @return the bond, or <code>null</code> if a bond with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Bond fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Bond bond = (Bond)EntityCacheUtil.getResult(BondModelImpl.ENTITY_CACHE_ENABLED,
				BondImpl.class, primaryKey);

		if (bond == _nullBond) {
			return null;
		}

		if (bond == null) {
			Session session = null;

			try {
				session = openSession();

				bond = (Bond)session.get(BondImpl.class, primaryKey);

				if (bond != null) {
					cacheResult(bond);
				}
				else {
					EntityCacheUtil.putResult(BondModelImpl.ENTITY_CACHE_ENABLED,
						BondImpl.class, primaryKey, _nullBond);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(BondModelImpl.ENTITY_CACHE_ENABLED,
					BondImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return bond;
	}

	/**
	 * Returns the bond with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param assetId the primary key of the bond
	 * @return the bond, or <code>null</code> if a bond with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Bond fetchByPrimaryKey(long assetId) throws SystemException {
		return fetchByPrimaryKey((Serializable)assetId);
	}

	/**
	 * Returns all the bonds.
	 *
	 * @return the bonds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Bond> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bonds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.BondModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bonds
	 * @param end the upper bound of the range of bonds (not inclusive)
	 * @return the range of bonds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Bond> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the bonds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.BondModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bonds
	 * @param end the upper bound of the range of bonds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bonds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Bond> findAll(int start, int end,
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

		List<Bond> list = (List<Bond>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_BOND);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BOND;

				if (pagination) {
					sql = sql.concat(BondModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Bond>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Bond>(list);
				}
				else {
					list = (List<Bond>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the bonds from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Bond bond : findAll()) {
			remove(bond);
		}
	}

	/**
	 * Returns the number of bonds.
	 *
	 * @return the number of bonds
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

				Query q = session.createQuery(_SQL_COUNT_BOND);

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
	 * Initializes the bond persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.fingence.slayer.model.Bond")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Bond>> listenersList = new ArrayList<ModelListener<Bond>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Bond>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(BondImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_BOND = "SELECT bond FROM Bond bond";
	private static final String _SQL_COUNT_BOND = "SELECT COUNT(bond) FROM Bond bond";
	private static final String _ORDER_BY_ENTITY_ALIAS = "bond.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Bond exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(BondPersistenceImpl.class);
	private static Bond _nullBond = new BondImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Bond> toCacheModel() {
				return _nullBondCacheModel;
			}
		};

	private static CacheModel<Bond> _nullBondCacheModel = new CacheModel<Bond>() {
			@Override
			public Bond toEntityModel() {
				return _nullBond;
			}
		};
}