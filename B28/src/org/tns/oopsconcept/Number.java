package org.tns.oopsconcept;
import java.util.Scanner;
public class Number {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		if(num%3==0) {
			
		System.out.println(num+"is a multiples of 3");
	}
		else {
			System.out.println(num+"is not a multiples of 3");
		}
		}

}
