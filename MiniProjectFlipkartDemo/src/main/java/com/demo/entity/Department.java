package com.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/**
 * @author AshwinKoli
 *
 */
@Table
@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "department name required")
	private String dept_name;
	
	@NotBlank(message = "department description required")
	private String dept_disc;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy = "department", cascade = CascadeType.ALL)
	List<Product> products;

	
	public Department() {
		
	}

	public Department(String dept_name, String dept_disc, List<Product> products) {
		super();
		this.dept_name = dept_name;
		this.dept_disc = dept_disc;
		this.products = products;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public String getDept_disc() {
		return dept_disc;
	}

	public void setDept_disc(String dept_disc) {
		this.dept_disc = dept_disc;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	

}
