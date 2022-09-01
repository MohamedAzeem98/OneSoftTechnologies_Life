package ForLoopInArrayConditions;

public class Bike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String bike[]= {"yamaha","pulsar","splendor","Royal Enfield"};	
		
		for(int i=0;i<bike.length;i++) {
		System.out.println(bike[i].charAt(0));
		
		}
		System.out.println();
		for(int i=0;i<bike.length;i++) {
			System.out.println(bike[i].charAt(1));
		}
		System.out.println();
		for(int i=0;i<bike.length;i++) {
			System.out.println(bike[i].charAt(bike[i].length()-1));
		}
		
	}

}
