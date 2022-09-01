package ObjectWithForLoopConditions;
public class UseFan {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan f1=new Fan();
		f1.brand="Crompton";
		f1.price=4500;
		f1.color="Blue";
		f1.isWarranty=true;
		
		Fan f2=new Fan();
		f2.brand="Usha";
		f2.price=1005;
		f2.color="Balck";
		f2.isWarranty=false;
		
		Fan f3=new Fan();
		f3.brand="Philips";
		f3.price=2500;
		f3.color="Maroon";
		f3.isWarranty=true;
		
		Fan [] fans=new Fan[3];
		fans[0]=f1;
		fans[1]=f2;
		fans[2]=f3;
		int max=0;
		String name="";
		
		for(int i=0;i<fans.length;i++) {
			if(fans[i].price>max) {
				max=fans[i].price;
				name=fans[i].brand;
				}

}			System.out.println("Brand Name : "+name+" "+"Net Price With Discount : "+(max-(max*5/100)));
	}

}
class Fan{
	String brand;
	int price;
	String color;
	boolean isWarranty;
}
