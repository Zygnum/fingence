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

import com.fingence.slayer.NoSuchDividendException;
import com.fingence.slayer.model.Dividend;
import com.fingence.slayer.model.impl.DividendImpl;
import com.fingence.slayer.model.impl.DividendModelImpl;

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
import com.liferay.portal.kernel.util.CalendarUtil;
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
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dividend service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ahmed Hasan
 * @see DividendPersistence
 * @see DividendUtil
 * @generated
 */
public class DividendPersistenceImpl extends BasePersistenceImpl<Dividend>
	implements DividendPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DividendUtil} to access the dividend persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DividendImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DividendModelImpl.ENTITY_CACHE_ENABLED,
			DividendModelImpl.FINDER_CACHE_ENABLED, DividendImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DividendModelImpl.ENTITY_CACHE_ENABLED,
			DividendModelImpl.FINDER_CACHE_ENABLED, DividendImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DividendModelImpl.ENTITY_CACHE_ENABLED,
			DividendModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_ASSETID_DECLAREDDATE = new FinderPath(DividendModelImpl.ENTITY_CACHE_ENABLED,
			DividendModelImpl.FINDER_CACHE_ENABLED, DividendImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByAssetId_DeclaredDate",
			new String[] { Long.class.getName(), Date.class.getName() },
			DividendModelImpl.ASSETID_COLUMN_BITMASK |
			DividendModelImpl.DECLAREDDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ASSETID_DECLAREDDATE = new FinderPath(DividendModelImpl.ENTITY_CACHE_ENABLED,
			DividendModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByAssetId_DeclaredDate",
			new String[] { Long.class.getName(), Date.class.getName() });

	/**
	 * Returns the dividend where assetId = &#63; and declaredDate = &#63; or throws a {@link com.fingence.slayer.NoSuchDividendException} if it could not be found.
	 *
	 * @param assetId the asset ID
	 * @param declaredDate the declared date
	 * @return the matching dividend
	 * @throws com.fingence.slayer.NoSuchDividendException if a matching dividend could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Dividend findByAssetId_DeclaredDate(long assetId, Date declaredDate)
		throws NoSuchDividendException, SystemException {
		Dividend dividend = fetchByAssetId_DeclaredDate(assetId, declaredDate);

		if (dividend == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("assetId=");
			msg.append(assetId);

			msg.append(", declaredDate=");
			msg.append(declaredDate);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDividendException(msg.toString());
		}

		return dividend;
	}

	/**
	 * Returns the dividend where assetId = &#63; and declaredDate = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param assetId the asset ID
	 * @param declaredDate the declared date
	 * @return the matching dividend, or <code>null</code> if a matching dividend could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Dividend fetchByAssetId_DeclaredDate(long assetId, Date declaredDate)
		throws SystemException {
		return fetchByAssetId_DeclaredDate(assetId, declaredDate, true);
	}

	/**
	 * Returns the dividend where assetId = &#63; and declaredDate = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param assetId the asset ID
	 * @param declaredDate the declared date
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dividend, or <code>null</code> if a matching dividend could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Dividend fetchByAssetId_DeclaredDate(long assetId,
		Date declaredDate, boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { assetId, declaredDate };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_ASSETID_DECLAREDDATE,
					finderArgs, this);
		}

		if (result instanceof Dividend) {
			Dividend dividend = (Dividend)result;

			if ((assetId != dividend.getAssetId()) ||
					!Validator.equals(declaredDate, dividend.getDeclaredDate())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DIVIDEND_WHERE);

			query.append(_FINDER_COLUMN_ASSETID_DECLAREDDATE_ASSETID_2);

			boolean bindDeclaredDate = false;

			if (declaredDate == null) {
				query.append(_FINDER_COLUMN_ASSETID_DECLAREDDATE_DECLAREDDATE_1);
			}
			else {
				bindDeclaredDate = true;

				query.append(_FINDER_COLUMN_ASSETID_DECLAREDDATE_DECLAREDDATE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(assetId);

				if (bindDeclaredDate) {
					qPos.add(CalendarUtil.getTimestamp(declaredDate));
				}

				List<Dividend> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ASSETID_DECLAREDDATE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DividendPersistenceImpl.fetchByAssetId_DeclaredDate(long, Date, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					Dividend dividend = list.get(0);

					result = dividend;

					cacheResult(dividend);

					if ((dividend.getAssetId() != assetId) ||
							(dividend.getDeclaredDate() == null) ||
							!dividend.getDeclaredDate().equals(declaredDate)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ASSETID_DECLAREDDATE,
							finderArgs, dividend);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ASSETID_DECLAREDDATE,
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
			return (Dividend)result;
		}
	}

	/**
	 * Removes the dividend where assetId = &#63; and declaredDate = &#63; from the database.
	 *
	 * @param assetId the asset ID
	 * @param declaredDate the declared date
	 * @return the dividend that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Dividend removeByAssetId_DeclaredDate(long assetId, Date declaredDate)
		throws NoSuchDividendException, SystemException {
		Dividend dividend = findByAssetId_DeclaredDate(assetId, declaredDate);

		return remove(dividend);
	}

	/**
	 * Returns the number of dividends where assetId = &#63; and declaredDate = &#63;.
	 *
	 * @param assetId the asset ID
	 * @param declaredDate the declared date
	 * @return the number of matching dividends
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByAssetId_DeclaredDate(long assetId, Date declaredDate)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ASSETID_DECLAREDDATE;

		Object[] finderArgs = new Object[] { assetId, declaredDate };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DIVIDEND_WHERE);

			query.append(_FINDER_COLUMN_ASSETID_DECLAREDDATE_ASSETID_2);

			boolean bindDeclaredDate = false;

			if (declaredDate == null) {
				query.append(_FINDER_COLUMN_ASSETID_DECLAREDDATE_DECLAREDDATE_1);
			}
			else {
				bindDeclaredDate = true;

				query.append(_FINDER_COLUMN_ASSETID_DECLAREDDATE_DECLAREDDATE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(assetId);

				if (bindDeclaredDate) {
					qPos.add(CalendarUtil.getTimestamp(declaredDate));
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

	private static final String _FINDER_COLUMN_ASSETID_DECLAREDDATE_ASSETID_2 = "dividend.assetId = ? AND ";
	private static final String _FINDER_COLUMN_ASSETID_DECLAREDDATE_DECLAREDDATE_1 =
		"dividend.declaredDate IS NULL";
	private static final String _FINDER_COLUMN_ASSETID_DECLAREDDATE_DECLAREDDATE_2 =
		"dividend.declaredDate = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSETID = new FinderPath(DividendModelImpl.ENTITY_CACHE_ENABLED,
			DividendModelImpl.FINDER_CACHE_ENABLED, DividendImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByAssetId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSETID =
		new FinderPath(DividendModelImpl.ENTITY_CACHE_ENABLED,
			DividendModelImpl.FINDER_CACHE_ENABLED, DividendImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByAssetId",
			new String[] { Long.class.getName() },
			DividendModelImpl.ASSETID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ASSETID = new FinderPath(DividendModelImpl.ENTITY_CACHE_ENABLED,
			DividendModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByAssetId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the dividends where assetId = &#63;.
	 *
	 * @param assetId the asset ID
	 * @return the matching dividends
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Dividend> findByAssetId(long assetId) throws SystemException {
		return findByAssetId(assetId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dividends where assetId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.DividendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param assetId the asset ID
	 * @param start the lower bound of the range of dividends
	 * @param end the upper bound of the range of dividends (not inclusive)
	 * @return the range of matching dividends
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Dividend> findByAssetId(long assetId, int start, int end)
		throws SystemException {
		return findByAssetId(assetId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dividends where assetId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.DividendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param assetId the asset ID
	 * @param start the lower bound of the range of dividends
	 * @param end the upper bound of the range of dividends (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dividends
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Dividend> findByAssetId(long assetId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSETID;
			finderArgs = new Object[] { assetId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSETID;
			finderArgs = new Object[] { assetId, start, end, orderByComparator };
		}

		List<Dividend> list = (List<Dividend>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Dividend dividend : list) {
				if ((assetId != dividend.getAssetId())) {
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

			query.append(_SQL_SELECT_DIVIDEND_WHERE);

			query.append(_FINDER_COLUMN_ASSETID_ASSETID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DividendModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(assetId);

				if (!pagination) {
					list = (List<Dividend>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Dividend>(list);
				}
				else {
					list = (List<Dividend>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dividend in the ordered set where assetId = &#63;.
	 *
	 * @param assetId the asset ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dividend
	 * @throws com.fingence.slayer.NoSuchDividendException if a matching dividend could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Dividend findByAssetId_First(long assetId,
		OrderByComparator orderByComparator)
		throws NoSuchDividendException, SystemException {
		Dividend dividend = fetchByAssetId_First(assetId, orderByComparator);

		if (dividend != null) {
			return dividend;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assetId=");
		msg.append(assetId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDividendException(msg.toString());
	}

	/**
	 * Returns the first dividend in the ordered set where assetId = &#63;.
	 *
	 * @param assetId the asset ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dividend, or <code>null</code> if a matching dividend could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Dividend fetchByAssetId_First(long assetId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Dividend> list = findByAssetId(assetId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dividend in the ordered set where assetId = &#63;.
	 *
	 * @param assetId the asset ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dividend
	 * @throws com.fingence.slayer.NoSuchDividendException if a matching dividend could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Dividend findByAssetId_Last(long assetId,
		OrderByComparator orderByComparator)
		throws NoSuchDividendException, SystemException {
		Dividend dividend = fetchByAssetId_Last(assetId, orderByComparator);

		if (dividend != null) {
			return dividend;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assetId=");
		msg.append(assetId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDividendException(msg.toString());
	}

	/**
	 * Returns the last dividend in the ordered set where assetId = &#63;.
	 *
	 * @param assetId the asset ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dividend, or <code>null</code> if a matching dividend could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Dividend fetchByAssetId_Last(long assetId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByAssetId(assetId);

		if (count == 0) {
			return null;
		}

		List<Dividend> list = findByAssetId(assetId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dividends before and after the current dividend in the ordered set where assetId = &#63;.
	 *
	 * @param recId the primary key of the current dividend
	 * @param assetId the asset ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dividend
	 * @throws com.fingence.slayer.NoSuchDividendException if a dividend with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Dividend[] findByAssetId_PrevAndNext(long recId, long assetId,
		OrderByComparator orderByComparator)
		throws NoSuchDividendException, SystemException {
		Dividend dividend = findByPrimaryKey(recId);

		Session session = null;

		try {
			session = openSession();

			Dividend[] array = new DividendImpl[3];

			array[0] = getByAssetId_PrevAndNext(session, dividend, assetId,
					orderByComparator, true);

			array[1] = dividend;

			array[2] = getByAssetId_PrevAndNext(session, dividend, assetId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Dividend getByAssetId_PrevAndNext(Session session,
		Dividend dividend, long assetId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DIVIDEND_WHERE);

		query.append(_FINDER_COLUMN_ASSETID_ASSETID_2);

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
			query.append(DividendModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(assetId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dividend);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Dividend> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dividends where assetId = &#63; from the database.
	 *
	 * @param assetId the asset ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByAssetId(long assetId) throws SystemException {
		for (Dividend dividend : findByAssetId(assetId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(dividend);
		}
	}

	/**
	 * Returns the number of dividends where assetId = &#63;.
	 *
	 * @param assetId the asset ID
	 * @return the number of matching dividends
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByAssetId(long assetId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ASSETID;

		Object[] finderArgs = new Object[] { assetId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DIVIDEND_WHERE);

			query.append(_FINDER_COLUMN_ASSETID_ASSETID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(assetId);

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

	private static final String _FINDER_COLUMN_ASSETID_ASSETID_2 = "dividend.assetId = ?";

	public DividendPersistenceImpl() {
		setModelClass(Dividend.class);
	}

	/**
	 * Caches the dividend in the entity cache if it is enabled.
	 *
	 * @param dividend the dividend
	 */
	@Override
	public void cacheResult(Dividend dividend) {
		EntityCacheUtil.putResult(DividendModelImpl.ENTITY_CACHE_ENABLED,
			DividendImpl.class, dividend.getPrimaryKey(), dividend);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ASSETID_DECLAREDDATE,
			new Object[] { dividend.getAssetId(), dividend.getDeclaredDate() },
			dividend);

		dividend.resetOriginalValues();
	}

	/**
	 * Caches the dividends in the entity cache if it is enabled.
	 *
	 * @param dividends the dividends
	 */
	@Override
	public void cacheResult(List<Dividend> dividends) {
		for (Dividend dividend : dividends) {
			if (EntityCacheUtil.getResult(
						DividendModelImpl.ENTITY_CACHE_ENABLED,
						DividendImpl.class, dividend.getPrimaryKey()) == null) {
				cacheResult(dividend);
			}
			else {
				dividend.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dividends.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DividendImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DividendImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dividend.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Dividend dividend) {
		EntityCacheUtil.removeResult(DividendModelImpl.ENTITY_CACHE_ENABLED,
			DividendImpl.class, dividend.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dividend);
	}

	@Override
	public void clearCache(List<Dividend> dividends) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Dividend dividend : dividends) {
			EntityCacheUtil.removeResult(DividendModelImpl.ENTITY_CACHE_ENABLED,
				DividendImpl.class, dividend.getPrimaryKey());

			clearUniqueFindersCache(dividend);
		}
	}

	protected void cacheUniqueFindersCache(Dividend dividend) {
		if (dividend.isNew()) {
			Object[] args = new Object[] {
					dividend.getAssetId(), dividend.getDeclaredDate()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ASSETID_DECLAREDDATE,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ASSETID_DECLAREDDATE,
				args, dividend);
		}
		else {
			DividendModelImpl dividendModelImpl = (DividendModelImpl)dividend;

			if ((dividendModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_ASSETID_DECLAREDDATE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dividend.getAssetId(), dividend.getDeclaredDate()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ASSETID_DECLAREDDATE,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ASSETID_DECLAREDDATE,
					args, dividend);
			}
		}
	}

	protected void clearUniqueFindersCache(Dividend dividend) {
		DividendModelImpl dividendModelImpl = (DividendModelImpl)dividend;

		Object[] args = new Object[] {
				dividend.getAssetId(), dividend.getDeclaredDate()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSETID_DECLAREDDATE,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ASSETID_DECLAREDDATE,
			args);

		if ((dividendModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_ASSETID_DECLAREDDATE.getColumnBitmask()) != 0) {
			args = new Object[] {
					dividendModelImpl.getOriginalAssetId(),
					dividendModelImpl.getOriginalDeclaredDate()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSETID_DECLAREDDATE,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ASSETID_DECLAREDDATE,
				args);
		}
	}

	/**
	 * Creates a new dividend with the primary key. Does not add the dividend to the database.
	 *
	 * @param recId the primary key for the new dividend
	 * @return the new dividend
	 */
	@Override
	public Dividend create(long recId) {
		Dividend dividend = new DividendImpl();

		dividend.setNew(true);
		dividend.setPrimaryKey(recId);

		return dividend;
	}

	/**
	 * Removes the dividend with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param recId the primary key of the dividend
	 * @return the dividend that was removed
	 * @throws com.fingence.slayer.NoSuchDividendException if a dividend with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Dividend remove(long recId)
		throws NoSuchDividendException, SystemException {
		return remove((Serializable)recId);
	}

	/**
	 * Removes the dividend with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dividend
	 * @return the dividend that was removed
	 * @throws com.fingence.slayer.NoSuchDividendException if a dividend with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Dividend remove(Serializable primaryKey)
		throws NoSuchDividendException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Dividend dividend = (Dividend)session.get(DividendImpl.class,
					primaryKey);

			if (dividend == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDividendException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dividend);
		}
		catch (NoSuchDividendException nsee) {
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
	protected Dividend removeImpl(Dividend dividend) throws SystemException {
		dividend = toUnwrappedModel(dividend);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dividend)) {
				dividend = (Dividend)session.get(DividendImpl.class,
						dividend.getPrimaryKeyObj());
			}

			if (dividend != null) {
				session.delete(dividend);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dividend != null) {
			clearCache(dividend);
		}

		return dividend;
	}

	@Override
	public Dividend updateImpl(com.fingence.slayer.model.Dividend dividend)
		throws SystemException {
		dividend = toUnwrappedModel(dividend);

		boolean isNew = dividend.isNew();

		DividendModelImpl dividendModelImpl = (DividendModelImpl)dividend;

		Session session = null;

		try {
			session = openSession();

			if (dividend.isNew()) {
				session.save(dividend);

				dividend.setNew(false);
			}
			else {
				session.merge(dividend);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DividendModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dividendModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSETID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dividendModelImpl.getOriginalAssetId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSETID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSETID,
					args);

				args = new Object[] { dividendModelImpl.getAssetId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSETID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSETID,
					args);
			}
		}

		EntityCacheUtil.putResult(DividendModelImpl.ENTITY_CACHE_ENABLED,
			DividendImpl.class, dividend.getPrimaryKey(), dividend);

		clearUniqueFindersCache(dividend);
		cacheUniqueFindersCache(dividend);

		return dividend;
	}

	protected Dividend toUnwrappedModel(Dividend dividend) {
		if (dividend instanceof DividendImpl) {
			return dividend;
		}

		DividendImpl dividendImpl = new DividendImpl();

		dividendImpl.setNew(dividend.isNew());
		dividendImpl.setPrimaryKey(dividend.getPrimaryKey());

		dividendImpl.setRecId(dividend.getRecId());
		dividendImpl.setAssetId(dividend.getAssetId());
		dividendImpl.setDeclaredDate(dividend.getDeclaredDate());
		dividendImpl.setExDate(dividend.getExDate());
		dividendImpl.setRecordDate(dividend.getRecordDate());
		dividendImpl.setPayableDate(dividend.getPayableDate());
		dividendImpl.setAmount(dividend.getAmount());
		dividendImpl.setFrequency(dividend.getFrequency());
		dividendImpl.setType(dividend.getType());

		return dividendImpl;
	}

	/**
	 * Returns the dividend with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dividend
	 * @return the dividend
	 * @throws com.fingence.slayer.NoSuchDividendException if a dividend with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Dividend findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDividendException, SystemException {
		Dividend dividend = fetchByPrimaryKey(primaryKey);

		if (dividend == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDividendException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dividend;
	}

	/**
	 * Returns the dividend with the primary key or throws a {@link com.fingence.slayer.NoSuchDividendException} if it could not be found.
	 *
	 * @param recId the primary key of the dividend
	 * @return the dividend
	 * @throws com.fingence.slayer.NoSuchDividendException if a dividend with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Dividend findByPrimaryKey(long recId)
		throws NoSuchDividendException, SystemException {
		return findByPrimaryKey((Serializable)recId);
	}

	/**
	 * Returns the dividend with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dividend
	 * @return the dividend, or <code>null</code> if a dividend with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Dividend fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Dividend dividend = (Dividend)EntityCacheUtil.getResult(DividendModelImpl.ENTITY_CACHE_ENABLED,
				DividendImpl.class, primaryKey);

		if (dividend == _nullDividend) {
			return null;
		}

		if (dividend == null) {
			Session session = null;

			try {
				session = openSession();

				dividend = (Dividend)session.get(DividendImpl.class, primaryKey);

				if (dividend != null) {
					cacheResult(dividend);
				}
				else {
					EntityCacheUtil.putResult(DividendModelImpl.ENTITY_CACHE_ENABLED,
						DividendImpl.class, primaryKey, _nullDividend);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DividendModelImpl.ENTITY_CACHE_ENABLED,
					DividendImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dividend;
	}

	/**
	 * Returns the dividend with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param recId the primary key of the dividend
	 * @return the dividend, or <code>null</code> if a dividend with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Dividend fetchByPrimaryKey(long recId) throws SystemException {
		return fetchByPrimaryKey((Serializable)recId);
	}

	/**
	 * Returns all the dividends.
	 *
	 * @return the dividends
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Dividend> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dividends.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.DividendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dividends
	 * @param end the upper bound of the range of dividends (not inclusive)
	 * @return the range of dividends
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Dividend> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dividends.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.DividendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dividends
	 * @param end the upper bound of the range of dividends (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dividends
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Dividend> findAll(int start, int end,
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

		List<Dividend> list = (List<Dividend>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DIVIDEND);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DIVIDEND;

				if (pagination) {
					sql = sql.concat(DividendModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Dividend>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Dividend>(list);
				}
				else {
					list = (List<Dividend>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dividends from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Dividend dividend : findAll()) {
			remove(dividend);
		}
	}

	/**
	 * Returns the number of dividends.
	 *
	 * @return the number of dividends
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

				Query q = session.createQuery(_SQL_COUNT_DIVIDEND);

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
	 * Initializes the dividend persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.fingence.slayer.model.Dividend")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Dividend>> listenersList = new ArrayList<ModelListener<Dividend>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Dividend>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DividendImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DIVIDEND = "SELECT dividend FROM Dividend dividend";
	private static final String _SQL_SELECT_DIVIDEND_WHERE = "SELECT dividend FROM Dividend dividend WHERE ";
	private static final String _SQL_COUNT_DIVIDEND = "SELECT COUNT(dividend) FROM Dividend dividend";
	private static final String _SQL_COUNT_DIVIDEND_WHERE = "SELECT COUNT(dividend) FROM Dividend dividend WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dividend.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Dividend exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Dividend exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DividendPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"type"
			});
	private static Dividend _nullDividend = new DividendImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Dividend> toCacheModel() {
				return _nullDividendCacheModel;
			}
		};

	private static CacheModel<Dividend> _nullDividendCacheModel = new CacheModel<Dividend>() {
			@Override
			public Dividend toEntityModel() {
				return _nullDividend;
			}
		};
}