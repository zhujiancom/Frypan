<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
	isELIgnored="false"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<div id="footer" class="row">
	<ul>
		<li class="bg"><a class="bg1">法律条款</a></li>
		<li class="bg"><a class="bg1">联系我们</a></li>
		<li class="noBg"><a class="bg1">加入我们</a></li>
		<li class="last_li noBg">版权所有 The Frypan餐饮公司</li>
	</ul>
</div>
