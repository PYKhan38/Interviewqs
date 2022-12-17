package qs;

import java.util.Scanner;

public class countrepeatedwords {

	public static void main(String[] args) {

				
		String s= "sutanuta";		
		
		int count=0;
		
		int sum=0;
		
		int size=s.length();			
		
		char c[]=s.toCharArray();
		
		int l=c.length;
		
		for(int i=0; i<=l-1; i++) {	
			
			for(int j=i+1; j<=l-1; j++)
				
			if (c[i]==c[j])
			   {
				   System.out.println(c[i]+" "+count++);  				  
			   }
		}

    }
}
