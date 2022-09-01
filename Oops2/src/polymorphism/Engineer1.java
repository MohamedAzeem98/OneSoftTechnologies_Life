package polymorphism;                      //METHOD OVERRIDING

public class Engineer1 {
	private String name;
	private int age;
	private boolean isGraduated;
	
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setIsGraduated(boolean isGraduated) {
		this.isGraduated=isGraduated;
	}
	public boolean getIsGraduated() {
		return isGraduated;
	}
	
	Engineer1(String name,int age,boolean isGraduated){
		this.name=name;
		this.age=age;
		this.isGraduated=isGraduated;
	}
	public String toString() {
		return "Name : "+name+" Age : "+age+" isGraduated : "+isGraduated;
		}

}
