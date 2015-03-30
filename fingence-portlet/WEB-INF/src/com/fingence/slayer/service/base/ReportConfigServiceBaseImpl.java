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

package com.fingence.slayer.service.base;

import com.fingence.slayer.model.ReportConfig;
import com.fingence.slayer.service.ReportConfigService;
import com.fingence.slayer.service.persistence.AssetPersistence;
import com.fingence.slayer.service.persistence.BondPersistence;
import com.fingence.slayer.service.persistence.CurrencyPersistence;
import com.fingence.slayer.service.persistence.DividendPersistence;
import com.fingence.slayer.service.persistence.EquityPersistence;
import com.fingence.slayer.service.persistence.HistoryPersistence;
import com.fingence.slayer.service.persistence.MutualFundPersistence;
import com.fingence.slayer.service.persistence.MyResultFinder;
import com.fingence.slayer.service.persistence.MyResultPersistence;
import com.fingence.slayer.service.persistence.PortfolioItemPersistence;
import com.fingence.slayer.service.persistence.PortfolioPersistence;
import com.fingence.slayer.service.persistence.RatingPersistence;
import com.fingence.slayer.service.persistence.ReportConfigPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the report config remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.fingence.slayer.service.impl.ReportConfigServiceImpl}.
 * </p>
 *
 * @author Ahmed Hasan
 * @see com.fingence.slayer.service.impl.ReportConfigServiceImpl
 * @see com.fingence.slayer.service.ReportConfigServiceUtil
 * @generated
 */
