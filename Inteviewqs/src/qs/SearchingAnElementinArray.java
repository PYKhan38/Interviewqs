package qs;

public class SearchingAnElementinArray {

	public static void main(String[] args) {

		int a[]= {10,20,40,50,30};
		
	    System.out.println(a.length);
		
		int srch= 40;
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(srch==a[i])
			{		
				System.out.println("40 is there in the array"+" "+ i);			
				
			}
			
		}
	}

}
