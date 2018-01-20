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

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link TraccarGroup}.
 * </p>
 *
 * @author Kylebyakin
 * @see TraccarGroup
 * @generated
 */
@ProviderType
public class TraccarGroupWrapper implements TraccarGroup,
	ModelWrapper<TraccarGroup> {
	public TraccarGroupWrapper(TraccarGroup traccarGroup) {
		_traccarGroup = traccarGroup;
	}

	@Override
	public Class<?> getModelClass() {
		return TraccarGroup.class;
	}

	@Override
	public String getModelClassName() {
		return TraccarGroup.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("traccarGroupId", getTraccarGroupId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());
		attributes.put("name", getName());
		attributes.put("traccarGroupAttributes", getTraccarGroupAttributes());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long traccarGroupId = (Long)attributes.get("traccarGroupId");

		if (traccarGroupId != null) {
			setTraccarGroupId(traccarGroupId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String traccarGroupAttributes = (String)attributes.get(
				"traccarGroupAttributes");

		if (traccarGroupAttributes != null) {
			setTraccarGroupAttributes(traccarGroupAttributes);
		}
	}

	@Override
	public TraccarGroup toEscapedModel() {
		return new TraccarGroupWrapper(_traccarGroup.toEscapedModel());
	}

	@Override
	public TraccarGroup toUnescapedModel() {
		return new TraccarGroupWrapper(_traccarGroup.toUnescapedModel());
	}

	/**
	* Returns <code>true</code> if this traccar group is approved.
	*
	* @return <code>true</code> if this traccar group is approved; <code>false</code> otherwise
	*/
	@Override
	public boolean isApproved() {
		return _traccarGroup.isApproved();
	}

	@Override
	public boolean isCachedModel() {
		return _traccarGroup.isCachedModel();
	}

	/**
	* Returns <code>true</code> if this traccar group is denied.
	*
	* @return <code>true</code> if this traccar group is denied; <code>false</code> otherwise
	*/
	@Override
	public boolean isDenied() {
		return _traccarGroup.isDenied();
	}

	/**
	* Returns <code>true</code> if this traccar group is a draft.
	*
	* @return <code>true</code> if this traccar group is a draft; <code>false</code> otherwise
	*/
	@Override
	public boolean isDraft() {
		return _traccarGroup.isDraft();
	}

	@Override
	public boolean isEscapedModel() {
		return _traccarGroup.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this traccar group is expired.
	*
	* @return <code>true</code> if this traccar group is expired; <code>false</code> otherwise
	*/
	@Override
	public boolean isExpired() {
		return _traccarGroup.isExpired();
	}

	/**
	* Returns <code>true</code> if this traccar group is inactive.
	*
	* @return <code>true</code> if this traccar group is inactive; <code>false</code> otherwise
	*/
	@Override
	public boolean isInactive() {
		return _traccarGroup.isInactive();
	}

	/**
	* Returns <code>true</code> if this traccar group is incomplete.
	*
	* @return <code>true</code> if this traccar group is incomplete; <code>false</code> otherwise
	*/
	@Override
	public boolean isIncomplete() {
		return _traccarGroup.isIncomplete();
	}

	@Override
	public boolean isNew() {
		return _traccarGroup.isNew();
	}

	/**
	* Returns <code>true</code> if this traccar group is pending.
	*
	* @return <code>true</code> if this traccar group is pending; <code>false</code> otherwise
	*/
	@Override
	public boolean isPending() {
		return _traccarGroup.isPending();
	}

	/**
	* Returns <code>true</code> if this traccar group is scheduled.
	*
	* @return <code>true</code> if this traccar group is scheduled; <code>false</code> otherwise
	*/
	@Override
	public boolean isScheduled() {
		return _traccarGroup.isScheduled();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _traccarGroup.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<TraccarGroup> toCacheModel() {
		return _traccarGroup.toCacheModel();
	}

	@Override
	public int compareTo(TraccarGroup traccarGroup) {
		return _traccarGroup.compareTo(traccarGroup);
	}

	/**
	* Returns the status of this traccar group.
	*
	* @return the status of this traccar group
	*/
	@Override
	public int getStatus() {
		return _traccarGroup.getStatus();
	}

	@Override
	public int hashCode() {
		return _traccarGroup.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _traccarGroup.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new TraccarGroupWrapper((TraccarGroup)_traccarGroup.clone());
	}

	/**
	* Returns the name of this traccar group.
	*
	* @return the name of this traccar group
	*/
	@Override
	public java.lang.String getName() {
		return _traccarGroup.getName();
	}

	/**
	* Returns the status by user name of this traccar group.
	*
	* @return the status by user name of this traccar group
	*/
	@Override
	public java.lang.String getStatusByUserName() {
		return _traccarGroup.getStatusByUserName();
	}

	/**
	* Returns the status by user uuid of this traccar group.
	*
	* @return the status by user uuid of this traccar group
	*/
	@Override
	public java.lang.String getStatusByUserUuid() {
		return _traccarGroup.getStatusByUserUuid();
	}

	/**
	* Returns the traccar group attributes of this traccar group.
	*
	* @return the traccar group attributes of this traccar group
	*/
	@Override
	public java.lang.String getTraccarGroupAttributes() {
		return _traccarGroup.getTraccarGroupAttributes();
	}

	/**
	* Returns the user name of this traccar group.
	*
	* @return the user name of this traccar group
	*/
	@Override
	public java.lang.String getUserName() {
		return _traccarGroup.getUserName();
	}

	/**
	* Returns the user uuid of this traccar group.
	*
	* @return the user uuid of this traccar group
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _traccarGroup.getUserUuid();
	}

	/**
	* Returns the uuid of this traccar group.
	*
	* @return the uuid of this traccar group
	*/
	@Override
	public java.lang.String getUuid() {
		return _traccarGroup.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _traccarGroup.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _traccarGroup.toXmlString();
	}

	/**
	* Returns the create date of this traccar group.
	*
	* @return the create date of this traccar group
	*/
	@Override
	public Date getCreateDate() {
		return _traccarGroup.getCreateDate();
	}

	/**
	* Returns the modified date of this traccar group.
	*
	* @return the modified date of this traccar group
	*/
	@Override
	public Date getModifiedDate() {
		return _traccarGroup.getModifiedDate();
	}

	/**
	* Returns the status date of this traccar group.
	*
	* @return the status date of this traccar group
	*/
	@Override
	public Date getStatusDate() {
		return _traccarGroup.getStatusDate();
	}

	/**
	* Returns the company ID of this traccar group.
	*
	* @return the company ID of this traccar group
	*/
	@Override
	public long getCompanyId() {
		return _traccarGroup.getCompanyId();
	}

	/**
	* Returns the group ID of this traccar group.
	*
	* @return the group ID of this traccar group
	*/
	@Override
	public long getGroupId() {
		return _traccarGroup.getGroupId();
	}

	/**
	* Returns the primary key of this traccar group.
	*
	* @return the primary key of this traccar group
	*/
	@Override
	public long getPrimaryKey() {
		return _traccarGroup.getPrimaryKey();
	}

	/**
	* Returns the status by user ID of this traccar group.
	*
	* @return the status by user ID of this traccar group
	*/
	@Override
	public long getStatusByUserId() {
		return _traccarGroup.getStatusByUserId();
	}

	/**
	* Returns the traccar group ID of this traccar group.
	*
	* @return the traccar group ID of this traccar group
	*/
	@Override
	public long getTraccarGroupId() {
		return _traccarGroup.getTraccarGroupId();
	}

	/**
	* Returns the user ID of this traccar group.
	*
	* @return the user ID of this traccar group
	*/
	@Override
	public long getUserId() {
		return _traccarGroup.getUserId();
	}

	@Override
	public void persist() {
		_traccarGroup.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_traccarGroup.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this traccar group.
	*
	* @param companyId the company ID of this traccar group
	*/
	@Override
	public void setCompanyId(long companyId) {
		_traccarGroup.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this traccar group.
	*
	* @param createDate the create date of this traccar group
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_traccarGroup.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_traccarGroup.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_traccarGroup.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_traccarGroup.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this traccar group.
	*
	* @param groupId the group ID of this traccar group
	*/
	@Override
	public void setGroupId(long groupId) {
		_traccarGroup.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this traccar group.
	*
	* @param modifiedDate the modified date of this traccar group
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_traccarGroup.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this traccar group.
	*
	* @param name the name of this traccar group
	*/
	@Override
	public void setName(java.lang.String name) {
		_traccarGroup.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_traccarGroup.setNew(n);
	}

	/**
	* Sets the primary key of this traccar group.
	*
	* @param primaryKey the primary key of this traccar group
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_traccarGroup.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_traccarGroup.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status of this traccar group.
	*
	* @param status the status of this traccar group
	*/
	@Override
	public void setStatus(int status) {
		_traccarGroup.setStatus(status);
	}

	/**
	* Sets the status by user ID of this traccar group.
	*
	* @param statusByUserId the status by user ID of this traccar group
	*/
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_traccarGroup.setStatusByUserId(statusByUserId);
	}

	/**
	* Sets the status by user name of this traccar group.
	*
	* @param statusByUserName the status by user name of this traccar group
	*/
	@Override
	public void setStatusByUserName(java.lang.String statusByUserName) {
		_traccarGroup.setStatusByUserName(statusByUserName);
	}

	/**
	* Sets the status by user uuid of this traccar group.
	*
	* @param statusByUserUuid the status by user uuid of this traccar group
	*/
	@Override
	public void setStatusByUserUuid(java.lang.String statusByUserUuid) {
		_traccarGroup.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	* Sets the status date of this traccar group.
	*
	* @param statusDate the status date of this traccar group
	*/
	@Override
	public void setStatusDate(Date statusDate) {
		_traccarGroup.setStatusDate(statusDate);
	}

	/**
	* Sets the traccar group attributes of this traccar group.
	*
	* @param traccarGroupAttributes the traccar group attributes of this traccar group
	*/
	@Override
	public void setTraccarGroupAttributes(
		java.lang.String traccarGroupAttributes) {
		_traccarGroup.setTraccarGroupAttributes(traccarGroupAttributes);
	}

	/**
	* Sets the traccar group ID of this traccar group.
	*
	* @param traccarGroupId the traccar group ID of this traccar group
	*/
	@Override
	public void setTraccarGroupId(long traccarGroupId) {
		_traccarGroup.setTraccarGroupId(traccarGroupId);
	}

	/**
	* Sets the user ID of this traccar group.
	*
	* @param userId the user ID of this traccar group
	*/
	@Override
	public void setUserId(long userId) {
		_traccarGroup.setUserId(userId);
	}

	/**
	* Sets the user name of this traccar group.
	*
	* @param userName the user name of this traccar group
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_traccarGroup.setUserName(userName);
	}

	/**
	* Sets the user uuid of this traccar group.
	*
	* @param userUuid the user uuid of this traccar group
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_traccarGroup.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this traccar group.
	*
	* @param uuid the uuid of this traccar group
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_traccarGroup.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TraccarGroupWrapper)) {
			return false;
		}

		TraccarGroupWrapper traccarGroupWrapper = (TraccarGroupWrapper)obj;

		if (Objects.equals(_traccarGroup, traccarGroupWrapper._traccarGroup)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _traccarGroup.getStagedModelType();
	}

	@Override
	public TraccarGroup getWrappedModel() {
		return _traccarGroup;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _traccarGroup.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _traccarGroup.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_traccarGroup.resetOriginalValues();
	}

	private final TraccarGroup _traccarGroup;
}