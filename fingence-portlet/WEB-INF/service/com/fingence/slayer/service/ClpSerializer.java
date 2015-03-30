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

package com.fingence.slayer.service;

import com.fingence.slayer.model.AssetClp;
import com.fingence.slayer.model.BondClp;
import com.fingence.slayer.model.CurrencyClp;
import com.fingence.slayer.model.DividendClp;
import com.fingence.slayer.model.EquityClp;
import com.fingence.slayer.model.HistoryClp;
import com.fingence.slayer.model.MutualFundClp;
import com.fingence.slayer.model.MyResultClp;
import com.fingence.slayer.model.PortfolioClp;
import com.fingence.slayer.model.PortfolioItemClp;
import com.fingence.slayer.model.RatingClp;
import com.fingence.slayer.model.ReportConfigClp;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ahmed Hasan
 */
public class ClpSerializer {
	public static String getServletContextName() {
		if (Validator.isNotNull(_servletContextName)) {
			return _servletContextName;
		}

		synchronized (ClpSerializer.class) {
			if (Validator.isNotNull(_servletContextName)) {
				return _servletContextName;
			}

			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Class<?> portletPropsClass = classLoader.loadClass(
						"com.liferay.util.portlet.PortletProps");

				Method getMethod = portletPropsClass.getMethod("get",
						new Class<?>[] { String.class });

				String portletPropsServletContextName = (String)getMethod.invoke(null,
						"fingence-portlet-deployment-context");

				if (Validator.isNotNull(portletPropsServletContextName)) {
					_servletContextName = portletPropsServletContextName;
				}
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info(
						"Unable to locate deployment context from portlet properties");
				}
			}

			if (Validator.isNull(_servletContextName)) {
				try {
					String propsUtilServletContextName = PropsUtil.get(
							"fingence-portlet-deployment-context");

					if (Validator.isNotNull(propsUtilServletContextName)) {
						_servletContextName = propsUtilServletContextName;
					}
				}
				catch (Throwable t) {
					if (_log.isInfoEnabled()) {
						_log.info(
							"Unable to locate deployment context from portal properties");
					}
				}
			}

			if (Validator.isNull(_servletContextName)) {
				_servletContextName = "fingence-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(AssetClp.class.getName())) {
			return translateInputAsset(oldModel);
		}

		if (oldModelClassName.equals(BondClp.class.getName())) {
			return translateInputBond(oldModel);
		}

		if (oldModelClassName.equals(CurrencyClp.class.getName())) {
			return translateInputCurrency(oldModel);
		}

		if (oldModelClassName.equals(DividendClp.class.getName())) {
			return translateInputDividend(oldModel);
		}

		if (oldModelClassName.equals(EquityClp.class.getName())) {
			return translateInputEquity(oldModel);
		}

		if (oldModelClassName.equals(HistoryClp.class.getName())) {
			return translateInputHistory(oldModel);
		}

		if (oldModelClassName.equals(MutualFundClp.class.getName())) {
			return translateInputMutualFund(oldModel);
		}

		if (oldModelClassName.equals(MyResultClp.class.getName())) {
			return translateInputMyResult(oldModel);
		}

		if (oldModelClassName.equals(PortfolioClp.class.getName())) {
			return translateInputPortfolio(oldModel);
		}

		if (oldModelClassName.equals(PortfolioItemClp.class.getName())) {
			return translateInputPortfolioItem(oldModel);
		}

		if (oldModelClassName.equals(RatingClp.class.getName())) {
			return translateInputRating(oldModel);
		}

