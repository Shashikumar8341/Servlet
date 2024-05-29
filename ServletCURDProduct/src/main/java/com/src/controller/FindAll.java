package com.src.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.src.dto.Product;
import com.src.services.ProductService;
import com.src.services.ProductServicesImp;

@WebServlet("/FindAlls")
public class FindAll extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2922231165785823888L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ProductService productService = new ProductServicesImp();
		List<Product> p = productService.findall();
		req.setAttribute("product", p);
		req.getRequestDispatcher("/FindAll.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
