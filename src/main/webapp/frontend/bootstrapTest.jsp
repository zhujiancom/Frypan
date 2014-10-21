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
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="https://code.jquery.com/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="<%=basePath%>common/bootstrap/js/bootstrap.min.js"></script>
</head>

<body>
	<h1>HELLO World!</h1>
	<abbr title="World Wide Web">WWW</abbr>
	<abbr title="Real Simple Syndication" class="initialism">RSS</abbr>

	<table class="table table-hover table-bordered" style="width: 80%">
		<caption>悬停表格布局</caption>
		<thead>
			<tr>
				<th>名称</th>
				<th>城市</th>
				<th>密码</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>Tanmay</td>
				<td>Bangalore</td>
				<td>560001</td>
			</tr>
			<tr>
				<td>Sachin</td>
				<td>Mumbai</td>
				<td>400003</td>
			</tr>
			<tr>
				<td>Uma</td>
				<td>Pune</td>
				<td>411027</td>
			</tr>
		</tbody>
	</table>
	<div class="container">
		<div class="row">
			<div class="col-lg-6" style="background: blue;">test1</div>
			<div class="col-lg-6" style="background: blue;">test2</div>
		</div>
	</div>

	<form role="form">
		<div class="form-group">
			<label for="name">名称</label> <input type="text" class="form-control"
				id="name" placeholder="请输入名称">
		</div>
		<div class="form-group">
			<label for="inputfile">文件输入</label> <input type="file" id="inputfile">
			<p class="help-block">这里是块级帮助文本的实例。</p>
		</div>
		<div class="checkbox">
			<label> <input type="checkbox"> 请打勾
			</label>
		</div>
		<button type="submit" class="btn btn-default">提交</button>
	</form>

	<form class="form-inline" role="form">
		<div class="form-group">
			<label class="sr-only" for="name">名称</label> <input type="text"
				class="form-control" id="name" placeholder="请输入名称">
		</div>
		<div class="form-group">
			<label class="sr-only" for="inputfile">文件输入</label> <input
				type="file" id="inputfile">
		</div>
		<div class="checkbox">
			<label> <input type="checkbox"> 请打勾
			</label>
		</div>
		<button type="submit" class="btn btn-default">提交</button>
	</form>

	<form class="form-horizontal" role="form">
		<div class="form-group">
			<label for="firstname" class="col-sm-2 control-label">名字</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="firstname"
					placeholder="请输入名字">
			</div>
		</div>
		<div class="form-group">
			<label for="lastname" class="col-sm-2 control-label">姓</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="lastname"
					placeholder="请输入姓">
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<div class="checkbox">
					<label> <input type="checkbox"> 请记住我
					</label>
				</div>
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-default">登录</button>
			</div>
		</div>
	</form>

	<nav class="navbar navbar-inverse" role="navigation">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">W3Cschool</a>
		</div>
		<div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">iOS</a></li>
				<li><a href="#">SVN</a></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"> Java <b class="caret"></b>
				</a>
					<ul class="dropdown-menu">
						<li><a href="#">jmeter</a></li>
						<li><a href="#">EJB</a></li>
						<li><a href="#">Jasper Report</a></li>
						<li class="divider"></li>
						<li><a href="#">分离的链接</a></li>
						<li class="divider"></li>
						<li><a href="#">另一个分离的链接</a></li>
					</ul></li>
			</ul>
		</div>
	</nav>
</body>
</html>
