package qs;

public class revereseInteger {

	public static void main(String[] args) {

		int i=12345;
		 
	    int	rev=0;
		
	  while(i!=0)
	    {
	    	rev= rev*10 + i%10; //rev=5	
	    	
	    	i=i/10; 	    	
	    }    
	    
	    System.out.println(rev);
		
		
	     
	    
	  /* StringBuffer stb= new StringBuffer(String.valueOf(i));
	    
	    System.out.println(stb.reverse());
	    
	    StringBuilder stbl= new StringBuilder();
	    
	    stbl.append(i);
	    
	    System.out.println(stbl.reverse());*/ 
		
	}

}
