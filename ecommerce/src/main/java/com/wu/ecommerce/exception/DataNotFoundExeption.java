package com.wu.ecommerce.exception;

public class DataNotFoundExeption extends Exception {
	public DataNotFoundExeption(String msg) {
		super(msg);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}
}
