package programs;                                    //PRIME NUMBER FROM 1 - 100 PROGRAM

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isPrime=false;
		int count=0,prime=0;
		for(int i=1;i<=100;i++) {
			isPrime=true;
		
		for(int j=2;j<=i/2;j++) {                                
			if(i%j==0) {
				isPrime=false;
			}
		}

	if(isPrime==true) {
		//System.out.println(i+" "+"is a prime no");
		prime=i;
		count++;
	}
	
		
		if(count==5) {
			break;
		
		}
		
		
  }
		System.out.println(prime);
 }
}
