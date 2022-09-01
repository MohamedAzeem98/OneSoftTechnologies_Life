package exception;

public class NumberingForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="101df";
		try {
			System.out.println(Integer.parseInt(s));
		}catch(NumberFormatException nf) {
			nf.printStackTrace();
		  }
		finally {
			System.out.println("All the above five is error example.....");
		}

	}

}
