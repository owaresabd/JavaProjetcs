package DataStructure;

import java.util.Iterator;
import java.util.LinkedList;



public class usingLinkedList {
	
	public static void main(String[] args){
		
		LinkedList<String> lkl = new LinkedList<String>();
		
		lkl.add("john");
		lkl.add("max");
		lkl.add("jen");
		lkl.add("joan");
		lkl.add("emuel");
		
		Iterator<String> it = lkl.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		
	}
}


