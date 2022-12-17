package qs;

public class removewhitespace {

	public static void main(String[] args) {
		
		String s= "F arjana";
		
		System.out.println("Before removing white space" +" "+s);
		
		String s1= s.replaceAll("\\s","");
		
		
		System.out.println("Aftre removing the white space"+" "+s1);

	}

}
 