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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.fingence.slayer.service.http.EquityServiceSoap}.
 *
 * @author Ahmed Hasan
 * @see com.fingence.slayer.service.http.EquityServiceSoap
 * @generated
 */
public class EquitySoap implements Serializable {
	public static EquitySoap toSoapModel(Equity model) {
		EquitySoap soapModel = new EquitySoap();

		soapModel.setAssetId(model.getAssetId());
		soapModel.setEqy_alpha(model.getEqy_alpha());
		soapModel.setDividend_yield(model.getDividend_yield());
		soapModel.setEqy_dvd_yld_12m(model.getEqy_dvd_yld_12m());
		soapModel.setEqy_dvd_yld_es(model.getEqy_dvd_yld_es());
		soapModel.setDvd_payout_ratio(model.getDvd_payout_ratio());
		soapModel.setPe_ratio(model.getPe_ratio());
		soapModel.setTot_debt_to_com_eqy(model.getTot_debt_to_com_eqy());
		soapModel.setEbitda_to_revenue(model.getEbitda_to_revenue());
		soapModel.setTrail_12m_prof_margin(model.getTrail_12m_prof_margin());
		soapModel.setBest_current_ev_best_opp(model.getBest_current_ev_best_opp());
		soapModel.setEqy_beta(model.getEqy_beta());
		soapModel.setReturn_sharpe_ratio(model.getReturn_sharpe_ratio());
		soapModel.setEqy_sharpe_ratio_1yr(model.getEqy_sharpe_ratio_1yr());
		soapModel.setEqy_sharpe_ratio_3yr(model.getEqy_sharpe_ratio_3yr());
		soapModel.setEqy_sharpe_ratio_5yr(model.getEqy_sharpe_ratio_5yr());

		return soapModel;
	}

	public static EquitySoap[] toSoapModels(Equity[] models) {
		EquitySoap[] soapModels = new EquitySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EquitySoap[][] toSoapModels(Equity[][] models) {
		EquitySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EquitySoap[models.length][models[0].length];
		}
		else {
			soapModels = new EquitySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EquitySoap[] toSoapModels(List<Equity> models) {
		List<EquitySoap> soapModels = new ArrayList<EquitySoap>(models.size());

		for (Equity model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EquitySoap[soapModels.size()]);
	}

	public EquitySoap() {
	}

	public long getPrimaryKey() {
		return _assetId;
	}

	public void setPrimaryKey(long pk) {
		setAssetId(pk);
	}

	public long getAssetId() {
		return _assetId;
	}

	public void setAssetId(long assetId) {
		_assetId = assetId;
	}

	public double getEqy_alpha() {
		return _eqy_alpha;
	}

	public void setEqy_alpha(double eqy_alpha) {
		_eqy_alpha = eqy_alpha;
	}

	public double getDividend_yield() {
		return _dividend_yield;
	}

	public void setDividend_yield(double dividend_yield) {
		_dividend_yield = dividend_yield;
	}

	public double getEqy_dvd_yld_12m() {
		return _eqy_dvd_yld_12m;
	}

	public void setEqy_dvd_yld_12m(double eqy_dvd_yld_12m) {
		_eqy_dvd_yld_12m = eqy_dvd_yld_12m;
	}

	public double getEqy_dvd_yld_es() {
		return _eqy_dvd_yld_es;
	}

	public void setEqy_dvd_yld_es(double eqy_dvd_yld_es) {
		_eqy_dvd_yld_es = eqy_dvd_yld_es;
	}

	public double getDvd_payout_ratio() {
		return _dvd_payout_ratio;
	}

	public void setDvd_payout_ratio(double dvd_payout_ratio) {
		_dvd_payout_ratio = dvd_payout_ratio;
	}

	public double getPe_ratio() {
		return _pe_ratio;
	}

	public void setPe_ratio(double pe_ratio) {
		_pe_ratio = pe_ratio;
	}

	public double getTot_debt_to_com_eqy() {
		return _tot_debt_to_com_eqy;
	}

	public void setTot_debt_to_com_eqy(double tot_debt_to_com_eqy) {
		_tot_debt_to_com_eqy = tot_debt_to_com_eqy;
	}

	public double getEbitda_to_revenue() {
		return _ebitda_to_revenue;
	}

	public void setEbitda_to_revenue(double ebitda_to_revenue) {
		_ebitda_to_revenue = ebitda_to_revenue;
	}

	public double getTrail_12m_prof_margin() {
		return _trail_12m_prof_margin;
	}

	public void setTrail_12m_prof_margin(double trail_12m_prof_margin) {
		_trail_12m_prof_margin = trail_12m_prof_margin;
	}

	public double getBest_current_ev_best_opp() {
		return _best_current_ev_best_opp;
	}

	public void setBest_current_ev_best_opp(double best_current_ev_best_opp) {
		_best_current_ev_best_opp = best_current_ev_best_opp;
	}

	public double getEqy_beta() {
		return _eqy_beta;
	}

	public void setEqy_beta(double eqy_beta) {
		_eqy_beta = eqy_beta;
	}

	public double getReturn_sharpe_ratio() {
		return _return_sharpe_ratio;
	}

	public void setReturn_sharpe_ratio(double return_sharpe_ratio) {
		_return_sharpe_ratio = return_sharpe_ratio;
	}

	public double getEqy_sharpe_ratio_1yr() {
		return _eqy_sharpe_ratio_1yr;
	}

	public void setEqy_sharpe_ratio_1yr(double eqy_sharpe_ratio_1yr) {
		_eqy_sharpe_ratio_1yr = eqy_sharpe_ratio_1yr;
	}

	public double getEqy_sharpe_ratio_3yr() {
		return _eqy_sharpe_ratio_3yr;
	}

	public void setEqy_sharpe_ratio_3yr(double eqy_sharpe_ratio_3yr) {
		_eqy_sharpe_ratio_3yr = eqy_sharpe_ratio_3yr;
	}

	public double getEqy_sharpe_ratio_5yr() {
		return _eqy_sharpe_ratio_5yr;
	}

	public void setEqy_sharpe_ratio_5yr(double eqy_sharpe_ratio_5yr) {
		_eqy_sharpe_ratio_5yr = eqy_sharpe_ratio_5yr;
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
}