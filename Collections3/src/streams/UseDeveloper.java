package streams;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.List;
public class UseDeveloper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer d1=new Developer("Ajay","TeamLead",12,false);
		Developer d2=new Developer("Akshy","Associate",5,false);
		Developer d3=new Developer("Bala","Software engineer",7,true);
		Developer d4=new Developer("Balaji","Senior Java developer",9,true);
		Developer d5=new Developer("Charan","junior developer",4,true);
		
		HashMap<String,Developer>details=new HashMap<>();
		
		details.put(d1.getName(), d1);
		details.put(d2.getName(), d2);
		details.put(d3.getName(), d3);
		details.put(d4.getName(), d4);
		details.put(d5.getName(), d5);
		
	//	javadeveloper==true->name separate->separate list
		List<String>data=details.values().stream().filter(l->l.getIsJavaDeveloper()==true).map(e->e.getName()).collect(Collectors.toList());
		
         data.forEach(c->System.out.println(c));
         
         List<String>dataFunctions=details.keySet().stream().filter(u->details.get(u).getIsJavaDeveloper()==true).map(r->details.get(r).getName()).collect(Collectors.toList());
         dataFunctions.forEach(e->System.out.println(e));
         
         
         
         List<String>dataMembers=details.values().stream().map(h->h.getName()).filter(u->u.startsWith("Ba")).collect(Collectors.toList());
         dataMembers.forEach(f->System.out.println(f));
         
         
         Map<String,Developer>mapping=details.values().stream().filter(b->b.getRole().contains("developer")).collect(Collectors.toMap(i->i.getName(), j->j));
         mapping.values().forEach(f->System.out.println(f.getName()));
         
	}

}
