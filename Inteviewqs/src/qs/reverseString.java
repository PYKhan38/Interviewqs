package qs;

public class reverseString {

	public static void main(String[] args) {
		
		//Using +(string concatenation) operator
		
//		String s="Rome is not build in a day";
//		
//		int l= s.length();
//		
//		System.out.println(l);
		
		
		String str= "what is your name";
		
		String s1[]=str.split(" ");int i=0;
		
		System.out.println(s1.length);
		
		System.out.println(s1[i]);
		
//		for(int i=s1.length-1; i>0;i--) {
//			
//			System.out.print(s1[i]);
//		}

//		char c[]= str.toCharArray();
//
//		int len= str.length();

//		String rev=" ";

//		for(int i=len-1; i>0; i--){
//
//		rev= rev+c[i];
//		
//		}
//
//		System.out.println(rev);
//		
		
		/*String rev="";
		
		for(int i=0;i<l;i++) 
		{
			rev=s.charAt(i)+rev;
		}
         System.out.println(rev);*/
		
		//using character array
		
		/*char c[]=s.toCharArray();
		
		for(int i=c.length-1; i>=0;i--) {
			
			System.out.print(c[i]);
		}*/
		
		//using StringBuffer class
		
		/*StringBuffer stb= new StringBuffer(s);
		
		System.out.println(stb.reverse());*/
		
	}

}
