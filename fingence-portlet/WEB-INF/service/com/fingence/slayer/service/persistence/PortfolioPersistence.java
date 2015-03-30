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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the portfolio service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ahmed Hasan
 * @see PortfolioPersistenceImpl
 * @see PortfolioUtil
 * @generated
 */
public interface PortfolioPersistence extends BasePersistence<Portfolio> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PortfolioUtil} to access the portfolio persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the portfolios where investorId = &#63;.
	*
	* @param investorId the investor ID
	* @return the matching portfolios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.Portfolio> findByInvestorId(
		long investorId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.fingence.slayer.model.Portfolio> findByInvestorId(
		long investorId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.fingence.slayer.model.Portfolio> findByInvestorId(
		long investorId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first portfolio in the ordered set where investorId = &#63;.
	*
	* @param investorId the investor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching portfolio
	* @throws com.fingence.slayer.NoSuchPortfolioException if a matching portfolio could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Portfolio findByInvestorId_First(
		long investorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchPortfolioException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first portfolio in the ordered set where investorId = &#63;.
	*
	* @param investorId the investor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching portfolio, or <code>null</code> if a matching portfolio could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Portfolio fetchByInvestorId_First(
		long investorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last portfolio in the ordered set where investorId = &#63;.
	*
	* @param investorId the investor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching portfolio
	* @throws com.fingence.slayer.NoSuchPortfolioException if a matching portfolio could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Portfolio findByInvestorId_Last(
		long investorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchPortfolioException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last portfolio in the ordered set where investorId = &#63;.
	*
	* @param investorId the investor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching portfolio, or <code>null</code> if a matching portfolio could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Portfolio fetchByInvestorId_Last(
		long investorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.fingence.slayer.model.Portfolio[] findByInvestorId_PrevAndNext(
		long portfolioId, long investorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchPortfolioException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the portfolios where investorId = &#63; from the database.
	*
	* @param investorId the investor ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByInvestorId(long investorId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of portfolios where investorId = &#63;.
	*
	* @param investorId the investor ID
	* @return the number of matching portfolios
	* @throws SystemException if a system exception occurred
	*/
	public int countByInvestorId(long investorId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the portfolios where wealthAdvisorId = &#63;.
	*
	* @param wealthAdvisorId the wealth advisor ID
	* @return the matching portfolios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.Portfolio> findByWealthAdvisorId(
		long wealthAdvisorId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.fingence.slayer.model.Portfolio> findByWealthAdvisorId(
		long wealthAdvisorId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.fingence.slayer.model.Portfolio> findByWealthAdvisorId(
		long wealthAdvisorId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first portfolio in the ordered set where wealthAdvisorId = &#63;.
	*
	* @param wealthAdvisorId the wealth advisor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching portfolio
	* @throws com.fingence.slayer.NoSuchPortfolioException if a matching portfolio could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Portfolio findByWealthAdvisorId_First(
		long wealthAdvisorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchPortfolioException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first portfolio in the ordered set where wealthAdvisorId = &#63;.
	*
	* @param wealthAdvisorId the wealth advisor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching portfolio, or <code>null</code> if a matching portfolio could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Portfolio fetchByWealthAdvisorId_First(
		long wealthAdvisorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last portfolio in the ordered set where wealthAdvisorId = &#63;.
	*
	* @param wealthAdvisorId the wealth advisor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching portfolio
	* @throws com.fingence.slayer.NoSuchPortfolioException if a matching portfolio could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Portfolio findByWealthAdvisorId_Last(
		long wealthAdvisorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchPortfolioException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last portfolio in the ordered set where wealthAdvisorId = &#63;.
	*
	* @param wealthAdvisorId the wealth advisor ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching portfolio, or <code>null</code> if a matching portfolio could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Portfolio fetchByWealthAdvisorId_Last(
		long wealthAdvisorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.fingence.slayer.model.Portfolio[] findByWealthAdvisorId_PrevAndNext(
		long portfolioId, long wealthAdvisorId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchPortfolioException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the portfolios where wealthAdvisorId = &#63; from the database.
	*
	* @param wealthAdvisorId the wealth advisor ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByWealthAdvisorId(long wealthAdvisorId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of portfolios where wealthAdvisorId = &#63;.
	*
	* @param wealthAdvisorId the wealth advisor ID
	* @return the number of matching portfolios
	* @throws SystemException if a system exception occurred
	*/
	public int countByWealthAdvisorId(long wealthAdvisorId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the portfolios where relationshipManagerId = &#63;.
	*
	* @param relationshipManagerId the relationship manager ID
	* @return the matching portfolios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.Portfolio> findByRelationshipManagerId(
		long relationshipManagerId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.fingence.slayer.model.Portfolio> findByRelationshipManagerId(
		long relationshipManagerId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.fingence.slayer.model.Portfolio> findByRelationshipManagerId(
		long relationshipManagerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first portfolio in the ordered set where relationshipManagerId = &#63;.
	*
	* @param relationshipManagerId the relationship manager ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching portfolio
	* @throws com.fingence.slayer.NoSuchPortfolioException if a matching portfolio could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Portfolio findByRelationshipManagerId_First(
		long relationshipManagerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchPortfolioException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first portfolio in the ordered set where relationshipManagerId = &#63;.
	*
	* @param relationshipManagerId the relationship manager ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching portfolio, or <code>null</code> if a matching portfolio could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Portfolio fetchByRelationshipManagerId_First(
		long relationshipManagerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last portfolio in the ordered set where relationshipManagerId = &#63;.
	*
	* @param relationshipManagerId the relationship manager ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching portfolio
	* @throws com.fingence.slayer.NoSuchPortfolioException if a matching portfolio could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Portfolio findByRelationshipManagerId_Last(
		long relationshipManagerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchPortfolioException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last portfolio in the ordered set where relationshipManagerId = &#63;.
	*
	* @param relationshipManagerId the relationship manager ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching portfolio, or <code>null</code> if a matching portfolio could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Portfolio fetchByRelationshipManagerId_Last(
		long relationshipManagerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.fingence.slayer.model.Portfolio[] findByRelationshipManagerId_PrevAndNext(
		long portfolioId, long relationshipManagerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchPortfolioException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the portfolios where relationshipManagerId = &#63; from the database.
	*
	* @param relationshipManagerId the relationship manager ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByRelationshipManagerId(long relationshipManagerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of portfolios where relationshipManagerId = &#63;.
	*
	* @param relationshipManagerId the relationship manager ID
	* @return the number of matching portfolios
	* @throws SystemException if a system exception occurred
	*/
	public int countByRelationshipManagerId(long relationshipManagerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the portfolios where institutionId = &#63;.
	*
	* @param institutionId the institution ID
	* @return the matching portfolios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.Portfolio> findByInstitutionId(
		long institutionId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.fingence.slayer.model.Portfolio> findByInstitutionId(
		long institutionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.fingence.slayer.model.Portfolio> findByInstitutionId(
		long institutionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first portfolio in the ordered set where institutionId = &#63;.
	*
	* @param institutionId the institution ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching portfolio
	* @throws com.fingence.slayer.NoSuchPortfolioException if a matching portfolio could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Portfolio findByInstitutionId_First(
		long institutionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchPortfolioException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first portfolio in the ordered set where institutionId = &#63;.
	*
	* @param institutionId the institution ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching portfolio, or <code>null</code> if a matching portfolio could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Portfolio fetchByInstitutionId_First(
		long institutionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last portfolio in the ordered set where institutionId = &#63;.
	*
	* @param institutionId the institution ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching portfolio
	* @throws com.fingence.slayer.NoSuchPortfolioException if a matching portfolio could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Portfolio findByInstitutionId_Last(
		long institutionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchPortfolioException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last portfolio in the ordered set where institutionId = &#63;.
	*
	* @param institutionId the institution ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching portfolio, or <code>null</code> if a matching portfolio could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Portfolio fetchByInstitutionId_Last(
		long institutionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.fingence.slayer.model.Portfolio[] findByInstitutionId_PrevAndNext(
		long portfolioId, long institutionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.fingence.slayer.NoSuchPortfolioException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the portfolios where institutionId = &#63; from the database.
	*
	* @param institutionId the institution ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByInstitutionId(long institutionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of portfolios where institutionId = &#63;.
	*
	* @param institutionId the institution ID
	* @return the number of matching portfolios
	* @throws SystemException if a system exception occurred
	*/
	public int countByInstitutionId(long institutionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the portfolio in the entity cache if it is enabled.
	*
	* @param portfolio the portfolio
	*/
	public void cacheResult(com.fingence.slayer.model.Portfolio portfolio);

	/**
	* Caches the portfolios in the entity cache if it is enabled.
	*
	* @param portfolios the portfolios
	*/
	public void cacheResult(
		java.util.List<com.fingence.slayer.model.Portfolio> portfolios);

	/**
	* Creates a new portfolio with the primary key. Does not add the portfolio to the database.
	*
	* @param portfolioId the primary key for the new portfolio
	* @return the new portfolio
	*/
	public com.fingence.slayer.model.Portfolio create(long portfolioId);

	/**
	* Removes the portfolio with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param portfolioId the primary key of the portfolio
	* @return the portfolio that was removed
	* @throws com.fingence.slayer.NoSuchPortfolioException if a portfolio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Portfolio remove(long portfolioId)
		throws com.fingence.slayer.NoSuchPortfolioException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.fingence.slayer.model.Portfolio updateImpl(
		com.fingence.slayer.model.Portfolio portfolio)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the portfolio with the primary key or throws a {@link com.fingence.slayer.NoSuchPortfolioException} if it could not be found.
	*
	* @param portfolioId the primary key of the portfolio
	* @return the portfolio
	* @throws com.fingence.slayer.NoSuchPortfolioException if a portfolio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Portfolio findByPrimaryKey(
		long portfolioId)
		throws com.fingence.slayer.NoSuchPortfolioException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the portfolio with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param portfolioId the primary key of the portfolio
	* @return the portfolio, or <code>null</code> if a portfolio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Portfolio fetchByPrimaryKey(
		long portfolioId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the portfolios.
	*
	* @return the portfolios
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.Portfolio> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.fingence.slayer.model.Portfolio> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.fingence.slayer.model.Portfolio> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the portfolios from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of portfolios.
	*
	* @return the number of portfolios
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}