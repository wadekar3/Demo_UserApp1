<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String fN = (String) request.getAttribute("fName");
	String msg = (String) request.getAttribute("msg");
	out.println("Page belongs to User : " + fN + "<br>");
	out.println(msg);
	%>
	<a href="view">ViewProfile</a>
	<a href="logout">Logout</a>

</body>
</html>