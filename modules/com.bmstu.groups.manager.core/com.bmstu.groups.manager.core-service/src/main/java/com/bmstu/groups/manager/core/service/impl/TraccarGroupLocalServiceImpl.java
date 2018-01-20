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

package com.bmstu.groups.manager.core.service.impl;

import java.util.Date;
import java.util.List;

import com.bmstu.groups.manager.core.model.TraccarGroup;
import com.bmstu.groups.manager.core.service.base.TraccarGroupLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

/**
 * The implementation of the traccar group local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.bmstu.groups.manager.core.service.TraccarGroupLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Kylebyakin
 * @see TraccarGroupLocalServiceBaseImpl
 * @see com.bmstu.groups.manager.core.service.TraccarGroupLocalServiceUtil
 */
public class TraccarGroupLocalServiceImpl extends TraccarGroupLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.bmstu.groups.manager.core.service.TraccarGroupLocalServiceUtil} to
	 * access the traccar group local service.
	 */

	@Override
	public TraccarGroup addTraccarGroup(long userId, String name, String traccarGroupAttributes,
			ServiceContext serviceContext) throws PortalException {
		String finalName = nullToEmpty(name);
		String finaltraccarGroupAttributes = nullToEmpty(traccarGroupAttributes);

		long groupId = serviceContext.getScopeGroupId();
		User user = userLocalService.getUserById(userId);
		Date currentDate = new Date();

		TraccarGroup traccarGroup = traccarGroupPersistence.create(counterLocalService.increment());

		traccarGroup.setUuid(serviceContext.getUuid());
		traccarGroup.setUserId(userId);
		traccarGroup.setGroupId(groupId);
		traccarGroup.setCompanyId(user.getCompanyId());
		traccarGroup.setUserName(user.getFullName());
		traccarGroup.setCreateDate(serviceContext.getCreateDate(currentDate));
		traccarGroup.setModifiedDate(serviceContext.getModifiedDate(currentDate));
		traccarGroup.setName(finalName);
		traccarGroup.setTraccarGroupAttributes(finaltraccarGroupAttributes);
		traccarGroup.setExpandoBridgeAttributes(serviceContext);

		traccarGroupPersistence.update(traccarGroup);

		return traccarGroup;
	}

	@Override
	public List<TraccarGroup> getTraccarGroups(long groupId, int start, int end) {

		return traccarGroupPersistence.findByGroupId(groupId, start, end);
	}

	@Override
	public int getTraccarGroupsCount() {
		return traccarGroupPersistence.countAll();
	}

	private String nullToEmpty(String string) {
		return string == null ? "" : string;
	}
}