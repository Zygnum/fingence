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

import com.fingence.slayer.NoSuchPortfolioException;
import com.fingence.slayer.model.Portfolio;
import com.fingence.slayer.model.impl.PortfolioImpl;
import com.fingence.slayer.model.impl.PortfolioModelImpl;

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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the portfolio service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ahmed Hasan
 * @see PortfolioPersistence
 * @see PortfolioUtil
 * @generated
 */
public class PortfolioPersistenceImpl extends BasePersistenceImpl<Portfolio>
	implements PortfolioPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PortfolioUtil} to access the portfolio persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PortfolioImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PortfolioModelImpl.ENTITY_CACHE_ENABLED,
			PortfolioModelImpl.FINDER_CACHE_ENABLED, PortfolioImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PortfolioModelImpl.ENTITY_CACHE_ENABLED,
			PortfolioModelImpl.FINDER_CACHE_ENABLED, PortfolioImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PortfolioModelImpl.ENTITY_CACHE_ENABLED,
			PortfolioModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INVESTORID =
		new FinderPath(PortfolioModelImpl.ENTITY_CACHE_ENABLED,
			PortfolioModelImpl.FINDER_CACHE_ENABLED, PortfolioImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByInvestorId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INVESTORID =
		new FinderPath(PortfolioModelImpl.ENTITY_CACHE_ENABLED,
			PortfolioModelImpl.FINDER_CACHE_ENABLED, PortfolioImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByInvestorId",
			new String[] { Long.class.getName() },
			PortfolioModelImpl.INVESTORID_COLUMN_BITMASK |
			PortfolioModelImpl.PRIMARY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INVESTORID = new FinderPath(PortfolioModelImpl.ENTITY_CACHE_ENABLED,
			PortfolioModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByInvestorId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the portfolios where investorId = &#63;.
	 *
	 * @param investorId the investor ID
	 * @return the matching portfolios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Portfolio> findByInvestorId(long investorId)
		throws SystemException {
		return findByInvestorId(investorId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the portfolios where investorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.PortfolioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param investorId the investor ID
	 * @param start the lower bound of the range of portfolios
	 * @param end the upper bound of the range of portfolios (not inclusive)
	 * @return the range of matching portfolios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Portfolio> findByInvestorId(long investorId, int start, int end)
		throws SystemException {
		return findByInvestorId(investorId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the portfolios where investorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.PortfolioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param investorId the investor ID
	 * @param start the lower bound of the range of portfolios
	 * @param end the upper bound of the range of portfolios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching portfolios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Portfolio> findByInvestorId(long investorId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INVESTORID;
			finderArgs = new Object[] { investorId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INVESTORID;
			finderArgs = new Object[] { investorId, start, end, orderByComparator };
		}

		List<Portfolio> list = (List<Portfolio>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Portfolio portfolio : list) {
				if ((investorId != portfolio.getInvestorId())) {
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

			query.append(_SQL_SELECT_PORTFOLIO_WHERE);

			query.append(_FINDER_COLUMN_INVESTORID_INVESTORID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PortfolioModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(investorId);

				if (!pagination) {
					list = (List<Portfolio>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Portfolio>(list);
				}
				else {
					list = (List<Portfolio>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first portfolio in the ordered set where investorId = &#63;.
	 *
	 * @param investorId the investor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching portfolio
	 * @throws com.fingence.slayer.NoSuchPortfolioException if a matching portfolio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Portfolio findByInvestorId_First(long investorId,
		OrderByComparator orderByComparator)
		throws NoSuchPortfolioException, SystemException {
		Portfolio portfolio = fetchByInvestorId_First(investorId,
				orderByComparator);

		if (portfolio != null) {
			return portfolio;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("investorId=");
		msg.append(investorId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPortfolioException(msg.toString());
	}

	/**
	 * Returns the first portfolio in the ordered set where investorId = &#63;.
	 *
	 * @param investorId the investor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching portfolio, or <code>null</code> if a matching portfolio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Portfolio fetchByInvestorId_First(long investorId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Portfolio> list = findByInvestorId(investorId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last portfolio in the ordered set where investorId = &#63;.
	 *
	 * @param investorId the investor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching portfolio
	 * @throws com.fingence.slayer.NoSuchPortfolioException if a matching portfolio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Portfolio findByInvestorId_Last(long investorId,
		OrderByComparator orderByComparator)
		throws NoSuchPortfolioException, SystemException {
		Portfolio portfolio = fetchByInvestorId_Last(investorId,
				orderByComparator);

		if (portfolio != null) {
			return portfolio;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("investorId=");
		msg.append(investorId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPortfolioException(msg.toString());
	}

	/**
	 * Returns the last portfolio in the ordered set where investorId = &#63;.
	 *
	 * @param investorId the investor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching portfolio, or <code>null</code> if a matching portfolio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Portfolio fetchByInvestorId_Last(long investorId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByInvestorId(investorId);

		if (count == 0) {
			return null;
		}

		List<Portfolio> list = findByInvestorId(investorId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the portfolios before and after the current portfolio in the ordered set where investorId = &#63;.
	 *
	 * @param portfolioId the primary key of the current portfolio
	 * @param investorId the investor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next portfolio
	 * @throws com.fingence.slayer.NoSuchPortfolioException if a portfolio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Portfolio[] findByInvestorId_PrevAndNext(long portfolioId,
		long investorId, OrderByComparator orderByComparator)
		throws NoSuchPortfolioException, SystemException {
		Portfolio portfolio = findByPrimaryKey(portfolioId);

		Session session = null;

		try {
			session = openSession();

			Portfolio[] array = new PortfolioImpl[3];

			array[0] = getByInvestorId_PrevAndNext(session, portfolio,
					investorId, orderByComparator, true);

			array[1] = portfolio;

			array[2] = getByInvestorId_PrevAndNext(session, portfolio,
					investorId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Portfolio getByInvestorId_PrevAndNext(Session session,
		Portfolio portfolio, long investorId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PORTFOLIO_WHERE);

		query.append(_FINDER_COLUMN_INVESTORID_INVESTORID_2);

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
			query.append(PortfolioModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(investorId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(portfolio);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Portfolio> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the portfolios where investorId = &#63; from the database.
	 *
	 * @param investorId the investor ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByInvestorId(long investorId) throws SystemException {
		for (Portfolio portfolio : findByInvestorId(investorId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(portfolio);
		}
	}

	/**
	 * Returns the number of portfolios where investorId = &#63;.
	 *
	 * @param investorId the investor ID
	 * @return the number of matching portfolios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByInvestorId(long investorId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INVESTORID;

		Object[] finderArgs = new Object[] { investorId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PORTFOLIO_WHERE);

			query.append(_FINDER_COLUMN_INVESTORID_INVESTORID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(investorId);

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

	private static final String _FINDER_COLUMN_INVESTORID_INVESTORID_2 = "portfolio.investorId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_WEALTHADVISORID =
		new FinderPath(PortfolioModelImpl.ENTITY_CACHE_ENABLED,
			PortfolioModelImpl.FINDER_CACHE_ENABLED, PortfolioImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByWealthAdvisorId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WEALTHADVISORID =
		new FinderPath(PortfolioModelImpl.ENTITY_CACHE_ENABLED,
			PortfolioModelImpl.FINDER_CACHE_ENABLED, PortfolioImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByWealthAdvisorId",
			new String[] { Long.class.getName() },
			PortfolioModelImpl.WEALTHADVISORID_COLUMN_BITMASK |
			PortfolioModelImpl.PRIMARY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_WEALTHADVISORID = new FinderPath(PortfolioModelImpl.ENTITY_CACHE_ENABLED,
			PortfolioModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByWealthAdvisorId", new String[] { Long.class.getName() });

	/**
	 * Returns all the portfolios where wealthAdvisorId = &#63;.
	 *
	 * @param wealthAdvisorId the wealth advisor ID
	 * @return the matching portfolios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Portfolio> findByWealthAdvisorId(long wealthAdvisorId)
		throws SystemException {
		return findByWealthAdvisorId(wealthAdvisorId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the portfolios where wealthAdvisorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.PortfolioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param wealthAdvisorId the wealth advisor ID
	 * @param start the lower bound of the range of portfolios
	 * @param end the upper bound of the range of portfolios (not inclusive)
	 * @return the range of matching portfolios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Portfolio> findByWealthAdvisorId(long wealthAdvisorId,
		int start, int end) throws SystemException {
		return findByWealthAdvisorId(wealthAdvisorId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the portfolios where wealthAdvisorId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.PortfolioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param wealthAdvisorId the wealth advisor ID
	 * @param start the lower bound of the range of portfolios
	 * @param end the upper bound of the range of portfolios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching portfolios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Portfolio> findByWealthAdvisorId(long wealthAdvisorId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WEALTHADVISORID;
			finderArgs = new Object[] { wealthAdvisorId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_WEALTHADVISORID;
			finderArgs = new Object[] {
					wealthAdvisorId,
					
					start, end, orderByComparator
				};
		}

		List<Portfolio> list = (List<Portfolio>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Portfolio portfolio : list) {
				if ((wealthAdvisorId != portfolio.getWealthAdvisorId())) {
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

			query.append(_SQL_SELECT_PORTFOLIO_WHERE);

			query.append(_FINDER_COLUMN_WEALTHADVISORID_WEALTHADVISORID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PortfolioModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(wealthAdvisorId);

				if (!pagination) {
					list = (List<Portfolio>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Portfolio>(list);
				}
				else {
					list = (List<Portfolio>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first portfolio in the ordered set where wealthAdvisorId = &#63;.
	 *
	 * @param wealthAdvisorId the wealth advisor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching portfolio
	 * @throws com.fingence.slayer.NoSuchPortfolioException if a matching portfolio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Portfolio findByWealthAdvisorId_First(long wealthAdvisorId,
		OrderByComparator orderByComparator)
		throws NoSuchPortfolioException, SystemException {
		Portfolio portfolio = fetchByWealthAdvisorId_First(wealthAdvisorId,
				orderByComparator);

		if (portfolio != null) {
			return portfolio;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("wealthAdvisorId=");
		msg.append(wealthAdvisorId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPortfolioException(msg.toString());
	}

	/**
	 * Returns the first portfolio in the ordered set where wealthAdvisorId = &#63;.
	 *
	 * @param wealthAdvisorId the wealth advisor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching portfolio, or <code>null</code> if a matching portfolio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Portfolio fetchByWealthAdvisorId_First(long wealthAdvisorId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Portfolio> list = findByWealthAdvisorId(wealthAdvisorId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last portfolio in the ordered set where wealthAdvisorId = &#63;.
	 *
	 * @param wealthAdvisorId the wealth advisor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching portfolio
	 * @throws com.fingence.slayer.NoSuchPortfolioException if a matching portfolio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Portfolio findByWealthAdvisorId_Last(long wealthAdvisorId,
		OrderByComparator orderByComparator)
		throws NoSuchPortfolioException, SystemException {
		Portfolio portfolio = fetchByWealthAdvisorId_Last(wealthAdvisorId,
				orderByComparator);

		if (portfolio != null) {
			return portfolio;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("wealthAdvisorId=");
		msg.append(wealthAdvisorId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPortfolioException(msg.toString());
	}

	/**
	 * Returns the last portfolio in the ordered set where wealthAdvisorId = &#63;.
	 *
	 * @param wealthAdvisorId the wealth advisor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching portfolio, or <code>null</code> if a matching portfolio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Portfolio fetchByWealthAdvisorId_Last(long wealthAdvisorId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByWealthAdvisorId(wealthAdvisorId);

		if (count == 0) {
			return null;
		}

		List<Portfolio> list = findByWealthAdvisorId(wealthAdvisorId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the portfolios before and after the current portfolio in the ordered set where wealthAdvisorId = &#63;.
	 *
	 * @param portfolioId the primary key of the current portfolio
	 * @param wealthAdvisorId the wealth advisor ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next portfolio
	 * @throws com.fingence.slayer.NoSuchPortfolioException if a portfolio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Portfolio[] findByWealthAdvisorId_PrevAndNext(long portfolioId,
		long wealthAdvisorId, OrderByComparator orderByComparator)
		throws NoSuchPortfolioException, SystemException {
		Portfolio portfolio = findByPrimaryKey(portfolioId);

		Session session = null;

		try {
			session = openSession();

			Portfolio[] array = new PortfolioImpl[3];

			array[0] = getByWealthAdvisorId_PrevAndNext(session, portfolio,
					wealthAdvisorId, orderByComparator, true);

			array[1] = portfolio;

			array[2] = getByWealthAdvisorId_PrevAndNext(session, portfolio,
					wealthAdvisorId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Portfolio getByWealthAdvisorId_PrevAndNext(Session session,
		Portfolio portfolio, long wealthAdvisorId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PORTFOLIO_WHERE);

		query.append(_FINDER_COLUMN_WEALTHADVISORID_WEALTHADVISORID_2);

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
			query.append(PortfolioModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(wealthAdvisorId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(portfolio);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Portfolio> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the portfolios where wealthAdvisorId = &#63; from the database.
	 *
	 * @param wealthAdvisorId the wealth advisor ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByWealthAdvisorId(long wealthAdvisorId)
		throws SystemException {
		for (Portfolio portfolio : findByWealthAdvisorId(wealthAdvisorId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(portfolio);
		}
	}

	/**
	 * Returns the number of portfolios where wealthAdvisorId = &#63;.
	 *
	 * @param wealthAdvisorId the wealth advisor ID
	 * @return the number of matching portfolios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByWealthAdvisorId(long wealthAdvisorId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_WEALTHADVISORID;

		Object[] finderArgs = new Object[] { wealthAdvisorId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PORTFOLIO_WHERE);

			query.append(_FINDER_COLUMN_WEALTHADVISORID_WEALTHADVISORID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(wealthAdvisorId);

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

	private static final String _FINDER_COLUMN_WEALTHADVISORID_WEALTHADVISORID_2 =
		"portfolio.wealthAdvisorId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_RELATIONSHIPMANAGERID =
		new FinderPath(PortfolioModelImpl.ENTITY_CACHE_ENABLED,
			PortfolioModelImpl.FINDER_CACHE_ENABLED, PortfolioImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByRelationshipManagerId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RELATIONSHIPMANAGERID =
		new FinderPath(PortfolioModelImpl.ENTITY_CACHE_ENABLED,
			PortfolioModelImpl.FINDER_CACHE_ENABLED, PortfolioImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByRelationshipManagerId",
			new String[] { Long.class.getName() },
			PortfolioModelImpl.RELATIONSHIPMANAGERID_COLUMN_BITMASK |
			PortfolioModelImpl.PRIMARY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_RELATIONSHIPMANAGERID = new FinderPath(PortfolioModelImpl.ENTITY_CACHE_ENABLED,
			PortfolioModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByRelationshipManagerId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the portfolios where relationshipManagerId = &#63;.
	 *
	 * @param relationshipManagerId the relationship manager ID
	 * @return the matching portfolios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Portfolio> findByRelationshipManagerId(
		long relationshipManagerId) throws SystemException {
		return findByRelationshipManagerId(relationshipManagerId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the portfolios where relationshipManagerId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.PortfolioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param relationshipManagerId the relationship manager ID
	 * @param start the lower bound of the range of portfolios
	 * @param end the upper bound of the range of portfolios (not inclusive)
	 * @return the range of matching portfolios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Portfolio> findByRelationshipManagerId(
		long relationshipManagerId, int start, int end)
		throws SystemException {
		return findByRelationshipManagerId(relationshipManagerId, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the portfolios where relationshipManagerId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.PortfolioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param relationshipManagerId the relationship manager ID
	 * @param start the lower bound of the range of portfolios
	 * @param end the upper bound of the range of portfolios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching portfolios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Portfolio> findByRelationshipManagerId(
		long relationshipManagerId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RELATIONSHIPMANAGERID;
			finderArgs = new Object[] { relationshipManagerId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_RELATIONSHIPMANAGERID;
			finderArgs = new Object[] {
					relationshipManagerId,
					
					start, end, orderByComparator
				};
		}

		List<Portfolio> list = (List<Portfolio>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Portfolio portfolio : list) {
				if ((relationshipManagerId != portfolio.getRelationshipManagerId())) {
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

			query.append(_SQL_SELECT_PORTFOLIO_WHERE);

			query.append(_FINDER_COLUMN_RELATIONSHIPMANAGERID_RELATIONSHIPMANAGERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PortfolioModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(relationshipManagerId);

				if (!pagination) {
					list = (List<Portfolio>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Portfolio>(list);
				}
				else {
					list = (List<Portfolio>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first portfolio in the ordered set where relationshipManagerId = &#63;.
	 *
	 * @param relationshipManagerId the relationship manager ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching portfolio
	 * @throws com.fingence.slayer.NoSuchPortfolioException if a matching portfolio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Portfolio findByRelationshipManagerId_First(
		long relationshipManagerId, OrderByComparator orderByComparator)
		throws NoSuchPortfolioException, SystemException {
		Portfolio portfolio = fetchByRelationshipManagerId_First(relationshipManagerId,
				orderByComparator);

		if (portfolio != null) {
			return portfolio;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("relationshipManagerId=");
		msg.append(relationshipManagerId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPortfolioException(msg.toString());
	}

	/**
	 * Returns the first portfolio in the ordered set where relationshipManagerId = &#63;.
	 *
	 * @param relationshipManagerId the relationship manager ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching portfolio, or <code>null</code> if a matching portfolio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Portfolio fetchByRelationshipManagerId_First(
		long relationshipManagerId, OrderByComparator orderByComparator)
		throws SystemException {
		List<Portfolio> list = findByRelationshipManagerId(relationshipManagerId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last portfolio in the ordered set where relationshipManagerId = &#63;.
	 *
	 * @param relationshipManagerId the relationship manager ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching portfolio
	 * @throws com.fingence.slayer.NoSuchPortfolioException if a matching portfolio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Portfolio findByRelationshipManagerId_Last(
		long relationshipManagerId, OrderByComparator orderByComparator)
		throws NoSuchPortfolioException, SystemException {
		Portfolio portfolio = fetchByRelationshipManagerId_Last(relationshipManagerId,
				orderByComparator);

		if (portfolio != null) {
			return portfolio;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("relationshipManagerId=");
		msg.append(relationshipManagerId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPortfolioException(msg.toString());
	}

	/**
	 * Returns the last portfolio in the ordered set where relationshipManagerId = &#63;.
	 *
	 * @param relationshipManagerId the relationship manager ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching portfolio, or <code>null</code> if a matching portfolio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Portfolio fetchByRelationshipManagerId_Last(
		long relationshipManagerId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByRelationshipManagerId(relationshipManagerId);

		if (count == 0) {
			return null;
		}

		List<Portfolio> list = findByRelationshipManagerId(relationshipManagerId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the portfolios before and after the current portfolio in the ordered set where relationshipManagerId = &#63;.
	 *
	 * @param portfolioId the primary key of the current portfolio
	 * @param relationshipManagerId the relationship manager ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next portfolio
	 * @throws com.fingence.slayer.NoSuchPortfolioException if a portfolio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Portfolio[] findByRelationshipManagerId_PrevAndNext(
		long portfolioId, long relationshipManagerId,
		OrderByComparator orderByComparator)
		throws NoSuchPortfolioException, SystemException {
		Portfolio portfolio = findByPrimaryKey(portfolioId);

		Session session = null;

		try {
			session = openSession();

			Portfolio[] array = new PortfolioImpl[3];

			array[0] = getByRelationshipManagerId_PrevAndNext(session,
					portfolio, relationshipManagerId, orderByComparator, true);

			array[1] = portfolio;

			array[2] = getByRelationshipManagerId_PrevAndNext(session,
					portfolio, relationshipManagerId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Portfolio getByRelationshipManagerId_PrevAndNext(
		Session session, Portfolio portfolio, long relationshipManagerId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PORTFOLIO_WHERE);

		query.append(_FINDER_COLUMN_RELATIONSHIPMANAGERID_RELATIONSHIPMANAGERID_2);

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
			query.append(PortfolioModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(relationshipManagerId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(portfolio);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Portfolio> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the portfolios where relationshipManagerId = &#63; from the database.
	 *
	 * @param relationshipManagerId the relationship manager ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRelationshipManagerId(long relationshipManagerId)
		throws SystemException {
		for (Portfolio portfolio : findByRelationshipManagerId(
				relationshipManagerId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(portfolio);
		}
	}

	/**
	 * Returns the number of portfolios where relationshipManagerId = &#63;.
	 *
	 * @param relationshipManagerId the relationship manager ID
	 * @return the number of matching portfolios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByRelationshipManagerId(long relationshipManagerId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_RELATIONSHIPMANAGERID;

		Object[] finderArgs = new Object[] { relationshipManagerId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PORTFOLIO_WHERE);

			query.append(_FINDER_COLUMN_RELATIONSHIPMANAGERID_RELATIONSHIPMANAGERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(relationshipManagerId);

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

	private static final String _FINDER_COLUMN_RELATIONSHIPMANAGERID_RELATIONSHIPMANAGERID_2 =
		"portfolio.relationshipManagerId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INSTITUTIONID =
		new FinderPath(PortfolioModelImpl.ENTITY_CACHE_ENABLED,
			PortfolioModelImpl.FINDER_CACHE_ENABLED, PortfolioImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByInstitutionId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSTITUTIONID =
		new FinderPath(PortfolioModelImpl.ENTITY_CACHE_ENABLED,
			PortfolioModelImpl.FINDER_CACHE_ENABLED, PortfolioImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByInstitutionId",
			new String[] { Long.class.getName() },
			PortfolioModelImpl.INSTITUTIONID_COLUMN_BITMASK |
			PortfolioModelImpl.PRIMARY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INSTITUTIONID = new FinderPath(PortfolioModelImpl.ENTITY_CACHE_ENABLED,
			PortfolioModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByInstitutionId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the portfolios where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @return the matching portfolios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Portfolio> findByInstitutionId(long institutionId)
		throws SystemException {
		return findByInstitutionId(institutionId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the portfolios where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.PortfolioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of portfolios
	 * @param end the upper bound of the range of portfolios (not inclusive)
	 * @return the range of matching portfolios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Portfolio> findByInstitutionId(long institutionId, int start,
		int end) throws SystemException {
		return findByInstitutionId(institutionId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the portfolios where institutionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.PortfolioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param institutionId the institution ID
	 * @param start the lower bound of the range of portfolios
	 * @param end the upper bound of the range of portfolios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching portfolios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Portfolio> findByInstitutionId(long institutionId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSTITUTIONID;
			finderArgs = new Object[] { institutionId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INSTITUTIONID;
			finderArgs = new Object[] {
					institutionId,
					
					start, end, orderByComparator
				};
		}

		List<Portfolio> list = (List<Portfolio>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Portfolio portfolio : list) {
				if ((institutionId != portfolio.getInstitutionId())) {
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

			query.append(_SQL_SELECT_PORTFOLIO_WHERE);

			query.append(_FINDER_COLUMN_INSTITUTIONID_INSTITUTIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PortfolioModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(institutionId);

				if (!pagination) {
					list = (List<Portfolio>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Portfolio>(list);
				}
				else {
					list = (List<Portfolio>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first portfolio in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching portfolio
	 * @throws com.fingence.slayer.NoSuchPortfolioException if a matching portfolio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Portfolio findByInstitutionId_First(long institutionId,
		OrderByComparator orderByComparator)
		throws NoSuchPortfolioException, SystemException {
		Portfolio portfolio = fetchByInstitutionId_First(institutionId,
				orderByComparator);

		if (portfolio != null) {
			return portfolio;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("institutionId=");
		msg.append(institutionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPortfolioException(msg.toString());
	}

	/**
	 * Returns the first portfolio in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching portfolio, or <code>null</code> if a matching portfolio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Portfolio fetchByInstitutionId_First(long institutionId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Portfolio> list = findByInstitutionId(institutionId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last portfolio in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching portfolio
	 * @throws com.fingence.slayer.NoSuchPortfolioException if a matching portfolio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Portfolio findByInstitutionId_Last(long institutionId,
		OrderByComparator orderByComparator)
		throws NoSuchPortfolioException, SystemException {
		Portfolio portfolio = fetchByInstitutionId_Last(institutionId,
				orderByComparator);

		if (portfolio != null) {
			return portfolio;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("institutionId=");
		msg.append(institutionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPortfolioException(msg.toString());
	}

	/**
	 * Returns the last portfolio in the ordered set where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching portfolio, or <code>null</code> if a matching portfolio could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Portfolio fetchByInstitutionId_Last(long institutionId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByInstitutionId(institutionId);

		if (count == 0) {
			return null;
		}

		List<Portfolio> list = findByInstitutionId(institutionId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the portfolios before and after the current portfolio in the ordered set where institutionId = &#63;.
	 *
	 * @param portfolioId the primary key of the current portfolio
	 * @param institutionId the institution ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next portfolio
	 * @throws com.fingence.slayer.NoSuchPortfolioException if a portfolio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Portfolio[] findByInstitutionId_PrevAndNext(long portfolioId,
		long institutionId, OrderByComparator orderByComparator)
		throws NoSuchPortfolioException, SystemException {
		Portfolio portfolio = findByPrimaryKey(portfolioId);

		Session session = null;

		try {
			session = openSession();

			Portfolio[] array = new PortfolioImpl[3];

			array[0] = getByInstitutionId_PrevAndNext(session, portfolio,
					institutionId, orderByComparator, true);

			array[1] = portfolio;

			array[2] = getByInstitutionId_PrevAndNext(session, portfolio,
					institutionId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Portfolio getByInstitutionId_PrevAndNext(Session session,
		Portfolio portfolio, long institutionId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PORTFOLIO_WHERE);

		query.append(_FINDER_COLUMN_INSTITUTIONID_INSTITUTIONID_2);

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
			query.append(PortfolioModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(institutionId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(portfolio);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Portfolio> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the portfolios where institutionId = &#63; from the database.
	 *
	 * @param institutionId the institution ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByInstitutionId(long institutionId)
		throws SystemException {
		for (Portfolio portfolio : findByInstitutionId(institutionId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(portfolio);
		}
	}

	/**
	 * Returns the number of portfolios where institutionId = &#63;.
	 *
	 * @param institutionId the institution ID
	 * @return the number of matching portfolios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByInstitutionId(long institutionId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INSTITUTIONID;

		Object[] finderArgs = new Object[] { institutionId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PORTFOLIO_WHERE);

			query.append(_FINDER_COLUMN_INSTITUTIONID_INSTITUTIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(institutionId);

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

	private static final String _FINDER_COLUMN_INSTITUTIONID_INSTITUTIONID_2 = "portfolio.institutionId = ?";

	public PortfolioPersistenceImpl() {
		setModelClass(Portfolio.class);
	}

	/**
	 * Caches the portfolio in the entity cache if it is enabled.
	 *
	 * @param portfolio the portfolio
	 */
	@Override
	public void cacheResult(Portfolio portfolio) {
		EntityCacheUtil.putResult(PortfolioModelImpl.ENTITY_CACHE_ENABLED,
			PortfolioImpl.class, portfolio.getPrimaryKey(), portfolio);

		portfolio.resetOriginalValues();
	}

	/**
	 * Caches the portfolios in the entity cache if it is enabled.
	 *
	 * @param portfolios the portfolios
	 */
	@Override
	public void cacheResult(List<Portfolio> portfolios) {
		for (Portfolio portfolio : portfolios) {
			if (EntityCacheUtil.getResult(
						PortfolioModelImpl.ENTITY_CACHE_ENABLED,
						PortfolioImpl.class, portfolio.getPrimaryKey()) == null) {
				cacheResult(portfolio);
			}
			else {
				portfolio.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all portfolios.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PortfolioImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PortfolioImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the portfolio.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Portfolio portfolio) {
		EntityCacheUtil.removeResult(PortfolioModelImpl.ENTITY_CACHE_ENABLED,
			PortfolioImpl.class, portfolio.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Portfolio> portfolios) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Portfolio portfolio : portfolios) {
			EntityCacheUtil.removeResult(PortfolioModelImpl.ENTITY_CACHE_ENABLED,
				PortfolioImpl.class, portfolio.getPrimaryKey());
		}
	}

	/**
	 * Creates a new portfolio with the primary key. Does not add the portfolio to the database.
	 *
	 * @param portfolioId the primary key for the new portfolio
	 * @return the new portfolio
	 */
	@Override
	public Portfolio create(long portfolioId) {
		Portfolio portfolio = new PortfolioImpl();

		portfolio.setNew(true);
		portfolio.setPrimaryKey(portfolioId);

		return portfolio;
	}

	/**
	 * Removes the portfolio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param portfolioId the primary key of the portfolio
	 * @return the portfolio that was removed
	 * @throws com.fingence.slayer.NoSuchPortfolioException if a portfolio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Portfolio remove(long portfolioId)
		throws NoSuchPortfolioException, SystemException {
		return remove((Serializable)portfolioId);
	}

	/**
	 * Removes the portfolio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the portfolio
	 * @return the portfolio that was removed
	 * @throws com.fingence.slayer.NoSuchPortfolioException if a portfolio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Portfolio remove(Serializable primaryKey)
		throws NoSuchPortfolioException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Portfolio portfolio = (Portfolio)session.get(PortfolioImpl.class,
					primaryKey);

			if (portfolio == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPortfolioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(portfolio);
		}
		catch (NoSuchPortfolioException nsee) {
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
	protected Portfolio removeImpl(Portfolio portfolio)
		throws SystemException {
		portfolio = toUnwrappedModel(portfolio);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(portfolio)) {
				portfolio = (Portfolio)session.get(PortfolioImpl.class,
						portfolio.getPrimaryKeyObj());
			}

			if (portfolio != null) {
				session.delete(portfolio);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (portfolio != null) {
			clearCache(portfolio);
		}

		return portfolio;
	}

	@Override
	public Portfolio updateImpl(com.fingence.slayer.model.Portfolio portfolio)
		throws SystemException {
		portfolio = toUnwrappedModel(portfolio);

		boolean isNew = portfolio.isNew();

		PortfolioModelImpl portfolioModelImpl = (PortfolioModelImpl)portfolio;

		Session session = null;

		try {
			session = openSession();

			if (portfolio.isNew()) {
				session.save(portfolio);

				portfolio.setNew(false);
			}
			else {
				session.merge(portfolio);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !PortfolioModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((portfolioModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INVESTORID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						portfolioModelImpl.getOriginalInvestorId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INVESTORID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INVESTORID,
					args);

				args = new Object[] { portfolioModelImpl.getInvestorId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INVESTORID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INVESTORID,
					args);
			}

			if ((portfolioModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WEALTHADVISORID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						portfolioModelImpl.getOriginalWealthAdvisorId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WEALTHADVISORID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WEALTHADVISORID,
					args);

				args = new Object[] { portfolioModelImpl.getWealthAdvisorId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_WEALTHADVISORID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_WEALTHADVISORID,
					args);
			}

			if ((portfolioModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RELATIONSHIPMANAGERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						portfolioModelImpl.getOriginalRelationshipManagerId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RELATIONSHIPMANAGERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RELATIONSHIPMANAGERID,
					args);

				args = new Object[] {
						portfolioModelImpl.getRelationshipManagerId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_RELATIONSHIPMANAGERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RELATIONSHIPMANAGERID,
					args);
			}

			if ((portfolioModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSTITUTIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						portfolioModelImpl.getOriginalInstitutionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSTITUTIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSTITUTIONID,
					args);

				args = new Object[] { portfolioModelImpl.getInstitutionId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSTITUTIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSTITUTIONID,
					args);
			}
		}

		EntityCacheUtil.putResult(PortfolioModelImpl.ENTITY_CACHE_ENABLED,
			PortfolioImpl.class, portfolio.getPrimaryKey(), portfolio);

		return portfolio;
	}

	protected Portfolio toUnwrappedModel(Portfolio portfolio) {
		if (portfolio instanceof PortfolioImpl) {
			return portfolio;
		}

		PortfolioImpl portfolioImpl = new PortfolioImpl();

		portfolioImpl.setNew(portfolio.isNew());
		portfolioImpl.setPrimaryKey(portfolio.getPrimaryKey());

		portfolioImpl.setPortfolioId(portfolio.getPortfolioId());
		portfolioImpl.setPortfolioName(portfolio.getPortfolioName());
		portfolioImpl.setInvestorId(portfolio.getInvestorId());
		portfolioImpl.setWealthAdvisorId(portfolio.getWealthAdvisorId());
		portfolioImpl.setRelationshipManagerId(portfolio.getRelationshipManagerId());
		portfolioImpl.setInstitutionId(portfolio.getInstitutionId());
		portfolioImpl.setTrial(portfolio.isTrial());
		portfolioImpl.setPrimary(portfolio.isPrimary());
		portfolioImpl.setSocial(portfolio.isSocial());
		portfolioImpl.setBaseCurrency(portfolio.getBaseCurrency());
		portfolioImpl.setCreateDate(portfolio.getCreateDate());
		portfolioImpl.setModifiedDate(portfolio.getModifiedDate());
		portfolioImpl.setCompanyId(portfolio.getCompanyId());
		portfolioImpl.setUserId(portfolio.getUserId());
		portfolioImpl.setUserName(portfolio.getUserName());

		return portfolioImpl;
	}

	/**
	 * Returns the portfolio with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the portfolio
	 * @return the portfolio
	 * @throws com.fingence.slayer.NoSuchPortfolioException if a portfolio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Portfolio findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPortfolioException, SystemException {
		Portfolio portfolio = fetchByPrimaryKey(primaryKey);

		if (portfolio == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPortfolioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return portfolio;
	}

	/**
	 * Returns the portfolio with the primary key or throws a {@link com.fingence.slayer.NoSuchPortfolioException} if it could not be found.
	 *
	 * @param portfolioId the primary key of the portfolio
	 * @return the portfolio
	 * @throws com.fingence.slayer.NoSuchPortfolioException if a portfolio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Portfolio findByPrimaryKey(long portfolioId)
		throws NoSuchPortfolioException, SystemException {
		return findByPrimaryKey((Serializable)portfolioId);
	}

	/**
	 * Returns the portfolio with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the portfolio
	 * @return the portfolio, or <code>null</code> if a portfolio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Portfolio fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Portfolio portfolio = (Portfolio)EntityCacheUtil.getResult(PortfolioModelImpl.ENTITY_CACHE_ENABLED,
				PortfolioImpl.class, primaryKey);

		if (portfolio == _nullPortfolio) {
			return null;
		}

		if (portfolio == null) {
			Session session = null;

			try {
				session = openSession();

				portfolio = (Portfolio)session.get(PortfolioImpl.class,
						primaryKey);

				if (portfolio != null) {
					cacheResult(portfolio);
				}
				else {
					EntityCacheUtil.putResult(PortfolioModelImpl.ENTITY_CACHE_ENABLED,
						PortfolioImpl.class, primaryKey, _nullPortfolio);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PortfolioModelImpl.ENTITY_CACHE_ENABLED,
					PortfolioImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return portfolio;
	}

	/**
	 * Returns the portfolio with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param portfolioId the primary key of the portfolio
	 * @return the portfolio, or <code>null</code> if a portfolio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Portfolio fetchByPrimaryKey(long portfolioId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)portfolioId);
	}

	/**
	 * Returns all the portfolios.
	 *
	 * @return the portfolios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Portfolio> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the portfolios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.PortfolioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of portfolios
	 * @param end the upper bound of the range of portfolios (not inclusive)
	 * @return the range of portfolios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Portfolio> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the portfolios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.PortfolioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of portfolios
	 * @param end the upper bound of the range of portfolios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of portfolios
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Portfolio> findAll(int start, int end,
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

		List<Portfolio> list = (List<Portfolio>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PORTFOLIO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PORTFOLIO;

				if (pagination) {
					sql = sql.concat(PortfolioModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Portfolio>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Portfolio>(list);
				}
				else {
					list = (List<Portfolio>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the portfolios from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Portfolio portfolio : findAll()) {
			remove(portfolio);
		}
	}

	/**
	 * Returns the number of portfolios.
	 *
	 * @return the number of portfolios
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

				Query q = session.createQuery(_SQL_COUNT_PORTFOLIO);

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
	 * Initializes the portfolio persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.fingence.slayer.model.Portfolio")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Portfolio>> listenersList = new ArrayList<ModelListener<Portfolio>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Portfolio>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PortfolioImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PORTFOLIO = "SELECT portfolio FROM Portfolio portfolio";
	private static final String _SQL_SELECT_PORTFOLIO_WHERE = "SELECT portfolio FROM Portfolio portfolio WHERE ";
	private static final String _SQL_COUNT_PORTFOLIO = "SELECT COUNT(portfolio) FROM Portfolio portfolio";
	private static final String _SQL_COUNT_PORTFOLIO_WHERE = "SELECT COUNT(portfolio) FROM Portfolio portfolio WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "portfolio.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Portfolio exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Portfolio exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PortfolioPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"primary"
			});
	private static Portfolio _nullPortfolio = new PortfolioImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Portfolio> toCacheModel() {
				return _nullPortfolioCacheModel;
			}
		};

	private static CacheModel<Portfolio> _nullPortfolioCacheModel = new CacheModel<Portfolio>() {
			@Override
			public Portfolio toEntityModel() {
				return _nullPortfolio;
			}
		};
}