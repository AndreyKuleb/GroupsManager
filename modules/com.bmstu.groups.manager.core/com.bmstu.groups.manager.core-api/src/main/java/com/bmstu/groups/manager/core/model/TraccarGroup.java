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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the TraccarGroup service. Represents a row in the &quot;GM_TraccarGroup&quot; database table, with each column mapped to a property of this class.
 *
 * @author Kylebyakin
 * @see TraccarGroupModel
 * @see com.bmstu.groups.manager.core.model.impl.TraccarGroupImpl
 * @see com.bmstu.groups.manager.core.model.impl.TraccarGroupModelImpl
 * @generated
 */
@ImplementationClassName("com.bmstu.groups.manager.core.model.impl.TraccarGroupImpl")
@ProviderType
public interface TraccarGroup extends TraccarGroupModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.bmstu.groups.manager.core.model.impl.TraccarGroupImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<TraccarGroup, Long> TRACCAR_GROUP_ID_ACCESSOR = new Accessor<TraccarGroup, Long>() {
			@Override
			public Long get(TraccarGroup traccarGroup) {
				return traccarGroup.getTraccarGroupId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<TraccarGroup> getTypeClass() {
				return TraccarGroup.class;
			}
		};
}