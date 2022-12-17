package qs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {	

	public static void main(String[] args) {
		
		Date d= new Date();
		
		System.out.println(d);
		
		String s= d.toString().replace(' ','-').replace(' ',':');
		
		System.out.println(s);
		
//		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/YYYY  hh:mm a");
//		
//		System.out.println(sdf.format(d));
//		
//		String mystring=sdf.format(d);
//		
//		System.out.println(mystring);
//		
	}

		
		
		
		
		
		/*System.out.println(d.getTime());
		
		System.out.println(d.getMonth());
		
		System.out.println(d.getYear());
		
		Date d1= new Date(2020-10-23);
		
		Date d2= new Date(2022-01-23);
		
		boolean bool1=d1.after(d2);
		
		boolean bool2=d1.before(d2);
		
		int x=d1.compareTo(d2);
		
		System.out.println(bool1);
		
		System.out.println(bool2);
		
		System.out.println(x);*/
		

	
}