public abstract class ReportConfigServiceBaseImpl extends BaseServiceImpl
	implements ReportConfigService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.fingence.slayer.service.ReportConfigServiceUtil} to access the report config remote service.
	 */

	/**
	 * Returns the asset local service.
	 *
	 * @return the asset local service
	 */
	public com.fingence.slayer.service.AssetLocalService getAssetLocalService() {
		return assetLocalService;
	}

	/**
	 * Sets the asset local service.
	 *
	 * @param assetLocalService the asset local service
	 */
	public void setAssetLocalService(
		com.fingence.slayer.service.AssetLocalService assetLocalService) {
		this.assetLocalService = assetLocalService;
	}

	/**
	 * Returns the asset remote service.
	 *
	 * @return the asset remote service
	 */
	public com.fingence.slayer.service.AssetService getAssetService() {
		return assetService;
	}

	/**
	 * Sets the asset remote service.
	 *
	 * @param assetService the asset remote service
	 */
	public void setAssetService(
		com.fingence.slayer.service.AssetService assetService) {
		this.assetService = assetService;
	}

	/**
	 * Returns the asset persistence.
	 *
	 * @return the asset persistence
	 */
	public AssetPersistence getAssetPersistence() {
		return assetPersistence;
	}

	/**
	 * Sets the asset persistence.
	 *
	 * @param assetPersistence the asset persistence
	 */
	public void setAssetPersistence(AssetPersistence assetPersistence) {
		this.assetPersistence = assetPersistence;
	}

	/**
	 * Returns the bond local service.
	 *
	 * @return the bond local service
	 */
	public com.fingence.slayer.service.BondLocalService getBondLocalService() {
		return bondLocalService;
	}

	/**
	 * Sets the bond local service.
	 *
	 * @param bondLocalService the bond local service
	 */
	public void setBondLocalService(
		com.fingence.slayer.service.BondLocalService bondLocalService) {
		this.bondLocalService = bondLocalService;
	}

	/**
	 * Returns the bond remote service.
	 *
	 * @return the bond remote service
	 */
	public com.fingence.slayer.service.BondService getBondService() {
		return bondService;
	}

	/**
	 * Sets the bond remote service.
	 *
	 * @param bondService the bond remote service
	 */
	public void setBondService(
		com.fingence.slayer.service.BondService bondService) {
		this.bondService = bondService;
	}

	/**
	 * Returns the bond persistence.
	 *
	 * @return the bond persistence
	 */
	public BondPersistence getBondPersistence() {
		return bondPersistence;
	}

	/**
	 * Sets the bond persistence.
	 *
	 * @param bondPersistence the bond persistence
	 */
	public void setBondPersistence(BondPersistence bondPersistence) {
		this.bondPersistence = bondPersistence;
	}

	/**
	 * Returns the bridge local service.
	 *
	 * @return the bridge local service
	 */
	public com.fingence.slayer.service.BridgeLocalService getBridgeLocalService() {
		return bridgeLocalService;
	}

	/**
	 * Sets the bridge local service.
	 *
	 * @param bridgeLocalService the bridge local service
	 */
	public void setBridgeLocalService(
		com.fingence.slayer.service.BridgeLocalService bridgeLocalService) {
		this.bridgeLocalService = bridgeLocalService;
	}

	/**
	 * Returns the bridge remote service.
	 *
	 * @return the bridge remote service
	 */
	public com.fingence.slayer.service.BridgeService getBridgeService() {
		return bridgeService;
	}

	/**
	 * Sets the bridge remote service.
	 *
	 * @param bridgeService the bridge remote service
	 */
	public void setBridgeService(
		com.fingence.slayer.service.BridgeService bridgeService) {
		this.bridgeService = bridgeService;
	}

	/**
	 * Returns the currency local service.
	 *
	 * @return the currency local service
	 */
	public com.fingence.slayer.service.CurrencyLocalService getCurrencyLocalService() {
		return currencyLocalService;
	}

	/**
	 * Sets the currency local service.
	 *
	 * @param currencyLocalService the currency local service
	 */
	public void setCurrencyLocalService(
		com.fingence.slayer.service.CurrencyLocalService currencyLocalService) {
		this.currencyLocalService = currencyLocalService;
	}

	/**
	 * Returns the currency remote service.
	 *
	 * @return the currency remote service
	 */
	public com.fingence.slayer.service.CurrencyService getCurrencyService() {
		return currencyService;
	}

	/**
	 * Sets the currency remote service.
	 *
	 * @param currencyService the currency remote service
	 */
	public void setCurrencyService(
		com.fingence.slayer.service.CurrencyService currencyService) {
		this.currencyService = currencyService;
	}

	/**
	 * Returns the currency persistence.
	 *
	 * @return the currency persistence
	 */
	public CurrencyPersistence getCurrencyPersistence() {
		return currencyPersistence;
	}

	/**
	 * Sets the currency persistence.
	 *
	 * @param currencyPersistence the currency persistence
	 */
	public void setCurrencyPersistence(CurrencyPersistence currencyPersistence) {
		this.currencyPersistence = currencyPersistence;
	}

	/**
	 * Returns the dividend local service.
	 *
	 * @return the dividend local service
	 */
	public com.fingence.slayer.service.DividendLocalService getDividendLocalService() {
		return dividendLocalService;
	}

	/**
	 * Sets the dividend local service.
	 *
	 * @param dividendLocalService the dividend local service
	 */
	public void setDividendLocalService(
		com.fingence.slayer.service.DividendLocalService dividendLocalService) {
		this.dividendLocalService = dividendLocalService;
	}

	/**
	 * Returns the dividend remote service.
	 *
	 * @return the dividend remote service
	 */
	public com.fingence.slayer.service.DividendService getDividendService() {
		return dividendService;
	}

	/**
	 * Sets the dividend remote service.
	 *
	 * @param dividendService the dividend remote service
	 */
	public void setDividendService(
		com.fingence.slayer.service.DividendService dividendService) {
		this.dividendService = dividendService;
	}

	/**
	 * Returns the dividend persistence.
	 *
	 * @return the dividend persistence
	 */
	public DividendPersistence getDividendPersistence() {
		return dividendPersistence;
	}

	/**
	 * Sets the dividend persistence.
	 *
	 * @param dividendPersistence the dividend persistence
	 */
	public void setDividendPersistence(DividendPersistence dividendPersistence) {
		this.dividendPersistence = dividendPersistence;
	}

	/**
	 * Returns the equity local service.
	 *
	 * @return the equity local service
	 */
	public com.fingence.slayer.service.EquityLocalService getEquityLocalService() {
		return equityLocalService;
	}

	/**
	 * Sets the equity local service.
	 *
	 * @param equityLocalService the equity local service
	 */
	public void setEquityLocalService(
		com.fingence.slayer.service.EquityLocalService equityLocalService) {
		this.equityLocalService = equityLocalService;
	}

	/**
	 * Returns the equity remote service.
	 *
	 * @return the equity remote service
	 */
	public com.fingence.slayer.service.EquityService getEquityService() {
		return equityService;
	}

	/**
	 * Sets the equity remote service.
	 *
	 * @param equityService the equity remote service
	 */
	public void setEquityService(
		com.fingence.slayer.service.EquityService equityService) {
		this.equityService = equityService;
	}

	/**
	 * Returns the equity persistence.
	 *
	 * @return the equity persistence
	 */
	public EquityPersistence getEquityPersistence() {
		return equityPersistence;
	}

	/**
	 * Sets the equity persistence.
	 *
	 * @param equityPersistence the equity persistence
	 */
	public void setEquityPersistence(EquityPersistence equityPersistence) {
		this.equityPersistence = equityPersistence;
	}

	/**
	 * Returns the history local service.
	 *
	 * @return the history local service
	 */
	public com.fingence.slayer.service.HistoryLocalService getHistoryLocalService() {
		return historyLocalService;
	}

	/**
	 * Sets the history local service.
	 *
	 * @param historyLocalService the history local service
	 */
	public void setHistoryLocalService(
		com.fingence.slayer.service.HistoryLocalService historyLocalService) {
		this.historyLocalService = historyLocalService;
	}

	/**
	 * Returns the history remote service.
	 *
	 * @return the history remote service
	 */
	public com.fingence.slayer.service.HistoryService getHistoryService() {
		return historyService;
	}

	/**
	 * Sets the history remote service.
	 *
	 * @param historyService the history remote service
	 */
	public void setHistoryService(
		com.fingence.slayer.service.HistoryService historyService) {
		this.historyService = historyService;
	}

	/**
	 * Returns the history persistence.
	 *
	 * @return the history persistence
	 */
	public HistoryPersistence getHistoryPersistence() {
		return historyPersistence;
	}

	/**
	 * Sets the history persistence.
	 *
	 * @param historyPersistence the history persistence
	 */
	public void setHistoryPersistence(HistoryPersistence historyPersistence) {
		this.historyPersistence = historyPersistence;
	}

	/**
	 * Returns the mutual fund local service.
	 *
	 * @return the mutual fund local service
	 */
	public com.fingence.slayer.service.MutualFundLocalService getMutualFundLocalService() {
		return mutualFundLocalService;
	}

	/**
	 * Sets the mutual fund local service.
	 *
	 * @param mutualFundLocalService the mutual fund local service
	 */
	public void setMutualFundLocalService(
		com.fingence.slayer.service.MutualFundLocalService mutualFundLocalService) {
		this.mutualFundLocalService = mutualFundLocalService;
	}

	/**
	 * Returns the mutual fund remote service.
	 *
	 * @return the mutual fund remote service
	 */
	public com.fingence.slayer.service.MutualFundService getMutualFundService() {
		return mutualFundService;
	}

	/**
	 * Sets the mutual fund remote service.
	 *
	 * @param mutualFundService the mutual fund remote service
	 */
	public void setMutualFundService(
		com.fingence.slayer.service.MutualFundService mutualFundService) {
		this.mutualFundService = mutualFundService;
	}

	/**
	 * Returns the mutual fund persistence.
	 *
	 * @return the mutual fund persistence
	 */
	public MutualFundPersistence getMutualFundPersistence() {
		return mutualFundPersistence;
	}

	/**
	 * Sets the mutual fund persistence.
	 *
	 * @param mutualFundPersistence the mutual fund persistence
	 */
	public void setMutualFundPersistence(
		MutualFundPersistence mutualFundPersistence) {
		this.mutualFundPersistence = mutualFundPersistence;
	}

	/**
	 * Returns the my result local service.
	 *
	 * @return the my result local service
	 */
	public com.fingence.slayer.service.MyResultLocalService getMyResultLocalService() {
		return myResultLocalService;
	}

	/**
	 * Sets the my result local service.
	 *
	 * @param myResultLocalService the my result local service
	 */
	public void setMyResultLocalService(
		com.fingence.slayer.service.MyResultLocalService myResultLocalService) {
		this.myResultLocalService = myResultLocalService;
	}

	/**
	 * Returns the my result remote service.
	 *
	 * @return the my result remote service
	 */
	public com.fingence.slayer.service.MyResultService getMyResultService() {
		return myResultService;
	}

	/**
	 * Sets the my result remote service.
	 *
	 * @param myResultService the my result remote service
	 */
	public void setMyResultService(
		com.fingence.slayer.service.MyResultService myResultService) {
		this.myResultService = myResultService;
	}

	/**
	 * Returns the my result persistence.
	 *
	 * @return the my result persistence
	 */
	public MyResultPersistence getMyResultPersistence() {
		return myResultPersistence;
	}

	/**
	 * Sets the my result persistence.
	 *
	 * @param myResultPersistence the my result persistence
	 */
	public void setMyResultPersistence(MyResultPersistence myResultPersistence) {
		this.myResultPersistence = myResultPersistence;
	}

	/**
	 * Returns the my result finder.
	 *
	 * @return the my result finder
	 */
	public MyResultFinder getMyResultFinder() {
		return myResultFinder;
	}

	/**
	 * Sets the my result finder.
	 *
	 * @param myResultFinder the my result finder
	 */
	public void setMyResultFinder(MyResultFinder myResultFinder) {
		this.myResultFinder = myResultFinder;
	}

	/**
	 * Returns the portfolio local service.
	 *
	 * @return the portfolio local service
	 */
	public com.fingence.slayer.service.PortfolioLocalService getPortfolioLocalService() {
		return portfolioLocalService;
	}

	/**
	 * Sets the portfolio local service.
	 *
	 * @param portfolioLocalService the portfolio local service
	 */
	public void setPortfolioLocalService(
		com.fingence.slayer.service.PortfolioLocalService portfolioLocalService) {
		this.portfolioLocalService = portfolioLocalService;
	}

	/**
	 * Returns the portfolio remote service.
	 *
	 * @return the portfolio remote service
	 */
	public com.fingence.slayer.service.PortfolioService getPortfolioService() {
		return portfolioService;
	}

	/**
	 * Sets the portfolio remote service.
	 *
	 * @param portfolioService the portfolio remote service
	 */
	public void setPortfolioService(
		com.fingence.slayer.service.PortfolioService portfolioService) {
		this.portfolioService = portfolioService;
	}

	/**
	 * Returns the portfolio persistence.
	 *
	 * @return the portfolio persistence
	 */
	public PortfolioPersistence getPortfolioPersistence() {
		return portfolioPersistence;
	}

	/**
	 * Sets the portfolio persistence.
	 *
	 * @param portfolioPersistence the portfolio persistence
	 */
	public void setPortfolioPersistence(
		PortfolioPersistence portfolioPersistence) {
		this.portfolioPersistence = portfolioPersistence;
	}

	/**
	 * Returns the portfolio item local service.
	 *
	 * @return the portfolio item local service
	 */
	public com.fingence.slayer.service.PortfolioItemLocalService getPortfolioItemLocalService() {
		return portfolioItemLocalService;
	}

	/**
	 * Sets the portfolio item local service.
	 *
	 * @param portfolioItemLocalService the portfolio item local service
	 */
	public void setPortfolioItemLocalService(
		com.fingence.slayer.service.PortfolioItemLocalService portfolioItemLocalService) {
		this.portfolioItemLocalService = portfolioItemLocalService;
	}

	/**
	 * Returns the portfolio item remote service.
	 *
	 * @return the portfolio item remote service
	 */
	public com.fingence.slayer.service.PortfolioItemService getPortfolioItemService() {
		return portfolioItemService;
	}

	/**
	 * Sets the portfolio item remote service.
	 *
	 * @param portfolioItemService the portfolio item remote service
	 */
	public void setPortfolioItemService(
		com.fingence.slayer.service.PortfolioItemService portfolioItemService) {
		this.portfolioItemService = portfolioItemService;
	}

	/**
	 * Returns the portfolio item persistence.
	 *
	 * @return the portfolio item persistence
	 */
	public PortfolioItemPersistence getPortfolioItemPersistence() {
		return portfolioItemPersistence;
	}

	/**
	 * Sets the portfolio item persistence.
	 *
	 * @param portfolioItemPersistence the portfolio item persistence
	 */
	public void setPortfolioItemPersistence(
		PortfolioItemPersistence portfolioItemPersistence) {
		this.portfolioItemPersistence = portfolioItemPersistence;
	}

	/**
	 * Returns the rating local service.
	 *
	 * @return the rating local service
	 */
	public com.fingence.slayer.service.RatingLocalService getRatingLocalService() {
		return ratingLocalService;
	}

	/**
	 * Sets the rating local service.
	 *
	 * @param ratingLocalService the rating local service
	 */
	public void setRatingLocalService(
		com.fingence.slayer.service.RatingLocalService ratingLocalService) {
		this.ratingLocalService = ratingLocalService;
	}

	/**
	 * Returns the rating remote service.
	 *
	 * @return the rating remote service
	 */
	public com.fingence.slayer.service.RatingService getRatingService() {
		return ratingService;
	}

	/**
	 * Sets the rating remote service.
	 *
	 * @param ratingService the rating remote service
	 */
	public void setRatingService(
		com.fingence.slayer.service.RatingService ratingService) {
		this.ratingService = ratingService;
	}

	/**
	 * Returns the rating persistence.
	 *
	 * @return the rating persistence
	 */
	public RatingPersistence getRatingPersistence() {
		return ratingPersistence;
	}

	/**
	 * Sets the rating persistence.
	 *
	 * @param ratingPersistence the rating persistence
	 */
	public void setRatingPersistence(RatingPersistence ratingPersistence) {
		this.ratingPersistence = ratingPersistence;
	}

	/**
	 * Returns the report config local service.
	 *
	 * @return the report config local service
	 */
	public com.fingence.slayer.service.ReportConfigLocalService getReportConfigLocalService() {
		return reportConfigLocalService;
	}

	/**
	 * Sets the report config local service.
	 *
	 * @param reportConfigLocalService the report config local service
	 */
	public void setReportConfigLocalService(
		com.fingence.slayer.service.ReportConfigLocalService reportConfigLocalService) {
		this.reportConfigLocalService = reportConfigLocalService;
	}

	/**
	 * Returns the report config remote service.
	 *
	 * @return the report config remote service
	 */
	public com.fingence.slayer.service.ReportConfigService getReportConfigService() {
		return reportConfigService;
	}

	/**
	 * Sets the report config remote service.
	 *
	 * @param reportConfigService the report config remote service
	 */
	public void setReportConfigService(
		com.fingence.slayer.service.ReportConfigService reportConfigService) {
		this.reportConfigService = reportConfigService;
	}

	/**
	 * Returns the report config persistence.
	 *
	 * @return the report config persistence
	 */
	public ReportConfigPersistence getReportConfigPersistence() {
		return reportConfigPersistence;
	}

	/**
	 * Sets the report config persistence.
	 *
	 * @param reportConfigPersistence the report config persistence
	 */
	public void setReportConfigPersistence(
		ReportConfigPersistence reportConfigPersistence) {
		this.reportConfigPersistence = reportConfigPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return ReportConfig.class;
	}

	protected String getModelClassName() {
		return ReportConfig.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = reportConfigPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.fingence.slayer.service.AssetLocalService.class)
	protected com.fingence.slayer.service.AssetLocalService assetLocalService;
	@BeanReference(type = com.fingence.slayer.service.AssetService.class)
	protected com.fingence.slayer.service.AssetService assetService;
	@BeanReference(type = AssetPersistence.class)
	protected AssetPersistence assetPersistence;
	@BeanReference(type = com.fingence.slayer.service.BondLocalService.class)
	protected com.fingence.slayer.service.BondLocalService bondLocalService;
	@BeanReference(type = com.fingence.slayer.service.BondService.class)
	protected com.fingence.slayer.service.BondService bondService;
	@BeanReference(type = BondPersistence.class)
	protected BondPersistence bondPersistence;
	@BeanReference(type = com.fingence.slayer.service.BridgeLocalService.class)
	protected com.fingence.slayer.service.BridgeLocalService bridgeLocalService;
	@BeanReference(type = com.fingence.slayer.service.BridgeService.class)
	protected com.fingence.slayer.service.BridgeService bridgeService;
	@BeanReference(type = com.fingence.slayer.service.CurrencyLocalService.class)
	protected com.fingence.slayer.service.CurrencyLocalService currencyLocalService;
	@BeanReference(type = com.fingence.slayer.service.CurrencyService.class)
	protected com.fingence.slayer.service.CurrencyService currencyService;
	@BeanReference(type = CurrencyPersistence.class)
	protected CurrencyPersistence currencyPersistence;
	@BeanReference(type = com.fingence.slayer.service.DividendLocalService.class)
	protected com.fingence.slayer.service.DividendLocalService dividendLocalService;
	@BeanReference(type = com.fingence.slayer.service.DividendService.class)
	protected com.fingence.slayer.service.DividendService dividendService;
	@BeanReference(type = DividendPersistence.class)
	protected DividendPersistence dividendPersistence;
	@BeanReference(type = com.fingence.slayer.service.EquityLocalService.class)
	protected com.fingence.slayer.service.EquityLocalService equityLocalService;
	@BeanReference(type = com.fingence.slayer.service.EquityService.class)
	protected com.fingence.slayer.service.EquityService equityService;
	@BeanReference(type = EquityPersistence.class)
	protected EquityPersistence equityPersistence;
	@BeanReference(type = com.fingence.slayer.service.HistoryLocalService.class)
	protected com.fingence.slayer.service.HistoryLocalService historyLocalService;
	@BeanReference(type = com.fingence.slayer.service.HistoryService.class)
	protected com.fingence.slayer.service.HistoryService historyService;
	@BeanReference(type = HistoryPersistence.class)
	protected HistoryPersistence historyPersistence;
	@BeanReference(type = com.fingence.slayer.service.MutualFundLocalService.class)
	protected com.fingence.slayer.service.MutualFundLocalService mutualFundLocalService;
	@BeanReference(type = com.fingence.slayer.service.MutualFundService.class)
	protected com.fingence.slayer.service.MutualFundService mutualFundService;
	@BeanReference(type = MutualFundPersistence.class)
	protected MutualFundPersistence mutualFundPersistence;
	@BeanReference(type = com.fingence.slayer.service.MyResultLocalService.class)
	protected com.fingence.slayer.service.MyResultLocalService myResultLocalService;
	@BeanReference(type = com.fingence.slayer.service.MyResultService.class)
	protected com.fingence.slayer.service.MyResultService myResultService;
	@BeanReference(type = MyResultPersistence.class)
	protected MyResultPersistence myResultPersistence;
	@BeanReference(type = MyResultFinder.class)
	protected MyResultFinder myResultFinder;
	@BeanReference(type = com.fingence.slayer.service.PortfolioLocalService.class)
	protected com.fingence.slayer.service.PortfolioLocalService portfolioLocalService;
	@BeanReference(type = com.fingence.slayer.service.PortfolioService.class)
	protected com.fingence.slayer.service.PortfolioService portfolioService;
	@BeanReference(type = PortfolioPersistence.class)
	protected PortfolioPersistence portfolioPersistence;
	@BeanReference(type = com.fingence.slayer.service.PortfolioItemLocalService.class)
	protected com.fingence.slayer.service.PortfolioItemLocalService portfolioItemLocalService;
	@BeanReference(type = com.fingence.slayer.service.PortfolioItemService.class)
	protected com.fingence.slayer.service.PortfolioItemService portfolioItemService;
	@BeanReference(type = PortfolioItemPersistence.class)
	protected PortfolioItemPersistence portfolioItemPersistence;
	@BeanReference(type = com.fingence.slayer.service.RatingLocalService.class)
	protected com.fingence.slayer.service.RatingLocalService ratingLocalService;
	@BeanReference(type = com.fingence.slayer.service.RatingService.class)
	protected com.fingence.slayer.service.RatingService ratingService;
	@BeanReference(type = RatingPersistence.class)
	protected RatingPersistence ratingPersistence;
	@BeanReference(type = com.fingence.slayer.service.ReportConfigLocalService.class)
	protected com.fingence.slayer.service.ReportConfigLocalService reportConfigLocalService;
	@BeanReference(type = com.fingence.slayer.service.ReportConfigService.class)
	protected com.fingence.slayer.service.ReportConfigService reportConfigService;
	@BeanReference(type = ReportConfigPersistence.class)
	protected ReportConfigPersistence reportConfigPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private ReportConfigServiceClpInvoker _clpInvoker = new ReportConfigServiceClpInvoker();
}