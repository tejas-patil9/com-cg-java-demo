package com.cg.demo.ios;

import java.io.*;
import java.util.Scanner;

public class SerDemo {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter id: ");
		int id = sc.nextInt();
		System.out.println("Enter name: ");
		String name = sc.next();
		System.out.println("Enter salary: ");
		double salary = sc.nextDouble();
		Employee emp = new Employee(id, name, salary);

		String file = "E:\\dt";
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(emp);

		System.out.println(emp.toString());
		System.out.println("Done");

		oos.close();
		sc.close();
	}
}