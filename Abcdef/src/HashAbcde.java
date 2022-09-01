import java.util.*;
import java.util.concurrent.*;
public class HashAbcde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ConcurrentHashMap<Integer,String>ch=new ConcurrentHashMap<>();	
	ch.put(1,"Hello");
	ch.put(2,"Hii");
	ch.put(3,"welcome");
	ch.put(4, "World");
//	ch.put(1, "1234");
//	ch.put(3,"7890");
	
	Iterator<ConcurrentHashMap.Entry<Integer,String>>itr=ch.entrySet().iterator();
		
		
		while(itr.hasNext()) {
			ConcurrentHashMap.Entry<Integer,String>entry=itr.next();
			System.out.println(entry.getValue()+" "+entry.getKey());
		}
	}

}
