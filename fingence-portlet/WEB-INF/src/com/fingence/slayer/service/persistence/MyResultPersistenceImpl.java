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

import com.fingence.slayer.NoSuchMyResultException;
import com.fingence.slayer.model.MyResult;
import com.fingence.slayer.model.impl.MyResultImpl;
import com.fingence.slayer.model.impl.MyResultModelImpl;

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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
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
 * The persistence implementation for the my result service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ahmed Hasan
 * @see MyResultPersistence
 * @see MyResultUtil
 * @generated
 */
public class MyResultPersistenceImpl extends BasePersistenceImpl<MyResult>
	implements MyResultPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MyResultUtil} to access the my result persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MyResultImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MyResultModelImpl.ENTITY_CACHE_ENABLED,
			MyResultModelImpl.FINDER_CACHE_ENABLED, MyResultImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MyResultModelImpl.ENTITY_CACHE_ENABLED,
			MyResultModelImpl.FINDER_CACHE_ENABLED, MyResultImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MyResultModelImpl.ENTITY_CACHE_ENABLED,
			MyResultModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTFOLIOID =
		new FinderPath(MyResultModelImpl.ENTITY_CACHE_ENABLED,
			MyResultModelImpl.FINDER_CACHE_ENABLED, MyResultImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPortfolioId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTFOLIOID =
		new FinderPath(MyResultModelImpl.ENTITY_CACHE_ENABLED,
			MyResultModelImpl.FINDER_CACHE_ENABLED, MyResultImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPortfolioId",
			new String[] { Long.class.getName() },
			MyResultModelImpl.PORTFOLIOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PORTFOLIOID = new FinderPath(MyResultModelImpl.ENTITY_CACHE_ENABLED,
			MyResultModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPortfolioId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the my results where portfolioId = &#63;.
	 *
	 * @param portfolioId the portfolio ID
	 * @return the matching my results
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MyResult> findByPortfolioId(long portfolioId)
		throws SystemException {
		return findByPortfolioId(portfolioId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the my results where portfolioId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.MyResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param portfolioId the portfolio ID
	 * @param start the lower bound of the range of my results
	 * @param end the upper bound of the range of my results (not inclusive)
	 * @return the range of matching my results
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MyResult> findByPortfolioId(long portfolioId, int start, int end)
		throws SystemException {
		return findByPortfolioId(portfolioId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the my results where portfolioId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.MyResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param portfolioId the portfolio ID
	 * @param start the lower bound of the range of my results
	 * @param end the upper bound of the range of my results (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching my results
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MyResult> findByPortfolioId(long portfolioId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTFOLIOID;
			finderArgs = new Object[] { portfolioId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTFOLIOID;
			finderArgs = new Object[] { portfolioId, start, end, orderByComparator };
		}

		List<MyResult> list = (List<MyResult>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MyResult myResult : list) {
				if ((portfolioId != myResult.getPortfolioId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_MYRESULT_WHERE);

			query.append(_FINDER_COLUMN_PORTFOLIOID_PORTFOLIOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MyResultModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(portfolioId);

				if (!pagination) {
					list = (List<MyResult>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MyResult>(list);
				}
				else {
					list = (List<MyResult>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first my result in the ordered set where portfolioId = &#63;.
	 *
	 * @param portfolioId the portfolio ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching my result
	 * @throws com.fingence.slayer.NoSuchMyResultException if a matching my result could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MyResult findByPortfolioId_First(long portfolioId,
		OrderByComparator orderByComparator)
		throws NoSuchMyResultException, SystemException {
		MyResult myResult = fetchByPortfolioId_First(portfolioId,
				orderByComparator);

		if (myResult != null) {
			return myResult;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("portfolioId=");
		msg.append(portfolioId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMyResultException(msg.toString());
	}

	/**
	 * Returns the first my result in the ordered set where portfolioId = &#63;.
	 *
	 * @param portfolioId the portfolio ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching my result, or <code>null</code> if a matching my result could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MyResult fetchByPortfolioId_First(long portfolioId,
		OrderByComparator orderByComparator) throws SystemException {
		List<MyResult> list = findByPortfolioId(portfolioId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last my result in the ordered set where portfolioId = &#63;.
	 *
	 * @param portfolioId the portfolio ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching my result
	 * @throws com.fingence.slayer.NoSuchMyResultException if a matching my result could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MyResult findByPortfolioId_Last(long portfolioId,
		OrderByComparator orderByComparator)
		throws NoSuchMyResultException, SystemException {
		MyResult myResult = fetchByPortfolioId_Last(portfolioId,
				orderByComparator);

		if (myResult != null) {
			return myResult;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("portfolioId=");
		msg.append(portfolioId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMyResultException(msg.toString());
	}

	/**
	 * Returns the last my result in the ordered set where portfolioId = &#63;.
	 *
	 * @param portfolioId the portfolio ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching my result, or <code>null</code> if a matching my result could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MyResult fetchByPortfolioId_Last(long portfolioId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByPortfolioId(portfolioId);

		if (count == 0) {
			return null;
		}

		List<MyResult> list = findByPortfolioId(portfolioId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the my results before and after the current my result in the ordered set where portfolioId = &#63;.
	 *
	 * @param itemId the primary key of the current my result
	 * @param portfolioId the portfolio ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next my result
	 * @throws com.fingence.slayer.NoSuchMyResultException if a my result with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MyResult[] findByPortfolioId_PrevAndNext(long itemId,
		long portfolioId, OrderByComparator orderByComparator)
		throws NoSuchMyResultException, SystemException {
		MyResult myResult = findByPrimaryKey(itemId);

		Session session = null;

		try {
			session = openSession();

			MyResult[] array = new MyResultImpl[3];

			array[0] = getByPortfolioId_PrevAndNext(session, myResult,
					portfolioId, orderByComparator, true);

			array[1] = myResult;

			array[2] = getByPortfolioId_PrevAndNext(session, myResult,
					portfolioId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MyResult getByPortfolioId_PrevAndNext(Session session,
		MyResult myResult, long portfolioId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MYRESULT_WHERE);

		query.append(_FINDER_COLUMN_PORTFOLIOID_PORTFOLIOID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(MyResultModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(portfolioId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(myResult);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MyResult> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the my results where portfolioId = &#63; from the database.
	 *
	 * @param portfolioId the portfolio ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPortfolioId(long portfolioId) throws SystemException {
		for (MyResult myResult : findByPortfolioId(portfolioId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(myResult);
		}
	}

	/**
	 * Returns the number of my results where portfolioId = &#63;.
	 *
	 * @param portfolioId the portfolio ID
	 * @return the number of matching my results
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPortfolioId(long portfolioId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PORTFOLIOID;

		Object[] finderArgs = new Object[] { portfolioId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MYRESULT_WHERE);

			query.append(_FINDER_COLUMN_PORTFOLIOID_PORTFOLIOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(portfolioId);

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

	private static final String _FINDER_COLUMN_PORTFOLIOID_PORTFOLIOID_2 = "myResult.portfolioId = ?";

	public MyResultPersistenceImpl() {
		setModelClass(MyResult.class);
	}

	/**
	 * Caches the my result in the entity cache if it is enabled.
	 *
	 * @param myResult the my result
	 */
	@Override
	public void cacheResult(MyResult myResult) {
		EntityCacheUtil.putResult(MyResultModelImpl.ENTITY_CACHE_ENABLED,
			MyResultImpl.class, myResult.getPrimaryKey(), myResult);

		myResult.resetOriginalValues();
	}

	/**
	 * Caches the my results in the entity cache if it is enabled.
	 *
	 * @param myResults the my results
	 */
	@Override
	public void cacheResult(List<MyResult> myResults) {
		for (MyResult myResult : myResults) {
			if (EntityCacheUtil.getResult(
						MyResultModelImpl.ENTITY_CACHE_ENABLED,
						MyResultImpl.class, myResult.getPrimaryKey()) == null) {
				cacheResult(myResult);
			}
			else {
				myResult.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all my results.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(MyResultImpl.class.getName());
		}

		EntityCacheUtil.clearCache(MyResultImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the my result.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MyResult myResult) {
		EntityCacheUtil.removeResult(MyResultModelImpl.ENTITY_CACHE_ENABLED,
			MyResultImpl.class, myResult.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<MyResult> myResults) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MyResult myResult : myResults) {
			EntityCacheUtil.removeResult(MyResultModelImpl.ENTITY_CACHE_ENABLED,
				MyResultImpl.class, myResult.getPrimaryKey());
		}
	}

	/**
	 * Creates a new my result with the primary key. Does not add the my result to the database.
	 *
	 * @param itemId the primary key for the new my result
	 * @return the new my result
	 */
	@Override
	public MyResult create(long itemId) {
		MyResult myResult = new MyResultImpl();

		myResult.setNew(true);
		myResult.setPrimaryKey(itemId);

		return myResult;
	}

	/**
	 * Removes the my result with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param itemId the primary key of the my result
	 * @return the my result that was removed
	 * @throws com.fingence.slayer.NoSuchMyResultException if a my result with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MyResult remove(long itemId)
		throws NoSuchMyResultException, SystemException {
		return remove((Serializable)itemId);
	}

	/**
	 * Removes the my result with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the my result
	 * @return the my result that was removed
	 * @throws com.fingence.slayer.NoSuchMyResultException if a my result with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MyResult remove(Serializable primaryKey)
		throws NoSuchMyResultException, SystemException {
		Session session = null;

		try {
			session = openSession();

			MyResult myResult = (MyResult)session.get(MyResultImpl.class,
					primaryKey);

			if (myResult == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMyResultException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(myResult);
		}
		catch (NoSuchMyResultException nsee) {
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
	protected MyResult removeImpl(MyResult myResult) throws SystemException {
		myResult = toUnwrappedModel(myResult);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(myResult)) {
				myResult = (MyResult)session.get(MyResultImpl.class,
						myResult.getPrimaryKeyObj());
			}

			if (myResult != null) {
				session.delete(myResult);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (myResult != null) {
			clearCache(myResult);
		}

		return myResult;
	}

	@Override
	public MyResult updateImpl(com.fingence.slayer.model.MyResult myResult)
		throws SystemException {
		myResult = toUnwrappedModel(myResult);

		boolean isNew = myResult.isNew();

		MyResultModelImpl myResultModelImpl = (MyResultModelImpl)myResult;

		Session session = null;

		try {
			session = openSession();

			if (myResult.isNew()) {
				session.save(myResult);

				myResult.setNew(false);
			}
			else {
				session.merge(myResult);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !MyResultModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((myResultModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTFOLIOID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						myResultModelImpl.getOriginalPortfolioId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTFOLIOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTFOLIOID,
					args);

				args = new Object[] { myResultModelImpl.getPortfolioId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTFOLIOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTFOLIOID,
					args);
			}
		}

		EntityCacheUtil.putResult(MyResultModelImpl.ENTITY_CACHE_ENABLED,
			MyResultImpl.class, myResult.getPrimaryKey(), myResult);

		return myResult;
	}

	protected MyResult toUnwrappedModel(MyResult myResult) {
		if (myResult instanceof MyResultImpl) {
			return myResult;
		}

		MyResultImpl myResultImpl = new MyResultImpl();

		myResultImpl.setNew(myResult.isNew());
		myResultImpl.setPrimaryKey(myResult.getPrimaryKey());

		myResultImpl.setItemId(myResult.getItemId());
		myResultImpl.setPortfolioId(myResult.getPortfolioId());
		myResultImpl.setInstitution(myResult.getInstitution());
		myResultImpl.setAssetId(myResult.getAssetId());
		myResultImpl.setSecurity_ticker(myResult.getSecurity_ticker());
		myResultImpl.setId_isin(myResult.getId_isin());
		myResultImpl.setName(myResult.getName());
		myResultImpl.setIndustry_sector(myResult.getIndustry_sector());
		myResultImpl.setPurchaseQty(myResult.getPurchaseQty());
		myResultImpl.setPurchaseDate(myResult.getPurchaseDate());
		myResultImpl.setCurrent_price(myResult.getCurrent_price());
		myResultImpl.setPurchasedFx(myResult.getPurchasedFx());
		myResultImpl.setCurrent_fx(myResult.getCurrent_fx());
		myResultImpl.setBaseCurrency(myResult.getBaseCurrency());
		myResultImpl.setSecurity_des(myResult.getSecurity_des());
		myResultImpl.setSecurity_class_int(myResult.getSecurity_class_int());
		myResultImpl.setSecurity_class(myResult.getSecurity_class());
		myResultImpl.setSecurity_typ(myResult.getSecurity_typ());
		myResultImpl.setSecurity_typ2(myResult.getSecurity_typ2());
		myResultImpl.setAsset_class(myResult.getAsset_class());
		myResultImpl.setAsset_sub_class(myResult.getAsset_sub_class());
		myResultImpl.setParent_comp_name(myResult.getParent_comp_name());
		myResultImpl.setCountryId(myResult.getCountryId());
		myResultImpl.setCountryName(myResult.getCountryName());
		myResultImpl.setCountryOfRisk(myResult.getCountryOfRisk());
		myResultImpl.setCountryOfRiskName(myResult.getCountryOfRiskName());
		myResultImpl.setCurrency_(myResult.getCurrency_());
		myResultImpl.setCurrencyDesc(myResult.getCurrencyDesc());
		myResultImpl.setPurchasedMarketValue(myResult.getPurchasedMarketValue());
		myResultImpl.setCurrentMarketValue(myResult.getCurrentMarketValue());
		myResultImpl.setGain_loss(myResult.getGain_loss());
		myResultImpl.setGain_loss_percent(myResult.getGain_loss_percent());
		myResultImpl.setFx_gain_loss(myResult.getFx_gain_loss());
		myResultImpl.setIncome(myResult.getIncome());
		myResultImpl.setCurrencySymbol(myResult.getCurrencySymbol());

		return myResultImpl;
	}

	/**
	 * Returns the my result with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the my result
	 * @return the my result
	 * @throws com.fingence.slayer.NoSuchMyResultException if a my result with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MyResult findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMyResultException, SystemException {
		MyResult myResult = fetchByPrimaryKey(primaryKey);

		if (myResult == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMyResultException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return myResult;
	}

	/**
	 * Returns the my result with the primary key or throws a {@link com.fingence.slayer.NoSuchMyResultException} if it could not be found.
	 *
	 * @param itemId the primary key of the my result
	 * @return the my result
	 * @throws com.fingence.slayer.NoSuchMyResultException if a my result with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MyResult findByPrimaryKey(long itemId)
		throws NoSuchMyResultException, SystemException {
		return findByPrimaryKey((Serializable)itemId);
	}

	/**
	 * Returns the my result with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the my result
	 * @return the my result, or <code>null</code> if a my result with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MyResult fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		MyResult myResult = (MyResult)EntityCacheUtil.getResult(MyResultModelImpl.ENTITY_CACHE_ENABLED,
				MyResultImpl.class, primaryKey);

		if (myResult == _nullMyResult) {
			return null;
		}

		if (myResult == null) {
			Session session = null;

			try {
				session = openSession();

				myResult = (MyResult)session.get(MyResultImpl.class, primaryKey);

				if (myResult != null) {
					cacheResult(myResult);
				}
				else {
					EntityCacheUtil.putResult(MyResultModelImpl.ENTITY_CACHE_ENABLED,
						MyResultImpl.class, primaryKey, _nullMyResult);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(MyResultModelImpl.ENTITY_CACHE_ENABLED,
					MyResultImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return myResult;
	}

	/**
	 * Returns the my result with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param itemId the primary key of the my result
	 * @return the my result, or <code>null</code> if a my result with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MyResult fetchByPrimaryKey(long itemId) throws SystemException {
		return fetchByPrimaryKey((Serializable)itemId);
	}

	/**
	 * Returns all the my results.
	 *
	 * @return the my results
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MyResult> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the my results.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.MyResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of my results
	 * @param end the upper bound of the range of my results (not inclusive)
	 * @return the range of my results
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MyResult> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the my results.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.MyResultModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of my results
	 * @param end the upper bound of the range of my results (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of my results
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MyResult> findAll(int start, int end,
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

		List<MyResult> list = (List<MyResult>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MYRESULT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MYRESULT;

				if (pagination) {
					sql = sql.concat(MyResultModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<MyResult>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MyResult>(list);
				}
				else {
					list = (List<MyResult>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the my results from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (MyResult myResult : findAll()) {
			remove(myResult);
		}
	}

	/**
	 * Returns the number of my results.
	 *
	 * @return the number of my results
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

				Query q = session.createQuery(_SQL_COUNT_MYRESULT);

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
	 * Initializes the my result persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.fingence.slayer.model.MyResult")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<MyResult>> listenersList = new ArrayList<ModelListener<MyResult>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<MyResult>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(MyResultImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MYRESULT = "SELECT myResult FROM MyResult myResult";
	private static final String _SQL_SELECT_MYRESULT_WHERE = "SELECT myResult FROM MyResult myResult WHERE ";
	private static final String _SQL_COUNT_MYRESULT = "SELECT COUNT(myResult) FROM MyResult myResult";
	private static final String _SQL_COUNT_MYRESULT_WHERE = "SELECT COUNT(myResult) FROM MyResult myResult WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "myResult.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MyResult exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No MyResult exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(MyResultPersistenceImpl.class);
	private static MyResult _nullMyResult = new MyResultImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<MyResult> toCacheModel() {
				return _nullMyResultCacheModel;
			}
		};

	private static CacheModel<MyResult> _nullMyResultCacheModel = new CacheModel<MyResult>() {
			@Override
			public MyResult toEntityModel() {
				return _nullMyResult;
			}
		};
}