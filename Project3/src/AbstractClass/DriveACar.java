package AbstractClass;

// This is the main class 

public class DriveACar {
	public static void main(String[] args){
		//Car car = new Car(); -- you cannot create an instance from an interface 
		
		//CarPrototype pt = new CarPrototype;
		
		car auto = new Honda();
		auto.shape();
		auto.start();
		auto.stop();
		//auto.engine(); // cannot use this because it is not in the interface class
		
		CarPrototype design = new Honda();
		design.engine();//implements from Car
		design.shape();//implements from Car
		design.stop();//implements from Car
		design.start();//implements from Car
		design.wheel(); //This extends from CarPrototype
		
		Honda model = new Honda();
		model.engine();//This extends from CarPrototype
		model.shape();//This extends from CarPrototype
		model.start();//This extends from CarPrototype
		model.stop();//This extends from CarPrototype
		model.wheel();//This extends from CarPrototype
		
		
		
		
		
	}

}
