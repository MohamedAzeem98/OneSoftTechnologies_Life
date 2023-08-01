
public class UseRam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c1=new Car("den",12345);
		
		Ram r1=new Ram("ram",c1);
		
		
		System.out.println(r1.pname+" "+r1.car.brand+" "+r1.car.price);
		
		
		
		
	}

}
