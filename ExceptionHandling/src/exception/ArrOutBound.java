package exception;

public class ArrOutBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5};
		
		try {
			System.out.println(arr[6]);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			ae.printStackTrace();
		}
		finally {
			System.out.println("Array Index out Of error showing...");
		}

	}

}
