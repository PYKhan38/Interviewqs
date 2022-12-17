package qs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysListCompare {

	public static void main(String[] args) {
		
		//1. sort and then equals:
		
		ArrayList<String>l1=new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		
		ArrayList<String>l2=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));

		ArrayList<String>l3=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		
		Collections.sort(l1);
		
		Collections.sort(l2);
		
		System.out.println(l1.equals(l2)); //false
		
		System.out.println(l2.equals(l3)); //true
		
		//2. sort and then equals:
		
        ArrayList<String>l4=new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		
		ArrayList<String>l5=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		
//		l4.removeAll(l5);
//		
//		System.out.println(l4);
		
		//3. findout the missing elements:
		
//		l5.removeAll(l4);
//		
//		System.out.println(l5);
		
		//4.find out common elements:
		
		l4.retainAll(l5);
		
		System.out.println(l4);
		
	}

}
