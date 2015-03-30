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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the currency service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ahmed Hasan
 * @see CurrencyPersistenceImpl
 * @see CurrencyUtil
 * @generated
 */
public interface CurrencyPersistence extends BasePersistence<Currency> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CurrencyUtil} to access the currency persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the currency where currencyCode = &#63; or throws a {@link com.fingence.slayer.NoSuchCurrencyException} if it could not be found.
	*
	* @param currencyCode the currency code
	* @return the matching currency
	* @throws com.fingence.slayer.NoSuchCurrencyException if a matching currency could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Currency findByCurrencyCode(
		java.lang.String currencyCode)
		throws com.fingence.slayer.NoSuchCurrencyException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the currency where currencyCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param currencyCode the currency code
	* @return the matching currency, or <code>null</code> if a matching currency could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Currency fetchByCurrencyCode(
		java.lang.String currencyCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the currency where currencyCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param currencyCode the currency code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching currency, or <code>null</code> if a matching currency could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Currency fetchByCurrencyCode(
		java.lang.String currencyCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the currency where currencyCode = &#63; from the database.
	*
	* @param currencyCode the currency code
	* @return the currency that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Currency removeByCurrencyCode(
		java.lang.String currencyCode)
		throws com.fingence.slayer.NoSuchCurrencyException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of currencies where currencyCode = &#63;.
	*
	* @param currencyCode the currency code
	* @return the number of matching currencies
	* @throws SystemException if a system exception occurred
	*/
	public int countByCurrencyCode(java.lang.String currencyCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the currency in the entity cache if it is enabled.
	*
	* @param currency the currency
	*/
	public void cacheResult(com.fingence.slayer.model.Currency currency);

	/**
	* Caches the currencies in the entity cache if it is enabled.
	*
	* @param currencies the currencies
	*/
	public void cacheResult(
		java.util.List<com.fingence.slayer.model.Currency> currencies);

	/**
	* Creates a new currency with the primary key. Does not add the currency to the database.
	*
	* @param currencyId the primary key for the new currency
	* @return the new currency
	*/
	public com.fingence.slayer.model.Currency create(long currencyId);

	/**
	* Removes the currency with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param currencyId the primary key of the currency
	* @return the currency that was removed
	* @throws com.fingence.slayer.NoSuchCurrencyException if a currency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Currency remove(long currencyId)
		throws com.fingence.slayer.NoSuchCurrencyException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.fingence.slayer.model.Currency updateImpl(
		com.fingence.slayer.model.Currency currency)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the currency with the primary key or throws a {@link com.fingence.slayer.NoSuchCurrencyException} if it could not be found.
	*
	* @param currencyId the primary key of the currency
	* @return the currency
	* @throws com.fingence.slayer.NoSuchCurrencyException if a currency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Currency findByPrimaryKey(long currencyId)
		throws com.fingence.slayer.NoSuchCurrencyException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the currency with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param currencyId the primary key of the currency
	* @return the currency, or <code>null</code> if a currency with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.Currency fetchByPrimaryKey(long currencyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the currencies.
	*
	* @return the currencies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.Currency> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.fingence.slayer.model.Currency> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.fingence.slayer.model.Currency> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the currencies from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of currencies.
	*
	* @return the number of currencies
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}