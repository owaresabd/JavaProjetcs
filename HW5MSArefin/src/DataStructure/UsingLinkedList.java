package DataStructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class UsingLinkedList {
	
	public static void main(String[] args){
		
		LinkedList<String> lkl = new LinkedList<>();
		
		lkl.add("Dexter");
		lkl.add("Alam");
		lkl.add("Ali");
		lkl.add("Mariam");
		lkl.add("Ajith");
		lkl.add("Nijith");
		lkl.add("Naresh");
		
	
		Iterator<String> it = lkl.listIterator();
		
		while(it.hasNext()){
		System.out.println(it.next());
			
		}
		
		
	}
}
