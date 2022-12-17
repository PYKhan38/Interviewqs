package qs;

import java.util.Scanner;

public class Palindromenumber {

	public static void main(String[] args) {
		
    Scanner sc= new Scanner(System.in);
    
	System.out.println("Enter a number");
	
	int i= sc.nextInt();
	
	int org_i=i;
	
	int rev=0;
	
	while(i!=0)
	{
		 rev= rev*10+i%10;
		 
		 i=i/10;		 
	}
	
	if (org_i== rev)
	{
		System.out.println("It is a palindromenumber");
	}
	else
	{
		System.out.println("It is not a palindromenumber");
	}
} 
	
	

}
