package org.tns.oopsconcept;
import java.util.Scanner;
public class Light {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the time: ");
		int hour = sc.nextInt();
		if((hour>0)&&(hour<=24)) {
			if((hour>0)&&(hour<6)) {
				System.out.println("Its a nap time");
			}
			else if((hour>6)&&(hour<18)) {
				System.out.println("Switch off the light");
			}
			else {
				System.out.println("Switch on the light");
			}
		}
	}

}
