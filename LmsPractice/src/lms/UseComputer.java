package lms;

public class UseComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer obj1=new Computer();
		
		String[]str=args[0].split(",");
		
		obj1.brand=str[0];
		obj1.displaySize=Float.parseFloat(str[1]);
		obj1.price=Integer.parseInt(str[2]);
		obj1.taxAmount=Integer.parseInt(str[3]);
		
	//	int netPrice=obj1.price+obj1.taxAmount;
		
		System.out.println("BRAND : "+obj1.brand+", "+"DisplaySize : "+obj1.displaySize+", "+"NET PRICE : "+(obj1.price+obj1.taxAmount));
		
		
		
		
		
		
		
		
		
		
	}

}

class Computer{
	String brand;
	float displaySize;
	int price;
	int taxAmount;
}
