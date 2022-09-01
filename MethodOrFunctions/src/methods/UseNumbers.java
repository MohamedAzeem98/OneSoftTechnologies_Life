package methods;

public class UseNumbers {

	public static void main(String[] args) {
		Numbers n=new Numbers();
		int arr[]= {1,3,5,8,9,34,2};
		
		System.out.println(n.findMaximum(arr));
		System.out.println(n.countingAll(arr));
		
	}

  }
class Numbers {
	
	public String findMaximum(int a[]) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
		}
	  }
		return "Maximum Number is : "+max;
	}
	
	public String countingAll(int a[]) {
		int total=0;
		for(int i=0;i<a.length;i++) {
			total=total+a[i];
		}
		return "Total of all numbers : "+total;
	}
	
}
