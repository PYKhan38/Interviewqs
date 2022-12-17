
package qs;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		
		Scanner sc1= new Scanner(System.in);
		
		int n=sc1.nextInt();
		
		System.out.println(n);
		
		int count=0;
		
		while(n>0){
			
			n=n/10;
			
			count++;			
		}		
		
		System.out.println("Number of digits :"+count);	
	}
}
