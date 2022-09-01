package ForLoopInArrayConditions;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mobile[]=new String[5];
		
		mobile[0]="2gb Ram";
		mobile[1]="4gb Ram";
		mobile[2]="6gb Ram";
		mobile[3]="8gb Ram";
		mobile[4]="16gb Ram";
		
		int count=0;
		
		for(int i=0;i<mobile.length;i++) {
			System.out.println(mobile[i]);
			count++;
			
		}
		System.out.println(" "+count+"times");
	}

}
