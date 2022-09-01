package lms;

public class PersonDetails {
	public static void main(String args[]) {
		
		String name=args[0];
		int age=Integer.parseInt(args[1]);
		float height=Float.parseFloat(args[2]);
		boolean status=Boolean.parseBoolean(args[3]);
		
		System.out.println("Name = "+name+", "+"Age = "+age+", "+"Height = "+height+", "+"Status = "+status);
		
	}

}
