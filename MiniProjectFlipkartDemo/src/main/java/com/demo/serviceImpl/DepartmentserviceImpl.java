package com.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Department;
import com.demo.repository.DepartmentRepository;
import com.demo.service.DepartmentService;

/**
 * @author AshwinKoli
 *
 */
@Service
public class DepartmentserviceImpl implements DepartmentService{

	@Autowired
	DepartmentRepository deptRepo;

	@Override
	public Department createDepartment(Department dept) {
		// TODO Auto-generated method stub
		
		return deptRepo.save(dept);
	}

	@Override
	public void deleteAllDepartment() {
		// TODO Auto-generated method stub
		
		deptRepo.deleteAll();
	}

	@Override
	public Department updateDepartmentById(Department dept, long id) {
		// TODO Auto-generated method stub
		Department d = deptRepo.findById(id).get();
		d.setDept_name(dept.getDept_name());
		d.setDept_disc(dept.getDept_disc());
		d.setProducts(dept.getProducts());
		deptRepo.save(d);
		return d;
	}

	@Override
	public void deleteDepartmentById(long id) {
		// TODO Auto-generated method stub
		
		deptRepo.deleteById(id);
	}

	@Override
	public List<Department> getListOfDepartment() {
		// TODO Auto-generated method stub
		return deptRepo.findAll();
	}

	@Override
	public Department getDepartmentById(long id) {
		// TODO Auto-generated method stub
		return deptRepo.findById(id).get();
	}

	@Override
	public List<Department> findDepartmentsByName(String name) {
		// TODO Auto-generated method stub
		return deptRepo.findDepartmentsByName(name);
	}
	
	
}
