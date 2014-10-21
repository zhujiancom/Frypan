<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
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
<meta content="IE=edge" http-equiv="X-UA-Compatible">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta content="text/html; charset=utf-8" http-equiv="Content-Type">
<link rel="icon" href="<%=basePath %>frypan.ico" type="image/x-icon"/>
<link rel="shortcut icon" href="<%=basePath %>frypan.ico" type="image/x-icon"/>

<!-- 引入 Bootstrap -->
<link href="../common/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="css/main.css"
	rel="stylesheet">
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="../common/js/jquery-1.11.1.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="../common/bootstrap/js/bootstrap.min.js"></script>
</head>

<body>
	<div class="wrapper">
		<jsp:include page="jsp/header.jsp"></jsp:include>
	</div>
</body>
</html>
