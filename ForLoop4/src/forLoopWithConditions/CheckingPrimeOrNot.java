package forLoopWithConditions;

public class CheckingPrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean prime=true;
		int num=59;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				prime=false;
			}
		}
		if(prime==true) {
			System.out.println("Its a Prime Number.....");
		}else
			System.out.println("Its not a PrimeNumber....");
	}

}
