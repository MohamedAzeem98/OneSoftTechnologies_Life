package recursionFunction;

public class FactorialFunction {
	
	 static int fact(int n) {
			
		if(n!=0) {
			return n*fact(n-1);
		}
		else {
			return 1;
		}
	}
	
public static void main(String args[]) {
	int n=2,result;
	
	result=fact(n);
	System.out.println("The Factorial of "+n+" "+" is "+result);
	
	
	
	
	
	}

	

}
