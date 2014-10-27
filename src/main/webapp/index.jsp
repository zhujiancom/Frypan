<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
	isELIgnored="false"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!-- <!DOCTYPE html> -->
<!-- <html> -->
<!-- <head> -->
<!-- <title>跳转...</title> -->
<!-- <meta HTTP-EQUIV="REFRESH" CONTENT="0; URL=pt/homeAction_init.action"> -->
<!-- </head> -->
<!-- </html> -->

<jsp:forward page="homeAction_init.action"></jsp:forward>


