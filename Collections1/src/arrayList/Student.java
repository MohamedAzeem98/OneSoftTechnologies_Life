package arrayList;

import java.util.ArrayList;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>rollNum=new ArrayList<>();
		
		rollNum.add(120);
		rollNum.add(134);
		//rollNum.set(3,134);
		rollNum.add(156);
		rollNum.add(167);
		rollNum.add(177);
		rollNum.remove(4);
		rollNum.add(186);
		
		for(int i=0;i<rollNum.size();i++) {
			System.out.println(rollNum.get(i));
		}
		
		for(Integer id:rollNum) {
			System.out.println(id);
		}
		rollNum.forEach(x->System.out.println(x));
	}

}
