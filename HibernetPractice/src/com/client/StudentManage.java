package com.client;

import com.businesslogic.StudentRepo;

public class StudentManage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		StudentRepo.createStudent("Ashwin Koli", "MCA");
//		StudentRepo.createStudent("Sahil", "MCA");
		
//		StudentRepo.deleteStudentById(4);
		
//		StudentRepo.updateStudent(3, "Ashwin Prakash Koli", "SYMCA");
		
		StudentRepo.getStudent(1);
		
		StudentRepo.viewStudentList();
		System.out.println("done");
		System.exit(0);
	}

}
