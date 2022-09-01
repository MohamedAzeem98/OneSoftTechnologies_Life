package lmsRevision;

public class RevisionProblem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=16;
		if(num%2==0 && num%5==0) {
		System.out.println("It is not divisible by both of the given......");	
		}
		else if(num%2==0 || num%5==0) {
			System.out.println("It is divisible by one of the given number......");
		}
		else
			System.out.println("INVALID  number........");

	}

}
