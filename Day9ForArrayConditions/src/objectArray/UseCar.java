package objectArray;

 class UseCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1=new Car();
		c1.brand="BMW";
		c1.color="Black";
		c1.isPetrol=true;
		c1.price=2500000;
		
		Car c2=new Car();
		c2.brand="Audi";
		c2.color="Red";
		c2.price=5000000;
		c2.isPetrol=false;
		
		Car cars[]=new Car[2];
		cars[0]=c1;
		cars[1]=c2;
		
		for(int i=0;i<cars.length;i++) {
			System.out.println(cars[i].brand+" "+cars[i].color+" "+cars[i].price);
		}
		
		
	}

}
 class Car{
	 String brand;
	 int price;
	 String color;
	 boolean isPetrol;
 }
