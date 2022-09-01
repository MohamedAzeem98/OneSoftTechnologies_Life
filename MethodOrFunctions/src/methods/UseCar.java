package methods;

public class UseCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car();
		c1.brand="Hyndai Eon";
		c1.price=1200000;
		c1.color="Grey";
		c1.taxAmount=57000;
		
		Car c2=new Car();
		c2.brand="Mahindra Xylo";
		c2.price=1800000;
		c2.color="White";
		c2.taxAmount=80000;
		
		System.out.println(c1.findMaxPriceBrand(c1, c2));
		Car[] cars= {c1,c2};
		
		System.out.println(c1.findMinimumPrice(cars));
		
		
	}

}
class Car{
	String brand;
	int price;
	String color;
	int taxAmount;
	
	public String findMaxPriceBrand(Car a,Car b) {
		if(a.price>b.price) {
			return a.brand;
		}
		else {
			return b.brand;
		}
	}
		
		public String findMinimumPrice(Car[] a) {
			int min=a[0].price;
			for(int i=0;i<a.length;i++) {
				if(a[i].price<min) {
					min=a[i].price;
					
				}
			}
			return "min price"+min;
		}
	
}
