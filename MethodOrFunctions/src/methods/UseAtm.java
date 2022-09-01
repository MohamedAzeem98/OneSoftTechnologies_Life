package methods;

public class UseAtm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Atm a1=new Atm();
		a1.beneficiaryName="Gokul Hari";
		a1.mainBalance=1234567.75f;
		a1.depositAmount=500000f;
		
		Atm a2=new Atm();
		a2.beneficiaryName="Jeffrey paul";
		a2.mainBalance=570000.567f;
		a2.depositAmount=60000f;
		
		Atm as[]= {a1,a2};
		
		//findCredit=mainbalance+depositAmount
		//findDebit =mainbalance-depositAmount
		a1.findCredit(as);
		a2.findDebit(as);

	}

}
class Atm{
	String beneficiaryName;
	float mainBalance;
	float depositAmount;
	
	public void findCredit(Atm[] A) {
		
		for(int i=0;i<A.length;i++) {
			System.out.println("CREDITED AMOUNT is : "+( A[i].mainBalance+A[i].depositAmount));
			
		}
		
	}
	public void findDebit(Atm[] A) {
		
		for(int i=0;i<A.length;i++) {
			 System.out.println("DEBITED AMOUNT is : "+(A[i].mainBalance-A[i].depositAmount));
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
