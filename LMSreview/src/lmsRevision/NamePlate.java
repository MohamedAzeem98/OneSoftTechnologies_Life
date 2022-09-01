package lmsRevision;

public class NamePlate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="TN07AH1074";
		String reve="";
		String num="";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				reve=reve+str.charAt(i);
				
			}else {
				num = num + str.charAt(i);
			}
		}
		System.out.println(reve+" ");
		System.out.println(num);
		
		
	}

}
