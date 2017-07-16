<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix= "form" uri= "http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>注册页面</title>
<!-- 关于邮箱，电话要求的js -->
<script type="text/javascript" src="js/form.js"></script>
<link href="css/bootstrap.min.css" rel="stylesheet">
<style type="text/css">

    div,span,input{
     margin:0px;
     padding:0px;
    }
    #zj{
    	width:80%;
    	height:700px;
    	background-image:url(images/001.jpg);   
    }
	a{
	color:blue;
	text-decoration:none;
	}
    </style>
</head>
<body>
<div  style="height:80px;">
 	 <span style="font-family:楷体 ;font-size:40px;margin-left:200px;"><a href="index">童真</a></span>
 	 <span style="font-family:楷体 ;font-size:24px;">用户注册</span>
</div>
 <div class="img-responsive center-block" id="zj" >
<div class="col-ma-12">
<div class="col-md-4"></div>
<form action="registerform" name="myForm" action="demo-form.php" onsubmit="return validateForm()" method="post" class="col-md-4">
<div >
  <div class="form-group" >
		<label for="exampleInputusername">用户名</label>
		<input type="text" name="username"  class="form-control" id="exampleInputusername" placeholder="用户名">
   </div>
  <div class="form-group">
    <label for="exampleInputPassword1">密&nbsp;码</label>
    <input name="password" type="password" class="form-control" id="exampleInputPassword1" placeholder="密码为6位到16位的字符">
  </div>
<div class="form-group">
    <label for="exampleInputEmail1">邮&nbsp;箱</label>
    <input name="email" class="form-control" id="exampleInputEmail1" placeholder="合法邮箱">
  </div>
  <div class="form-group">
    <label for="exampleInputphone">电话号</label>
    <input name="phone" class="form-control" id="exampleInputphone" placeholder="电话号码">
  </div>
    <div class="form-group">
    <label for="exampleInputaddress">地址</label>
    <input name="address" class="form-control" id="exampleInputaddress" placeholder="省市区">
  </div>
    </div>
    <div class="form-group">
    <label for="exampleInputquestion">密保问题</label>
    <select name="question"  id="exampleInputquestion" class="form-control">
  <option>生日</option>
  <option>毕业于哪所学校</option>
  <option>工号/学号</option>
  <option>母亲姓名</option>
  <option>配偶姓名</option>
</select>
  </div>
      <div class="form-group">
    <label for="exampleInputanswer">答案</label>
    <input name="answer" class="form-control" id="exampleInputanswer" >
  </div>
   <input type="submit" class="form-control" value="立即注册" style="margin-top:40px;background-color:red;" />
	<div style="float:right;margin-top:25px;"><a href="login">已有账号，立刻登录</a></div>
    </form>
    </div>

 
</div>

<div class="col-md-4"></div>


 <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    
    <script src="js/bootstrap.min.js"></script>
</body>

</html>