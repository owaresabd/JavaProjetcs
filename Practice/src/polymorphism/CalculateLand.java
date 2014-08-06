package polymorphism;

public class CalculateLand {
	public static void main(String[] args){

		shape shape = new shape();
		System.out.println(shape.areaOfLand(10, 12));
		System.out.println(shape.areaOfLand(12, 14, 19));
		System.out.println(shape.areaOfLand(12, 13, 14, 15));
		
		
		
		System.out.println("");
		
		ModernScale ms = new ModernScale();
		int perimetre = ms.areaOfLand(2, 3, 4, 5);
		
		System.out.println(perimetre);
	}

}
