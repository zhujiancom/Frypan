<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
	isELIgnored="false"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html>
<head>
<title>bootstrap 模板</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- 引入 Bootstrap -->
<link href="<%=basePath%>common/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="css/main.css"
	rel="stylesheet">
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="<%=basePath%>common/js/jquery-1.11.1.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="<%=basePath%>common/bootstrap/js/bootstrap.min.js"></script>
</head>

<body>
	<div class="wrapper">
		<div id="top"></div>
	</div>
</body>
</html>
