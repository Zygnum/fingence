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

import com.fingence.slayer.NoSuchHistoryException;
import com.fingence.slayer.model.History;
import com.fingence.slayer.model.impl.HistoryImpl;
import com.fingence.slayer.model.impl.HistoryModelImpl;

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
 * The persistence implementation for the history service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ahmed Hasan
 * @see HistoryPersistence
 * @see HistoryUtil
 * @generated
 */
public class HistoryPersistenceImpl extends BasePersistenceImpl<History>
	implements HistoryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link HistoryUtil} to access the history persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = HistoryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(HistoryModelImpl.ENTITY_CACHE_ENABLED,
			HistoryModelImpl.FINDER_CACHE_ENABLED, HistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(HistoryModelImpl.ENTITY_CACHE_ENABLED,
			HistoryModelImpl.FINDER_CACHE_ENABLED, HistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(HistoryModelImpl.ENTITY_CACHE_ENABLED,
			HistoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_ASSETID_DATE_TYPE = new FinderPath(HistoryModelImpl.ENTITY_CACHE_ENABLED,
			HistoryModelImpl.FINDER_CACHE_ENABLED, HistoryImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByAssetId_Date_Type",
			new String[] {
				Long.class.getName(), Date.class.getName(),
				Integer.class.getName()
			},
			HistoryModelImpl.ASSETID_COLUMN_BITMASK |
			HistoryModelImpl.LOGDATE_COLUMN_BITMASK |
			HistoryModelImpl.TYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ASSETID_DATE_TYPE = new FinderPath(HistoryModelImpl.ENTITY_CACHE_ENABLED,
			HistoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByAssetId_Date_Type",
			new String[] {
				Long.class.getName(), Date.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns the history where assetId = &#63; and logDate = &#63; and type = &#63; or throws a {@link com.fingence.slayer.NoSuchHistoryException} if it could not be found.
	 *
	 * @param assetId the asset ID
	 * @param logDate the log date
	 * @param type the type
	 * @return the matching history
	 * @throws com.fingence.slayer.NoSuchHistoryException if a matching history could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public History findByAssetId_Date_Type(long assetId, Date logDate, int type)
		throws NoSuchHistoryException, SystemException {
		History history = fetchByAssetId_Date_Type(assetId, logDate, type);

		if (history == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("assetId=");
			msg.append(assetId);

			msg.append(", logDate=");
			msg.append(logDate);

			msg.append(", type=");
			msg.append(type);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchHistoryException(msg.toString());
		}

		return history;
	}

	/**
	 * Returns the history where assetId = &#63; and logDate = &#63; and type = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param assetId the asset ID
	 * @param logDate the log date
	 * @param type the type
	 * @return the matching history, or <code>null</code> if a matching history could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public History fetchByAssetId_Date_Type(long assetId, Date logDate, int type)
		throws SystemException {
		return fetchByAssetId_Date_Type(assetId, logDate, type, true);
	}

	/**
	 * Returns the history where assetId = &#63; and logDate = &#63; and type = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param assetId the asset ID
	 * @param logDate the log date
	 * @param type the type
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching history, or <code>null</code> if a matching history could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public History fetchByAssetId_Date_Type(long assetId, Date logDate,
		int type, boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { assetId, logDate, type };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_ASSETID_DATE_TYPE,
					finderArgs, this);
		}

		if (result instanceof History) {
			History history = (History)result;

			if ((assetId != history.getAssetId()) ||
					!Validator.equals(logDate, history.getLogDate()) ||
					(type != history.getType())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_HISTORY_WHERE);

			query.append(_FINDER_COLUMN_ASSETID_DATE_TYPE_ASSETID_2);

			boolean bindLogDate = false;

			if (logDate == null) {
				query.append(_FINDER_COLUMN_ASSETID_DATE_TYPE_LOGDATE_1);
			}
			else {
				bindLogDate = true;

				query.append(_FINDER_COLUMN_ASSETID_DATE_TYPE_LOGDATE_2);
			}

			query.append(_FINDER_COLUMN_ASSETID_DATE_TYPE_TYPE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(assetId);

				if (bindLogDate) {
					qPos.add(CalendarUtil.getTimestamp(logDate));
				}

				qPos.add(type);

				List<History> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ASSETID_DATE_TYPE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"HistoryPersistenceImpl.fetchByAssetId_Date_Type(long, Date, int, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					History history = list.get(0);

					result = history;

					cacheResult(history);

					if ((history.getAssetId() != assetId) ||
							(history.getLogDate() == null) ||
							!history.getLogDate().equals(logDate) ||
							(history.getType() != type)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ASSETID_DATE_TYPE,
							finderArgs, history);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ASSETID_DATE_TYPE,
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
			return (History)result;
		}
	}

	/**
	 * Removes the history where assetId = &#63; and logDate = &#63; and type = &#63; from the database.
	 *
	 * @param assetId the asset ID
	 * @param logDate the log date
	 * @param type the type
	 * @return the history that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public History removeByAssetId_Date_Type(long assetId, Date logDate,
		int type) throws NoSuchHistoryException, SystemException {
		History history = findByAssetId_Date_Type(assetId, logDate, type);

		return remove(history);
	}

	/**
	 * Returns the number of histories where assetId = &#63; and logDate = &#63; and type = &#63;.
	 *
	 * @param assetId the asset ID
	 * @param logDate the log date
	 * @param type the type
	 * @return the number of matching histories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByAssetId_Date_Type(long assetId, Date logDate, int type)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ASSETID_DATE_TYPE;

		Object[] finderArgs = new Object[] { assetId, logDate, type };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_HISTORY_WHERE);

			query.append(_FINDER_COLUMN_ASSETID_DATE_TYPE_ASSETID_2);

			boolean bindLogDate = false;

			if (logDate == null) {
				query.append(_FINDER_COLUMN_ASSETID_DATE_TYPE_LOGDATE_1);
			}
			else {
				bindLogDate = true;

				query.append(_FINDER_COLUMN_ASSETID_DATE_TYPE_LOGDATE_2);
			}

			query.append(_FINDER_COLUMN_ASSETID_DATE_TYPE_TYPE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(assetId);

				if (bindLogDate) {
					qPos.add(CalendarUtil.getTimestamp(logDate));
				}

				qPos.add(type);

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

	private static final String _FINDER_COLUMN_ASSETID_DATE_TYPE_ASSETID_2 = "history.assetId = ? AND ";
	private static final String _FINDER_COLUMN_ASSETID_DATE_TYPE_LOGDATE_1 = "history.logDate IS NULL AND ";
	private static final String _FINDER_COLUMN_ASSETID_DATE_TYPE_LOGDATE_2 = "history.logDate = ? AND ";
	private static final String _FINDER_COLUMN_ASSETID_DATE_TYPE_TYPE_2 = "history.type = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSETID_TYPE =
		new FinderPath(HistoryModelImpl.ENTITY_CACHE_ENABLED,
			HistoryModelImpl.FINDER_CACHE_ENABLED, HistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByAssetId_Type",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSETID_TYPE =
		new FinderPath(HistoryModelImpl.ENTITY_CACHE_ENABLED,
			HistoryModelImpl.FINDER_CACHE_ENABLED, HistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByAssetId_Type",
			new String[] { Long.class.getName(), Integer.class.getName() },
			HistoryModelImpl.ASSETID_COLUMN_BITMASK |
			HistoryModelImpl.TYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ASSETID_TYPE = new FinderPath(HistoryModelImpl.ENTITY_CACHE_ENABLED,
			HistoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByAssetId_Type",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the histories where assetId = &#63; and type = &#63;.
	 *
	 * @param assetId the asset ID
	 * @param type the type
	 * @return the matching histories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<History> findByAssetId_Type(long assetId, int type)
		throws SystemException {
		return findByAssetId_Type(assetId, type, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the histories where assetId = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.HistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param assetId the asset ID
	 * @param type the type
	 * @param start the lower bound of the range of histories
	 * @param end the upper bound of the range of histories (not inclusive)
	 * @return the range of matching histories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<History> findByAssetId_Type(long assetId, int type, int start,
		int end) throws SystemException {
		return findByAssetId_Type(assetId, type, start, end, null);
	}

	/**
	 * Returns an ordered range of all the histories where assetId = &#63; and type = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.HistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param assetId the asset ID
	 * @param type the type
	 * @param start the lower bound of the range of histories
	 * @param end the upper bound of the range of histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching histories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<History> findByAssetId_Type(long assetId, int type, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSETID_TYPE;
			finderArgs = new Object[] { assetId, type };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSETID_TYPE;
			finderArgs = new Object[] {
					assetId, type,
					
					start, end, orderByComparator
				};
		}

		List<History> list = (List<History>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (History history : list) {
				if ((assetId != history.getAssetId()) ||
						(type != history.getType())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_HISTORY_WHERE);

			query.append(_FINDER_COLUMN_ASSETID_TYPE_ASSETID_2);

			query.append(_FINDER_COLUMN_ASSETID_TYPE_TYPE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(HistoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(assetId);

				qPos.add(type);

				if (!pagination) {
					list = (List<History>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<History>(list);
				}
				else {
					list = (List<History>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first history in the ordered set where assetId = &#63; and type = &#63;.
	 *
	 * @param assetId the asset ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching history
	 * @throws com.fingence.slayer.NoSuchHistoryException if a matching history could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public History findByAssetId_Type_First(long assetId, int type,
		OrderByComparator orderByComparator)
		throws NoSuchHistoryException, SystemException {
		History history = fetchByAssetId_Type_First(assetId, type,
				orderByComparator);

		if (history != null) {
			return history;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assetId=");
		msg.append(assetId);

		msg.append(", type=");
		msg.append(type);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchHistoryException(msg.toString());
	}

	/**
	 * Returns the first history in the ordered set where assetId = &#63; and type = &#63;.
	 *
	 * @param assetId the asset ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching history, or <code>null</code> if a matching history could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public History fetchByAssetId_Type_First(long assetId, int type,
		OrderByComparator orderByComparator) throws SystemException {
		List<History> list = findByAssetId_Type(assetId, type, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last history in the ordered set where assetId = &#63; and type = &#63;.
	 *
	 * @param assetId the asset ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching history
	 * @throws com.fingence.slayer.NoSuchHistoryException if a matching history could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public History findByAssetId_Type_Last(long assetId, int type,
		OrderByComparator orderByComparator)
		throws NoSuchHistoryException, SystemException {
		History history = fetchByAssetId_Type_Last(assetId, type,
				orderByComparator);

		if (history != null) {
			return history;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assetId=");
		msg.append(assetId);

		msg.append(", type=");
		msg.append(type);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchHistoryException(msg.toString());
	}

	/**
	 * Returns the last history in the ordered set where assetId = &#63; and type = &#63;.
	 *
	 * @param assetId the asset ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching history, or <code>null</code> if a matching history could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public History fetchByAssetId_Type_Last(long assetId, int type,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByAssetId_Type(assetId, type);

		if (count == 0) {
			return null;
		}

		List<History> list = findByAssetId_Type(assetId, type, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the histories before and after the current history in the ordered set where assetId = &#63; and type = &#63;.
	 *
	 * @param recId the primary key of the current history
	 * @param assetId the asset ID
	 * @param type the type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next history
	 * @throws com.fingence.slayer.NoSuchHistoryException if a history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public History[] findByAssetId_Type_PrevAndNext(long recId, long assetId,
		int type, OrderByComparator orderByComparator)
		throws NoSuchHistoryException, SystemException {
		History history = findByPrimaryKey(recId);

		Session session = null;

		try {
			session = openSession();

			History[] array = new HistoryImpl[3];

			array[0] = getByAssetId_Type_PrevAndNext(session, history, assetId,
					type, orderByComparator, true);

			array[1] = history;

			array[2] = getByAssetId_Type_PrevAndNext(session, history, assetId,
					type, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected History getByAssetId_Type_PrevAndNext(Session session,
		History history, long assetId, int type,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_HISTORY_WHERE);

		query.append(_FINDER_COLUMN_ASSETID_TYPE_ASSETID_2);

		query.append(_FINDER_COLUMN_ASSETID_TYPE_TYPE_2);

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
			query.append(HistoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(assetId);

		qPos.add(type);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(history);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<History> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the histories where assetId = &#63; and type = &#63; from the database.
	 *
	 * @param assetId the asset ID
	 * @param type the type
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByAssetId_Type(long assetId, int type)
		throws SystemException {
		for (History history : findByAssetId_Type(assetId, type,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(history);
		}
	}

	/**
	 * Returns the number of histories where assetId = &#63; and type = &#63;.
	 *
	 * @param assetId the asset ID
	 * @param type the type
	 * @return the number of matching histories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByAssetId_Type(long assetId, int type)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ASSETID_TYPE;

		Object[] finderArgs = new Object[] { assetId, type };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_HISTORY_WHERE);

			query.append(_FINDER_COLUMN_ASSETID_TYPE_ASSETID_2);

			query.append(_FINDER_COLUMN_ASSETID_TYPE_TYPE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(assetId);

				qPos.add(type);

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

	private static final String _FINDER_COLUMN_ASSETID_TYPE_ASSETID_2 = "history.assetId = ? AND ";
	private static final String _FINDER_COLUMN_ASSETID_TYPE_TYPE_2 = "history.type = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSETID = new FinderPath(HistoryModelImpl.ENTITY_CACHE_ENABLED,
			HistoryModelImpl.FINDER_CACHE_ENABLED, HistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByAssetId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSETID =
		new FinderPath(HistoryModelImpl.ENTITY_CACHE_ENABLED,
			HistoryModelImpl.FINDER_CACHE_ENABLED, HistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByAssetId",
			new String[] { Long.class.getName() },
			HistoryModelImpl.ASSETID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ASSETID = new FinderPath(HistoryModelImpl.ENTITY_CACHE_ENABLED,
			HistoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByAssetId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the histories where assetId = &#63;.
	 *
	 * @param assetId the asset ID
	 * @return the matching histories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<History> findByAssetId(long assetId) throws SystemException {
		return findByAssetId(assetId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the histories where assetId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.HistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param assetId the asset ID
	 * @param start the lower bound of the range of histories
	 * @param end the upper bound of the range of histories (not inclusive)
	 * @return the range of matching histories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<History> findByAssetId(long assetId, int start, int end)
		throws SystemException {
		return findByAssetId(assetId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the histories where assetId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.HistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param assetId the asset ID
	 * @param start the lower bound of the range of histories
	 * @param end the upper bound of the range of histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching histories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<History> findByAssetId(long assetId, int start, int end,
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

		List<History> list = (List<History>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (History history : list) {
				if ((assetId != history.getAssetId())) {
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

			query.append(_SQL_SELECT_HISTORY_WHERE);

			query.append(_FINDER_COLUMN_ASSETID_ASSETID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(HistoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(assetId);

				if (!pagination) {
					list = (List<History>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<History>(list);
				}
				else {
					list = (List<History>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first history in the ordered set where assetId = &#63;.
	 *
	 * @param assetId the asset ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching history
	 * @throws com.fingence.slayer.NoSuchHistoryException if a matching history could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public History findByAssetId_First(long assetId,
		OrderByComparator orderByComparator)
		throws NoSuchHistoryException, SystemException {
		History history = fetchByAssetId_First(assetId, orderByComparator);

		if (history != null) {
			return history;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assetId=");
		msg.append(assetId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchHistoryException(msg.toString());
	}

	/**
	 * Returns the first history in the ordered set where assetId = &#63;.
	 *
	 * @param assetId the asset ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching history, or <code>null</code> if a matching history could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public History fetchByAssetId_First(long assetId,
		OrderByComparator orderByComparator) throws SystemException {
		List<History> list = findByAssetId(assetId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last history in the ordered set where assetId = &#63;.
	 *
	 * @param assetId the asset ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching history
	 * @throws com.fingence.slayer.NoSuchHistoryException if a matching history could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public History findByAssetId_Last(long assetId,
		OrderByComparator orderByComparator)
		throws NoSuchHistoryException, SystemException {
		History history = fetchByAssetId_Last(assetId, orderByComparator);

		if (history != null) {
			return history;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("assetId=");
		msg.append(assetId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchHistoryException(msg.toString());
	}

	/**
	 * Returns the last history in the ordered set where assetId = &#63;.
	 *
	 * @param assetId the asset ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching history, or <code>null</code> if a matching history could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public History fetchByAssetId_Last(long assetId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByAssetId(assetId);

		if (count == 0) {
			return null;
		}

		List<History> list = findByAssetId(assetId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the histories before and after the current history in the ordered set where assetId = &#63;.
	 *
	 * @param recId the primary key of the current history
	 * @param assetId the asset ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next history
	 * @throws com.fingence.slayer.NoSuchHistoryException if a history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public History[] findByAssetId_PrevAndNext(long recId, long assetId,
		OrderByComparator orderByComparator)
		throws NoSuchHistoryException, SystemException {
		History history = findByPrimaryKey(recId);

		Session session = null;

		try {
			session = openSession();

			History[] array = new HistoryImpl[3];

			array[0] = getByAssetId_PrevAndNext(session, history, assetId,
					orderByComparator, true);

			array[1] = history;

			array[2] = getByAssetId_PrevAndNext(session, history, assetId,
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

	protected History getByAssetId_PrevAndNext(Session session,
		History history, long assetId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_HISTORY_WHERE);

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
			query.append(HistoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(assetId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(history);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<History> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the histories where assetId = &#63; from the database.
	 *
	 * @param assetId the asset ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByAssetId(long assetId) throws SystemException {
		for (History history : findByAssetId(assetId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(history);
		}
	}

	/**
	 * Returns the number of histories where assetId = &#63;.
	 *
	 * @param assetId the asset ID
	 * @return the number of matching histories
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

			query.append(_SQL_COUNT_HISTORY_WHERE);

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

	private static final String _FINDER_COLUMN_ASSETID_ASSETID_2 = "history.assetId = ?";

	public HistoryPersistenceImpl() {
		setModelClass(History.class);
	}

	/**
	 * Caches the history in the entity cache if it is enabled.
	 *
	 * @param history the history
	 */
	@Override
	public void cacheResult(History history) {
		EntityCacheUtil.putResult(HistoryModelImpl.ENTITY_CACHE_ENABLED,
			HistoryImpl.class, history.getPrimaryKey(), history);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ASSETID_DATE_TYPE,
			new Object[] {
				history.getAssetId(), history.getLogDate(), history.getType()
			}, history);

		history.resetOriginalValues();
	}

	/**
	 * Caches the histories in the entity cache if it is enabled.
	 *
	 * @param histories the histories
	 */
	@Override
	public void cacheResult(List<History> histories) {
		for (History history : histories) {
			if (EntityCacheUtil.getResult(
						HistoryModelImpl.ENTITY_CACHE_ENABLED,
						HistoryImpl.class, history.getPrimaryKey()) == null) {
				cacheResult(history);
			}
			else {
				history.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all histories.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(HistoryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(HistoryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the history.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(History history) {
		EntityCacheUtil.removeResult(HistoryModelImpl.ENTITY_CACHE_ENABLED,
			HistoryImpl.class, history.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(history);
	}

	@Override
	public void clearCache(List<History> histories) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (History history : histories) {
			EntityCacheUtil.removeResult(HistoryModelImpl.ENTITY_CACHE_ENABLED,
				HistoryImpl.class, history.getPrimaryKey());

			clearUniqueFindersCache(history);
		}
	}

	protected void cacheUniqueFindersCache(History history) {
		if (history.isNew()) {
			Object[] args = new Object[] {
					history.getAssetId(), history.getLogDate(),
					history.getType()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ASSETID_DATE_TYPE,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ASSETID_DATE_TYPE,
				args, history);
		}
		else {
			HistoryModelImpl historyModelImpl = (HistoryModelImpl)history;

			if ((historyModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_ASSETID_DATE_TYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						history.getAssetId(), history.getLogDate(),
						history.getType()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ASSETID_DATE_TYPE,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ASSETID_DATE_TYPE,
					args, history);
			}
		}
	}

	protected void clearUniqueFindersCache(History history) {
		HistoryModelImpl historyModelImpl = (HistoryModelImpl)history;

		Object[] args = new Object[] {
				history.getAssetId(), history.getLogDate(), history.getType()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSETID_DATE_TYPE,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ASSETID_DATE_TYPE,
			args);

		if ((historyModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_ASSETID_DATE_TYPE.getColumnBitmask()) != 0) {
			args = new Object[] {
					historyModelImpl.getOriginalAssetId(),
					historyModelImpl.getOriginalLogDate(),
					historyModelImpl.getOriginalType()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSETID_DATE_TYPE,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ASSETID_DATE_TYPE,
				args);
		}
	}

	/**
	 * Creates a new history with the primary key. Does not add the history to the database.
	 *
	 * @param recId the primary key for the new history
	 * @return the new history
	 */
	@Override
	public History create(long recId) {
		History history = new HistoryImpl();

		history.setNew(true);
		history.setPrimaryKey(recId);

		return history;
	}

	/**
	 * Removes the history with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param recId the primary key of the history
	 * @return the history that was removed
	 * @throws com.fingence.slayer.NoSuchHistoryException if a history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public History remove(long recId)
		throws NoSuchHistoryException, SystemException {
		return remove((Serializable)recId);
	}

	/**
	 * Removes the history with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the history
	 * @return the history that was removed
	 * @throws com.fingence.slayer.NoSuchHistoryException if a history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public History remove(Serializable primaryKey)
		throws NoSuchHistoryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			History history = (History)session.get(HistoryImpl.class, primaryKey);

			if (history == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHistoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(history);
		}
		catch (NoSuchHistoryException nsee) {
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
	protected History removeImpl(History history) throws SystemException {
		history = toUnwrappedModel(history);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(history)) {
				history = (History)session.get(HistoryImpl.class,
						history.getPrimaryKeyObj());
			}

			if (history != null) {
				session.delete(history);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (history != null) {
			clearCache(history);
		}

		return history;
	}

	@Override
	public History updateImpl(com.fingence.slayer.model.History history)
		throws SystemException {
		history = toUnwrappedModel(history);

		boolean isNew = history.isNew();

		HistoryModelImpl historyModelImpl = (HistoryModelImpl)history;

		Session session = null;

		try {
			session = openSession();

			if (history.isNew()) {
				session.save(history);

				history.setNew(false);
			}
			else {
				session.merge(history);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !HistoryModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((historyModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSETID_TYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						historyModelImpl.getOriginalAssetId(),
						historyModelImpl.getOriginalType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSETID_TYPE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSETID_TYPE,
					args);

				args = new Object[] {
						historyModelImpl.getAssetId(),
						historyModelImpl.getType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSETID_TYPE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSETID_TYPE,
					args);
			}

			if ((historyModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSETID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						historyModelImpl.getOriginalAssetId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSETID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSETID,
					args);

				args = new Object[] { historyModelImpl.getAssetId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSETID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSETID,
					args);
			}
		}

		EntityCacheUtil.putResult(HistoryModelImpl.ENTITY_CACHE_ENABLED,
			HistoryImpl.class, history.getPrimaryKey(), history);

		clearUniqueFindersCache(history);
		cacheUniqueFindersCache(history);

		return history;
	}

	protected History toUnwrappedModel(History history) {
		if (history instanceof HistoryImpl) {
			return history;
		}

		HistoryImpl historyImpl = new HistoryImpl();

		historyImpl.setNew(history.isNew());
		historyImpl.setPrimaryKey(history.getPrimaryKey());

		historyImpl.setRecId(history.getRecId());
		historyImpl.setAssetId(history.getAssetId());
		historyImpl.setLogDate(history.getLogDate());
		historyImpl.setValue(history.getValue());
		historyImpl.setType(history.getType());
		historyImpl.setPrincipal(history.getPrincipal());

		return historyImpl;
	}

	/**
	 * Returns the history with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the history
	 * @return the history
	 * @throws com.fingence.slayer.NoSuchHistoryException if a history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public History findByPrimaryKey(Serializable primaryKey)
		throws NoSuchHistoryException, SystemException {
		History history = fetchByPrimaryKey(primaryKey);

		if (history == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHistoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return history;
	}

	/**
	 * Returns the history with the primary key or throws a {@link com.fingence.slayer.NoSuchHistoryException} if it could not be found.
	 *
	 * @param recId the primary key of the history
	 * @return the history
	 * @throws com.fingence.slayer.NoSuchHistoryException if a history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public History findByPrimaryKey(long recId)
		throws NoSuchHistoryException, SystemException {
		return findByPrimaryKey((Serializable)recId);
	}

	/**
	 * Returns the history with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the history
	 * @return the history, or <code>null</code> if a history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public History fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		History history = (History)EntityCacheUtil.getResult(HistoryModelImpl.ENTITY_CACHE_ENABLED,
				HistoryImpl.class, primaryKey);

		if (history == _nullHistory) {
			return null;
		}

		if (history == null) {
			Session session = null;

			try {
				session = openSession();

				history = (History)session.get(HistoryImpl.class, primaryKey);

				if (history != null) {
					cacheResult(history);
				}
				else {
					EntityCacheUtil.putResult(HistoryModelImpl.ENTITY_CACHE_ENABLED,
						HistoryImpl.class, primaryKey, _nullHistory);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(HistoryModelImpl.ENTITY_CACHE_ENABLED,
					HistoryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return history;
	}

	/**
	 * Returns the history with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param recId the primary key of the history
	 * @return the history, or <code>null</code> if a history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public History fetchByPrimaryKey(long recId) throws SystemException {
		return fetchByPrimaryKey((Serializable)recId);
	}

	/**
	 * Returns all the histories.
	 *
	 * @return the histories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<History> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the histories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.HistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of histories
	 * @param end the upper bound of the range of histories (not inclusive)
	 * @return the range of histories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<History> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the histories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.HistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of histories
	 * @param end the upper bound of the range of histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of histories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<History> findAll(int start, int end,
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

		List<History> list = (List<History>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_HISTORY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_HISTORY;

				if (pagination) {
					sql = sql.concat(HistoryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<History>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<History>(list);
				}
				else {
					list = (List<History>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the histories from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (History history : findAll()) {
			remove(history);
		}
	}

	/**
	 * Returns the number of histories.
	 *
	 * @return the number of histories
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

				Query q = session.createQuery(_SQL_COUNT_HISTORY);

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
	 * Initializes the history persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.fingence.slayer.model.History")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<History>> listenersList = new ArrayList<ModelListener<History>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<History>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(HistoryImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_HISTORY = "SELECT history FROM History history";
	private static final String _SQL_SELECT_HISTORY_WHERE = "SELECT history FROM History history WHERE ";
	private static final String _SQL_COUNT_HISTORY = "SELECT COUNT(history) FROM History history";
	private static final String _SQL_COUNT_HISTORY_WHERE = "SELECT COUNT(history) FROM History history WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "history.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No History exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No History exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(HistoryPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"type"
			});
	private static History _nullHistory = new HistoryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<History> toCacheModel() {
				return _nullHistoryCacheModel;
			}
		};

	private static CacheModel<History> _nullHistoryCacheModel = new CacheModel<History>() {
			@Override
			public History toEntityModel() {
				return _nullHistory;
			}
		};
}