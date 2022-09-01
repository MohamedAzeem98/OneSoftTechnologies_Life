package primitiveArrays;

public class PrintMaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,6,8,34,5,8};
		
		int max=0;
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			else if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}
