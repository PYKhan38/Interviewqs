package qs;

import java.util.Scanner;

public class countThewords {

	public static void main(String[] args) {
		
		System.out.println("Enter any String");

		Scanner sc= new Scanner(System.in);
		
		String s= sc.nextLine();	
		
		int count = 1;
		
		int i;
		
		System.out.println(s.length());
		
		for(i=0; i<s.length()-1; i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
			{
				count++;				
			}
			
		}
		
		System.out.println("number of words in string is"+ count);
				
	}

}
