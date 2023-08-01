package TodaySadBegin;

public class fibi {
	public static void main(String args[]) {
		
		int num1=0,num2=1,N,count=7;
		
		for(int i=0;i<=count;i++) {
			System.out.print(num1+" ");
			N=num1+num2;
			num1=num2;
			num2=N;
		}
	}

}
