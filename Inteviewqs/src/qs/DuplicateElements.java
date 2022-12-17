package qs;

public class DuplicateElements {

	public static void main(String[] args) {
		
		String name[]= {"yousuf","pooja","suboohi","yousuf"};
		
		for(int i=0; i<4;i++) {
			
			for(int j=i+1; j<4;j++) {
			
			if (name[i].equals(name[j]))
			   {
				   System.out.println(name[i]);					  
			   }
			
			
		}
				

	}
	}
}


