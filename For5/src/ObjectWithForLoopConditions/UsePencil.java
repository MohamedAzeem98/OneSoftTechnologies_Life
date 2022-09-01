package ObjectWithForLoopConditions;

public class UsePencil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pencil p1=new Pencil();
		p1.brand="Apsara";
		p1.price=6;
		p1.shade="HB";
		
		Pencil p2=new Pencil();
		p2.brand="Natraj";
		p2.price=5;
		p2.shade="UB";
		
		Pencil p3=new Pencil();
		p3.brand="Cello";
		p3.price=7;
		p3.shade="TB";
		
		Pencil p4=new Pencil();
		p4.brand="Camlin";
		p4.price=10;
		p4.shade="HB";
		
		
		
		Pencil[] pe=new Pencil[4];
		pe[0]=p1;
		pe[1]=p2;
		pe[2]=p3;
		pe[3]=p4;
		
		for(int i=0;i<pe.length;i++) {
			if(pe[i].price%2==0) {
				System.out.println("BRAND : "+pe[i].brand+" , "+pe[i].price);
				}
			else {
				System.out.println("Brand : "+pe[i].brand+" , "+pe[i].price);
			}
		}
		for(Pencil P:pe) {
			if(P.shade.equalsIgnoreCase("HB")) {
				String hj=P.brand.toUpperCase();
				System.out.println(hj);
			}
		}
	}

}
class Pencil{
	String brand;
	int price;
	String shade;
}
