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

import com.demo.entity.Department;
import com.demo.entity.Product;
import com.demo.globalexception.ControllertException;
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
	
	/** create 
	 * @param product
	 * @return
	 */
	@PostMapping(value = "/create")
	ResponseEntity<?> addNewProduct(@Valid @RequestBody Product product) {
		
		try {
			Product p = productService.createProduct(product);
			return new ResponseEntity<Product>(p, HttpStatus.ACCEPTED);
		} catch (Exception e) {
			// TODO: handle exception
			ControllertException ce = new ControllertException(701, "something went wrong while creating Product"+e.getMessage());
			return new ResponseEntity<ControllertException>(ce, HttpStatus.BAD_REQUEST);
		}
		
	}
	
	/** delete all
	 * @return
	 */
	@DeleteMapping(value = "/delete")
	ResponseEntity<?> deleteAllProducts() {
		try {
			productService.deleteAllProducts();
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			ControllertException ce = new ControllertException(702, "something went wrong while deleting Product list"+e.getMessage());
			return new ResponseEntity<ControllertException>(ce, HttpStatus.BAD_REQUEST);
		}
		
	}
	
	/** update by id
	 * @param product
	 * @param id
	 * @return
	 */
	@PutMapping(value = "/update/{id}")
	ResponseEntity<?> updateProductById(@Valid @RequestBody Product product, @PathVariable("id") long id){
		try {
			Product p = productService.updateProductById(product, id);
			return new ResponseEntity<Product>(p, HttpStatus.ACCEPTED);
		} catch (Exception e) {
			// TODO: handle exception
			ControllertException ce = new ControllertException(703, "something went wrong while udating product "+e.getMessage());
			return new ResponseEntity<ControllertException>(ce, HttpStatus.BAD_REQUEST);
		}
	}
	
	/** delete by id
	 * @param id
	 * @return
	 */
	@DeleteMapping(value = "/delete/{id}")
	ResponseEntity<?> deleteProductById(@PathVariable("id") long id) {
		
		try {
			productService.deleteProductById(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			ControllertException ce = new ControllertException(704, "something went wrong while deleteing product record"+e.getMessage());
			return new ResponseEntity<ControllertException>(ce, HttpStatus.BAD_REQUEST);
		}
	}
	
	/** get list
	 * @return
	 */
	@GetMapping(value = "/list")
	ResponseEntity<?> getAllProducts() {
		try {
			List<Product> Plist = productService.getListOfProducts();
			return new ResponseEntity<List<Product>>(Plist, HttpStatus.ACCEPTED);
		} catch (Exception e) {
			// TODO: handle exception
			ControllertException ce = new ControllertException(706, "something went wrong while fetching product list"+e.getMessage());
			return new ResponseEntity<ControllertException>(ce, HttpStatus.BAD_REQUEST);
		}
		
	}
	
	/** get element by id
	 * @param id
	 * @return
	 */
	@GetMapping(value = "/list/{id}")
	ResponseEntity<?> getProductsById(@PathVariable("id") long id) {
		try {
			Product p = productService.getProductById(id);
			return new ResponseEntity<Product>(p, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			ControllertException ce = new ControllertException(705, "something went wrong while fetching department recourd byu list"+e.getMessage());
			return new ResponseEntity<ControllertException>(ce, HttpStatus.BAD_REQUEST);
		}
		
	}
	
	/** get list of elements by name
	 * @param name
	 * @return
	 */
	@GetMapping(value = "/list/name={name}")
	ResponseEntity<?> getProductsByName(@PathVariable("name") String name) {
		try {
			List<Product> pList = productService.getProductByName(name);
			return new ResponseEntity<List<Product>>(pList, HttpStatus.OK);
		}catch (Exception e) {
			// TODO: handle exception
			ControllertException ce = new ControllertException(707, "something went wrong while fetching product record by name"+e.getMessage());
			return new ResponseEntity<ControllertException>(ce, HttpStatus.BAD_REQUEST);
		}
		
	}

}
