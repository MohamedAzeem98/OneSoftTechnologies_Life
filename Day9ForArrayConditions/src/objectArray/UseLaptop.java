package objectArray;

public class UseLaptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Laptop l1=new Laptop();
		l1.brand="DELL ";
		l1.modelNo=7470;
		l1.price=58000;
		l1.isTouchScreen=false;
		
		Laptop l2=new Laptop();
		l2.brand="LENOVO";
		l2.modelNo=3450;
		l2.price=60000;
		l2.isTouchScreen=true;
		
		Laptop l3=new Laptop();
		l3.brand="MAC BOOK";
		l3.modelNo=678;
		l3.price=125000;
		l3.isTouchScreen=true;
		
		Laptop[] lap= {l1,l2,l3};
		
		for(int  i=0;i<lap.length;i++) {
			System.out.println(lap[i].brand+" "+lap[i].modelNo+" "+lap[i].price);
		}
	}
}
class Laptop{
	String brand;
	int  price;
	int modelNo;
	boolean isTouchScreen;
}
