package com.wu.ecommerce.exception;

public class UserNotFoundException extends Exception{
	public UserNotFoundException(String msg) {
		super(msg);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
}
