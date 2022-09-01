package streams;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
public class UseEmployee {

	public static void main(String[] args) {
		
		Employee e1=new Employee("Ajay",25,23000,true);
		Employee e2=new Employee("Akshy",26,24444,true);
		Employee e3=new Employee("Divya",27,34444,false);
		Employee e4=new Employee("Eashwar",26,49000,true);
		Employee e5=new Employee("Farhana",26,23764,false);
		
		ArrayList<Employee>al=new ArrayList<>();
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		
		List<Employee>maleEmployees=al.stream().filter((x)->x.getIsMale()==true).collect(Collectors.toList());
		
		
		maleEmployees.forEach(y->System.out.println(y));
		
		
		
		List<Integer>ages=al.stream().map(i->i.getAge()).collect(Collectors.toList());
		
		for(Integer a:ages) {
			System.out.println(a);
		}
		
		
		al.stream().filter(h->h.getSalary()>25000).map(h->h.getName()).forEach(t->System.out.println(t));
		
		
		List<String>nameStartsWith=al.stream().filter(d->d.getName().startsWith("A")).map(y->y.getName()).collect(Collectors.toList());
		
		nameStartsWith.forEach(d->System.out.println(d));
	
	}

}
