package lmsRevision;

public class UserChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="bhavani";
		String password="Ganga123";
		
	/*	if(password>="A" && password<="Z" && password>="a" && password<="z" && password>="1" && password<="9") {
			
		}
		*/
		
		
		if(name.equals("bhavani") && password.equals("Ganga123")) {
			System.out.println("Valid user");
		}else
			System.out.println("Invalid");
	}

}
