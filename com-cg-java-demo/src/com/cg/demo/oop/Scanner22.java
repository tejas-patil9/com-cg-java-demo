package com.cg.demo.oop;

public class Scanner22 {

	 
	public class Main 
	{
	    public static void main(String[] args) 
	    {
	    int count;
	        Scanner scan = new Scanner(System.in);
	         
	        //User will be asked to enter the count of strings 
	        System.out.print("Enter number of strings: ");
	        count = scan.nextInt();
	         
	        String strArray[] = new String[count];
	        Scanner scan2 = new Scanner(System.in);
	         
	        //User is entering the strings and they are stored in an array
	        System.out.println("Enter the Strings one by one:");
	        for(int i = 0; i < count; i++)
	        {
	            strArray[i] = scan2.nextLine();
	        }
	        scan.close();
	        scan2.close();
	         
	        //Sorting the strings
	        strArray = Stream.of(strArray).sorted().toArray(String[]::new);
	         
	        //Displaying the strings after sorting them based on alphabetical order
	        System.out.print("Strings in Sorted Order: " + Arrays.toString(strArray));
	    }
	}
}
