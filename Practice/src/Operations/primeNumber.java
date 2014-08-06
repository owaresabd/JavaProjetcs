package Operations;

public class primeNumber {
	public static void main(String[] args){
		
		int counter = 0;
		
		for(int i =2; i<100;i++){
			for(int j = 1;j<=i;j++){
				if(i%j==0){
					counter++;
				}// first if end
			}// inner loop 
			if(counter<=2){
				System.out.println(i + " is prime");
			}
			counter =0;
		}// outer loop 
		
	}
}
