package com.cg.demo.abs;

//Polymorphism - methods with same nick name have different functionalities

//compile time polymorphism - method overloading - early binding 
//possible with (both static and non static)
//static methods possible only in one class
//non static possible in one class or super + sub classes
//three types
//1. Different number of arguments
//2. Different type of arguments
//3. Different order of arguments



//run time polymorphism - method overriding - late binding




public class PolyDemo {
	
	public int add(int i, byte j){ // different types of arguments	
		return i + j;
		
	}
	public int add(byte i, int j){ // different order of arguments
		return i + j;
		
	}
	public int add(int i, int j, int k){
		return i + j + k;
		
	}
	public int add(int i, int j, int k, int l){
		return i + j + k + l;
		
	}
	
public static void main(String[] args) {
	PolyDemo polyDemo = new PolyDemo();
	
	System.out.println(polyDemo.add(10, 20));
	System.out.println(polyDemo.add(10,20,30));
	System.out.println(polyDemo.add(10,40,50,60));
	
}
}
