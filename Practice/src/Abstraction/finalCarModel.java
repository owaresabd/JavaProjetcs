package Abstraction;

import javax.swing.Spring;
//This is the concrete class

public class finalCarModel extends CarPrototype {

	//@Override
	public void start() {
		
		
		System.out.println("start the car using a key");
		
	}

	//@Override
	public void stop() {
		System.out.println("Hit the brakes to stop the car");
		
	}

	//@Override
	public void color() {
		
		String color = "red";
		
		
		System.out.println("Color that appeal to people is " + color );
		
	}

	//@Override
	public void size() {
		System.out.println(" this can be either an suv or a saddan");
		
	}

	//@Override
	public void engine() {
		System.out.println("either 4 stroke engine or rotesory engine");
		
	}

	@Override
	public void NumberOfDoors() {
		System.out.println("either two doors or 4 doors");
		
		
		
	}

}
