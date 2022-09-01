package Objects;

public class UseAirConditioner {

	public static void main(String[] args) {
		
		AirConditioner ac1=new AirConditioner();
		
		ac1.brand="TATA Croma";
		ac1.price=35000.123f;
		ac1.Model="TC 1ton";
		ac1.taxAmount=(ac1.price*18)/100;
		ac1.netprice=ac1.price+ac1.taxAmount;
		
		System.out.println("BRAND : "+ac1.brand+"\nMODEL : "+ac1.Model+"\nNET PRICE : "+ac1.netprice);

	}

}
