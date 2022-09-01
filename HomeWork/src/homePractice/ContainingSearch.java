package homePractice;            //finding if a string contains capital words

public class ContainingSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str=args[0].split(",");
		//int count=0;
		
		for(int i=0;i<str.length;i++) {
			if(str[i]==str[i].toUpperCase()) {
				
				System.out.println(str[i]);
			}
		}

	}

}
