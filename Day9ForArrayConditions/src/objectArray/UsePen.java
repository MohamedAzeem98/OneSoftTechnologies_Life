package objectArray;

public class UsePen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen p1=new Pen();
		p1.brand="Rorito";
		p1.price=15;
		p1.color="Blue";
		p1.discountPercentage=15;
		p1.taxPercentage=66;
		
		Pen p2=new Pen();
		p2.brand="Cello";
		p2.price=20;
		p2.color="Red";
		p2.discountPercentage=10;
		p2.taxPercentage=43;
		
		Pen[] pens=new Pen[2];
		pens[0]=p1;
		pens[1]=p2;
		
		for(Pen pe:pens) {
			System.out.println(pe.brand+" "+pe.price);
			System.out.println("Net price : "+(pe.price+(pe.price*pe.taxPercentage/100)-(pe.price*pe.discountPercentage/100)));
		}
		
		
	}

}
class Pen{
	String brand;
	int price;
	String color;
	//int netPrice;
	int taxPercentage;
	int discountPercentage;
}

