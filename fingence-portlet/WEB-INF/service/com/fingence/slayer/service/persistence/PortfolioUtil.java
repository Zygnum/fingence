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

import com.fingence.slayer.model.Portfolio;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the portfolio service. This utility wraps {@link PortfolioPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ahmed Hasan
 * @see PortfolioPersistence
 * @see PortfolioPersistenceImpl
 * @generated
 */
public class PortfolioUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Portfolio portfolio) {
		getPersistence().clearCache(portfolio);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Portfolio> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Portfolio> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Portfolio> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Portfolio update(Portfolio portfolio)
		throws SystemException {
		return getPersistence().update(portfolio);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Portfolio update(Portfolio portfolio,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(portfolio, serviceContext);
	}

	/**
	* Returns all the portfolios where investorId = &#63;.
	*
	* @param investorId the investor ID
	* @return the matching portfolios
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.fingence.slayer.model.Portfolio> findByInvestorId(
		long investorId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByInvestorId(investorId);
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
	public static java.util.List<com.fingence.slayer.model.Portfolio> findByInvestorId(
		long investorId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByInvestorId(investorId, start, end);
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
	public static java.util.List<com.fingence.slayer.model.Portfolio> findByInvestorId(
		long investorId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByInvestorId(investorId, start, end, orderByComparator);
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
	public static com.fingence.slayer.model.Portfolio findByInvestorId_First(
		long investorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchPortfolioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByInvestorId_First(investorId, orderByComparator);
	}

	/**
	* Returns the first portfolio in the ordered set where investorId = &#63;.
	*
	* @param investorId the investor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching portfolio, or <code>null</code> if a matching portfolio could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Portfolio fetchByInvestorId_First(
		long investorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByInvestorId_First(investorId, orderByComparator);
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
	public static com.fingence.slayer.model.Portfolio findByInvestorId_Last(
		long investorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchPortfolioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByInvestorId_Last(investorId, orderByComparator);
	}

	/**
	* Returns the last portfolio in the ordered set where investorId = &#63;.
	*
	* @param investorId the investor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching portfolio, or <code>null</code> if a matching portfolio could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Portfolio fetchByInvestorId_Last(
		long investorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByInvestorId_Last(investorId, orderByComparator);
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
	public static com.fingence.slayer.model.Portfolio[] findByInvestorId_PrevAndNext(
		long portfolioId, long investorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchPortfolioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByInvestorId_PrevAndNext(portfolioId, investorId,
			orderByComparator);
	}

	/**
	* Removes all the portfolios where investorId = &#63; from the database.
	*
	* @param investorId the investor ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByInvestorId(long investorId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByInvestorId(investorId);
	}

	/**
	* Returns the number of portfolios where investorId = &#63;.
	*
	* @param investorId the investor ID
	* @return the number of matching portfolios
	* @throws SystemException if a system exception occurred
	*/
	public static int countByInvestorId(long investorId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByInvestorId(investorId);
	}

	/**
	* Returns all the portfolios where wealthAdvisorId = &#63;.
	*
	* @param wealthAdvisorId the wealth advisor ID
	* @return the matching portfolios
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.fingence.slayer.model.Portfolio> findByWealthAdvisorId(
		long wealthAdvisorId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByWealthAdvisorId(wealthAdvisorId);
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
	public static java.util.List<com.fingence.slayer.model.Portfolio> findByWealthAdvisorId(
		long wealthAdvisorId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByWealthAdvisorId(wealthAdvisorId, start, end);
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
	public static java.util.List<com.fingence.slayer.model.Portfolio> findByWealthAdvisorId(
		long wealthAdvisorId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByWealthAdvisorId(wealthAdvisorId, start, end,
			orderByComparator);
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
	public static com.fingence.slayer.model.Portfolio findByWealthAdvisorId_First(
		long wealthAdvisorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchPortfolioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByWealthAdvisorId_First(wealthAdvisorId,
			orderByComparator);
	}

	/**
	* Returns the first portfolio in the ordered set where wealthAdvisorId = &#63;.
	*
	* @param wealthAdvisorId the wealth advisor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching portfolio, or <code>null</code> if a matching portfolio could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Portfolio fetchByWealthAdvisorId_First(
		long wealthAdvisorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByWealthAdvisorId_First(wealthAdvisorId,
			orderByComparator);
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
	public static com.fingence.slayer.model.Portfolio findByWealthAdvisorId_Last(
		long wealthAdvisorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchPortfolioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByWealthAdvisorId_Last(wealthAdvisorId,
			orderByComparator);
	}

	/**
	* Returns the last portfolio in the ordered set where wealthAdvisorId = &#63;.
	*
	* @param wealthAdvisorId the wealth advisor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching portfolio, or <code>null</code> if a matching portfolio could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Portfolio fetchByWealthAdvisorId_Last(
		long wealthAdvisorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByWealthAdvisorId_Last(wealthAdvisorId,
			orderByComparator);
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
	public static com.fingence.slayer.model.Portfolio[] findByWealthAdvisorId_PrevAndNext(
		long portfolioId, long wealthAdvisorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchPortfolioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByWealthAdvisorId_PrevAndNext(portfolioId,
			wealthAdvisorId, orderByComparator);
	}

	/**
	* Removes all the portfolios where wealthAdvisorId = &#63; from the database.
	*
	* @param wealthAdvisorId the wealth advisor ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByWealthAdvisorId(long wealthAdvisorId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByWealthAdvisorId(wealthAdvisorId);
	}

	/**
	* Returns the number of portfolios where wealthAdvisorId = &#63;.
	*
	* @param wealthAdvisorId the wealth advisor ID
	* @return the number of matching portfolios
	* @throws SystemException if a system exception occurred
	*/
	public static int countByWealthAdvisorId(long wealthAdvisorId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByWealthAdvisorId(wealthAdvisorId);
	}

	/**
	* Returns all the portfolios where relationshipManagerId = &#63;.
	*
	* @param relationshipManagerId the relationship manager ID
	* @return the matching portfolios
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.fingence.slayer.model.Portfolio> findByRelationshipManagerId(
		long relationshipManagerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRelationshipManagerId(relationshipManagerId);
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
	public static java.util.List<com.fingence.slayer.model.Portfolio> findByRelationshipManagerId(
		long relationshipManagerId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRelationshipManagerId(relationshipManagerId, start,
			end);
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
	public static java.util.List<com.fingence.slayer.model.Portfolio> findByRelationshipManagerId(
		long relationshipManagerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRelationshipManagerId(relationshipManagerId, start,
			end, orderByComparator);
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
	public static com.fingence.slayer.model.Portfolio findByRelationshipManagerId_First(
		long relationshipManagerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchPortfolioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRelationshipManagerId_First(relationshipManagerId,
			orderByComparator);
	}

	/**
	* Returns the first portfolio in the ordered set where relationshipManagerId = &#63;.
	*
	* @param relationshipManagerId the relationship manager ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching portfolio, or <code>null</code> if a matching portfolio could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Portfolio fetchByRelationshipManagerId_First(
		long relationshipManagerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRelationshipManagerId_First(relationshipManagerId,
			orderByComparator);
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
	public static com.fingence.slayer.model.Portfolio findByRelationshipManagerId_Last(
		long relationshipManagerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchPortfolioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRelationshipManagerId_Last(relationshipManagerId,
			orderByComparator);
	}

	/**
	* Returns the last portfolio in the ordered set where relationshipManagerId = &#63;.
	*
	* @param relationshipManagerId the relationship manager ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching portfolio, or <code>null</code> if a matching portfolio could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Portfolio fetchByRelationshipManagerId_Last(
		long relationshipManagerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRelationshipManagerId_Last(relationshipManagerId,
			orderByComparator);
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
	public static com.fingence.slayer.model.Portfolio[] findByRelationshipManagerId_PrevAndNext(
		long portfolioId, long relationshipManagerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchPortfolioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRelationshipManagerId_PrevAndNext(portfolioId,
			relationshipManagerId, orderByComparator);
	}

	/**
	* Removes all the portfolios where relationshipManagerId = &#63; from the database.
	*
	* @param relationshipManagerId the relationship manager ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByRelationshipManagerId(long relationshipManagerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByRelationshipManagerId(relationshipManagerId);
	}

	/**
	* Returns the number of portfolios where relationshipManagerId = &#63;.
	*
	* @param relationshipManagerId the relationship manager ID
	* @return the number of matching portfolios
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRelationshipManagerId(long relationshipManagerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByRelationshipManagerId(relationshipManagerId);
	}

	/**
	* Returns all the portfolios where institutionId = &#63;.
	*
	* @param institutionId the institution ID
	* @return the matching portfolios
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.fingence.slayer.model.Portfolio> findByInstitutionId(
		long institutionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByInstitutionId(institutionId);
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
	public static java.util.List<com.fingence.slayer.model.Portfolio> findByInstitutionId(
		long institutionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByInstitutionId(institutionId, start, end);
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
	public static java.util.List<com.fingence.slayer.model.Portfolio> findByInstitutionId(
		long institutionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByInstitutionId(institutionId, start, end,
			orderByComparator);
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
	public static com.fingence.slayer.model.Portfolio findByInstitutionId_First(
		long institutionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchPortfolioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByInstitutionId_First(institutionId, orderByComparator);
	}

	/**
	* Returns the first portfolio in the ordered set where institutionId = &#63;.
	*
	* @param institutionId the institution ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching portfolio, or <code>null</code> if a matching portfolio could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Portfolio fetchByInstitutionId_First(
		long institutionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByInstitutionId_First(institutionId, orderByComparator);
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
	public static com.fingence.slayer.model.Portfolio findByInstitutionId_Last(
		long institutionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchPortfolioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByInstitutionId_Last(institutionId, orderByComparator);
	}

	/**
	* Returns the last portfolio in the ordered set where institutionId = &#63;.
	*
	* @param institutionId the institution ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching portfolio, or <code>null</code> if a matching portfolio could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Portfolio fetchByInstitutionId_Last(
		long institutionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByInstitutionId_Last(institutionId, orderByComparator);
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
	public static com.fingence.slayer.model.Portfolio[] findByInstitutionId_PrevAndNext(
		long portfolioId, long institutionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchPortfolioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByInstitutionId_PrevAndNext(portfolioId, institutionId,
			orderByComparator);
	}

	/**
	* Removes all the portfolios where institutionId = &#63; from the database.
	*
	* @param institutionId the institution ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByInstitutionId(long institutionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByInstitutionId(institutionId);
	}

	/**
	* Returns the number of portfolios where institutionId = &#63;.
	*
	* @param institutionId the institution ID
	* @return the number of matching portfolios
	* @throws SystemException if a system exception occurred
	*/
	public static int countByInstitutionId(long institutionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByInstitutionId(institutionId);
	}

	/**
	* Caches the portfolio in the entity cache if it is enabled.
	*
	* @param portfolio the portfolio
	*/
	public static void cacheResult(
		com.fingence.slayer.model.Portfolio portfolio) {
		getPersistence().cacheResult(portfolio);
	}

	/**
	* Caches the portfolios in the entity cache if it is enabled.
	*
	* @param portfolios the portfolios
	*/
	public static void cacheResult(
		java.util.List<com.fingence.slayer.model.Portfolio> portfolios) {
		getPersistence().cacheResult(portfolios);
	}

	/**
	* Creates a new portfolio with the primary key. Does not add the portfolio to the database.
	*
	* @param portfolioId the primary key for the new portfolio
	* @return the new portfolio
	*/
	public static com.fingence.slayer.model.Portfolio create(long portfolioId) {
		return getPersistence().create(portfolioId);
	}

	/**
	* Removes the portfolio with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param portfolioId the primary key of the portfolio
	* @return the portfolio that was removed
	* @throws com.fingence.slayer.NoSuchPortfolioException if a portfolio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Portfolio remove(long portfolioId)
		throws com.fingence.slayer.NoSuchPortfolioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(portfolioId);
	}

	public static com.fingence.slayer.model.Portfolio updateImpl(
		com.fingence.slayer.model.Portfolio portfolio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(portfolio);
	}

	/**
	* Returns the portfolio with the primary key or throws a {@link com.fingence.slayer.NoSuchPortfolioException} if it could not be found.
	*
	* @param portfolioId the primary key of the portfolio
	* @return the portfolio
	* @throws com.fingence.slayer.NoSuchPortfolioException if a portfolio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Portfolio findByPrimaryKey(
		long portfolioId)
		throws com.fingence.slayer.NoSuchPortfolioException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(portfolioId);
	}

	/**
	* Returns the portfolio with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param portfolioId the primary key of the portfolio
	* @return the portfolio, or <code>null</code> if a portfolio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Portfolio fetchByPrimaryKey(
		long portfolioId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(portfolioId);
	}

	/**
	* Returns all the portfolios.
	*
	* @return the portfolios
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.fingence.slayer.model.Portfolio> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.fingence.slayer.model.Portfolio> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<com.fingence.slayer.model.Portfolio> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the portfolios from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of portfolios.
	*
	* @return the number of portfolios
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static PortfolioPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PortfolioPersistence)PortletBeanLocatorUtil.locate(com.fingence.slayer.service.ClpSerializer.getServletContextName(),
					PortfolioPersistence.class.getName());

			ReferenceRegistry.registerReference(PortfolioUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(PortfolioPersistence persistence) {
	}

	private static PortfolioPersistence _persistence;
}