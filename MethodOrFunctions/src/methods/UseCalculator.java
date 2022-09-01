package methods;										//without return type and without parameters

public class UseCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator c1=new Calculator();
		
		c1.add();
		c1.sub();
		c1.multiply();
		c1.divide();
	}

}
class Calculator{
public void add() {
	int a=3,b=5;
	int c=a+b;
	System.out.println("Addition Result is : "+c);
	}

public void sub() {
	int a=15,b=8;
	int c=a-b;
	System.out.println();
	System.out.println("Subtraction Result is : "+c);
	}

public void multiply() {
	int a=6,b=6;
	int c=a*b;
	System.out.println();
	System.out.println("Multiplication Result is : "+c);
    }

public void divide() {
	int a=9,b=3;
	int c=a/b;
	System.out.println();
	System.out.println("Division Result is : "+c);
    }
}
