package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Product;

/**
 * @author AshwinKoli
 *
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
