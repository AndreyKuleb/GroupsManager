<%@include file="/init.jsp"%>

<%
	TraccarGroup traccarGroupVar = null;
%>

<aui:button-row cssClass="traccar-buttons">

	<portlet:renderURL var="addTraccarGroupURL">
		<portlet:param name="mvcPath" value="/edit_group.jsp" />
	</portlet:renderURL>

	<aui:button onClick="<%=addTraccarGroupURL.toString()%>"
		value="Add Group"></aui:button>

</aui:button-row>

<portlet:actionURL name="deleteGroup" var="deleteGroupURL" />

<liferay-ui:search-container
	total="<%=TraccarGroupLocalServiceUtil.getTraccarGroupsCount()%>">
	<liferay-ui:search-container-results
		results="<%=TraccarGroupLocalServiceUtil.getTraccarGroups(scopeGroupId.longValue(),
						searchContainer.getStart(), searchContainer.getEnd())%>" />

	<liferay-ui:search-container-row
		className="com.bmstu.groups.manager.core.model.TraccarGroup"
		modelVar="traccarGroup">

		<liferay-ui:search-container-column-text property="traccarGroupId" />

		<liferay-ui:search-container-column-text property="name" />

		<liferay-ui:search-container-column-text
			property="traccarGroupAttributes" />

	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />

</liferay-ui:search-container>

<aui:form action="<%=deleteGroupURL%>" name="<portlet:namespace />fm"> 

	<aui:model-context bean="<%=traccarGroupVar%>" 
	model="<%=TraccarGroup.class%>" /> 
	
	<aui:fieldset> 
	
		<aui:input name="traccarGroupId" type="clear"/> 
	
	</aui:fieldset> 
	
	<aui:button-row> 
	
		<aui:button type="submit" value="Delete"/> 
	
	</aui:button-row> 
</aui:form>