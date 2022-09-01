package lms;

public class UseCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Car obj1=new Car();
		
	String[] str=args[0].split(",");
	
	obj1.brand=str[0];
	obj1.colour=str[1];
	obj1.price=Integer.parseInt(str[2]);
	
	System.out.println("BRAND = "+obj1.brand+", "+"COLOUR = "+obj1.colour+", "+"PRICE = "+obj1.price);
		
		
	
	
	
	}
}
	
	
	
	class Car{
		String brand;
		String colour;
		int price;
	}
	
	
	
	
	
	
	
	



