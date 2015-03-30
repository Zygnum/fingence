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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Bond}.
 * </p>
 *
 * @author Ahmed Hasan
 * @see Bond
 * @generated
 */
public class BondWrapper implements Bond, ModelWrapper<Bond> {
	public BondWrapper(Bond bond) {
		_bond = bond;
	}

	@Override
	public Class<?> getModelClass() {
		return Bond.class;
	}

	@Override
	public String getModelClassName() {
		return Bond.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("assetId", getAssetId());
		attributes.put("issuer_bulk", getIssuer_bulk());
		attributes.put("cpn", getCpn());
		attributes.put("cpn_typ", getCpn_typ());
		attributes.put("mty_typ", getMty_typ());
		attributes.put("mty_years_tdy", getMty_years_tdy());
		attributes.put("yld_ytm_ask", getYld_ytm_ask());
		attributes.put("yld_ytm_bid", getYld_ytm_bid());
		attributes.put("yld_cur_mid", getYld_cur_mid());
		attributes.put("issue_dt", getIssue_dt());
		attributes.put("maturity_dt", getMaturity_dt());
		attributes.put("calc_typ", getCalc_typ());
		attributes.put("is_bond_no_calctyp", getIs_bond_no_calctyp());
		attributes.put("collat_typ", getCollat_typ());
		attributes.put("bb_composite", getBb_composite());
		attributes.put("rtg_sp", getRtg_sp());
		attributes.put("rtg_moody", getRtg_moody());
		attributes.put("rtg_fitch", getRtg_fitch());
		attributes.put("cpn_freq", getCpn_freq());
		attributes.put("five_y_bid_cds_spread", getFive_y_bid_cds_spread());
		attributes.put("dur_mid", getDur_mid());
		attributes.put("price_to_cash_flow", getPrice_to_cash_flow());
		attributes.put("amount_issued", getAmount_issued());
		attributes.put("amount_outstanding", getAmount_outstanding());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long assetId = (Long)attributes.get("assetId");

		if (assetId != null) {
			setAssetId(assetId);
		}

		String issuer_bulk = (String)attributes.get("issuer_bulk");

		if (issuer_bulk != null) {
			setIssuer_bulk(issuer_bulk);
		}

		Double cpn = (Double)attributes.get("cpn");

		if (cpn != null) {
			setCpn(cpn);
		}

		String cpn_typ = (String)attributes.get("cpn_typ");

		if (cpn_typ != null) {
			setCpn_typ(cpn_typ);
		}

		String mty_typ = (String)attributes.get("mty_typ");

		if (mty_typ != null) {
			setMty_typ(mty_typ);
		}

		Double mty_years_tdy = (Double)attributes.get("mty_years_tdy");

		if (mty_years_tdy != null) {
			setMty_years_tdy(mty_years_tdy);
		}

		Double yld_ytm_ask = (Double)attributes.get("yld_ytm_ask");

		if (yld_ytm_ask != null) {
			setYld_ytm_ask(yld_ytm_ask);
		}

		Double yld_ytm_bid = (Double)attributes.get("yld_ytm_bid");

		if (yld_ytm_bid != null) {
			setYld_ytm_bid(yld_ytm_bid);
		}

		Double yld_cur_mid = (Double)attributes.get("yld_cur_mid");

		if (yld_cur_mid != null) {
			setYld_cur_mid(yld_cur_mid);
		}

		Date issue_dt = (Date)attributes.get("issue_dt");

		if (issue_dt != null) {
			setIssue_dt(issue_dt);
		}

		Date maturity_dt = (Date)attributes.get("maturity_dt");

		if (maturity_dt != null) {
			setMaturity_dt(maturity_dt);
		}

		Double calc_typ = (Double)attributes.get("calc_typ");

		if (calc_typ != null) {
			setCalc_typ(calc_typ);
		}

		Boolean is_bond_no_calctyp = (Boolean)attributes.get(
				"is_bond_no_calctyp");

		if (is_bond_no_calctyp != null) {
			setIs_bond_no_calctyp(is_bond_no_calctyp);
		}

		String collat_typ = (String)attributes.get("collat_typ");

		if (collat_typ != null) {
			setCollat_typ(collat_typ);
		}

		String bb_composite = (String)attributes.get("bb_composite");

		if (bb_composite != null) {
			setBb_composite(bb_composite);
		}

		String rtg_sp = (String)attributes.get("rtg_sp");

		if (rtg_sp != null) {
			setRtg_sp(rtg_sp);
		}

		String rtg_moody = (String)attributes.get("rtg_moody");

		if (rtg_moody != null) {
			setRtg_moody(rtg_moody);
		}

		String rtg_fitch = (String)attributes.get("rtg_fitch");

		if (rtg_fitch != null) {
			setRtg_fitch(rtg_fitch);
		}

		Double cpn_freq = (Double)attributes.get("cpn_freq");

		if (cpn_freq != null) {
			setCpn_freq(cpn_freq);
		}

		Double five_y_bid_cds_spread = (Double)attributes.get(
				"five_y_bid_cds_spread");

		if (five_y_bid_cds_spread != null) {
			setFive_y_bid_cds_spread(five_y_bid_cds_spread);
		}

		Double dur_mid = (Double)attributes.get("dur_mid");

		if (dur_mid != null) {
			setDur_mid(dur_mid);
		}

		Double price_to_cash_flow = (Double)attributes.get("price_to_cash_flow");

		if (price_to_cash_flow != null) {
			setPrice_to_cash_flow(price_to_cash_flow);
		}

		Double amount_issued = (Double)attributes.get("amount_issued");

		if (amount_issued != null) {
			setAmount_issued(amount_issued);
		}

		Double amount_outstanding = (Double)attributes.get("amount_outstanding");

		if (amount_outstanding != null) {
			setAmount_outstanding(amount_outstanding);
		}
	}

