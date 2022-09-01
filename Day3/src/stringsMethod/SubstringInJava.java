package stringsMethod;

public class SubstringInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String greeting="Congratulations";
		String message=greeting.substring(0, 7);
		
		System.out.println(message);
		
		String word="HelloWorld";
		String part=word.substring(5, word.length());
		
		System.out.println(part);
	}

}
