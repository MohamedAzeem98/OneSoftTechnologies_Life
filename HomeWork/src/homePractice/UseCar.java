package homePractice;

public class UseCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]=args[0].split(",");
		
		String brand=str[0];
		int modelNo=Integer.parseInt(str[1]);
		boolean isAirBag=Boolean.parseBoolean(str[2]);
		
		
		Car c1=new Car(brand,modelNo,isAirBag);
		
		System.out.println(c1.getBrand()+c1.getModelNo());
	}

}
