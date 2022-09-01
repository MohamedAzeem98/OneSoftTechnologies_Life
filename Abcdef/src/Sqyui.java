
public class Sqyui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int num=5;
		System.out.println(num*num*num);
		*/
		
		
		
	/*	int n1=50,n2=60;
		
		while(n1!=n2) {
			if(n1>n2) {
				n1=n1-n2;
			}else
				n2=n2-n1;
		}
		System.out.println("GCD: "+n2);
		*/
		
		
		/*int n1=4,n2=6;
		for(int i=1;i<n1*n2;i++) {
			if(i%n1==0 && i%n2==0) {
				System.out.println(i);
			}
		}*/
		
		
		int n=77;
		
		int a=0;
		
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
				a++;
			}
		}
		if(a==0) {
			System.out.println("PRIME");
		}else
			System.out.println("NO");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
