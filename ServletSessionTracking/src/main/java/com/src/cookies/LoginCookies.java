package com.src.cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginCookies extends HttpServlet {

	/**
	 * 
	 */

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		Cookie ck = new Cookie("name", name);
		Cookie c = new Cookie("pass", pass);
		resp.addCookie(c);
		resp.addCookie(ck);
		resp.sendRedirect("logout");
	}
}
