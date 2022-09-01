package stringsMethod;

public class SeparatorIntoSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String course1="JAVA,PHYTON,C++,SQL";
		
		String[] courseList=course1.split(",");
		
		System.out.println(courseList[1]);
		
		String course2="JAVA/PHYTON/C++/SQL";
		
		String []courseList2=course2.split("/");
		
		System.out.println(courseList[3]);
		
		String course3="JAVA_PHYTON_C++_SQL";
		
		
		
		
		
		
		
		
		
	}

}
