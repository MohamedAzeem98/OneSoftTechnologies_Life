package forLoopWithConditions;

public class OddEvenCount {                                                           //19-89;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int oddCount=0;int evenCount=0;
		
		for(int i=19;i<=89;i++) {
			if(i%2==0) {
				evenCount++;
			}else
				oddCount++;
		}
		System.out.println("Total even numbers count is : "+evenCount);
		System.out.println("Total Odd numbers count is : "+oddCount);
	}

}
