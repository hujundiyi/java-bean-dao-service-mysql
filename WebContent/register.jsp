<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册</title>
<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.min.css">
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script type="text/javascript"
	src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>

	<%@ include file = "/header.jsp" %>
	<div class="container" style="background-image: url(resources/images/image/regist_bg.jpg); height: 600px;">
			<div style="width: 40%; height: 90%;margin-top: 5%; margin-left: 30%;">
				<form class="form-horizontal" action="${pageContext.request.contextPath }/UserOperation?method=register" method="post">
				  <div class="form-group">
				    <label for="inputUserName" class="col-sm-3 control-label">用户名</label>
				    <div class="col-sm-9">
				      <input type="text" class="form-control" id="inputUserName" placeholder="用户名" name="username">
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputPassword" class="col-sm-3 control-label">密码</label>
				    <div class="col-sm-9">
				      <input type="password" class="form-control" id="inputPassword" placeholder="密码" name="password">
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputPasswordSure" class="col-sm-3 control-label">确认密码</label>
				    <div class="col-sm-9">
				      <input type="password" class="form-control" id="inputPasswordSure" placeholder="确认密码">
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputEmail" class="col-sm-3 control-label">Email</label>
				    <div class="col-sm-9">
				      <input type="email" class="form-control" id="inputEmail" placeholder="Email"  name="email">
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputRealName" class="col-sm-3 control-label">姓名</label>
				    <div class="col-sm-9">
				      <input type="text" class="form-control" id="inputRealName" placeholder="姓名" name="name">
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputTelephone" class="col-sm-3 control-label">联系电话</label>
				    <div class="col-sm-9">
				      <input type="text" class="form-control" id="inputTelephone" placeholder="联系电话" name="telephone">
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputPassword" class="col-sm-3 control-label">性别</label>
				    <div class="col-sm-9">
				      <div class="radio">
				        <label>
				          <input type="radio" checked="checked" name="sex" value="男"> 男
				        </label>
				        <label>
				          <input type="radio" name="sex" value="女"> 女
				        </label>
				      </div>
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputBirthday" class="col-sm-3 control-label">出生日期</label>
				    <div class="col-sm-9">
				      <input type="date" class="form-control" id="inputBirthday" placeholder="年/月/日"  name="birthday">
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputYanZheng" class="col-sm-3 control-label">验证码</label>
				    <div class="col-sm-6">
				      <input type="text" class="form-control" id="inputYanZheng" placeholder="验证码">
				    </div>
				    <div class="col-sm-3">
				      
				    </div>
				  </div>
				  <div class="form-group">
				    <div class="col-sm-offset-3 col-sm-9">
				      <button type="submit" class="btn btn-default">立即注册</button>
				    </div>
				  </div>
				</form>
			</div>
		</div>


	<%@ include file = "/footer.jsp" %>

</body>
</html>