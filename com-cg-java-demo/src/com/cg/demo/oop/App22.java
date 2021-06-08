package com.cg.demo.oop;

public class App22 {
	 

    public static void main(String[] args) {

        int num = 10;

        Employee2 obj = new Employee2();
        obj.id = 101;
        obj.name = "Abc";
        obj.salary = 10.5;
        System.out.println(obj.toString());

        Employee2 obj1 = new Employee2();
        obj1.id = 122;
        obj1.name = "Def";
        obj1.salary = 99.2;
        System.out.println(obj1.toString());

        Employee2 obj3 = new Employee2(199, "idd", 55.22);
        System.out.println(obj3.toString());
        
        Employee2 obj4 = new Employee2(104, "ddd", 49.22);
        System.out.println(obj4.toString());
        
        Employee2 obj6 = new Employee2(102, "ttt");
        System.out.println(obj6.toString());
        
        Employee2 obj7 = new Employee2(102);
        System.out.println(obj7.toString());
    }

}
