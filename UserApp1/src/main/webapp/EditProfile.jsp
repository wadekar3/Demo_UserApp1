<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="App.test.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
	String fN = (String)request.getAttribute("fName");
	UserBean ub = (UserBean)application.getAttribute("ub"); out.println("Page belongs to User : "+fN+"<br>");
	%>
	<form action="update" method="post">
		City:<input type="text" name="city" value=<%=ub.getCity()%>><br>
		MailId:<input type="text" name="mid" value=<%=ub.getmId()%>><br>
		PhoneNo:<input type="text" name="phno" value=<%=ub.getPhNo()%>><br>
		<input type="submit" value="UpdateProfile">
	</form>

</body>
</html>