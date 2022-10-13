package org.tns.oopsconcept;
class withdraw
{
	int amt_with = 1000;
	void show()
	{
		System.out.println("Super Class");
	}
}

public class Atm  extends withdraw{
	int amt_left = 15000;
	void show()
	{
		super.show();
		System.out.println("Child class");
		
	}
	public static void  main(String[] args) {
		Atm ob = new Atm();
		ob.show();
	}

}