	/**
	* Returns the primary key of this bond.
	*
	* @return the primary key of this bond
	*/
	@Override
	public long getPrimaryKey() {
		return _bond.getPrimaryKey();
	}

	/**
	* Sets the primary key of this bond.
	*
	* @param primaryKey the primary key of this bond
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_bond.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the asset ID of this bond.
	*
	* @return the asset ID of this bond
	*/
	@Override
	public long getAssetId() {
		return _bond.getAssetId();
	}

	/**
	* Sets the asset ID of this bond.
	*
	* @param assetId the asset ID of this bond
	*/
	@Override
	public void setAssetId(long assetId) {
		_bond.setAssetId(assetId);
	}

	/**
	* Returns the issuer_bulk of this bond.
	*
	* @return the issuer_bulk of this bond
	*/
	@Override
	public java.lang.String getIssuer_bulk() {
		return _bond.getIssuer_bulk();
	}

	/**
	* Sets the issuer_bulk of this bond.
	*
	* @param issuer_bulk the issuer_bulk of this bond
	*/
	@Override
	public void setIssuer_bulk(java.lang.String issuer_bulk) {
		_bond.setIssuer_bulk(issuer_bulk);
	}

	/**
	* Returns the cpn of this bond.
	*
	* @return the cpn of this bond
	*/
	@Override
	public double getCpn() {
		return _bond.getCpn();
	}

	/**
	* Sets the cpn of this bond.
	*
	* @param cpn the cpn of this bond
	*/
	@Override
	public void setCpn(double cpn) {
		_bond.setCpn(cpn);
	}

	/**
	* Returns the cpn_typ of this bond.
	*
	* @return the cpn_typ of this bond
	*/
	@Override
	public java.lang.String getCpn_typ() {
		return _bond.getCpn_typ();
	}

