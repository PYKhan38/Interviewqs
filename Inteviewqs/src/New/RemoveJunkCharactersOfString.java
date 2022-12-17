package New;

public class RemoveJunkCharactersOfString {

	public static void main(String[] args) {		
					
			String s="a1bb2ccc3dddd4";
			
		    String s1=s.replaceAll("[^0-9]","");
		    
		    String s2=s.replaceAll("[^a-z]","");
		    
		    System.out.println(s1.toCharArray());
		    
		    System.out.println(s2.toCharArray());

	}

}
