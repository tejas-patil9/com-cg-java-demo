package com.cg.demo.dates;

import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

	public static void main(String[] args) {

//		Date date = new Date();
//		System.out.println(date.toString());

		LocalDate date = LocalDate.now();
		System.out.println(date.toString());

		LocalDate iDay = LocalDate.of(1947, 8, 15);
		System.out.println(iDay.toString());

//		LocalDate myDate = LocalDate.parse("1947-08-15");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		LocalDate myDate = LocalDate.parse("08-15-1947", formatter);
		System.out.println(myDate.toString());

		// formatting date
		// compare two dates and find the duration
		// add / subtract duration to date

	}

}