		if (oldModelClassName.equals(ReportConfigClp.class.getName())) {
			return translateInputReportConfig(oldModel);
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInputAsset(BaseModel<?> oldModel) {
		AssetClp oldClpModel = (AssetClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getAssetRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputBond(BaseModel<?> oldModel) {
		BondClp oldClpModel = (BondClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getBondRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputCurrency(BaseModel<?> oldModel) {
		CurrencyClp oldClpModel = (CurrencyClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCurrencyRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDividend(BaseModel<?> oldModel) {
		DividendClp oldClpModel = (DividendClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDividendRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEquity(BaseModel<?> oldModel) {
		EquityClp oldClpModel = (EquityClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEquityRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputHistory(BaseModel<?> oldModel) {
		HistoryClp oldClpModel = (HistoryClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getHistoryRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputMutualFund(BaseModel<?> oldModel) {
		MutualFundClp oldClpModel = (MutualFundClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getMutualFundRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputMyResult(BaseModel<?> oldModel) {
		MyResultClp oldClpModel = (MyResultClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getMyResultRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPortfolio(BaseModel<?> oldModel) {
		PortfolioClp oldClpModel = (PortfolioClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPortfolioRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputPortfolioItem(BaseModel<?> oldModel) {
		PortfolioItemClp oldClpModel = (PortfolioItemClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getPortfolioItemRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputRating(BaseModel<?> oldModel) {
		RatingClp oldClpModel = (RatingClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getRatingRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputReportConfig(BaseModel<?> oldModel) {
		ReportConfigClp oldClpModel = (ReportConfigClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getReportConfigRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals("com.fingence.slayer.model.impl.AssetImpl")) {
			return translateOutputAsset(oldModel);
		}

		if (oldModelClassName.equals("com.fingence.slayer.model.impl.BondImpl")) {
			return translateOutputBond(oldModel);
		}

		if (oldModelClassName.equals(
					"com.fingence.slayer.model.impl.CurrencyImpl")) {
			return translateOutputCurrency(oldModel);
		}

		if (oldModelClassName.equals(
					"com.fingence.slayer.model.impl.DividendImpl")) {
			return translateOutputDividend(oldModel);
		}

		if (oldModelClassName.equals(
					"com.fingence.slayer.model.impl.EquityImpl")) {
			return translateOutputEquity(oldModel);
		}

		if (oldModelClassName.equals(
					"com.fingence.slayer.model.impl.HistoryImpl")) {
			return translateOutputHistory(oldModel);
		}

		if (oldModelClassName.equals(
					"com.fingence.slayer.model.impl.MutualFundImpl")) {
			return translateOutputMutualFund(oldModel);
		}

		if (oldModelClassName.equals(
					"com.fingence.slayer.model.impl.MyResultImpl")) {
			return translateOutputMyResult(oldModel);
		}

		if (oldModelClassName.equals(
					"com.fingence.slayer.model.impl.PortfolioImpl")) {
			return translateOutputPortfolio(oldModel);
		}

		if (oldModelClassName.equals(
					"com.fingence.slayer.model.impl.PortfolioItemImpl")) {
			return translateOutputPortfolioItem(oldModel);
		}

		if (oldModelClassName.equals(
					"com.fingence.slayer.model.impl.RatingImpl")) {
			return translateOutputRating(oldModel);
		}

		if (oldModelClassName.equals(
					"com.fingence.slayer.model.impl.ReportConfigImpl")) {
			return translateOutputReportConfig(oldModel);
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Throwable translateThrowable(Throwable throwable) {
		if (_useReflectionToTranslateThrowable) {
			try {
				UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

				objectOutputStream.writeObject(throwable);

				objectOutputStream.flush();
				objectOutputStream.close();

				UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
						0, unsyncByteArrayOutputStream.size());

				Thread currentThread = Thread.currentThread();

				ClassLoader contextClassLoader = currentThread.getContextClassLoader();

				ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
						contextClassLoader);

				throwable = (Throwable)objectInputStream.readObject();

				objectInputStream.close();

				return throwable;
			}
			catch (SecurityException se) {
				if (_log.isInfoEnabled()) {
					_log.info("Do not use reflection to translate throwable");
				}

				_useReflectionToTranslateThrowable = false;
			}
			catch (Throwable throwable2) {
				_log.error(throwable2, throwable2);

				return throwable2;
			}
		}

		Class<?> clazz = throwable.getClass();

		String className = clazz.getName();

		if (className.equals(PortalException.class.getName())) {
			return new PortalException();
		}

		if (className.equals(SystemException.class.getName())) {
			return new SystemException();
		}

		if (className.equals("com.fingence.slayer.NoSuchAssetException")) {
			return new com.fingence.slayer.NoSuchAssetException();
		}

		if (className.equals("com.fingence.slayer.NoSuchBondException")) {
			return new com.fingence.slayer.NoSuchBondException();
		}

		if (className.equals("com.fingence.slayer.NoSuchCurrencyException")) {
			return new com.fingence.slayer.NoSuchCurrencyException();
		}

		if (className.equals("com.fingence.slayer.NoSuchDividendException")) {
			return new com.fingence.slayer.NoSuchDividendException();
		}

		if (className.equals("com.fingence.slayer.NoSuchEquityException")) {
			return new com.fingence.slayer.NoSuchEquityException();
		}

		if (className.equals("com.fingence.slayer.NoSuchHistoryException")) {
			return new com.fingence.slayer.NoSuchHistoryException();
		}

		if (className.equals("com.fingence.slayer.NoSuchMutualFundException")) {
			return new com.fingence.slayer.NoSuchMutualFundException();
		}

		if (className.equals("com.fingence.slayer.NoSuchMyResultException")) {
			return new com.fingence.slayer.NoSuchMyResultException();
		}

		if (className.equals("com.fingence.slayer.NoSuchPortfolioException")) {
			return new com.fingence.slayer.NoSuchPortfolioException();
		}

		if (className.equals("com.fingence.slayer.NoSuchPortfolioItemException")) {
			return new com.fingence.slayer.NoSuchPortfolioItemException();
		}

		if (className.equals("com.fingence.slayer.NoSuchRatingException")) {
			return new com.fingence.slayer.NoSuchRatingException();
		}

		if (className.equals("com.fingence.slayer.NoSuchReportConfigException")) {
			return new com.fingence.slayer.NoSuchReportConfigException();
		}

		return throwable;
	}

	public static Object translateOutputAsset(BaseModel<?> oldModel) {
		AssetClp newModel = new AssetClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setAssetRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputBond(BaseModel<?> oldModel) {
		BondClp newModel = new BondClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setBondRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputCurrency(BaseModel<?> oldModel) {
		CurrencyClp newModel = new CurrencyClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCurrencyRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDividend(BaseModel<?> oldModel) {
		DividendClp newModel = new DividendClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDividendRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEquity(BaseModel<?> oldModel) {
		EquityClp newModel = new EquityClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEquityRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputHistory(BaseModel<?> oldModel) {
		HistoryClp newModel = new HistoryClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setHistoryRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputMutualFund(BaseModel<?> oldModel) {
		MutualFundClp newModel = new MutualFundClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setMutualFundRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputMyResult(BaseModel<?> oldModel) {
		MyResultClp newModel = new MyResultClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setMyResultRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPortfolio(BaseModel<?> oldModel) {
		PortfolioClp newModel = new PortfolioClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPortfolioRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputPortfolioItem(BaseModel<?> oldModel) {
		PortfolioItemClp newModel = new PortfolioItemClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setPortfolioItemRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputRating(BaseModel<?> oldModel) {
		RatingClp newModel = new RatingClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setRatingRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputReportConfig(BaseModel<?> oldModel) {
		ReportConfigClp newModel = new ReportConfigClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setReportConfigRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}