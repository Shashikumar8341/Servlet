package com.src.dao;

import com.src.dto.Product;

public class ProductTest {
public static void main(String[] args) {
	ProductDao productDao=new ProductImp();
	Product product=new Product(4, "shashi", "bull", "kurnool", "1998-02-25");
	productDao.add(product);
	System.out.println("dfgh");
	productDao.deletebyid(4);
}
}
