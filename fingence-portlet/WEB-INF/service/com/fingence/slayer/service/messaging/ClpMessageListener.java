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

package com.fingence.slayer.service.messaging;

import com.fingence.slayer.service.AssetLocalServiceUtil;
import com.fingence.slayer.service.AssetServiceUtil;
import com.fingence.slayer.service.BondLocalServiceUtil;
import com.fingence.slayer.service.BondServiceUtil;
import com.fingence.slayer.service.BridgeLocalServiceUtil;
import com.fingence.slayer.service.BridgeServiceUtil;
import com.fingence.slayer.service.ClpSerializer;
import com.fingence.slayer.service.CurrencyLocalServiceUtil;
import com.fingence.slayer.service.CurrencyServiceUtil;
import com.fingence.slayer.service.DividendLocalServiceUtil;
import com.fingence.slayer.service.DividendServiceUtil;
import com.fingence.slayer.service.EquityLocalServiceUtil;
import com.fingence.slayer.service.EquityServiceUtil;
import com.fingence.slayer.service.HistoryLocalServiceUtil;
import com.fingence.slayer.service.HistoryServiceUtil;
import com.fingence.slayer.service.MutualFundLocalServiceUtil;
import com.fingence.slayer.service.MutualFundServiceUtil;
import com.fingence.slayer.service.MyResultLocalServiceUtil;
import com.fingence.slayer.service.MyResultServiceUtil;
import com.fingence.slayer.service.PortfolioItemLocalServiceUtil;
import com.fingence.slayer.service.PortfolioItemServiceUtil;
import com.fingence.slayer.service.PortfolioLocalServiceUtil;
import com.fingence.slayer.service.PortfolioServiceUtil;
import com.fingence.slayer.service.RatingLocalServiceUtil;
import com.fingence.slayer.service.RatingServiceUtil;
import com.fingence.slayer.service.ReportConfigLocalServiceUtil;
import com.fingence.slayer.service.ReportConfigServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

/**
 * @author Ahmed Hasan
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			AssetLocalServiceUtil.clearService();

			AssetServiceUtil.clearService();
			BondLocalServiceUtil.clearService();

			BondServiceUtil.clearService();
			BridgeLocalServiceUtil.clearService();

			BridgeServiceUtil.clearService();
			CurrencyLocalServiceUtil.clearService();

			CurrencyServiceUtil.clearService();
			DividendLocalServiceUtil.clearService();

			DividendServiceUtil.clearService();
			EquityLocalServiceUtil.clearService();

			EquityServiceUtil.clearService();
			HistoryLocalServiceUtil.clearService();

			HistoryServiceUtil.clearService();
			MutualFundLocalServiceUtil.clearService();

			MutualFundServiceUtil.clearService();
			MyResultLocalServiceUtil.clearService();

			MyResultServiceUtil.clearService();
			PortfolioLocalServiceUtil.clearService();

			PortfolioServiceUtil.clearService();
			PortfolioItemLocalServiceUtil.clearService();

			PortfolioItemServiceUtil.clearService();
			RatingLocalServiceUtil.clearService();

			RatingServiceUtil.clearService();
			ReportConfigLocalServiceUtil.clearService();

			ReportConfigServiceUtil.clearService();
		}
	}
}