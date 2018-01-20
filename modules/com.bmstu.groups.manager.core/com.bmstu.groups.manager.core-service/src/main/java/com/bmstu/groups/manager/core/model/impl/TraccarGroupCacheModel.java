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

package com.bmstu.groups.manager.core.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.bmstu.groups.manager.core.model.TraccarGroup;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TraccarGroup in entity cache.
 *
 * @author Kylebyakin
 * @see TraccarGroup
 * @generated
 */
@ProviderType
public class TraccarGroupCacheModel implements CacheModel<TraccarGroup>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TraccarGroupCacheModel)) {
			return false;
		}

		TraccarGroupCacheModel traccarGroupCacheModel = (TraccarGroupCacheModel)obj;

		if (traccarGroupId == traccarGroupCacheModel.traccarGroupId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, traccarGroupId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", traccarGroupId=");
		sb.append(traccarGroupId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", traccarGroupAttributes=");
		sb.append(traccarGroupAttributes);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TraccarGroup toEntityModel() {
		TraccarGroupImpl traccarGroupImpl = new TraccarGroupImpl();

		if (uuid == null) {
			traccarGroupImpl.setUuid(StringPool.BLANK);
		}
		else {
			traccarGroupImpl.setUuid(uuid);
		}

		traccarGroupImpl.setTraccarGroupId(traccarGroupId);
		traccarGroupImpl.setGroupId(groupId);
		traccarGroupImpl.setCompanyId(companyId);
		traccarGroupImpl.setUserId(userId);

		if (userName == null) {
			traccarGroupImpl.setUserName(StringPool.BLANK);
		}
		else {
			traccarGroupImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			traccarGroupImpl.setCreateDate(null);
		}
		else {
			traccarGroupImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			traccarGroupImpl.setModifiedDate(null);
		}
		else {
			traccarGroupImpl.setModifiedDate(new Date(modifiedDate));
		}

		traccarGroupImpl.setStatus(status);
		traccarGroupImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			traccarGroupImpl.setStatusByUserName(StringPool.BLANK);
		}
		else {
			traccarGroupImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			traccarGroupImpl.setStatusDate(null);
		}
		else {
			traccarGroupImpl.setStatusDate(new Date(statusDate));
		}

		if (name == null) {
			traccarGroupImpl.setName(StringPool.BLANK);
		}
		else {
			traccarGroupImpl.setName(name);
		}

		if (traccarGroupAttributes == null) {
			traccarGroupImpl.setTraccarGroupAttributes(StringPool.BLANK);
		}
		else {
			traccarGroupImpl.setTraccarGroupAttributes(traccarGroupAttributes);
		}

		traccarGroupImpl.resetOriginalValues();

		return traccarGroupImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		traccarGroupId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
		name = objectInput.readUTF();
		traccarGroupAttributes = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(traccarGroupId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (traccarGroupAttributes == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(traccarGroupAttributes);
		}
	}

	public String uuid;
	public long traccarGroupId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;
	public String name;
	public String traccarGroupAttributes;
}