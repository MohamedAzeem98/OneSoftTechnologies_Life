package ClassTest;

public class UseSchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	School s1=new School();
	s1.name="Aravind";
	s1.std=9;
	s1.fees=45000;
	s1.grade="A";
	
	School s2=new School();
	s2.name="Balaji";
	s2.std=10;
	s2.fees=54000;
	s2.grade="B";
	
	School s3=new School();
	s3.name="Chandru";
	s3.std=11;
	s3.fees=66000;
	s3.grade="B";
	
	School[] sc= {s1,s2,s3};
	System.out.println(s1.findMaximumFees(sc));
	System.out.println(s2.findMinimumFees(sc));
	}

}
class School{
	String name;
	int std;
	int fees;
	String grade;
	
	
	public int findMaximumFees(School[] S) {
		int max=S[1].fees;
		for(int i=0;i<S.length;i++) {
			if(S[i].fees>max) {
				max=S[i].fees;
			}
		}
		return max;
	}
	
	public int findMinimumFees(School[] S) {
		int min=S[1].fees;
		for(int i=0;i<S.length;i++) {
			if(S[i].fees<min) {
				min=S[i].fees;
			}
		}
		return min;
	}
}
