package lms;

public class UseToy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Toy obj1=new Toy();
		
		String [] str=args[0].split(",");
		
		obj1.toy=str[0];
		obj1.material=str[1];
		obj1.price=Integer.parseInt(str[2]);
		obj1.gram=str[3];
		
		
		int total=obj1.toy.length()+obj1.material.length()+obj1.gram.length();
		
		System.out.println("Toy = "+obj1.toy+" "+"Material = "+obj1.material+" "+"Price = "+obj1.price+" "+"Grams = "+obj1.gram+" "+"Length = "+total);
		
		
		
		
		

	}

}


class Toy{
	String toy;
	String material;
	int price;
	String gram;
}
