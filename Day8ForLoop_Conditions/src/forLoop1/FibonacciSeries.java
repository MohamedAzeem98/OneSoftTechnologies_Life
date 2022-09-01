package forLoop1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0,num2=1;
		int N,count=10;
		
		for(int i=1;i<=count;i++) {
			System.out.println(num1+" "+i+" times ");
			N=num1+num2;
			num1=num2;
			num2=N;
			
		}

	}

}
