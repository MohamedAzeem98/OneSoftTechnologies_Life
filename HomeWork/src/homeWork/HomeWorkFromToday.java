package homeWork;

public class HomeWorkFromToday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[5];     //Individual
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		
		int arr1[]= {1,2,3,4};      //bulk
		
		for(int i=arr1.length-1;i>=0;i--) {         //backward itertion
			System.out.println(arr1[i]);
		}
		
		System.out.println();
		for(int i=0;i<arr.length/2;i++) {         //first half forward
			System.out.println(arr[i]);
		}
		System.out.println();
		
		for(int i=arr.length/2;i<arr.length-1;i++) {    //second half forward
			System.out.println(arr[i]);
		}
		
		System.out.println();
		for(int i=arr.length/2;i>=0;i--) {             //reverse firstHalf
			System.out.println(arr[i]);
		}
		System.out.println();
		for(int i=arr.length-1;i>=arr.length/2;i--) {      //secondhalf
			System.out.println(arr[i]);
		}

	}

}
