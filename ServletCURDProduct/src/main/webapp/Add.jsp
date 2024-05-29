<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Insert values</h1>

	<form action="/Addproducts" method="post">
	<table>
		<tr>
			<td>idproduct</td>
			<td><input type="text" name="idproduct"></td>
		</tr>
		<tr>
			<td>p_name</td>
			<td><input type="text" name="p_name"></td>
		</tr>
		<tr>
			<td>p_packket</td>

			<td><input type="text" name="p_packket"></td>
		</tr>
		<tr>
			<td>p_address</td>
			<td><input type="text" name="p_address"></td>
		</tr>
		<tr>
			<td>dates</td>

			<td><input type="text" name="dates">
				</td>
		</tr>
		
		</table>
	</form>
<a href="./FindAlls">table</a>
</body>
</html>