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

import com.fingence.slayer.model.Currency;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the currency service. This utility wraps {@link CurrencyPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ahmed Hasan
 * @see CurrencyPersistence
 * @see CurrencyPersistenceImpl
 * @generated
 */
public class CurrencyUtil {
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
	public static void clearCache(Currency currency) {
		getPersistence().clearCache(currency);
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
	public static List<Currency> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Currency> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Currency> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Currency update(Currency currency) throws SystemException {
		return getPersistence().update(currency);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Currency update(Currency currency,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(currency, serviceContext);
	}

	/**
	* Returns the currency where currencyCode = &#63; or throws a {@link com.fingence.slayer.NoSuchCurrencyException} if it could not be found.
	*
	* @param currencyCode the currency code
	* @return the matching currency
	* @throws com.fingence.slayer.NoSuchCurrencyException if a matching currency could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Currency findByCurrencyCode(
		java.lang.String currencyCode)
		throws com.fingence.slayer.NoSuchCurrencyException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCurrencyCode(currencyCode);
	}

	/**
	* Returns the currency where currencyCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param currencyCode the currency code
	* @return the matching currency, or <code>null</code> if a matching currency could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Currency fetchByCurrencyCode(
		java.lang.String currencyCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCurrencyCode(currencyCode);
	}

	/**
	* Returns the currency where currencyCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param currencyCode the currency code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching currency, or <code>null</code> if a matching currency could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Currency fetchByCurrencyCode(
		java.lang.String currencyCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCurrencyCode(currencyCode, retrieveFromCache);
	}

	/**
	* Removes the currency where currencyCode = &#63; from the database.
	*
	* @param currencyCode the currency code
	* @return the currency that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Currency removeByCurrencyCode(
		java.lang.String currencyCode)
		throws com.fingence.slayer.NoSuchCurrencyException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByCurrencyCode(currencyCode);
	}

	/**
	* Returns the number of currencies where currencyCode = &#63;.
	*
	* @param currencyCode the currency code
	* @return the number of matching currencies
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCurrencyCode(java.lang.String currencyCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCurrencyCode(currencyCode);
	}

	/**
	* Caches the currency in the entity cache if it is enabled.
	*
	* @param currency the currency
	*/
	public static void cacheResult(com.fingence.slayer.model.Currency currency) {
		getPersistence().cacheResult(currency);
	}

	/**
	* Caches the currencies in the entity cache if it is enabled.
	*
	* @param currencies the currencies
	*/
	public static void cacheResult(
		java.util.List<com.fingence.slayer.model.Currency> currencies) {
		getPersistence().cacheResult(currencies);
	}

	/**
	* Creates a new currency with the primary key. Does not add the currency to the database.
	*
	* @param currencyId the primary key for the new currency
	* @return the new currency
	*/
	public static com.fingence.slayer.model.Currency create(long currencyId) {
		return getPersistence().create(currencyId);
	}

	/**
	* Removes the currency with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param currencyId the primary key of the currency
	* @return the currency that was removed
	* @throws com.fingence.slayer.NoSuchCurrencyException if a currency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Currency remove(long currencyId)
		throws com.fingence.slayer.NoSuchCurrencyException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(currencyId);
	}

	public static com.fingence.slayer.model.Currency updateImpl(
		com.fingence.slayer.model.Currency currency)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(currency);
	}

	/**
	* Returns the currency with the primary key or throws a {@link com.fingence.slayer.NoSuchCurrencyException} if it could not be found.
	*
	* @param currencyId the primary key of the currency
	* @return the currency
	* @throws com.fingence.slayer.NoSuchCurrencyException if a currency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Currency findByPrimaryKey(
		long currencyId)
		throws com.fingence.slayer.NoSuchCurrencyException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(currencyId);
	}

	/**
	* Returns the currency with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param currencyId the primary key of the currency
	* @return the currency, or <code>null</code> if a currency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.Currency fetchByPrimaryKey(
		long currencyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(currencyId);
	}

	/**
	* Returns all the currencies.
	*
	* @return the currencies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.fingence.slayer.model.Currency> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the currencies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.CurrencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of currencies
	* @param end the upper bound of the range of currencies (not inclusive)
	* @return the range of currencies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.fingence.slayer.model.Currency> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the currencies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.CurrencyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of currencies
	* @param end the upper bound of the range of currencies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of currencies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.fingence.slayer.model.Currency> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the currencies from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of currencies.
	*
	* @return the number of currencies
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CurrencyPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CurrencyPersistence)PortletBeanLocatorUtil.locate(com.fingence.slayer.service.ClpSerializer.getServletContextName(),
					CurrencyPersistence.class.getName());

			ReferenceRegistry.registerReference(CurrencyUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CurrencyPersistence persistence) {
	}

	private static CurrencyPersistence _persistence;
}