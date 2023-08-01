package recursionFunction;

public class FibonacciSeriesRecursion {

	public static void main(String[] args) {
		
		int count=6;int i=0;
		
		fib(count,i);
		//fib(count);
	}
	static int n1=0,n2=1,N=0 ;
		
	static void fib(int count,int i) {
			
		while (i <= count) {
		      System.out.print(n1 +" ");

		      int N = n1 + n2;
		     n1=n2;
		     n2=N;
		     i++;
		    }
		    
		
		
	}
	
	
	
	
	
	
	

}
