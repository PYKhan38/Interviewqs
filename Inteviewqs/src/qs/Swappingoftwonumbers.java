package qs;
public class Swappingoftwonumbers {
		
	public static void main(String[] args) {
		int a= 10;
		int b= 20;
		int t;	
		
		//method----------1
		 t=a;   //t=10
		 a=b;   //a=20
	     b=t;   //b=10
	     
	     System.out.println(a);
	     
	     System.out.println(b);
	     
	   //method----------2
	     
	     a= a+b; //10+20=30
	     b= a-b; //30-20=10
	     a= a-b; //30-10=20
	     
         System.out.println(b);
	     
	     System.out.println(a);
	     
	   //method----------3
	     
	     a= a*b;  //10*20=200
		 b= a/b;  //200/20=10
		 a= a/b;   //200/10=20
		 
         System.out.println(a);
	     
	     System.out.println(b);
				 
	}
	
    
} 
    
    
    
    
    
    

