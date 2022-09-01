package forLoop1;

public class OneSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1;
		for(int i=1;i<=5;i++) {
			System.out.println(num);
			num=(num*10)+1;
		}
		System.out.println();
		
		int num1=3,num2=3;
		for(int i=1;i<=5;i++) {
			System.out.println(num1);
			num1=num1*10+num2;
		}

	}

}
