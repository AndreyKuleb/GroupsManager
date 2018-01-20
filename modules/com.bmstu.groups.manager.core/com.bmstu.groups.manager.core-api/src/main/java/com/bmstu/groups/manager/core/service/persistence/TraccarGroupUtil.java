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

package com.bmstu.groups.manager.core.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.bmstu.groups.manager.core.model.TraccarGroup;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the traccar group service. This utility wraps {@link com.bmstu.groups.manager.core.service.persistence.impl.TraccarGroupPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Kylebyakin
 * @see TraccarGroupPersistence
 * @see com.bmstu.groups.manager.core.service.persistence.impl.TraccarGroupPersistenceImpl
 * @generated
 */
@ProviderType
public class TraccarGroupUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(TraccarGroup traccarGroup) {
		getPersistence().clearCache(traccarGroup);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TraccarGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TraccarGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TraccarGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TraccarGroup> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TraccarGroup update(TraccarGroup traccarGroup) {
		return getPersistence().update(traccarGroup);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TraccarGroup update(TraccarGroup traccarGroup,
		ServiceContext serviceContext) {
		return getPersistence().update(traccarGroup, serviceContext);
	}

	/**
	* Returns all the traccar groups where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching traccar groups
	*/
	public static List<TraccarGroup> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
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
	public static List<TraccarGroup> findByUuid(java.lang.String uuid,
		int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
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
	public static List<TraccarGroup> findByUuid(java.lang.String uuid,
		int start, int end, OrderByComparator<TraccarGroup> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
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
	public static List<TraccarGroup> findByUuid(java.lang.String uuid,
		int start, int end, OrderByComparator<TraccarGroup> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first traccar group in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching traccar group
	* @throws NoSuchTraccarGroupException if a matching traccar group could not be found
	*/
	public static TraccarGroup findByUuid_First(java.lang.String uuid,
		OrderByComparator<TraccarGroup> orderByComparator)
		throws com.bmstu.groups.manager.core.exception.NoSuchTraccarGroupException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first traccar group in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching traccar group, or <code>null</code> if a matching traccar group could not be found
	*/
	public static TraccarGroup fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<TraccarGroup> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last traccar group in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching traccar group
	* @throws NoSuchTraccarGroupException if a matching traccar group could not be found
	*/
	public static TraccarGroup findByUuid_Last(java.lang.String uuid,
		OrderByComparator<TraccarGroup> orderByComparator)
		throws com.bmstu.groups.manager.core.exception.NoSuchTraccarGroupException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last traccar group in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching traccar group, or <code>null</code> if a matching traccar group could not be found
	*/
	public static TraccarGroup fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<TraccarGroup> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
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
	public static TraccarGroup[] findByUuid_PrevAndNext(long traccarGroupId,
		java.lang.String uuid, OrderByComparator<TraccarGroup> orderByComparator)
		throws com.bmstu.groups.manager.core.exception.NoSuchTraccarGroupException {
		return getPersistence()
				   .findByUuid_PrevAndNext(traccarGroupId, uuid,
			orderByComparator);
	}

	/**
	* Removes all the traccar groups where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of traccar groups where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching traccar groups
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the traccar group where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchTraccarGroupException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching traccar group
	* @throws NoSuchTraccarGroupException if a matching traccar group could not be found
	*/
	public static TraccarGroup findByUUID_G(java.lang.String uuid, long groupId)
		throws com.bmstu.groups.manager.core.exception.NoSuchTraccarGroupException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the traccar group where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching traccar group, or <code>null</code> if a matching traccar group could not be found
	*/
	public static TraccarGroup fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the traccar group where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching traccar group, or <code>null</code> if a matching traccar group could not be found
	*/
	public static TraccarGroup fetchByUUID_G(java.lang.String uuid,
		long groupId, boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the traccar group where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the traccar group that was removed
	*/
	public static TraccarGroup removeByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.bmstu.groups.manager.core.exception.NoSuchTraccarGroupException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of traccar groups where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching traccar groups
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the traccar groups where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching traccar groups
	*/
	public static List<TraccarGroup> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
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
	public static List<TraccarGroup> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
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
	public static List<TraccarGroup> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<TraccarGroup> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
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
	public static List<TraccarGroup> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<TraccarGroup> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
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
	public static TraccarGroup findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<TraccarGroup> orderByComparator)
		throws com.bmstu.groups.manager.core.exception.NoSuchTraccarGroupException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first traccar group in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching traccar group, or <code>null</code> if a matching traccar group could not be found
	*/
	public static TraccarGroup fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<TraccarGroup> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
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
	public static TraccarGroup findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<TraccarGroup> orderByComparator)
		throws com.bmstu.groups.manager.core.exception.NoSuchTraccarGroupException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last traccar group in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching traccar group, or <code>null</code> if a matching traccar group could not be found
	*/
	public static TraccarGroup fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<TraccarGroup> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
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
	public static TraccarGroup[] findByUuid_C_PrevAndNext(long traccarGroupId,
		java.lang.String uuid, long companyId,
		OrderByComparator<TraccarGroup> orderByComparator)
		throws com.bmstu.groups.manager.core.exception.NoSuchTraccarGroupException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(traccarGroupId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the traccar groups where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of traccar groups where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching traccar groups
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the traccar groups where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching traccar groups
	*/
	public static List<TraccarGroup> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
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
	public static List<TraccarGroup> findByGroupId(long groupId, int start,
		int end) {
		return getPersistence().findByGroupId(groupId, start, end);
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
	public static List<TraccarGroup> findByGroupId(long groupId, int start,
		int end, OrderByComparator<TraccarGroup> orderByComparator) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
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
	public static List<TraccarGroup> findByGroupId(long groupId, int start,
		int end, OrderByComparator<TraccarGroup> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first traccar group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching traccar group
	* @throws NoSuchTraccarGroupException if a matching traccar group could not be found
	*/
	public static TraccarGroup findByGroupId_First(long groupId,
		OrderByComparator<TraccarGroup> orderByComparator)
		throws com.bmstu.groups.manager.core.exception.NoSuchTraccarGroupException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first traccar group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching traccar group, or <code>null</code> if a matching traccar group could not be found
	*/
	public static TraccarGroup fetchByGroupId_First(long groupId,
		OrderByComparator<TraccarGroup> orderByComparator) {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last traccar group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching traccar group
	* @throws NoSuchTraccarGroupException if a matching traccar group could not be found
	*/
	public static TraccarGroup findByGroupId_Last(long groupId,
		OrderByComparator<TraccarGroup> orderByComparator)
		throws com.bmstu.groups.manager.core.exception.NoSuchTraccarGroupException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last traccar group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching traccar group, or <code>null</code> if a matching traccar group could not be found
	*/
	public static TraccarGroup fetchByGroupId_Last(long groupId,
		OrderByComparator<TraccarGroup> orderByComparator) {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
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
	public static TraccarGroup[] findByGroupId_PrevAndNext(
		long traccarGroupId, long groupId,
		OrderByComparator<TraccarGroup> orderByComparator)
		throws com.bmstu.groups.manager.core.exception.NoSuchTraccarGroupException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(traccarGroupId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the traccar groups where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of traccar groups where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching traccar groups
	*/
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the traccar groups where traccarGroupId = &#63;.
	*
	* @param traccarGroupId the traccar group ID
	* @return the matching traccar groups
	*/
	public static List<TraccarGroup> findByTraccarGroupId(long traccarGroupId) {
		return getPersistence().findByTraccarGroupId(traccarGroupId);
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
	public static List<TraccarGroup> findByTraccarGroupId(long traccarGroupId,
		int start, int end) {
		return getPersistence().findByTraccarGroupId(traccarGroupId, start, end);
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
	public static List<TraccarGroup> findByTraccarGroupId(long traccarGroupId,
		int start, int end, OrderByComparator<TraccarGroup> orderByComparator) {
		return getPersistence()
				   .findByTraccarGroupId(traccarGroupId, start, end,
			orderByComparator);
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
	public static List<TraccarGroup> findByTraccarGroupId(long traccarGroupId,
		int start, int end, OrderByComparator<TraccarGroup> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByTraccarGroupId(traccarGroupId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first traccar group in the ordered set where traccarGroupId = &#63;.
	*
	* @param traccarGroupId the traccar group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching traccar group
	* @throws NoSuchTraccarGroupException if a matching traccar group could not be found
	*/
	public static TraccarGroup findByTraccarGroupId_First(long traccarGroupId,
		OrderByComparator<TraccarGroup> orderByComparator)
		throws com.bmstu.groups.manager.core.exception.NoSuchTraccarGroupException {
		return getPersistence()
				   .findByTraccarGroupId_First(traccarGroupId, orderByComparator);
	}

	/**
	* Returns the first traccar group in the ordered set where traccarGroupId = &#63;.
	*
	* @param traccarGroupId the traccar group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching traccar group, or <code>null</code> if a matching traccar group could not be found
	*/
	public static TraccarGroup fetchByTraccarGroupId_First(
		long traccarGroupId, OrderByComparator<TraccarGroup> orderByComparator) {
		return getPersistence()
				   .fetchByTraccarGroupId_First(traccarGroupId,
			orderByComparator);
	}

	/**
	* Returns the last traccar group in the ordered set where traccarGroupId = &#63;.
	*
	* @param traccarGroupId the traccar group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching traccar group
	* @throws NoSuchTraccarGroupException if a matching traccar group could not be found
	*/
	public static TraccarGroup findByTraccarGroupId_Last(long traccarGroupId,
		OrderByComparator<TraccarGroup> orderByComparator)
		throws com.bmstu.groups.manager.core.exception.NoSuchTraccarGroupException {
		return getPersistence()
				   .findByTraccarGroupId_Last(traccarGroupId, orderByComparator);
	}

	/**
	* Returns the last traccar group in the ordered set where traccarGroupId = &#63;.
	*
	* @param traccarGroupId the traccar group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching traccar group, or <code>null</code> if a matching traccar group could not be found
	*/
	public static TraccarGroup fetchByTraccarGroupId_Last(long traccarGroupId,
		OrderByComparator<TraccarGroup> orderByComparator) {
		return getPersistence()
				   .fetchByTraccarGroupId_Last(traccarGroupId, orderByComparator);
	}

	/**
	* Removes all the traccar groups where traccarGroupId = &#63; from the database.
	*
	* @param traccarGroupId the traccar group ID
	*/
	public static void removeByTraccarGroupId(long traccarGroupId) {
		getPersistence().removeByTraccarGroupId(traccarGroupId);
	}

	/**
	* Returns the number of traccar groups where traccarGroupId = &#63;.
	*
	* @param traccarGroupId the traccar group ID
	* @return the number of matching traccar groups
	*/
	public static int countByTraccarGroupId(long traccarGroupId) {
		return getPersistence().countByTraccarGroupId(traccarGroupId);
	}

	/**
	* Caches the traccar group in the entity cache if it is enabled.
	*
	* @param traccarGroup the traccar group
	*/
	public static void cacheResult(TraccarGroup traccarGroup) {
		getPersistence().cacheResult(traccarGroup);
	}

	/**
	* Caches the traccar groups in the entity cache if it is enabled.
	*
	* @param traccarGroups the traccar groups
	*/
	public static void cacheResult(List<TraccarGroup> traccarGroups) {
		getPersistence().cacheResult(traccarGroups);
	}

	/**
	* Creates a new traccar group with the primary key. Does not add the traccar group to the database.
	*
	* @param traccarGroupId the primary key for the new traccar group
	* @return the new traccar group
	*/
	public static TraccarGroup create(long traccarGroupId) {
		return getPersistence().create(traccarGroupId);
	}

	/**
	* Removes the traccar group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param traccarGroupId the primary key of the traccar group
	* @return the traccar group that was removed
	* @throws NoSuchTraccarGroupException if a traccar group with the primary key could not be found
	*/
	public static TraccarGroup remove(long traccarGroupId)
		throws com.bmstu.groups.manager.core.exception.NoSuchTraccarGroupException {
		return getPersistence().remove(traccarGroupId);
	}

	public static TraccarGroup updateImpl(TraccarGroup traccarGroup) {
		return getPersistence().updateImpl(traccarGroup);
	}

	/**
	* Returns the traccar group with the primary key or throws a {@link NoSuchTraccarGroupException} if it could not be found.
	*
	* @param traccarGroupId the primary key of the traccar group
	* @return the traccar group
	* @throws NoSuchTraccarGroupException if a traccar group with the primary key could not be found
	*/
	public static TraccarGroup findByPrimaryKey(long traccarGroupId)
		throws com.bmstu.groups.manager.core.exception.NoSuchTraccarGroupException {
		return getPersistence().findByPrimaryKey(traccarGroupId);
	}

	/**
	* Returns the traccar group with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param traccarGroupId the primary key of the traccar group
	* @return the traccar group, or <code>null</code> if a traccar group with the primary key could not be found
	*/
	public static TraccarGroup fetchByPrimaryKey(long traccarGroupId) {
		return getPersistence().fetchByPrimaryKey(traccarGroupId);
	}

	public static java.util.Map<java.io.Serializable, TraccarGroup> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the traccar groups.
	*
	* @return the traccar groups
	*/
	public static List<TraccarGroup> findAll() {
		return getPersistence().findAll();
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
	public static List<TraccarGroup> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<TraccarGroup> findAll(int start, int end,
		OrderByComparator<TraccarGroup> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<TraccarGroup> findAll(int start, int end,
		OrderByComparator<TraccarGroup> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the traccar groups from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of traccar groups.
	*
	* @return the number of traccar groups
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static TraccarGroupPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TraccarGroupPersistence, TraccarGroupPersistence> _serviceTracker =
		ServiceTrackerFactory.open(TraccarGroupPersistence.class);
}