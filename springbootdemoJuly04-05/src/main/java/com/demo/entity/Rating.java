package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Rating {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String ratingdetails;
	private String gotrating;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRatingdetails() {
		return ratingdetails;
	}
	public void setRatingdetails(String ratingdetails) {
		this.ratingdetails = ratingdetails;
	}
	public String getGotrating() {
		return gotrating;
	}
	public void setGotrating(String gotrating) {
		this.gotrating = gotrating;
	}
	
	public Rating(String ratingdetails, String gotrating) {
		super();
		this.ratingdetails = ratingdetails;
		this.gotrating = gotrating;
	}
	
	public Rating() {
		
	}
	
	
}
