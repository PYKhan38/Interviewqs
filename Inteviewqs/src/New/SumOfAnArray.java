package New;

public class SumOfAnArray {

	public static void main(String[] args) {

		int array[]= {5,6,3,4};
		
		int l=array.length;
		
		int sum=0;
		
		for(int a:array) {
			
		sum=sum+a;
			
		}
		
		System.out.println(sum);
		
	}

}
