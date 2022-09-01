package ForLoopInArrayConditions;

public class Marker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float price[]=new float[4];
		
		price[0]=15;
		price[1]=30;
		price[2]=45;
		price[3]=60;
		
		for(int i=0;i<price.length/2;i++) {
			System.out.println(price[i]);
		}
		System.out.println();
		for(int i=price.length/2;i<price.length;i++) {
			System.out.println(price[i]);
		}
		System.out.println();
		for(int i=price.length-1;i>=price.length/2;i--) {
			System.out.println(price[i]);
		}
		
		
		
	}

}
