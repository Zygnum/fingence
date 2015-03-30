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

package com.fingence.slayer.model.impl;

import com.fingence.slayer.model.Equity;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Equity in entity cache.
 *
 * @author Ahmed Hasan
 * @see Equity
 * @generated
 */
public class EquityCacheModel implements CacheModel<Equity>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{assetId=");
		sb.append(assetId);
		sb.append(", eqy_alpha=");
		sb.append(eqy_alpha);
		sb.append(", dividend_yield=");
		sb.append(dividend_yield);
		sb.append(", eqy_dvd_yld_12m=");
		sb.append(eqy_dvd_yld_12m);
		sb.append(", eqy_dvd_yld_es=");
		sb.append(eqy_dvd_yld_es);
		sb.append(", dvd_payout_ratio=");
		sb.append(dvd_payout_ratio);
		sb.append(", pe_ratio=");
		sb.append(pe_ratio);
		sb.append(", tot_debt_to_com_eqy=");
		sb.append(tot_debt_to_com_eqy);
		sb.append(", ebitda_to_revenue=");
		sb.append(ebitda_to_revenue);
		sb.append(", trail_12m_prof_margin=");
		sb.append(trail_12m_prof_margin);
		sb.append(", best_current_ev_best_opp=");
		sb.append(best_current_ev_best_opp);
		sb.append(", eqy_beta=");
		sb.append(eqy_beta);
		sb.append(", return_sharpe_ratio=");
		sb.append(return_sharpe_ratio);
		sb.append(", eqy_sharpe_ratio_1yr=");
		sb.append(eqy_sharpe_ratio_1yr);
		sb.append(", eqy_sharpe_ratio_3yr=");
		sb.append(eqy_sharpe_ratio_3yr);
		sb.append(", eqy_sharpe_ratio_5yr=");
		sb.append(eqy_sharpe_ratio_5yr);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Equity toEntityModel() {
		EquityImpl equityImpl = new EquityImpl();

		equityImpl.setAssetId(assetId);
		equityImpl.setEqy_alpha(eqy_alpha);
		equityImpl.setDividend_yield(dividend_yield);
		equityImpl.setEqy_dvd_yld_12m(eqy_dvd_yld_12m);
		equityImpl.setEqy_dvd_yld_es(eqy_dvd_yld_es);
		equityImpl.setDvd_payout_ratio(dvd_payout_ratio);
		equityImpl.setPe_ratio(pe_ratio);
		equityImpl.setTot_debt_to_com_eqy(tot_debt_to_com_eqy);
		equityImpl.setEbitda_to_revenue(ebitda_to_revenue);
		equityImpl.setTrail_12m_prof_margin(trail_12m_prof_margin);
		equityImpl.setBest_current_ev_best_opp(best_current_ev_best_opp);
		equityImpl.setEqy_beta(eqy_beta);
		equityImpl.setReturn_sharpe_ratio(return_sharpe_ratio);
		equityImpl.setEqy_sharpe_ratio_1yr(eqy_sharpe_ratio_1yr);
		equityImpl.setEqy_sharpe_ratio_3yr(eqy_sharpe_ratio_3yr);
		equityImpl.setEqy_sharpe_ratio_5yr(eqy_sharpe_ratio_5yr);

		equityImpl.resetOriginalValues();

		return equityImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		assetId = objectInput.readLong();
		eqy_alpha = objectInput.readDouble();
		dividend_yield = objectInput.readDouble();
		eqy_dvd_yld_12m = objectInput.readDouble();
		eqy_dvd_yld_es = objectInput.readDouble();
		dvd_payout_ratio = objectInput.readDouble();
		pe_ratio = objectInput.readDouble();
		tot_debt_to_com_eqy = objectInput.readDouble();
		ebitda_to_revenue = objectInput.readDouble();
		trail_12m_prof_margin = objectInput.readDouble();
		best_current_ev_best_opp = objectInput.readDouble();
		eqy_beta = objectInput.readDouble();
		return_sharpe_ratio = objectInput.readDouble();
		eqy_sharpe_ratio_1yr = objectInput.readDouble();
		eqy_sharpe_ratio_3yr = objectInput.readDouble();
		eqy_sharpe_ratio_5yr = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(assetId);
		objectOutput.writeDouble(eqy_alpha);
		objectOutput.writeDouble(dividend_yield);
		objectOutput.writeDouble(eqy_dvd_yld_12m);
		objectOutput.writeDouble(eqy_dvd_yld_es);
		objectOutput.writeDouble(dvd_payout_ratio);
		objectOutput.writeDouble(pe_ratio);
		objectOutput.writeDouble(tot_debt_to_com_eqy);
		objectOutput.writeDouble(ebitda_to_revenue);
		objectOutput.writeDouble(trail_12m_prof_margin);
		objectOutput.writeDouble(best_current_ev_best_opp);
		objectOutput.writeDouble(eqy_beta);
		objectOutput.writeDouble(return_sharpe_ratio);
		objectOutput.writeDouble(eqy_sharpe_ratio_1yr);
		objectOutput.writeDouble(eqy_sharpe_ratio_3yr);
		objectOutput.writeDouble(eqy_sharpe_ratio_5yr);
	}

	public long assetId;
	public double eqy_alpha;
	public double dividend_yield;
	public double eqy_dvd_yld_12m;
	public double eqy_dvd_yld_es;
	public double dvd_payout_ratio;
	public double pe_ratio;
	public double tot_debt_to_com_eqy;
	public double ebitda_to_revenue;
	public double trail_12m_prof_margin;
	public double best_current_ev_best_opp;
	public double eqy_beta;
	public double return_sharpe_ratio;
	public double eqy_sharpe_ratio_1yr;
	public double eqy_sharpe_ratio_3yr;
	public double eqy_sharpe_ratio_5yr;
}