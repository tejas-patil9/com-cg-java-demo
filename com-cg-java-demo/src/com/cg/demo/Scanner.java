package com.cg.demo;

public class Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter an integer - ");
		int num = sc.nextInt();
		System.out.println(num);

		System.out.println("Please enter an floating point number- ");
		double num2 = sc.nextDouble();
		System.out.println(num2);

		System.out.println("Please enter an String value - ");
		String name = sc.next();
		System.out.println(name);
	}

}
