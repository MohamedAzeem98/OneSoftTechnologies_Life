package customException;

public class CheckAge {

	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub
		
		int age=12;
		
		//using only throws block
		
		/*if(age<18) {
			throw new AgeException("Not Eligible");
		}else {
			System.out.println("Eligible");
		}
		System.out.println("Election closed");
		*/

		
		
		//using try & catch block
		try {
		if(age<18) {
			throw new AgeException("Not Eligible");
		}else {
			System.out.println("Eligible");
		}
		
		}catch(AgeException ae) {
			ae.printStackTrace();
		}
		System.out.println("Election closed");
	}

}
