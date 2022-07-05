package com.demo.exceptions;

public class ProductNotfoundException extends RuntimeException{

	public ProductNotfoundException(String exceptionMsg){
		super(String.format(" your product not found"+exceptionMsg));
	}
}
