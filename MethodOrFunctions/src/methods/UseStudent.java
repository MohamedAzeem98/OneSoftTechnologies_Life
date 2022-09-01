package methods;       
public class UseStudent {
public static void main(String[] args) {
	
	Student s1=new Student();
	
	s1.displayMarks(87,93,56,77,89);
	System.out.println();
	System.out.println("TOTAL MARKS SECURED : "+s1.findTotal(87,93,56,77,89));
	}

}
class Student{
	//without return type and with parameters
	public void displayMarks(int tamil,int english, int maths,int science,int social) {
		System.out.println("Tamil : "+tamil+"\nEnglish : "+english+"\nMaths : "+maths+"\nScience :  "+science+"\nSocial :  "+social);
	
	}
	//with return type and with parameters
	public int findTotal(int tamil,int english, int maths,int science,int social) {
		int result=tamil+english+maths+science+social;
		return result;
	}
	
}
