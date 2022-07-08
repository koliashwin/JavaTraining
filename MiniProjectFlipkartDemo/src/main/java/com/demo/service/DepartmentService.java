package com.demo.service;

import java.util.List;

import com.demo.entity.Department;

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

public interface DepartmentService {
	
	Department createDepartment(Department dept);
	
	void deleteAllDepartment();
	
	Department updateDepartmentById(Department dept, long id);
	
	void deleteDepartmentById(long id);
	
	List<Department> getListOfDepartment();
	
	Department getDepartmentById(long id);
	
	List<Department> findDepartmentsByName(String name);

}
