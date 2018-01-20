<%@include file="/init.jsp"%>

<%
	TraccarGroup traccarGroup = null;
%>

<portlet:renderURL var="viewURL">

	<portlet:param name="mvcPath" value="/view.jsp" />

</portlet:renderURL>

<portlet:actionURL name="addTraccarGroup" var="addTraccarGroupURL" />

<aui:form action="<%=addTraccarGroupURL%>" name="<portlet:namespace />fm">

	<aui:model-context bean="<%=traccarGroup%>"
		model="<%=TraccarGroup.class%>" />

	<aui:fieldset>

		<aui:input name="name" />
		<aui:input name="traccarGroupAttributes" />

	</aui:fieldset>

	<aui:button-row>

		<aui:button type="submit" />
		<aui:button type="cancel" onClick="<%= viewURL.toString() %>" />

	</aui:button-row>
</aui:form>