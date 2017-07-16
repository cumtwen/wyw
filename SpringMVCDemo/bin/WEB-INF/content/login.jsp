<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix= "form" uri= "http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
 <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
 <script src="js/bootstrap.min.js"></script>
<script src="js/jquery.cookie.js" type="text/javascript"></script>
<script type="text/javascript">
$(document).ready(function(){
	if($.cookie("rmbUser")=="true"){
		$("#checkbox").attr("checked",true);
		$("#username").val($.cookie("name"));
		$("#password").val($.cookie("pwd"));
		
	}
	
});

function Save(){
	if($("#checkbox:checked").length==1){
		var str_username=$("#username").val();
		var str_password=$("#password").val();
		$.cookie("rmbUser","true",{expires:7});
		$.cookie("name",str_username,{expires:7});
		$.cookie("pwd",str_password,{expires:7});
	}else{
		$.cookie("rmbUser","false",{expires:-1});
		$.cookie("name","",{expires:-1});
		$.cookie("pwd","",{expires:-1});
	}
	
};
</script>
<title>登陆页面</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<style type="text/css">
    form{
    	float:right;
    	width:400px;
    	height:350px;
    	background-color:white;
    	margin-right:200px;
    	text-aligin:center;
    	margin-top:150px;
    	padding:0 auto;
    }
    div,span,input{
     margin:0px;
     padding:0px;
    }
    #zj{
    	width:80%;
    	height:600px;
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
 	 <span style="font-family:楷体 ;font-size:24px;">欢迎登录</span>
</div>
 <div class="img-responsive center-block" id="zj" >

<form action="loginform" method="post" >
<div class="row" >
	<div class="col-lg-8" style="margin-top:50px;margin-left:60px;">
	<div class="input-group" >
		<span class="input-group-addon " id="input1"><span class="glyphicon glyphicon-user"></span></span>
		<input type="text" class="form-control" placeholder="登录名" aria-describedby="input1" name="username" id="username"/>
	</div>
	<div class="input-group" style="margin-top:35px;">
		<span class="input-group-addon" id="input2"><span class="glyphicon glyphicon-lock"></span></span>
		<input type="password" class="form-control" placeholder="密码" aria-describedby="input2" name="password" id="password"/>
	</div>
	<input type="checkbox"  id="checkbox"/>记住密码
	<input type="submit" class="form-control" value="登录" onclick="Save()" style="margin-top:40px;background-color:red;" />
	<div style="float:right;margin-top:25px;"><a href="findpwd">忘记密码</a>&nbsp;&nbsp;&nbsp;<a href="register">免费注册</a></div>
	<c:if test="${message!=null }"><c:out value="${message}" /></c:if>
	</div>
</div>

</form>
</div>


</body>

</html>