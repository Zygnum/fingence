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

import com.fingence.slayer.model.Bond;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Bond in entity cache.
 *
 * @author Ahmed Hasan
 * @see Bond
 * @generated
 */
public class BondCacheModel implements CacheModel<Bond>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

		sb.append("{assetId=");
		sb.append(assetId);
		sb.append(", issuer_bulk=");
		sb.append(issuer_bulk);
		sb.append(", cpn=");
		sb.append(cpn);
		sb.append(", cpn_typ=");
		sb.append(cpn_typ);
		sb.append(", mty_typ=");
		sb.append(mty_typ);
		sb.append(", mty_years_tdy=");
		sb.append(mty_years_tdy);
		sb.append(", yld_ytm_ask=");
		sb.append(yld_ytm_ask);
		sb.append(", yld_ytm_bid=");
		sb.append(yld_ytm_bid);
		sb.append(", yld_cur_mid=");
		sb.append(yld_cur_mid);
		sb.append(", issue_dt=");
		sb.append(issue_dt);
		sb.append(", maturity_dt=");
		sb.append(maturity_dt);
		sb.append(", calc_typ=");
		sb.append(calc_typ);
		sb.append(", is_bond_no_calctyp=");
		sb.append(is_bond_no_calctyp);
		sb.append(", collat_typ=");
		sb.append(collat_typ);
		sb.append(", bb_composite=");
		sb.append(bb_composite);
		sb.append(", rtg_sp=");
		sb.append(rtg_sp);
		sb.append(", rtg_moody=");
		sb.append(rtg_moody);
		sb.append(", rtg_fitch=");
		sb.append(rtg_fitch);
		sb.append(", cpn_freq=");
		sb.append(cpn_freq);
		sb.append(", five_y_bid_cds_spread=");
		sb.append(five_y_bid_cds_spread);
		sb.append(", dur_mid=");
		sb.append(dur_mid);
		sb.append(", price_to_cash_flow=");
		sb.append(price_to_cash_flow);
		sb.append(", amount_issued=");
		sb.append(amount_issued);
		sb.append(", amount_outstanding=");
		sb.append(amount_outstanding);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Bond toEntityModel() {
		BondImpl bondImpl = new BondImpl();

		bondImpl.setAssetId(assetId);

		if (issuer_bulk == null) {
			bondImpl.setIssuer_bulk(StringPool.BLANK);
		}
		else {
			bondImpl.setIssuer_bulk(issuer_bulk);
		}

		bondImpl.setCpn(cpn);

		if (cpn_typ == null) {
			bondImpl.setCpn_typ(StringPool.BLANK);
		}
		else {
			bondImpl.setCpn_typ(cpn_typ);
		}

		if (mty_typ == null) {
			bondImpl.setMty_typ(StringPool.BLANK);
		}
		else {
			bondImpl.setMty_typ(mty_typ);
		}

		bondImpl.setMty_years_tdy(mty_years_tdy);
		bondImpl.setYld_ytm_ask(yld_ytm_ask);
		bondImpl.setYld_ytm_bid(yld_ytm_bid);
		bondImpl.setYld_cur_mid(yld_cur_mid);

		if (issue_dt == Long.MIN_VALUE) {
			bondImpl.setIssue_dt(null);
		}
		else {
			bondImpl.setIssue_dt(new Date(issue_dt));
		}

		if (maturity_dt == Long.MIN_VALUE) {
			bondImpl.setMaturity_dt(null);
		}
		else {
			bondImpl.setMaturity_dt(new Date(maturity_dt));
		}

		bondImpl.setCalc_typ(calc_typ);
		bondImpl.setIs_bond_no_calctyp(is_bond_no_calctyp);

		if (collat_typ == null) {
			bondImpl.setCollat_typ(StringPool.BLANK);
		}
		else {
			bondImpl.setCollat_typ(collat_typ);
		}

		if (bb_composite == null) {
			bondImpl.setBb_composite(StringPool.BLANK);
		}
		else {
			bondImpl.setBb_composite(bb_composite);
		}

		if (rtg_sp == null) {
			bondImpl.setRtg_sp(StringPool.BLANK);
		}
		else {
			bondImpl.setRtg_sp(rtg_sp);
		}

		if (rtg_moody == null) {
			bondImpl.setRtg_moody(StringPool.BLANK);
		}
		else {
			bondImpl.setRtg_moody(rtg_moody);
		}

		if (rtg_fitch == null) {
			bondImpl.setRtg_fitch(StringPool.BLANK);
		}
		else {
			bondImpl.setRtg_fitch(rtg_fitch);
		}

		bondImpl.setCpn_freq(cpn_freq);
		bondImpl.setFive_y_bid_cds_spread(five_y_bid_cds_spread);
		bondImpl.setDur_mid(dur_mid);
		bondImpl.setPrice_to_cash_flow(price_to_cash_flow);
		bondImpl.setAmount_issued(amount_issued);
		bondImpl.setAmount_outstanding(amount_outstanding);

		bondImpl.resetOriginalValues();

		return bondImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		assetId = objectInput.readLong();
		issuer_bulk = objectInput.readUTF();
		cpn = objectInput.readDouble();
		cpn_typ = objectInput.readUTF();
		mty_typ = objectInput.readUTF();
		mty_years_tdy = objectInput.readDouble();
		yld_ytm_ask = objectInput.readDouble();
		yld_ytm_bid = objectInput.readDouble();
		yld_cur_mid = objectInput.readDouble();
		issue_dt = objectInput.readLong();
		maturity_dt = objectInput.readLong();
		calc_typ = objectInput.readDouble();
		is_bond_no_calctyp = objectInput.readBoolean();
		collat_typ = objectInput.readUTF();
		bb_composite = objectInput.readUTF();
		rtg_sp = objectInput.readUTF();
		rtg_moody = objectInput.readUTF();
		rtg_fitch = objectInput.readUTF();
		cpn_freq = objectInput.readDouble();
		five_y_bid_cds_spread = objectInput.readDouble();
		dur_mid = objectInput.readDouble();
		price_to_cash_flow = objectInput.readDouble();
		amount_issued = objectInput.readDouble();
		amount_outstanding = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(assetId);

		if (issuer_bulk == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(issuer_bulk);
		}

		objectOutput.writeDouble(cpn);

		if (cpn_typ == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cpn_typ);
		}

		if (mty_typ == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mty_typ);
		}

		objectOutput.writeDouble(mty_years_tdy);
		objectOutput.writeDouble(yld_ytm_ask);
		objectOutput.writeDouble(yld_ytm_bid);
		objectOutput.writeDouble(yld_cur_mid);
		objectOutput.writeLong(issue_dt);
		objectOutput.writeLong(maturity_dt);
		objectOutput.writeDouble(calc_typ);
		objectOutput.writeBoolean(is_bond_no_calctyp);

		if (collat_typ == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(collat_typ);
		}

		if (bb_composite == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(bb_composite);
		}

		if (rtg_sp == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(rtg_sp);
		}

		if (rtg_moody == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(rtg_moody);
		}

		if (rtg_fitch == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(rtg_fitch);
		}

		objectOutput.writeDouble(cpn_freq);
		objectOutput.writeDouble(five_y_bid_cds_spread);
		objectOutput.writeDouble(dur_mid);
		objectOutput.writeDouble(price_to_cash_flow);
		objectOutput.writeDouble(amount_issued);
		objectOutput.writeDouble(amount_outstanding);
	}

	public long assetId;
	public String issuer_bulk;
	public double cpn;
	public String cpn_typ;
	public String mty_typ;
	public double mty_years_tdy;
	public double yld_ytm_ask;
	public double yld_ytm_bid;
	public double yld_cur_mid;
	public long issue_dt;
	public long maturity_dt;
	public double calc_typ;
	public boolean is_bond_no_calctyp;
	public String collat_typ;
	public String bb_composite;
	public String rtg_sp;
	public String rtg_moody;
	public String rtg_fitch;
	public double cpn_freq;
	public double five_y_bid_cds_spread;
	public double dur_mid;
	public double price_to_cash_flow;
	public double amount_issued;
	public double amount_outstanding;
}