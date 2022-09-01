package lmsRevision;

public class EqualsWithVerifying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n1="Bhavani";
		String n2="bhavani";
		
		if(n1==n2) {
			System.out.println("same memory");
		}else
			System.out.println("different memory");  //== --->Memory verification
		
	}
}
