package ObjectWithForLoopConditions;

public class UseCollegeStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CollegeStudent c1=new CollegeStudent();
		c1.name="Akash";
		c1.age=16;
		c1.rollNo=13;
		c1.mobileNo=9865432178l;
		c1.isPresent=true;
		
		CollegeStudent c2=new CollegeStudent();
		c2.name="Bala";
		c2.age=15;
		c2.rollNo=35;
		c2.mobileNo=9999999911l;
		c2.isPresent=false;
		
		CollegeStudent c3=new CollegeStudent();
		c3.name="Chandru";
		c3.age=15;
		c3.rollNo=55;
		c3.mobileNo=9876543210l;
		c3.isPresent=true;
		
		CollegeStudent c4=new CollegeStudent();
		c4.name="Dinesh";
		c4.age=16;
		c4.rollNo=62;
		c4.mobileNo=6785432190l;
		c4.isPresent=false;
		
		
		
		CollegeStudent cs[]=new CollegeStudent[4];
		cs[0]=c1;
		cs[1]=c2;
		cs[2]=c3;
		cs[3]=c4;
		
		for(CollegeStudent C:cs) {
			if(C.rollNo>=1 && C.rollNo<=20) {
				System.out.println("A section "+"\nNAME : "+C.name+" , "+"AGE : "+C.age);
				
			}else if(C.rollNo>=21 && C.rollNo<=40) {
				System.out.println();
				System.out.println("B section "+"\nNAME : "+C.name+" , "+"AGE : "+C.age);
			}else if(C.rollNo>=41 && C.rollNo<=60) {
				System.out.println();
				System.out.println("C section "+"\nNAME : "+C.name+" , "+"AGE : "+C.age);
			}else {
				System.out.println();
				System.out.println("D section "+"\nNAME : "+C.name+" , "+"AGE : "+C.age);
			}
		}
	}

}
class CollegeStudent{
	String name;
	int age;
	int rollNo;
	long mobileNo;
	boolean isPresent;
}
