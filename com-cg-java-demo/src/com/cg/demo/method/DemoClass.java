package com.cg.demo.method;

public class DemoClass {
	
	public int publicField = 10;
	protected int protectedField = 20;
	int packageField = 30;
	private int privateField = 40;

	public static void main(String[] args) {
		
		DemoClass obj = new DemoClass();
		System.out.println(obj.publicField);
		System.out.println(obj.protectedField);
		System.out.println(obj.packageField);
		System.out.println(obj.privateField);
		
	}

}
