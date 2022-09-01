package practice;

public class Employee {
	private int id;
	private String name;
	private int age;
	private boolean isMale;
	private String role;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	Employee(int id,String name,int age,boolean isMale,String role){
		this.id=id;
		this.name=name;
		this.age=age;
		this.isMale=isMale;
		this.role=role;
	}
	public String toString() {
		return "ID : "+id+"\nNAME : "+name+"\nAGE : "+age+"\nIS MALE : "+isMale+"\nROLE : "+role;
	}
	
}