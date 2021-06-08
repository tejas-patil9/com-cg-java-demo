package com.cg.demo.access;

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(100); // 0-100
		System.out.println(num);
		
	}

}
