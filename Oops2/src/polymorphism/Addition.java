package polymorphism;             //METHOD OVERLOADING

public class Addition {
	public float add(int num,int num1) {
		return num+num1;
	}
	public float add(float num,int num1) {
		return num+num1;
	}
	public float add(int num,int num1,int num2) {
		return num+num1+num2;
	}
	public float add(float num,float num1,int num2) {
		return num+num1+num2;
	}

}
