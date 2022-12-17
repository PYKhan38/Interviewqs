package qs;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your string: ");
		
		String str=sc.nextLine();
		
		System.out.println(str.length());
		
		System.out.println(str);	
		
		String org_str=str;
		
		String rev=" ";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);			
		}		
		System.out.println(rev);
		
		if(rev==org_str) {
			
			System.out.println("It is a palindrome string");
		}
		

	}

}
