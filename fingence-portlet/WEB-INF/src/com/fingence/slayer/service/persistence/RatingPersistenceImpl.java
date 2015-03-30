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

import com.fingence.slayer.NoSuchRatingException;
import com.fingence.slayer.model.Rating;
import com.fingence.slayer.model.impl.RatingImpl;
import com.fingence.slayer.model.impl.RatingModelImpl;

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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the rating service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Ahmed Hasan
 * @see RatingPersistence
 * @see RatingUtil
 * @generated
 */
public class RatingPersistenceImpl extends BasePersistenceImpl<Rating>
	implements RatingPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link RatingUtil} to access the rating persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = RatingImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RatingModelImpl.ENTITY_CACHE_ENABLED,
			RatingModelImpl.FINDER_CACHE_ENABLED, RatingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RatingModelImpl.ENTITY_CACHE_ENABLED,
			RatingModelImpl.FINDER_CACHE_ENABLED, RatingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RatingModelImpl.ENTITY_CACHE_ENABLED,
			RatingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_SP_MOODY = new FinderPath(RatingModelImpl.ENTITY_CACHE_ENABLED,
			RatingModelImpl.FINDER_CACHE_ENABLED, RatingImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchBySP_Moody",
			new String[] { String.class.getName(), String.class.getName() },
			RatingModelImpl.SANDP_COLUMN_BITMASK |
			RatingModelImpl.MOODYS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SP_MOODY = new FinderPath(RatingModelImpl.ENTITY_CACHE_ENABLED,
			RatingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySP_Moody",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns the rating where sandp = &#63; and moodys = &#63; or throws a {@link com.fingence.slayer.NoSuchRatingException} if it could not be found.
	 *
	 * @param sandp the sandp
	 * @param moodys the moodys
	 * @return the matching rating
	 * @throws com.fingence.slayer.NoSuchRatingException if a matching rating could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Rating findBySP_Moody(String sandp, String moodys)
		throws NoSuchRatingException, SystemException {
		Rating rating = fetchBySP_Moody(sandp, moodys);

		if (rating == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("sandp=");
			msg.append(sandp);

			msg.append(", moodys=");
			msg.append(moodys);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchRatingException(msg.toString());
		}

		return rating;
	}

	/**
	 * Returns the rating where sandp = &#63; and moodys = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sandp the sandp
	 * @param moodys the moodys
	 * @return the matching rating, or <code>null</code> if a matching rating could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Rating fetchBySP_Moody(String sandp, String moodys)
		throws SystemException {
		return fetchBySP_Moody(sandp, moodys, true);
	}

	/**
	 * Returns the rating where sandp = &#63; and moodys = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sandp the sandp
	 * @param moodys the moodys
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching rating, or <code>null</code> if a matching rating could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Rating fetchBySP_Moody(String sandp, String moodys,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { sandp, moodys };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_SP_MOODY,
					finderArgs, this);
		}

		if (result instanceof Rating) {
			Rating rating = (Rating)result;

			if (!Validator.equals(sandp, rating.getSandp()) ||
					!Validator.equals(moodys, rating.getMoodys())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_RATING_WHERE);

			boolean bindSandp = false;

			if (sandp == null) {
				query.append(_FINDER_COLUMN_SP_MOODY_SANDP_1);
			}
			else if (sandp.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SP_MOODY_SANDP_3);
			}
			else {
				bindSandp = true;

				query.append(_FINDER_COLUMN_SP_MOODY_SANDP_2);
			}

			boolean bindMoodys = false;

			if (moodys == null) {
				query.append(_FINDER_COLUMN_SP_MOODY_MOODYS_1);
			}
			else if (moodys.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SP_MOODY_MOODYS_3);
			}
			else {
				bindMoodys = true;

				query.append(_FINDER_COLUMN_SP_MOODY_MOODYS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSandp) {
					qPos.add(sandp);
				}

				if (bindMoodys) {
					qPos.add(moodys);
				}

				List<Rating> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SP_MOODY,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"RatingPersistenceImpl.fetchBySP_Moody(String, String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					Rating rating = list.get(0);

					result = rating;

					cacheResult(rating);

					if ((rating.getSandp() == null) ||
							!rating.getSandp().equals(sandp) ||
							(rating.getMoodys() == null) ||
							!rating.getMoodys().equals(moodys)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SP_MOODY,
							finderArgs, rating);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SP_MOODY,
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
			return (Rating)result;
		}
	}

	/**
	 * Removes the rating where sandp = &#63; and moodys = &#63; from the database.
	 *
	 * @param sandp the sandp
	 * @param moodys the moodys
	 * @return the rating that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Rating removeBySP_Moody(String sandp, String moodys)
		throws NoSuchRatingException, SystemException {
		Rating rating = findBySP_Moody(sandp, moodys);

		return remove(rating);
	}

	/**
	 * Returns the number of ratings where sandp = &#63; and moodys = &#63;.
	 *
	 * @param sandp the sandp
	 * @param moodys the moodys
	 * @return the number of matching ratings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBySP_Moody(String sandp, String moodys)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SP_MOODY;

		Object[] finderArgs = new Object[] { sandp, moodys };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_RATING_WHERE);

			boolean bindSandp = false;

			if (sandp == null) {
				query.append(_FINDER_COLUMN_SP_MOODY_SANDP_1);
			}
			else if (sandp.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SP_MOODY_SANDP_3);
			}
			else {
				bindSandp = true;

				query.append(_FINDER_COLUMN_SP_MOODY_SANDP_2);
			}

			boolean bindMoodys = false;

			if (moodys == null) {
				query.append(_FINDER_COLUMN_SP_MOODY_MOODYS_1);
			}
			else if (moodys.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SP_MOODY_MOODYS_3);
			}
			else {
				bindMoodys = true;

				query.append(_FINDER_COLUMN_SP_MOODY_MOODYS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSandp) {
					qPos.add(sandp);
				}

				if (bindMoodys) {
					qPos.add(moodys);
				}

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

	private static final String _FINDER_COLUMN_SP_MOODY_SANDP_1 = "rating.sandp IS NULL AND ";
	private static final String _FINDER_COLUMN_SP_MOODY_SANDP_2 = "rating.sandp = ? AND ";
	private static final String _FINDER_COLUMN_SP_MOODY_SANDP_3 = "(rating.sandp IS NULL OR rating.sandp = '') AND ";
	private static final String _FINDER_COLUMN_SP_MOODY_MOODYS_1 = "rating.moodys IS NULL";
	private static final String _FINDER_COLUMN_SP_MOODY_MOODYS_2 = "rating.moodys = ?";
	private static final String _FINDER_COLUMN_SP_MOODY_MOODYS_3 = "(rating.moodys IS NULL OR rating.moodys = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_COMPOSITE = new FinderPath(RatingModelImpl.ENTITY_CACHE_ENABLED,
			RatingModelImpl.FINDER_CACHE_ENABLED, RatingImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByComposite",
			new String[] { String.class.getName() },
			RatingModelImpl.FITCH_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COMPOSITE = new FinderPath(RatingModelImpl.ENTITY_CACHE_ENABLED,
			RatingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByComposite",
			new String[] { String.class.getName() });

	/**
	 * Returns the rating where fitch = &#63; or throws a {@link com.fingence.slayer.NoSuchRatingException} if it could not be found.
	 *
	 * @param fitch the fitch
	 * @return the matching rating
	 * @throws com.fingence.slayer.NoSuchRatingException if a matching rating could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Rating findByComposite(String fitch)
		throws NoSuchRatingException, SystemException {
		Rating rating = fetchByComposite(fitch);

		if (rating == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("fitch=");
			msg.append(fitch);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchRatingException(msg.toString());
		}

		return rating;
	}

	/**
	 * Returns the rating where fitch = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param fitch the fitch
	 * @return the matching rating, or <code>null</code> if a matching rating could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Rating fetchByComposite(String fitch) throws SystemException {
		return fetchByComposite(fitch, true);
	}

	/**
	 * Returns the rating where fitch = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param fitch the fitch
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching rating, or <code>null</code> if a matching rating could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Rating fetchByComposite(String fitch, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { fitch };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_COMPOSITE,
					finderArgs, this);
		}

		if (result instanceof Rating) {
			Rating rating = (Rating)result;

			if (!Validator.equals(fitch, rating.getFitch())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_RATING_WHERE);

			boolean bindFitch = false;

			if (fitch == null) {
				query.append(_FINDER_COLUMN_COMPOSITE_FITCH_1);
			}
			else if (fitch.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_COMPOSITE_FITCH_3);
			}
			else {
				bindFitch = true;

				query.append(_FINDER_COLUMN_COMPOSITE_FITCH_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFitch) {
					qPos.add(fitch);
				}

				List<Rating> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_COMPOSITE,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"RatingPersistenceImpl.fetchByComposite(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					Rating rating = list.get(0);

					result = rating;

					cacheResult(rating);

					if ((rating.getFitch() == null) ||
							!rating.getFitch().equals(fitch)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_COMPOSITE,
							finderArgs, rating);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_COMPOSITE,
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
			return (Rating)result;
		}
	}

	/**
	 * Removes the rating where fitch = &#63; from the database.
	 *
	 * @param fitch the fitch
	 * @return the rating that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Rating removeByComposite(String fitch)
		throws NoSuchRatingException, SystemException {
		Rating rating = findByComposite(fitch);

		return remove(rating);
	}

	/**
	 * Returns the number of ratings where fitch = &#63;.
	 *
	 * @param fitch the fitch
	 * @return the number of matching ratings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByComposite(String fitch) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COMPOSITE;

		Object[] finderArgs = new Object[] { fitch };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_RATING_WHERE);

			boolean bindFitch = false;

			if (fitch == null) {
				query.append(_FINDER_COLUMN_COMPOSITE_FITCH_1);
			}
			else if (fitch.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_COMPOSITE_FITCH_3);
			}
			else {
				bindFitch = true;

				query.append(_FINDER_COLUMN_COMPOSITE_FITCH_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFitch) {
					qPos.add(fitch);
				}

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

	private static final String _FINDER_COLUMN_COMPOSITE_FITCH_1 = "rating.fitch IS NULL";
	private static final String _FINDER_COLUMN_COMPOSITE_FITCH_2 = "rating.fitch = ?";
	private static final String _FINDER_COLUMN_COMPOSITE_FITCH_3 = "(rating.fitch IS NULL OR rating.fitch = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DESCRIPTION =
		new FinderPath(RatingModelImpl.ENTITY_CACHE_ENABLED,
			RatingModelImpl.FINDER_CACHE_ENABLED, RatingImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDescription",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DESCRIPTION =
		new FinderPath(RatingModelImpl.ENTITY_CACHE_ENABLED,
			RatingModelImpl.FINDER_CACHE_ENABLED, RatingImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDescription",
			new String[] { String.class.getName() },
			RatingModelImpl.DESCRIPTION_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DESCRIPTION = new FinderPath(RatingModelImpl.ENTITY_CACHE_ENABLED,
			RatingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDescription",
			new String[] { String.class.getName() });

	/**
	 * Returns all the ratings where description = &#63;.
	 *
	 * @param description the description
	 * @return the matching ratings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Rating> findByDescription(String description)
		throws SystemException {
		return findByDescription(description, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ratings where description = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.RatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param description the description
	 * @param start the lower bound of the range of ratings
	 * @param end the upper bound of the range of ratings (not inclusive)
	 * @return the range of matching ratings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Rating> findByDescription(String description, int start, int end)
		throws SystemException {
		return findByDescription(description, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ratings where description = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.RatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param description the description
	 * @param start the lower bound of the range of ratings
	 * @param end the upper bound of the range of ratings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ratings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Rating> findByDescription(String description, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DESCRIPTION;
			finderArgs = new Object[] { description };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DESCRIPTION;
			finderArgs = new Object[] { description, start, end, orderByComparator };
		}

		List<Rating> list = (List<Rating>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Rating rating : list) {
				if (!Validator.equals(description, rating.getDescription())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_RATING_WHERE);

			boolean bindDescription = false;

			if (description == null) {
				query.append(_FINDER_COLUMN_DESCRIPTION_DESCRIPTION_1);
			}
			else if (description.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DESCRIPTION_DESCRIPTION_3);
			}
			else {
				bindDescription = true;

				query.append(_FINDER_COLUMN_DESCRIPTION_DESCRIPTION_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(RatingModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDescription) {
					qPos.add(description);
				}

				if (!pagination) {
					list = (List<Rating>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Rating>(list);
				}
				else {
					list = (List<Rating>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Returns the first rating in the ordered set where description = &#63;.
	 *
	 * @param description the description
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching rating
	 * @throws com.fingence.slayer.NoSuchRatingException if a matching rating could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Rating findByDescription_First(String description,
		OrderByComparator orderByComparator)
		throws NoSuchRatingException, SystemException {
		Rating rating = fetchByDescription_First(description, orderByComparator);

		if (rating != null) {
			return rating;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("description=");
		msg.append(description);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRatingException(msg.toString());
	}

	/**
	 * Returns the first rating in the ordered set where description = &#63;.
	 *
	 * @param description the description
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching rating, or <code>null</code> if a matching rating could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Rating fetchByDescription_First(String description,
		OrderByComparator orderByComparator) throws SystemException {
		List<Rating> list = findByDescription(description, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last rating in the ordered set where description = &#63;.
	 *
	 * @param description the description
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching rating
	 * @throws com.fingence.slayer.NoSuchRatingException if a matching rating could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Rating findByDescription_Last(String description,
		OrderByComparator orderByComparator)
		throws NoSuchRatingException, SystemException {
		Rating rating = fetchByDescription_Last(description, orderByComparator);

		if (rating != null) {
			return rating;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("description=");
		msg.append(description);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRatingException(msg.toString());
	}

	/**
	 * Returns the last rating in the ordered set where description = &#63;.
	 *
	 * @param description the description
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching rating, or <code>null</code> if a matching rating could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Rating fetchByDescription_Last(String description,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByDescription(description);

		if (count == 0) {
			return null;
		}

		List<Rating> list = findByDescription(description, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ratings before and after the current rating in the ordered set where description = &#63;.
	 *
	 * @param ratingId the primary key of the current rating
	 * @param description the description
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next rating
	 * @throws com.fingence.slayer.NoSuchRatingException if a rating with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Rating[] findByDescription_PrevAndNext(long ratingId,
		String description, OrderByComparator orderByComparator)
		throws NoSuchRatingException, SystemException {
		Rating rating = findByPrimaryKey(ratingId);

		Session session = null;

		try {
			session = openSession();

			Rating[] array = new RatingImpl[3];

			array[0] = getByDescription_PrevAndNext(session, rating,
					description, orderByComparator, true);

			array[1] = rating;

			array[2] = getByDescription_PrevAndNext(session, rating,
					description, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Rating getByDescription_PrevAndNext(Session session,
		Rating rating, String description, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_RATING_WHERE);

		boolean bindDescription = false;

		if (description == null) {
			query.append(_FINDER_COLUMN_DESCRIPTION_DESCRIPTION_1);
		}
		else if (description.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DESCRIPTION_DESCRIPTION_3);
		}
		else {
			bindDescription = true;

			query.append(_FINDER_COLUMN_DESCRIPTION_DESCRIPTION_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(RatingModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDescription) {
			qPos.add(description);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(rating);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Rating> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ratings where description = &#63; from the database.
	 *
	 * @param description the description
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDescription(String description)
		throws SystemException {
		for (Rating rating : findByDescription(description, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(rating);
		}
	}

	/**
	 * Returns the number of ratings where description = &#63;.
	 *
	 * @param description the description
	 * @return the number of matching ratings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDescription(String description) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DESCRIPTION;

		Object[] finderArgs = new Object[] { description };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_RATING_WHERE);

			boolean bindDescription = false;

			if (description == null) {
				query.append(_FINDER_COLUMN_DESCRIPTION_DESCRIPTION_1);
			}
			else if (description.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DESCRIPTION_DESCRIPTION_3);
			}
			else {
				bindDescription = true;

				query.append(_FINDER_COLUMN_DESCRIPTION_DESCRIPTION_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDescription) {
					qPos.add(description);
				}

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

	private static final String _FINDER_COLUMN_DESCRIPTION_DESCRIPTION_1 = "rating.description IS NULL";
	private static final String _FINDER_COLUMN_DESCRIPTION_DESCRIPTION_2 = "rating.description = ?";
	private static final String _FINDER_COLUMN_DESCRIPTION_DESCRIPTION_3 = "(rating.description IS NULL OR rating.description = '')";

	public RatingPersistenceImpl() {
		setModelClass(Rating.class);
	}

	/**
	 * Caches the rating in the entity cache if it is enabled.
	 *
	 * @param rating the rating
	 */
	@Override
	public void cacheResult(Rating rating) {
		EntityCacheUtil.putResult(RatingModelImpl.ENTITY_CACHE_ENABLED,
			RatingImpl.class, rating.getPrimaryKey(), rating);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SP_MOODY,
			new Object[] { rating.getSandp(), rating.getMoodys() }, rating);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_COMPOSITE,
			new Object[] { rating.getFitch() }, rating);

		rating.resetOriginalValues();
	}

	/**
	 * Caches the ratings in the entity cache if it is enabled.
	 *
	 * @param ratings the ratings
	 */
	@Override
	public void cacheResult(List<Rating> ratings) {
		for (Rating rating : ratings) {
			if (EntityCacheUtil.getResult(
						RatingModelImpl.ENTITY_CACHE_ENABLED, RatingImpl.class,
						rating.getPrimaryKey()) == null) {
				cacheResult(rating);
			}
			else {
				rating.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ratings.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(RatingImpl.class.getName());
		}

		EntityCacheUtil.clearCache(RatingImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the rating.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Rating rating) {
		EntityCacheUtil.removeResult(RatingModelImpl.ENTITY_CACHE_ENABLED,
			RatingImpl.class, rating.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(rating);
	}

	@Override
	public void clearCache(List<Rating> ratings) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Rating rating : ratings) {
			EntityCacheUtil.removeResult(RatingModelImpl.ENTITY_CACHE_ENABLED,
				RatingImpl.class, rating.getPrimaryKey());

			clearUniqueFindersCache(rating);
		}
	}

	protected void cacheUniqueFindersCache(Rating rating) {
		if (rating.isNew()) {
			Object[] args = new Object[] { rating.getSandp(), rating.getMoodys() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SP_MOODY, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SP_MOODY, args,
				rating);

			args = new Object[] { rating.getFitch() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_COMPOSITE, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_COMPOSITE, args,
				rating);
		}
		else {
			RatingModelImpl ratingModelImpl = (RatingModelImpl)rating;

			if ((ratingModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_SP_MOODY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						rating.getSandp(), rating.getMoodys()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_SP_MOODY, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_SP_MOODY, args,
					rating);
			}

			if ((ratingModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_COMPOSITE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { rating.getFitch() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_COMPOSITE, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_COMPOSITE, args,
					rating);
			}
		}
	}

	protected void clearUniqueFindersCache(Rating rating) {
		RatingModelImpl ratingModelImpl = (RatingModelImpl)rating;

		Object[] args = new Object[] { rating.getSandp(), rating.getMoodys() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SP_MOODY, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SP_MOODY, args);

		if ((ratingModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_SP_MOODY.getColumnBitmask()) != 0) {
			args = new Object[] {
					ratingModelImpl.getOriginalSandp(),
					ratingModelImpl.getOriginalMoodys()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SP_MOODY, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_SP_MOODY, args);
		}

		args = new Object[] { rating.getFitch() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPOSITE, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_COMPOSITE, args);

		if ((ratingModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_COMPOSITE.getColumnBitmask()) != 0) {
			args = new Object[] { ratingModelImpl.getOriginalFitch() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPOSITE, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_COMPOSITE, args);
		}
	}

	/**
	 * Creates a new rating with the primary key. Does not add the rating to the database.
	 *
	 * @param ratingId the primary key for the new rating
	 * @return the new rating
	 */
	@Override
	public Rating create(long ratingId) {
		Rating rating = new RatingImpl();

		rating.setNew(true);
		rating.setPrimaryKey(ratingId);

		return rating;
	}

	/**
	 * Removes the rating with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ratingId the primary key of the rating
	 * @return the rating that was removed
	 * @throws com.fingence.slayer.NoSuchRatingException if a rating with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Rating remove(long ratingId)
		throws NoSuchRatingException, SystemException {
		return remove((Serializable)ratingId);
	}

	/**
	 * Removes the rating with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the rating
	 * @return the rating that was removed
	 * @throws com.fingence.slayer.NoSuchRatingException if a rating with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Rating remove(Serializable primaryKey)
		throws NoSuchRatingException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Rating rating = (Rating)session.get(RatingImpl.class, primaryKey);

			if (rating == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRatingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(rating);
		}
		catch (NoSuchRatingException nsee) {
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
	protected Rating removeImpl(Rating rating) throws SystemException {
		rating = toUnwrappedModel(rating);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(rating)) {
				rating = (Rating)session.get(RatingImpl.class,
						rating.getPrimaryKeyObj());
			}

			if (rating != null) {
				session.delete(rating);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (rating != null) {
			clearCache(rating);
		}

		return rating;
	}

	@Override
	public Rating updateImpl(com.fingence.slayer.model.Rating rating)
		throws SystemException {
		rating = toUnwrappedModel(rating);

		boolean isNew = rating.isNew();

		RatingModelImpl ratingModelImpl = (RatingModelImpl)rating;

		Session session = null;

		try {
			session = openSession();

			if (rating.isNew()) {
				session.save(rating);

				rating.setNew(false);
			}
			else {
				session.merge(rating);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !RatingModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((ratingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DESCRIPTION.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						ratingModelImpl.getOriginalDescription()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DESCRIPTION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DESCRIPTION,
					args);

				args = new Object[] { ratingModelImpl.getDescription() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DESCRIPTION,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DESCRIPTION,
					args);
			}
		}

		EntityCacheUtil.putResult(RatingModelImpl.ENTITY_CACHE_ENABLED,
			RatingImpl.class, rating.getPrimaryKey(), rating);

		clearUniqueFindersCache(rating);
		cacheUniqueFindersCache(rating);

		return rating;
	}

	protected Rating toUnwrappedModel(Rating rating) {
		if (rating instanceof RatingImpl) {
			return rating;
		}

		RatingImpl ratingImpl = new RatingImpl();

		ratingImpl.setNew(rating.isNew());
		ratingImpl.setPrimaryKey(rating.getPrimaryKey());

		ratingImpl.setRatingId(rating.getRatingId());
		ratingImpl.setMoodys(rating.getMoodys());
		ratingImpl.setSandp(rating.getSandp());
		ratingImpl.setFitch(rating.getFitch());
		ratingImpl.setGeneral(rating.getGeneral());
		ratingImpl.setDescription(rating.getDescription());
		ratingImpl.setCreditWorthiness(rating.getCreditWorthiness());
		ratingImpl.setCategory(rating.getCategory());

		return ratingImpl;
	}

	/**
	 * Returns the rating with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the rating
	 * @return the rating
	 * @throws com.fingence.slayer.NoSuchRatingException if a rating with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Rating findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRatingException, SystemException {
		Rating rating = fetchByPrimaryKey(primaryKey);

		if (rating == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRatingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return rating;
	}

	/**
	 * Returns the rating with the primary key or throws a {@link com.fingence.slayer.NoSuchRatingException} if it could not be found.
	 *
	 * @param ratingId the primary key of the rating
	 * @return the rating
	 * @throws com.fingence.slayer.NoSuchRatingException if a rating with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Rating findByPrimaryKey(long ratingId)
		throws NoSuchRatingException, SystemException {
		return findByPrimaryKey((Serializable)ratingId);
	}

	/**
	 * Returns the rating with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the rating
	 * @return the rating, or <code>null</code> if a rating with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Rating fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Rating rating = (Rating)EntityCacheUtil.getResult(RatingModelImpl.ENTITY_CACHE_ENABLED,
				RatingImpl.class, primaryKey);

		if (rating == _nullRating) {
			return null;
		}

		if (rating == null) {
			Session session = null;

			try {
				session = openSession();

				rating = (Rating)session.get(RatingImpl.class, primaryKey);

				if (rating != null) {
					cacheResult(rating);
				}
				else {
					EntityCacheUtil.putResult(RatingModelImpl.ENTITY_CACHE_ENABLED,
						RatingImpl.class, primaryKey, _nullRating);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(RatingModelImpl.ENTITY_CACHE_ENABLED,
					RatingImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return rating;
	}

	/**
	 * Returns the rating with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ratingId the primary key of the rating
	 * @return the rating, or <code>null</code> if a rating with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Rating fetchByPrimaryKey(long ratingId) throws SystemException {
		return fetchByPrimaryKey((Serializable)ratingId);
	}

	/**
	 * Returns all the ratings.
	 *
	 * @return the ratings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Rating> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ratings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.RatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ratings
	 * @param end the upper bound of the range of ratings (not inclusive)
	 * @return the range of ratings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Rating> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ratings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fingence.slayer.model.impl.RatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ratings
	 * @param end the upper bound of the range of ratings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ratings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Rating> findAll(int start, int end,
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

		List<Rating> list = (List<Rating>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_RATING);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_RATING;

				if (pagination) {
					sql = sql.concat(RatingModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Rating>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Rating>(list);
				}
				else {
					list = (List<Rating>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the ratings from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Rating rating : findAll()) {
			remove(rating);
		}
	}

	/**
	 * Returns the number of ratings.
	 *
	 * @return the number of ratings
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

				Query q = session.createQuery(_SQL_COUNT_RATING);

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
	 * Initializes the rating persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.fingence.slayer.model.Rating")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Rating>> listenersList = new ArrayList<ModelListener<Rating>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Rating>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(RatingImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_RATING = "SELECT rating FROM Rating rating";
	private static final String _SQL_SELECT_RATING_WHERE = "SELECT rating FROM Rating rating WHERE ";
	private static final String _SQL_COUNT_RATING = "SELECT COUNT(rating) FROM Rating rating";
	private static final String _SQL_COUNT_RATING_WHERE = "SELECT COUNT(rating) FROM Rating rating WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "rating.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Rating exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Rating exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(RatingPersistenceImpl.class);
	private static Rating _nullRating = new RatingImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Rating> toCacheModel() {
				return _nullRatingCacheModel;
			}
		};

	private static CacheModel<Rating> _nullRatingCacheModel = new CacheModel<Rating>() {
			@Override
			public Rating toEntityModel() {
				return _nullRating;
			}
		};
}