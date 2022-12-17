package qs;

public class Splitting {

	public static void main(String[] args) {
		String s= "TestNG, Cucumber, JUnit,Selenium";
		
		String s1[]= s.split(",");
		
		for(int i=0;i<4;i++) {
			
			System.out.println(s1[i]);
			
		}
	}

}
