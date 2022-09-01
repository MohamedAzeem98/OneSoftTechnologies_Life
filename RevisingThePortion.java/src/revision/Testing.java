package revision;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="priya age 25 year 1995";
		
	String[] word=	str.split("[A-Z]^+");
	
	 System.out.println(word[0]+word[1]);
}

}
