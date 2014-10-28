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

	<table class="table table-hover table-bordered table-striped"
		style="width: 80%">
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
				<td><a>Tanmay</a></td>
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

	<div class="container" style="background: #ccc">
		<div class="row" style="border: thin solid #000">
			<div class="col-xs-6 col-sm-3" style="border: thin solid #000">.col-xs-6
				.col-sm-3Resize your viewport or check it out on your phone for an
				example.</div>
			<div class="col-xs-6 col-sm-3" style="border: thin solid #000">.col-xs-6
				.col-sm-3</div>

			<!-- Add the extra clearfix for only the required viewport -->
			<div class="clearfix visible-xs-block"></div>

			<div class="col-xs-6 col-sm-3" style="border: thin solid #000">.col-xs-6
				.col-sm-3</div>
			<div class="col-xs-6 col-sm-3" style="border: thin solid #000">.col-xs-6
				.col-sm-3</div>
		</div>

		<div class="row" style="border: thin solid #000">
			<div class="col-sm-5 col-md-6" style="border: thin solid #000">.col-sm-5
				.col-md-6</div>
			<div class="col-sm-5 col-sm-offset-2 col-md-6 col-md-offset-0"
				style="border: thin solid #000">.col-sm-5 .col-sm-offset-2
				.col-md-6 .col-md-offset-0</div>
		</div>

		<div class="row" style="border: thin solid #000">
			<div class="col-sm-6 col-md-5 col-lg-6"
				style="border: thin solid #000">.col-sm-6 .col-md-5 .col-lg-6</div>
			<div
				class="col-sm-6 col-md-5 col-md-offset-2 col-lg-6 col-lg-offset-0"
				style="border: thin solid #000">.col-sm-6 .col-md-5
				.col-md-offset-2 .col-lg-6 .col-lg-offset-0</div>
		</div>

		<div class="row">
			<div class="col-md-4">.col-md-4</div>
			<div class="col-md-4 col-md-offset-4">.col-md-4
				.col-md-offset-4</div>
		</div>
		<div class="row">
			<div class="col-md-3 col-md-offset-3">.col-md-3
				.col-md-offset-3</div>
			<div class="col-md-3 col-md-offset-3">.col-md-3
				.col-md-offset-3</div>
		</div>
		<div class="row">
			<div class="col-md-6 col-md-offset-3">.col-md-6
				.col-md-offset-3</div>
		</div>

		<blockquote>
			<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
				Integer posuere erat a ante.</p>
			<footer>
				Someone famous in <cite title="Source Title">Source Title</cite>
			</footer>
		</blockquote>
		For example,
		<code>&lt;section&gt;</code>
		should be wrapped as inline.
	</div>

	<form class="form-inline" role="form">
		<div class="form-group">
			<label class="sr-only" for="exampleInputEmail2">Email address</label>
			<input type="email" class="form-control" id="exampleInputEmail2"
				placeholder="Enter email">
		</div>
		<div class="form-group">
			<div class="input-group">
				<div class="input-group-addon">@</div>
				<input class="form-control" type="email" placeholder="Enter email">
			</div>
		</div>
		<div class="form-group">
			<label class="sr-only" for="exampleInputPassword2">Password</label> <input
				type="password" class="form-control" id="exampleInputPassword2"
				placeholder="Password">
		</div>
		<div class="checkbox">
			<label> <input type="checkbox"> Remember me
			</label>
		</div>
		<button type="submit" class="btn btn-default">Sign in</button>
	</form>
	<button type="button" class="btn btn-primary">Primary</button>
	<button type="button" class="btn btn-primary btn-sm">Primary</button>
	<button type="button" class="btn btn-primary btn-xs">Primary</button>
	<button type="button" class="btn btn-primary btn-lg">Primary</button>
	<button type="button" class="close"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
	<span class="caret"></span>
	<a class="sr-only sr-only-focusable" href="#content">Skip to main content</a>
	<button type="button" class="btn btn-default btn-lg"><span class="glyphicon glyphicon-search"></span></button>
	
	<div class="dropdown">
  <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown">
    Dropdown
    <span class="caret"></span>
  </button>
  <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
    <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Action</a></li>
    <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Another action</a></li>
    <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Something else here</a></li>
    <li role="presentation" class="divider"></li>
    <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Separated link</a></li>
  </ul>
</div>
</body>
</html>
