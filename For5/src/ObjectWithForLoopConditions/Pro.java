package ObjectWithForLoopConditions;

public class Pro {												//235

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=235;
		int a,rem=0,rev;
		
		a=num;
		while(num>0) {
			rem=num%10;
			rev=rem+num+num+num;
			num=num/10;
			int ree=rev;
		}
		
		if(num!=0) {
			System.out.println(num);
		}
	}

}
