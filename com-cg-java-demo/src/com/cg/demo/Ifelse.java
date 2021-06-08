package com.cg.demo;

public class Ifelse {
	public static void main(String[] args) {
		
		int bikes = 15;
		int cars = 27;
		int expbikes = 30;
		int expcars= 26;
		
		if (bikes >= expbikes) {
			System.out.println("buy them all");
		}
		else {
			System.out.println("do not buy bikes");
		}
		if ((bikes >= expbikes) || (cars >= expcars))
		{
			System.out.println("Buy both cars and bikes");
		}
		else {
			System.out.println("Do not buy anything");
		}
	}

}
