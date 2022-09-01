package customException;

public class CheckRetireMent {

	public static void main(String[] args) throws AgeRetirementException,Exception {
		// TODO Auto-generated method stub
		int age=57;
		try {
			if(age>60) {
				//throw new AgeRetirementException(" eligible");
				System.out.println("eligible");
			}else {
				throw new AgeRetirementException("Not eligible for Retirement");
			}
			
		}catch(AgeRetirementException ar) {
			ar.printStackTrace();
		}
		
	}

}
