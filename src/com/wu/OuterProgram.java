package com.wu;

public class OuterProgram {
	String name = "shravani";
	
	public void outerShow() {
		System.out.println("Outer class.");
	}
	
	class InnerProgram{                     //Inner class
		public void show() {
			System.out.println("Inner class");
		}
	}
	
	static class StaticInnerClass{               //static class: no need to create the object of static class
		public void show() {
			System.out.println("Static inner class");
		}
	}
}
