<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix= "form" uri= "http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆页面</title>
</head>
<body>
	<form:form action="loginform"  method="post">
	<font color="red">${requestScope.message}</font>
		<table>
			<tr>
				<td>用户名：</td>
				<td><input name="username" type="text" ></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input name="password" type="password" ></td>
			</tr>
			<tr>
				<td><input type="submit" value="提交" ></td>
			</tr>
		</table>
	</form:form>

</body>
</html>