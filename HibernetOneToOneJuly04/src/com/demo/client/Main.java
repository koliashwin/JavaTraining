package com.demo.client;

import com.demo.businesslogic.ProductRepo;
import com.demo.daoImp.InstructorDaoImpl;
import com.demo.daoImp.InstructorDetailsImpl;
import com.demo.entity.Instructor;
import com.demo.entity.InstructorDetails;
import com.demo.entity.Product;

public class Main {

	
	
	public static void main(String[] args) {
		
//		Product record1 = new Product("sam","fair","red");
//		Product record2 = new Product("iphone","good","red");
//		ProductRepo.createProduct(record1);
//		ProductRepo.createProduct(record2);
		
//		ProductRepo.deleteProductByid(4);
//		ProductRepo.viewProduct();
		
//		ProductRepo.updateProduct(3, "MI", "White", "not good");
		
		Instructor recordI1 = new Instructor("one","many","relation@test");
		Instructor recordI11 = new Instructor("test","2","abc@gmail.com");
		InstructorDetails recordI2 = new InstructorDetails("test1", "kuch bhi");
		
		InstructorDetails recordI22 = new InstructorDetails("test2", "try this");
		
		recordI1.setInstructorDetails(recordI2);
		recordI11.setInstructorDetails(recordI2);
		
		
		InstructorDaoImpl s = new InstructorDaoImpl();
		
		s.saveInstructor(recordI1);
		
		
		System.out.println("done");
		
	}

}
