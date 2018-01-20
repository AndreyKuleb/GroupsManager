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

package com.bmstu.groups.manager.core.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.model.WorkflowedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the TraccarGroup service. Represents a row in the &quot;GM_TraccarGroup&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.bmstu.groups.manager.core.model.impl.TraccarGroupModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.bmstu.groups.manager.core.model.impl.TraccarGroupImpl}.
 * </p>
 *
 * @author Kylebyakin
 * @see TraccarGroup
 * @see com.bmstu.groups.manager.core.model.impl.TraccarGroupImpl
 * @see com.bmstu.groups.manager.core.model.impl.TraccarGroupModelImpl
 * @generated
 */
@ProviderType
public interface TraccarGroupModel extends BaseModel<TraccarGroup>, GroupedModel,
	ShardedModel, StagedAuditedModel, WorkflowedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a traccar group model instance should use the {@link TraccarGroup} interface instead.
	 */

	/**
	 * Returns the primary key of this traccar group.
	 *
	 * @return the primary key of this traccar group
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this traccar group.
	 *
	 * @param primaryKey the primary key of this traccar group
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this traccar group.
	 *
	 * @return the uuid of this traccar group
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this traccar group.
	 *
	 * @param uuid the uuid of this traccar group
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the traccar group ID of this traccar group.
	 *
	 * @return the traccar group ID of this traccar group
	 */
	public long getTraccarGroupId();

	/**
	 * Sets the traccar group ID of this traccar group.
	 *
	 * @param traccarGroupId the traccar group ID of this traccar group
	 */
	public void setTraccarGroupId(long traccarGroupId);

	/**
	 * Returns the group ID of this traccar group.
	 *
	 * @return the group ID of this traccar group
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this traccar group.
	 *
	 * @param groupId the group ID of this traccar group
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this traccar group.
	 *
	 * @return the company ID of this traccar group
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this traccar group.
	 *
	 * @param companyId the company ID of this traccar group
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this traccar group.
	 *
	 * @return the user ID of this traccar group
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this traccar group.
	 *
	 * @param userId the user ID of this traccar group
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this traccar group.
	 *
	 * @return the user uuid of this traccar group
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this traccar group.
	 *
	 * @param userUuid the user uuid of this traccar group
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this traccar group.
	 *
	 * @return the user name of this traccar group
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this traccar group.
	 *
	 * @param userName the user name of this traccar group
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this traccar group.
	 *
	 * @return the create date of this traccar group
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this traccar group.
	 *
	 * @param createDate the create date of this traccar group
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this traccar group.
	 *
	 * @return the modified date of this traccar group
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this traccar group.
	 *
	 * @param modifiedDate the modified date of this traccar group
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the status of this traccar group.
	 *
	 * @return the status of this traccar group
	 */
	@Override
	public int getStatus();

	/**
	 * Sets the status of this traccar group.
	 *
	 * @param status the status of this traccar group
	 */
	@Override
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this traccar group.
	 *
	 * @return the status by user ID of this traccar group
	 */
	@Override
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this traccar group.
	 *
	 * @param statusByUserId the status by user ID of this traccar group
	 */
	@Override
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this traccar group.
	 *
	 * @return the status by user uuid of this traccar group
	 */
	@Override
	public String getStatusByUserUuid();

	/**
	 * Sets the status by user uuid of this traccar group.
	 *
	 * @param statusByUserUuid the status by user uuid of this traccar group
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this traccar group.
	 *
	 * @return the status by user name of this traccar group
	 */
	@AutoEscape
	@Override
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this traccar group.
	 *
	 * @param statusByUserName the status by user name of this traccar group
	 */
	@Override
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this traccar group.
	 *
	 * @return the status date of this traccar group
	 */
	@Override
	public Date getStatusDate();

	/**
	 * Sets the status date of this traccar group.
	 *
	 * @param statusDate the status date of this traccar group
	 */
	@Override
	public void setStatusDate(Date statusDate);

	/**
	 * Returns the name of this traccar group.
	 *
	 * @return the name of this traccar group
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this traccar group.
	 *
	 * @param name the name of this traccar group
	 */
	public void setName(String name);

	/**
	 * Returns the traccar group attributes of this traccar group.
	 *
	 * @return the traccar group attributes of this traccar group
	 */
	@AutoEscape
	public String getTraccarGroupAttributes();

	/**
	 * Sets the traccar group attributes of this traccar group.
	 *
	 * @param traccarGroupAttributes the traccar group attributes of this traccar group
	 */
	public void setTraccarGroupAttributes(String traccarGroupAttributes);

	/**
	 * Returns <code>true</code> if this traccar group is approved.
	 *
	 * @return <code>true</code> if this traccar group is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this traccar group is denied.
	 *
	 * @return <code>true</code> if this traccar group is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this traccar group is a draft.
	 *
	 * @return <code>true</code> if this traccar group is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this traccar group is expired.
	 *
	 * @return <code>true</code> if this traccar group is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this traccar group is inactive.
	 *
	 * @return <code>true</code> if this traccar group is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this traccar group is incomplete.
	 *
	 * @return <code>true</code> if this traccar group is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this traccar group is pending.
	 *
	 * @return <code>true</code> if this traccar group is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this traccar group is scheduled.
	 *
	 * @return <code>true</code> if this traccar group is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled();

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(TraccarGroup traccarGroup);

	@Override
	public int hashCode();

	@Override
	public CacheModel<TraccarGroup> toCacheModel();

	@Override
	public TraccarGroup toEscapedModel();

	@Override
	public TraccarGroup toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}