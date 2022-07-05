package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

/**
 * @author AshwinKoli
 *
 */
@Table
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotEmpty(message = "brand should not be empty")
	private String brand;
	
	@NotEmpty(message = "productname should not be empty")
	private String productname;
	
	@NotEmpty(message = "color should not be empty")
	private String  color;
	
	@NotEmpty(message = "os should not be empty")
	private String os;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	
	public Product(String brand, String productname, String color, String os) {
		super();
		this.brand = brand;
		this.productname = productname;
		this.color = color;
		this.os = os;
	}
	
	public Product() {
		
	}
	
	
}
