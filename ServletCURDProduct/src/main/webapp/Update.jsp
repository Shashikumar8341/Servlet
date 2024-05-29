<%@page import="com.src.dto.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>


	<h1>Update product</h1>
	<form action="./UpdateProducts" method="post">
		<table>
			<tr>
				<td>idproduct</td>
				<td><input type="text" name="idproduct" readonly="readonly"
					value="${product.idproduct}"></td>
			</tr>


			<tr>
				<td>p_name</td>
				<td><input type="text" name="p_name" value="${product.p_name}"></td>
			</tr>

			<tr>
				<td>p_packket</td>
				<td><input type="text" name="p_packket"
					value="${product.p_packket}"></td>
			</tr>
			<tr>
				<td>p_address</td>
				<td><input type="text" name="p_address"
					value="${product.p_address}"></td>
			</tr>
			<tr>
				<td>dates</td>
				<td><input type="text" name="date" value="${product.dates}"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Update"></td>
				<td><input type="reset"></td>
			</tr>

		</table>
	</form>
	<a href="./FindAlls">All products</a>


</body>
</html>