package org.tns.oopsconcept;

public class Tryc {
public static void main(String[] args) {
		
		try
		{
			int arr[]=new int[6];
			arr[3]=20/0;
			System.out.println("I am in try block");
		}
		catch(ArithmeticException e)
		{
			System.out.println("A number cannot be divided by zero.Illegal Opeartion in java");
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Accessing array element out of specified limit");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("I am out of try catch block");

}

}