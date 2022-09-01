package arrayList;

public class EngineeringStudent {
	private String name;
	private int age;
	private int id;
	private int fees;
	private boolean isMale;
	
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
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setFees(int fees) {
		this.fees=fees;
	}
	public int getFees() {
		return fees;
	}
	public void setIsMale(boolean isMale) {
		this.isMale=isMale;
	}
	public boolean getIsMale() {
		return isMale;
	}
	
	
	EngineeringStudent(String name,int age,int id,int fees,boolean isMale){
		this.name=name;
		this.age=age;
		this.id=id;
		this.fees=fees;
		this.isMale=isMale;
	}
	
	public String toString() {
		return "NAME : "+name+"\nAGE : "+age+"\nID : "+id+"\nFEES : "+fees+"\nIS MALE ? "+isMale;
	}

}
