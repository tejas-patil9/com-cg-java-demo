package com.cg.demo.method;

public class App2 {
	public static void main(String[] args) {
		
		Product2 obj = new Product2();
		obj.batch = 1;
		obj.productName = "Compass";
		obj.cost = 100.25;
		System.out.println(obj.toString());
		
		Product2 obj1 = new Product2();
		obj1.batch = 2;
		obj1.productName = "Hammer";
		System.out.println(obj1.toString());
		
		Product2 obj2 = new Product2();
		obj2.productName = "Screwdriver";
		System.out.println(obj2.toString());

		Product2 obj3 = new Product2();
		obj3.batch = 5;
		obj3.productName = "Gum";
		System.out.println(obj3.toString());
		
		Product2 obj4 = new Product2(22, "Car", 133.55);
		System.out.println(obj4.toString());
		
		Product2 obj5 = new Product2(29, "bIke");
		System.out.println(obj5.toString());
		
		Product2 obj6 = new Product2( "Truck");
		System.out.println(obj6.toString());
		
		
		
				
	}

}
