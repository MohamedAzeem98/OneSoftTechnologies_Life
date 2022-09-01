package elseif_Conditions;

public class StudentAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ravi=35,ram=15,arun=22;
		
		if(ravi<ram && ravi<arun) {
			System.out.println("ravi is the youngest");
		}
		else if(ram<arun && ram<ravi) {
			System.out.println("ram is the youngest");
		}
		else {
			System.out.println("......arun is the most youngest.....");
		}
	}

}
