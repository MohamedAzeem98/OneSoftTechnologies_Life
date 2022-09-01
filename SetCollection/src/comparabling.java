import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class comparabling {
	public static void main(String args[]) {
		List<Car> li=new ArrayList<>();
		
		li.add(new Car("car1",123));
		li.add(new Car("car2",345));
		li.add(new Car("car3",456));
		li.add(new Car("car4",789));
		
		Collections.sort(li);
		for(Car c:li) {
			System.out.println(c);
		}
		
	}
}


class Car implements Comparable<Car>{
	private String name;
	private int modelNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	Car(String name,int modelNo){
		this.name=name;
		this.modelNo=modelNo;
	}
	
	public int compareTo(Car ca1,Car ca2) {
		if(ca1.modelNo==ca2.modelNo) {
			return 0;
		}else if(ca1.modelNo<ca2.modelNo) {
			return 1;
		}
		else
			return -1;
		}
	
	public String toString() {
		return "NAME : "+getName()+", MODEL NO : "+getModelNo();
	}
		
	}
	

