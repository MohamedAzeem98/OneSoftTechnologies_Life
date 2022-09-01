package forLoopWithConditions;

public class VowelsTogetAsAnswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="helloworld";
		String a=" ";String b=" ";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				a=a+str.charAt(i);
				}else
					b=b+str.charAt(i);
		}
		System.out.println(a);
		System.out.println(b);
		
		
	}
}
