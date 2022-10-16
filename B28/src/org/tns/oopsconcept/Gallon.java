package org.tns.oopsconcept;
import java.util.Scanner;
public class Gallon {
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int Gallon=sc.nextInt();
	
	if(Gallon<45) {
		System.out.println("No Tax");
		}
	else if((Gallon>45)&&(Gallon<75)) {
		System.out.println("Tax amount is 475");
		}
	else if((Gallon>75)&&(Gallon<125)) {
		System.out.println("Tax amount is 750");
		}
	else if((Gallon>125)&&(Gallon<200)) {
		System.out.println("Tax amount is 1225");
		}
	else if((Gallon>200)&&(Gallon<350)){
		System.out.println("Tax amount is 1650");
		}
	 else{
		System.out.println("Tax amount is 475");
		}
	
	
   }
}


