package NestedMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class usingNestedMap {

	
	// This is basically what we did in class. i am not sure if this is the what is called nested map.
	
	public static void main(String[] args){
		
		Map<String,String> m= new LinkedHashMap<String,String>();
		m.put("Ali", "The King");
		m.put("Mohammed", "The Knight");
		m.put("Fara", "The Queen");
		m.put("Max", "The Bishop");
		m.put("Jalal", "The Rook");
		
		for(Entry<String,String> name: m.entrySet()){
			System.out.println(name.getKey()+ "------------>"+name.getValue());
			
		}
	}
}
