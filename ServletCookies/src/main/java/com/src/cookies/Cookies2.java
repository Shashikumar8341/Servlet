package com.src.cookies;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/cookie2")
public class Cookies2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
resp.setContentType("text/html");
	PrintWriter p=resp.getWriter();
	String name=null;
	Cookie c[]=req.getCookies();
	for (Cookie cookie : c) {
		if (cookie.getName().equals("username")) {
			name = cookie.getValue();
			break;
		}
	}
	HttpSession session = req.getSession();
	name = (String) session.getAttribute("name");
	p.println("This is " + name + " profile");
	}
}