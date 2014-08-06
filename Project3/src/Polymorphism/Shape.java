package Polymorphism;


//This type of polymorphism is called overloading

public class Shape {
	
	public int AreaOfLand(int a, int b){
		int TotalLand = 0;
		TotalLand = a + b;
		return TotalLand;
		
	}
	public int AreaOfLand(int a, int b,int c){
		int TotalLand = 0;
		TotalLand = a + b + c;
		return TotalLand;
		
	}
	public int AreaOfLand(int a, int b, int c, int d){
		int TotalLand = 0;
		TotalLand = a + b + c + d;
		return TotalLand;
		
	}

}
