package streams;

public class Developer {
	private String name;
	private String role;
	private int yearsOfExperience;
	private boolean isJavaDeveloper;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setRole(String role) {
		this.role=role;
	}
	public String getRole() {
		return role;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience=yearsOfExperience;
	}
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	
	public void setIsJavaDeveloper(boolean isJavaDeveloper) {
		this.isJavaDeveloper=isJavaDeveloper;
	}
	public boolean getIsJavaDeveloper() {
		return isJavaDeveloper;
	}
	
	Developer(String name,String role,int yearsOfExperience,boolean isJavaDeveloper){
		this.name=name;
		this.role=role;
		this.yearsOfExperience=yearsOfExperience;
		this.isJavaDeveloper=isJavaDeveloper;
	}
	
	public String toString() {
		return "NAME: "+getName()+"\nROLE : "+getRole()+"\nYEARS OF EXPERIENCE : "+getYearsOfExperience()+"\nIS JAVA DEVELOPER ? "+getIsJavaDeveloper();
	}
	

}
