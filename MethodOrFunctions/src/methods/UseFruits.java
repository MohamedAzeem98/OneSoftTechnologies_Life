package methods;

public class UseFruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"apple","orange","grapes","pappaya","mango"};
	//	System.out.println(arr);
		Fruits f=new Fruits();
		
		System.out.println(f.MaximumOfAll(arr));
	}

}
class Fruits{
	public String MaximumOfAll(String a[]) {
		int len=a[0].length();
		String str="";
		for(int i=0;i<a.length;i++) {
			if(a[i].length()>len) {
				len=a[i].length();
				str=a[i];
			}
		}
		return str;
	}
}
