package com.cg.demo.oop;

public class Block {

	static int num = 10;

	public static void main(String[] args) {
		System.out.println("main");

		Block obj = new Block();
		Block obj2 = new Block();
		Block obj3 = new Block();

		Block.m1();
		System.out.println(num);
	}

	{
		System.out.println("non static block");
	}

	{
		System.out.println("another non static block");
	}

	static {
		System.out.println("static block");
	}

	static {
		System.out.println("another static block");
	}

	static void m1() {
		System.out.println("m1");
	}
}


