package qs;

public class missingnumberinarrary {

	public static void main(String[] args) {
		
		int a []= {1,3,4,5,6};
		
		int l=a.length;
		
		int sum=0;
		
		System.out.println(l);
		
		for(int i=0; i<l;i++)
		{
			sum=sum+ a[i];
		}
		
		System.out.println(sum);
		
		int sum1=0;
		
		for(int j=1;j<7;j++)
		{
			sum1= sum1+j;			
		}
        System.out.println(sum1);

        int num= sum1-sum;

       System.out.print(num );
	}

}
