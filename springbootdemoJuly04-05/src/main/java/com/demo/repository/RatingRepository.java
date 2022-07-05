package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Rating;

/**
 * @author AshwinKoli
 *
 */
@Repository
public interface RatingRepository extends JpaRepository<Rating, Long>{

}
