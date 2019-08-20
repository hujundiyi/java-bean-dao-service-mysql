<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录</title>

<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.min.css">
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script type="text/javascript"
	src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
	<%@ include file="header.jsp"%>
	<div class="container">
		<div class="text-center">
			<form action="UserOperation?method=login" method="post">
				用户名：<input type="text" id="userName" name="userName" value="" /><br />
				密&nbsp;&nbsp;&nbsp;&nbsp;码：
				<input type="password" id="password" name="password" value="" style="margin-left: -1px;" /><br />
				<input type="submit" value="登录" />
			</form>
		</div>
	</div>
	<%@ include file="footer.jsp"%>
</body>
</html>
