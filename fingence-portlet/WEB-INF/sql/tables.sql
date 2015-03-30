create table fing_Asset (
	assetId LONG not null primary key,
	security_ticker VARCHAR(75) null,
	id_cusip VARCHAR(75) null,
	id_isin VARCHAR(75) null,
	id_bb_global VARCHAR(75) null,
	id_bb_sec_num_src LONG,
	name VARCHAR(75) null,
	chg_pct_mtd DOUBLE,
	chg_pct_5d DOUBLE,
	chg_pct_1m DOUBLE,
	chg_pct_3m DOUBLE,
	chg_pct_6m DOUBLE,
	chg_pct_ytd DOUBLE,
	chg_pct_high_52week DOUBLE,
	chg_pct_low_52week DOUBLE,
	chg_pct_1yr DOUBLE,
	chg_trr_5yr DOUBLE,
	current_price DOUBLE,
	last_price DOUBLE,
	bid_price DOUBLE,
	ask_price DOUBLE,
	security_des VARCHAR(75) null,
	parent_comp_name VARCHAR(75) null,
	security_class INTEGER,
	volatility_30d DOUBLE,
	volatility_90d DOUBLE,
	volatility_180d DOUBLE,
	volatility_360d DOUBLE,
	currency_ VARCHAR(75) null,
	country LONG,
	country_of_risk LONG,
	createDate DATE null,
	modifiedDate DATE null,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null
);

create table fing_Bond (
	assetId LONG not null primary key,
	issuer_bulk VARCHAR(75) null,
	cpn DOUBLE,
	cpn_typ VARCHAR(75) null,
	mty_typ VARCHAR(75) null,
	mty_years_tdy DOUBLE,
	yld_ytm_ask DOUBLE,
	yld_ytm_bid DOUBLE,
	yld_cur_mid DOUBLE,
	issue_dt DATE null,
	maturity_dt DATE null,
	calc_typ DOUBLE,
	is_bond_no_calctyp BOOLEAN,
	collat_typ VARCHAR(75) null,
	bb_composite VARCHAR(75) null,
	rtg_sp VARCHAR(75) null,
	rtg_moody VARCHAR(75) null,
	rtg_fitch VARCHAR(75) null,
	cpn_freq DOUBLE,
	five_y_bid_cds_spread DOUBLE,
	dur_mid DOUBLE,
	price_to_cash_flow DOUBLE,
	amount_issued DOUBLE,
	amount_outstanding DOUBLE
);

create table fing_Currency (
	currencyId LONG not null primary key,
	currencyCode VARCHAR(75) null,
	currencyDesc VARCHAR(75) null,
	conversion DOUBLE,
	currencySymbol VARCHAR(75) null
);

create table fing_Dividend (
	recId LONG not null primary key,
	assetId LONG,
	declaredDate DATE null,
	exDate DATE null,
	recordDate DATE null,
	payableDate DATE null,
	amount DOUBLE,
	frequency VARCHAR(75) null,
	type_ VARCHAR(75) null
);

create table fing_Equity (
	assetId LONG not null primary key,
	eqy_alpha DOUBLE,
	dividend_yield DOUBLE,
	eqy_dvd_yld_12m DOUBLE,
	eqy_dvd_yld_es DOUBLE,
	dvd_payout_ratio DOUBLE,
	pe_ratio DOUBLE,
	tot_debt_to_com_eqy DOUBLE,
	ebitda_to_revenue DOUBLE,
	trail_12m_prof_margin DOUBLE,
	best_current_ev_best_opp DOUBLE,
	eqy_beta DOUBLE,
	return_sharpe_ratio DOUBLE,
	eqy_sharpe_ratio_1yr DOUBLE,
	eqy_sharpe_ratio_3yr DOUBLE,
	eqy_sharpe_ratio_5yr DOUBLE
);

create table fing_History (
	recId LONG not null primary key,
	assetId LONG,
	logDate DATE null,
	value DOUBLE,
	type_ INTEGER,
	principal DOUBLE
);

create table fing_MutualFund (
	assetId LONG not null primary key,
	fund_total_assets DOUBLE,
	fund_asset_class_focus VARCHAR(75) null,
	fund_geo_focus VARCHAR(75) null
);

create table fing_MyResult (
	itemId LONG not null primary key,
	portfolioId LONG,
	institution VARCHAR(75) null,
	assetId LONG,
	security_ticker VARCHAR(75) null,
	id_isin VARCHAR(75) null,
	name VARCHAR(75) null,
	industry_sector VARCHAR(75) null,
	purchaseQty DOUBLE,
	purchaseDate DATE null,
	current_price DOUBLE,
	purchasedFx DOUBLE,
	current_fx DOUBLE,
	baseCurrency VARCHAR(75) null,
	security_des VARCHAR(75) null,
	security_class_int INTEGER,
	security_class VARCHAR(75) null,
	security_typ VARCHAR(75) null,
	security_typ2 VARCHAR(75) null,
	asset_class VARCHAR(75) null,
	asset_sub_class VARCHAR(75) null,
	parent_comp_name VARCHAR(75) null,
	countryId LONG,
	countryName VARCHAR(75) null,
	countryOfRisk LONG,
	countryOfRiskName VARCHAR(75) null,
	currency_ VARCHAR(75) null,
	currencyDesc VARCHAR(75) null,
	purchasedMarketValue DOUBLE,
	currentMarketValue DOUBLE,
	gain_loss DOUBLE,
	gain_loss_percent DOUBLE,
	fx_gain_loss DOUBLE,
	income DOUBLE,
	currencySymbol VARCHAR(75) null
);

create table fing_Portfolio (
	portfolioId LONG not null primary key,
	portfolioName VARCHAR(75) null,
	investorId LONG,
	wealthAdvisorId LONG,
	relationshipManagerId LONG,
	institutionId LONG,
	trial BOOLEAN,
	primary_ BOOLEAN,
	social BOOLEAN,
	baseCurrency VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null
);

create table fing_PortfolioItem (
	itemId LONG not null primary key,
	assetId LONG,
	portfolioId LONG,
	purchaseDate DATE null,
	purchasePrice DOUBLE,
	purchaseQty DOUBLE,
	purchasedFx DOUBLE,
	createDate DATE null,
	modifiedDate DATE null
);

create table fing_Rating (
	ratingId LONG not null primary key,
	moodys VARCHAR(75) null,
	sandp VARCHAR(75) null,
	fitch VARCHAR(75) null,
	general VARCHAR(75) null,
	description VARCHAR(75) null,
	creditWorthiness VARCHAR(75) null,
	category VARCHAR(75) null
);

create table fing_ReportConfig (
	recId LONG not null primary key,
	reportId LONG,
	enabled BOOLEAN,
	classPK LONG,
	classNameId LONG
);