package com.wu;

public class Shape {
	
	public int area(int side) {
		return (side*side);
	}
	public int area(int length, int breadth) {
		return (length*breadth);
	}
	public double area(double radius) {
		return (3.14*radius*radius);
	}

}
