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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the report config service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ahmed Hasan
 * @see ReportConfigPersistenceImpl
 * @see ReportConfigUtil
 * @generated
 */
public interface ReportConfigPersistence extends BasePersistence<ReportConfig> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ReportConfigUtil} to access the report config persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

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
	public com.fingence.slayer.model.ReportConfig findByReportId_ClassPK_ClassNameId_Enabled(
		long reportId, long classPK, long classNameId, boolean enabled)
		throws com.fingence.slayer.NoSuchReportConfigException,
			com.liferay.portal.kernel.exception.SystemException;

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
	public com.fingence.slayer.model.ReportConfig fetchByReportId_ClassPK_ClassNameId_Enabled(
		long reportId, long classPK, long classNameId, boolean enabled)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.fingence.slayer.model.ReportConfig fetchByReportId_ClassPK_ClassNameId_Enabled(
		long reportId, long classPK, long classNameId, boolean enabled,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.fingence.slayer.model.ReportConfig removeByReportId_ClassPK_ClassNameId_Enabled(
		long reportId, long classPK, long classNameId, boolean enabled)
		throws com.fingence.slayer.NoSuchReportConfigException,
			com.liferay.portal.kernel.exception.SystemException;

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
	public int countByReportId_ClassPK_ClassNameId_Enabled(long reportId,
		long classPK, long classNameId, boolean enabled)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.fingence.slayer.model.ReportConfig findByReportId_ClassPK_ClassNameId(
		long reportId, long classPK, long classNameId)
		throws com.fingence.slayer.NoSuchReportConfigException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the report config where reportId = &#63; and classPK = &#63; and classNameId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param reportId the report ID
	* @param classPK the class p k
	* @param classNameId the class name ID
	* @return the matching report config, or <code>null</code> if a matching report config could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.ReportConfig fetchByReportId_ClassPK_ClassNameId(
		long reportId, long classPK, long classNameId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.fingence.slayer.model.ReportConfig fetchByReportId_ClassPK_ClassNameId(
		long reportId, long classPK, long classNameId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the report config where reportId = &#63; and classPK = &#63; and classNameId = &#63; from the database.
	*
	* @param reportId the report ID
	* @param classPK the class p k
	* @param classNameId the class name ID
	* @return the report config that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.ReportConfig removeByReportId_ClassPK_ClassNameId(
		long reportId, long classPK, long classNameId)
		throws com.fingence.slayer.NoSuchReportConfigException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of report configs where reportId = &#63; and classPK = &#63; and classNameId = &#63;.
	*
	* @param reportId the report ID
	* @param classPK the class p k
	* @param classNameId the class name ID
	* @return the number of matching report configs
	* @throws SystemException if a system exception occurred
	*/
	public int countByReportId_ClassPK_ClassNameId(long reportId, long classPK,
		long classNameId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the report config in the entity cache if it is enabled.
	*
	* @param reportConfig the report config
	*/
	public void cacheResult(com.fingence.slayer.model.ReportConfig reportConfig);

	/**
	* Caches the report configs in the entity cache if it is enabled.
	*
	* @param reportConfigs the report configs
	*/
	public void cacheResult(
		java.util.List<com.fingence.slayer.model.ReportConfig> reportConfigs);

	/**
	* Creates a new report config with the primary key. Does not add the report config to the database.
	*
	* @param recId the primary key for the new report config
	* @return the new report config
	*/
	public com.fingence.slayer.model.ReportConfig create(long recId);

	/**
	* Removes the report config with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param recId the primary key of the report config
	* @return the report config that was removed
	* @throws com.fingence.slayer.NoSuchReportConfigException if a report config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.ReportConfig remove(long recId)
		throws com.fingence.slayer.NoSuchReportConfigException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.fingence.slayer.model.ReportConfig updateImpl(
		com.fingence.slayer.model.ReportConfig reportConfig)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the report config with the primary key or throws a {@link com.fingence.slayer.NoSuchReportConfigException} if it could not be found.
	*
	* @param recId the primary key of the report config
	* @return the report config
	* @throws com.fingence.slayer.NoSuchReportConfigException if a report config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.ReportConfig findByPrimaryKey(long recId)
		throws com.fingence.slayer.NoSuchReportConfigException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the report config with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param recId the primary key of the report config
	* @return the report config, or <code>null</code> if a report config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.fingence.slayer.model.ReportConfig fetchByPrimaryKey(long recId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the report configs.
	*
	* @return the report configs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.fingence.slayer.model.ReportConfig> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.fingence.slayer.model.ReportConfig> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.fingence.slayer.model.ReportConfig> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the report configs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of report configs.
	*
	* @return the number of report configs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}