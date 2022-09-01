package multipleCatches;

public class SampleProgramming2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=6;
		int num2=0;
		
		try {
			System.out.println(num1/num2);
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("The Error Occurs......");

	}

}
