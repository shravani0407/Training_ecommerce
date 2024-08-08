package com.wu;

public class Employee {
	double salary;
	String firstName, lastName;
	int EmplyeeID;
	static String companyName = "WesternUnion";
	static int count = 0;
	
	public Employee() {
		System.out.println("1 Object Created");
		count++;
	}
	
	public Employee(int EmployeeID, String FirstName, String LastName, float salary) {
		this.EmplyeeID = EmployeeID;
		this.firstName = FirstName;
		this.lastName = LastName;
		this.salary = salary;
		count++;
	}
	
	public Employee(int EmployeeID, String FirstName) {
		this.EmplyeeID = EmployeeID;
		this.firstName = FirstName;
		count++;
	}
	
	public double totalSalry() {
		double hra = salary*1f;
		double da = salary*2f;
		return (salary+hra+da);
	}
	
	public void increment() {
		salary = salary+(salary*0.1);
	}
	
	public void updateFirstName(String FirstName) {
		this.firstName = FirstName;
	}
	
	public void updateLastName(String LastName) {
		this.lastName = LastName;
	}
	
	public void display() {
		System.out.println("EmployeeID is " + EmplyeeID);
		System.out.println("first Name is " + firstName + " and lastname is " + lastName);
		System.out.println("company name is "+ Employee.companyName);
	}

}
