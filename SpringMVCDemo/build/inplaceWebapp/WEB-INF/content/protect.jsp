<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix= "form" uri= "http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>密保设置</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<style type="text/css">

    div,span,input{
     margin:0px;
     padding:0px;
    }
    #zj{
    	width:100%;
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
 	 <span style="font-family:楷体 ;font-size:40px;margin-left:200px;"><a href="index">噗噗网</a></span>
 	 <span style="font-family:楷体 ;font-size:24px;">密保设置</span>
</div>
 <div id="zj" >
<div class="col-ma-12">
<div class="col-md-4"></div>
<form action="protectform" method="post" class="col-md-4">
<div >
  <div class="form-group" >
    <label for="user">用户名</label>
    <input name="username"  class="form-control" id="user" placeholder="">
  </div>
  <div class="form-group">
    <label for="question">密保问题</label>
    <input name="question" type="text" class="form-control" id="question" placeholder="请输入20个字符以内的问题">
  </div>
<div class="form-group">
    <label for="answer">答案</label>
    <input name="answer" class="form-control" id="answer" placeholder="请输入20个字符以内的答案">
  </div>
  <div class="form-group">
    <label for="cue">提示</label>
    <input name="cue" class="form-control" id="cue" placeholder="提示">
  <input type="submit" class="form-control" value="确定" style="margin-top:40px;background-color:red;" />
</div>
</div>
</form>
<div class="col-md-4"></div>
</div>
</div>

 <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    
    <script src="js/bootstrap.min.js"></script>
</body>

</html>