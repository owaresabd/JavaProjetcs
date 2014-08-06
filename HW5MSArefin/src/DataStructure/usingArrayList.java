package DataStructure;


// 1)Write an application to demonstrate ArrayList,LinkedList,Stack and Queue.

import java.util.ArrayList;
import java.util.List;

public class usingArrayList {

	public static void main(String[] args) {
		
		System.out.println("This is an Array List");
		
		List<String> al = new ArrayList<>();
		
		al.add("Sam");
		al.add("Dan");
		al.add("Daniel");
		al.add("David");
		al.add("Smith");
		al.add("Fara");
		al.add("Flora");
		al.add("Ali");
		al.add("Alex");
		al.add("Ramasundaravankataayyer");
		al.add("James");
		al.add("Janice");
		al.add("Daniela");
		al.add("John");

		System.out.println(al); // this will list every thing in one line with coma seperation.
		
	
		System.out.println(" ");
		
		for(String st:al){
			System.out.println(st);
			//This will list every thing as a column list 
		}
	}

}
