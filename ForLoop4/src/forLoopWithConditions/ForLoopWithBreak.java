package forLoopWithConditions;

public class ForLoopWithBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			if(i%5==0) {
				System.out.println(i);
				break;
			}else
				System.out.println(i);
		}
	}

}
