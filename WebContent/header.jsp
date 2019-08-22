<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<head>
<meta charset="UTF-8">

<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.min.css">
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script type="text/javascript"
	src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<title>商城首页</title>

<script type="text/javascript">
	$(function(){
		// 页面加载完成向服务器发送请求ajax请求，转成json后返回
		var url = "/NetShop/Category";// 那个servlet发送请求
		var obj = {"method":"getAllCategory"};// 参数 
		$.post(url, obj, function(data,status){
			$.each(data, function(i, category){
				var li = "<li><a href='#'>" + category.cname + "</a></li>";
				$("#category").append(li);
			});
		}, "json");
	});
</script>

<body>
	<div class="container" style="margin-top: 20px;">
		<!--
            	作者：676083434@qq.com
            	时间：2019-08-05
            	描述：顶部条
            -->
		<div class="row">
			<div class="col-md-4">
				<img src="resources/images/img/logoNew.png"
					style="width: 60%; height: 100%;">
			</div>
			<div class="col-md-4">
				<img src="resources/images/img/header.png">
			</div>
			<div class="col-md-4">
				<div class="text-center" style="margin-top: 20px;"
					id="index_right_login">
					<ul class="list-inline">
						<c:if test="${empty loginUser }">
							<li><a href="login.jsp">登录</a></li>
							<li><a href="register.jsp">注册</a></li>
						</c:if>
						<c:if test="${not empty loginUser }">
							欢迎您<li><a href="login.jsp">${loginUser.username }</a></li>
							<li><a href="UserOperation?method=logout">退出</a></li>
							<li><a href="cart.jsp">购物车</a></li>
							<li><a href="order.jsp">订单</a></li>
						</c:if>

					</ul>


				</div>
			</div>
		</div>

		<!--
            	作者：676083434@qq.com
            	时间：2019-08-05
            	描述：导航条
            -->
		<div class="row" style="margin-top: 20px;">
			<nav class="navbar navbar-inverse">
				<div class="container-fluid">

					<div class="navbar-header">
						<button type="button" class="navbar-toggle collapsed"
							data-toggle="collapse"
							data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
							<span class="sr-only">Toggle navigation</span> <span
								class="icon-bar"></span> <span class="icon-bar"></span> <span
								class="icon-bar"></span>
						</button>
						<!-- <span class="navbar-brand"> hujun </span> -->
						<a class="navbar-brand" href="/NetShop/index.jsp">首页 </a>
					</div>


					<div class="collapse navbar-collapse"
						id="bs-example-navbar-collapse-1">
						<ul class="nav navbar-nav" id="category">
						
							<!-- 第一种方式 -->
							<%-- <c:forEach items="${categoryList}" var="c">
								<li><a href="#">${c.cname}</a></li>
							</c:forEach> --%>
							
							
							<!-- <li class="active"><a href="#">首页 </a></li>
							<li><a href="#">手机数码 </a></li>
							<li><a href="#">鞋靴箱包</a></li>
							<li><a href="#">电脑办公</a></li> -->
							<!--<li class="dropdown">
				          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">电脑办公<span class="caret"></span></a>
				          <ul class="dropdown-menu">
				            <li><a href="#">Action</a></li>
				            <li><a href="#">Another action</a></li>
				            <li><a href="#">Something else here</a></li>
				            <li role="separator" class="divider"></li>
				            <li><a href="#">Separated link</a></li>
				            <li role="separator" class="divider"></li>
				            <li><a href="#">One more separated link</a></li>
				          </ul>
				        </li>-->
						</ul>

					</div>
					<!-- /.navbar-collapse -->
				</div>
				<!-- /.container-fluid -->
			</nav>
		</div>
	</div>
</body>