package DataStructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class usingQueue {

	public static void  main(String[] args){
		
		Queue<String> que = new LinkedList<String>();
		
		que.add("james");
		que.add("Lenny");
		que.add("Arexy");
		que.add("Miagi");
		que.add("Monroe");
		
		System.out.println("The peek of the list is: "+que.peek());
		
		Iterator<String> it = que.iterator();
		while(it.hasNext()){
		
		System.out.println(it.next());
		}
		
		
		
	}
}
