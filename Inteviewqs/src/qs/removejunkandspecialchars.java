package qs;

public class removejunkandspecialchars {

	public static void main(String[] args) {

		String s= "@#$%^&*!Kajal&^%$#@";
		String s1= s.replaceAll("[^a-zA-Z0-9]","");
		
		System.out.println(s1);
	}

}
