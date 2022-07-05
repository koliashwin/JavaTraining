package com.demo.controller;

import java.util.List;

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
import com.demo.globeexceptions.ControllerException;
import com.demo.service.BrandService;

/**
 * @author AshwinKoli
 *
 */
@RestController
@RequestMapping(value = "brand")
public class BrandController {
	
	@Autowired
	BrandService brandService;
	
	/**to create brand
	 * @param brand
	 * @return
	 */
	@PostMapping(value = "/add")
	ResponseEntity<?> addBrand(@RequestBody Brand brand) {
		
		try {
			Brand b = brandService.createBrand(brand);
			return new ResponseEntity<Brand>(b, HttpStatus.CREATED);
		} catch(Exception e) {
			ControllerException ce = new ControllerException(601,"something went wrong while creating brand");
			return new ResponseEntity<ControllerException>(ce,HttpStatus.BAD_REQUEST);
		}
		
	}
	
	/**to get list of all brands
	 * @param brand
	 * @return
	 */
	@GetMapping(value="/list")
	ResponseEntity<?> listBrand(@RequestBody Brand brand){
		try {
			List<Brand> b = brandService.getListOfBrand();
			return new ResponseEntity<List<Brand>>(b, HttpStatus.OK);
		}catch(Exception e) {
			ControllerException ce = new ControllerException(602,"unable to featch the list");
			return new ResponseEntity<ControllerException>(ce,HttpStatus.BAD_REQUEST);
		}
		
	}
	
	/** to update certain brand record using id as reference
	 * @param brand
	 * @param b_id
	 * @return
	 */
	@PutMapping(value="/update/{id}")
	ResponseEntity<?> updateBrand(@RequestBody Brand brand, @PathVariable("id") Long b_id) {
		try {
			Brand b = brandService.updateBrand(brand, b_id);
			return new ResponseEntity<Brand>(b, HttpStatus.CREATED);
		} catch(Exception e) {
			ControllerException ce = new ControllerException(603,"something went wrong while updating brand");
			return new ResponseEntity<ControllerException>(ce,HttpStatus.BAD_REQUEST);
		}
		
		
	}
	
	/** get perticular record by id
	 * @param get_id
	 * @return
	 */
	@GetMapping(value="/list/{id}")
	ResponseEntity<?> getBrand(@PathVariable("id") Long get_id) {
		
		try {
			
			Brand b = brandService.getBrandById(get_id);
			return new ResponseEntity<Brand>(b, HttpStatus.OK);
			
		}catch(Exception e) {
			ControllerException ce = new ControllerException(604,"something went wrong while getting brand");
			return new ResponseEntity<ControllerException>(ce,HttpStatus.BAD_REQUEST);
		}
		
	}
	
	/** Delete by id
	 * @param del_id
	 * @return
	 */
	@DeleteMapping(value="/delete/{id}")
	ResponseEntity<?> deleteBrand(@PathVariable("id") Long del_id) {
		try {
			
			brandService.deleteBrandId(del_id);
			return new ResponseEntity<>(HttpStatus.ACCEPTED);
			
		} catch (Exception e) {
			// TODO: handle exception
			ControllerException ce = new ControllerException(604,"something went wrong while deleting brand");
			return new ResponseEntity<ControllerException>(ce,HttpStatus.BAD_REQUEST);
		}
		
	}
	

}
