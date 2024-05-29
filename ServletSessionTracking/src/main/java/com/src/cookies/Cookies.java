package com.src.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/cookie")
public class Cookies extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest raeq, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter p = resp.getWriter();
		String name = raeq.getParameter("name");
		p.println(name);
		p.print("<form action='login'>");
		p.print("<input type='submit' value='click'>");
		p.print("</form>");
		p.close();
		
	}
}
