package AbstractClass;


//Concrete class 


public class Honda extends CarPrototype {

	@Override
	public void start() {
		System.out.println("Start ignition");
		
	}

	@Override
	public void stop() {
		System.out.println("Brake or stop ignition");
		
	}

	@Override
	public void shape() {
		System.out.println("Desirable car Model");
		
	}

	@Override
	public void engine() {
		System.out.println("Four stroke engine");
		
	}
	

}
