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
import com.demo.globalexception.ControllertException;
import com.demo.service.DepartmentService;

/**
 * @author AshwinKoli
 *
 */
@RestController
@RequestMapping(value="department")
public class DepartmentController {
	
	@Autowired
	DepartmentService deptService;
	
	/** create 
	 * @param dept
	 * @return
	 */
	@PostMapping(value="/create")
	ResponseEntity<?> addNewDepartment(@Valid @RequestBody Department dept) {
		try {
			Department d = deptService.createDepartment(dept);
			return new ResponseEntity<Department>(d, HttpStatus.ACCEPTED) ;
		} catch (Exception e) {
			// TODO: handle exception
			ControllertException ce = new ControllertException(601, "something went wrong while creating department"+e.getMessage());
			return new ResponseEntity<ControllertException>(ce, HttpStatus.BAD_REQUEST);
		}
		
	}
	 
	/** delete All
	 * @return
	 */
	@DeleteMapping(value="/delete")
	ResponseEntity<?> deleteAllDepartments() {
		try {
			deptService.deleteAllDepartment();
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			ControllertException ce = new ControllertException(602, "something went wrong while deleting department list"+e.getMessage());
			return new ResponseEntity<ControllertException>(ce, HttpStatus.BAD_REQUEST);
		}
		
	}
	
	/** update by id
	 * @param dept
	 * @param id
	 * @return
	 */
	@PutMapping(value="/update/{id}")
	ResponseEntity<?> updateDepartmentById(@Valid @RequestBody Department dept, @PathVariable("id") long id) {
		try {
			Department d =deptService.updateDepartmentById(dept, id);
			return new ResponseEntity<Department>(d, HttpStatus.ACCEPTED); 
		} catch (Exception e) {
			// TODO: handle exception
			ControllertException ce = new ControllertException(603, "something went wrong while udating department "+e.getMessage());
			return new ResponseEntity<ControllertException>(ce, HttpStatus.BAD_REQUEST);
		}
		
	} 
	
	/** delete by id
	 * @param id
	 * @return
	 */
	@DeleteMapping(value="/delete/{id}")
	ResponseEntity<?> deleteDepartmentById(@PathVariable("id") long id) {
		try {
			deptService.deleteDepartmentById(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			ControllertException ce = new ControllertException(604, "something went wrong while deleteing department record"+e.getMessage());
			return new ResponseEntity<ControllertException>(ce, HttpStatus.BAD_REQUEST);
		}
		
	}
	
	/** get by id
	 * @param id
	 * @return
	 */
	@GetMapping(value="/list/{id}")
	ResponseEntity<?> getDeptById(@PathVariable("id") long id){
		try {
			Department d = deptService.getDepartmentById(id);
			return new ResponseEntity<Department>(d, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			ControllertException ce = new ControllertException(605, "something went wrong while fetching department recourd byu list"+e.getMessage());
			return new ResponseEntity<ControllertException>(ce, HttpStatus.BAD_REQUEST);
		}
	}
	
	/** get all
	 * @return
	 */
	@GetMapping(value="/list")
	ResponseEntity<?> getAllDepartments(){
		try {
			List<Department> listD = deptService.getListOfDepartment();
			return new ResponseEntity<List<Department>>(listD, HttpStatus.OK);
		}catch (Exception e) {
			// TODO: handle exception
			ControllertException ce = new ControllertException(606, "something went wrong while fetching department list"+e.getMessage());
			return new ResponseEntity<ControllertException>(ce, HttpStatus.BAD_REQUEST);
		}
		
	}
	
	/** get by name
	 * @param name
	 * @return
	 */
	@GetMapping(value="/list/name={name}")
	ResponseEntity<?> getDepartmentByName(@PathVariable("name") String name) {
		try {
			List<Department> listD = deptService.findDepartmentsByName(name);
			return new ResponseEntity<List<Department>>(listD, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			ControllertException ce = new ControllertException(607, "something went wrong while fetching department record by name"+e.getMessage());
			return new ResponseEntity<ControllertException>(ce, HttpStatus.BAD_REQUEST);
		}
		
	}

}
