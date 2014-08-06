package StringScanners;

import java.util.Scanner;

public class stringScan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String a[] = new String[5];
		

		String[] question = new String[5];

		question[0] = "What is you Name ?";
		question[1] = "What city in the US do you live in ?";
		question[2] = "what country are you originally from ?";
		question[3] = "What language do you speak other than english?";
		question[4] = "what is you professon or area of expertise ?";

		System.out.println("Hi! please answer the following questions honestly.");

		for(int i=0; i<a.length; i++){
		System.out.println(question[i]);
		a[i]=input.next();
		}

		System.out.println(" ");

		String name = a[0];
		String city = a[1];
		String ForeignCountry = a[2];
		String LanguageSpoken = a[3];
		String Profession = a[4];
		System.out.println(" ");
	
		System.out.println("******************************************Response Shows Below******************************************");
		
		System.out.println(" ");
		System.out.println("Hello!,");
		System.out.println("My name is " + name);
		System.out.println("I live in " + city);
		System.out.println("I am originally from " + ForeignCountry);
		System.out.println("I originally speak " + LanguageSpoken);
		System.out.println("I Profession or area of expertise is " + Profession);
		
		
		input.close();
		
		

	}
}
