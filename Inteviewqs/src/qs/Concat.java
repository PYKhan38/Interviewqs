package qs;

public class Concat {

	public static void main(String[] args) {

		String s1= "Pooja";
		
		String s2= "Rahul";
		
		String s3= "Anu";
		
//		String s4= s1.concat(s2).concat(s3);
//		
//		System.out.println(s4);
		
		
		StringBuffer sb= new StringBuffer(s1);
		
		sb.append(s2).append(s3);
		
		System.out.println(sb);
		
	}

}
