package forLoopWithConditions;

public class ContinueTheLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=33;i>=1;i--) {
			if(i%5==0) {
				continue;
			}else
				System.out.println(i);
		}
	}

}
