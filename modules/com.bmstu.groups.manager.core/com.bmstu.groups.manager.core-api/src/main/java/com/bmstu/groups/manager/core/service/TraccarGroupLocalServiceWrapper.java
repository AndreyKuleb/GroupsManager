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

package com.bmstu.groups.manager.core.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TraccarGroupLocalService}.
 *
 * @author Kylebyakin
 * @see TraccarGroupLocalService
 * @generated
 */
@ProviderType
public class TraccarGroupLocalServiceWrapper implements TraccarGroupLocalService,
	ServiceWrapper<TraccarGroupLocalService> {
	public TraccarGroupLocalServiceWrapper(
		TraccarGroupLocalService traccarGroupLocalService) {
		_traccarGroupLocalService = traccarGroupLocalService;
	}

	/**
	* Adds the traccar group to the database. Also notifies the appropriate model listeners.
	*
	* @param traccarGroup the traccar group
	* @return the traccar group that was added
	*/
	@Override
	public com.bmstu.groups.manager.core.model.TraccarGroup addTraccarGroup(
		com.bmstu.groups.manager.core.model.TraccarGroup traccarGroup) {
		return _traccarGroupLocalService.addTraccarGroup(traccarGroup);
	}

	@Override
	public com.bmstu.groups.manager.core.model.TraccarGroup addTraccarGroup(
		long userId, java.lang.String name,
		java.lang.String traccarGroupAttributes,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _traccarGroupLocalService.addTraccarGroup(userId, name,
			traccarGroupAttributes, serviceContext);
	}

	/**
	* Creates a new traccar group with the primary key. Does not add the traccar group to the database.
	*
	* @param traccarGroupId the primary key for the new traccar group
	* @return the new traccar group
	*/
	@Override
	public com.bmstu.groups.manager.core.model.TraccarGroup createTraccarGroup(
		long traccarGroupId) {
		return _traccarGroupLocalService.createTraccarGroup(traccarGroupId);
	}

	/**
	* Deletes the traccar group from the database. Also notifies the appropriate model listeners.
	*
	* @param traccarGroup the traccar group
	* @return the traccar group that was removed
	*/
	@Override
	public com.bmstu.groups.manager.core.model.TraccarGroup deleteTraccarGroup(
		com.bmstu.groups.manager.core.model.TraccarGroup traccarGroup) {
		return _traccarGroupLocalService.deleteTraccarGroup(traccarGroup);
	}

	/**
	* Deletes the traccar group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param traccarGroupId the primary key of the traccar group
	* @return the traccar group that was removed
	* @throws PortalException if a traccar group with the primary key could not be found
	*/
	@Override
	public com.bmstu.groups.manager.core.model.TraccarGroup deleteTraccarGroup(
		long traccarGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _traccarGroupLocalService.deleteTraccarGroup(traccarGroupId);
	}

	@Override
	public com.bmstu.groups.manager.core.model.TraccarGroup fetchTraccarGroup(
		long traccarGroupId) {
		return _traccarGroupLocalService.fetchTraccarGroup(traccarGroupId);
	}

	/**
	* Returns the traccar group matching the UUID and group.
	*
	* @param uuid the traccar group's UUID
	* @param groupId the primary key of the group
	* @return the matching traccar group, or <code>null</code> if a matching traccar group could not be found
	*/
	@Override
	public com.bmstu.groups.manager.core.model.TraccarGroup fetchTraccarGroupByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _traccarGroupLocalService.fetchTraccarGroupByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the traccar group with the primary key.
	*
	* @param traccarGroupId the primary key of the traccar group
	* @return the traccar group
	* @throws PortalException if a traccar group with the primary key could not be found
	*/
	@Override
	public com.bmstu.groups.manager.core.model.TraccarGroup getTraccarGroup(
		long traccarGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _traccarGroupLocalService.getTraccarGroup(traccarGroupId);
	}

	/**
	* Returns the traccar group matching the UUID and group.
	*
	* @param uuid the traccar group's UUID
	* @param groupId the primary key of the group
	* @return the matching traccar group
	* @throws PortalException if a matching traccar group could not be found
	*/
	@Override
	public com.bmstu.groups.manager.core.model.TraccarGroup getTraccarGroupByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _traccarGroupLocalService.getTraccarGroupByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Updates the traccar group in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param traccarGroup the traccar group
	* @return the traccar group that was updated
	*/
	@Override
	public com.bmstu.groups.manager.core.model.TraccarGroup updateTraccarGroup(
		com.bmstu.groups.manager.core.model.TraccarGroup traccarGroup) {
		return _traccarGroupLocalService.updateTraccarGroup(traccarGroup);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _traccarGroupLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _traccarGroupLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _traccarGroupLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _traccarGroupLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _traccarGroupLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _traccarGroupLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of traccar groups.
	*
	* @return the number of traccar groups
	*/
	@Override
	public int getTraccarGroupsCount() {
		return _traccarGroupLocalService.getTraccarGroupsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _traccarGroupLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _traccarGroupLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bmstu.groups.manager.core.model.impl.TraccarGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _traccarGroupLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bmstu.groups.manager.core.model.impl.TraccarGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _traccarGroupLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the traccar groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bmstu.groups.manager.core.model.impl.TraccarGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of traccar groups
	* @param end the upper bound of the range of traccar groups (not inclusive)
	* @return the range of traccar groups
	*/
	@Override
	public java.util.List<com.bmstu.groups.manager.core.model.TraccarGroup> getTraccarGroups(
		int start, int end) {
		return _traccarGroupLocalService.getTraccarGroups(start, end);
	}

	@Override
	public java.util.List<com.bmstu.groups.manager.core.model.TraccarGroup> getTraccarGroups(
		long groupId, int start, int end) {
		return _traccarGroupLocalService.getTraccarGroups(groupId, start, end);
	}

	/**
	* Returns all the traccar groups matching the UUID and company.
	*
	* @param uuid the UUID of the traccar groups
	* @param companyId the primary key of the company
	* @return the matching traccar groups, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.bmstu.groups.manager.core.model.TraccarGroup> getTraccarGroupsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _traccarGroupLocalService.getTraccarGroupsByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of traccar groups matching the UUID and company.
	*
	* @param uuid the UUID of the traccar groups
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of traccar groups
	* @param end the upper bound of the range of traccar groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching traccar groups, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.bmstu.groups.manager.core.model.TraccarGroup> getTraccarGroupsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.bmstu.groups.manager.core.model.TraccarGroup> orderByComparator) {
		return _traccarGroupLocalService.getTraccarGroupsByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _traccarGroupLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _traccarGroupLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public TraccarGroupLocalService getWrappedService() {
		return _traccarGroupLocalService;
	}

	@Override
	public void setWrappedService(
		TraccarGroupLocalService traccarGroupLocalService) {
		_traccarGroupLocalService = traccarGroupLocalService;
	}

	private TraccarGroupLocalService _traccarGroupLocalService;
}