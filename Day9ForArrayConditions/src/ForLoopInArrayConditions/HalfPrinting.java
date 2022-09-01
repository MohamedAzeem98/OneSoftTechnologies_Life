package ForLoopInArrayConditions;

public class HalfPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[]= {"pulsar","Tvs","Ns","v4"};
		
		for(int i=0;i<arr.length;i++) {
			String str=arr[i].substring(0, arr[i].length()/2);
			System.out.println(str);
		}
		
		
		
		
	}

}
