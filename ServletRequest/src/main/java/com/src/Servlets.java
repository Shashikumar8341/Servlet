package com.src;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class Servlets implements Servlet {

	public void destroy() {
		System.out.println("welcome to destroy");
	}

	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("welcome to init");

	}

	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("welcome to service");
//		arg1.setContentType("text.html");
//		PrintWriter out=arg1.getWriter();
//		out.println("welcome to database");

		String username = arg0.getParameter("username");
		String password = arg0.getParameter("password");
		arg1.setContentType("text/html");
		PrintWriter out = arg1.getWriter();
		if ("sai".equals(username)) {
			out.println("successfully login");
		} else {
			out.println("login failed");

		}

	}

	public ServletConfig getServletConfig() {
		return null;
	}

	public String getServletInfo() {
		return null;
	}

}
