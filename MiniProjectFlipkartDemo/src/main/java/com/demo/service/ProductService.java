package com.demo.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.demo.entity.Product;

/**
ADD
DELETE ALL
UPDATE WITHID
DELETE BYID
GET ALL
GET BY ID
Search by name
 *
 */

public interface ProductService {

	Product createProduct(Product product);
	
	void deleteAllProducts();
	
	Product updateProductById(Product product, long id);
	
	void deleteProductById(long id);
	
	List<Product> getListOfProducts();
	
	Product getProductById(long id);
	
	List<Product> getProductByName(String name);
}

