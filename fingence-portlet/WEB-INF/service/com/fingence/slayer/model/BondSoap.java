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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.fingence.slayer.service.http.BondServiceSoap}.
 *
 * @author Ahmed Hasan
 * @see com.fingence.slayer.service.http.BondServiceSoap
 * @generated
 */
public class BondSoap implements Serializable {
	public static BondSoap toSoapModel(Bond model) {
		BondSoap soapModel = new BondSoap();

		soapModel.setAssetId(model.getAssetId());
		soapModel.setIssuer_bulk(model.getIssuer_bulk());
		soapModel.setCpn(model.getCpn());
		soapModel.setCpn_typ(model.getCpn_typ());
		soapModel.setMty_typ(model.getMty_typ());
		soapModel.setMty_years_tdy(model.getMty_years_tdy());
		soapModel.setYld_ytm_ask(model.getYld_ytm_ask());
		soapModel.setYld_ytm_bid(model.getYld_ytm_bid());
		soapModel.setYld_cur_mid(model.getYld_cur_mid());
		soapModel.setIssue_dt(model.getIssue_dt());
		soapModel.setMaturity_dt(model.getMaturity_dt());
		soapModel.setCalc_typ(model.getCalc_typ());
		soapModel.setIs_bond_no_calctyp(model.getIs_bond_no_calctyp());
		soapModel.setCollat_typ(model.getCollat_typ());
		soapModel.setBb_composite(model.getBb_composite());
		soapModel.setRtg_sp(model.getRtg_sp());
		soapModel.setRtg_moody(model.getRtg_moody());
		soapModel.setRtg_fitch(model.getRtg_fitch());
		soapModel.setCpn_freq(model.getCpn_freq());
		soapModel.setFive_y_bid_cds_spread(model.getFive_y_bid_cds_spread());
		soapModel.setDur_mid(model.getDur_mid());
		soapModel.setPrice_to_cash_flow(model.getPrice_to_cash_flow());
		soapModel.setAmount_issued(model.getAmount_issued());
		soapModel.setAmount_outstanding(model.getAmount_outstanding());

		return soapModel;
	}

	public static BondSoap[] toSoapModels(Bond[] models) {
		BondSoap[] soapModels = new BondSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BondSoap[][] toSoapModels(Bond[][] models) {
		BondSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BondSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BondSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BondSoap[] toSoapModels(List<Bond> models) {
		List<BondSoap> soapModels = new ArrayList<BondSoap>(models.size());

		for (Bond model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BondSoap[soapModels.size()]);
	}

	public BondSoap() {
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

	public String getIssuer_bulk() {
		return _issuer_bulk;
	}

	public void setIssuer_bulk(String issuer_bulk) {
		_issuer_bulk = issuer_bulk;
	}

	public double getCpn() {
		return _cpn;
	}

	public void setCpn(double cpn) {
		_cpn = cpn;
	}

	public String getCpn_typ() {
		return _cpn_typ;
	}

	public void setCpn_typ(String cpn_typ) {
		_cpn_typ = cpn_typ;
	}

	public String getMty_typ() {
		return _mty_typ;
	}

	public void setMty_typ(String mty_typ) {
		_mty_typ = mty_typ;
	}

	public double getMty_years_tdy() {
		return _mty_years_tdy;
	}

	public void setMty_years_tdy(double mty_years_tdy) {
		_mty_years_tdy = mty_years_tdy;
	}

	public double getYld_ytm_ask() {
		return _yld_ytm_ask;
	}

	public void setYld_ytm_ask(double yld_ytm_ask) {
		_yld_ytm_ask = yld_ytm_ask;
	}

	public double getYld_ytm_bid() {
		return _yld_ytm_bid;
	}

	public void setYld_ytm_bid(double yld_ytm_bid) {
		_yld_ytm_bid = yld_ytm_bid;
	}

	public double getYld_cur_mid() {
		return _yld_cur_mid;
	}

	public void setYld_cur_mid(double yld_cur_mid) {
		_yld_cur_mid = yld_cur_mid;
	}

	public Date getIssue_dt() {
		return _issue_dt;
	}

	public void setIssue_dt(Date issue_dt) {
		_issue_dt = issue_dt;
	}

	public Date getMaturity_dt() {
		return _maturity_dt;
	}

	public void setMaturity_dt(Date maturity_dt) {
		_maturity_dt = maturity_dt;
	}

	public double getCalc_typ() {
		return _calc_typ;
	}

	public void setCalc_typ(double calc_typ) {
		_calc_typ = calc_typ;
	}

	public boolean getIs_bond_no_calctyp() {
		return _is_bond_no_calctyp;
	}

	public boolean isIs_bond_no_calctyp() {
		return _is_bond_no_calctyp;
	}

	public void setIs_bond_no_calctyp(boolean is_bond_no_calctyp) {
		_is_bond_no_calctyp = is_bond_no_calctyp;
	}

	public String getCollat_typ() {
		return _collat_typ;
	}

	public void setCollat_typ(String collat_typ) {
		_collat_typ = collat_typ;
	}

	public String getBb_composite() {
		return _bb_composite;
	}

	public void setBb_composite(String bb_composite) {
		_bb_composite = bb_composite;
	}

	public String getRtg_sp() {
		return _rtg_sp;
	}

	public void setRtg_sp(String rtg_sp) {
		_rtg_sp = rtg_sp;
	}

	public String getRtg_moody() {
		return _rtg_moody;
	}

	public void setRtg_moody(String rtg_moody) {
		_rtg_moody = rtg_moody;
	}

	public String getRtg_fitch() {
		return _rtg_fitch;
	}

	public void setRtg_fitch(String rtg_fitch) {
		_rtg_fitch = rtg_fitch;
	}

	public double getCpn_freq() {
		return _cpn_freq;
	}

	public void setCpn_freq(double cpn_freq) {
		_cpn_freq = cpn_freq;
	}

	public double getFive_y_bid_cds_spread() {
		return _five_y_bid_cds_spread;
	}

	public void setFive_y_bid_cds_spread(double five_y_bid_cds_spread) {
		_five_y_bid_cds_spread = five_y_bid_cds_spread;
	}

	public double getDur_mid() {
		return _dur_mid;
	}

	public void setDur_mid(double dur_mid) {
		_dur_mid = dur_mid;
	}

	public double getPrice_to_cash_flow() {
		return _price_to_cash_flow;
	}

	public void setPrice_to_cash_flow(double price_to_cash_flow) {
		_price_to_cash_flow = price_to_cash_flow;
	}

	public double getAmount_issued() {
		return _amount_issued;
	}

	public void setAmount_issued(double amount_issued) {
		_amount_issued = amount_issued;
	}

	public double getAmount_outstanding() {
		return _amount_outstanding;
	}

	public void setAmount_outstanding(double amount_outstanding) {
		_amount_outstanding = amount_outstanding;
	}

	private long _assetId;
	private String _issuer_bulk;
	private double _cpn;
	private String _cpn_typ;
	private String _mty_typ;
	private double _mty_years_tdy;
	private double _yld_ytm_ask;
	private double _yld_ytm_bid;
	private double _yld_cur_mid;
	private Date _issue_dt;
	private Date _maturity_dt;
	private double _calc_typ;
	private boolean _is_bond_no_calctyp;
	private String _collat_typ;
	private String _bb_composite;
	private String _rtg_sp;
	private String _rtg_moody;
	private String _rtg_fitch;
	private double _cpn_freq;
	private double _five_y_bid_cds_spread;
	private double _dur_mid;
	private double _price_to_cash_flow;
	private double _amount_issued;
	private double _amount_outstanding;
}