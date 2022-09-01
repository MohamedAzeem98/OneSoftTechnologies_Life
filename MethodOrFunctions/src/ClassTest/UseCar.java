package ClassTest;

public class UseCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Car c1=new Car();
	c1.brand="Hyundai i20";
	c1.speed=170;
	c1.price=1200000;
	c1.taxAmount=56000;
	
	Car c2=new Car();
	c2.brand="Honda City";
	c2.speed=198;
	c2.price=1900000;
	c2.taxAmount=100000;
	
	System.out.println(c1.netPrice(c1.price, c1.taxAmount));
	
		System.out.println(c2.netPrice(c2.price, c2.taxAmount));
	}

}
class Car{
	String brand;
	int speed;
	int price;
	int taxAmount;
	
	public int netPrice(int a,int b) {
		return a+b;
	}
}
