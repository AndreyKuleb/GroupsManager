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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.bmstu.groups.manager.core.service.http.TraccarGroupServiceSoap}.
 *
 * @author Kylebyakin
 * @see com.bmstu.groups.manager.core.service.http.TraccarGroupServiceSoap
 * @generated
 */
@ProviderType
public class TraccarGroupSoap implements Serializable {
	public static TraccarGroupSoap toSoapModel(TraccarGroup model) {
		TraccarGroupSoap soapModel = new TraccarGroupSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setTraccarGroupId(model.getTraccarGroupId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setStatus(model.getStatus());
		soapModel.setStatusByUserId(model.getStatusByUserId());
		soapModel.setStatusByUserName(model.getStatusByUserName());
		soapModel.setStatusDate(model.getStatusDate());
		soapModel.setName(model.getName());
		soapModel.setTraccarGroupAttributes(model.getTraccarGroupAttributes());

		return soapModel;
	}

	public static TraccarGroupSoap[] toSoapModels(TraccarGroup[] models) {
		TraccarGroupSoap[] soapModels = new TraccarGroupSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TraccarGroupSoap[][] toSoapModels(TraccarGroup[][] models) {
		TraccarGroupSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TraccarGroupSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TraccarGroupSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TraccarGroupSoap[] toSoapModels(List<TraccarGroup> models) {
		List<TraccarGroupSoap> soapModels = new ArrayList<TraccarGroupSoap>(models.size());

		for (TraccarGroup model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TraccarGroupSoap[soapModels.size()]);
	}

	public TraccarGroupSoap() {
	}

	public long getPrimaryKey() {
		return _traccarGroupId;
	}

	public void setPrimaryKey(long pk) {
		setTraccarGroupId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getTraccarGroupId() {
		return _traccarGroupId;
	}

	public void setTraccarGroupId(long traccarGroupId) {
		_traccarGroupId = traccarGroupId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public long getStatusByUserId() {
		return _statusByUserId;
	}

	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	public String getStatusByUserName() {
		return _statusByUserName;
	}

	public void setStatusByUserName(String statusByUserName) {
		_statusByUserName = statusByUserName;
	}

	public Date getStatusDate() {
		return _statusDate;
	}

	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getTraccarGroupAttributes() {
		return _traccarGroupAttributes;
	}

	public void setTraccarGroupAttributes(String traccarGroupAttributes) {
		_traccarGroupAttributes = traccarGroupAttributes;
	}

	private String _uuid;
	private long _traccarGroupId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserName;
	private Date _statusDate;
	private String _name;
	private String _traccarGroupAttributes;
}