package stringsMethod;

public class CharArrayingInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		String name=" ";
		char[] separate=name.toCharArray();
		
		
		System.out.println(separate[5]);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Hello");
		}
	}

}
