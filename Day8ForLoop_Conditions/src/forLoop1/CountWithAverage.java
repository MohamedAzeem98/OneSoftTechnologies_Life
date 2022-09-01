package forLoop1;

public class CountWithAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int total=0;
		int count=0;
		
		for(int i=1;i<=10;i++) {
			total=total+i;
			count++;
		}
		int average=total/count;
		System.out.println("Count 0r No of times : "+count);
		System.out.println("Total of  i  : "+total);
		System.out.println("Average of i is : "+average);
		
		
	}

}
