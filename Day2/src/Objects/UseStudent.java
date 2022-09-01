package Objects;

public class UseStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stud1=new Student();
		stud1.name="Mohamed Azeem S";
		stud1.rollNumber=45;
		stud1.tamil=87;
		stud1.english=88;
		stud1.maths=92;
		stud1.physics=77;
		stud1.chemistry=67;
		stud1.Csc=90;
		
		stud1.total=stud1.tamil+stud1.english+stud1.maths+stud1.physics+stud1.chemistry+stud1.Csc;
		stud1.average=stud1.total/6;
		
		System.out.println("STUDENT NAME : "+stud1.name+" "+" "+"\nROLL NO : "+stud1.rollNumber);
		System.out.println("TAMIL : "+stud1.tamil+" "+"ENGLISH :"+stud1.english+" "+"MATHS : "+stud1.maths+" "+"PHY :"+stud1.physics+" "+"CHEM :"+stud1.chemistry+" "+"CSC : "+stud1.Csc);
		
		System.out.println("TOTAL : "+stud1.total+" "+"AVERAGE : "+stud1.average);
		
		//Student2
		
		Student stud2=new Student();
		stud2.name="RAJA";
		stud2.rollNumber=55;
		stud2.tamil=77;
		stud2.english=98;
		stud2.maths=62;
		stud2.physics=57;
		stud2.chemistry=87;
		stud2.Csc=60;
		
		stud2.total=stud2.tamil+stud2.english+stud2.maths+stud2.physics+stud2.chemistry+stud2.Csc;
		stud2.average=stud2.total/6;
		
		System.out.println();
		System.out.println("STUDENT NAME : "+stud2.name+" "+" "+"\nROLL NO : "+stud2.rollNumber);
		System.out.println("\nTAMIL : "+stud2.tamil+" "+"\nENGLISH :"+stud2.english+" "+"\nMATHS : "+stud2.maths+" "+"\nPHY :"+stud2.physics+" "+"\nCHEM :"+stud2.chemistry+" "+"\nCSC : "+stud2.Csc);
		
		System.out.println("\nTOTAL : "+stud2.total+" "+"\nAVERAGE : "+stud2.average);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
