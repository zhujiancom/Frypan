<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<title>the Frypan 炸鸡啤酒</title>
<meta content="IE=edge" http-equiv="X-UA-Compatible">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta content="text/html; charset=utf-8" http-equiv="Content-Type">
<link rel="icon" href="<c:url value="/frypan.ico"/>" type="image/x-icon"/>
<link rel="shortcut icon" href="<c:url value="/frypan.ico"/>" type="image/x-icon"/>

<!-- 引入 Bootstrap -->
<link href="<s:url value="/common/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet">
<link rel="stylesheet" href='<c:url value="/frontend/plugins/flexslider/flexslider.css"/>' type="text/css" media="screen" />
<link href="<c:url value="/frontend/css/main.css"/>" rel="stylesheet">
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="<c:url value="/common/js/jquery-1.11.1.js"/>"></script>
<!-- 包括所有已编译的插件 -->
<script src="<c:url value="/common/bootstrap/js/bootstrap.min.js"/>"></script>

<script src="<c:url value="/frontend/plugins/flexslider/jquery.flexslider-min.js"/>" type="application/javascript"></script>
</head>

<body>
	<div class="container">
	<div class="row">
		<jsp:include page="snippet/header.jsp"></jsp:include>
		<div id="content" class="row">
			<div class="col-md-9">
				<div class="row content-row-bg t-message-box" title="优惠信息">
					<div class="col-md-9">优惠活动：<a>满39元免外送费</a></div>
				</div>
				<div class="row content-row-bg" title="轮播展示">
					<div class="col-md-12 flexslider">
<!-- 				     <a> -->
<!-- 						<img src="images/produce/lunbo1.jpg" width="735" height="354"/> -->
<!-- 					 </a> -->
<!-- 						 <div class="flexslider"> -->
							<ul class="slides">
								<li><img src="<c:url value="/frontend/images/produce/lunbo1.jpg"/>" width="735" height="354"/></li>
								<li><img src="<c:url value="/frontend/images/produce/lunbo2.jpg"/>" width="735" height="354"/></li>
								<li><img src="<c:url value="/frontend/images/produce/lunbo3.jpg"/>" width="735" height="354"/></li>
								<li><img src="<c:url value="/frontend/images/produce/lunbo4.jpg"/>" width="735" height="354"/></li>
							</ul>
<!-- 						</div> -->
					 </div>
				</div>
				<div class="row content-row-bg" title="产品展示">
				     <div class="col-md-6">
						<a>
							<img src="<c:url value="/frontend/images/produce/c1.jpg"/>" width="360" height="148"/>
						</a>
					 </div>
					 <div class="col-md-6">
						<a>
							<img src="<c:url value="/frontend/images/produce/c2.jpg"/>" width="360" height="148"/>
						</a>
					 </div>
				</div>
			</div>
			<div class="col-md-3" title="开始订餐">
				<div class="row" title="开始订餐">
					<div class="col-md-12">
					<div class="row right-top right-bg">
						<b>开始订餐</b>
					</div>
					<div class="row">
						<div class="right_order_main">
							<h1>请输入电子邮箱或手机：</h1>
							<input class="input_1" type="text"></input>
							<p>
								<input type="checkbox" style="margin:0 0 0 0;" />
								<span class="right_order_main_s1">记住我</span>
							</p>
						</div>
					</div>
					<div class="row">
						<div class="right_order_btm">
							<a >
								<img src="<c:url value="/frontend/images/home/next_btn.png"/>"/>
							</a>
						</div>
					</div>
					</div>
				</div>
				<div id="help" class="row right-help-bg" title="声明">
					<div class="help">
						<div class="index_content">
							<span>啃打鸡是值得信赖的品牌，40天就长出来的白羽鸡。没有激素。</span>
						</div>
						<div class="index_detail">
							<span><a>查看更多»</a></span>
						</div>
					</div>
				</div>
			</div>
		</div>
		<jsp:include page="snippet/footer.jsp"></jsp:include>
	</div>
</div>
<script type="text/javascript">
$(window).load(function() {
	$('.flexslider').flexslider({
		animation: "slide"
	});
});
</script>
</body>
</html>
