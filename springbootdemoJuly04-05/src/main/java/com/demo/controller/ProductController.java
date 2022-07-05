package com.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Brand;
import com.demo.entity.Product;
import com.demo.exceptions.ProductNotfoundException;
import com.demo.globeexceptions.ControllerException;
import com.demo.globeexceptions.ProductExceptionController;
import com.demo.service.ProductService;

/**
 * @author AshwinKoli
 *
 */
@RestController
@RequestMapping(value = "product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	/** to create Product
	 * @param product
	 * @return
	 */
	@PostMapping(value = "/add")
	ResponseEntity<?> addProduct(@RequestBody Product product) {
		
		try {
			Product p = productService.createProduct(product);
//			return new ResponseEntity<Product>(HttpStatus.ACCEPTED);
			return new ResponseEntity<Product>(p, HttpStatus.ACCEPTED);
		} catch(Exception e) {
			ControllerException ce = new ControllerException(701,"something went wrong while creating brand");
			return new ResponseEntity<ControllerException>(ce,HttpStatus.BAD_REQUEST);
		}
		
		
		
	}
	
	
	/**to get list of all products 
	 * @return
	 */
	@GetMapping(value = "/list")
	ResponseEntity<?> listProduct(){
		
		try {
			List<Product> plist =  productService.getListOfProduct();
			return new ResponseEntity<List<Product>>(plist, HttpStatus.OK);
		} catch(Exception e) {
			ControllerException ce = new ControllerException(702,"unable to featch the list");
			return new ResponseEntity<ControllerException>(ce,HttpStatus.BAD_REQUEST);
		}
		
	}
	
	/** to delete specific product
	 * @param del_id
	 * @return
	 */
	@DeleteMapping(value = "/delete/{id}")
	ResponseEntity<?> deleteProduct(@PathVariable("id") Long del_id) {
		
		try {
			
			productService.deleteProductById(del_id);
			return new ResponseEntity<>(HttpStatus.ACCEPTED);
			
		} catch (Exception e) {
			// TODO: handle exception
			ControllerException ce = new ControllerException(704,"something went wrong while deleting brand");
			return new ResponseEntity<ControllerException>(ce,HttpStatus.BAD_REQUEST);
		}
		
	}
	
	/** update product record using is as reference
	 * @param product
	 * @param update_id
	 * @return
	 */
	@PutMapping(value = "/update/{id}")
	ResponseEntity<?> updateProduct(@RequestBody Product product, @PathVariable("id") Long update_id) {
		
		
		try {
			
			Product p = productService.updateProductById(product, update_id);
			return new ResponseEntity<Product>(p, HttpStatus.CREATED);
			
		} catch(Exception e) {
			ControllerException ce = new ControllerException(703,"something went wrong while updating brand");
			return new ResponseEntity<ControllerException>(ce,HttpStatus.BAD_REQUEST);
		}
	}
	
	/**get perticular product record
	 * @param empId
	 * @return
	 */
	@GetMapping(value="/list/{id}")
	ResponseEntity<?> getProduct(@PathVariable("id") Long empId) {
		
		try {
			
			Product p = productService.getProductById(empId);
			return new ResponseEntity<Product>(p, HttpStatus.OK);
			
		}catch(Exception e) {
			ControllerException ce = new ControllerException(704,"something went wrong while getting brand");
			return new ResponseEntity<ControllerException>(ce,HttpStatus.BAD_REQUEST);
		}
	}

}
