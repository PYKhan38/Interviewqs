package New;

public class CountCharacterOccurance {

	public static void main(String[] args) {
		
		String s="Meerabhai";
		
		int ini=s.length();
		
		int fin=s.replace("e","").length();
		
		int res= ini-fin;
		
		System.out.println(res);
		
	}

}
