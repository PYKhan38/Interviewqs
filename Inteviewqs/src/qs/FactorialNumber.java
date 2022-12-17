package qs;

public class FactorialNumber {

	public static void main(String[] args) {		
		
		int factorial=1;
		
		int i=5;
		
//		for(int i=5; i>0; i--) {
//			
//		   factorial=factorial*i;
//		}
		
		while(i>0) {
			
			factorial=factorial*i;
			
			i--;
		}
		
       System.out.println(factorial);
	}

}
