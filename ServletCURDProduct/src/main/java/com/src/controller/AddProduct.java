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
@WebServlet("/Addproducts")
public class AddProduct extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5058207355641500147L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ProductService productService = new ProductServicesImp();
		int idproduct = Integer.parseInt(req.getParameter("id"));
		String p_name = req.getParameter("p_name");
		String p_packket = req.getParameter("p_packket");
		String p_address
		= req.getParameter("p_address");
		String dates = req.getParameter("dates");
		Product product = new Product(idproduct, p_name, p_packket, p_address, dates);
		productService.add(product);
		req.getRequestDispatcher("/FindAll.jsp").forward(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/Add.jsp").forward(req, resp);
	}
}
