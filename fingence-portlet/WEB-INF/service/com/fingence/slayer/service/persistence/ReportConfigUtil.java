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

package com.fingence.slayer.service.persistence;

import com.fingence.slayer.model.ReportConfig;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the report config service. This utility wraps {@link ReportConfigPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ahmed Hasan
 * @see ReportConfigPersistence
 * @see ReportConfigPersistenceImpl
 * @generated
 */
public class ReportConfigUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(ReportConfig reportConfig) {
		getPersistence().clearCache(reportConfig);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ReportConfig> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ReportConfig> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ReportConfig> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static ReportConfig update(ReportConfig reportConfig)
		throws SystemException {
		return getPersistence().update(reportConfig);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static ReportConfig update(ReportConfig reportConfig,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(reportConfig, serviceContext);
	}

	/**
	* Returns the report config where reportId = &#63; and classPK = &#63; and classNameId = &#63; and enabled = &#63; or throws a {@link com.fingence.slayer.NoSuchReportConfigException} if it could not be found.
	*
	* @param reportId the report ID
	* @param classPK the class p k
	* @param classNameId the class name ID
	* @param enabled the enabled
	* @return the matching report config
	* @throws com.fingence.slayer.NoSuchReportConfigException if a matching report config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.ReportConfig findByReportId_ClassPK_ClassNameId_Enabled(
		long reportId, long classPK, long classNameId, boolean enabled)
		throws com.fingence.slayer.NoSuchReportConfigException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByReportId_ClassPK_ClassNameId_Enabled(reportId,
			classPK, classNameId, enabled);
	}

	/**
	* Returns the report config where reportId = &#63; and classPK = &#63; and classNameId = &#63; and enabled = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param reportId the report ID
	* @param classPK the class p k
	* @param classNameId the class name ID
	* @param enabled the enabled
	* @return the matching report config, or <code>null</code> if a matching report config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.ReportConfig fetchByReportId_ClassPK_ClassNameId_Enabled(
		long reportId, long classPK, long classNameId, boolean enabled)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByReportId_ClassPK_ClassNameId_Enabled(reportId,
			classPK, classNameId, enabled);
	}

	/**
	* Returns the report config where reportId = &#63; and classPK = &#63; and classNameId = &#63; and enabled = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param reportId the report ID
	* @param classPK the class p k
	* @param classNameId the class name ID
	* @param enabled the enabled
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching report config, or <code>null</code> if a matching report config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.ReportConfig fetchByReportId_ClassPK_ClassNameId_Enabled(
		long reportId, long classPK, long classNameId, boolean enabled,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByReportId_ClassPK_ClassNameId_Enabled(reportId,
			classPK, classNameId, enabled, retrieveFromCache);
	}

	/**
	* Removes the report config where reportId = &#63; and classPK = &#63; and classNameId = &#63; and enabled = &#63; from the database.
	*
	* @param reportId the report ID
	* @param classPK the class p k
	* @param classNameId the class name ID
	* @param enabled the enabled
	* @return the report config that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.ReportConfig removeByReportId_ClassPK_ClassNameId_Enabled(
		long reportId, long classPK, long classNameId, boolean enabled)
		throws com.fingence.slayer.NoSuchReportConfigException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .removeByReportId_ClassPK_ClassNameId_Enabled(reportId,
			classPK, classNameId, enabled);
	}

	/**
	* Returns the number of report configs where reportId = &#63; and classPK = &#63; and classNameId = &#63; and enabled = &#63;.
	*
	* @param reportId the report ID
	* @param classPK the class p k
	* @param classNameId the class name ID
	* @param enabled the enabled
	* @return the number of matching report configs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByReportId_ClassPK_ClassNameId_Enabled(
		long reportId, long classPK, long classNameId, boolean enabled)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByReportId_ClassPK_ClassNameId_Enabled(reportId,
			classPK, classNameId, enabled);
	}

	/**
	* Returns the report config where reportId = &#63; and classPK = &#63; and classNameId = &#63; or throws a {@link com.fingence.slayer.NoSuchReportConfigException} if it could not be found.
	*
	* @param reportId the report ID
	* @param classPK the class p k
	* @param classNameId the class name ID
	* @return the matching report config
	* @throws com.fingence.slayer.NoSuchReportConfigException if a matching report config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.ReportConfig findByReportId_ClassPK_ClassNameId(
		long reportId, long classPK, long classNameId)
		throws com.fingence.slayer.NoSuchReportConfigException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByReportId_ClassPK_ClassNameId(reportId, classPK,
			classNameId);
	}

	/**
	* Returns the report config where reportId = &#63; and classPK = &#63; and classNameId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param reportId the report ID
	* @param classPK the class p k
	* @param classNameId the class name ID
	* @return the matching report config, or <code>null</code> if a matching report config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.ReportConfig fetchByReportId_ClassPK_ClassNameId(
		long reportId, long classPK, long classNameId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByReportId_ClassPK_ClassNameId(reportId, classPK,
			classNameId);
	}

	/**
	* Returns the report config where reportId = &#63; and classPK = &#63; and classNameId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param reportId the report ID
	* @param classPK the class p k
	* @param classNameId the class name ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching report config, or <code>null</code> if a matching report config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.ReportConfig fetchByReportId_ClassPK_ClassNameId(
		long reportId, long classPK, long classNameId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByReportId_ClassPK_ClassNameId(reportId, classPK,
			classNameId, retrieveFromCache);
	}

	/**
	* Removes the report config where reportId = &#63; and classPK = &#63; and classNameId = &#63; from the database.
	*
	* @param reportId the report ID
	* @param classPK the class p k
	* @param classNameId the class name ID
	* @return the report config that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.ReportConfig removeByReportId_ClassPK_ClassNameId(
		long reportId, long classPK, long classNameId)
		throws com.fingence.slayer.NoSuchReportConfigException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .removeByReportId_ClassPK_ClassNameId(reportId, classPK,
			classNameId);
	}

	/**
	* Returns the number of report configs where reportId = &#63; and classPK = &#63; and classNameId = &#63;.
	*
	* @param reportId the report ID
	* @param classPK the class p k
	* @param classNameId the class name ID
	* @return the number of matching report configs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByReportId_ClassPK_ClassNameId(long reportId,
		long classPK, long classNameId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByReportId_ClassPK_ClassNameId(reportId, classPK,
			classNameId);
	}

	/**
	* Caches the report config in the entity cache if it is enabled.
	*
	* @param reportConfig the report config
	*/
	public static void cacheResult(
		com.fingence.slayer.model.ReportConfig reportConfig) {
		getPersistence().cacheResult(reportConfig);
	}

	/**
	* Caches the report configs in the entity cache if it is enabled.
	*
	* @param reportConfigs the report configs
	*/
	public static void cacheResult(
		java.util.List<com.fingence.slayer.model.ReportConfig> reportConfigs) {
		getPersistence().cacheResult(reportConfigs);
	}

	/**
	* Creates a new report config with the primary key. Does not add the report config to the database.
	*
	* @param recId the primary key for the new report config
	* @return the new report config
	*/
	public static com.fingence.slayer.model.ReportConfig create(long recId) {
		return getPersistence().create(recId);
	}

	/**
	* Removes the report config with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param recId the primary key of the report config
	* @return the report config that was removed
	* @throws com.fingence.slayer.NoSuchReportConfigException if a report config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.ReportConfig remove(long recId)
		throws com.fingence.slayer.NoSuchReportConfigException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(recId);
	}

	public static com.fingence.slayer.model.ReportConfig updateImpl(
		com.fingence.slayer.model.ReportConfig reportConfig)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(reportConfig);
	}

	/**
	* Returns the report config with the primary key or throws a {@link com.fingence.slayer.NoSuchReportConfigException} if it could not be found.
	*
	* @param recId the primary key of the report config
	* @return the report config
	* @throws com.fingence.slayer.NoSuchReportConfigException if a report config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.ReportConfig findByPrimaryKey(
		long recId)
		throws com.fingence.slayer.NoSuchReportConfigException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(recId);
	}

	/**
	* Returns the report config with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param recId the primary key of the report config
	* @return the report config, or <code>null</code> if a report config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.fingence.slayer.model.ReportConfig fetchByPrimaryKey(
		long recId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(recId);
	}

	/**
	* Returns all the report configs.
	*
	* @return the report configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.fingence.slayer.model.ReportConfig> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the report configs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.ReportConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of report configs
	* @param end the upper bound of the range of report configs (not inclusive)
	* @return the range of report configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.fingence.slayer.model.ReportConfig> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the report configs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.ReportConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of report configs
	* @param end the upper bound of the range of report configs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of report configs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.fingence.slayer.model.ReportConfig> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the report configs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of report configs.
	*
	* @return the number of report configs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ReportConfigPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ReportConfigPersistence)PortletBeanLocatorUtil.locate(com.fingence.slayer.service.ClpSerializer.getServletContextName(),
					ReportConfigPersistence.class.getName());

			ReferenceRegistry.registerReference(ReportConfigUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ReportConfigPersistence persistence) {
	}

	private static ReportConfigPersistence _persistence;
}