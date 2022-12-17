package qs;

import java.util.Arrays;

public class SortingElements {

	public static void main(String[] args) {
		
		int a[]= {4,9,6,2,1};
		
		System.out.println(Arrays.toString(a));
		
		int n=a.length;
		
		System.out.println(n);
		
		for(int i=0;i<4;i++) {
			
			for(int j=0;j<4;j++) {
				
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
