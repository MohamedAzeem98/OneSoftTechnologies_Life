package lms;

public class UseSaree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Saree s1=new Saree();
		
		//String[] str=args[0].split(",");
		
		s1.material=args[0];
		s1.colour=args[1];
		 s1.price=Integer.parseInt(args[2]);
		s1.netP=Integer.parseInt(args[3]);
		
		System.out.println("MATERIAL : "+s1.material+","+"Colour : "+s1.colour+","+"Price : "+s1.price+", "+"NetPRICE = "+(s1.price-(s1.price*s1.netP/100)));        
		}
}
class Saree{
	String material;
	String colour;
	int price;
	int netP;
}
