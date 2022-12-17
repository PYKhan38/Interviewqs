package qs;
public class SumOfArray {

	public static void main(String[] args) {
		
		int a[]= {2,5,7,9, 8};
		
		int sum=0;
		
//		for(int s: a) {
//			
//			sum=sum+s;
//			
//		}
		for(int i=0; i<a.length; i++) {
			
			sum= sum+a[i];
		}
        System.out.println(sum);
	}

}
