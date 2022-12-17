package New;

import java.util.Arrays;
import java.util.Collections;

public class SortArraysUsingInBuildMethod {

	public static void main(String[] args) {
		
		Integer a[]= {2,6,1,5,3};
		
		System.out.println("Before sorting: " + Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println("After sorting: " + Arrays.toString(a));
		
		Arrays.sort(a, Collections.reverseOrder());
		
		System.out.println("After sorting in Descending order: " + Arrays.toString(a));
	}

}
