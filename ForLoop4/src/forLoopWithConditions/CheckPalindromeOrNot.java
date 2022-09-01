package forLoopWithConditions;

public class CheckPalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Malayalam";
		String reve="";
		
		for(int i=str.length()-1;i>=0;i--) {
			reve=reve+str.charAt(i);
		}
		if(str.equalsIgnoreCase(reve)) {
			System.out.println("Its A PLAINDROME WORD");
		}else
			System.out.println("Not A Plaindrome word");
		
		
		
		
		
		
	}

}