	/**
	* Sets the cpn_typ of this bond.
	*
	* @param cpn_typ the cpn_typ of this bond
	*/
	@Override
	public void setCpn_typ(java.lang.String cpn_typ) {
		_bond.setCpn_typ(cpn_typ);
	}

	/**
	* Returns the mty_typ of this bond.
	*
	* @return the mty_typ of this bond
	*/
	@Override
	public java.lang.String getMty_typ() {
		return _bond.getMty_typ();
	}

	/**
	* Sets the mty_typ of this bond.
	*
	* @param mty_typ the mty_typ of this bond
	*/
	@Override
	public void setMty_typ(java.lang.String mty_typ) {
		_bond.setMty_typ(mty_typ);
	}

	/**
	* Returns the mty_years_tdy of this bond.
	*
	* @return the mty_years_tdy of this bond
	*/
	@Override
	public double getMty_years_tdy() {
		return _bond.getMty_years_tdy();
	}

	/**
	* Sets the mty_years_tdy of this bond.
	*
	* @param mty_years_tdy the mty_years_tdy of this bond
	*/
	@Override
	public void setMty_years_tdy(double mty_years_tdy) {
		_bond.setMty_years_tdy(mty_years_tdy);
	}

	/**
	* Returns the yld_ytm_ask of this bond.
	*
	* @return the yld_ytm_ask of this bond
	*/
	@Override
	public double getYld_ytm_ask() {
		return _bond.getYld_ytm_ask();
	}

	/**
	* Sets the yld_ytm_ask of this bond.
	*
	* @param yld_ytm_ask the yld_ytm_ask of this bond
	*/
	@Override
	public void setYld_ytm_ask(double yld_ytm_ask) {
		_bond.setYld_ytm_ask(yld_ytm_ask);
	}

	/**
	* Returns the yld_ytm_bid of this bond.
	*
	* @return the yld_ytm_bid of this bond
	*/
	@Override
	public double getYld_ytm_bid() {
		return _bond.getYld_ytm_bid();
	}

	/**
	* Sets the yld_ytm_bid of this bond.
	*
	* @param yld_ytm_bid the yld_ytm_bid of this bond
	*/
	@Override
	public void setYld_ytm_bid(double yld_ytm_bid) {
		_bond.setYld_ytm_bid(yld_ytm_bid);
	}

	/**
	* Returns the yld_cur_mid of this bond.
	*
	* @return the yld_cur_mid of this bond
	*/
	@Override
	public double getYld_cur_mid() {
		return _bond.getYld_cur_mid();
	}

	/**
	* Sets the yld_cur_mid of this bond.
	*
	* @param yld_cur_mid the yld_cur_mid of this bond
	*/
	@Override
	public void setYld_cur_mid(double yld_cur_mid) {
		_bond.setYld_cur_mid(yld_cur_mid);
	}

	/**
	* Returns the issue_dt of this bond.
	*
	* @return the issue_dt of this bond
	*/
	@Override
	public java.util.Date getIssue_dt() {
		return _bond.getIssue_dt();
	}

	/**
	* Sets the issue_dt of this bond.
	*
	* @param issue_dt the issue_dt of this bond
	*/
	@Override
	public void setIssue_dt(java.util.Date issue_dt) {
		_bond.setIssue_dt(issue_dt);
	}

	/**
	* Returns the maturity_dt of this bond.
	*
	* @return the maturity_dt of this bond
	*/
	@Override
	public java.util.Date getMaturity_dt() {
		return _bond.getMaturity_dt();
	}

	/**
	* Sets the maturity_dt of this bond.
	*
	* @param maturity_dt the maturity_dt of this bond
	*/
	@Override
	public void setMaturity_dt(java.util.Date maturity_dt) {
		_bond.setMaturity_dt(maturity_dt);
	}

	/**
	* Returns the calc_typ of this bond.
	*
	* @return the calc_typ of this bond
	*/
	@Override
	public double getCalc_typ() {
		return _bond.getCalc_typ();
	}

