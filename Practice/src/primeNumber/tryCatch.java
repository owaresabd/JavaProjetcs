package primeNumber;

public class tryCatch {

	public static void main(String[] args) {
		int counter = 8;
		if(counter<10){
		int i= 0;
		try{
			i = 4/2;
			
			System.out.println(i);
		}catch(Exception ex){
			ex.printStackTrace();
			System.out.println("cannot divide by zero");
		}
		}
		
		
		
	}

}
