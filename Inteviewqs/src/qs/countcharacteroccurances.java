package qs;

public class countcharacteroccurances {

	public static void main(String[] args) {
		
		String s= "Yousuf khanu";
		
		int l= s.length();

		System.out.println(l);
		
		System.out.println(s.replace("u",""));
		
		int m =s.replace("u","").length();
		
		System.out.println(m);
		
		int count= l-m;
		
		System.out.println(count);
		

	}

}
