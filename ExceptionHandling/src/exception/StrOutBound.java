package exception;

public class StrOutBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="HelloWorld";
		
		try {
			System.out.println(str.charAt(20));
		}catch(StringIndexOutOfBoundsException se) {
			se.printStackTrace();
		}
		finally {
			System.out.println("String error occurs....");
		}
	}

}
