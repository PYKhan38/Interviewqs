package qs;

import java.util.Arrays;

public class Sortarrays {

	public static void main(String[] args) {

		int [] array= {9,11,5,6,1,2};
		
		System.out.println(array.length);
		
		Arrays.sort(array);		
		
		for(int i=0;i<array.length;i++ )
		{
			System.out.print(array[i]);			
		}
	}

}
