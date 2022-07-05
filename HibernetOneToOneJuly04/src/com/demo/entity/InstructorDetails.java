package com.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table
@Entity
public class InstructorDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String youtubechanner;
	private String hobby;
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "instructor_id")
//	Instructor Instructor;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getYoutubechanner() {
		return youtubechanner;
	}
	public void setYoutubechanner(String youtubechanner) {
		this.youtubechanner = youtubechanner;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public InstructorDetails(String youtubechanner, String hobby) {
		super();
		this.youtubechanner = youtubechanner;
		this.hobby = hobby;
	}
	
	

}
