package primitiveArrays;

public class ToFindCharFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name[]= {"apple","Mango","Pineapple","Banana"};
	
		for(int i=0;i<name.length;i++) {
			if(name[i].contains("A")|| name[i].contains("E")|| name[i].contains("I")|| name[i].contains("O")|| name[i].contains("U")) {
				System.out.println(name[i]);
			}else
				break;
		}
	}

}
