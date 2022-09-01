package ObjectWithForLoopConditions;

public class UseCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Car c1=new Car();
	c1.carBrand="Hyundai";
	c1.regNo=4568;
	c1.isAirBagAvailable=true;
	
	Car c2=new Car();
	c2.carBrand="TATA";
	c2.regNo=1013;
	c2.isAirBagAvailable=false;
	
	Car c3=new Car();
	c3.carBrand="Volkswagen";
	c3.regNo=5670;
	c3.isAirBagAvailable=true;
	
	
	Car [] cars=new Car[3];
	cars[0]=c1;
	cars[1]=c2;
	cars[2]=c3;
	
	for(int i=0;i<cars.length;i++) {
		if(cars[i].regNo%2==0) {
			System.out.println(cars[i].carBrand+" has an Even Reg No");
		}else
			System.out.println(cars[i].carBrand+" has an Odd Reg No ");
	}
}

}
class Car{
	int regNo;
	String carBrand;
	boolean isAirBagAvailable;
	
}
