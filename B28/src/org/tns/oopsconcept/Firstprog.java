package org.tns.oopsconcept;

public class Firstprog {
	int year_of_purchase;//data members
	String make;
	int model;
	double cost;
	public void display()//member function
	{
		System.out.println("Year of Purchase "+2000);
		System.out.println("Make "+"Suzuki ");
	}
	void display2()
	{
		System.out.println("Model "+ 1999);
		System.out.println("Make "+500000);
	}
    public static void main (String [] args)
    {
    Firstprog ob1 = new Firstprog();
    ob1.display();
    ob1.display2();
    }
}
