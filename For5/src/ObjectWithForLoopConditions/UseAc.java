package ObjectWithForLoopConditions;

public class UseAc {															//5-tax//8-discount

	public static void main(String[] args) {
		
		Ac a1=new Ac();
		a1.brand="WhirlPool";
		a1.price=60000;
		a1.color="White";
		a1.isFiveStar=true;
		
		Ac a2=new Ac();
		a2.brand="Croma";
		a2.price=87000;
		a2.color="Maroon";
		a2.isFiveStar=true;
		
		Ac a3=new Ac();
		a3.brand="Samsung";
		a3.price=88000;
		a3.color="Grey";
		a3.isFiveStar=false;
		
		Ac as[]=new Ac[3];
		as[0]=a1;
		as[1]=a2;
		as[2]=a3;
		
		for(Ac A: as) {
			if(A.isFiveStar==true) {
				System.out.println("Brand : "+A.brand+" || "+"Net Price : "+(A.price+(A.price*5/100)-(A.price*8/100)));
			}
		}
	}

}
class Ac{
	int price;
	String brand;
	String color;
	boolean isFiveStar;
}
