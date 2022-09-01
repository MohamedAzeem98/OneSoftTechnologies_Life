package homeWork;
public class UseLaptop {
	public static void main(String[] args) {
		Laptop l1=new Laptop();
		l1.brand=args[0];
		l1.price=Integer.parseInt(args[1]);
		l1.flagship=Boolean.parseBoolean(args[2]);
		
		Laptop l2=new Laptop();
		l2.brand=args[0];
		l2.price=Integer.parseInt(args[1]);
		l2.flagship=Boolean.parseBoolean(args[2]);
		
		Laptop[] laps= {l1,l2};
		
		for(int i=0;i<laps.length;i++) {
			System.out.println("Brand : "+laps[i].brand+" // "+"Price : "+laps[i].price);
		}
	}
}
class Laptop{
	String brand;
	int price;
	boolean flagship;
}
