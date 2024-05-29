package com.src.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.src.dto.Product;
import com.src.services.ProductService;
import com.src.services.ProductServicesImp;

@WebServlet("/UpdateProducts")
public class UpdateProduct extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3352836813977767496L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ProductService productService = new ProductServicesImp();
		int id = Integer.parseInt(req.getParameter("id"));

		Product p = productService.findbyid(id);
		req.setAttribute("Product", p);
		req.getRequestDispatcher("/update.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProductService productService = new ProductServicesImp();
		int idproduct = Integer.parseInt(request.getParameter("idproduct"));

		String p_name = request.getParameter("p_name");
		String p_packket = request.getParameter("p_packket");
		String p_address = request.getParameter("p_address");
		String dates = request.getParameter("dates");

		Product p = new Product(idproduct, p_name, p_packket, p_address, dates);

		productService.update(p);

		request.getRequestDispatcher("/FindAll").forward(request, response);
	}
}
