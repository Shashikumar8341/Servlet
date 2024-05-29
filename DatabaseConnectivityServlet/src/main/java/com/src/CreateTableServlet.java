package com.src;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class CreateTableServlet extends HttpServlet {
	static final String url = ("jdbc:mysql://localhost:3306/gold?useSSL=false");
	static final String user = ("root");
	static final String password = ("root");

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		Connection connection = null;
		Statement statement = null;

		try {
			// Register JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Open a connection
			connection = DriverManager.getConnection(url, user, password);

			// Execute a query to create table
			statement = connection.createStatement();
			String tableName = "dynamic_table";
			String createTableSQL = "CREATE TABLE " + tableName + " (id INT PRIMARY KEY, name VARCHAR(255))";
			statement.executeUpdate(createTableSQL);

			out.println("Table created successfully");
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
			out.println("Table creation failed: " + se.getMessage());
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
			out.println("Table creation failed: " + e.getMessage());
		} finally {
			// Finally block to close resources
			try {
				if (statement != null)
					statement.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
	}
}