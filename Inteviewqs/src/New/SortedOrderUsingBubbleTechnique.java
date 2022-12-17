package New;

import java.util.Arrays;

public class SortedOrderUsingBubbleTechnique {

	public static void main(String[] args) {
		
		int a[]= {2,6,1,5,3};
		
		int l= a.length;
		
		for(int i=0; i<l-1; i++) {
			
			for(int j=0; j<l-1; j++) {
				
				if(a[j]>a[j+1]) {
					
					int temp;
					
					temp=a[j];
					
					a[j]=a[j+1];
					
					a[j+1]=temp;
				}
			}
			
		}
		
		System.out.println(Arrays.toString(a));
	}

}
