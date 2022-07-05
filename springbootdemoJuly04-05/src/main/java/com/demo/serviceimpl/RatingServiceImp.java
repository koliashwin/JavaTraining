package com.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Rating;
import com.demo.repository.RatingRepository;
import com.demo.service.RatingService;

/**
 * @author AshwinKoli
 *
 */
@Service
public class RatingServiceImp implements RatingService{
	
	@Autowired
	RatingRepository ratingRepo;

	@Override
	public Rating createRating(Rating rate) {
		// TODO Auto-generated method stub
		Rating r = ratingRepo.save(rate);
		return r;
	}

	@Override
	public Rating updateRating(Rating rate, long id) {
		// TODO Auto-generated method stub
		Rating r = ratingRepo.findById(id).get();
		r.setGotrating(rate.getGotrating());
		r.setRatingdetails(rate.getRatingdetails());
		ratingRepo.save(r);
		return r;
	}

	@Override
	public Rating getRatingById(long id) {
		// TODO Auto-generated method stub
		
		return ratingRepo.findById(id).get();
	}

	@Override
	public List<Rating> getListOfRating() {
		// TODO Auto-generated method stub
		
		return ratingRepo.findAll();
	}

	@Override
	public void deleteRatingId(long id) {
		// TODO Auto-generated method stub
		
		ratingRepo.deleteById(id);
		
	}

}
