create index IX_A2EA1530 on fing_Asset (id_isin);
create index IX_C957F4A9 on fing_Asset (id_isin, security_ticker);

create index IX_FE4B28AC on fing_Currency (currencyCode);

create index IX_69966D23 on fing_Dividend (assetId);
create index IX_9F111ADF on fing_Dividend (assetId, declaredDate);

create index IX_F43F3604 on fing_History (assetId);
create index IX_DC3641D7 on fing_History (assetId, logDate, type_);
create index IX_4B112751 on fing_History (assetId, type_);

create index IX_1BDF1441 on fing_MyResult (portfolioId);

create index IX_8B397C98 on fing_Portfolio (institutionId);
create index IX_DB1B61F2 on fing_Portfolio (investorId);
create index IX_C8FF9FB5 on fing_Portfolio (relationshipManagerId);
create index IX_803AC7F3 on fing_Portfolio (wealthAdvisorId);

create index IX_9104E596 on fing_PortfolioItem (assetId, portfolioId);
create index IX_4B4B33D5 on fing_PortfolioItem (portfolioId);

create index IX_B3A8D586 on fing_Rating (description);
create index IX_B31B6540 on fing_Rating (fitch);
create index IX_39798D7B on fing_Rating (sandp, moodys);

create index IX_45AA1B8D on fing_ReportConfig (reportId, classPK, classNameId);
create index IX_9A408144 on fing_ReportConfig (reportId, classPK, classNameId, enabled);