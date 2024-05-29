package com.src.dao;

import java.util.List;

import com.src.dto.Product;

public interface ProductDao {
	void add(Product product);

	void update(Product product);

	void deletebyid(int idproduct);

	Product findbyid(int idproduct);

	List<Product> findall();
}
