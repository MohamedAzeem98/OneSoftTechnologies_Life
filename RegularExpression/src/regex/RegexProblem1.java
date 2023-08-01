package regex;                                               //General methods
import java.util.regex.*;

public class RegexProblem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
//System.out.println(Pattern.matches("\\d\\D\\s\\S\\w\\W","1a 2g@"));

	String str1="Abcdefghi Abcdefghi Abcdefghijklmno Abcdefghijklmnop";
	
	Pattern p=Pattern.compile("Abcdefghi");
	Matcher m=p.matcher(str1);
	
	while(m.find()) {
		System.out.println(m.group());
		//System.out.println();
		System.out.println(m.start());
		//System.out.println();
		System.out.println(m.end());
	}
	
	
	
	
	
	
	}

}
