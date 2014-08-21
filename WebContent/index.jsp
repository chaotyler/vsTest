<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>
</head>
<body>
	<s:form action="login">
		<s:textfield name="user.name" label="用户名"></s:textfield>
		<s:password name="user.password" label="密码"></s:password>
		<s:submit value="登录"></s:submit>
	</s:form>
	<a href="register.jsp">注册新用户</a>
</body>
</html>