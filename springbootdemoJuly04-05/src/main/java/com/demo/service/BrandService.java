package com.demo.service;

import java.util.List;
import java.util.Optional;

import com.demo.entity.Brand;

/**
 * @author AshwinKoli
 *
 */
public interface BrandService {

	Brand createBrand(Brand brand);
	
	Brand updateBrand(Brand brand, long id);
	
	Brand getBrandById(long id);
	
	List<Brand> getListOfBrand();
	
	void deleteBrandId(long id);
}
