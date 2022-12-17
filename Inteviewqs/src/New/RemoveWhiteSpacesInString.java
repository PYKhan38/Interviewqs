package New;

public class RemoveWhiteSpacesInString {

	public static void main(String[] args) {
		
		String s=" Rome is   not built in a day";
		
	    String f=s.replaceAll("\\s", "");
	    
	    System.out.println(f);
		
		

	}

}
