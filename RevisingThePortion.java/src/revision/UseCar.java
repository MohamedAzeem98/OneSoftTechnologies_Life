package revision;

public class UseCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car();
		c1.brand="Tata";
		c1.price=560000;
		c1.taxAmount=5;
		c1.isAirBag=true;
		
		Car c2=new Car();
		c2.brand="Hyundai";
		c2.price=600000;
		c2.taxAmount=6;
		c2.isAirBag=true;
		
		Car cars[]= {c1,c2};
		
		for(int i=0;i<cars.length;i++) {
			System.out.println("BRAND : "+cars[i].brand+" , "+"NETPRICE : "+(cars[i].price+(cars[i].price*5/100)-(cars[i].price*8/100)));
		}
	}
}
class Car{
	String brand;
	int price;
	int taxAmount;
	int netPrice;
	boolean isAirBag;
}