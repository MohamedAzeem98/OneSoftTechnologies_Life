package methods;

public class UsePencil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pencil p1=new Pencil();
		p1.brand="Natraj";
		p1.price=5;
		p1.color="Red";
		
		Pencil p2=new Pencil();
		p2.brand="Apsara";
		p2.price=10;
		p2.color="Black";
	System.out.println(p1.toFindMaximum(p1.price));
		
	}

}
class Pencil{
	String brand;
	int price;
	String color;
	
	
	public String toFindMaximum(int a) {
		if(a>15) {
			return "Maximum than 15 "+a; 
		}else
			return "Minimum than 15 "+a;
	}
}
