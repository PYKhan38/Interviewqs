package qs;

public class ArraysCheck {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		
		int evencount=0;
		
		int oddcount=0;
		
		int l= a.length;
		
		int i;
		
		while(l>0){
			
			if(a[]%2==0) {
				
				evencount++;
				
				System.out.println("Number of even number:"+evencount+'-'+a[i]);
			}
			else {
				
				oddcount++;		
				
				System.out.println("Number of odd number:"+oddcount+'-'+a[i]);
			}
			
			l=l--;
			
			
			
		}

	}

}
