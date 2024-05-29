package com.src.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		String fastname = request.getParameter("fastname");
		String lastname = request.getParameter("lastname");
		String dateofbirth = request.getParameter("dateofbirth");
		String phonenumber = request.getParameter("phonenumbar");
		String email = request.getParameter("email");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		if ("shashi".equals(fastname))
			if ("kumar".equals(lastname))
				if ("12-11-1998".equals(dateofbirth))
					if ("8341866042".equals(phonenumber))
						if ("shashikumar1998@gmail.com".equals(email)) {
							System.out.println("longin successfully");

						} else {
							System.out.println("longin false");
						}

	}

}
