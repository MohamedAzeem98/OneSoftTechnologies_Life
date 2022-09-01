package primitiveArrays;

public class FindMaxMinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"JAVA","PYTHON","C++","C"};
		String big="";
		String small=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length()>big.length()) {
				big=arr[i];
			}else if(arr[i].length()<small.length()) {
				small=arr[i];
				}
			}
		System.out.println(big);
		System.out.println(small);
	}

}
