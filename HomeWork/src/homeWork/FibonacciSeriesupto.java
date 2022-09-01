package homeWork;

public class FibonacciSeriesupto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=0,n2=1,N;
		int count=20;
		
		for(int i=1;i<=count;i++) {
			System.out.print(n1+" ");
			N=n1+n2;
			n1=n2;
			n2=N;
		}

	}

}
