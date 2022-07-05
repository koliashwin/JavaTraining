package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Rating;
import com.demo.service.RatingService;


/**
 * @author AshwinKoli
 * this is simple controller without any exception handling 
 */
@RestController
@RequestMapping(value = "rating")
public class RatingController {
	
	@Autowired
	RatingService ratingService;
	
	/**
	 * @param rate
	 * @return
	 */
	@PostMapping(value= "/add")
	Rating addRating(@RequestBody Rating rate) {
		
		return ratingService.createRating(rate);
	}
	
	/**
	 * @param rate
	 * @param id
	 * @return
	 */
	@PutMapping(value = "/update/{id}")
	Rating updateRating(@RequestBody Rating rate, @PathVariable("id") Long id) {
		
		return ratingService.updateRating(rate, id);
		
	}
	
	/**
	 * @param id
	 * @return
	 */
	@GetMapping(value="/list/{id}")
	Rating getRating(@PathVariable("id") Long id) {
		
		return ratingService.getRatingById(id);
	}
	
	/**
	 * @return
	 */
	@GetMapping(value="/list")
	List<Rating> getAllRating(){
		
		return ratingService.getListOfRating();
		
	}
	
	/**
	 * @param id
	 */
	@DeleteMapping(value="/delete/{id}")
	void deleteRating(@PathVariable("id") Long id) {
		
		ratingService.deleteRatingId(id);
	}

}
