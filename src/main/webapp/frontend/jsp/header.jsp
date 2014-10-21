<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
	isELIgnored="false"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<div id="top">
	<a href="<%=basePath%>frontend/index.jsp">
		<div class="logo"></div>
	</a>	
	<div class="top_menu">
			<ul class="nav nav-pills">
			   <li class="active"><a href="#">首页</a></li>
			   <li><a href="#">开始订餐</a></li>
			   <li><a href="#">查询订单</a></li>
			   <li><a href="#">帮组中心</a></li>
			</ul>			
	</div>
	<div class="clear"></div>
</div>
