package practice;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class UseLaptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l1=new Laptop("hp",85000,true);
		Laptop l2=new Laptop("Dell",56000,true);
		Laptop l3=new Laptop("Lenovo",66000,true);
		Laptop l4=new Laptop("Acer",67000,true);
		Laptop l5=new Laptop("MAC airBook",125000,false);
		
		ArrayList<Laptop>lap=new ArrayList<>();
		
		lap.add(l1);
		lap.add(l2);
		lap.add(l3);
		lap.add(l4);
		lap.add(l5);
		
		List<String>la=lap.stream().filter(l->l.getPrice()>65000).map(k->k.getBrand()).collect(Collectors.toList());
		
		//la.forEach(y->System.out.println(y));
		
		Map<String,Laptop>fd=lap.stream().filter(d->d.getBrand().contains("e")).collect(Collectors.toMap(a->a.getBrand(),z->z));
		
		HashMap<String,Laptop>gh=new HashMap<>();
		
		gh.put(l1.getBrand(), l1);
		gh.put(l2.getBrand(), l2);
		gh.put(l3.getBrand(), l3);
		gh.put(l4.getBrand(), l4);
		gh.put(l5.getBrand(), l5);
		
		List<String>gf=gh.values().stream().filter(r->r.getBrand().contains("a")).map(u->u.getBrand()).collect(Collectors.toList());
		
		for(String s: gf) {
			System.out.println(s);
			
		}
		long a=gh.values().stream().filter(r->r.getBrand().contains("a")).map(u->u.getBrand()).count();
		
		System.out.println(a);
		
		Map<Object, Object>ma=gh.values().stream().filter(r->r.getIsMadeInIndia()==true).collect(Collectors.toMap(t->t.getBrand(), v->v));
		
		for(Laptop f:gh.values()) {
			System.out.println(f.getBrand());
		}
	}

}
