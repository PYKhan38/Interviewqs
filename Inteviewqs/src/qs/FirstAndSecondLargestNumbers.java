package qs;

public class FirstAndSecondLargestNumbers {

	public static void main(String[] args) {
		
        int a[]= {10,20,40,50,30};
		
	    System.out.println(a.length);
	    
	    int fmax=a[0];
	    
	    int smax=a[0];	    
	    
	    for(int i=0;i<a.length;i++) {   	
	    	 
	    			if(fmax<a[i]) {
	    			
	    			smax=fmax;
	    			
	    			fmax=a[i];
	    			}
	    			
	    		else if (smax<a[i]){
	    				
	    				smax=a[i];	    				
	    			}  			
	    				    	
	    	
	    		
	    	}      	
	    
	    System.out.println(fmax +"-"+ smax);
	    

	}

}
