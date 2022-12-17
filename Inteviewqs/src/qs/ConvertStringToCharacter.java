package qs;

public class ConvertStringToCharacter {

	public static void main(String[] args) {
		
		char c[]= {'a','b','c','d'};
		
		//method 1
//		------------
		String s1=String.valueOf(c);
		
		System.out.println(s1);
		
		//method 2
//		------------
		
		String s2= new String(c);
		
		System.out.println(s2);
		

	}

}
