package ObjectWithForLoopConditions;

public class UseStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Student student1=new Student();
	student1.studentName="Arun";
	student1.rollNo=34;
	student1.isPresent=true;
	student1.isMale=true;
	
	
	Student student2=new Student();
	student2.studentName="Lakshmi";
	student2.rollNo=56;
	student2.isPresent=true;
	student2.isMale=false;
	
Student student3=new Student();
student3.studentName="Varun";
student3.rollNo=67;
student3.isPresent=true;
student3.isMale=true;
		
		Student students[]=new Student[3];
		students[0]=student1;
		students[1]=student2;
		students[2]=student3;
		
		for(int i=0;i<students.length;i++) {
			if(students[i].isMale==true) {
				System.out.println("NAME : "+students[i].studentName+"//"+"ROLL NO : "+students[i].rollNo);
			}
		}
	}
}
class Student{
	String studentName;
	int rollNo;
	boolean isPresent;
	boolean isMale;
}
