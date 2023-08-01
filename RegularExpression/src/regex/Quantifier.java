package regex;            //Quantifier

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String str="agnngaan";
		Pattern p=Pattern.compile("[agn]?");
		Matcher m=p.matcher(str);
		
		if(m.matches()) {
			System.out.println(m.start());
		}
		*/
		
		//String str="nagnaagggggn";
		//System.out.println(Pattern.matches("{n}", str));
		
		
		
		/*Pattern p=Pattern.compile("[100*0]");
		Matcher m=p.matcher("1000000");
		
		while(m.find()) {
			System.out.println(m.group());
		}
		*/
		
		
		System.out.println(Pattern.matches("[agh]*", "aaagggh"));
		
		
		
		
		

	}

}
