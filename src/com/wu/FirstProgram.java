package com.wu;

public class FirstProgram {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee(12, "shravani", "parsewar", 50000);
//		System.out.println(emp2.firstName);
//		System.out.println(emp2.lastName);
//		emp2.updateFirstName("satvik");
//		System.out.println(emp2.firstName);
//		System.out.println(emp2.salary);
//		emp2.increment();
//		System.out.println(emp2.salary);
//		emp2.display();
//		System.out.println(Employee.count);
//		
//		
//		Shape shape1 = new Shape();
//		System.out.println(shape1.area(0.5));
//		System.out.println(shape1.area(3));
//		System.out.println(shape1.area(2,3));
//		
//		
//		OuterProgram outer = new OuterProgram();
//		System.out.println(outer.name);
//		outer.outerShow();
//		
//		OuterProgram.InnerProgram inner = new OuterProgram().new InnerProgram();
//		inner.show();
//		
//		OuterProgram.StaticInnerClass staticInner= new OuterProgram.StaticInnerClass();
//		staticInner.show();
		
		Manager manager1 = new Manager();
		System.out.println(Employee.count);
	}

}
