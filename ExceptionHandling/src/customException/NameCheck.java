package customException;

public class NameCheck {

	public static void main(String[] args) throws NameCheckException{
		// TODO Auto-generated method stub

		String str="Fahad";
		
		/*if(!str.startsWith("A")) {
			throw new NameCheckException("Not Starts with A ");
		}else {
			System.out.println("Starts with A");
		}
		System.out.println("RESULT ABOVE is shown ");
		*/
		
		try {
		if(!str.startsWith("A")) {
			throw new NameCheckException("Not Starts with A ");
		}else {
			System.out.println("Starts with A");
		  }
		}catch(NameCheckException nc) {
			nc.printStackTrace();
		}
		
		System.out.println("RESULT ABOVE is shown ");
	}

}
