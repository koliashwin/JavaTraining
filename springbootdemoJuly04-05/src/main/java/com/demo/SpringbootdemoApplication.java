package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author AshwinKoli
 *
 *
 *		life cycle of the project
 *
 *	step0 : system setup(get dependencies, configure database ...)
 *	step1 : create entity layer, map entities to data base using annotations	
 *  step2 : create repository layer and extend them to Jpa repository
 *  step3 : create Service interface layer(with required methods) and implement the logic in ServiceImpl layer
 *  Step4 : create controller layer which will handle all api and ui interaction
 *  
 *  
 *  			
 *  
 */
@SpringBootApplication
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}

}
