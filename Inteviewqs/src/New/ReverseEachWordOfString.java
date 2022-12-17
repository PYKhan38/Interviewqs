package New;

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		
        String str="what is your name";
		
		String revstring=" ";
		
		String []words=str.split(" ");
		
		for(String word:words) {
			
			String revword="";
			
			for(int i=word.length()-1;i>=0;i--) {
				
				revword=revword+word.charAt(i);				
			}
			
			revstring=revstring+revword+" ";			
		}
		
		System.out.println(revstring);
	}
	
}


