package elseif_Conditions;

public class StudentResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tamil=89;
		int english=90;
		int maths=99;
		
		if(tamil>english && tamil>maths) {
			System.out.println("Tamil mark is the highest.......");
		}
		    else if(english>maths && english>tamil){
			System.out.println("English mark is the highest......");
		}
			else {
			System.out.println("Maths mark is the highest........");
	
		}
	}

}
