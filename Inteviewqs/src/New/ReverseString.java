package New;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="what is your name";
		
		String rev=" ";
		
//		int l=str.length();
//		

//		
//		for(int i=l-1;i>=0;i--) {
//			
//			rev=rev+str.charAt(i);		
//		}
//		
//		System.out.println(rev);
//
//	}
		
		char[]ch=str.toCharArray();
		
		int l=ch.length;		
		
		for(int i=l-1;i>=0;i--) {
			
			rev=rev+ch[i];			
		}
		
		System.out.println(rev);
	}

}
