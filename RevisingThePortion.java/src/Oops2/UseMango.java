package Oops2;

public class UseMango {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mango ma=new Mango();
		
		ma.color="Yellow";
		ma.isEdible=true;
		ma.name="Maambalam";
		
		System.out.println(ma.name+ma.isAvailable("summer"));
		
		
	}

}
