package AbstractClass;

//This is the abstract class


public abstract class CarPrototype implements car{
	
	//An abstract class can have an abstract method and non-abstract method
	
	public void wheel(){ // This is a non-abstract method and must have a body 
		System.out.println("Run on Wheels");
	}
	
	public abstract void engine(); // This is an abstract method  and doesn't need a body
	   


}
