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

import com.bmstu.groups.manager.core.exception.NoSuchTraccarGroupException;
import com.bmstu.groups.manager.core.model.TraccarGroup;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the traccar group service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Kylebyakin
 * @see com.bmstu.groups.manager.core.service.persistence.impl.TraccarGroupPersistenceImpl
 * @see TraccarGroupUtil
 * @generated
 */
@ProviderType
public interface TraccarGroupPersistence extends BasePersistence<TraccarGroup> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TraccarGroupUtil} to access the traccar group persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the traccar groups where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching traccar groups
	*/
	public java.util.List<TraccarGroup> findByUuid(java.lang.String uuid);

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
	public java.util.List<TraccarGroup> findByUuid(java.lang.String uuid,
		int start, int end);

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
	public java.util.List<TraccarGroup> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TraccarGroup> orderByComparator);

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
	public java.util.List<TraccarGroup> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TraccarGroup> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first traccar group in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching traccar group
	* @throws NoSuchTraccarGroupException if a matching traccar group could not be found
	*/
	public TraccarGroup findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TraccarGroup> orderByComparator)
		throws NoSuchTraccarGroupException;

	/**
	* Returns the first traccar group in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching traccar group, or <code>null</code> if a matching traccar group could not be found
	*/
	public TraccarGroup fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TraccarGroup> orderByComparator);

	/**
	* Returns the last traccar group in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching traccar group
	* @throws NoSuchTraccarGroupException if a matching traccar group could not be found
	*/
	public TraccarGroup findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TraccarGroup> orderByComparator)
		throws NoSuchTraccarGroupException;

	/**
	* Returns the last traccar group in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching traccar group, or <code>null</code> if a matching traccar group could not be found
	*/
	public TraccarGroup fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TraccarGroup> orderByComparator);

	/**
	* Returns the traccar groups before and after the current traccar group in the ordered set where uuid = &#63;.
	*
	* @param traccarGroupId the primary key of the current traccar group
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next traccar group
	* @throws NoSuchTraccarGroupException if a traccar group with the primary key could not be found
	*/
	public TraccarGroup[] findByUuid_PrevAndNext(long traccarGroupId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TraccarGroup> orderByComparator)
		throws NoSuchTraccarGroupException;

	/**
	* Removes all the traccar groups where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of traccar groups where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching traccar groups
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the traccar group where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchTraccarGroupException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching traccar group
	* @throws NoSuchTraccarGroupException if a matching traccar group could not be found
	*/
	public TraccarGroup findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchTraccarGroupException;

	/**
	* Returns the traccar group where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching traccar group, or <code>null</code> if a matching traccar group could not be found
	*/
	public TraccarGroup fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the traccar group where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching traccar group, or <code>null</code> if a matching traccar group could not be found
	*/
	public TraccarGroup fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the traccar group where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the traccar group that was removed
	*/
	public TraccarGroup removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchTraccarGroupException;

	/**
	* Returns the number of traccar groups where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching traccar groups
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the traccar groups where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching traccar groups
	*/
	public java.util.List<TraccarGroup> findByUuid_C(java.lang.String uuid,
		long companyId);

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
	public java.util.List<TraccarGroup> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

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
	public java.util.List<TraccarGroup> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TraccarGroup> orderByComparator);

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
	public java.util.List<TraccarGroup> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TraccarGroup> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first traccar group in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching traccar group
	* @throws NoSuchTraccarGroupException if a matching traccar group could not be found
	*/
	public TraccarGroup findByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<TraccarGroup> orderByComparator)
		throws NoSuchTraccarGroupException;

	/**
	* Returns the first traccar group in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching traccar group, or <code>null</code> if a matching traccar group could not be found
	*/
	public TraccarGroup fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<TraccarGroup> orderByComparator);

	/**
	* Returns the last traccar group in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching traccar group
	* @throws NoSuchTraccarGroupException if a matching traccar group could not be found
	*/
	public TraccarGroup findByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<TraccarGroup> orderByComparator)
		throws NoSuchTraccarGroupException;

	/**
	* Returns the last traccar group in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching traccar group, or <code>null</code> if a matching traccar group could not be found
	*/
	public TraccarGroup fetchByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<TraccarGroup> orderByComparator);

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
	public TraccarGroup[] findByUuid_C_PrevAndNext(long traccarGroupId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<TraccarGroup> orderByComparator)
		throws NoSuchTraccarGroupException;

	/**
	* Removes all the traccar groups where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of traccar groups where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching traccar groups
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the traccar groups where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching traccar groups
	*/
	public java.util.List<TraccarGroup> findByGroupId(long groupId);

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
	public java.util.List<TraccarGroup> findByGroupId(long groupId, int start,
		int end);

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
	public java.util.List<TraccarGroup> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<TraccarGroup> orderByComparator);

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
	public java.util.List<TraccarGroup> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<TraccarGroup> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first traccar group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching traccar group
	* @throws NoSuchTraccarGroupException if a matching traccar group could not be found
	*/
	public TraccarGroup findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<TraccarGroup> orderByComparator)
		throws NoSuchTraccarGroupException;

	/**
	* Returns the first traccar group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching traccar group, or <code>null</code> if a matching traccar group could not be found
	*/
	public TraccarGroup fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<TraccarGroup> orderByComparator);

	/**
	* Returns the last traccar group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching traccar group
	* @throws NoSuchTraccarGroupException if a matching traccar group could not be found
	*/
	public TraccarGroup findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<TraccarGroup> orderByComparator)
		throws NoSuchTraccarGroupException;

	/**
	* Returns the last traccar group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching traccar group, or <code>null</code> if a matching traccar group could not be found
	*/
	public TraccarGroup fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<TraccarGroup> orderByComparator);

	/**
	* Returns the traccar groups before and after the current traccar group in the ordered set where groupId = &#63;.
	*
	* @param traccarGroupId the primary key of the current traccar group
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next traccar group
	* @throws NoSuchTraccarGroupException if a traccar group with the primary key could not be found
	*/
	public TraccarGroup[] findByGroupId_PrevAndNext(long traccarGroupId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<TraccarGroup> orderByComparator)
		throws NoSuchTraccarGroupException;

	/**
	* Removes all the traccar groups where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of traccar groups where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching traccar groups
	*/
	public int countByGroupId(long groupId);

	/**
	* Returns all the traccar groups where traccarGroupId = &#63;.
	*
	* @param traccarGroupId the traccar group ID
	* @return the matching traccar groups
	*/
	public java.util.List<TraccarGroup> findByTraccarGroupId(
		long traccarGroupId);

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
	public java.util.List<TraccarGroup> findByTraccarGroupId(
		long traccarGroupId, int start, int end);

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
	public java.util.List<TraccarGroup> findByTraccarGroupId(
		long traccarGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TraccarGroup> orderByComparator);

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
	public java.util.List<TraccarGroup> findByTraccarGroupId(
		long traccarGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TraccarGroup> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first traccar group in the ordered set where traccarGroupId = &#63;.
	*
	* @param traccarGroupId the traccar group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching traccar group
	* @throws NoSuchTraccarGroupException if a matching traccar group could not be found
	*/
	public TraccarGroup findByTraccarGroupId_First(long traccarGroupId,
		com.liferay.portal.kernel.util.OrderByComparator<TraccarGroup> orderByComparator)
		throws NoSuchTraccarGroupException;

	/**
	* Returns the first traccar group in the ordered set where traccarGroupId = &#63;.
	*
	* @param traccarGroupId the traccar group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching traccar group, or <code>null</code> if a matching traccar group could not be found
	*/
	public TraccarGroup fetchByTraccarGroupId_First(long traccarGroupId,
		com.liferay.portal.kernel.util.OrderByComparator<TraccarGroup> orderByComparator);

	/**
	* Returns the last traccar group in the ordered set where traccarGroupId = &#63;.
	*
	* @param traccarGroupId the traccar group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching traccar group
	* @throws NoSuchTraccarGroupException if a matching traccar group could not be found
	*/
	public TraccarGroup findByTraccarGroupId_Last(long traccarGroupId,
		com.liferay.portal.kernel.util.OrderByComparator<TraccarGroup> orderByComparator)
		throws NoSuchTraccarGroupException;

	/**
	* Returns the last traccar group in the ordered set where traccarGroupId = &#63;.
	*
	* @param traccarGroupId the traccar group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching traccar group, or <code>null</code> if a matching traccar group could not be found
	*/
	public TraccarGroup fetchByTraccarGroupId_Last(long traccarGroupId,
		com.liferay.portal.kernel.util.OrderByComparator<TraccarGroup> orderByComparator);

	/**
	* Removes all the traccar groups where traccarGroupId = &#63; from the database.
	*
	* @param traccarGroupId the traccar group ID
	*/
	public void removeByTraccarGroupId(long traccarGroupId);

	/**
	* Returns the number of traccar groups where traccarGroupId = &#63;.
	*
	* @param traccarGroupId the traccar group ID
	* @return the number of matching traccar groups
	*/
	public int countByTraccarGroupId(long traccarGroupId);

	/**
	* Caches the traccar group in the entity cache if it is enabled.
	*
	* @param traccarGroup the traccar group
	*/
	public void cacheResult(TraccarGroup traccarGroup);

	/**
	* Caches the traccar groups in the entity cache if it is enabled.
	*
	* @param traccarGroups the traccar groups
	*/
	public void cacheResult(java.util.List<TraccarGroup> traccarGroups);

	/**
	* Creates a new traccar group with the primary key. Does not add the traccar group to the database.
	*
	* @param traccarGroupId the primary key for the new traccar group
	* @return the new traccar group
	*/
	public TraccarGroup create(long traccarGroupId);

	/**
	* Removes the traccar group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param traccarGroupId the primary key of the traccar group
	* @return the traccar group that was removed
	* @throws NoSuchTraccarGroupException if a traccar group with the primary key could not be found
	*/
	public TraccarGroup remove(long traccarGroupId)
		throws NoSuchTraccarGroupException;

	public TraccarGroup updateImpl(TraccarGroup traccarGroup);

	/**
	* Returns the traccar group with the primary key or throws a {@link NoSuchTraccarGroupException} if it could not be found.
	*
	* @param traccarGroupId the primary key of the traccar group
	* @return the traccar group
	* @throws NoSuchTraccarGroupException if a traccar group with the primary key could not be found
	*/
	public TraccarGroup findByPrimaryKey(long traccarGroupId)
		throws NoSuchTraccarGroupException;

	/**
	* Returns the traccar group with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param traccarGroupId the primary key of the traccar group
	* @return the traccar group, or <code>null</code> if a traccar group with the primary key could not be found
	*/
	public TraccarGroup fetchByPrimaryKey(long traccarGroupId);

	@Override
	public java.util.Map<java.io.Serializable, TraccarGroup> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the traccar groups.
	*
	* @return the traccar groups
	*/
	public java.util.List<TraccarGroup> findAll();

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
	public java.util.List<TraccarGroup> findAll(int start, int end);

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
	public java.util.List<TraccarGroup> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TraccarGroup> orderByComparator);

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
	public java.util.List<TraccarGroup> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TraccarGroup> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the traccar groups from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of traccar groups.
	*
	* @return the number of traccar groups
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}