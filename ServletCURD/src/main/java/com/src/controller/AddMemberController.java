package com.src.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.src.dao.MemberDAOImpl;
import com.src.dto.Member;
import com.src.service.MemberServiceImpl;
import com.src.service.MemberServices;

@WebServlet("/addmember")
public class AddMemberController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MemberServices memberServices=new MemberServiceImpl();
		 int id=Integer.parseInt(req.getParameter("id"));
		 String first=req.getParameter("first");
		 String last=req.getParameter("last");
		 int age=Integer.parseInt(req.getParameter("age"));
		 
		 Member member=new Member(id,first,last,age);
		 memberServices.add(member);
		req.getRequestDispatcher("/FindAll.jsp").forward(req, resp);
		 }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/AddAll.jsp").forward(request, response);
	}

}
