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

import com.fingence.slayer.NoSuchPortfolioItemException;
import com.fingence.slayer.model.PortfolioItem;
import com.fingence.slayer.model.impl.PortfolioItemImpl;
import com.fingence.slayer.model.impl.PortfolioItemModelImpl;

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
 * The persistence implementation for the portfolio item service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ahmed Hasan
 * @see PortfolioItemPersistence
 * @see PortfolioItemUtil
 * @generated
 */
public class PortfolioItemPersistenceImpl extends BasePersistenceImpl<PortfolioItem>
	implements PortfolioItemPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PortfolioItemUtil} to access the portfolio item persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PortfolioItemImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PortfolioItemModelImpl.ENTITY_CACHE_ENABLED,
			PortfolioItemModelImpl.FINDER_CACHE_ENABLED,
			PortfolioItemImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PortfolioItemModelImpl.ENTITY_CACHE_ENABLED,
			PortfolioItemModelImpl.FINDER_CACHE_ENABLED,
			PortfolioItemImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PortfolioItemModelImpl.ENTITY_CACHE_ENABLED,
			PortfolioItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_ASSETID_PORTFOLIOID = new FinderPath(PortfolioItemModelImpl.ENTITY_CACHE_ENABLED,
			PortfolioItemModelImpl.FINDER_CACHE_ENABLED,
			PortfolioItemImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByAssetId_PortfolioId",
			new String[] { Long.class.getName(), Long.class.getName() },
			PortfolioItemModelImpl.ASSETID_COLUMN_BITMASK |
			PortfolioItemModelImpl.PORTFOLIOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ASSETID_PORTFOLIOID = new FinderPath(PortfolioItemModelImpl.ENTITY_CACHE_ENABLED,
			PortfolioItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByAssetId_PortfolioId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns the portfolio item where assetId = &#63; and portfolioId = &#63; or throws a {@link com.fingence.slayer.NoSuchPortfolioItemException} if it could not be found.
	 *
	 * @param assetId the asset ID
	 * @param portfolioId the portfolio ID
	 * @return the matching portfolio item
	 * @throws com.fingence.slayer.NoSuchPortfolioItemException if a matching portfolio item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PortfolioItem findByAssetId_PortfolioId(long assetId,
		long portfolioId) throws NoSuchPortfolioItemException, SystemException {
		PortfolioItem portfolioItem = fetchByAssetId_PortfolioId(assetId,
				portfolioId);

		if (portfolioItem == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("assetId=");
			msg.append(assetId);

			msg.append(", portfolioId=");
			msg.append(portfolioId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchPortfolioItemException(msg.toString());
		}

		return portfolioItem;
	}

	/**
	 * Returns the portfolio item where assetId = &#63; and portfolioId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param assetId the asset ID
	 * @param portfolioId the portfolio ID
	 * @return the matching portfolio item, or <code>null</code> if a matching portfolio item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PortfolioItem fetchByAssetId_PortfolioId(long assetId,
		long portfolioId) throws SystemException {
		return fetchByAssetId_PortfolioId(assetId, portfolioId, true);
	}

	/**
	 * Returns the portfolio item where assetId = &#63; and portfolioId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param assetId the asset ID
	 * @param portfolioId the portfolio ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching portfolio item, or <code>null</code> if a matching portfolio item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PortfolioItem fetchByAssetId_PortfolioId(long assetId,
		long portfolioId, boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { assetId, portfolioId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_ASSETID_PORTFOLIOID,
					finderArgs, this);
		}

		if (result instanceof PortfolioItem) {
			PortfolioItem portfolioItem = (PortfolioItem)result;

			if ((assetId != portfolioItem.getAssetId()) ||
					(portfolioId != portfolioItem.getPortfolioId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_PORTFOLIOITEM_WHERE);

			query.append(_FINDER_COLUMN_ASSETID_PORTFOLIOID_ASSETID_2);

			query.append(_FINDER_COLUMN_ASSETID_PORTFOLIOID_PORTFOLIOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(assetId);

				qPos.add(portfolioId);

				List<PortfolioItem> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ASSETID_PORTFOLIOID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"PortfolioItemPersistenceImpl.fetchByAssetId_PortfolioId(long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					PortfolioItem portfolioItem = list.get(0);

					result = portfolioItem;

					cacheResult(portfolioItem);

					if ((portfolioItem.getAssetId() != assetId) ||
							(portfolioItem.getPortfolioId() != portfolioId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ASSETID_PORTFOLIOID,
							finderArgs, portfolioItem);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ASSETID_PORTFOLIOID,
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
			return (PortfolioItem)result;
		}
	}

	/**
	 * Removes the portfolio item where assetId = &#63; and portfolioId = &#63; from the database.
	 *
	 * @param assetId the asset ID
	 * @param portfolioId the portfolio ID
	 * @return the portfolio item that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PortfolioItem removeByAssetId_PortfolioId(long assetId,
		long portfolioId) throws NoSuchPortfolioItemException, SystemException {
		PortfolioItem portfolioItem = findByAssetId_PortfolioId(assetId,
				portfolioId);

		return remove(portfolioItem);
	}

	/**
	 * Returns the number of portfolio items where assetId = &#63; and portfolioId = &#63;.
	 *
	 * @param assetId the asset ID
	 * @param portfolioId the portfolio ID
	 * @return the number of matching portfolio items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByAssetId_PortfolioId(long assetId, long portfolioId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ASSETID_PORTFOLIOID;

		Object[] finderArgs = new Object[] { assetId, portfolioId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PORTFOLIOITEM_WHERE);

			query.append(_FINDER_COLUMN_ASSETID_PORTFOLIOID_ASSETID_2);

			query.append(_FINDER_COLUMN_ASSETID_PORTFOLIOID_PORTFOLIOID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(assetId);

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

	private static final String _FINDER_COLUMN_ASSETID_PORTFOLIOID_ASSETID_2 = "portfolioItem.assetId = ? AND ";
	private static final String _FINDER_COLUMN_ASSETID_PORTFOLIOID_PORTFOLIOID_2 =
		"portfolioItem.portfolioId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PORTFOLIOID =
		new FinderPath(PortfolioItemModelImpl.ENTITY_CACHE_ENABLED,
			PortfolioItemModelImpl.FINDER_CACHE_ENABLED,
			PortfolioItemImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByPortfolioId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTFOLIOID =
		new FinderPath(PortfolioItemModelImpl.ENTITY_CACHE_ENABLED,
			PortfolioItemModelImpl.FINDER_CACHE_ENABLED,
			PortfolioItemImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByPortfolioId", new String[] { Long.class.getName() },
			PortfolioItemModelImpl.PORTFOLIOID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PORTFOLIOID = new FinderPath(PortfolioItemModelImpl.ENTITY_CACHE_ENABLED,
			PortfolioItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPortfolioId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the portfolio items where portfolioId = &#63;.
	 *
	 * @param portfolioId the portfolio ID
	 * @return the matching portfolio items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PortfolioItem> findByPortfolioId(long portfolioId)
		throws SystemException {
		return findByPortfolioId(portfolioId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the portfolio items where portfolioId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.PortfolioItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param portfolioId the portfolio ID
	 * @param start the lower bound of the range of portfolio items
	 * @param end the upper bound of the range of portfolio items (not inclusive)
	 * @return the range of matching portfolio items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PortfolioItem> findByPortfolioId(long portfolioId, int start,
		int end) throws SystemException {
		return findByPortfolioId(portfolioId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the portfolio items where portfolioId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.PortfolioItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param portfolioId the portfolio ID
	 * @param start the lower bound of the range of portfolio items
	 * @param end the upper bound of the range of portfolio items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching portfolio items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PortfolioItem> findByPortfolioId(long portfolioId, int start,
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

		List<PortfolioItem> list = (List<PortfolioItem>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (PortfolioItem portfolioItem : list) {
				if ((portfolioId != portfolioItem.getPortfolioId())) {
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

			query.append(_SQL_SELECT_PORTFOLIOITEM_WHERE);

			query.append(_FINDER_COLUMN_PORTFOLIOID_PORTFOLIOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PortfolioItemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(portfolioId);

				if (!pagination) {
					list = (List<PortfolioItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PortfolioItem>(list);
				}
				else {
					list = (List<PortfolioItem>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first portfolio item in the ordered set where portfolioId = &#63;.
	 *
	 * @param portfolioId the portfolio ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching portfolio item
	 * @throws com.fingence.slayer.NoSuchPortfolioItemException if a matching portfolio item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PortfolioItem findByPortfolioId_First(long portfolioId,
		OrderByComparator orderByComparator)
		throws NoSuchPortfolioItemException, SystemException {
		PortfolioItem portfolioItem = fetchByPortfolioId_First(portfolioId,
				orderByComparator);

		if (portfolioItem != null) {
			return portfolioItem;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("portfolioId=");
		msg.append(portfolioId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPortfolioItemException(msg.toString());
	}

	/**
	 * Returns the first portfolio item in the ordered set where portfolioId = &#63;.
	 *
	 * @param portfolioId the portfolio ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching portfolio item, or <code>null</code> if a matching portfolio item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PortfolioItem fetchByPortfolioId_First(long portfolioId,
		OrderByComparator orderByComparator) throws SystemException {
		List<PortfolioItem> list = findByPortfolioId(portfolioId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last portfolio item in the ordered set where portfolioId = &#63;.
	 *
	 * @param portfolioId the portfolio ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching portfolio item
	 * @throws com.fingence.slayer.NoSuchPortfolioItemException if a matching portfolio item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PortfolioItem findByPortfolioId_Last(long portfolioId,
		OrderByComparator orderByComparator)
		throws NoSuchPortfolioItemException, SystemException {
		PortfolioItem portfolioItem = fetchByPortfolioId_Last(portfolioId,
				orderByComparator);

		if (portfolioItem != null) {
			return portfolioItem;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("portfolioId=");
		msg.append(portfolioId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPortfolioItemException(msg.toString());
	}

	/**
	 * Returns the last portfolio item in the ordered set where portfolioId = &#63;.
	 *
	 * @param portfolioId the portfolio ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching portfolio item, or <code>null</code> if a matching portfolio item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PortfolioItem fetchByPortfolioId_Last(long portfolioId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByPortfolioId(portfolioId);

		if (count == 0) {
			return null;
		}

		List<PortfolioItem> list = findByPortfolioId(portfolioId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the portfolio items before and after the current portfolio item in the ordered set where portfolioId = &#63;.
	 *
	 * @param itemId the primary key of the current portfolio item
	 * @param portfolioId the portfolio ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next portfolio item
	 * @throws com.fingence.slayer.NoSuchPortfolioItemException if a portfolio item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PortfolioItem[] findByPortfolioId_PrevAndNext(long itemId,
		long portfolioId, OrderByComparator orderByComparator)
		throws NoSuchPortfolioItemException, SystemException {
		PortfolioItem portfolioItem = findByPrimaryKey(itemId);

		Session session = null;

		try {
			session = openSession();

			PortfolioItem[] array = new PortfolioItemImpl[3];

			array[0] = getByPortfolioId_PrevAndNext(session, portfolioItem,
					portfolioId, orderByComparator, true);

			array[1] = portfolioItem;

			array[2] = getByPortfolioId_PrevAndNext(session, portfolioItem,
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

	protected PortfolioItem getByPortfolioId_PrevAndNext(Session session,
		PortfolioItem portfolioItem, long portfolioId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PORTFOLIOITEM_WHERE);

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
			query.append(PortfolioItemModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(portfolioId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(portfolioItem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<PortfolioItem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the portfolio items where portfolioId = &#63; from the database.
	 *
	 * @param portfolioId the portfolio ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPortfolioId(long portfolioId) throws SystemException {
		for (PortfolioItem portfolioItem : findByPortfolioId(portfolioId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(portfolioItem);
		}
	}

	/**
	 * Returns the number of portfolio items where portfolioId = &#63;.
	 *
	 * @param portfolioId the portfolio ID
	 * @return the number of matching portfolio items
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

			query.append(_SQL_COUNT_PORTFOLIOITEM_WHERE);

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

	private static final String _FINDER_COLUMN_PORTFOLIOID_PORTFOLIOID_2 = "portfolioItem.portfolioId = ?";

	public PortfolioItemPersistenceImpl() {
		setModelClass(PortfolioItem.class);
	}

	/**
	 * Caches the portfolio item in the entity cache if it is enabled.
	 *
	 * @param portfolioItem the portfolio item
	 */
	@Override
	public void cacheResult(PortfolioItem portfolioItem) {
		EntityCacheUtil.putResult(PortfolioItemModelImpl.ENTITY_CACHE_ENABLED,
			PortfolioItemImpl.class, portfolioItem.getPrimaryKey(),
			portfolioItem);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ASSETID_PORTFOLIOID,
			new Object[] {
				portfolioItem.getAssetId(), portfolioItem.getPortfolioId()
			}, portfolioItem);

		portfolioItem.resetOriginalValues();
	}

	/**
	 * Caches the portfolio items in the entity cache if it is enabled.
	 *
	 * @param portfolioItems the portfolio items
	 */
	@Override
	public void cacheResult(List<PortfolioItem> portfolioItems) {
		for (PortfolioItem portfolioItem : portfolioItems) {
			if (EntityCacheUtil.getResult(
						PortfolioItemModelImpl.ENTITY_CACHE_ENABLED,
						PortfolioItemImpl.class, portfolioItem.getPrimaryKey()) == null) {
				cacheResult(portfolioItem);
			}
			else {
				portfolioItem.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all portfolio items.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PortfolioItemImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PortfolioItemImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the portfolio item.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PortfolioItem portfolioItem) {
		EntityCacheUtil.removeResult(PortfolioItemModelImpl.ENTITY_CACHE_ENABLED,
			PortfolioItemImpl.class, portfolioItem.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(portfolioItem);
	}

	@Override
	public void clearCache(List<PortfolioItem> portfolioItems) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PortfolioItem portfolioItem : portfolioItems) {
			EntityCacheUtil.removeResult(PortfolioItemModelImpl.ENTITY_CACHE_ENABLED,
				PortfolioItemImpl.class, portfolioItem.getPrimaryKey());

			clearUniqueFindersCache(portfolioItem);
		}
	}

	protected void cacheUniqueFindersCache(PortfolioItem portfolioItem) {
		if (portfolioItem.isNew()) {
			Object[] args = new Object[] {
					portfolioItem.getAssetId(), portfolioItem.getPortfolioId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ASSETID_PORTFOLIOID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ASSETID_PORTFOLIOID,
				args, portfolioItem);
		}
		else {
			PortfolioItemModelImpl portfolioItemModelImpl = (PortfolioItemModelImpl)portfolioItem;

			if ((portfolioItemModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_ASSETID_PORTFOLIOID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						portfolioItem.getAssetId(),
						portfolioItem.getPortfolioId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ASSETID_PORTFOLIOID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_ASSETID_PORTFOLIOID,
					args, portfolioItem);
			}
		}
	}

	protected void clearUniqueFindersCache(PortfolioItem portfolioItem) {
		PortfolioItemModelImpl portfolioItemModelImpl = (PortfolioItemModelImpl)portfolioItem;

		Object[] args = new Object[] {
				portfolioItem.getAssetId(), portfolioItem.getPortfolioId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSETID_PORTFOLIOID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ASSETID_PORTFOLIOID,
			args);

		if ((portfolioItemModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_ASSETID_PORTFOLIOID.getColumnBitmask()) != 0) {
			args = new Object[] {
					portfolioItemModelImpl.getOriginalAssetId(),
					portfolioItemModelImpl.getOriginalPortfolioId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSETID_PORTFOLIOID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_ASSETID_PORTFOLIOID,
				args);
		}
	}

	/**
	 * Creates a new portfolio item with the primary key. Does not add the portfolio item to the database.
	 *
	 * @param itemId the primary key for the new portfolio item
	 * @return the new portfolio item
	 */
	@Override
	public PortfolioItem create(long itemId) {
		PortfolioItem portfolioItem = new PortfolioItemImpl();

		portfolioItem.setNew(true);
		portfolioItem.setPrimaryKey(itemId);

		return portfolioItem;
	}

	/**
	 * Removes the portfolio item with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param itemId the primary key of the portfolio item
	 * @return the portfolio item that was removed
	 * @throws com.fingence.slayer.NoSuchPortfolioItemException if a portfolio item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PortfolioItem remove(long itemId)
		throws NoSuchPortfolioItemException, SystemException {
		return remove((Serializable)itemId);
	}

	/**
	 * Removes the portfolio item with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the portfolio item
	 * @return the portfolio item that was removed
	 * @throws com.fingence.slayer.NoSuchPortfolioItemException if a portfolio item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PortfolioItem remove(Serializable primaryKey)
		throws NoSuchPortfolioItemException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PortfolioItem portfolioItem = (PortfolioItem)session.get(PortfolioItemImpl.class,
					primaryKey);

			if (portfolioItem == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPortfolioItemException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(portfolioItem);
		}
		catch (NoSuchPortfolioItemException nsee) {
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
	protected PortfolioItem removeImpl(PortfolioItem portfolioItem)
		throws SystemException {
		portfolioItem = toUnwrappedModel(portfolioItem);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(portfolioItem)) {
				portfolioItem = (PortfolioItem)session.get(PortfolioItemImpl.class,
						portfolioItem.getPrimaryKeyObj());
			}

			if (portfolioItem != null) {
				session.delete(portfolioItem);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (portfolioItem != null) {
			clearCache(portfolioItem);
		}

		return portfolioItem;
	}

	@Override
	public PortfolioItem updateImpl(
		com.fingence.slayer.model.PortfolioItem portfolioItem)
		throws SystemException {
		portfolioItem = toUnwrappedModel(portfolioItem);

		boolean isNew = portfolioItem.isNew();

		PortfolioItemModelImpl portfolioItemModelImpl = (PortfolioItemModelImpl)portfolioItem;

		Session session = null;

		try {
			session = openSession();

			if (portfolioItem.isNew()) {
				session.save(portfolioItem);

				portfolioItem.setNew(false);
			}
			else {
				session.merge(portfolioItem);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !PortfolioItemModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((portfolioItemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTFOLIOID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						portfolioItemModelImpl.getOriginalPortfolioId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTFOLIOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTFOLIOID,
					args);

				args = new Object[] { portfolioItemModelImpl.getPortfolioId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PORTFOLIOID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PORTFOLIOID,
					args);
			}
		}

		EntityCacheUtil.putResult(PortfolioItemModelImpl.ENTITY_CACHE_ENABLED,
			PortfolioItemImpl.class, portfolioItem.getPrimaryKey(),
			portfolioItem);

		clearUniqueFindersCache(portfolioItem);
		cacheUniqueFindersCache(portfolioItem);

		return portfolioItem;
	}

	protected PortfolioItem toUnwrappedModel(PortfolioItem portfolioItem) {
		if (portfolioItem instanceof PortfolioItemImpl) {
			return portfolioItem;
		}

		PortfolioItemImpl portfolioItemImpl = new PortfolioItemImpl();

		portfolioItemImpl.setNew(portfolioItem.isNew());
		portfolioItemImpl.setPrimaryKey(portfolioItem.getPrimaryKey());

		portfolioItemImpl.setItemId(portfolioItem.getItemId());
		portfolioItemImpl.setAssetId(portfolioItem.getAssetId());
		portfolioItemImpl.setPortfolioId(portfolioItem.getPortfolioId());
		portfolioItemImpl.setPurchaseDate(portfolioItem.getPurchaseDate());
		portfolioItemImpl.setPurchasePrice(portfolioItem.getPurchasePrice());
		portfolioItemImpl.setPurchaseQty(portfolioItem.getPurchaseQty());
		portfolioItemImpl.setPurchasedFx(portfolioItem.getPurchasedFx());
		portfolioItemImpl.setCreateDate(portfolioItem.getCreateDate());
		portfolioItemImpl.setModifiedDate(portfolioItem.getModifiedDate());

		return portfolioItemImpl;
	}

	/**
	 * Returns the portfolio item with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the portfolio item
	 * @return the portfolio item
	 * @throws com.fingence.slayer.NoSuchPortfolioItemException if a portfolio item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PortfolioItem findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPortfolioItemException, SystemException {
		PortfolioItem portfolioItem = fetchByPrimaryKey(primaryKey);

		if (portfolioItem == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPortfolioItemException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return portfolioItem;
	}

	/**
	 * Returns the portfolio item with the primary key or throws a {@link com.fingence.slayer.NoSuchPortfolioItemException} if it could not be found.
	 *
	 * @param itemId the primary key of the portfolio item
	 * @return the portfolio item
	 * @throws com.fingence.slayer.NoSuchPortfolioItemException if a portfolio item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PortfolioItem findByPrimaryKey(long itemId)
		throws NoSuchPortfolioItemException, SystemException {
		return findByPrimaryKey((Serializable)itemId);
	}

	/**
	 * Returns the portfolio item with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the portfolio item
	 * @return the portfolio item, or <code>null</code> if a portfolio item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PortfolioItem fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PortfolioItem portfolioItem = (PortfolioItem)EntityCacheUtil.getResult(PortfolioItemModelImpl.ENTITY_CACHE_ENABLED,
				PortfolioItemImpl.class, primaryKey);

		if (portfolioItem == _nullPortfolioItem) {
			return null;
		}

		if (portfolioItem == null) {
			Session session = null;

			try {
				session = openSession();

				portfolioItem = (PortfolioItem)session.get(PortfolioItemImpl.class,
						primaryKey);

				if (portfolioItem != null) {
					cacheResult(portfolioItem);
				}
				else {
					EntityCacheUtil.putResult(PortfolioItemModelImpl.ENTITY_CACHE_ENABLED,
						PortfolioItemImpl.class, primaryKey, _nullPortfolioItem);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PortfolioItemModelImpl.ENTITY_CACHE_ENABLED,
					PortfolioItemImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return portfolioItem;
	}

	/**
	 * Returns the portfolio item with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param itemId the primary key of the portfolio item
	 * @return the portfolio item, or <code>null</code> if a portfolio item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PortfolioItem fetchByPrimaryKey(long itemId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)itemId);
	}

	/**
	 * Returns all the portfolio items.
	 *
	 * @return the portfolio items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PortfolioItem> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the portfolio items.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.PortfolioItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of portfolio items
	 * @param end the upper bound of the range of portfolio items (not inclusive)
	 * @return the range of portfolio items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PortfolioItem> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the portfolio items.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.PortfolioItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of portfolio items
	 * @param end the upper bound of the range of portfolio items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of portfolio items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PortfolioItem> findAll(int start, int end,
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

		List<PortfolioItem> list = (List<PortfolioItem>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PORTFOLIOITEM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PORTFOLIOITEM;

				if (pagination) {
					sql = sql.concat(PortfolioItemModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PortfolioItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PortfolioItem>(list);
				}
				else {
					list = (List<PortfolioItem>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the portfolio items from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PortfolioItem portfolioItem : findAll()) {
			remove(portfolioItem);
		}
	}

	/**
	 * Returns the number of portfolio items.
	 *
	 * @return the number of portfolio items
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

				Query q = session.createQuery(_SQL_COUNT_PORTFOLIOITEM);

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
	 * Initializes the portfolio item persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.fingence.slayer.model.PortfolioItem")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PortfolioItem>> listenersList = new ArrayList<ModelListener<PortfolioItem>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PortfolioItem>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PortfolioItemImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PORTFOLIOITEM = "SELECT portfolioItem FROM PortfolioItem portfolioItem";
	private static final String _SQL_SELECT_PORTFOLIOITEM_WHERE = "SELECT portfolioItem FROM PortfolioItem portfolioItem WHERE ";
	private static final String _SQL_COUNT_PORTFOLIOITEM = "SELECT COUNT(portfolioItem) FROM PortfolioItem portfolioItem";
	private static final String _SQL_COUNT_PORTFOLIOITEM_WHERE = "SELECT COUNT(portfolioItem) FROM PortfolioItem portfolioItem WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "portfolioItem.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PortfolioItem exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PortfolioItem exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PortfolioItemPersistenceImpl.class);
	private static PortfolioItem _nullPortfolioItem = new PortfolioItemImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PortfolioItem> toCacheModel() {
				return _nullPortfolioItemCacheModel;
			}
		};

	private static CacheModel<PortfolioItem> _nullPortfolioItemCacheModel = new CacheModel<PortfolioItem>() {
			@Override
			public PortfolioItem toEntityModel() {
				return _nullPortfolioItem;
			}
		};
}