package com.src.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.src.dto.Member;
import com.src.service.MemberServiceImpl;
import com.src.service.MemberServices;

/**
 * Servlet implementation class FindAllMemberController
 */
@WebServlet("/FindAllMember")
public class FindAllMemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MemberServices memberServices = new MemberServiceImpl();
		List<Member> members = memberServices.findAll();
		request.setAttribute("members", members);
		request.getRequestDispatcher("/FindAll.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
