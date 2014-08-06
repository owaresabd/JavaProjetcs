package Inheritance;


// This is the main class
public class DriveCar {
	public static void main(String[] args){
		Camry camry = new Camry();
		camry.startButton();
		//camry.autoStart(); -- This is not possible because corolla cannot inherity the features of camry
		
		
		
		Corolla corolla = new Corolla();
		corolla.startButton();
		corolla.breakpad();
		corolla.autoStart();
		
		Lexus lexus = new Lexus();
		lexus.autoStart();
		lexus.breakpad();
		lexus.flyInSpace();
		lexus.startButton();
		
		
	}

}
