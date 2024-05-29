
<%@page import="com.src.dto.Member"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
<
img src ="F:\eclipse-jee-2023-12-R-win32-x86_64\Eclipse_ProgramFiles\010_Layers\wp2568544.jpg
	"/>body {
	margin: auto;
	width: 100%
}

#header {
	width: 100%;
	text-align: center;
	margin: 5px;
	padding: 5px;
	color: black;
	background: gray;
}

#content {
	width: 100%;
	margin: 10px;
}

table {
	width: 95%;
	margin: 10px;
}

th {
	padding: 10px;
	color: red
}
</style>
</head>
<body>
	<%
	List<Member> members = (List<Member>) request.getAttribute("members");
	%>
	<div id="header">
		<h1>Employee Details</h1>
	</div>
	<div id="content">
		<table border="2px;">
			<tr>
				<th>id</th>
				<th>first</th>
				<th>last</th>
				<th>age</th>
				<th>Delete</th>
				<th>Update</th>
			</tr>

			<%
			for (Member member : members) {
			%>
			<tr>
				<td><%=member.getId()%></td>
				<td><%=member.getFirst()%></td>
				<td><%=member.getLast()%></td>
				<td><%=member.getAge()%></td>
				<td><a href='./deletemember?id=<%=member.getId()%>'>Delete</a></td>
				<td><a href='./updatemember?id=<%=member.getId()%>'>Update</a></td>
			</tr>

			<%
			}
			%>
		</table>
		<a href="./addmember">New Employee</a>
	</div>
</body>
</html>
