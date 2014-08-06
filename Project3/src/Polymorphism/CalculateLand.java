package Polymorphism;

public class CalculateLand {

	public static void main(String[] args) {
		
		Shape shape = new Shape();
		System.out.println(shape.AreaOfLand(10, 5));
		System.out.println(shape.AreaOfLand(5, 5, 6));
		System.out.println(shape.AreaOfLand(10, 10, 10, 10));
		
		
		ModernScale ms = new ModernScale();
		System.out.println(ms.AreaOfLand(10, 10, 10, 10));
		
	}

}
