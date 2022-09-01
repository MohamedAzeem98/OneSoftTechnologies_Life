package ObjectWithForLoopConditions;

public class UseLaptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Laptop l1=new Laptop();
		l1.brand="Dell";
		l1.price=66000;
		l1.color="White";
		l1.version="Latitude E7470";
		l1.isTouchScreen=false;
		
		Laptop l2=new Laptop();
		l2.brand="hp";
		l2.price=87000;
		l2.color="Dark blue";
		l2.version="Raz 7890";
		l2.isTouchScreen=true;
		
		Laptop l3=new Laptop();
		l3.brand="Lenovo";
		l3.price=65000;
		l3.color="Black";
		l3.version="Zip 5678";
		l3.isTouchScreen=false;
		
		
		Laptop [] laps=new Laptop[3];
		laps[0]=l1;
		laps[1]=l2;
		laps[2]=l3;
		
		for(int i=0;i<laps.length;i++) {
			if(laps[i].isTouchScreen==true) {
				System.out.println("BRAND : "+laps[i].brand+"||"+"PRICE : "+laps[i].price);
			}
		}
		
		
	}

}
class Laptop{
	String brand;
	int price;
	String color;
	String version;
	boolean isTouchScreen;
}
