package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.entity.Department;

/**
 * @author AshwinKoli
 *
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

	/**
	 * @param name
	 * @return
	 */
	@Query("SELECT d FROM Department d WHERE d.dept_name=?1")
	List<Department> findDepartmentsByName(String name);
}
