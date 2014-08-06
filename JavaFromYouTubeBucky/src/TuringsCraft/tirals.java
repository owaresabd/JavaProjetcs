//Given  an int  variable  datum that has already  
//been declared , write a few statements  that read an integer  
//value  from standard input into this variable . 

package TuringsCraft;

import java.util.Scanner;

public class tirals {
	
	public static void main(String[] args){
		Scanner fname = new Scanner(System.in);
	    Scanner sname = new Scanner(System.in);
	    Scanner number = new Scanner(System.in);
	    tuna weight = new tuna();

	    System.out.println("Enter Your First Name: ");
	    String fname1 = fname.nextLine();
	    String fnames = fname1;

	    System.out.println("Enter Your Last Name: ");
	    String sname1 = sname.nextLine();
	    String snames = sname1;

	    System.out.println("Enter Your Weight (Lbs.) : ");
	    String num = number.nextLine();
	    String num1 = num;

	    System.out.println("Okay " + fname1 + " " + sname1
	            + " I can see here that you weigh " + num + "lbs.");
	    int num2 = num1.parseInt();
	    if (num1 >= 275)
	        System.out
	                .println("You know, you should maybe consider laying off the candy my friend.....");
	}
	
	
	
}
