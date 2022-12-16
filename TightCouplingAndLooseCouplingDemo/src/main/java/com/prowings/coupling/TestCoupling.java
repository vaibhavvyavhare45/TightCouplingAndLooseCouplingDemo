package com.prowings.coupling;

public class TestCoupling {
	public static void main(String[] args) {
		Car c = new Car();
		Bus b=new Bus();
		Traveller t = new Traveller(b);//or passing 
		//solve dependedency  either constructor or using setter function not getter function
		//t.setV(b);//using setter
		// t.setV(c);
		t.startJourney();
	}

}
