
public class VowelsInsideIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] vals= {"apple","orange","grape","Bannana"};
		
		for(int i=0;i<vals.length;i++) {
			if(vals[i].startsWith("a")|| vals[i].startsWith("e")|| vals[i].startsWith("i")|| vals[i].startsWith("e")|| vals[i].startsWith("o") || vals[i].startsWith("u")) {
				System.out.println(vals[i]+" "+vals[i].charAt(0)+" is a vowel");
			}
		}
	}

}
