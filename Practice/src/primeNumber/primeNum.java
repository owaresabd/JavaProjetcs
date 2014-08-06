package primeNumber;

public class primeNum {

	public static void main(){
		int counter = 0;
		
		for(int i =2; i<23;i++){
			for(int j = 1;j<=i;j++){
				if(i%j==0){
					counter++;
				}// first if end
			}// inner loop 
			if(counter<=2){
				System.out.println(i + " is prime");
			}
			
		}// outer loop 
		
	}
}
