package com.demo.service;

import java.util.List;

import com.demo.entity.Rating;

/**
 * @author AshwinKoli
 *
 */
public interface RatingService {

	Rating createRating(Rating rate);
	
	Rating updateRating(Rating rate, long id);
	
	Rating getRatingById(long id);
	
	List<Rating> getListOfRating();
	
	void deleteRatingId(long id);
}
