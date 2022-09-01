package multipleCatches;

public class SampleProgramming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []nums= {1,2,3,4,5,6};
		
		try {
			System.out.println(nums[7]);
		}catch(ArrayIndexOutOfBoundsException ai) {
			ai.printStackTrace();
		}catch(IndexOutOfBoundsException ie) {
			ie.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("The End.....");

	}

}
