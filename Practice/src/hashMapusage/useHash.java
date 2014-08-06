package hashMapusage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class useHash {

	public static void main(String[] args){
		
		
			
			//Map map = new HashMap();
			
			Map<String, Map> students = new HashMap<String, Map>();
			HashMap<String, String> student1 = new LinkedHashMap<String, String>();
			student1.put("name", "Mohamed");
			student1.put("phone_num", "1-718-111-1111");
			student1.put("Major", "CST");
			
			students.put("key", student1);
			
			System.out.println("---- Without using the loop ----");
			
			System.out.println(students.get("key").get("name"));
			System.out.println(students.get("key").get("phone_num"));
			System.out.println(students.get("key").get("Major"));
			
			System.out.println();
			System.out.println("---- Using the loop ----");
			
			for (Object key:student1.keySet()){
				System.out.println(student1.get(key));
			

		
			}
			}
}
