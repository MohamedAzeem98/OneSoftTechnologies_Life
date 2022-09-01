package methods;
public class UseBike {
public static void main(String[] args) {
	Bike b1=new Bike();
	b1.brand="Royal Enfield ";
	b1.speed=100;
	b1.price=125000;
	b1.taxAmount=27000;
	
	Bike b2=new Bike();
	b2.brand="Pulsar 180";
	b2.speed=150;
	b2.price=95000;
	b2.taxAmount=18000;
	
	Bike b3=new Bike();
	b3.brand="Tvs";
	b3.speed=80;
	b3.price=67000;
	b3.taxAmount=10000;
		
	System.out.println(b3.findNetPrice(b1.price, b1.taxAmount));
	System.out.println();
	System.out.println(b1.findNetPrice(b2.price, b2.taxAmount));
	System.out.println();
	System.out.println(b2.findNetPrice(b3.price, b3.taxAmount));
	}

}
class Bike{
	String brand;
	int speed;
	int price;
	int taxAmount;
	
	public String findNetPrice(int price,int taxAmount) {
		
		
		return "NetPrice= "+(price+taxAmount);
	}
	
}