	/**
	* Sets the calc_typ of this bond.
	*
	* @param calc_typ the calc_typ of this bond
	*/
	@Override
	public void setCalc_typ(double calc_typ) {
		_bond.setCalc_typ(calc_typ);
	}

	/**
	* Returns the is_bond_no_calctyp of this bond.
	*
	* @return the is_bond_no_calctyp of this bond
	*/
	@Override
	public boolean getIs_bond_no_calctyp() {
		return _bond.getIs_bond_no_calctyp();
	}

	/**
	* Returns <code>true</code> if this bond is is_bond_no_calctyp.
	*
	* @return <code>true</code> if this bond is is_bond_no_calctyp; <code>false</code> otherwise
	*/
	@Override
	public boolean isIs_bond_no_calctyp() {
		return _bond.isIs_bond_no_calctyp();
	}

	/**
	* Sets whether this bond is is_bond_no_calctyp.
	*
	* @param is_bond_no_calctyp the is_bond_no_calctyp of this bond
	*/
	@Override
	public void setIs_bond_no_calctyp(boolean is_bond_no_calctyp) {
		_bond.setIs_bond_no_calctyp(is_bond_no_calctyp);
	}

	/**
	* Returns the collat_typ of this bond.
	*
	* @return the collat_typ of this bond
	*/
	@Override
	public java.lang.String getCollat_typ() {
		return _bond.getCollat_typ();
	}

	/**
	* Sets the collat_typ of this bond.
	*
	* @param collat_typ the collat_typ of this bond
	*/
	@Override
	public void setCollat_typ(java.lang.String collat_typ) {
		_bond.setCollat_typ(collat_typ);
	}

	/**
	* Returns the bb_composite of this bond.
	*
	* @return the bb_composite of this bond
	*/
	@Override
	public java.lang.String getBb_composite() {
		return _bond.getBb_composite();
	}

	/**
	* Sets the bb_composite of this bond.
	*
	* @param bb_composite the bb_composite of this bond
	*/
	@Override
	public void setBb_composite(java.lang.String bb_composite) {
		_bond.setBb_composite(bb_composite);
	}

	/**
	* Returns the rtg_sp of this bond.
	*
	* @return the rtg_sp of this bond
	*/
	@Override
	public java.lang.String getRtg_sp() {
		return _bond.getRtg_sp();
	}

	/**
	* Sets the rtg_sp of this bond.
	*
	* @param rtg_sp the rtg_sp of this bond
	*/
	@Override
	public void setRtg_sp(java.lang.String rtg_sp) {
		_bond.setRtg_sp(rtg_sp);
	}

	/**
	* Returns the rtg_moody of this bond.
	*
	* @return the rtg_moody of this bond
	*/
	@Override
	public java.lang.String getRtg_moody() {
		return _bond.getRtg_moody();
	}

	/**
	* Sets the rtg_moody of this bond.
	*
	* @param rtg_moody the rtg_moody of this bond
	*/
	@Override
	public void setRtg_moody(java.lang.String rtg_moody) {
		_bond.setRtg_moody(rtg_moody);
	}

	/**
	* Returns the rtg_fitch of this bond.
	*
	* @return the rtg_fitch of this bond
	*/
	@Override
	public java.lang.String getRtg_fitch() {
		return _bond.getRtg_fitch();
	}

	/**
	* Sets the rtg_fitch of this bond.
	*
	* @param rtg_fitch the rtg_fitch of this bond
	*/
	@Override
	public void setRtg_fitch(java.lang.String rtg_fitch) {
		_bond.setRtg_fitch(rtg_fitch);
	}

	/**
	* Returns the cpn_freq of this bond.
	*
	* @return the cpn_freq of this bond
	*/
	@Override
	public double getCpn_freq() {
		return _bond.getCpn_freq();
	}

