package com.bmstu.groups.manager.web.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.bmstu.groups.manager.core.model.TraccarGroup;
import com.bmstu.groups.manager.core.service.TraccarGroupLocalService;
import com.bmstu.groups.manager.web.constants.GroupsManagerPortletKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;

/**
 * 
 * Groups manager portlet. Can add groups.
 * 
 * @author Kylebyakin
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=Traccar",
		"com.liferay.portlet.instanceable=false", "javax.portlet.display-name=Groups Manager",
		"javax.portlet.init-param.template-path=/", "javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + GroupsManagerPortletKeys.GroupsManager,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class GroupsManagerPortlet extends MVCPortlet {

	private TraccarGroupLocalService traccarGroupLocalService;

	/**
	 * 
	 * Adds traccar group to data base.
	 * 
	 * @param request
	 *            - request. Can't be <code>null</code>.
	 * @param response
	 *            - response. Can't be <code>null</code>
	 * 
	 * @throws PortalException
	 */
	public void addTraccarGroup(ActionRequest request, ActionResponse response) throws PortalException {
		ServiceContext serviceContext = ServiceContextFactory.getInstance(TraccarGroup.class.getName(), request);

		String traccarGroupName = ParamUtil.getString(request, "name");
		String traccarGroupAttributes = ParamUtil.getString(request, "traccarGroupAttributes");

		try {
			traccarGroupLocalService.addTraccarGroup(serviceContext.getUserId(), traccarGroupName,
					traccarGroupAttributes, serviceContext);
			SessionMessages.add(request, "Traccar group added");
		} catch (Exception e) {
			System.out.println(e);
			SessionErrors.add(request, e.getClass().getName());
			PortalUtil.copyRequestParameters(request, response);
			response.setRenderParameter("mvcPath", "/edit_group.jsp");
		}
	}
	
	/** 
	* 
	* Deletes group from data base. 
	* 
	* @param request 
	* - request. Can't be <code>null</code>. 
	* @param response 
	* - response. Can't be <code>null</code> 
	* 
	* @throws PortalException 
	*/ 
	public void deleteGroup(ActionRequest request, ActionResponse response) throws PortalException { 
	long groupId = ParamUtil.getLong(request, "traccarGroupId"); 
	traccarGroupLocalService.deleteTraccarGroup(groupId); 
	}
	/**
	 * 
	 * Binds traccar group service.
	 * 
	 */
	@Reference(unbind = "-")
	protected void bindGeozoneService(TraccarGroupLocalService traccarGroupLocalService) {
		this.traccarGroupLocalService = traccarGroupLocalService;
	}
}