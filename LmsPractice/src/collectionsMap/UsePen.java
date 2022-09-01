package collectionsMap;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class UsePen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[]=args[0].split(",");
		
		String brr[]=args[1].split(",");
		
		String crr[]=args[2].split(",");
		
		int a=Integer.parseInt(crr[0]);
		int b=Integer.parseInt(crr[1]);
		int c=Integer.parseInt(crr[2]);
		
		
		Pen p1=new Pen();
		p1.price=Float.parseFloat(arr[0]);
		p1.model=brr[0];
		
		Pen p2=new Pen();
		p2.price=Float.parseFloat(arr[1]);
		p2.model=brr[1];
		
		Pen p3=new Pen();
		p3.price=Float.parseFloat(arr[2]);
		p3.model=brr[2];
		
		
		HashMap<Integer,Pen>penDetails=new HashMap<>();
		
		penDetails.put(a, p1);
		penDetails.put(b, p2);
		penDetails.put(c, p3);
		
		System.out.println(penDetails);
		/*System.out.println(a+"="+p1.price1+" "+p1.model1);
		System.out.println(b+"="+p2.price2+" "+p2.model2);
		System.out.println(c+"="+p3.price3+" "+p3.model3);
		*/

	}
}