	/**
	* Sets the cpn_freq of this bond.
	*
	* @param cpn_freq the cpn_freq of this bond
	*/
	@Override
	public void setCpn_freq(double cpn_freq) {
		_bond.setCpn_freq(cpn_freq);
	}

	/**
	* Returns the five_y_bid_cds_spread of this bond.
	*
	* @return the five_y_bid_cds_spread of this bond
	*/
	@Override
	public double getFive_y_bid_cds_spread() {
		return _bond.getFive_y_bid_cds_spread();
	}

	/**
	* Sets the five_y_bid_cds_spread of this bond.
	*
	* @param five_y_bid_cds_spread the five_y_bid_cds_spread of this bond
	*/
	@Override
	public void setFive_y_bid_cds_spread(double five_y_bid_cds_spread) {
		_bond.setFive_y_bid_cds_spread(five_y_bid_cds_spread);
	}

	/**
	* Returns the dur_mid of this bond.
	*
	* @return the dur_mid of this bond
	*/
	@Override
	public double getDur_mid() {
		return _bond.getDur_mid();
	}

	/**
	* Sets the dur_mid of this bond.
	*
	* @param dur_mid the dur_mid of this bond
	*/
	@Override
	public void setDur_mid(double dur_mid) {
		_bond.setDur_mid(dur_mid);
	}

	/**
	* Returns the price_to_cash_flow of this bond.
	*
	* @return the price_to_cash_flow of this bond
	*/
	@Override
	public double getPrice_to_cash_flow() {
		return _bond.getPrice_to_cash_flow();
	}

	/**
	* Sets the price_to_cash_flow of this bond.
	*
	* @param price_to_cash_flow the price_to_cash_flow of this bond
	*/
	@Override
	public void setPrice_to_cash_flow(double price_to_cash_flow) {
		_bond.setPrice_to_cash_flow(price_to_cash_flow);
	}

	/**
	* Returns the amount_issued of this bond.
	*
	* @return the amount_issued of this bond
	*/
	@Override
	public double getAmount_issued() {
		return _bond.getAmount_issued();
	}

	/**
	* Sets the amount_issued of this bond.
	*
	* @param amount_issued the amount_issued of this bond
	*/
	@Override
	public void setAmount_issued(double amount_issued) {
		_bond.setAmount_issued(amount_issued);
	}

	/**
	* Returns the amount_outstanding of this bond.
	*
	* @return the amount_outstanding of this bond
	*/
	@Override
	public double getAmount_outstanding() {
		return _bond.getAmount_outstanding();
	}

	/**
	* Sets the amount_outstanding of this bond.
	*
	* @param amount_outstanding the amount_outstanding of this bond
	*/
	@Override
	public void setAmount_outstanding(double amount_outstanding) {
		_bond.setAmount_outstanding(amount_outstanding);
	}

	@Override
	public boolean isNew() {
		return _bond.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_bond.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _bond.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_bond.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _bond.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _bond.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_bond.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _bond.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_bond.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_bond.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_bond.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new BondWrapper((Bond)_bond.clone());
	}

	@Override
	public int compareTo(Bond bond) {
		return _bond.compareTo(bond);
	}

	@Override
	public int hashCode() {
		return _bond.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<Bond> toCacheModel() {
		return _bond.toCacheModel();
	}

	@Override
	public Bond toEscapedModel() {
		return new BondWrapper(_bond.toEscapedModel());
	}

	@Override
	public Bond toUnescapedModel() {
		return new BondWrapper(_bond.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _bond.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _bond.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_bond.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BondWrapper)) {
			return false;
		}

		BondWrapper bondWrapper = (BondWrapper)obj;

		if (Validator.equals(_bond, bondWrapper._bond)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Bond getWrappedBond() {
		return _bond;
	}

	@Override
	public Bond getWrappedModel() {
		return _bond;
	}

	@Override
	public void resetOriginalValues() {
		_bond.resetOriginalValues();
	}

	private Bond _bond;
}