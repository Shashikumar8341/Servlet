<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>hello</h1>
	<form action=RequestDispatcher method="post">
		Name:<input type="text" name="userName" /><br /> Password:<input
			type="password" name="userPass" /><br /> <input type="submit"
			value="login" />
			<% out.print("Today is:"+java.util.Calendar.getInstance().getTime()); %>  
			
	</form>
</body>
</html>