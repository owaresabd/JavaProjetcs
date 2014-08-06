package polymorphism;

public class shape {
	/* Notice that the methods below have the same name
	 * This situation is called "overloading" 
	 * Over loading occures during
	 */

	public int areaOfLand(int a, int b){
		// This is a return type method 
		int totalLand = 0;
		totalLand = a+b;
		
		return totalLand;
		
	}
	public int areaOfLand(int a, int b, int c ){
		// This is a return type method 
		int totalLand = 0;
		totalLand = a+b+c;
		return totalLand;
		
	}
	public int areaOfLand(int a, int b, int c, int d){
		// This is a return type method 
		int totalLand = 0;
		totalLand = a+b+c;
		return totalLand;
		
	}

}
