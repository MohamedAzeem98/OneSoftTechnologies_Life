package homePractice;                       //odd index position

public class SearchingFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String a=args[0];
	char[] word=a.toCharArray();
	
	for(int i=0;i<word.length;i++) {
		if(i%2==0) {
			System.out.println(word[i]);
		}
	}
	
	
	
	
	}

}
