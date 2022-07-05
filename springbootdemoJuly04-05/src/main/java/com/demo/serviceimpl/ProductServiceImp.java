package com.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Product;
import com.demo.repository.ProductRepository;
import com.demo.service.ProductService;

/**
 * @author AshwinKoli
 *
 */
@Service
public class ProductServiceImp implements ProductService{

	@Autowired
	ProductRepository productRepo;
	
	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		
		Product p = productRepo.save(product);
		
		return p;
	}

	@Override
	public Product updateProductById(Product product, long id) {
		// TODO Auto-generated method stub
		
		Product p = productRepo.findById(id).get();
		p.setProductname(product.getProductname());
		p.setBrand(product.getBrand());
		p.setColor(product.getColor());
		p.setOs(product.getOs());
		productRepo.save(p);
		
		return p;
	}

	

	@Override
	public List<Product> getListOfProduct() {
		// TODO Auto-generated method stub
		
		List<Product> list = productRepo.findAll();
		return list;
	}

	@Override
	public void deleteProductById(long id) {
		// TODO Auto-generated method stub
		productRepo.deleteById(id);
	}

	@Override
	public void deleteList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product getProductById(long id) {
		// TODO Auto-generated method stub
		
		return productRepo.findById(id).get();
	}

}
