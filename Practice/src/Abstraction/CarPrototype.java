package Abstraction;

//This is the abstract class

public abstract class CarPrototype implements automobile {

	public void wheels(){
		System.out.println("Runs on wheels");
	}
	
	
	public abstract void engine(); // This is an abstract
	public abstract void NumberOfDoors();
	
	
}
