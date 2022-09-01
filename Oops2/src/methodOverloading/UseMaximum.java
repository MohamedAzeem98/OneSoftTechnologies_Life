package methodOverloading;

public class UseMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maximum max=new Maximum();
		
		System.out.println(max.findMaximum1(2, 5));
		System.out.println();
		System.out.println(max.findMaximum1(3, 9, 7));
		System.out.println();
		System.out.println(max.findMaximum1("ram","ajaykumar", "michaelJackson"));
	
	}

}
