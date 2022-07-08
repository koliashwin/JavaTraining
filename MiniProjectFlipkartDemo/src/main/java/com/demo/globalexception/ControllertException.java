package com.demo.globalexception;

/**
 * @author AshwinKoli
 *
 */
public class ControllertException extends RuntimeException {

	private long errorCode;
	private String errorMsg;
	public long getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(long errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public ControllertException(long errorCode, String errorMsg) {
		super();
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}
	
	public ControllertException() {
		
	}
}
