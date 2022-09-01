package ObjectWithForLoopConditions;

public class UseShirt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shirt s1=new Shirt();
		s1.brand="Otto";
		s1.price=560;
		s1.isCheckedShirt=true;
		
		Shirt s2=new Shirt();
		s2.brand="Ramraj";
		s2.price=3200;
		s2.isCheckedShirt=false;
		
		Shirt s3=new Shirt();
		s3.brand="Viking";
		s3.price=1770;
		s3.isCheckedShirt=true;
		
		Shirt []shirts= {s1,s2,s3};
		int min=s1.price;
		String name="";
		
		for(int i=0;i<shirts.length;i++) {
			if(shirts[i].price<=min) {
				min=shirts[i].price;
				name=shirts[i].brand;
			}
			
		}
		System.out.println(name);
		if(name.contains("a")|| name.contains("e")|| name.contains("i")|| name.contains("o")|| name.contains("u")) {
			System.out.println("Yes it contains vowels in it");
		}else {
			System.out.println("Not contains vowels");
		}
			
	}

}
class Shirt{
	String brand;
	int price;
	boolean isCheckedShirt;
}
