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

package com.fingence.slayer.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ReportConfigLocalService}.
 *
 * @author Ahmed Hasan
 * @see ReportConfigLocalService
 * @generated
 */
public class ReportConfigLocalServiceWrapper implements ReportConfigLocalService,
	ServiceWrapper<ReportConfigLocalService> {
	public ReportConfigLocalServiceWrapper(
		ReportConfigLocalService reportConfigLocalService) {
		_reportConfigLocalService = reportConfigLocalService;
	}

	/**
	* Adds the report config to the database. Also notifies the appropriate model listeners.
	*
	* @param reportConfig the report config
	* @return the report config that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.ReportConfig addReportConfig(
		com.fingence.slayer.model.ReportConfig reportConfig)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _reportConfigLocalService.addReportConfig(reportConfig);
	}

	/**
	* Creates a new report config with the primary key. Does not add the report config to the database.
	*
	* @param recId the primary key for the new report config
	* @return the new report config
	*/
	@Override
	public com.fingence.slayer.model.ReportConfig createReportConfig(long recId) {
		return _reportConfigLocalService.createReportConfig(recId);
	}

	/**
	* Deletes the report config with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param recId the primary key of the report config
	* @return the report config that was removed
	* @throws PortalException if a report config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.ReportConfig deleteReportConfig(long recId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _reportConfigLocalService.deleteReportConfig(recId);
	}

	/**
	* Deletes the report config from the database. Also notifies the appropriate model listeners.
	*
	* @param reportConfig the report config
	* @return the report config that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.ReportConfig deleteReportConfig(
		com.fingence.slayer.model.ReportConfig reportConfig)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _reportConfigLocalService.deleteReportConfig(reportConfig);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _reportConfigLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _reportConfigLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.ReportConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _reportConfigLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.ReportConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _reportConfigLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _reportConfigLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _reportConfigLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.fingence.slayer.model.ReportConfig fetchReportConfig(long recId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _reportConfigLocalService.fetchReportConfig(recId);
	}

	/**
	* Returns the report config with the primary key.
	*
	* @param recId the primary key of the report config
	* @return the report config
	* @throws PortalException if a report config with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.ReportConfig getReportConfig(long recId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _reportConfigLocalService.getReportConfig(recId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _reportConfigLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.fingence.slayer.model.ReportConfig> getReportConfigs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _reportConfigLocalService.getReportConfigs(start, end);
	}

	/**
	* Returns the number of report configs.
	*
	* @return the number of report configs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getReportConfigsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _reportConfigLocalService.getReportConfigsCount();
	}

	/**
	* Updates the report config in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param reportConfig the report config
	* @return the report config that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.fingence.slayer.model.ReportConfig updateReportConfig(
		com.fingence.slayer.model.ReportConfig reportConfig)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _reportConfigLocalService.updateReportConfig(reportConfig);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _reportConfigLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_reportConfigLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _reportConfigLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ReportConfigLocalService getWrappedReportConfigLocalService() {
		return _reportConfigLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedReportConfigLocalService(
		ReportConfigLocalService reportConfigLocalService) {
		_reportConfigLocalService = reportConfigLocalService;
	}

	@Override
	public ReportConfigLocalService getWrappedService() {
		return _reportConfigLocalService;
	}

	@Override
	public void setWrappedService(
		ReportConfigLocalService reportConfigLocalService) {
		_reportConfigLocalService = reportConfigLocalService;
	}

	private ReportConfigLocalService _reportConfigLocalService;
}