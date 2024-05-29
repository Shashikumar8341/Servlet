package com.src.request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequestDispatcher")
public class Request extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("userName");
		String password=req.getParameter("userPass");
		resp.setContentType("text/html");
		PrintWriter p=resp.getWriter();
		RequestDispatcher rd;
		if (username.equals(username)) {
			rd=req.getRequestDispatcher("/Requests");
			rd.forward(req, resp);
		}else {
			p.println("<h3> loginfiled</h3>");
			rd=req.getRequestDispatcher("/NewFile.jsp");
			rd.forward(req, resp);
		}
	}

}
