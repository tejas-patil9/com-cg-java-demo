package com.cg.demo.oop;

public class BankCustomer {
	
	//member  = method of field
	
	//1.access static member in static context - free access - class reference
	//2.access static member in non static context - free access - class reference
	//3.access non static member in static context - restricted access - object reference
	//4.access non static member in non static context - restricted access - ?? reference
	 
	
	
	static int ifsc = 10145147;
	//non static field
	int acNo;
	String name;
	double balance;
	//non static context
	
	void checkBalance() // Method Signature
	{ 
		System.out.println(balance);
		
	} //pair of curly braces is "method body"
	//method body + signature = method definition
	
	//Static Context
	
	static void openAccount () {
		System.out.println("Open an account");
		
	}
	
	public static void main(String[] args) {
		
		BankCustomer c1 = new BankCustomer();
		c1.acNo = 101;
		c1.name = "Tejas";
		c1.balance = 100000;
		System.out.println(c1.acNo + " " + c1.name + " " + c1.balance );
		c1.checkBalance();// method invocation(valid)
//		checkBalance(); this is not valid
		System.out.println(c1.balance);
		openAccount();
		System.out.println(ifsc);
		System.out.println(c1.ifsc);
		
	}
	

}
