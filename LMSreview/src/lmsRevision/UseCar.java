package lmsRevision;

public class UseCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1=new Car();
		
		car1.brand="Hyundai i10";
		car1.color="Grey";
		car1.price=800000;
		
		Car car2=new Car();
		
		car2.brand="Volkswagon";
		car2.color="White";
		car2.price=1600000;
		
		Car car3=new Car();
		
		car3.brand="Maruti Wagon R";
		car3.color="Blue";
		car3.price=600000;
		
		if(car1.price>car2.price && car1.price>car3.price) {
			System.out.println(car1.brand+" is the highest price ");
		}
		else if(car2.price>car3.price && car2.price>car1.price) {
			System.out.println(car2.brand+" is the highest price");
		}
		else
			System.out.println(car3.brand+" is the highest price ");
		
		}

}
