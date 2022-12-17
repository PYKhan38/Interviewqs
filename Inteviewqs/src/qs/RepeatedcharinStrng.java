package qs;

import java.util.Scanner;

public class RepeatedcharinStrng {

	public static void main(String[] args) {

		
		System.out.println("Enter any String");

		Scanner sc= new Scanner(System.in);
		
		String s= sc.nextLine();	
		
//		String s= "yousufu";
		
	    int l= s.length(); //6
	    
	    System.out.println(l);
	    
	    char[] ch= s.toCharArray();
	   
	   for(int i=0;i<l;i++)
	   {
		   for(int j=i+1;j<l;j++)
		   {
			   if (ch[i]==ch[j])
			   {
				   System.out.println(ch[i]);
				   
				   break;
			   }
					   
		   }
		   
	   }
	}

}
