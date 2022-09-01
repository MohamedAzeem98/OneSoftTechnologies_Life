package streams;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Map;
public class UseMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m1=new Mobile("Vivo","s2","SNAPDRAGON",6,true);
		Mobile m2=new Mobile("Redmi","9","MEDIATEK",4,true);
		Mobile m3=new Mobile("Poco","X2","SNAPDRAGON",6,true);
		Mobile m4=new Mobile("Realme","NARZO 40A","MEDIATEK",6,true);
		Mobile m5=new Mobile("samsung","Galaxy","Xynos",4,true);
		
		
		ArrayList<Mobile>mobiles=new ArrayList<>();
		mobiles.add(m1);
		mobiles.add(m2);
		mobiles.add(m3);
		mobiles.add(m4);
		mobiles.add(m5);
		
		
		
		
		Map<String,Mobile>mobilesMap=mobiles.stream().collect(Collectors.toMap(m->m.getModel(),n->n));
		
		mobilesMap.values().forEach(o->System.out.println(o));
		
		Map<String,Mobile>mo=mobiles.stream().filter(d->d.getBrand().contains("a")).collect(Collectors.toMap(v->v.getModel(),j->j));
		mo.values().forEach(d->System.out.println(d));
	}

}
