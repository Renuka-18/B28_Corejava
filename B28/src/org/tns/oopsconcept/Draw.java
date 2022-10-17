package org.tns.oopsconcept;

public class Draw extends Bank {
	public String drew;

	@Override
	void withdep()
	{
		int drew=10000;
		System.out.println("The amount withdrawed is"+drew);
	}

}
