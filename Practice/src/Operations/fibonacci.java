package Operations;

public class fibonacci {

	public static void main(String[] args) {
		int previous =0;
		int current =1;
		
		for(int i=0;i<5;i++){
			
			System.out.println(previous);
			current= current+ previous;
			System.out.println(current);
			previous= previous+current;
			
//			previous= previous + current;
			
		}
		
	}

}
