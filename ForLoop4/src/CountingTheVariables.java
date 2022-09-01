
public class CountingTheVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] arr= {"apple","orange","grape","banana"};
		
	/*	for(int i=0;i<arr.length;i++) {
			if(arr[i].length()%2==0) {
				System.out.println(arr[i].substring(arr[i].length()/2-1,arr[i].length()/2+1));
			}else {
				System.out.println(arr[i].charAt(arr[i].length()/2));
			}
		}
		*/
		
		for(int i=0;i<arr.length;i++) {
			char let=arr[i].charAt(arr[i].length()/2);
			if(let=='a'||let=='e'|| let=='i'||let=='o'||let=='u') {
				System.out.println(arr[i]);
			}
		}
	}

}
