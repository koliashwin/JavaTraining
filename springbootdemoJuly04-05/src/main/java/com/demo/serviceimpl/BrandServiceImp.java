package com.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Brand;
import com.demo.repository.BrandRepository;
import com.demo.service.BrandService;

/**
 * @author AshwinKoli
 *
 */
@Service
public class BrandServiceImp implements BrandService{

	@Autowired
	BrandRepository brandRepo;
	
	@Override
	public Brand createBrand(Brand brand) {
		// TODO Auto-generated method stub
		Brand b = brandRepo.save(brand);
		
		return b;
	}

	@Override
	public Brand updateBrand(Brand brand, long id) {
		// TODO Auto-generated method stub
		Brand b = brandRepo.findById(id).get();
		b.setBrandname(brand.getBrandname());
		b.setDescri(brand.getDescri());
		brandRepo.save(b);
		return b;
	}

	@Override
	public Brand getBrandById(long id) {
		// TODO Auto-generated method stub
		Optional<Brand> b = brandRepo.findById(id);
		return b.get();
	}

	@Override
	public List<Brand> getListOfBrand() {
		// TODO Auto-generated method stub
		List<Brand> blist = brandRepo.findAll();
		return blist;
	}

	@Override
	public void deleteBrandId(long id) {
		// TODO Auto-generated method stub
		brandRepo.deleteById(id);
	}

}
