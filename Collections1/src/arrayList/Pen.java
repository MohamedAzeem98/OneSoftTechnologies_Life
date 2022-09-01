package arrayList;
import java.util.ArrayList;
public class Pen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>pe=new ArrayList<>();
		pe.add("Roritomax");
		pe.add("Cello");
		pe.add("Natraj");
		pe.add("Camlin");
		pe.add("Maxmental");
		
	/*	for(int i=0;i<pe.size();i++) {
			System.out.println(pe.get(i));
		}
		for(String pen:pe) {
			System.out.println(pen);
		}
		*/
		
		pe.forEach(x->System.out.println(x));
		System.out.println();
		
		for(int i=pe.size()-1;i>=0;i--) {
			System.out.println(pe.get(i));
		}
		for(int i=0;i<pe.size();i++) {
			System.out.println(pe.get(i).charAt(pe.get(i).length()-1));
		}
		/*for(int i=0;i<pe.size();i++) {
			System.out.println(pe.get(i).charAt(pe.get(i).length()-2));
		}
		*/
		int max=0;String m="";
		for(int i=0;i<pe.size();i++) {
			if(pe.size()>max) {
				max=pe.size();
				m=pe.get(i);
				
			}
		}System.out.println(m);
		
	/*	System.out.println(pe.get(0).charAt(0));
		System.out.println(pe.get(1).charAt(1));
		System.out.println(pe.get(2).charAt(2));
		System.out.println(pe.get(3).charAt(3));
		System.out.println(pe.get(4).charAt(4));
		*/
		//System.out.println(pe.get(5).charAt(pe.get().length()-1));
	
	
	for(int i=0;i<pe.size();i++) {
		System.out.println(pe.get(i).charAt(i));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
