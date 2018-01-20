/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.bmstu.groups.manager.core.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.bmstu.groups.manager.core.exception.NoSuchTraccarGroupException;
import com.bmstu.groups.manager.core.model.TraccarGroup;
import com.bmstu.groups.manager.core.model.impl.TraccarGroupImpl;
import com.bmstu.groups.manager.core.model.impl.TraccarGroupModelImpl;
import com.bmstu.groups.manager.core.service.persistence.TraccarGroupPersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReflectionUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the traccar group service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Kylebyakin
 * @see TraccarGroupPersistence
 * @see com.bmstu.groups.manager.core.service.persistence.TraccarGroupUtil
 * @generated
 */
@ProviderType
public class TraccarGroupPersistenceImpl extends BasePersistenceImpl<TraccarGroup>
	implements TraccarGroupPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TraccarGroupUtil} to access the traccar group persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TraccarGroupImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TraccarGroupModelImpl.ENTITY_CACHE_ENABLED,
			TraccarGroupModelImpl.FINDER_CACHE_ENABLED, TraccarGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TraccarGroupModelImpl.ENTITY_CACHE_ENABLED,
			TraccarGroupModelImpl.FINDER_CACHE_ENABLED, TraccarGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TraccarGroupModelImpl.ENTITY_CACHE_ENABLED,
			TraccarGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(TraccarGroupModelImpl.ENTITY_CACHE_ENABLED,
			TraccarGroupModelImpl.FINDER_CACHE_ENABLED, TraccarGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(TraccarGroupModelImpl.ENTITY_CACHE_ENABLED,
			TraccarGroupModelImpl.FINDER_CACHE_ENABLED, TraccarGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			TraccarGroupModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(TraccarGroupModelImpl.ENTITY_CACHE_ENABLED,
			TraccarGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the traccar groups where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching traccar groups
	 */
	@Override
	public List<TraccarGroup> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the traccar groups where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TraccarGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of traccar groups
	 * @param end the upper bound of the range of traccar groups (not inclusive)
	 * @return the range of matching traccar groups
	 */
	@Override
	public List<TraccarGroup> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the traccar groups where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TraccarGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of traccar groups
	 * @param end the upper bound of the range of traccar groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching traccar groups
	 */
	@Override
	public List<TraccarGroup> findByUuid(String uuid, int start, int end,
		OrderByComparator<TraccarGroup> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the traccar groups where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TraccarGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of traccar groups
	 * @param end the upper bound of the range of traccar groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching traccar groups
	 */
	@Override
	public List<TraccarGroup> findByUuid(String uuid, int start, int end,
		OrderByComparator<TraccarGroup> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<TraccarGroup> list = null;

		if (retrieveFromCache) {
			list = (List<TraccarGroup>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TraccarGroup traccarGroup : list) {
					if (!Objects.equals(uuid, traccarGroup.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_TRACCARGROUP_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TraccarGroupModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<TraccarGroup>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TraccarGroup>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first traccar group in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching traccar group
	 * @throws NoSuchTraccarGroupException if a matching traccar group could not be found
	 */
	@Override
	public TraccarGroup findByUuid_First(String uuid,
		OrderByComparator<TraccarGroup> orderByComparator)
		throws NoSuchTraccarGroupException {
		TraccarGroup traccarGroup = fetchByUuid_First(uuid, orderByComparator);

		if (traccarGroup != null) {
			return traccarGroup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTraccarGroupException(msg.toString());
	}

	/**
	 * Returns the first traccar group in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching traccar group, or <code>null</code> if a matching traccar group could not be found
	 */
	@Override
	public TraccarGroup fetchByUuid_First(String uuid,
		OrderByComparator<TraccarGroup> orderByComparator) {
		List<TraccarGroup> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last traccar group in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching traccar group
	 * @throws NoSuchTraccarGroupException if a matching traccar group could not be found
	 */
	@Override
	public TraccarGroup findByUuid_Last(String uuid,
		OrderByComparator<TraccarGroup> orderByComparator)
		throws NoSuchTraccarGroupException {
		TraccarGroup traccarGroup = fetchByUuid_Last(uuid, orderByComparator);

		if (traccarGroup != null) {
			return traccarGroup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTraccarGroupException(msg.toString());
	}

	/**
	 * Returns the last traccar group in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching traccar group, or <code>null</code> if a matching traccar group could not be found
	 */
	@Override
	public TraccarGroup fetchByUuid_Last(String uuid,
		OrderByComparator<TraccarGroup> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<TraccarGroup> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the traccar groups before and after the current traccar group in the ordered set where uuid = &#63;.
	 *
	 * @param traccarGroupId the primary key of the current traccar group
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next traccar group
	 * @throws NoSuchTraccarGroupException if a traccar group with the primary key could not be found
	 */
	@Override
	public TraccarGroup[] findByUuid_PrevAndNext(long traccarGroupId,
		String uuid, OrderByComparator<TraccarGroup> orderByComparator)
		throws NoSuchTraccarGroupException {
		TraccarGroup traccarGroup = findByPrimaryKey(traccarGroupId);

		Session session = null;

		try {
			session = openSession();

			TraccarGroup[] array = new TraccarGroupImpl[3];

			array[0] = getByUuid_PrevAndNext(session, traccarGroup, uuid,
					orderByComparator, true);

			array[1] = traccarGroup;

			array[2] = getByUuid_PrevAndNext(session, traccarGroup, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TraccarGroup getByUuid_PrevAndNext(Session session,
		TraccarGroup traccarGroup, String uuid,
		OrderByComparator<TraccarGroup> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TRACCARGROUP_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
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
			query.append(TraccarGroupModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(traccarGroup);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TraccarGroup> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the traccar groups where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (TraccarGroup traccarGroup : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(traccarGroup);
		}
	}

	/**
	 * Returns the number of traccar groups where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching traccar groups
	 */
	@Override
	public int countByUuid(String uuid) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TRACCARGROUP_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "traccarGroup.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "traccarGroup.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(traccarGroup.uuid IS NULL OR traccarGroup.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(TraccarGroupModelImpl.ENTITY_CACHE_ENABLED,
			TraccarGroupModelImpl.FINDER_CACHE_ENABLED, TraccarGroupImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			TraccarGroupModelImpl.UUID_COLUMN_BITMASK |
			TraccarGroupModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(TraccarGroupModelImpl.ENTITY_CACHE_ENABLED,
			TraccarGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the traccar group where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchTraccarGroupException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching traccar group
	 * @throws NoSuchTraccarGroupException if a matching traccar group could not be found
	 */
	@Override
	public TraccarGroup findByUUID_G(String uuid, long groupId)
		throws NoSuchTraccarGroupException {
		TraccarGroup traccarGroup = fetchByUUID_G(uuid, groupId);

		if (traccarGroup == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchTraccarGroupException(msg.toString());
		}

		return traccarGroup;
	}

	/**
	 * Returns the traccar group where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching traccar group, or <code>null</code> if a matching traccar group could not be found
	 */
	@Override
	public TraccarGroup fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the traccar group where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching traccar group, or <code>null</code> if a matching traccar group could not be found
	 */
	@Override
	public TraccarGroup fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof TraccarGroup) {
			TraccarGroup traccarGroup = (TraccarGroup)result;

			if (!Objects.equals(uuid, traccarGroup.getUuid()) ||
					(groupId != traccarGroup.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_TRACCARGROUP_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<TraccarGroup> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					TraccarGroup traccarGroup = list.get(0);

					result = traccarGroup;

					cacheResult(traccarGroup);

					if ((traccarGroup.getUuid() == null) ||
							!traccarGroup.getUuid().equals(uuid) ||
							(traccarGroup.getGroupId() != groupId)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, traccarGroup);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, finderArgs);

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
			return (TraccarGroup)result;
		}
	}

	/**
	 * Removes the traccar group where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the traccar group that was removed
	 */
	@Override
	public TraccarGroup removeByUUID_G(String uuid, long groupId)
		throws NoSuchTraccarGroupException {
		TraccarGroup traccarGroup = findByUUID_G(uuid, groupId);

		return remove(traccarGroup);
	}

	/**
	 * Returns the number of traccar groups where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching traccar groups
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TRACCARGROUP_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "traccarGroup.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "traccarGroup.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(traccarGroup.uuid IS NULL OR traccarGroup.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "traccarGroup.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(TraccarGroupModelImpl.ENTITY_CACHE_ENABLED,
			TraccarGroupModelImpl.FINDER_CACHE_ENABLED, TraccarGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(TraccarGroupModelImpl.ENTITY_CACHE_ENABLED,
			TraccarGroupModelImpl.FINDER_CACHE_ENABLED, TraccarGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			TraccarGroupModelImpl.UUID_COLUMN_BITMASK |
			TraccarGroupModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(TraccarGroupModelImpl.ENTITY_CACHE_ENABLED,
			TraccarGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the traccar groups where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching traccar groups
	 */
	@Override
	public List<TraccarGroup> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the traccar groups where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TraccarGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of traccar groups
	 * @param end the upper bound of the range of traccar groups (not inclusive)
	 * @return the range of matching traccar groups
	 */
	@Override
	public List<TraccarGroup> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the traccar groups where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TraccarGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of traccar groups
	 * @param end the upper bound of the range of traccar groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching traccar groups
	 */
	@Override
	public List<TraccarGroup> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<TraccarGroup> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the traccar groups where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TraccarGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of traccar groups
	 * @param end the upper bound of the range of traccar groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching traccar groups
	 */
	@Override
	public List<TraccarGroup> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<TraccarGroup> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<TraccarGroup> list = null;

		if (retrieveFromCache) {
			list = (List<TraccarGroup>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TraccarGroup traccarGroup : list) {
					if (!Objects.equals(uuid, traccarGroup.getUuid()) ||
							(companyId != traccarGroup.getCompanyId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_TRACCARGROUP_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TraccarGroupModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<TraccarGroup>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TraccarGroup>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first traccar group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching traccar group
	 * @throws NoSuchTraccarGroupException if a matching traccar group could not be found
	 */
	@Override
	public TraccarGroup findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<TraccarGroup> orderByComparator)
		throws NoSuchTraccarGroupException {
		TraccarGroup traccarGroup = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (traccarGroup != null) {
			return traccarGroup;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTraccarGroupException(msg.toString());
	}

	/**
	 * Returns the first traccar group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching traccar group, or <code>null</code> if a matching traccar group could not be found
	 */
	@Override
	public TraccarGroup fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<TraccarGroup> orderByComparator) {
		List<TraccarGroup> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last traccar group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching traccar group
	 * @throws NoSuchTraccarGroupException if a matching traccar group could not be found
	 */
	@Override
	public TraccarGroup findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<TraccarGroup> orderByComparator)
		throws NoSuchTraccarGroupException {
		TraccarGroup traccarGroup = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (traccarGroup != null) {
			return traccarGroup;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTraccarGroupException(msg.toString());
	}

	/**
	 * Returns the last traccar group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching traccar group, or <code>null</code> if a matching traccar group could not be found
	 */
	@Override
	public TraccarGroup fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<TraccarGroup> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<TraccarGroup> list = findByUuid_C(uuid, companyId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the traccar groups before and after the current traccar group in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param traccarGroupId the primary key of the current traccar group
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next traccar group
	 * @throws NoSuchTraccarGroupException if a traccar group with the primary key could not be found
	 */
	@Override
	public TraccarGroup[] findByUuid_C_PrevAndNext(long traccarGroupId,
		String uuid, long companyId,
		OrderByComparator<TraccarGroup> orderByComparator)
		throws NoSuchTraccarGroupException {
		TraccarGroup traccarGroup = findByPrimaryKey(traccarGroupId);

		Session session = null;

		try {
			session = openSession();

			TraccarGroup[] array = new TraccarGroupImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, traccarGroup, uuid,
					companyId, orderByComparator, true);

			array[1] = traccarGroup;

			array[2] = getByUuid_C_PrevAndNext(session, traccarGroup, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TraccarGroup getByUuid_C_PrevAndNext(Session session,
		TraccarGroup traccarGroup, String uuid, long companyId,
		OrderByComparator<TraccarGroup> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_TRACCARGROUP_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

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
			query.append(TraccarGroupModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(traccarGroup);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TraccarGroup> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the traccar groups where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (TraccarGroup traccarGroup : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(traccarGroup);
		}
	}

	/**
	 * Returns the number of traccar groups where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching traccar groups
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_TRACCARGROUP_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "traccarGroup.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "traccarGroup.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(traccarGroup.uuid IS NULL OR traccarGroup.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "traccarGroup.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(TraccarGroupModelImpl.ENTITY_CACHE_ENABLED,
			TraccarGroupModelImpl.FINDER_CACHE_ENABLED, TraccarGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(TraccarGroupModelImpl.ENTITY_CACHE_ENABLED,
			TraccarGroupModelImpl.FINDER_CACHE_ENABLED, TraccarGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
			new String[] { Long.class.getName() },
			TraccarGroupModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(TraccarGroupModelImpl.ENTITY_CACHE_ENABLED,
			TraccarGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the traccar groups where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching traccar groups
	 */
	@Override
	public List<TraccarGroup> findByGroupId(long groupId) {
		return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the traccar groups where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TraccarGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of traccar groups
	 * @param end the upper bound of the range of traccar groups (not inclusive)
	 * @return the range of matching traccar groups
	 */
	@Override
	public List<TraccarGroup> findByGroupId(long groupId, int start, int end) {
		return findByGroupId(groupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the traccar groups where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TraccarGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of traccar groups
	 * @param end the upper bound of the range of traccar groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching traccar groups
	 */
	@Override
	public List<TraccarGroup> findByGroupId(long groupId, int start, int end,
		OrderByComparator<TraccarGroup> orderByComparator) {
		return findByGroupId(groupId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the traccar groups where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TraccarGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of traccar groups
	 * @param end the upper bound of the range of traccar groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching traccar groups
	 */
	@Override
	public List<TraccarGroup> findByGroupId(long groupId, int start, int end,
		OrderByComparator<TraccarGroup> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupId, start, end, orderByComparator };
		}

		List<TraccarGroup> list = null;

		if (retrieveFromCache) {
			list = (List<TraccarGroup>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TraccarGroup traccarGroup : list) {
					if ((groupId != traccarGroup.getGroupId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_TRACCARGROUP_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TraccarGroupModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<TraccarGroup>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TraccarGroup>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first traccar group in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching traccar group
	 * @throws NoSuchTraccarGroupException if a matching traccar group could not be found
	 */
	@Override
	public TraccarGroup findByGroupId_First(long groupId,
		OrderByComparator<TraccarGroup> orderByComparator)
		throws NoSuchTraccarGroupException {
		TraccarGroup traccarGroup = fetchByGroupId_First(groupId,
				orderByComparator);

		if (traccarGroup != null) {
			return traccarGroup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTraccarGroupException(msg.toString());
	}

	/**
	 * Returns the first traccar group in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching traccar group, or <code>null</code> if a matching traccar group could not be found
	 */
	@Override
	public TraccarGroup fetchByGroupId_First(long groupId,
		OrderByComparator<TraccarGroup> orderByComparator) {
		List<TraccarGroup> list = findByGroupId(groupId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last traccar group in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching traccar group
	 * @throws NoSuchTraccarGroupException if a matching traccar group could not be found
	 */
	@Override
	public TraccarGroup findByGroupId_Last(long groupId,
		OrderByComparator<TraccarGroup> orderByComparator)
		throws NoSuchTraccarGroupException {
		TraccarGroup traccarGroup = fetchByGroupId_Last(groupId,
				orderByComparator);

		if (traccarGroup != null) {
			return traccarGroup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTraccarGroupException(msg.toString());
	}

	/**
	 * Returns the last traccar group in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching traccar group, or <code>null</code> if a matching traccar group could not be found
	 */
	@Override
	public TraccarGroup fetchByGroupId_Last(long groupId,
		OrderByComparator<TraccarGroup> orderByComparator) {
		int count = countByGroupId(groupId);

		if (count == 0) {
			return null;
		}

		List<TraccarGroup> list = findByGroupId(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the traccar groups before and after the current traccar group in the ordered set where groupId = &#63;.
	 *
	 * @param traccarGroupId the primary key of the current traccar group
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next traccar group
	 * @throws NoSuchTraccarGroupException if a traccar group with the primary key could not be found
	 */
	@Override
	public TraccarGroup[] findByGroupId_PrevAndNext(long traccarGroupId,
		long groupId, OrderByComparator<TraccarGroup> orderByComparator)
		throws NoSuchTraccarGroupException {
		TraccarGroup traccarGroup = findByPrimaryKey(traccarGroupId);

		Session session = null;

		try {
			session = openSession();

			TraccarGroup[] array = new TraccarGroupImpl[3];

			array[0] = getByGroupId_PrevAndNext(session, traccarGroup, groupId,
					orderByComparator, true);

			array[1] = traccarGroup;

			array[2] = getByGroupId_PrevAndNext(session, traccarGroup, groupId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected TraccarGroup getByGroupId_PrevAndNext(Session session,
		TraccarGroup traccarGroup, long groupId,
		OrderByComparator<TraccarGroup> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TRACCARGROUP_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

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
			query.append(TraccarGroupModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(traccarGroup);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TraccarGroup> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the traccar groups where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeByGroupId(long groupId) {
		for (TraccarGroup traccarGroup : findByGroupId(groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(traccarGroup);
		}
	}

	/**
	 * Returns the number of traccar groups where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching traccar groups
	 */
	@Override
	public int countByGroupId(long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TRACCARGROUP_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "traccarGroup.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TRACCARGROUPID =
		new FinderPath(TraccarGroupModelImpl.ENTITY_CACHE_ENABLED,
			TraccarGroupModelImpl.FINDER_CACHE_ENABLED, TraccarGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTraccarGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRACCARGROUPID =
		new FinderPath(TraccarGroupModelImpl.ENTITY_CACHE_ENABLED,
			TraccarGroupModelImpl.FINDER_CACHE_ENABLED, TraccarGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTraccarGroupId",
			new String[] { Long.class.getName() },
			TraccarGroupModelImpl.TRACCARGROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TRACCARGROUPID = new FinderPath(TraccarGroupModelImpl.ENTITY_CACHE_ENABLED,
			TraccarGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTraccarGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the traccar groups where traccarGroupId = &#63;.
	 *
	 * @param traccarGroupId the traccar group ID
	 * @return the matching traccar groups
	 */
	@Override
	public List<TraccarGroup> findByTraccarGroupId(long traccarGroupId) {
		return findByTraccarGroupId(traccarGroupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the traccar groups where traccarGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TraccarGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param traccarGroupId the traccar group ID
	 * @param start the lower bound of the range of traccar groups
	 * @param end the upper bound of the range of traccar groups (not inclusive)
	 * @return the range of matching traccar groups
	 */
	@Override
	public List<TraccarGroup> findByTraccarGroupId(long traccarGroupId,
		int start, int end) {
		return findByTraccarGroupId(traccarGroupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the traccar groups where traccarGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TraccarGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param traccarGroupId the traccar group ID
	 * @param start the lower bound of the range of traccar groups
	 * @param end the upper bound of the range of traccar groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching traccar groups
	 */
	@Override
	public List<TraccarGroup> findByTraccarGroupId(long traccarGroupId,
		int start, int end, OrderByComparator<TraccarGroup> orderByComparator) {
		return findByTraccarGroupId(traccarGroupId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the traccar groups where traccarGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TraccarGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param traccarGroupId the traccar group ID
	 * @param start the lower bound of the range of traccar groups
	 * @param end the upper bound of the range of traccar groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching traccar groups
	 */
	@Override
	public List<TraccarGroup> findByTraccarGroupId(long traccarGroupId,
		int start, int end, OrderByComparator<TraccarGroup> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRACCARGROUPID;
			finderArgs = new Object[] { traccarGroupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TRACCARGROUPID;
			finderArgs = new Object[] {
					traccarGroupId,
					
					start, end, orderByComparator
				};
		}

		List<TraccarGroup> list = null;

		if (retrieveFromCache) {
			list = (List<TraccarGroup>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TraccarGroup traccarGroup : list) {
					if ((traccarGroupId != traccarGroup.getTraccarGroupId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_TRACCARGROUP_WHERE);

			query.append(_FINDER_COLUMN_TRACCARGROUPID_TRACCARGROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TraccarGroupModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(traccarGroupId);

				if (!pagination) {
					list = (List<TraccarGroup>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TraccarGroup>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first traccar group in the ordered set where traccarGroupId = &#63;.
	 *
	 * @param traccarGroupId the traccar group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching traccar group
	 * @throws NoSuchTraccarGroupException if a matching traccar group could not be found
	 */
	@Override
	public TraccarGroup findByTraccarGroupId_First(long traccarGroupId,
		OrderByComparator<TraccarGroup> orderByComparator)
		throws NoSuchTraccarGroupException {
		TraccarGroup traccarGroup = fetchByTraccarGroupId_First(traccarGroupId,
				orderByComparator);

		if (traccarGroup != null) {
			return traccarGroup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("traccarGroupId=");
		msg.append(traccarGroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTraccarGroupException(msg.toString());
	}

	/**
	 * Returns the first traccar group in the ordered set where traccarGroupId = &#63;.
	 *
	 * @param traccarGroupId the traccar group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching traccar group, or <code>null</code> if a matching traccar group could not be found
	 */
	@Override
	public TraccarGroup fetchByTraccarGroupId_First(long traccarGroupId,
		OrderByComparator<TraccarGroup> orderByComparator) {
		List<TraccarGroup> list = findByTraccarGroupId(traccarGroupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last traccar group in the ordered set where traccarGroupId = &#63;.
	 *
	 * @param traccarGroupId the traccar group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching traccar group
	 * @throws NoSuchTraccarGroupException if a matching traccar group could not be found
	 */
	@Override
	public TraccarGroup findByTraccarGroupId_Last(long traccarGroupId,
		OrderByComparator<TraccarGroup> orderByComparator)
		throws NoSuchTraccarGroupException {
		TraccarGroup traccarGroup = fetchByTraccarGroupId_Last(traccarGroupId,
				orderByComparator);

		if (traccarGroup != null) {
			return traccarGroup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("traccarGroupId=");
		msg.append(traccarGroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTraccarGroupException(msg.toString());
	}

	/**
	 * Returns the last traccar group in the ordered set where traccarGroupId = &#63;.
	 *
	 * @param traccarGroupId the traccar group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching traccar group, or <code>null</code> if a matching traccar group could not be found
	 */
	@Override
	public TraccarGroup fetchByTraccarGroupId_Last(long traccarGroupId,
		OrderByComparator<TraccarGroup> orderByComparator) {
		int count = countByTraccarGroupId(traccarGroupId);

		if (count == 0) {
			return null;
		}

		List<TraccarGroup> list = findByTraccarGroupId(traccarGroupId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the traccar groups where traccarGroupId = &#63; from the database.
	 *
	 * @param traccarGroupId the traccar group ID
	 */
	@Override
	public void removeByTraccarGroupId(long traccarGroupId) {
		for (TraccarGroup traccarGroup : findByTraccarGroupId(traccarGroupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(traccarGroup);
		}
	}

	/**
	 * Returns the number of traccar groups where traccarGroupId = &#63;.
	 *
	 * @param traccarGroupId the traccar group ID
	 * @return the number of matching traccar groups
	 */
	@Override
	public int countByTraccarGroupId(long traccarGroupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TRACCARGROUPID;

		Object[] finderArgs = new Object[] { traccarGroupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TRACCARGROUP_WHERE);

			query.append(_FINDER_COLUMN_TRACCARGROUPID_TRACCARGROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(traccarGroupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_TRACCARGROUPID_TRACCARGROUPID_2 = "traccarGroup.traccarGroupId = ?";

	public TraccarGroupPersistenceImpl() {
		setModelClass(TraccarGroup.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("uuid", "uuid_");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the traccar group in the entity cache if it is enabled.
	 *
	 * @param traccarGroup the traccar group
	 */
	@Override
	public void cacheResult(TraccarGroup traccarGroup) {
		entityCache.putResult(TraccarGroupModelImpl.ENTITY_CACHE_ENABLED,
			TraccarGroupImpl.class, traccarGroup.getPrimaryKey(), traccarGroup);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { traccarGroup.getUuid(), traccarGroup.getGroupId() },
			traccarGroup);

		traccarGroup.resetOriginalValues();
	}

	/**
	 * Caches the traccar groups in the entity cache if it is enabled.
	 *
	 * @param traccarGroups the traccar groups
	 */
	@Override
	public void cacheResult(List<TraccarGroup> traccarGroups) {
		for (TraccarGroup traccarGroup : traccarGroups) {
			if (entityCache.getResult(
						TraccarGroupModelImpl.ENTITY_CACHE_ENABLED,
						TraccarGroupImpl.class, traccarGroup.getPrimaryKey()) == null) {
				cacheResult(traccarGroup);
			}
			else {
				traccarGroup.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all traccar groups.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TraccarGroupImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the traccar group.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TraccarGroup traccarGroup) {
		entityCache.removeResult(TraccarGroupModelImpl.ENTITY_CACHE_ENABLED,
			TraccarGroupImpl.class, traccarGroup.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((TraccarGroupModelImpl)traccarGroup, true);
	}

	@Override
	public void clearCache(List<TraccarGroup> traccarGroups) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TraccarGroup traccarGroup : traccarGroups) {
			entityCache.removeResult(TraccarGroupModelImpl.ENTITY_CACHE_ENABLED,
				TraccarGroupImpl.class, traccarGroup.getPrimaryKey());

			clearUniqueFindersCache((TraccarGroupModelImpl)traccarGroup, true);
		}
	}

	protected void cacheUniqueFindersCache(
		TraccarGroupModelImpl traccarGroupModelImpl) {
		Object[] args = new Object[] {
				traccarGroupModelImpl.getUuid(),
				traccarGroupModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			traccarGroupModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		TraccarGroupModelImpl traccarGroupModelImpl, boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					traccarGroupModelImpl.getUuid(),
					traccarGroupModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((traccarGroupModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					traccarGroupModelImpl.getOriginalUuid(),
					traccarGroupModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new traccar group with the primary key. Does not add the traccar group to the database.
	 *
	 * @param traccarGroupId the primary key for the new traccar group
	 * @return the new traccar group
	 */
	@Override
	public TraccarGroup create(long traccarGroupId) {
		TraccarGroup traccarGroup = new TraccarGroupImpl();

		traccarGroup.setNew(true);
		traccarGroup.setPrimaryKey(traccarGroupId);

		String uuid = PortalUUIDUtil.generate();

		traccarGroup.setUuid(uuid);

		traccarGroup.setCompanyId(companyProvider.getCompanyId());

		return traccarGroup;
	}

	/**
	 * Removes the traccar group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param traccarGroupId the primary key of the traccar group
	 * @return the traccar group that was removed
	 * @throws NoSuchTraccarGroupException if a traccar group with the primary key could not be found
	 */
	@Override
	public TraccarGroup remove(long traccarGroupId)
		throws NoSuchTraccarGroupException {
		return remove((Serializable)traccarGroupId);
	}

	/**
	 * Removes the traccar group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the traccar group
	 * @return the traccar group that was removed
	 * @throws NoSuchTraccarGroupException if a traccar group with the primary key could not be found
	 */
	@Override
	public TraccarGroup remove(Serializable primaryKey)
		throws NoSuchTraccarGroupException {
		Session session = null;

		try {
			session = openSession();

			TraccarGroup traccarGroup = (TraccarGroup)session.get(TraccarGroupImpl.class,
					primaryKey);

			if (traccarGroup == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTraccarGroupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(traccarGroup);
		}
		catch (NoSuchTraccarGroupException nsee) {
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
	protected TraccarGroup removeImpl(TraccarGroup traccarGroup) {
		traccarGroup = toUnwrappedModel(traccarGroup);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(traccarGroup)) {
				traccarGroup = (TraccarGroup)session.get(TraccarGroupImpl.class,
						traccarGroup.getPrimaryKeyObj());
			}

			if (traccarGroup != null) {
				session.delete(traccarGroup);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (traccarGroup != null) {
			clearCache(traccarGroup);
		}

		return traccarGroup;
	}

	@Override
	public TraccarGroup updateImpl(TraccarGroup traccarGroup) {
		traccarGroup = toUnwrappedModel(traccarGroup);

		boolean isNew = traccarGroup.isNew();

		TraccarGroupModelImpl traccarGroupModelImpl = (TraccarGroupModelImpl)traccarGroup;

		if (Validator.isNull(traccarGroup.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			traccarGroup.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (traccarGroup.getCreateDate() == null)) {
			if (serviceContext == null) {
				traccarGroup.setCreateDate(now);
			}
			else {
				traccarGroup.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!traccarGroupModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				traccarGroup.setModifiedDate(now);
			}
			else {
				traccarGroup.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (traccarGroup.isNew()) {
				session.save(traccarGroup);

				traccarGroup.setNew(false);
			}
			else {
				traccarGroup = (TraccarGroup)session.merge(traccarGroup);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!TraccarGroupModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { traccarGroupModelImpl.getUuid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			args = new Object[] {
					traccarGroupModelImpl.getUuid(),
					traccarGroupModelImpl.getCompanyId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
				args);

			args = new Object[] { traccarGroupModelImpl.getGroupId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
				args);

			args = new Object[] { traccarGroupModelImpl.getTraccarGroupId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_TRACCARGROUPID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRACCARGROUPID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((traccarGroupModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						traccarGroupModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { traccarGroupModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((traccarGroupModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						traccarGroupModelImpl.getOriginalUuid(),
						traccarGroupModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						traccarGroupModelImpl.getUuid(),
						traccarGroupModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((traccarGroupModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						traccarGroupModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { traccarGroupModelImpl.getGroupId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((traccarGroupModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRACCARGROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						traccarGroupModelImpl.getOriginalTraccarGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TRACCARGROUPID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRACCARGROUPID,
					args);

				args = new Object[] { traccarGroupModelImpl.getTraccarGroupId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_TRACCARGROUPID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TRACCARGROUPID,
					args);
			}
		}

		entityCache.putResult(TraccarGroupModelImpl.ENTITY_CACHE_ENABLED,
			TraccarGroupImpl.class, traccarGroup.getPrimaryKey(), traccarGroup,
			false);

		clearUniqueFindersCache(traccarGroupModelImpl, false);
		cacheUniqueFindersCache(traccarGroupModelImpl);

		traccarGroup.resetOriginalValues();

		return traccarGroup;
	}

	protected TraccarGroup toUnwrappedModel(TraccarGroup traccarGroup) {
		if (traccarGroup instanceof TraccarGroupImpl) {
			return traccarGroup;
		}

		TraccarGroupImpl traccarGroupImpl = new TraccarGroupImpl();

		traccarGroupImpl.setNew(traccarGroup.isNew());
		traccarGroupImpl.setPrimaryKey(traccarGroup.getPrimaryKey());

		traccarGroupImpl.setUuid(traccarGroup.getUuid());
		traccarGroupImpl.setTraccarGroupId(traccarGroup.getTraccarGroupId());
		traccarGroupImpl.setGroupId(traccarGroup.getGroupId());
		traccarGroupImpl.setCompanyId(traccarGroup.getCompanyId());
		traccarGroupImpl.setUserId(traccarGroup.getUserId());
		traccarGroupImpl.setUserName(traccarGroup.getUserName());
		traccarGroupImpl.setCreateDate(traccarGroup.getCreateDate());
		traccarGroupImpl.setModifiedDate(traccarGroup.getModifiedDate());
		traccarGroupImpl.setStatus(traccarGroup.getStatus());
		traccarGroupImpl.setStatusByUserId(traccarGroup.getStatusByUserId());
		traccarGroupImpl.setStatusByUserName(traccarGroup.getStatusByUserName());
		traccarGroupImpl.setStatusDate(traccarGroup.getStatusDate());
		traccarGroupImpl.setName(traccarGroup.getName());
		traccarGroupImpl.setTraccarGroupAttributes(traccarGroup.getTraccarGroupAttributes());

		return traccarGroupImpl;
	}

	/**
	 * Returns the traccar group with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the traccar group
	 * @return the traccar group
	 * @throws NoSuchTraccarGroupException if a traccar group with the primary key could not be found
	 */
	@Override
	public TraccarGroup findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTraccarGroupException {
		TraccarGroup traccarGroup = fetchByPrimaryKey(primaryKey);

		if (traccarGroup == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTraccarGroupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return traccarGroup;
	}

	/**
	 * Returns the traccar group with the primary key or throws a {@link NoSuchTraccarGroupException} if it could not be found.
	 *
	 * @param traccarGroupId the primary key of the traccar group
	 * @return the traccar group
	 * @throws NoSuchTraccarGroupException if a traccar group with the primary key could not be found
	 */
	@Override
	public TraccarGroup findByPrimaryKey(long traccarGroupId)
		throws NoSuchTraccarGroupException {
		return findByPrimaryKey((Serializable)traccarGroupId);
	}

	/**
	 * Returns the traccar group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the traccar group
	 * @return the traccar group, or <code>null</code> if a traccar group with the primary key could not be found
	 */
	@Override
	public TraccarGroup fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(TraccarGroupModelImpl.ENTITY_CACHE_ENABLED,
				TraccarGroupImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		TraccarGroup traccarGroup = (TraccarGroup)serializable;

		if (traccarGroup == null) {
			Session session = null;

			try {
				session = openSession();

				traccarGroup = (TraccarGroup)session.get(TraccarGroupImpl.class,
						primaryKey);

				if (traccarGroup != null) {
					cacheResult(traccarGroup);
				}
				else {
					entityCache.putResult(TraccarGroupModelImpl.ENTITY_CACHE_ENABLED,
						TraccarGroupImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(TraccarGroupModelImpl.ENTITY_CACHE_ENABLED,
					TraccarGroupImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return traccarGroup;
	}

	/**
	 * Returns the traccar group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param traccarGroupId the primary key of the traccar group
	 * @return the traccar group, or <code>null</code> if a traccar group with the primary key could not be found
	 */
	@Override
	public TraccarGroup fetchByPrimaryKey(long traccarGroupId) {
		return fetchByPrimaryKey((Serializable)traccarGroupId);
	}

	@Override
	public Map<Serializable, TraccarGroup> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, TraccarGroup> map = new HashMap<Serializable, TraccarGroup>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			TraccarGroup traccarGroup = fetchByPrimaryKey(primaryKey);

			if (traccarGroup != null) {
				map.put(primaryKey, traccarGroup);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(TraccarGroupModelImpl.ENTITY_CACHE_ENABLED,
					TraccarGroupImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (TraccarGroup)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_TRACCARGROUP_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (TraccarGroup traccarGroup : (List<TraccarGroup>)q.list()) {
				map.put(traccarGroup.getPrimaryKeyObj(), traccarGroup);

				cacheResult(traccarGroup);

				uncachedPrimaryKeys.remove(traccarGroup.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(TraccarGroupModelImpl.ENTITY_CACHE_ENABLED,
					TraccarGroupImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the traccar groups.
	 *
	 * @return the traccar groups
	 */
	@Override
	public List<TraccarGroup> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the traccar groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TraccarGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of traccar groups
	 * @param end the upper bound of the range of traccar groups (not inclusive)
	 * @return the range of traccar groups
	 */
	@Override
	public List<TraccarGroup> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the traccar groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TraccarGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of traccar groups
	 * @param end the upper bound of the range of traccar groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of traccar groups
	 */
	@Override
	public List<TraccarGroup> findAll(int start, int end,
		OrderByComparator<TraccarGroup> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the traccar groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TraccarGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of traccar groups
	 * @param end the upper bound of the range of traccar groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of traccar groups
	 */
	@Override
	public List<TraccarGroup> findAll(int start, int end,
		OrderByComparator<TraccarGroup> orderByComparator,
		boolean retrieveFromCache) {
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

		List<TraccarGroup> list = null;

		if (retrieveFromCache) {
			list = (List<TraccarGroup>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_TRACCARGROUP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TRACCARGROUP;

				if (pagination) {
					sql = sql.concat(TraccarGroupModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TraccarGroup>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TraccarGroup>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the traccar groups from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TraccarGroup traccarGroup : findAll()) {
			remove(traccarGroup);
		}
	}

	/**
	 * Returns the number of traccar groups.
	 *
	 * @return the number of traccar groups
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TRACCARGROUP);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TraccarGroupModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the traccar group persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(TraccarGroupImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_TRACCARGROUP = "SELECT traccarGroup FROM TraccarGroup traccarGroup";
	private static final String _SQL_SELECT_TRACCARGROUP_WHERE_PKS_IN = "SELECT traccarGroup FROM TraccarGroup traccarGroup WHERE traccarGroupId IN (";
	private static final String _SQL_SELECT_TRACCARGROUP_WHERE = "SELECT traccarGroup FROM TraccarGroup traccarGroup WHERE ";
	private static final String _SQL_COUNT_TRACCARGROUP = "SELECT COUNT(traccarGroup) FROM TraccarGroup traccarGroup";
	private static final String _SQL_COUNT_TRACCARGROUP_WHERE = "SELECT COUNT(traccarGroup) FROM TraccarGroup traccarGroup WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "traccarGroup.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TraccarGroup exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TraccarGroup exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(TraccarGroupPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
}