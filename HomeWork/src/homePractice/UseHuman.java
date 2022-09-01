package homePractice;

public class UseHuman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[]=args[0].split(",");
		String na=arr[0];
		String ini=arr[1];
		int ag=Integer.parseInt(arr[2]);
		boolean ism=Boolean.parseBoolean(arr[3]);
		
		
		
		
		
		
		Human human1=new Human(na,ini,ag,ism);
		
		System.out.println(human1);

	}

}
