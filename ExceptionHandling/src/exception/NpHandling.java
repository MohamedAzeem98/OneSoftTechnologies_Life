package exception;

public class NpHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a=null;
		
		//String s=a.toLowerCase();
		try {
			System.out.println(a.toLowerCase());	
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		//System.out.println("program is done");
		finally {
			System.out.println("Job");
		}

	}

}
