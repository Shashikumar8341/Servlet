package com.src.services;

import java.util.List;

import com.src.dto.Product;

public interface ProductService {
	void add(Product product);

	void update(Product product);

	void deletebyid(int idproduct);

	Product findbyid(int idproduct);

	List<Product> findall();
}
