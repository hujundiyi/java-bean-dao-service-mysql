<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@ include file="/header.jsp"%>

	<div class="container">
		<div class="col-md-5 text-center">
			<img
				src="resources/images/${getProductItem.pimage }"
				class="img-responsive" style="width: 60%; border: 1px solid #C1E2B3" />
		</div>
		<div class="col-md-7">
			<p class="h5">${getProductItem.pname }</p>
			<p>编号：</p>
			<p>零售价：￥${getProductItem.shop_price } 参考价￥${getProductItem.market_price }</p>
			<p>促销</p>
			<div style="width: 70%; padding: 20px; background-color: #C1E2B3;">
				<p>颜色：白色</p>
				<p>
					购买数量：<input type="text" value="1"/>
				</p>
				<button>加入购物车</button>
				<a><label>收藏商品</label></a>
			</div>
		</div>
		
		<div class="col-md-12">
			<p>${getProductItem.pdesc }</p>
		</div>
	</div>

	<%@ include file="/footer.jsp"%>
</body>
</html>