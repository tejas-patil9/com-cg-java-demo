package com.cg.demo;

public class Logicaloperators {
	public static void main(String[] args) {
		
		int leaves = 25;
		int salary = 35;
		int expectedleaves = 20;
		int expectedsalary = 30;
		
		System.out.println(leaves >= expectedleaves);
		System.out.println(salary >= expectedsalary);
		System.out.println(leaves > salary);
		
		
		System.out.println((leaves >= expectedleaves) && (salary >= expectedsalary));
		System.out.println((salary >= expectedsalary) || (leaves >= expectedleaves));
	

		
		
	}

}
