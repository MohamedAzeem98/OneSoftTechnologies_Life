package ForLoopInArrayConditions;

public class ForwardForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float a[]= new float[4];
		a[0]=1.5f;
		a[1]=3.0f;
		a[2]=4.5f;
		a[3]=6.0f;
		
		for(int i=0;i<a.length/2;i++) {           //forward first half
			System.out.println(a[i]);
		}
		System.out.println();
		
		for(int i=a.length/2;i<a.length;i++) {    //forward second half
			System.out.println(a[i]);
		}
		System.out.println();
		
		for(int i=a.length-1;i>=a.length/2;i--) { //reverse second half
			System.out.println(a[i]);
		}System.out.println();
		
		
		for(int i=a.length/2;i>0;i--) {        //reverse firsthalf
			System.out.println(a[i]);
		}
		
		
	}

}
