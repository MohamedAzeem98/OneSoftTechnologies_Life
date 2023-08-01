import java.util.ArrayList;

public class SimpleDimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	ArrayList<String>li=new ArrayList<>();
	li.add("Ajay");
	li.add("Bijay");
	li.add("cijay");
	li.add("Dijay");
	
	for(String a:li) {
		if(!a.startsWith("A")) {
			System.out.println(a);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
