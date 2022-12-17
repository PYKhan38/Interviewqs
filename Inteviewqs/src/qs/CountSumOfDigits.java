package qs;

import java.util.Scanner;

public class CountSumOfDigits {

	public static void main(String[] args) {
		
       Scanner sc1= new Scanner(System.in);
		
		int n=sc1.nextInt();
		
		System.out.println(n);
		
		int sum=0;
		
		while(n>0) {
			
			sum=sum+n%10;
			
			n=n/10;
		}
         System.out.println(sum);		

	}

}
