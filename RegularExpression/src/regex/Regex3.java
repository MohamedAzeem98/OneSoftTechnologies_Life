package regex;                     //CharacterClass

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Pattern p=Pattern.compile("[a-zA-Z][0-3]");
	Matcher m=p.matcher("E2");
	if(m.matches()) {
		System.out.println("Yes");
	}
	
	
	
	}

}
