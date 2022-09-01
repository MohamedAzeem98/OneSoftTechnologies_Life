package forLoop1;

public class FactorialWithSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int fact=1;
		for(int i=1;i<=5;i++) {
			fact=fact*i;
			System.out.println("Factorial of "+i+" :  "+fact);
		}
	}

}
