package lmsRevision;

public class ProgrammingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[]= {"orange","grape","apple","banana"};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length()%2==0) {
				System.out.println(arr[i].substring(arr[i].length()/2-1,arr[i].length()/2+1));
				
			}else {
				System.out.println(arr[i].charAt(arr[i].length()/2));
			}
		}
	}

}
