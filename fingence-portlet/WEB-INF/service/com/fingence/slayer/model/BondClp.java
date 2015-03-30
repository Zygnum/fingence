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

import com.fingence.slayer.service.BondLocalServiceUtil;
import com.fingence.slayer.service.ClpSerializer;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ahmed Hasan
 */
public class BondClp extends BaseModelImpl<Bond> implements Bond {
	public BondClp() {
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

	@Override
	public long getAssetId() {
		return _assetId;
	}

	@Override
	public void setAssetId(long assetId) {
		_assetId = assetId;

		if (_bondRemoteModel != null) {
			try {
				Class<?> clazz = _bondRemoteModel.getClass();

				Method method = clazz.getMethod("setAssetId", long.class);

				method.invoke(_bondRemoteModel, assetId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIssuer_bulk() {
		return _issuer_bulk;
	}

	@Override
	public void setIssuer_bulk(String issuer_bulk) {
		_issuer_bulk = issuer_bulk;

		if (_bondRemoteModel != null) {
			try {
				Class<?> clazz = _bondRemoteModel.getClass();

				Method method = clazz.getMethod("setIssuer_bulk", String.class);

				method.invoke(_bondRemoteModel, issuer_bulk);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getCpn() {
		return _cpn;
	}

	@Override
	public void setCpn(double cpn) {
		_cpn = cpn;

		if (_bondRemoteModel != null) {
			try {
				Class<?> clazz = _bondRemoteModel.getClass();

				Method method = clazz.getMethod("setCpn", double.class);

				method.invoke(_bondRemoteModel, cpn);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCpn_typ() {
		return _cpn_typ;
	}

	@Override
	public void setCpn_typ(String cpn_typ) {
		_cpn_typ = cpn_typ;

		if (_bondRemoteModel != null) {
			try {
				Class<?> clazz = _bondRemoteModel.getClass();

				Method method = clazz.getMethod("setCpn_typ", String.class);

				method.invoke(_bondRemoteModel, cpn_typ);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMty_typ() {
		return _mty_typ;
	}

	@Override
	public void setMty_typ(String mty_typ) {
		_mty_typ = mty_typ;

		if (_bondRemoteModel != null) {
			try {
				Class<?> clazz = _bondRemoteModel.getClass();

				Method method = clazz.getMethod("setMty_typ", String.class);

				method.invoke(_bondRemoteModel, mty_typ);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getMty_years_tdy() {
		return _mty_years_tdy;
	}

	@Override
	public void setMty_years_tdy(double mty_years_tdy) {
		_mty_years_tdy = mty_years_tdy;

		if (_bondRemoteModel != null) {
			try {
				Class<?> clazz = _bondRemoteModel.getClass();

				Method method = clazz.getMethod("setMty_years_tdy", double.class);

				method.invoke(_bondRemoteModel, mty_years_tdy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getYld_ytm_ask() {
		return _yld_ytm_ask;
	}

	@Override
	public void setYld_ytm_ask(double yld_ytm_ask) {
		_yld_ytm_ask = yld_ytm_ask;

		if (_bondRemoteModel != null) {
			try {
				Class<?> clazz = _bondRemoteModel.getClass();

				Method method = clazz.getMethod("setYld_ytm_ask", double.class);

				method.invoke(_bondRemoteModel, yld_ytm_ask);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getYld_ytm_bid() {
		return _yld_ytm_bid;
	}

	@Override
	public void setYld_ytm_bid(double yld_ytm_bid) {
		_yld_ytm_bid = yld_ytm_bid;

		if (_bondRemoteModel != null) {
			try {
				Class<?> clazz = _bondRemoteModel.getClass();

				Method method = clazz.getMethod("setYld_ytm_bid", double.class);

				method.invoke(_bondRemoteModel, yld_ytm_bid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getYld_cur_mid() {
		return _yld_cur_mid;
	}

	@Override
	public void setYld_cur_mid(double yld_cur_mid) {
		_yld_cur_mid = yld_cur_mid;

		if (_bondRemoteModel != null) {
			try {
				Class<?> clazz = _bondRemoteModel.getClass();

				Method method = clazz.getMethod("setYld_cur_mid", double.class);

				method.invoke(_bondRemoteModel, yld_cur_mid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getIssue_dt() {
		return _issue_dt;
	}

	@Override
	public void setIssue_dt(Date issue_dt) {
		_issue_dt = issue_dt;

		if (_bondRemoteModel != null) {
			try {
				Class<?> clazz = _bondRemoteModel.getClass();

				Method method = clazz.getMethod("setIssue_dt", Date.class);

				method.invoke(_bondRemoteModel, issue_dt);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getMaturity_dt() {
		return _maturity_dt;
	}

	@Override
	public void setMaturity_dt(Date maturity_dt) {
		_maturity_dt = maturity_dt;

		if (_bondRemoteModel != null) {
			try {
				Class<?> clazz = _bondRemoteModel.getClass();

				Method method = clazz.getMethod("setMaturity_dt", Date.class);

				method.invoke(_bondRemoteModel, maturity_dt);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getCalc_typ() {
		return _calc_typ;
	}

	@Override
	public void setCalc_typ(double calc_typ) {
		_calc_typ = calc_typ;

		if (_bondRemoteModel != null) {
			try {
				Class<?> clazz = _bondRemoteModel.getClass();

				Method method = clazz.getMethod("setCalc_typ", double.class);

				method.invoke(_bondRemoteModel, calc_typ);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getIs_bond_no_calctyp() {
		return _is_bond_no_calctyp;
	}

	@Override
	public boolean isIs_bond_no_calctyp() {
		return _is_bond_no_calctyp;
	}

	@Override
	public void setIs_bond_no_calctyp(boolean is_bond_no_calctyp) {
		_is_bond_no_calctyp = is_bond_no_calctyp;

		if (_bondRemoteModel != null) {
			try {
				Class<?> clazz = _bondRemoteModel.getClass();

				Method method = clazz.getMethod("setIs_bond_no_calctyp",
						boolean.class);

				method.invoke(_bondRemoteModel, is_bond_no_calctyp);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCollat_typ() {
		return _collat_typ;
	}

	@Override
	public void setCollat_typ(String collat_typ) {
		_collat_typ = collat_typ;

		if (_bondRemoteModel != null) {
			try {
				Class<?> clazz = _bondRemoteModel.getClass();

				Method method = clazz.getMethod("setCollat_typ", String.class);

				method.invoke(_bondRemoteModel, collat_typ);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBb_composite() {
		return _bb_composite;
	}

	@Override
	public void setBb_composite(String bb_composite) {
		_bb_composite = bb_composite;

		if (_bondRemoteModel != null) {
			try {
				Class<?> clazz = _bondRemoteModel.getClass();

				Method method = clazz.getMethod("setBb_composite", String.class);

				method.invoke(_bondRemoteModel, bb_composite);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRtg_sp() {
		return _rtg_sp;
	}

	@Override
	public void setRtg_sp(String rtg_sp) {
		_rtg_sp = rtg_sp;

		if (_bondRemoteModel != null) {
			try {
				Class<?> clazz = _bondRemoteModel.getClass();

				Method method = clazz.getMethod("setRtg_sp", String.class);

				method.invoke(_bondRemoteModel, rtg_sp);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRtg_moody() {
		return _rtg_moody;
	}

	@Override
	public void setRtg_moody(String rtg_moody) {
		_rtg_moody = rtg_moody;

		if (_bondRemoteModel != null) {
			try {
				Class<?> clazz = _bondRemoteModel.getClass();

				Method method = clazz.getMethod("setRtg_moody", String.class);

				method.invoke(_bondRemoteModel, rtg_moody);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getRtg_fitch() {
		return _rtg_fitch;
	}

	@Override
	public void setRtg_fitch(String rtg_fitch) {
		_rtg_fitch = rtg_fitch;

		if (_bondRemoteModel != null) {
			try {
				Class<?> clazz = _bondRemoteModel.getClass();

				Method method = clazz.getMethod("setRtg_fitch", String.class);

				method.invoke(_bondRemoteModel, rtg_fitch);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getCpn_freq() {
		return _cpn_freq;
	}

	@Override
	public void setCpn_freq(double cpn_freq) {
		_cpn_freq = cpn_freq;

		if (_bondRemoteModel != null) {
			try {
				Class<?> clazz = _bondRemoteModel.getClass();

				Method method = clazz.getMethod("setCpn_freq", double.class);

				method.invoke(_bondRemoteModel, cpn_freq);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getFive_y_bid_cds_spread() {
		return _five_y_bid_cds_spread;
	}

	@Override
	public void setFive_y_bid_cds_spread(double five_y_bid_cds_spread) {
		_five_y_bid_cds_spread = five_y_bid_cds_spread;

		if (_bondRemoteModel != null) {
			try {
				Class<?> clazz = _bondRemoteModel.getClass();

				Method method = clazz.getMethod("setFive_y_bid_cds_spread",
						double.class);

				method.invoke(_bondRemoteModel, five_y_bid_cds_spread);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getDur_mid() {
		return _dur_mid;
	}

	@Override
	public void setDur_mid(double dur_mid) {
		_dur_mid = dur_mid;

		if (_bondRemoteModel != null) {
			try {
				Class<?> clazz = _bondRemoteModel.getClass();

				Method method = clazz.getMethod("setDur_mid", double.class);

				method.invoke(_bondRemoteModel, dur_mid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getPrice_to_cash_flow() {
		return _price_to_cash_flow;
	}

	@Override
	public void setPrice_to_cash_flow(double price_to_cash_flow) {
		_price_to_cash_flow = price_to_cash_flow;

		if (_bondRemoteModel != null) {
			try {
				Class<?> clazz = _bondRemoteModel.getClass();

				Method method = clazz.getMethod("setPrice_to_cash_flow",
						double.class);

				method.invoke(_bondRemoteModel, price_to_cash_flow);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getAmount_issued() {
		return _amount_issued;
	}

	@Override
	public void setAmount_issued(double amount_issued) {
		_amount_issued = amount_issued;

		if (_bondRemoteModel != null) {
			try {
				Class<?> clazz = _bondRemoteModel.getClass();

				Method method = clazz.getMethod("setAmount_issued", double.class);

				method.invoke(_bondRemoteModel, amount_issued);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getAmount_outstanding() {
		return _amount_outstanding;
	}

	@Override
	public void setAmount_outstanding(double amount_outstanding) {
		_amount_outstanding = amount_outstanding;

		if (_bondRemoteModel != null) {
			try {
				Class<?> clazz = _bondRemoteModel.getClass();

				Method method = clazz.getMethod("setAmount_outstanding",
						double.class);

				method.invoke(_bondRemoteModel, amount_outstanding);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getBondRemoteModel() {
		return _bondRemoteModel;
	}

	public void setBondRemoteModel(BaseModel<?> bondRemoteModel) {
		_bondRemoteModel = bondRemoteModel;
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

		Class<?> remoteModelClass = _bondRemoteModel.getClass();

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

		Object returnValue = method.invoke(_bondRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			BondLocalServiceUtil.addBond(this);
		}
		else {
			BondLocalServiceUtil.updateBond(this);
		}
	}

	@Override
	public Bond toEscapedModel() {
		return (Bond)ProxyUtil.newProxyInstance(Bond.class.getClassLoader(),
			new Class[] { Bond.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		BondClp clone = new BondClp();

		clone.setAssetId(getAssetId());
		clone.setIssuer_bulk(getIssuer_bulk());
		clone.setCpn(getCpn());
		clone.setCpn_typ(getCpn_typ());
		clone.setMty_typ(getMty_typ());
		clone.setMty_years_tdy(getMty_years_tdy());
		clone.setYld_ytm_ask(getYld_ytm_ask());
		clone.setYld_ytm_bid(getYld_ytm_bid());
		clone.setYld_cur_mid(getYld_cur_mid());
		clone.setIssue_dt(getIssue_dt());
		clone.setMaturity_dt(getMaturity_dt());
		clone.setCalc_typ(getCalc_typ());
		clone.setIs_bond_no_calctyp(getIs_bond_no_calctyp());
		clone.setCollat_typ(getCollat_typ());
		clone.setBb_composite(getBb_composite());
		clone.setRtg_sp(getRtg_sp());
		clone.setRtg_moody(getRtg_moody());
		clone.setRtg_fitch(getRtg_fitch());
		clone.setCpn_freq(getCpn_freq());
		clone.setFive_y_bid_cds_spread(getFive_y_bid_cds_spread());
		clone.setDur_mid(getDur_mid());
		clone.setPrice_to_cash_flow(getPrice_to_cash_flow());
		clone.setAmount_issued(getAmount_issued());
		clone.setAmount_outstanding(getAmount_outstanding());

		return clone;
	}

	@Override
	public int compareTo(Bond bond) {
		long primaryKey = bond.getPrimaryKey();

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

		if (!(obj instanceof BondClp)) {
			return false;
		}

		BondClp bond = (BondClp)obj;

		long primaryKey = bond.getPrimaryKey();

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
		StringBundler sb = new StringBundler(49);

		sb.append("{assetId=");
		sb.append(getAssetId());
		sb.append(", issuer_bulk=");
		sb.append(getIssuer_bulk());
		sb.append(", cpn=");
		sb.append(getCpn());
		sb.append(", cpn_typ=");
		sb.append(getCpn_typ());
		sb.append(", mty_typ=");
		sb.append(getMty_typ());
		sb.append(", mty_years_tdy=");
		sb.append(getMty_years_tdy());
		sb.append(", yld_ytm_ask=");
		sb.append(getYld_ytm_ask());
		sb.append(", yld_ytm_bid=");
		sb.append(getYld_ytm_bid());
		sb.append(", yld_cur_mid=");
		sb.append(getYld_cur_mid());
		sb.append(", issue_dt=");
		sb.append(getIssue_dt());
		sb.append(", maturity_dt=");
		sb.append(getMaturity_dt());
		sb.append(", calc_typ=");
		sb.append(getCalc_typ());
		sb.append(", is_bond_no_calctyp=");
		sb.append(getIs_bond_no_calctyp());
		sb.append(", collat_typ=");
		sb.append(getCollat_typ());
		sb.append(", bb_composite=");
		sb.append(getBb_composite());
		sb.append(", rtg_sp=");
		sb.append(getRtg_sp());
		sb.append(", rtg_moody=");
		sb.append(getRtg_moody());
		sb.append(", rtg_fitch=");
		sb.append(getRtg_fitch());
		sb.append(", cpn_freq=");
		sb.append(getCpn_freq());
		sb.append(", five_y_bid_cds_spread=");
		sb.append(getFive_y_bid_cds_spread());
		sb.append(", dur_mid=");
		sb.append(getDur_mid());
		sb.append(", price_to_cash_flow=");
		sb.append(getPrice_to_cash_flow());
		sb.append(", amount_issued=");
		sb.append(getAmount_issued());
		sb.append(", amount_outstanding=");
		sb.append(getAmount_outstanding());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(76);

		sb.append("<model><model-name>");
		sb.append("com.fingence.slayer.model.Bond");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>assetId</column-name><column-value><![CDATA[");
		sb.append(getAssetId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>issuer_bulk</column-name><column-value><![CDATA[");
		sb.append(getIssuer_bulk());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cpn</column-name><column-value><![CDATA[");
		sb.append(getCpn());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cpn_typ</column-name><column-value><![CDATA[");
		sb.append(getCpn_typ());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mty_typ</column-name><column-value><![CDATA[");
		sb.append(getMty_typ());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mty_years_tdy</column-name><column-value><![CDATA[");
		sb.append(getMty_years_tdy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>yld_ytm_ask</column-name><column-value><![CDATA[");
		sb.append(getYld_ytm_ask());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>yld_ytm_bid</column-name><column-value><![CDATA[");
		sb.append(getYld_ytm_bid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>yld_cur_mid</column-name><column-value><![CDATA[");
		sb.append(getYld_cur_mid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>issue_dt</column-name><column-value><![CDATA[");
		sb.append(getIssue_dt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maturity_dt</column-name><column-value><![CDATA[");
		sb.append(getMaturity_dt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>calc_typ</column-name><column-value><![CDATA[");
		sb.append(getCalc_typ());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>is_bond_no_calctyp</column-name><column-value><![CDATA[");
		sb.append(getIs_bond_no_calctyp());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>collat_typ</column-name><column-value><![CDATA[");
		sb.append(getCollat_typ());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bb_composite</column-name><column-value><![CDATA[");
		sb.append(getBb_composite());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rtg_sp</column-name><column-value><![CDATA[");
		sb.append(getRtg_sp());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rtg_moody</column-name><column-value><![CDATA[");
		sb.append(getRtg_moody());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>rtg_fitch</column-name><column-value><![CDATA[");
		sb.append(getRtg_fitch());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cpn_freq</column-name><column-value><![CDATA[");
		sb.append(getCpn_freq());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>five_y_bid_cds_spread</column-name><column-value><![CDATA[");
		sb.append(getFive_y_bid_cds_spread());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dur_mid</column-name><column-value><![CDATA[");
		sb.append(getDur_mid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>price_to_cash_flow</column-name><column-value><![CDATA[");
		sb.append(getPrice_to_cash_flow());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>amount_issued</column-name><column-value><![CDATA[");
		sb.append(getAmount_issued());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>amount_outstanding</column-name><column-value><![CDATA[");
		sb.append(getAmount_outstanding());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _bondRemoteModel;
}