package com.src.services;

import java.util.List;

import com.src.dao.ProductDao;
import com.src.dao.ProductImp;
import com.src.dto.Product;

public class ProductServicesImp implements ProductService {
	private ProductDao productDao=new ProductImp();

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletebyid(int idproduct) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product findbyid(int idproduct) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findall() {
		// TODO Auto-generated method stub
		return null;
	}

}
