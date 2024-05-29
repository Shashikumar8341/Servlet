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
<%
	List<Product> product = (List<Product>) request.getAttribute("product");
	%>
	<div id="header">
		<h1>product Details</h1>
	</div>
	<div>
		<table border="2px">
			<tr>
				<th>idproduct</th>
				<th>p_name</th>
				<th>p_packket</th>
				<th>p_address</th>
				<th>dates</th>
				<th>Delete</th>
				<th>Update</th>
			</tr>

			<%
			for (Product p : product) {
			%>
			<tr>
				<td><%=p.getIdproduct()%></td>
				<td><%=p.getP_name()%></td>
				<td><%=p.getP_packket()%></td>
				<td><%=p.getP_address()%></td>
				<td><%=p.getDates() %></td>
				<td><a href='./Deleteproduct?idproduct=<%=p.getIdproduct()%>'>Delete</a></td>
				<td><a href='./UpdateProduct?idproduct=<%=p.getIdproduct()%>'>Update</a></td>
			</tr>

			<%
			}
			%>
		</table>
		<a href="./Addproducts">New Employee</a>
		</div>
</body>
</html>