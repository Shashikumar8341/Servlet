package com.src.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.src.dto.Member;
import com.src.service.MemberServiceImpl;
import com.src.service.MemberServices;

@WebServlet("/updatemember")
public class UpdateMembercontroller extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MemberServices memberServices = new MemberServiceImpl();
		int id = Integer.parseInt(req.getParameter("id"));

		Member member = memberServices.findById(id);
		req.setAttribute("member", member);
		req.getRequestDispatcher("/update.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MemberServices memberServices = new MemberServiceImpl();
		int id = Integer.parseInt(request.getParameter("id"));

		String fist = request.getParameter("first");
		String last = request.getParameter("last");
		int age = Integer.parseInt(request.getParameter("age"));
		Member m = new Member(id, fist, last, age);

		memberServices.update(m);

		request.getRequestDispatcher("/FindAllMember").forward(request, response);
	}
}
