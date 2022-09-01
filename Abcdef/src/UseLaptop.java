import java.util.ArrayList;
import java.util.Collections;

public class UseLaptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Laptop>al=new ArrayList<>();
		
		al.add(new Laptop("Dell",12345,123));
		al.add(new Laptop("hp",2345,128));
		al.add(new Laptop("lenovo",5678,345));
		al.add(new Laptop("MacBook",98765,234));
		
		
		Collections.sort(al);
		
		for(Laptop la:al) {
			System.out.println(la.getPrice());
		}

	}

}
