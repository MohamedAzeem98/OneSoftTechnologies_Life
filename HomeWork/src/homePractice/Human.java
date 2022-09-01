package homePractice;

public class Human {
	private String name;
	private String initial;
	private int age;
	private boolean isMale;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInitial() {
		return initial;
	}
	public void setInitial(String initial) {
		this.initial = initial;
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
	
	Human(String name,String initial,int age,boolean isMale){
		this.name=name;
		this.initial=initial;
		this.age=age;
		this.isMale=isMale;
		
	}
	public String toString() {
		return "Name:"+name+", "+"initial:"+initial+", "+"Age:"+age+", "+"Is male:"+isMale;
	}

}
