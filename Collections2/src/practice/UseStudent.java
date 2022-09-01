package practice;
import java.util.HashMap;
import java.util.Iterator;
public class UseStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Student s1=new Student(121,"Aravindh",23,"BE",true);
	Student s2=new Student(133,"Bharath",25,"BA",true);
	Student s3=new Student(145,"Chandrika",22,"BE",false);
	Student s4=new Student(154,"Devi",24,"BA",false);
	Student s5=new Student(163,"GajaLakshmi",25,"BE",false);
	Student s6=new Student(172,"Hemanth",24,"BA",true);
	Student s7=new Student(183,"Ijiyas",25,"BE",true);
	Student s8=new Student(196,"Jegan",23,"BA",true);
	Student s9=new Student(199,"Kareena",24,"BA",false);
	Student s10=new Student(211,"Lavanya",23,"BE",false);
	
	
	HashMap<Integer,Student>stud=new HashMap<>();
	
	stud.put(s1.getRollNo(), s1);
	stud.put(s2.getRollNo(), s2);
	stud.put(s3.getRollNo(), s3);
	stud.put(s4.getRollNo(), s4);
	stud.put(s5.getRollNo(), s5);
	stud.put(s6.getRollNo(), s6);
	stud.put(s7.getRollNo(), s7);
	stud.put(s8.getRollNo(), s8);
	stud.put(s9.getRollNo(), s9);
	stud.put(s10.getRollNo(), s10);
	
	
	Iterator<Integer>itr=stud.keySet().iterator();
	
	
	while(itr.hasNext()) {
		int k=itr.next();
		if(stud.get(k).getDegree().contains("BE")) {
			System.out.println(stud.get(k));
			System.out.println();
		}
	}
  }

}
