package objectArray;
public class UseMobile {
     public static void main(String[] args) {
		Mobile m1=new Mobile();
		m1.brand="Redmi";
		m1.price=11999;
		m1.discountAmount=1025;
		m1.taxAmount=1595;
		m1.ram=4;
		m1.rom=128;
		
		Mobile m2=new Mobile();
		m2.brand="realme";
		m2.price=13999;
		m1.discountAmount=1345;
		m1.taxAmount=1400;
		m2.ram=6;
		m2.rom=128;
		
		Mobile m3=new Mobile();
		m3.brand="SAMSUNG";
		m3.price=15000;
		m3.discountAmount=1333;
		m3.taxAmount=1221;
		m3.ram=6;
		m3.rom=128;
		
		Mobile m4=new Mobile();
		m4.brand="One plus";
		m4.price=45000;
		m4.discountAmount=1111;
		m4.taxAmount=3500;
		m4.ram=8;
		m4.rom=256;
		
		Mobile mobiles[]=new Mobile[4];
		mobiles[0]=m1;
		mobiles[1]=m2;
		mobiles[2]=m3;
		mobiles[3]=m4;
		
	for(int i=0;i<mobiles.length;i++) {
			System.out.println(mobiles[i].brand+" "+"netPrice="+" "+(mobiles[i].price-mobiles[i].discountAmount+mobiles[i].taxAmount));
		}
	}
}
class Mobile{
	String brand;
	int price;
	int discountAmount;
	int taxAmount;
	int ram;
	int rom;
	boolean isTouchScreen;
}
