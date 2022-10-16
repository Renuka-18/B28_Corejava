package org.tns.oopsconcept;
import java.util.Scanner;
public class Lib {
	public static void main(String[]  args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the days that you returned late:");
		int days = sc.nextInt();
		if (days<5) {
			System.out.println("Fine Amount is"+days*1);
			
		}
		else if ((days>5)&&(days<10)) {
			System.out.println("Fine Amount is"+days*5);
			
		}
	  
	  else {
		  System.out.println("Fine Amount is"+days*10);
			
		}
	}

}
