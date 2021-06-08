package com.cg.demo.encap;


//Encapsulation - binding data and code together.
//Make fields as private and 
//create getters and setters 

public class BankCustomer {

	private double balance;

	double checkBalance() {
		return balance;
	}

	double withdraw(double amount) {
		balance -= amount;
		return balance;
	}

	double deposit(double amount) {
		balance += amount;
		return balance;
	}
}
