<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	 import="App.test.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	UserBean ub = (UserBean) application.getAttribute("ub");
	out.println("Welcome User : " + ub.getfName() + "<br>");
	%>
	<a href="view">ViewProfile</a>
	<a href="logout">Logout</a>

</body>
</html>