package com.demo.service;

import java.util.List;
import java.util.Optional;

import com.demo.entity.Product;

/**
 * @author AshwinKoli
 *
 */
public interface ProductService {
	
	Product createProduct(Product product);
	
	Product updateProductById(Product product, long id);
	
	Product getProductById(long id);
	
	List<Product> getListOfProduct();
	
	void deleteProductById(long id);
	
	void deleteList();
//	
//	Product Otplogin(int number);

}
