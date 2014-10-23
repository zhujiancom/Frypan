<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
	isELIgnored="false"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
	<div id="top" class="row">
		<div class="col-md-3">
			<div class="logo"></div>
		</div>
		<div class="col-md-9 top_menu">
			<div class="row top_menu_1">
				<div class="col-md-3">
					<span class="span_1">欢迎网上订餐！</span>
				</div>
				<div class="col-md-4 col-md-offset-5">
					<a class="span_2 right_border">中文</a> <a class="span_2">English</a>
					<a class="span_3">收藏本订餐网站</a>
				</div>
			</div>
			<div class="row top_menu_2">
				<ul class="col-md-12">
					<li><a class="current">首页</a></li>
					<li><a>浏览菜单</a></li>
					<li><a>开始订餐</a></li>
					<li><a>查询订餐</a></li>
					<li class="last_li"><a>帮助中心</a></li>
				</ul>
			</div>
		</div>
	</div>
