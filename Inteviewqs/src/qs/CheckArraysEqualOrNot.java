package qs;

import java.util.Arrays;

public class CheckArraysEqualOrNot {

	public static void main(String[] args) {
		
		int a[]= {1,3,5,4,6};
		
		int b[]= {1,3,5,4,6};
		
		boolean bool=Arrays.equals(a, b);
		
		if(bool==true) {
			
			System.out.println("Two arrays are equal");
		}
        if(bool==false) {
			
			System.out.println("Two arrays are not equal");
		}

	}

}
