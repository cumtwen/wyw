<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix= "form" uri= "http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>找回密码</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<style type="text/css">

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
 	 <span style="font-family:楷体 ;font-size:24px;">找回密码</span>
</div>
 <div class="img-responsive center-block" id="zj" >
<div class="col-ma-12">
<div class="col-md-4"></div>
<form action="ifindpwd" method="post" class="col-md-4">
<div >
  <div class="form-group" >
    <label for="exampleInputusername">用户名</label>
    <input name="username" class="form-control" id="exampleInputusername" placeholder="用户名" value="${user.username}" }>
  </div>
  <div class="form-group">
    <label for="exampleInputquestion">密保问题</label>
    <input name="question" type="text" class="form-control" id="exampleInputquestion" placeholder="请输入你注册时设置的问题" value="${user.question}">
  </div>
<div class="form-group">
    <label for="exampleInputanswer">答案</label>
    <input name="answer" class="form-control" id="exampleInputanswer" placeholder="请输入您的答案" value="${user.answer}">
  </div>
  <div class="form-group">
    <label for="exampleInputpwd">密码</label>
    <input name="pwd" class="form-control" id="exampleInputpwd" placeholder="提交后将显示您的密码" value="${user.password}">
  </div>
  <input type="submit" class="form-control" value="提交" style="margin-top:40px;background-color:red;" />
	<div style="float:right;margin-top:25px;"><a href="login">返回登录页面</a></div>
	<c:if test="${message!=null }"><c:out value="${message}" /></c:if>
</div>
</form>
<div class="col-md-4"></div>
</div>
</div>

 <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    
    <script src="js/bootstrap.min.js"></script>
</body>

</html>