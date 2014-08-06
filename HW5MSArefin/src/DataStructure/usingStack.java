package DataStructure;

import java.util.Iterator;
import java.util.Stack;

public class usingStack {
	public static void main(String[] args){
		
		// this is a Stack 
		
		Stack<String>  sl = new Stack<String>();
		
		sl.push("1st name on list");
		sl.push("2nd name on list");
		sl.push("3rd name on list");
		sl.push("4th name on list");
		sl.push("5th name on list");
		sl.push("6th name on list");
		sl.push("7th name on list");
		sl.push("8th name on list");
		sl.push("9th name on list");
		sl.push("10th name on list");
		
		System.out.println(sl.pop());
		
		sl.remove(5); // this will remove >> sl.push("6th name on list"); 
		
		Iterator<String> it = sl.iterator();
		while(it.hasNext()){
			System.out.println(sl.pop());
		}
	}

}
