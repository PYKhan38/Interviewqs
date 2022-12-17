package qs;

public class printAlternateCharOfString {

	public static void main(String[] args) {
		
		String str= "what is your name";
		
		int l=str.length();
		
		System.out.println(l);
		
		for(int i=0;i<=l;i+=3) {
			
			System.out.print(str.toUpperCase().charAt(i));			
			
		}
		

	}

}
