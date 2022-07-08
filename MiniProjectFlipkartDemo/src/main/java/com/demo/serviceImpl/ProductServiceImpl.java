package com.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Department;
import com.demo.entity.Product;
import com.demo.repository.DepartmentRepository;
import com.demo.repository.ProductRepository;
import com.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepo;
	
	@Autowired
	DepartmentRepository deptRepo;

	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		
		
		return productRepo.save(product);
		 
	}

	@Override
	public void deleteAllProducts() {
		// TODO Auto-generated method stub
		productRepo.deleteAll();
	}

	@Override
	public Product updateProductById(Product product, long id) {
		// TODO Auto-generated method stub
		Product p = productRepo.findById(id).get();
		p.setProduct_name(product.getProduct_name());
		p.setProduct_desc(product.getProduct_desc());
		p.setProduct_cost(product.getProduct_cost());
		p.setProduct_rating(product.getProduct_rating());
		p.setDept_name(product.getDept_name());
//		p.setDepartment(product.getDepartment());
		productRepo.save(p);
		return p;
	}

	@Override
	public void deleteProductById(long id) {
		// TODO Auto-generated method stub
		productRepo.deleteById(id);
	}

	@Override
	public List<Product> getListOfProducts() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

	@Override
	public Product getProductById(long id) {
		// TODO Auto-generated method stub
		return productRepo.findById(id).get();
	}

	@Override
	public List<Product> getProductByName(String name) {
		// TODO Auto-generated method stub
		return productRepo.getProductByName(name);
	}

	
	

	

}
