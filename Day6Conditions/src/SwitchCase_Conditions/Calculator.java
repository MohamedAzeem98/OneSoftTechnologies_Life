package SwitchCase_Conditions;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=15,num2=5;
		String operation="ADD";
		switch(operation) {
		case "ADD":
			System.out.println(num1+num2);
			break;
		case "SUBTRACT":
			System.out.println(num1-num2);
			break;
		case "MULTIPLY":
			System.out.println(num1*num2);
			break;
		case "DIVIDE":
			System.out.println(num1/num2);
			break;
		}
	}

}
