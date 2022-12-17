package qs;

public class AlterantiveCharactersCapital {

	public static void main(String[] args) {
		
		String str= "yousuf";
		
		char r[]= str.toCharArray();
		
		System.out.println(r.length);
		
		int count=0;
		
		for (char c:r) {
			
			
			switch(c){
				
				case 'a': 
				case 'e':
				case 'i':
				case 'o':
				case 'u':	
					
					count++;
					break;
					
			}			
			
		}

		System.out.println("No of ovels:" + count);
	}

}
