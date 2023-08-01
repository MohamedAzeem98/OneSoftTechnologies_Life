package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcdef abc abcdefgh";
		
		Pattern pa=Pattern.compile("[^abc]");
		
		Matcher m=pa.matcher(str);
		while(m.find()) {
			System.out.println(m.group());
		}
		
		
	
	
	
	
	
	
	
	}

}
