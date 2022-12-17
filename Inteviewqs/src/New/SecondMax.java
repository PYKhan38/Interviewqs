package New;

public class SecondMax {

	public static void main(String[] args) {
		
		int [] a= {12,13,14,89,97,97,76,109,109,43,56};

		int l=a.length;

		int fmax=a[0];

		int smax=a[0];

		for(int i=0; i<l-1;i++){

		   if(fmax<a[i]){

		    smax=fmax;
		    
		    fmax=a[i];}

		   else if(smax<a[i])
		 {
		    smax=a[i];
		 }
		}

		System.out.println(smax);
		
		System.out.println(fmax);
		}	

	}


