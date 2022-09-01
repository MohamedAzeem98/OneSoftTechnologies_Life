package methods;

public class UseCollege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	College c1=new College();
	c1.name="Jeppiar";
	c1.fees=190000;
	c1.grade="A";
	c1.code=3116;
	
	College c2=new College();
	c2.name="KCG";
	c2.fees=187000;
	c2.grade="A";
	c2.code=3117;
	
	College c3=new College();
	c3.name="Mnm jec";
	c3.fees=165000;
	c3.grade="A";
	c3.code=3114;
	College[] col= {c1,c2,c3};
	System.out.println(c1.findmaximumFeesCollegeName(col));
	System.out.println(c2.findMinimumFeesCollegeGrade(col));
	
																//minimum-grade/maximum-name;
	}

}
class College{
	String name;
	int fees;
	String grade;
	int code;
	
	public String findMinimumFeesCollegeGrade(College[] C) {
		int min=C[0].fees;
		String str="";
		for(int i=0;i<C.length;i++) {
			if(C[i].fees<min) {
				min=C[i].fees;
				str=C[i].grade;
			}	
		}
		return "CollegeGrade : "+ grade+" \nbecoz it has Minimum fees "+min;
		
	}
	public String findmaximumFeesCollegeName(College[] C) {
	         int max=C[0].fees;
	         String scd="";
	         for(int i=0;i<C.length;i++) {
	        	 if(C[i].fees>max) {
	        		 max=C[i].fees;
	        		 scd=C[i].name;
	        	 }
	         }
	         return "CollegeName : "+name+" \nbecoz it has maximum fees "+max;
	 }
	
	
	
	
}
