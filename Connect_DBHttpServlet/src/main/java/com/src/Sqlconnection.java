package com.src;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sqlconnection
 */
@WebServlet("/Sqlconnection")
public class Sqlconnection extends HttpServlet {
	static final String url = ("jdbc:mysql://localhost:3306/gold?useSSL=false");
	static final String user = ("root");
	static final String password = ("root");
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Sqlconnection() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));
		String first = request.getParameter("first");
		String last = request.getParameter("last");
		int age = Integer.parseInt(request.getParameter("age"));
		out.println(id + ":" + first + ":" + last + ":" + age);
		System.out.println("success");

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);
			preparedStatement = connection.prepareStatement("insert into member values(?,?,?,?)");
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, first);
			preparedStatement.setString(3, last);
			preparedStatement.setInt(4, age);
			preparedStatement.executeUpdate();
		} catch (Exception e) {

		} finally {
			try {
				connection.close();
				preparedStatement.close();
			} catch (Exception e2) {
			}
		}

	}

}
