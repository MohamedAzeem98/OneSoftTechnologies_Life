package forLoop1;

public class StringingReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="OneSoft";
		String reve=" ";
		
		/*for(int i=str.length()-1;i>=0;i--) {
			reve=reve+str.charAt(i);
		}
		System.out.println(reve);
		System.out.println();
		for(int i=str.length()-1;i>=0;i--) {
			reve=reve+str.charAt(i);
			System.out.println(reve);
		}
		*/
		System.out.println();
		for(int i=0;i<=str.length()-1;i++) {
			reve=reve+str.charAt(i);
			System.out.println(reve);
		}
		
		

	}

}
