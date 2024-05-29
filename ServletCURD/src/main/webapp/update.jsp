<%@page import="com.src.dto.Member"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

body{
  margin: auto;
  width: 95%
}
#header {
	width: 100%;
	text-align: center;
	margin: 10px;
	padding: 20px;
	color: white;
	background: orange;
}

#content{
    width: 100%;
    margin: 10px;
}

table{
   
   width: 100%;
   margin: 20px;

}

td, th{
   padding: 10px;
}
</style>
</head>
<body>
	
	<div id="header">
		<h1>Update member</h1>
	</div>
	<div id="content">
	<form action="./updatemember" method="post">
		<table>
			<tr>
				<td>id</td>
				<td><input type="text" name="id" readonly="readonly" value="${member.id}"></td>
			</tr>

			
			<tr>
				<td>first</td>
				<td><input type="text" name="first" value="${member.first}"></td>
			</tr>
			
			<tr>
				<td>last</td>
				<td><input type="text" name="last" value="${member.last}"></td>
			</tr>
			<tr>
				<td>age</td>
				<td><input type="text" name="age" value="${member.age}"></td>
			</tr>
            <tr>
				<td><input type="submit" value="Update"></td>
				<td><input type="reset"></td>
			</tr>
			
		</table>
		</form>
		<a href="./FindAllMember">All members</a>
	</div>
	
	
</body>
</html>