package com.demo.dao;

import com.demo.entity.Instructor;

public interface InstructorDao {
	
	void saveInstructor(Instructor instructor);
	
	void updateInstructor(Instructor instructor);
	
	void deleteInstructor(long id);
	
	Instructor getInstructorById(long id);

}
