<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="header">
		<h1>Login Here</h1>
	</div>
	<div id="content">
		<span style="color: red;">${errorMsg}</span>
		<form action="login" method="get">
			<h1>login form</h1>
			<label>login name</label><br> <input type="text" name="name"><br>
			<label>login pass</label><br> <input type="text" name="pass"><br>
			<button type="submit" login></button>
		</form>
	</div>
</body>
</html>