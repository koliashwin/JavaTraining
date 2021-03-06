package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.entity.Product;

/**
 * @author AshwinKoli
 *
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

	/**
	 * @param name
	 * @return
	 */
	@Query(value = "SELECT p FROM Product p WHERE p.product_name =?1")
	List<Product> getProductByName(String name);
}
