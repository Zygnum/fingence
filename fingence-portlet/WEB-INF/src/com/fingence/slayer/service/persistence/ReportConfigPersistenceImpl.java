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

import com.fingence.slayer.NoSuchReportConfigException;
import com.fingence.slayer.model.ReportConfig;
import com.fingence.slayer.model.impl.ReportConfigImpl;
import com.fingence.slayer.model.impl.ReportConfigModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the report config service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ahmed Hasan
 * @see ReportConfigPersistence
 * @see ReportConfigUtil
 * @generated
 */
public class ReportConfigPersistenceImpl extends BasePersistenceImpl<ReportConfig>
	implements ReportConfigPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ReportConfigUtil} to access the report config persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ReportConfigImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ReportConfigModelImpl.ENTITY_CACHE_ENABLED,
			ReportConfigModelImpl.FINDER_CACHE_ENABLED, ReportConfigImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ReportConfigModelImpl.ENTITY_CACHE_ENABLED,
			ReportConfigModelImpl.FINDER_CACHE_ENABLED, ReportConfigImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ReportConfigModelImpl.ENTITY_CACHE_ENABLED,
			ReportConfigModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_REPORTID_CLASSPK_CLASSNAMEID_ENABLED =
		new FinderPath(ReportConfigModelImpl.ENTITY_CACHE_ENABLED,
			ReportConfigModelImpl.FINDER_CACHE_ENABLED, ReportConfigImpl.class,
			FINDER_CLASS_NAME_ENTITY,
			"fetchByReportId_ClassPK_ClassNameId_Enabled",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				Boolean.class.getName()
			},
			ReportConfigModelImpl.REPORTID_COLUMN_BITMASK |
			ReportConfigModelImpl.CLASSPK_COLUMN_BITMASK |
			ReportConfigModelImpl.CLASSNAMEID_COLUMN_BITMASK |
			ReportConfigModelImpl.ENABLED_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REPORTID_CLASSPK_CLASSNAMEID_ENABLED =
		new FinderPath(ReportConfigModelImpl.ENTITY_CACHE_ENABLED,
			ReportConfigModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByReportId_ClassPK_ClassNameId_Enabled",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				Boolean.class.getName()
			});

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
	@Override
	public ReportConfig findByReportId_ClassPK_ClassNameId_Enabled(
		long reportId, long classPK, long classNameId, boolean enabled)
		throws NoSuchReportConfigException, SystemException {
		ReportConfig reportConfig = fetchByReportId_ClassPK_ClassNameId_Enabled(reportId,
				classPK, classNameId, enabled);

		if (reportConfig == null) {
			StringBundler msg = new StringBundler(10);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("reportId=");
			msg.append(reportId);

			msg.append(", classPK=");
			msg.append(classPK);

			msg.append(", classNameId=");
			msg.append(classNameId);

			msg.append(", enabled=");
			msg.append(enabled);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchReportConfigException(msg.toString());
		}

		return reportConfig;
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
	@Override
	public ReportConfig fetchByReportId_ClassPK_ClassNameId_Enabled(
		long reportId, long classPK, long classNameId, boolean enabled)
		throws SystemException {
		return fetchByReportId_ClassPK_ClassNameId_Enabled(reportId, classPK,
			classNameId, enabled, true);
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
	@Override
	public ReportConfig fetchByReportId_ClassPK_ClassNameId_Enabled(
		long reportId, long classPK, long classNameId, boolean enabled,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] {
				reportId, classPK, classNameId, enabled
			};

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_REPORTID_CLASSPK_CLASSNAMEID_ENABLED,
					finderArgs, this);
		}

		if (result instanceof ReportConfig) {
			ReportConfig reportConfig = (ReportConfig)result;

			if ((reportId != reportConfig.getReportId()) ||
					(classPK != reportConfig.getClassPK()) ||
					(classNameId != reportConfig.getClassNameId()) ||
					(enabled != reportConfig.getEnabled())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_SELECT_REPORTCONFIG_WHERE);

			query.append(_FINDER_COLUMN_REPORTID_CLASSPK_CLASSNAMEID_ENABLED_REPORTID_2);

			query.append(_FINDER_COLUMN_REPORTID_CLASSPK_CLASSNAMEID_ENABLED_CLASSPK_2);

			query.append(_FINDER_COLUMN_REPORTID_CLASSPK_CLASSNAMEID_ENABLED_CLASSNAMEID_2);

			query.append(_FINDER_COLUMN_REPORTID_CLASSPK_CLASSNAMEID_ENABLED_ENABLED_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(reportId);

				qPos.add(classPK);

				qPos.add(classNameId);

				qPos.add(enabled);

				List<ReportConfig> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPORTID_CLASSPK_CLASSNAMEID_ENABLED,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"ReportConfigPersistenceImpl.fetchByReportId_ClassPK_ClassNameId_Enabled(long, long, long, boolean, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					ReportConfig reportConfig = list.get(0);

					result = reportConfig;

					cacheResult(reportConfig);

					if ((reportConfig.getReportId() != reportId) ||
							(reportConfig.getClassPK() != classPK) ||
							(reportConfig.getClassNameId() != classNameId) ||
							(reportConfig.getEnabled() != enabled)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPORTID_CLASSPK_CLASSNAMEID_ENABLED,
							finderArgs, reportConfig);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPORTID_CLASSPK_CLASSNAMEID_ENABLED,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (ReportConfig)result;
		}
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
	@Override
	public ReportConfig removeByReportId_ClassPK_ClassNameId_Enabled(
		long reportId, long classPK, long classNameId, boolean enabled)
		throws NoSuchReportConfigException, SystemException {
		ReportConfig reportConfig = findByReportId_ClassPK_ClassNameId_Enabled(reportId,
				classPK, classNameId, enabled);

		return remove(reportConfig);
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
	@Override
	public int countByReportId_ClassPK_ClassNameId_Enabled(long reportId,
		long classPK, long classNameId, boolean enabled)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REPORTID_CLASSPK_CLASSNAMEID_ENABLED;

		Object[] finderArgs = new Object[] {
				reportId, classPK, classNameId, enabled
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_REPORTCONFIG_WHERE);

			query.append(_FINDER_COLUMN_REPORTID_CLASSPK_CLASSNAMEID_ENABLED_REPORTID_2);

			query.append(_FINDER_COLUMN_REPORTID_CLASSPK_CLASSNAMEID_ENABLED_CLASSPK_2);

			query.append(_FINDER_COLUMN_REPORTID_CLASSPK_CLASSNAMEID_ENABLED_CLASSNAMEID_2);

			query.append(_FINDER_COLUMN_REPORTID_CLASSPK_CLASSNAMEID_ENABLED_ENABLED_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(reportId);

				qPos.add(classPK);

				qPos.add(classNameId);

				qPos.add(enabled);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_REPORTID_CLASSPK_CLASSNAMEID_ENABLED_REPORTID_2 =
		"reportConfig.reportId = ? AND ";
	private static final String _FINDER_COLUMN_REPORTID_CLASSPK_CLASSNAMEID_ENABLED_CLASSPK_2 =
		"reportConfig.classPK = ? AND ";
	private static final String _FINDER_COLUMN_REPORTID_CLASSPK_CLASSNAMEID_ENABLED_CLASSNAMEID_2 =
		"reportConfig.classNameId = ? AND ";
	private static final String _FINDER_COLUMN_REPORTID_CLASSPK_CLASSNAMEID_ENABLED_ENABLED_2 =
		"reportConfig.enabled = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_REPORTID_CLASSPK_CLASSNAMEID =
		new FinderPath(ReportConfigModelImpl.ENTITY_CACHE_ENABLED,
			ReportConfigModelImpl.FINDER_CACHE_ENABLED, ReportConfigImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByReportId_ClassPK_ClassNameId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			ReportConfigModelImpl.REPORTID_COLUMN_BITMASK |
			ReportConfigModelImpl.CLASSPK_COLUMN_BITMASK |
			ReportConfigModelImpl.CLASSNAMEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REPORTID_CLASSPK_CLASSNAMEID =
		new FinderPath(ReportConfigModelImpl.ENTITY_CACHE_ENABLED,
			ReportConfigModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByReportId_ClassPK_ClassNameId",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

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
	@Override
	public ReportConfig findByReportId_ClassPK_ClassNameId(long reportId,
		long classPK, long classNameId)
		throws NoSuchReportConfigException, SystemException {
		ReportConfig reportConfig = fetchByReportId_ClassPK_ClassNameId(reportId,
				classPK, classNameId);

		if (reportConfig == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("reportId=");
			msg.append(reportId);

			msg.append(", classPK=");
			msg.append(classPK);

			msg.append(", classNameId=");
			msg.append(classNameId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchReportConfigException(msg.toString());
		}

		return reportConfig;
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
	@Override
	public ReportConfig fetchByReportId_ClassPK_ClassNameId(long reportId,
		long classPK, long classNameId) throws SystemException {
		return fetchByReportId_ClassPK_ClassNameId(reportId, classPK,
			classNameId, true);
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
	@Override
	public ReportConfig fetchByReportId_ClassPK_ClassNameId(long reportId,
		long classPK, long classNameId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { reportId, classPK, classNameId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_REPORTID_CLASSPK_CLASSNAMEID,
					finderArgs, this);
		}

		if (result instanceof ReportConfig) {
			ReportConfig reportConfig = (ReportConfig)result;

			if ((reportId != reportConfig.getReportId()) ||
					(classPK != reportConfig.getClassPK()) ||
					(classNameId != reportConfig.getClassNameId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_REPORTCONFIG_WHERE);

			query.append(_FINDER_COLUMN_REPORTID_CLASSPK_CLASSNAMEID_REPORTID_2);

			query.append(_FINDER_COLUMN_REPORTID_CLASSPK_CLASSNAMEID_CLASSPK_2);

			query.append(_FINDER_COLUMN_REPORTID_CLASSPK_CLASSNAMEID_CLASSNAMEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(reportId);

				qPos.add(classPK);

				qPos.add(classNameId);

				List<ReportConfig> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPORTID_CLASSPK_CLASSNAMEID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"ReportConfigPersistenceImpl.fetchByReportId_ClassPK_ClassNameId(long, long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					ReportConfig reportConfig = list.get(0);

					result = reportConfig;

					cacheResult(reportConfig);

					if ((reportConfig.getReportId() != reportId) ||
							(reportConfig.getClassPK() != classPK) ||
							(reportConfig.getClassNameId() != classNameId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPORTID_CLASSPK_CLASSNAMEID,
							finderArgs, reportConfig);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPORTID_CLASSPK_CLASSNAMEID,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (ReportConfig)result;
		}
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
	@Override
	public ReportConfig removeByReportId_ClassPK_ClassNameId(long reportId,
		long classPK, long classNameId)
		throws NoSuchReportConfigException, SystemException {
		ReportConfig reportConfig = findByReportId_ClassPK_ClassNameId(reportId,
				classPK, classNameId);

		return remove(reportConfig);
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
	@Override
	public int countByReportId_ClassPK_ClassNameId(long reportId, long classPK,
		long classNameId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REPORTID_CLASSPK_CLASSNAMEID;

		Object[] finderArgs = new Object[] { reportId, classPK, classNameId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_REPORTCONFIG_WHERE);

			query.append(_FINDER_COLUMN_REPORTID_CLASSPK_CLASSNAMEID_REPORTID_2);

			query.append(_FINDER_COLUMN_REPORTID_CLASSPK_CLASSNAMEID_CLASSPK_2);

			query.append(_FINDER_COLUMN_REPORTID_CLASSPK_CLASSNAMEID_CLASSNAMEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(reportId);

				qPos.add(classPK);

				qPos.add(classNameId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_REPORTID_CLASSPK_CLASSNAMEID_REPORTID_2 =
		"reportConfig.reportId = ? AND ";
	private static final String _FINDER_COLUMN_REPORTID_CLASSPK_CLASSNAMEID_CLASSPK_2 =
		"reportConfig.classPK = ? AND ";
	private static final String _FINDER_COLUMN_REPORTID_CLASSPK_CLASSNAMEID_CLASSNAMEID_2 =
		"reportConfig.classNameId = ?";

	public ReportConfigPersistenceImpl() {
		setModelClass(ReportConfig.class);
	}

	/**
	 * Caches the report config in the entity cache if it is enabled.
	 *
	 * @param reportConfig the report config
	 */
	@Override
	public void cacheResult(ReportConfig reportConfig) {
		EntityCacheUtil.putResult(ReportConfigModelImpl.ENTITY_CACHE_ENABLED,
			ReportConfigImpl.class, reportConfig.getPrimaryKey(), reportConfig);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPORTID_CLASSPK_CLASSNAMEID_ENABLED,
			new Object[] {
				reportConfig.getReportId(), reportConfig.getClassPK(),
				reportConfig.getClassNameId(), reportConfig.getEnabled()
			}, reportConfig);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPORTID_CLASSPK_CLASSNAMEID,
			new Object[] {
				reportConfig.getReportId(), reportConfig.getClassPK(),
				reportConfig.getClassNameId()
			}, reportConfig);

		reportConfig.resetOriginalValues();
	}

	/**
	 * Caches the report configs in the entity cache if it is enabled.
	 *
	 * @param reportConfigs the report configs
	 */
	@Override
	public void cacheResult(List<ReportConfig> reportConfigs) {
		for (ReportConfig reportConfig : reportConfigs) {
			if (EntityCacheUtil.getResult(
						ReportConfigModelImpl.ENTITY_CACHE_ENABLED,
						ReportConfigImpl.class, reportConfig.getPrimaryKey()) == null) {
				cacheResult(reportConfig);
			}
			else {
				reportConfig.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all report configs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ReportConfigImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ReportConfigImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the report config.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ReportConfig reportConfig) {
		EntityCacheUtil.removeResult(ReportConfigModelImpl.ENTITY_CACHE_ENABLED,
			ReportConfigImpl.class, reportConfig.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(reportConfig);
	}

	@Override
	public void clearCache(List<ReportConfig> reportConfigs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ReportConfig reportConfig : reportConfigs) {
			EntityCacheUtil.removeResult(ReportConfigModelImpl.ENTITY_CACHE_ENABLED,
				ReportConfigImpl.class, reportConfig.getPrimaryKey());

			clearUniqueFindersCache(reportConfig);
		}
	}

	protected void cacheUniqueFindersCache(ReportConfig reportConfig) {
		if (reportConfig.isNew()) {
			Object[] args = new Object[] {
					reportConfig.getReportId(), reportConfig.getClassPK(),
					reportConfig.getClassNameId(), reportConfig.getEnabled()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REPORTID_CLASSPK_CLASSNAMEID_ENABLED,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPORTID_CLASSPK_CLASSNAMEID_ENABLED,
				args, reportConfig);

			args = new Object[] {
					reportConfig.getReportId(), reportConfig.getClassPK(),
					reportConfig.getClassNameId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REPORTID_CLASSPK_CLASSNAMEID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPORTID_CLASSPK_CLASSNAMEID,
				args, reportConfig);
		}
		else {
			ReportConfigModelImpl reportConfigModelImpl = (ReportConfigModelImpl)reportConfig;

			if ((reportConfigModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_REPORTID_CLASSPK_CLASSNAMEID_ENABLED.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						reportConfig.getReportId(), reportConfig.getClassPK(),
						reportConfig.getClassNameId(), reportConfig.getEnabled()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REPORTID_CLASSPK_CLASSNAMEID_ENABLED,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPORTID_CLASSPK_CLASSNAMEID_ENABLED,
					args, reportConfig);
			}

			if ((reportConfigModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_REPORTID_CLASSPK_CLASSNAMEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						reportConfig.getReportId(), reportConfig.getClassPK(),
						reportConfig.getClassNameId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_REPORTID_CLASSPK_CLASSNAMEID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_REPORTID_CLASSPK_CLASSNAMEID,
					args, reportConfig);
			}
		}
	}

	protected void clearUniqueFindersCache(ReportConfig reportConfig) {
		ReportConfigModelImpl reportConfigModelImpl = (ReportConfigModelImpl)reportConfig;

		Object[] args = new Object[] {
				reportConfig.getReportId(), reportConfig.getClassPK(),
				reportConfig.getClassNameId(), reportConfig.getEnabled()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REPORTID_CLASSPK_CLASSNAMEID_ENABLED,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPORTID_CLASSPK_CLASSNAMEID_ENABLED,
			args);

		if ((reportConfigModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_REPORTID_CLASSPK_CLASSNAMEID_ENABLED.getColumnBitmask()) != 0) {
			args = new Object[] {
					reportConfigModelImpl.getOriginalReportId(),
					reportConfigModelImpl.getOriginalClassPK(),
					reportConfigModelImpl.getOriginalClassNameId(),
					reportConfigModelImpl.getOriginalEnabled()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REPORTID_CLASSPK_CLASSNAMEID_ENABLED,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPORTID_CLASSPK_CLASSNAMEID_ENABLED,
				args);
		}

		args = new Object[] {
				reportConfig.getReportId(), reportConfig.getClassPK(),
				reportConfig.getClassNameId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REPORTID_CLASSPK_CLASSNAMEID,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPORTID_CLASSPK_CLASSNAMEID,
			args);

		if ((reportConfigModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_REPORTID_CLASSPK_CLASSNAMEID.getColumnBitmask()) != 0) {
			args = new Object[] {
					reportConfigModelImpl.getOriginalReportId(),
					reportConfigModelImpl.getOriginalClassPK(),
					reportConfigModelImpl.getOriginalClassNameId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REPORTID_CLASSPK_CLASSNAMEID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_REPORTID_CLASSPK_CLASSNAMEID,
				args);
		}
	}

	/**
	 * Creates a new report config with the primary key. Does not add the report config to the database.
	 *
	 * @param recId the primary key for the new report config
	 * @return the new report config
	 */
	@Override
	public ReportConfig create(long recId) {
		ReportConfig reportConfig = new ReportConfigImpl();

		reportConfig.setNew(true);
		reportConfig.setPrimaryKey(recId);

		return reportConfig;
	}

	/**
	 * Removes the report config with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param recId the primary key of the report config
	 * @return the report config that was removed
	 * @throws com.fingence.slayer.NoSuchReportConfigException if a report config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ReportConfig remove(long recId)
		throws NoSuchReportConfigException, SystemException {
		return remove((Serializable)recId);
	}

	/**
	 * Removes the report config with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the report config
	 * @return the report config that was removed
	 * @throws com.fingence.slayer.NoSuchReportConfigException if a report config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ReportConfig remove(Serializable primaryKey)
		throws NoSuchReportConfigException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ReportConfig reportConfig = (ReportConfig)session.get(ReportConfigImpl.class,
					primaryKey);

			if (reportConfig == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchReportConfigException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(reportConfig);
		}
		catch (NoSuchReportConfigException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected ReportConfig removeImpl(ReportConfig reportConfig)
		throws SystemException {
		reportConfig = toUnwrappedModel(reportConfig);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(reportConfig)) {
				reportConfig = (ReportConfig)session.get(ReportConfigImpl.class,
						reportConfig.getPrimaryKeyObj());
			}

			if (reportConfig != null) {
				session.delete(reportConfig);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (reportConfig != null) {
			clearCache(reportConfig);
		}

		return reportConfig;
	}

	@Override
	public ReportConfig updateImpl(
		com.fingence.slayer.model.ReportConfig reportConfig)
		throws SystemException {
		reportConfig = toUnwrappedModel(reportConfig);

		boolean isNew = reportConfig.isNew();

		Session session = null;

		try {
			session = openSession();

			if (reportConfig.isNew()) {
				session.save(reportConfig);

				reportConfig.setNew(false);
			}
			else {
				session.merge(reportConfig);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ReportConfigModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(ReportConfigModelImpl.ENTITY_CACHE_ENABLED,
			ReportConfigImpl.class, reportConfig.getPrimaryKey(), reportConfig);

		clearUniqueFindersCache(reportConfig);
		cacheUniqueFindersCache(reportConfig);

		return reportConfig;
	}

	protected ReportConfig toUnwrappedModel(ReportConfig reportConfig) {
		if (reportConfig instanceof ReportConfigImpl) {
			return reportConfig;
		}

		ReportConfigImpl reportConfigImpl = new ReportConfigImpl();

		reportConfigImpl.setNew(reportConfig.isNew());
		reportConfigImpl.setPrimaryKey(reportConfig.getPrimaryKey());

		reportConfigImpl.setRecId(reportConfig.getRecId());
		reportConfigImpl.setReportId(reportConfig.getReportId());
		reportConfigImpl.setEnabled(reportConfig.isEnabled());
		reportConfigImpl.setClassPK(reportConfig.getClassPK());
		reportConfigImpl.setClassNameId(reportConfig.getClassNameId());

		return reportConfigImpl;
	}

	/**
	 * Returns the report config with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the report config
	 * @return the report config
	 * @throws com.fingence.slayer.NoSuchReportConfigException if a report config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ReportConfig findByPrimaryKey(Serializable primaryKey)
		throws NoSuchReportConfigException, SystemException {
		ReportConfig reportConfig = fetchByPrimaryKey(primaryKey);

		if (reportConfig == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchReportConfigException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return reportConfig;
	}

	/**
	 * Returns the report config with the primary key or throws a {@link com.fingence.slayer.NoSuchReportConfigException} if it could not be found.
	 *
	 * @param recId the primary key of the report config
	 * @return the report config
	 * @throws com.fingence.slayer.NoSuchReportConfigException if a report config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ReportConfig findByPrimaryKey(long recId)
		throws NoSuchReportConfigException, SystemException {
		return findByPrimaryKey((Serializable)recId);
	}

	/**
	 * Returns the report config with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the report config
	 * @return the report config, or <code>null</code> if a report config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ReportConfig fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ReportConfig reportConfig = (ReportConfig)EntityCacheUtil.getResult(ReportConfigModelImpl.ENTITY_CACHE_ENABLED,
				ReportConfigImpl.class, primaryKey);

		if (reportConfig == _nullReportConfig) {
			return null;
		}

		if (reportConfig == null) {
			Session session = null;

			try {
				session = openSession();

				reportConfig = (ReportConfig)session.get(ReportConfigImpl.class,
						primaryKey);

				if (reportConfig != null) {
					cacheResult(reportConfig);
				}
				else {
					EntityCacheUtil.putResult(ReportConfigModelImpl.ENTITY_CACHE_ENABLED,
						ReportConfigImpl.class, primaryKey, _nullReportConfig);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ReportConfigModelImpl.ENTITY_CACHE_ENABLED,
					ReportConfigImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return reportConfig;
	}

	/**
	 * Returns the report config with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param recId the primary key of the report config
	 * @return the report config, or <code>null</code> if a report config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ReportConfig fetchByPrimaryKey(long recId) throws SystemException {
		return fetchByPrimaryKey((Serializable)recId);
	}

	/**
	 * Returns all the report configs.
	 *
	 * @return the report configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ReportConfig> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<ReportConfig> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<ReportConfig> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<ReportConfig> list = (List<ReportConfig>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_REPORTCONFIG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_REPORTCONFIG;

				if (pagination) {
					sql = sql.concat(ReportConfigModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ReportConfig>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ReportConfig>(list);
				}
				else {
					list = (List<ReportConfig>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the report configs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ReportConfig reportConfig : findAll()) {
			remove(reportConfig);
		}
	}

	/**
	 * Returns the number of report configs.
	 *
	 * @return the number of report configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_REPORTCONFIG);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the report config persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.fingence.slayer.model.ReportConfig")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ReportConfig>> listenersList = new ArrayList<ModelListener<ReportConfig>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ReportConfig>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(ReportConfigImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_REPORTCONFIG = "SELECT reportConfig FROM ReportConfig reportConfig";
	private static final String _SQL_SELECT_REPORTCONFIG_WHERE = "SELECT reportConfig FROM ReportConfig reportConfig WHERE ";
	private static final String _SQL_COUNT_REPORTCONFIG = "SELECT COUNT(reportConfig) FROM ReportConfig reportConfig";
	private static final String _SQL_COUNT_REPORTCONFIG_WHERE = "SELECT COUNT(reportConfig) FROM ReportConfig reportConfig WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "reportConfig.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ReportConfig exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ReportConfig exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ReportConfigPersistenceImpl.class);
	private static ReportConfig _nullReportConfig = new ReportConfigImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ReportConfig> toCacheModel() {
				return _nullReportConfigCacheModel;
			}
		};

	private static CacheModel<ReportConfig> _nullReportConfigCacheModel = new CacheModel<ReportConfig>() {
			@Override
			public ReportConfig toEntityModel() {
				return _nullReportConfig;
			}
		};
}