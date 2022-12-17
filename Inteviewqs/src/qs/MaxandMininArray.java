package qs;

public class MaxandMininArray {

	public static void main(String[] args) {
		
		int a[] = {50,23,43,98,2};
		
		int l= a.length;
		
		System.out.println(l);
		
		int min= a[0];
		int max= a[0];
		
		for(int i=1; i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			else if(a[i]>max)
			{
				max=a[i];
			}
		}

		System.out.println("Minimum Element in Array is" + " "+ min);
		
		System.out.println("Minimum Element in Array is" + " "+ max);
	}

}
