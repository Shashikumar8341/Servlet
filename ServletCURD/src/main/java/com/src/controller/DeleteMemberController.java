package com.src.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.src.service.MemberServiceImpl;
import com.src.service.MemberServices;

@WebServlet("/deletemember")
public class DeleteMemberController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		MemberServices memberServices = new MemberServiceImpl();
		int id = Integer.parseInt(req.getParameter("id"));
		memberServices.deleteById(id);
		req.getRequestDispatcher("/FindAllMember").forward(req, resp);
	}
}
