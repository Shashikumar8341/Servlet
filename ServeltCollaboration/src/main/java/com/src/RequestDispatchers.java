package com.src;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequestDispatcher")

public class RequestDispatchers extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String n = request.getParameter("userName");
		String p = request.getParameter("userPass");

		if (p.equals("userpass")) {
//	        RequestDispatcher rd=request.getRequestDispatcher("RequestDis2");  
//	        rd.forward(request, response);
			response.sendRedirect("https://mail.google.com/chat/u/0/#chat/space/AAAAh97Pqvg" + n);
		} else {
			out.print("Sorry UserName or Password Error!");
			RequestDispatcher rd = request.getRequestDispatcher("/Request.html");
			rd.include(request, response);

		}
	}
}
