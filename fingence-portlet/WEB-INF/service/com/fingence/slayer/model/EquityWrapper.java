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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Equity}.
 * </p>
 *
 * @author Ahmed Hasan
 * @see Equity
 * @generated
 */
public class EquityWrapper implements Equity, ModelWrapper<Equity> {
	public EquityWrapper(Equity equity) {
		_equity = equity;
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

	/**
	* Returns the primary key of this equity.
	*
	* @return the primary key of this equity
	*/
	@Override
	public long getPrimaryKey() {
		return _equity.getPrimaryKey();
	}

	/**
	* Sets the primary key of this equity.
	*
	* @param primaryKey the primary key of this equity
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_equity.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the asset ID of this equity.
	*
	* @return the asset ID of this equity
	*/
	@Override
	public long getAssetId() {
		return _equity.getAssetId();
	}

	/**
	* Sets the asset ID of this equity.
	*
	* @param assetId the asset ID of this equity
	*/
	@Override
	public void setAssetId(long assetId) {
		_equity.setAssetId(assetId);
	}

	/**
	* Returns the eqy_alpha of this equity.
	*
	* @return the eqy_alpha of this equity
	*/
	@Override
	public double getEqy_alpha() {
		return _equity.getEqy_alpha();
	}

	/**
	* Sets the eqy_alpha of this equity.
	*
	* @param eqy_alpha the eqy_alpha of this equity
	*/
	@Override
	public void setEqy_alpha(double eqy_alpha) {
		_equity.setEqy_alpha(eqy_alpha);
	}

	/**
	* Returns the dividend_yield of this equity.
	*
	* @return the dividend_yield of this equity
	*/
	@Override
	public double getDividend_yield() {
		return _equity.getDividend_yield();
	}

	/**
	* Sets the dividend_yield of this equity.
	*
	* @param dividend_yield the dividend_yield of this equity
	*/
	@Override
	public void setDividend_yield(double dividend_yield) {
		_equity.setDividend_yield(dividend_yield);
	}

	/**
	* Returns the eqy_dvd_yld_12m of this equity.
	*
	* @return the eqy_dvd_yld_12m of this equity
	*/
	@Override
	public double getEqy_dvd_yld_12m() {
		return _equity.getEqy_dvd_yld_12m();
	}

	/**
	* Sets the eqy_dvd_yld_12m of this equity.
	*
	* @param eqy_dvd_yld_12m the eqy_dvd_yld_12m of this equity
	*/
	@Override
	public void setEqy_dvd_yld_12m(double eqy_dvd_yld_12m) {
		_equity.setEqy_dvd_yld_12m(eqy_dvd_yld_12m);
	}

	/**
	* Returns the eqy_dvd_yld_es of this equity.
	*
	* @return the eqy_dvd_yld_es of this equity
	*/
	@Override
	public double getEqy_dvd_yld_es() {
		return _equity.getEqy_dvd_yld_es();
	}

	/**
	* Sets the eqy_dvd_yld_es of this equity.
	*
	* @param eqy_dvd_yld_es the eqy_dvd_yld_es of this equity
	*/
	@Override
	public void setEqy_dvd_yld_es(double eqy_dvd_yld_es) {
		_equity.setEqy_dvd_yld_es(eqy_dvd_yld_es);
	}

	/**
	* Returns the dvd_payout_ratio of this equity.
	*
	* @return the dvd_payout_ratio of this equity
	*/
	@Override
	public double getDvd_payout_ratio() {
		return _equity.getDvd_payout_ratio();
	}

	/**
	* Sets the dvd_payout_ratio of this equity.
	*
	* @param dvd_payout_ratio the dvd_payout_ratio of this equity
	*/
	@Override
	public void setDvd_payout_ratio(double dvd_payout_ratio) {
		_equity.setDvd_payout_ratio(dvd_payout_ratio);
	}

	/**
	* Returns the pe_ratio of this equity.
	*
	* @return the pe_ratio of this equity
	*/
	@Override
	public double getPe_ratio() {
		return _equity.getPe_ratio();
	}

	/**
	* Sets the pe_ratio of this equity.
	*
	* @param pe_ratio the pe_ratio of this equity
	*/
	@Override
	public void setPe_ratio(double pe_ratio) {
		_equity.setPe_ratio(pe_ratio);
	}

	/**
	* Returns the tot_debt_to_com_eqy of this equity.
	*
	* @return the tot_debt_to_com_eqy of this equity
	*/
	@Override
	public double getTot_debt_to_com_eqy() {
		return _equity.getTot_debt_to_com_eqy();
	}

	/**
	* Sets the tot_debt_to_com_eqy of this equity.
	*
	* @param tot_debt_to_com_eqy the tot_debt_to_com_eqy of this equity
	*/
	@Override
	public void setTot_debt_to_com_eqy(double tot_debt_to_com_eqy) {
		_equity.setTot_debt_to_com_eqy(tot_debt_to_com_eqy);
	}

	/**
	* Returns the ebitda_to_revenue of this equity.
	*
	* @return the ebitda_to_revenue of this equity
	*/
	@Override
	public double getEbitda_to_revenue() {
		return _equity.getEbitda_to_revenue();
	}

	/**
	* Sets the ebitda_to_revenue of this equity.
	*
	* @param ebitda_to_revenue the ebitda_to_revenue of this equity
	*/
	@Override
	public void setEbitda_to_revenue(double ebitda_to_revenue) {
		_equity.setEbitda_to_revenue(ebitda_to_revenue);
	}

	/**
	* Returns the trail_12m_prof_margin of this equity.
	*
	* @return the trail_12m_prof_margin of this equity
	*/
	@Override
	public double getTrail_12m_prof_margin() {
		return _equity.getTrail_12m_prof_margin();
	}

	/**
	* Sets the trail_12m_prof_margin of this equity.
	*
	* @param trail_12m_prof_margin the trail_12m_prof_margin of this equity
	*/
	@Override
	public void setTrail_12m_prof_margin(double trail_12m_prof_margin) {
		_equity.setTrail_12m_prof_margin(trail_12m_prof_margin);
	}

	/**
	* Returns the best_current_ev_best_opp of this equity.
	*
	* @return the best_current_ev_best_opp of this equity
	*/
	@Override
	public double getBest_current_ev_best_opp() {
		return _equity.getBest_current_ev_best_opp();
	}

	/**
	* Sets the best_current_ev_best_opp of this equity.
	*
	* @param best_current_ev_best_opp the best_current_ev_best_opp of this equity
	*/
	@Override
	public void setBest_current_ev_best_opp(double best_current_ev_best_opp) {
		_equity.setBest_current_ev_best_opp(best_current_ev_best_opp);
	}

	/**
	* Returns the eqy_beta of this equity.
	*
	* @return the eqy_beta of this equity
	*/
	@Override
	public double getEqy_beta() {
		return _equity.getEqy_beta();
	}

	/**
	* Sets the eqy_beta of this equity.
	*
	* @param eqy_beta the eqy_beta of this equity
	*/
	@Override
	public void setEqy_beta(double eqy_beta) {
		_equity.setEqy_beta(eqy_beta);
	}

	/**
	* Returns the return_sharpe_ratio of this equity.
	*
	* @return the return_sharpe_ratio of this equity
	*/
	@Override
	public double getReturn_sharpe_ratio() {
		return _equity.getReturn_sharpe_ratio();
	}

	/**
	* Sets the return_sharpe_ratio of this equity.
	*
	* @param return_sharpe_ratio the return_sharpe_ratio of this equity
	*/
	@Override
	public void setReturn_sharpe_ratio(double return_sharpe_ratio) {
		_equity.setReturn_sharpe_ratio(return_sharpe_ratio);
	}

	/**
	* Returns the eqy_sharpe_ratio_1yr of this equity.
	*
	* @return the eqy_sharpe_ratio_1yr of this equity
	*/
	@Override
	public double getEqy_sharpe_ratio_1yr() {
		return _equity.getEqy_sharpe_ratio_1yr();
	}

	/**
	* Sets the eqy_sharpe_ratio_1yr of this equity.
	*
	* @param eqy_sharpe_ratio_1yr the eqy_sharpe_ratio_1yr of this equity
	*/
	@Override
	public void setEqy_sharpe_ratio_1yr(double eqy_sharpe_ratio_1yr) {
		_equity.setEqy_sharpe_ratio_1yr(eqy_sharpe_ratio_1yr);
	}

	/**
	* Returns the eqy_sharpe_ratio_3yr of this equity.
	*
	* @return the eqy_sharpe_ratio_3yr of this equity
	*/
	@Override
	public double getEqy_sharpe_ratio_3yr() {
		return _equity.getEqy_sharpe_ratio_3yr();
	}

	/**
	* Sets the eqy_sharpe_ratio_3yr of this equity.
	*
	* @param eqy_sharpe_ratio_3yr the eqy_sharpe_ratio_3yr of this equity
	*/
	@Override
	public void setEqy_sharpe_ratio_3yr(double eqy_sharpe_ratio_3yr) {
		_equity.setEqy_sharpe_ratio_3yr(eqy_sharpe_ratio_3yr);
	}

	/**
	* Returns the eqy_sharpe_ratio_5yr of this equity.
	*
	* @return the eqy_sharpe_ratio_5yr of this equity
	*/
	@Override
	public double getEqy_sharpe_ratio_5yr() {
		return _equity.getEqy_sharpe_ratio_5yr();
	}

	/**
	* Sets the eqy_sharpe_ratio_5yr of this equity.
	*
	* @param eqy_sharpe_ratio_5yr the eqy_sharpe_ratio_5yr of this equity
	*/
	@Override
	public void setEqy_sharpe_ratio_5yr(double eqy_sharpe_ratio_5yr) {
		_equity.setEqy_sharpe_ratio_5yr(eqy_sharpe_ratio_5yr);
	}

	@Override
	public boolean isNew() {
		return _equity.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_equity.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _equity.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_equity.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _equity.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _equity.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_equity.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _equity.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_equity.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_equity.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_equity.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EquityWrapper((Equity)_equity.clone());
	}

	@Override
	public int compareTo(Equity equity) {
		return _equity.compareTo(equity);
	}

	@Override
	public int hashCode() {
		return _equity.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<Equity> toCacheModel() {
		return _equity.toCacheModel();
	}

	@Override
	public Equity toEscapedModel() {
		return new EquityWrapper(_equity.toEscapedModel());
	}

	@Override
	public Equity toUnescapedModel() {
		return new EquityWrapper(_equity.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _equity.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _equity.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_equity.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EquityWrapper)) {
			return false;
		}

		EquityWrapper equityWrapper = (EquityWrapper)obj;

		if (Validator.equals(_equity, equityWrapper._equity)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Equity getWrappedEquity() {
		return _equity;
	}

	@Override
	public Equity getWrappedModel() {
		return _equity;
	}

	@Override
	public void resetOriginalValues() {
		_equity.resetOriginalValues();
	}

	private Equity _equity;
}