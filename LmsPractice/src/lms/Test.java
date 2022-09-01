package lms;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str=args[0];
		
		String[] arr=str.split("/");
		
		String s1=arr[0].toUpperCase();
		
		char s2=arr[1].charAt(arr[1].length());
		
		String s3=arr[2].substring(1, 3);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		
		
		
	}

}
