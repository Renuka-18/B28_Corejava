package org.tns.oopsconcept;

public class Hierarchical {
	public static void main (String[] args) {
		Suv ob1 = new Suv();
		ob1.displaynames();
		ob1.model3();
		Hatchback ob2 = new Hatchback();
		ob2.model2();
		Seden ob3 = new Seden();
		ob3.model1();
	}

}
