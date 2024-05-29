package com.src.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.src.services.ProductService;
import com.src.services.ProductServicesImp;

@WebServlet("/Deleteproducts")
public class Deleteproduct extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4639015979710196846L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ProductService productService = new ProductServicesImp();
		int idproduct = Integer.parseInt(req.getParameter("idproduct"));
		productService.deletebyid(idproduct);
		req.getRequestDispatcher("/FindAll").forward(req, resp);

	}
}
