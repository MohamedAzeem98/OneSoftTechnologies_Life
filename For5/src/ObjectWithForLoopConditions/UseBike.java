package ObjectWithForLoopConditions;

public class UseBike {

	public static void main(String[] args) {
		Bike b1=new Bike();
		b1.numPlate="TN-07-1234";
		b1.speed=80;
		b1.color="Black";
		b1.brand="Pulsar";
		
		
		Bike b2=new Bike();
		b2.numPlate="AP-45-6789";
		b2.speed=120;
		b2.color="White";
		b2.brand="Hero";
		
		Bike b3=new Bike();
		b3.numPlate="TN-67-1256";
		b3.speed=130;
		b3.color="Red";
		b3.brand="Duke";
		
		Bike[] bikes=new Bike[3];
		bikes[0]=b1;
		bikes[1]=b2;
		bikes[2]=b3;
		
		
		for(int i=0;i<bikes.length;i++) {
			if(bikes[i].numPlate.contains("TN")) {
				System.out.println(bikes[i].brand);
			}
		}

	}

}
class Bike{
	String numPlate;
	int speed;
	String color;
	String brand;
}
