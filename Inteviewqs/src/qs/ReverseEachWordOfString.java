package qs;

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		
		String str="what is your name";
		
		String[] words=str.split(" ");
		
		String revstring="";
		
		int l=words.length;
		
		for(int i=0;i<l;i++) {
			
			String word= words[i];		
			
			String revword=" ";
			
			for(int j=word.length()-1;j<=0;j--) {
				
				revword=revword+word.charAt(j);				
			} 
			
			revstring= revstring + revword+ " ";
			
		}
		
         System.out.println(revstring);
	}

}
