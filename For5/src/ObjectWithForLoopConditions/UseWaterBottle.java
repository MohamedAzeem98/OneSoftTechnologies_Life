package ObjectWithForLoopConditions;

public class UseWaterBottle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WaterBottle water1=new WaterBottle();
		water1.type="Stainless Steel";
		water1.brand="Butterfly";
		water1.price=2710;
		water1.isQuality=true;
	
		WaterBottle water2=new WaterBottle();
		water2.type="glass";
		water2.brand="Milton";
		water2.price=1111;
		water2.isQuality=true;
	
		WaterBottle water3=new WaterBottle();
		water3.type="glass";
		water3.brand="Pigeon";
		water3.price=562;
		water3.isQuality=false;
	
	
	WaterBottle [] waters=new WaterBottle[3];
	waters[0]=water1;
	waters[1]=water2;
	waters[2]=water3;
	int max=0;
	String str="";
	int count=0;
	
	for(int i=0;i<waters.length;i++) {
		if(waters[i].type=="glass") {
			System.out.println("BRAND = "+waters[i].brand+",,,,,,"+"PRICE ="+waters[i].price+" is made up of Glass Material");
		}
		}
	
	for(int i=0;i<waters.length;i++) {
		if(waters[i].brand.length()>max) {
			max=waters[i].brand.length();
			str=waters[i].brand;
		}
	}
	char arr[]=str.toCharArray();
	for(int i=0;i<arr.length;i++) {
		count++;
	}
	System.out.println(str+" has maximum length in a count of letters"+"and it has : "+count+" letters");
	}
	
}
class WaterBottle{
	String type;
	String brand;
	int price;
	boolean isQuality;
}
