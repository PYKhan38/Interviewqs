package New;

public class SearchingAnElementInArray {

	public static void main(String[] args) {
		
		int array[]= {5,6,7,8,9,10};
		
		int num= 10;
		
		for(int a:array) {			
			
			if(a==num) {
				
				System.out.println("The element is exist");
				
				break;
			}
//			else {
//				
//				System.out.println("The element does not exist");
//			}
		}

	}

}
