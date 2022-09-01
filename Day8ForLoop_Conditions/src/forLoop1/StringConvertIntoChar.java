package forLoop1;

public class StringConvertIntoChar {
	public static void main(String[] args) {
		String word=args[0];
		char letter=word.charAt(0);
		if(letter=='N') {
			System.out.println("NORTH");
		}
		else if(letter=='E') {
			System.out.println("EAST");
		}
		else if(letter=='W') {
			System.out.println("WEST");
		}
		else
		{
			System.out.println("SOUTH");
		}
		
	}

}
