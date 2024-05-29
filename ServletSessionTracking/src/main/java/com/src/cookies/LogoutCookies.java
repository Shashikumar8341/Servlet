package com.src.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logout")
public class LogoutCookies extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	Cookie[] ck=req.getCookies();
	if (ck==null) {
		resp.sendRedirect("loginpro.jsp");
	}else {
		resp.setContentType("text/html");
		PrintWriter p = resp.getWriter();
		
		p.print("<h1> name="+ck[0].getValue()+"</h1>");
		p.print("<h1> pass="+ck[1].getValue()+"</h1>");
		p.println("<a href='Logout'>logout</a>");
	
	}
}
}
