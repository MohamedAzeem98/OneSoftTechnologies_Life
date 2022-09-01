package arrayList;
import java.util.ArrayList;
public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>ve=new ArrayList<>();
		
		ve.add("tvsSplendor");
		ve.add("ScootyPep++");
		ve.add("ActivaAccent");
		ve.add("pulsar220");
		ve.add("Rx100");
		
		/*for(int i=ve.size()-1;i>=0;i--) {
			System.out.println(ve.get(i));
		}
		*/
		
		/*for(String v:ve) {
			System.out.println(v);
		}
		*/
		//ve.forEach(x->System.out.println(x));
		int min=ve.get(0).length();
		String h="";
		for(int i=0;i<ve.size();i++) {
			if(ve.get(i).length()<min) {
				min=ve.get(i).length();
				h=ve.get(i);
			}
		}
		System.out.println(h);
		
		
		for(int i=0;i<ve.size();i++) {
			if(ve.get(i).contains("a")|| ve.get(i).contains("e")||ve.get(i).contains("i")||ve.get(i).contains("o")||ve.get(i).contains("u")) {
				System.out.println(ve.get(i).charAt(ve.get(i).length()));
			}
		}
		
		
		
		
		
		
		
	}

}
