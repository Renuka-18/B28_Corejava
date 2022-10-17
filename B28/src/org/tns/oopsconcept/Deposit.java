package org.tns.oopsconcept;

public class Deposit extends Bank {
	
	public String dep;

	@Override
	void withdep()
	{
		int dep=20000;
		System.out.println("The amount deposited is"+dep);
		
	}
}
