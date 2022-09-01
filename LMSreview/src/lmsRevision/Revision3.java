package lmsRevision;
																//(num%10==num/10)
public class Revision3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=85,b=42,c=72;
		if(a>b && a>c) {
			System.out.println(a+" is greater than "+b+","+c);
		}else if(b>a && b>c) {
			System.out.println(b+" is greater than "+a+","+c);
		}
		/*else if(c>a && c>b) {
			System.out.println(c+" is greater than "+a+","+b);
		}
		*/
		else {
			System.out.println(c+" is greater than "+a+","+b);
		}
		
		}

}
