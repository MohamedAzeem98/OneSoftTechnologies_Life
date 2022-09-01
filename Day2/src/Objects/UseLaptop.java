package Objects;

public class UseLaptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop lap1=new Laptop();
		
		lap1.brand="DELL";
		lap1.price=45000;
		lap1.processorModel="intel i7";
		lap1.taxAmount=lap1.price*12/100;
		lap1.discountAmount=lap1.price*5/100;
		lap1.netPrice=lap1.price+lap1.taxAmount-lap1.discountAmount;
		
		System.out.println("BRAND : "+lap1.brand);
		System.out.println("MODEL : "+lap1.processorModel);
		System.out.println("NET PRICE : "+lap1.netPrice);
		System.out.println("DISCOUNT ADDED : "+lap1.discountAmount);

	}

}
