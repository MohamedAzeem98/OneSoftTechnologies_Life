package homeWork;

public class UsePencil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pencil p1=new Pencil();
		p1.brand="Apsara";
		p1.price=10;
		p1.isType=true;
		
		Pencil p2=new Pencil();
		p2.brand="Natraj";
		p2.price=7;
		p2.isType=false;
		
		Pencil p3=new Pencil();
		p3.brand="Camlin";
		p3.price=12;
		p3.isType=true;
		
	/*	Pencil [] pens=new Pencil[3];   //Individual
			pens[0]=p1;
			pens[1]=p2;
			pens[2]=p3;
	*/
		
		Pencil[] pens= {p1,p2,p3};      //Bulk
		
			for(int i=0;i<pens.length;i++) {
				System.out.println(pens[i].brand+" "+pens[i].price);
			}
	}

}
class Pencil{
	String brand;
	int price;
	boolean isType;
}
