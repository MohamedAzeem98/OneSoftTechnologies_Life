package revision;

public class UseMarker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Marker mark1=new Marker();
	mark1.brand="Doms";
	mark1.price=25;
	mark1.color="Blue";
	mark1.isRefilled=true;
	
	Marker mark2=new Marker();
	mark2.brand="Rorito";
	mark2.price=45;
	mark2.color="Green";
	mark2.isRefilled=false;
	
	//System.out.println(mark1.findMaximum(mark1,mark2));
	Marker[] ma= {mark1,mark2};
	
	System.out.println(mark1.findMaximum(ma));
	}
}
class Marker{
	String brand;
	int price;
	String color;
	boolean isRefilled;
	
/*	public int findMaximum(Marker a,Marker b) {
	
		if(a.price<b.price) {
			return a.price;
		}else
			return b.price;
		
	}
	*/
	public int findMaximum(Marker[] m) {
		int max=m[0].price;
		for(int i=0;i<m.length;i++) {
			if(m[i].price>max) {
				max=m[i].price;
			}
		}
		return max;
	}
	
	
	
	
	
	
	
	
	
	
}
