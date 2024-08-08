package com.wu.ecommerce.exception;

public class IdNotFoundExeption extends Exception {
	public IdNotFoundExeption(String msg) {
		super(msg);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
}
