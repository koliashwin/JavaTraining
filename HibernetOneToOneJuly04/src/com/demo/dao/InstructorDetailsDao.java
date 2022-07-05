package com.demo.dao;

import com.demo.entity.Instructor;
import com.demo.entity.InstructorDetails;

public interface InstructorDetailsDao {
	
	void saveInstructorDetails(InstructorDetails instructorDetail);
	void updateInstructorDetails(InstructorDetails instructorDetail);
	void deleteInstructorDetails(long id);
	Instructor getInstructorDetailsById(long id);
}
