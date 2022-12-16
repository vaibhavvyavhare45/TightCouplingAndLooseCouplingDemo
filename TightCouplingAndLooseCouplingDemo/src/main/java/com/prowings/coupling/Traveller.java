package com.prowings.coupling;

public class Traveller {
	Vehicle v;
	
	

	public Traveller() {
		super();
	}

	public Traveller(Vehicle v) {
		super();
		this.v = v;
	}

	public Vehicle getV() {
		return v;
	}

	public void setV(Vehicle v) {
		this.v = v;
	}

	public void startJourney() {
		System.out.println("Starting journey!!");
		// tightly couple class without using interface car,bus and bike logic
//		Car c = new Car();
//		a.run();
//		Bus b=new Bus();
//		b.run();
//		Bike b1=new Bike();
//		b1.run();
//		System.out.println("journey started by car...");
//		System.out.println("journey started by bus...");

		v.run();

		System.out.println("journey started by:" + v.getClass().getName());

	}

}
