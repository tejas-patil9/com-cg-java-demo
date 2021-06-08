package com.cg.demo.method;

public class Product2 {
	int batch;
	String productName;
	double cost;
	
	
	public Product2() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Product2(int batch, String productName, double cost) {
		super();
		this.batch = batch;
		this.productName = productName;
		this.cost = cost;
	}


	public Product2(int batch, String productName) {
		super();
		this.batch = batch;
		this.productName = productName;
	}


	public Product2(double cost) {
		super();
		this.cost = cost;
	}


	public Product2(String productName) {
		super();
		this.productName = productName;
	}
	


	@Override
	public String toString() {
		return "Product2 [batch=" + batch + ", productName=" + productName + ", cost=" + cost + "]";
	}


	
	
	
	
//	Product2()
//	{
//		System.out.println("Default constructor");
//	}
//	
//	Product2( String Productname){
//		this.Productname = Productname;
//		System.out.println("Single Parameter Constructor");
//	}
//	
//	Product2(int batch, String Productname){
//		this.batch = batch;
//		this.Productname = Productname;
//		System.out.println("Two Parameter Constructor");
//	}
//	
//	Product2(int batch, String Productname, double cost){
//		this.batch = batch;
//		this.Productname = Productname;
//		this.cost = cost;
//		System.out.println("Three Parameter Constructor");
//	}
//
//	@Override
//	public String toString() {
//		return "Product2 [batch=" + batch + ", Productname=" + Productname + ", cost=" + cost + "]";
//	}
	
	
}
