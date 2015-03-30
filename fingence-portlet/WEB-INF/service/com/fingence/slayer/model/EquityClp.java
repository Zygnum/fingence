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

package com.fingence.slayer.model;

import com.fingence.slayer.service.ClpSerializer;
import com.fingence.slayer.service.EquityLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ahmed Hasan
 */
public class EquityClp extends BaseModelImpl<Equity> implements Equity {
	public EquityClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Equity.class;
	}

	@Override
	public String getModelClassName() {
		return Equity.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _assetId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAssetId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _assetId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("assetId", getAssetId());
		attributes.put("eqy_alpha", getEqy_alpha());
		attributes.put("dividend_yield", getDividend_yield());
		attributes.put("eqy_dvd_yld_12m", getEqy_dvd_yld_12m());
		attributes.put("eqy_dvd_yld_es", getEqy_dvd_yld_es());
		attributes.put("dvd_payout_ratio", getDvd_payout_ratio());
		attributes.put("pe_ratio", getPe_ratio());
		attributes.put("tot_debt_to_com_eqy", getTot_debt_to_com_eqy());
		attributes.put("ebitda_to_revenue", getEbitda_to_revenue());
		attributes.put("trail_12m_prof_margin", getTrail_12m_prof_margin());
		attributes.put("best_current_ev_best_opp", getBest_current_ev_best_opp());
		attributes.put("eqy_beta", getEqy_beta());
		attributes.put("return_sharpe_ratio", getReturn_sharpe_ratio());
		attributes.put("eqy_sharpe_ratio_1yr", getEqy_sharpe_ratio_1yr());
		attributes.put("eqy_sharpe_ratio_3yr", getEqy_sharpe_ratio_3yr());
		attributes.put("eqy_sharpe_ratio_5yr", getEqy_sharpe_ratio_5yr());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long assetId = (Long)attributes.get("assetId");

		if (assetId != null) {
			setAssetId(assetId);
		}

		Double eqy_alpha = (Double)attributes.get("eqy_alpha");

		if (eqy_alpha != null) {
			setEqy_alpha(eqy_alpha);
		}

		Double dividend_yield = (Double)attributes.get("dividend_yield");

		if (dividend_yield != null) {
			setDividend_yield(dividend_yield);
		}

		Double eqy_dvd_yld_12m = (Double)attributes.get("eqy_dvd_yld_12m");

		if (eqy_dvd_yld_12m != null) {
			setEqy_dvd_yld_12m(eqy_dvd_yld_12m);
		}

		Double eqy_dvd_yld_es = (Double)attributes.get("eqy_dvd_yld_es");

		if (eqy_dvd_yld_es != null) {
			setEqy_dvd_yld_es(eqy_dvd_yld_es);
		}

		Double dvd_payout_ratio = (Double)attributes.get("dvd_payout_ratio");

		if (dvd_payout_ratio != null) {
			setDvd_payout_ratio(dvd_payout_ratio);
		}

		Double pe_ratio = (Double)attributes.get("pe_ratio");

		if (pe_ratio != null) {
			setPe_ratio(pe_ratio);
		}

		Double tot_debt_to_com_eqy = (Double)attributes.get(
				"tot_debt_to_com_eqy");

		if (tot_debt_to_com_eqy != null) {
			setTot_debt_to_com_eqy(tot_debt_to_com_eqy);
		}

		Double ebitda_to_revenue = (Double)attributes.get("ebitda_to_revenue");

		if (ebitda_to_revenue != null) {
			setEbitda_to_revenue(ebitda_to_revenue);
		}

		Double trail_12m_prof_margin = (Double)attributes.get(
				"trail_12m_prof_margin");

		if (trail_12m_prof_margin != null) {
			setTrail_12m_prof_margin(trail_12m_prof_margin);
		}

		Double best_current_ev_best_opp = (Double)attributes.get(
				"best_current_ev_best_opp");

		if (best_current_ev_best_opp != null) {
			setBest_current_ev_best_opp(best_current_ev_best_opp);
		}

		Double eqy_beta = (Double)attributes.get("eqy_beta");

		if (eqy_beta != null) {
			setEqy_beta(eqy_beta);
		}

		Double return_sharpe_ratio = (Double)attributes.get(
				"return_sharpe_ratio");

		if (return_sharpe_ratio != null) {
			setReturn_sharpe_ratio(return_sharpe_ratio);
		}

		Double eqy_sharpe_ratio_1yr = (Double)attributes.get(
				"eqy_sharpe_ratio_1yr");

		if (eqy_sharpe_ratio_1yr != null) {
			setEqy_sharpe_ratio_1yr(eqy_sharpe_ratio_1yr);
		}

		Double eqy_sharpe_ratio_3yr = (Double)attributes.get(
				"eqy_sharpe_ratio_3yr");

		if (eqy_sharpe_ratio_3yr != null) {
			setEqy_sharpe_ratio_3yr(eqy_sharpe_ratio_3yr);
		}

		Double eqy_sharpe_ratio_5yr = (Double)attributes.get(
				"eqy_sharpe_ratio_5yr");

		if (eqy_sharpe_ratio_5yr != null) {
			setEqy_sharpe_ratio_5yr(eqy_sharpe_ratio_5yr);
		}
	}

	@Override
	public long getAssetId() {
		return _assetId;
	}

	@Override
	public void setAssetId(long assetId) {
		_assetId = assetId;

		if (_equityRemoteModel != null) {
			try {
				Class<?> clazz = _equityRemoteModel.getClass();

				Method method = clazz.getMethod("setAssetId", long.class);

				method.invoke(_equityRemoteModel, assetId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getEqy_alpha() {
		return _eqy_alpha;
	}

	@Override
	public void setEqy_alpha(double eqy_alpha) {
		_eqy_alpha = eqy_alpha;

		if (_equityRemoteModel != null) {
			try {
				Class<?> clazz = _equityRemoteModel.getClass();

				Method method = clazz.getMethod("setEqy_alpha", double.class);

				method.invoke(_equityRemoteModel, eqy_alpha);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getDividend_yield() {
		return _dividend_yield;
	}

	@Override
	public void setDividend_yield(double dividend_yield) {
		_dividend_yield = dividend_yield;

		if (_equityRemoteModel != null) {
			try {
				Class<?> clazz = _equityRemoteModel.getClass();

				Method method = clazz.getMethod("setDividend_yield",
						double.class);

				method.invoke(_equityRemoteModel, dividend_yield);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getEqy_dvd_yld_12m() {
		return _eqy_dvd_yld_12m;
	}

	@Override
	public void setEqy_dvd_yld_12m(double eqy_dvd_yld_12m) {
		_eqy_dvd_yld_12m = eqy_dvd_yld_12m;

		if (_equityRemoteModel != null) {
			try {
				Class<?> clazz = _equityRemoteModel.getClass();

				Method method = clazz.getMethod("setEqy_dvd_yld_12m",
						double.class);

				method.invoke(_equityRemoteModel, eqy_dvd_yld_12m);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getEqy_dvd_yld_es() {
		return _eqy_dvd_yld_es;
	}

	@Override
	public void setEqy_dvd_yld_es(double eqy_dvd_yld_es) {
		_eqy_dvd_yld_es = eqy_dvd_yld_es;

		if (_equityRemoteModel != null) {
			try {
				Class<?> clazz = _equityRemoteModel.getClass();

				Method method = clazz.getMethod("setEqy_dvd_yld_es",
						double.class);

				method.invoke(_equityRemoteModel, eqy_dvd_yld_es);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getDvd_payout_ratio() {
		return _dvd_payout_ratio;
	}

	@Override
	public void setDvd_payout_ratio(double dvd_payout_ratio) {
		_dvd_payout_ratio = dvd_payout_ratio;

		if (_equityRemoteModel != null) {
			try {
				Class<?> clazz = _equityRemoteModel.getClass();

				Method method = clazz.getMethod("setDvd_payout_ratio",
						double.class);

				method.invoke(_equityRemoteModel, dvd_payout_ratio);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getPe_ratio() {
		return _pe_ratio;
	}

	@Override
	public void setPe_ratio(double pe_ratio) {
		_pe_ratio = pe_ratio;

		if (_equityRemoteModel != null) {
			try {
				Class<?> clazz = _equityRemoteModel.getClass();

				Method method = clazz.getMethod("setPe_ratio", double.class);

				method.invoke(_equityRemoteModel, pe_ratio);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getTot_debt_to_com_eqy() {
		return _tot_debt_to_com_eqy;
	}

	@Override
	public void setTot_debt_to_com_eqy(double tot_debt_to_com_eqy) {
		_tot_debt_to_com_eqy = tot_debt_to_com_eqy;

		if (_equityRemoteModel != null) {
			try {
				Class<?> clazz = _equityRemoteModel.getClass();

				Method method = clazz.getMethod("setTot_debt_to_com_eqy",
						double.class);

				method.invoke(_equityRemoteModel, tot_debt_to_com_eqy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getEbitda_to_revenue() {
		return _ebitda_to_revenue;
	}

	@Override
	public void setEbitda_to_revenue(double ebitda_to_revenue) {
		_ebitda_to_revenue = ebitda_to_revenue;

		if (_equityRemoteModel != null) {
			try {
				Class<?> clazz = _equityRemoteModel.getClass();

				Method method = clazz.getMethod("setEbitda_to_revenue",
						double.class);

				method.invoke(_equityRemoteModel, ebitda_to_revenue);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getTrail_12m_prof_margin() {
		return _trail_12m_prof_margin;
	}

	@Override
	public void setTrail_12m_prof_margin(double trail_12m_prof_margin) {
		_trail_12m_prof_margin = trail_12m_prof_margin;

		if (_equityRemoteModel != null) {
			try {
				Class<?> clazz = _equityRemoteModel.getClass();

				Method method = clazz.getMethod("setTrail_12m_prof_margin",
						double.class);

				method.invoke(_equityRemoteModel, trail_12m_prof_margin);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getBest_current_ev_best_opp() {
		return _best_current_ev_best_opp;
	}

	@Override
	public void setBest_current_ev_best_opp(double best_current_ev_best_opp) {
		_best_current_ev_best_opp = best_current_ev_best_opp;

		if (_equityRemoteModel != null) {
			try {
				Class<?> clazz = _equityRemoteModel.getClass();

				Method method = clazz.getMethod("setBest_current_ev_best_opp",
						double.class);

				method.invoke(_equityRemoteModel, best_current_ev_best_opp);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getEqy_beta() {
		return _eqy_beta;
	}

	@Override
	public void setEqy_beta(double eqy_beta) {
		_eqy_beta = eqy_beta;

		if (_equityRemoteModel != null) {
			try {
				Class<?> clazz = _equityRemoteModel.getClass();

				Method method = clazz.getMethod("setEqy_beta", double.class);

				method.invoke(_equityRemoteModel, eqy_beta);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getReturn_sharpe_ratio() {
		return _return_sharpe_ratio;
	}

	@Override
	public void setReturn_sharpe_ratio(double return_sharpe_ratio) {
		_return_sharpe_ratio = return_sharpe_ratio;

		if (_equityRemoteModel != null) {
			try {
				Class<?> clazz = _equityRemoteModel.getClass();

				Method method = clazz.getMethod("setReturn_sharpe_ratio",
						double.class);

				method.invoke(_equityRemoteModel, return_sharpe_ratio);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getEqy_sharpe_ratio_1yr() {
		return _eqy_sharpe_ratio_1yr;
	}

	@Override
	public void setEqy_sharpe_ratio_1yr(double eqy_sharpe_ratio_1yr) {
		_eqy_sharpe_ratio_1yr = eqy_sharpe_ratio_1yr;

		if (_equityRemoteModel != null) {
			try {
				Class<?> clazz = _equityRemoteModel.getClass();

				Method method = clazz.getMethod("setEqy_sharpe_ratio_1yr",
						double.class);

				method.invoke(_equityRemoteModel, eqy_sharpe_ratio_1yr);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getEqy_sharpe_ratio_3yr() {
		return _eqy_sharpe_ratio_3yr;
	}

	@Override
	public void setEqy_sharpe_ratio_3yr(double eqy_sharpe_ratio_3yr) {
		_eqy_sharpe_ratio_3yr = eqy_sharpe_ratio_3yr;

		if (_equityRemoteModel != null) {
			try {
				Class<?> clazz = _equityRemoteModel.getClass();

				Method method = clazz.getMethod("setEqy_sharpe_ratio_3yr",
						double.class);

				method.invoke(_equityRemoteModel, eqy_sharpe_ratio_3yr);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getEqy_sharpe_ratio_5yr() {
		return _eqy_sharpe_ratio_5yr;
	}

	@Override
	public void setEqy_sharpe_ratio_5yr(double eqy_sharpe_ratio_5yr) {
		_eqy_sharpe_ratio_5yr = eqy_sharpe_ratio_5yr;

		if (_equityRemoteModel != null) {
			try {
				Class<?> clazz = _equityRemoteModel.getClass();

				Method method = clazz.getMethod("setEqy_sharpe_ratio_5yr",
						double.class);

				method.invoke(_equityRemoteModel, eqy_sharpe_ratio_5yr);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getEquityRemoteModel() {
		return _equityRemoteModel;
	}

	public void setEquityRemoteModel(BaseModel<?> equityRemoteModel) {
		_equityRemoteModel = equityRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _equityRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_equityRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EquityLocalServiceUtil.addEquity(this);
		}
		else {
			EquityLocalServiceUtil.updateEquity(this);
		}
	}

	@Override
	public Equity toEscapedModel() {
		return (Equity)ProxyUtil.newProxyInstance(Equity.class.getClassLoader(),
			new Class[] { Equity.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EquityClp clone = new EquityClp();

		clone.setAssetId(getAssetId());
		clone.setEqy_alpha(getEqy_alpha());
		clone.setDividend_yield(getDividend_yield());
		clone.setEqy_dvd_yld_12m(getEqy_dvd_yld_12m());
		clone.setEqy_dvd_yld_es(getEqy_dvd_yld_es());
		clone.setDvd_payout_ratio(getDvd_payout_ratio());
		clone.setPe_ratio(getPe_ratio());
		clone.setTot_debt_to_com_eqy(getTot_debt_to_com_eqy());
		clone.setEbitda_to_revenue(getEbitda_to_revenue());
		clone.setTrail_12m_prof_margin(getTrail_12m_prof_margin());
		clone.setBest_current_ev_best_opp(getBest_current_ev_best_opp());
		clone.setEqy_beta(getEqy_beta());
		clone.setReturn_sharpe_ratio(getReturn_sharpe_ratio());
		clone.setEqy_sharpe_ratio_1yr(getEqy_sharpe_ratio_1yr());
		clone.setEqy_sharpe_ratio_3yr(getEqy_sharpe_ratio_3yr());
		clone.setEqy_sharpe_ratio_5yr(getEqy_sharpe_ratio_5yr());

		return clone;
	}

	@Override
	public int compareTo(Equity equity) {
		long primaryKey = equity.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EquityClp)) {
			return false;
		}

		EquityClp equity = (EquityClp)obj;

		long primaryKey = equity.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{assetId=");
		sb.append(getAssetId());
		sb.append(", eqy_alpha=");
		sb.append(getEqy_alpha());
		sb.append(", dividend_yield=");
		sb.append(getDividend_yield());
		sb.append(", eqy_dvd_yld_12m=");
		sb.append(getEqy_dvd_yld_12m());
		sb.append(", eqy_dvd_yld_es=");
		sb.append(getEqy_dvd_yld_es());
		sb.append(", dvd_payout_ratio=");
		sb.append(getDvd_payout_ratio());
		sb.append(", pe_ratio=");
		sb.append(getPe_ratio());
		sb.append(", tot_debt_to_com_eqy=");
		sb.append(getTot_debt_to_com_eqy());
		sb.append(", ebitda_to_revenue=");
		sb.append(getEbitda_to_revenue());
		sb.append(", trail_12m_prof_margin=");
		sb.append(getTrail_12m_prof_margin());
		sb.append(", best_current_ev_best_opp=");
		sb.append(getBest_current_ev_best_opp());
		sb.append(", eqy_beta=");
		sb.append(getEqy_beta());
		sb.append(", return_sharpe_ratio=");
		sb.append(getReturn_sharpe_ratio());
		sb.append(", eqy_sharpe_ratio_1yr=");
		sb.append(getEqy_sharpe_ratio_1yr());
		sb.append(", eqy_sharpe_ratio_3yr=");
		sb.append(getEqy_sharpe_ratio_3yr());
		sb.append(", eqy_sharpe_ratio_5yr=");
		sb.append(getEqy_sharpe_ratio_5yr());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(52);

		sb.append("<model><model-name>");
		sb.append("com.fingence.slayer.model.Equity");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>assetId</column-name><column-value><![CDATA[");
		sb.append(getAssetId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>eqy_alpha</column-name><column-value><![CDATA[");
		sb.append(getEqy_alpha());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dividend_yield</column-name><column-value><![CDATA[");
		sb.append(getDividend_yield());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>eqy_dvd_yld_12m</column-name><column-value><![CDATA[");
		sb.append(getEqy_dvd_yld_12m());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>eqy_dvd_yld_es</column-name><column-value><![CDATA[");
		sb.append(getEqy_dvd_yld_es());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dvd_payout_ratio</column-name><column-value><![CDATA[");
		sb.append(getDvd_payout_ratio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>pe_ratio</column-name><column-value><![CDATA[");
		sb.append(getPe_ratio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tot_debt_to_com_eqy</column-name><column-value><![CDATA[");
		sb.append(getTot_debt_to_com_eqy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ebitda_to_revenue</column-name><column-value><![CDATA[");
		sb.append(getEbitda_to_revenue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trail_12m_prof_margin</column-name><column-value><![CDATA[");
		sb.append(getTrail_12m_prof_margin());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>best_current_ev_best_opp</column-name><column-value><![CDATA[");
		sb.append(getBest_current_ev_best_opp());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>eqy_beta</column-name><column-value><![CDATA[");
		sb.append(getEqy_beta());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>return_sharpe_ratio</column-name><column-value><![CDATA[");
		sb.append(getReturn_sharpe_ratio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>eqy_sharpe_ratio_1yr</column-name><column-value><![CDATA[");
		sb.append(getEqy_sharpe_ratio_1yr());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>eqy_sharpe_ratio_3yr</column-name><column-value><![CDATA[");
		sb.append(getEqy_sharpe_ratio_3yr());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>eqy_sharpe_ratio_5yr</column-name><column-value><![CDATA[");
		sb.append(getEqy_sharpe_ratio_5yr());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _assetId;
	private double _eqy_alpha;
	private double _dividend_yield;
	private double _eqy_dvd_yld_12m;
	private double _eqy_dvd_yld_es;
	private double _dvd_payout_ratio;
	private double _pe_ratio;
	private double _tot_debt_to_com_eqy;
	private double _ebitda_to_revenue;
	private double _trail_12m_prof_margin;
	private double _best_current_ev_best_opp;
	private double _eqy_beta;
	private double _return_sharpe_ratio;
	private double _eqy_sharpe_ratio_1yr;
	private double _eqy_sharpe_ratio_3yr;
	private double _eqy_sharpe_ratio_5yr;
	private BaseModel<?> _equityRemoteModel;
}