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

package com.fingence.slayer.service.base;

import com.fingence.slayer.service.MyResultServiceUtil;

import java.util.Arrays;

/**
 * @author Ahmed Hasan
 * @generated
 */
public class MyResultServiceClpInvoker {
	public MyResultServiceClpInvoker() {
		_methodName90 = "getBeanIdentifier";

		_methodParameterTypes90 = new String[] {  };

		_methodName91 = "setBeanIdentifier";

		_methodParameterTypes91 = new String[] { "java.lang.String" };

		_methodName96 = "getMyResults";

		_methodParameterTypes96 = new String[] { "java.lang.String" };

		_methodName97 = "getMyResults";

		_methodParameterTypes97 = new String[] { "java.lang.String", "int" };

		_methodName99 = "getBondsByMaturity";

		_methodParameterTypes99 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName100 = "getBondsByCollateral";

		_methodParameterTypes100 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName101 = "getBondsByYldToMaturity";

		_methodParameterTypes101 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName102 = "getBondsByCpnTypVsMtyTyp";

		_methodParameterTypes102 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName103 = "getBondsByQuality";

		_methodParameterTypes103 = new String[] {
				"java.lang.String", "java.lang.String"
			};

		_methodName104 = "getCollateralBreakdown";

		_methodParameterTypes104 = new String[] { "java.lang.String" };

		_methodName105 = "getCashFlow";

		_methodParameterTypes105 = new String[] { "java.lang.String" };

		_methodName106 = "getBondsMaturing";

		_methodParameterTypes106 = new String[] { "java.lang.String" };

		_methodName107 = "getYldToMaturity";

		_methodParameterTypes107 = new String[] { "java.lang.String" };

		_methodName108 = "getCpnTypVsMtyTyp";

		_methodParameterTypes108 = new String[] { "java.lang.String" };

		_methodName109 = "getBondsQuality";

		_methodParameterTypes109 = new String[] { "java.lang.String" };

		_methodName110 = "getTotalMarketValue";

		_methodParameterTypes110 = new String[] { "java.lang.String" };

		_methodName111 = "getDistinctValues";

		_methodParameterTypes111 = new String[] {
				"java.lang.String", "java.lang.String"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName90.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
			return MyResultServiceUtil.getBeanIdentifier();
		}

		if (_methodName91.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes91, parameterTypes)) {
			MyResultServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName96.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
			return MyResultServiceUtil.getMyResults((java.lang.String)arguments[0]);
		}

		if (_methodName97.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes97, parameterTypes)) {
			return MyResultServiceUtil.getMyResults((java.lang.String)arguments[0],
				((Integer)arguments[1]).intValue());
		}

		if (_methodName99.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes99, parameterTypes)) {
			return MyResultServiceUtil.getBondsByMaturity((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName100.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes100, parameterTypes)) {
			return MyResultServiceUtil.getBondsByCollateral((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName101.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes101, parameterTypes)) {
			return MyResultServiceUtil.getBondsByYldToMaturity((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName102.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes102, parameterTypes)) {
			return MyResultServiceUtil.getBondsByCpnTypVsMtyTyp((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName103.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes103, parameterTypes)) {
			return MyResultServiceUtil.getBondsByQuality((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		if (_methodName104.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes104, parameterTypes)) {
			return MyResultServiceUtil.getCollateralBreakdown((java.lang.String)arguments[0]);
		}

		if (_methodName105.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes105, parameterTypes)) {
			return MyResultServiceUtil.getCashFlow((java.lang.String)arguments[0]);
		}

		if (_methodName106.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes106, parameterTypes)) {
			return MyResultServiceUtil.getBondsMaturing((java.lang.String)arguments[0]);
		}

		if (_methodName107.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes107, parameterTypes)) {
			return MyResultServiceUtil.getYldToMaturity((java.lang.String)arguments[0]);
		}

		if (_methodName108.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes108, parameterTypes)) {
			return MyResultServiceUtil.getCpnTypVsMtyTyp((java.lang.String)arguments[0]);
		}

		if (_methodName109.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes109, parameterTypes)) {
			return MyResultServiceUtil.getBondsQuality((java.lang.String)arguments[0]);
		}

		if (_methodName110.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes110, parameterTypes)) {
			return MyResultServiceUtil.getTotalMarketValue((java.lang.String)arguments[0]);
		}

		if (_methodName111.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes111, parameterTypes)) {
			return MyResultServiceUtil.getDistinctValues((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName90;
	private String[] _methodParameterTypes90;
	private String _methodName91;
	private String[] _methodParameterTypes91;
	private String _methodName96;
	private String[] _methodParameterTypes96;
	private String _methodName97;
	private String[] _methodParameterTypes97;
	private String _methodName99;
	private String[] _methodParameterTypes99;
	private String _methodName100;
	private String[] _methodParameterTypes100;
	private String _methodName101;
	private String[] _methodParameterTypes101;
	private String _methodName102;
	private String[] _methodParameterTypes102;
	private String _methodName103;
	private String[] _methodParameterTypes103;
	private String _methodName104;
	private String[] _methodParameterTypes104;
	private String _methodName105;
	private String[] _methodParameterTypes105;
	private String _methodName106;
	private String[] _methodParameterTypes106;
	private String _methodName107;
	private String[] _methodParameterTypes107;
	private String _methodName108;
	private String[] _methodParameterTypes108;
	private String _methodName109;
	private String[] _methodParameterTypes109;
	private String _methodName110;
	private String[] _methodParameterTypes110;
	private String _methodName111;
	private String[] _methodParameterTypes111;
}