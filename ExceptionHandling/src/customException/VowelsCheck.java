package customException;

public class VowelsCheck {

	public static void main(String[] args) throws VowelCheckingException {
		// TODO Auto-generated method stub
		String str="helloworld";
		
	/*	if(!str.contains("A")||!str.contains("E")||!str.contains("I")||!str.contains("O")||!str.contains("U")) {
			throw new VowelCheckingException("not contains UpperCase Vowels");
		}else {
			System.out.println("It contains the vowels");
		}
		System.out.println("Job over");
		*/
		
		try {
			if(!str.contains("A")||!str.contains("E")||!str.contains("I")||!str.contains("O")||!str.contains("U")) {
				throw new VowelCheckingException("not contains UpperCase Vowels");
			}else {
				System.out.println("It contains the vowels");
			}
		}
		catch(VowelCheckingException vc) {
			vc.printStackTrace();
		   }
		
		System.out.println("Job over");
		}
	}


