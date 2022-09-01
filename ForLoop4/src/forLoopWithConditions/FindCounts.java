package forLoopWithConditions;

public class FindCounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="TN-32-AK-3399";
		
		int letterCount=0;
		int numberCount=0;
		int spCount=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='z') {
				letterCount++;
			}else if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				numberCount++;
			}
			else
				spCount++;
		}
		System.out.println("LETTERS COUNT : "+letterCount);
		System.out.println("NUMBERS COUNT : "+numberCount);
		System.out.println("SPECIALS COUNT : "+spCount);
	}

}
