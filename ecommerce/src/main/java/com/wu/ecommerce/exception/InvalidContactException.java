package com.wu.ecommerce.exception;

public class InvalidContactException extends Exception {
	public InvalidContactException(String msg) {
		super(msg);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
}
