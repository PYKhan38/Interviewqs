package New;

import java.util.HashSet;

public class FindDuplicateElementInArray {

	public static void main(String[] args) {
		
		String array[]= {"C#","Java","C++","C#"};
		
		int l=array.length;
		
		System.out.println(l);
		
		for(int i=0; i<l;i++) {
			
			for(int j=i+1;j<l;j++) {
				
				if(array[i]==array[j]) {
					
					System.out.println("Duplicate exist" + array[i]);
				}
			}
		}
		
		
		
		

	}

}
