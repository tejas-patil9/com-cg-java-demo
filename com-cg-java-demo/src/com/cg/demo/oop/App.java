package com.cg.demo.oop;


class Employee {

	// attributes - fields
	int id;
	String name;
	double salary;

	// functionalities - methods
	void work() {
		System.out.println("Employee works...");
	}
}

public class App {

	public static void main(String[] args) {

		Employee obj = new Employee();
		obj.id = 101;
		obj.name = "Sonu";
		obj.salary = 10.5;
		System.out.println(obj.id + " " + obj.name + " " + obj.salary);
		obj.work();

		Employee obj2 = new Employee();
		Employee obj3 = new Employee();
		App obj4 = new App();

	}
}