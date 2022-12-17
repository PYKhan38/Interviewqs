package qs;

public class CharArrayToString {

	public static void main(String[] args) {

		char c[]= {'a','c','d','e'};
		
		String s1=String.valueOf(c); //method 1
		
		System.out.println(s1);
		
		String s2= new String(c); //method 2
		
		System.out.println("s2 value:"+s2);
		
	}

}
