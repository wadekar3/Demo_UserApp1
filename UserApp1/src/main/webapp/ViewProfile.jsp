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
	String fN = (String) request.getAttribute("fName");
	UserBean ub = (UserBean) application.getAttribute("ub");
	out.println("Page belongs to User : " + fN + "<br>");
	out.println(ub.getfName() + "&nbsp&nbsp" + ub.getlName() + "&nbsp&nbsp" + ub.getCity() + "&nbsp&nbsp" + ub.getmId()
			+ "&nbsp&nbsp" + ub.getPhNo() + "&nbsp&nbsp" + "<a href='edit'>Edit</a><br>");
	%>

	<a href="logout">Logout</a>

</body>
</html>