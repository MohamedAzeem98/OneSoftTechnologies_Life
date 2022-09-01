package datatypes;

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int empId=67854;
		String empName="AZEEM ";
		float salary=6.7f;
		long mobileNo=9876234512l;
		double incentivesGained=67893432.234562d;
		char availableShift='3';
		boolean underGraduate=true;
		
		System.out.println("DISPLAYING an EMPLOYEE DETAILS : ");
		System.out.println();
		System.out.println("EMPLOYEE NAME : "+empName);
		
		System.out.println("EMPLOYEE ID : "+empId);
		
		System.out.println("SALARY : "+salary+" "+"L.P.A");
		
		System.out.println("INCENTIVES in INR : "+incentivesGained);
		
		System.out.println("AVAILABLE NO OF SHIFTS : "+availableShift);
		
		System.out.println("Are the Employee Graduate ? "+underGraduate);
		
		
	}

}
