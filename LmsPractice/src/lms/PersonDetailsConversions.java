package lms;

public class PersonDetailsConversions {
	
	public static void main(String args[]) {
		
		String details=args[0];
		String personDetails[]=details.split(",");
		
		String personName=personDetails[0];
		int age=Integer.parseInt(personDetails[1]);
		
		String mailId=personDetails[2];
		
		System.out.println("Name = "+personName+", "+"Age = "+age+", "+"MailId : "+mailId);
		
		
	}

}
