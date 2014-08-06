package polymorphism;

public class ModernScale extends shape{

	public int areOfLand(int a, int b, int c, int d){
		int totalLand = 0;
		totalLand = a+b+c+d+2; // This is going to cause overriding
		
		return totalLand;
	}
	
}
