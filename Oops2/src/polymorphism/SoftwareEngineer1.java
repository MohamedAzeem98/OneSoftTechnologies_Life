package polymorphism;                   //METHOD OVERRIDING

public class SoftwareEngineer1 extends Engineer1{
	private String department;
	private int passingYear;
	
	public void setDepartment(String department) {
		this.department=department;
	}
	public String getDepartment() {
		return department;
	}
	public void setPassingYear(int passingYear) {
		this.passingYear=passingYear;
	}
	public int getPassingYear() {
		return passingYear;
	}
	
public SoftwareEngineer1(String name,int age,boolean isGraduated,String department,int passingYear){
		super(name,age,isGraduated);
		
		this.department=department;
		this.passingYear=passingYear;
		
	}
	
	public String toString() {
		return "NAME : "+ super.getName()+"\nAGE : "+super.getAge()+"\nGRADUATED : "+super.getIsGraduated()+"\nDEPARTMENT : "+department+"\nPASSING YEAR : "+passingYear;
	}

}
