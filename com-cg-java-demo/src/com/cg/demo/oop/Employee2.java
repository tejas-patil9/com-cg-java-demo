package com.cg.demo.oop;

public class Employee2 {
    int id;
    String name;
    double salary;
    
    
    Employee2(){
    	System.out.println("default constructor");
    	
    }
    
    Employee2(int id, String name, double salary) {
    	this.id = id;
    	this.name = name;
    	this.salary = salary;
    	System.out.println("three parameterised constructor");
    }
    
    Employee2(int id, String name) {
    	this.id = id;
    	this.name = name;
    	System.out.println("two parameterised constructor");
    }

    Employee2(int id) {
    	this.id = id;
    	System.out.println("one parameterised constructor");
    }
 

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

}
