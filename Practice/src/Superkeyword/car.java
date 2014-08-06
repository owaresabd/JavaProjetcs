package Superkeyword;

public class car {
	
	 int year;
	public car(String st){
		System.out.println("parent class");
	}
	public car(String st, String year){
		System.out.println("parent class with year");
	}
	public void drive(String st){
		System.out.println("method -1 " + st);
	}
	
	
}
