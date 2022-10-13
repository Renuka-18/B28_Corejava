package org.tns.oopsconcept;

public class Dasaratha {
	void display1()
	{
		System.out.println("I am the Grandfather");
		
	}

}
class Rama extends Dasaratha
{
	void display2()
	{
		System.out.println("I am the Father");
	}
}
class Lava extends Rama{
	void display3()
	{
		System.out.println("I am the Grandson");
		
	}
}