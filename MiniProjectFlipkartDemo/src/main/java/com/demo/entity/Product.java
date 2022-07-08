package com.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author AshwinKoli
 *
 */
@Table
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "Product name is required")
	private String product_name;
	
	@NotBlank(message = "department name is required")
	private String dept_name;
	
	@NotBlank(message = "product description is required")
	private String product_desc;
	
	@NotBlank(message = "product cost is required")
	private String product_cost;
	
	@NotNull(message = "product rating is required") @Min(value = 1) @Max(value = 10)
	private int product_rating;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="product_dept", referencedColumnName = "id")
	Department department;
	
	public Product() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_desc() {
		return product_desc;
	}

	public void setProduct_desc(String product_desc) {
		this.product_desc = product_desc;
	}

	public String getProduct_cost() {
		return product_cost;
	}

	public void setProduct_cost(String product_cost) {
		this.product_cost = product_cost;
	}

	public int getProduct_rating() {
		return product_rating;
	}

	public void setProduct_rating(int product_rating) {
		this.product_rating = product_rating;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public Product(String product_name, String dept_name, String product_desc, String product_cost, int product_rating,
			Department department) {
		super();
		this.product_name = product_name;
		this.dept_name = dept_name;
		this.product_desc = product_desc;
		this.product_cost = product_cost;
		this.product_rating = product_rating;
		this.department = department;
	}
	
	

	
	
	
	
	
}
