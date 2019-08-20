<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
<body>
	<%@ include file = "header.jsp" %>
	<div class="container" style="margin-top: 20px;">
		<!--
            	作者：676083434@qq.com
            	时间：2019-08-05
            	描述：图片轮播
            -->
		<div class="row">
			<div id="carousel-example-generic" class="carousel slide"
				data-ride="carousel">
				<!-- Indicators -->
				<ol class="carousel-indicators">
					<li data-target="#carousel-example-generic" data-slide-to="0"
						class="active"></li>
					<li data-target="#carousel-example-generic" data-slide-to="1"></li>
					<li data-target="#carousel-example-generic" data-slide-to="2"></li>
				</ol>

				<!-- Wrapper for slides -->
				<div class="carousel-inner" role="listbox">
					<div class="item active">
						<img src="resources/images/img/1.jpg" alt="1">
						<div class="carousel-caption">test1</div>
					</div>
					<div class="item">
						<img src="resources/images/img/2.jpg" alt="2">
						<div class="carousel-caption">test2</div>
					</div>
					<div class="item">
						<img src="resources/images/img/3.jpg" alt="3">
						<div class="carousel-caption">test3</div>
					</div>
				</div>

				<!-- Controls -->
				<a class="left carousel-control" href="#carousel-example-generic"
					role="button" data-slide="prev"> <span
					class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
					<span class="sr-only">Previous</span>
				</a> <a class="right carousel-control" href="#carousel-example-generic"
					role="button" data-slide="next"> <span
					class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
					<span class="sr-only">Next</span>
				</a>
			</div>
		</div>

		<!--
            	作者：676083434@qq.com
            	时间：2019-08-05
            	描述：最新商品
            -->
		<div class="row" style="margin-top: 20px;">
			<div class="col-md-12">
				<span class="h3">最新商品</span> <img src="resources/images/img/title2.jpg" />
			</div>
		</div>
		<div class="row" style="margin-top: 10px;">
			<div class="col-md-2" style="height: 446px;">
				<img class="img-responsive" src="resources/images/products/hao/big01.jpg"
					style="height: 100%;" />
			</div>

			<div class="col-md-10" style="height: 446px;">
				<div class="row" style="height: 50%;">
					<div class="col-md-6" style="height: 100%;">
						<img class="img-responsive" src="resources/images/products/hao/middle01.jpg"
							style="height: 100%;" />
					</div>
					<div class="col-md-2 center-block text-center"
						style="height: 100%;">
						<img class="img-responsive" src="resources/images/products/hao/small02.jpg" />
						<label class="center-block" style="color: royalblue;">电视机</label><br />
						<label class="center-block" style="color: royalblue;">$3000</label>
					</div>
					<div class="col-md-2 center-block text-center"
						style="height: 100%;">
						<img class="img-responsive" src="resources/images/products/hao/small02.jpg" />
						<label class="center-block" style="color: royalblue;">电视机</label><br />
						<label class="center-block" style="color: royalblue;">$3000</label>
					</div>
					<div class="col-md-2 center-block text-center"
						style="height: 100%;">
						<img class="img-responsive" src="resources/images/products/hao/small02.jpg" />
						<label class="center-block" style="color: royalblue;">电视机</label><br />
						<label class="center-block" style="color: royalblue;">$3000</label>
					</div>
				</div>

				<div class="row" style="height: 50%;">
					<div class="col-md-2 center-block text-center"
						style="height: 100%;">
						<img class="img-responsive" src="resources/images/products/hao/small02.jpg" />
						<label class="center-block" style="color: royalblue;">电视机</label><br />
						<label class="center-block" style="color: royalblue;">$3000</label>
					</div>
					<div class="col-md-2 center-block text-center"
						style="height: 100%;">
						<img class="img-responsive" src="resources/images/products/hao/small02.jpg" />
						<label class="center-block" style="color: royalblue;">电视机</label><br />
						<label class="center-block" style="color: royalblue;">$3000</label>
					</div>
					<div class="col-md-2 center-block text-center"
						style="height: 100%;">
						<img class="img-responsive" src="resources/images/products/hao/small02.jpg" />
						<label class="center-block" style="color: royalblue;">电视机</label><br />
						<label class="center-block" style="color: royalblue;">$3000</label>
					</div>
					<div class="col-md-2 center-block text-center"
						style="height: 100%;">
						<img class="img-responsive" src="resources/images/products/hao/small02.jpg" />
						<label class="center-block" style="color: royalblue;">电视机</label><br />
						<label class="center-block" style="color: royalblue;">$3000</label>
					</div>
					<div class="col-md-2 center-block text-center"
						style="height: 100%;">
						<img class="img-responsive" src="resources/images/products/hao/small02.jpg" />
						<label class="center-block" style="color: royalblue;">电视机</label><br />
						<label class="center-block" style="color: royalblue;">$3000</label>
					</div>
					<div class="col-md-2 center-block text-center"
						style="height: 100%;">
						<img class="img-responsive" src="resources/images/products/hao/small02.jpg" />
						<label class="center-block" style="color: royalblue;">电视机</label><br />
						<label class="center-block" style="color: royalblue;">$3000</label>
					</div>

				</div>
			</div>
		</div>

		<!--
            	作者：676083434@qq.com
            	时间：2019-08-06
            	描述：中间广告图片
            -->
		<div class="row">
			<div class="col-md-12"
				style="margin-top: 20px; margin-bottom: 20px; height: 100px;">
				<img class="img-responsive" src="resources/images/products/hao/ad.jpg"
					style="width: 100%; height: 100%;" />
			</div>
		</div>

		<!--
            	作者：676083434@qq.com
            	时间：2019-08-06
            	描述：推荐商品
            -->
		<div class="row" style="margin-top: 20px;">
			<div class="col-md-12">
				<span class="h3">推荐商品</span> <img src="resources/images/img/title2.jpg" />
			</div>
		</div>
		<div class="row" style="margin-top: 10px;">
			<div class="col-md-2" style="height: 446px;">
				<img class="img-responsive" src="resources/images/products/hao/big01.jpg"
					style="height: 100%;" />
			</div>

			<div class="col-md-10" style="height: 446px;">
				<div class="row" style="height: 50%;">
					<div class="col-md-6" style="height: 100%;">
						<img class="img-responsive" src="resources/images/products/hao/middle01.jpg"
							style="height: 100%;" />
					</div>
					<div class="col-md-2 center-block text-center"
						style="height: 100%;">
						<img class="img-responsive" src="resources/images/products/hao/small02.jpg" />
						<label class="center-block" style="color: royalblue;">电视机</label><br />
						<label class="center-block" style="color: royalblue;">$3000</label>
					</div>
					<div class="col-md-2 center-block text-center"
						style="height: 100%;">
						<img class="img-responsive" src="resources/images/products/hao/small02.jpg" />
						<label class="center-block" style="color: royalblue;">电视机</label><br />
						<label class="center-block" style="color: royalblue;">$3000</label>
					</div>
					<div class="col-md-2 center-block text-center"
						style="height: 100%;">
						<img class="img-responsive" src="resources/images/products/hao/small02.jpg" />
						<label class="center-block" style="color: royalblue;">电视机</label><br />
						<label class="center-block" style="color: royalblue;">$3000</label>
					</div>
				</div>

				<div class="row" style="height: 50%;">
					<div class="col-md-2 center-block text-center"
						style="height: 100%;">
						<img class="img-responsive" src="resources/images/products/hao/small02.jpg" />
						<label class="center-block" style="color: royalblue;">电视机</label><br />
						<label class="center-block" style="color: royalblue;">$3000</label>
					</div>
					<div class="col-md-2 center-block text-center"
						style="height: 100%;">
						<img class="img-responsive" src="resources/images/products/hao/small02.jpg" />
						<label class="center-block" style="color: royalblue;">电视机</label><br />
						<label class="center-block" style="color: royalblue;">$3000</label>
					</div>
					<div class="col-md-2 center-block text-center"
						style="height: 100%;">
						<img class="img-responsive" src="resources/images/products/hao/small02.jpg" />
						<label class="center-block" style="color: royalblue;">电视机</label><br />
						<label class="center-block" style="color: royalblue;">$3000</label>
					</div>
					<div class="col-md-2 center-block text-center"
						style="height: 100%;">
						<img class="img-responsive" src="resources/images/products/hao/small02.jpg" />
						<label class="center-block" style="color: royalblue;">电视机</label><br />
						<label class="center-block" style="color: royalblue;">$3000</label>
					</div>
					<div class="col-md-2 center-block text-center"
						style="height: 100%;">
						<img class="img-responsive" src="resources/images/products/hao/small02.jpg" />
						<label class="center-block" style="color: royalblue;">电视机</label><br />
						<label class="center-block" style="color: royalblue;">$3000</label>
					</div>
					<div class="col-md-2 center-block text-center"
						style="height: 100%;">
						<img class="img-responsive" src="resources/images/products/hao/small02.jpg" />
						<label class="center-block" style="color: royalblue;">电视机</label><br />
						<label class="center-block" style="color: royalblue;">$3000</label>
					</div>

				</div>
			</div>
			<%@ include file = "footer.jsp" %>
			</div>
		</div>
	</body>
</html>
