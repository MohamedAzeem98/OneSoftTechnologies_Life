package collectionsMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class UseMask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String A[]=args[0].split(",");
		
		Mask m1=new Mask(Integer.parseInt(A[0]));
		Mask m2=new Mask(Integer.parseInt(A[1]));
		Mask m3=new Mask(Integer.parseInt(A[2]));
		Mask m4=new Mask(Integer.parseInt(A[3]));
		Mask m5=new Mask(Integer.parseInt(A[4]));
		
		String B[]=args[1].split(",");
		
		String a=B[0];
		String b=B[1];
		String c=B[2];
		String d=B[3];
		String e=B[4];
		
		HashMap<Mask,String>masks=new HashMap<>();
		masks.put(m1, a);
		masks.put(m2, b);
		masks.put(m3, c);
		masks.put(m4, d);
		masks.put(m5, e);
		int max=0;
		/*for(Integer m:masks.get(A)) {
			
			if(m.getPrice()>max) {
				max=m.getPrice();
			}
		}
		System.out.println(max+" is ");
		*/
		
		Iterator<Integer>itr=() masks).iterator();
		
	}

}
