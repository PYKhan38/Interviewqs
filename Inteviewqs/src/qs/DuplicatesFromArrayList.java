package qs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesFromArrayList {

	public static void main(String[] args) {
		
		String [] str= {"tanusree","kajal","tapsi","tanusree"};
		
		ArrayList<String> al= new ArrayList<String>();	//	Arrays.asList(null) --to convert array to arraylist
		
//		Collections.addAll(al, str);  //to add array and arrayList
		
		System.out.println(al);
		
		for(String name:str) {
			
			al.add(name);
		}
	System.out.println(al);
		
		/*al.add("yousuf");
		
		al.add("pooja");
		
		al.add("sneha");
		
		al.add("kajal");
		
		al.add("Tamanna");
		
		al.add("yousuf");
		
		al.add("sneha");*/
		
//		Set<String> s= new HashSet<String>();
//		
//		for(String name:al) {
//			
//			if(s.add(name)==false) {
//				
//				System.out.println(name);
//			}
//			
//		}
	}

}
