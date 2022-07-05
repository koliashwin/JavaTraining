package com.demo.globeexceptions;

/**
 * @author AshwinKoli
 *
 */
public class ControllerException extends RuntimeException{

	private long errorCode;
	private String errorMessage;
	public long getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(long errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public ControllerException(long errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}
	
	public ControllerException() {
		
	}
	
}
