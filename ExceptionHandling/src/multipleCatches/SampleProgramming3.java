package multipleCatches;

public class SampleProgramming3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a=null;
		
		try {
			System.out.println(a.toLowerCase());
		}catch(NullPointerException np) {
			np.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Job is done...");

	}

}
