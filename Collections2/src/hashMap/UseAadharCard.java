package hashMap;
import java.util.HashMap;
import java.util.Iterator;
public class UseAadharCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AadharCard a1=new AadharCard(590057295947l,"Ajay",23,true,"velacherry");
		AadharCard a2=new AadharCard(456788234564l,"Bala",25,true,"villivakkam");
		AadharCard a3=new AadharCard(456788234566l,"Charan",27,true,"Trichy");
		AadharCard a4=new AadharCard(345678234556l,"Aravind",23,true,"Avadi");
		AadharCard a5=new AadharCard(456782345662l,"ganesh",24,true,"Igp");
		AadharCard a6=new AadharCard(234567678854l,"Akil",25,true,"Thiruvanmiyur");
		AadharCard a7=new AadharCard(123456788923l,"kavaitha",23,false,"Ptc");
		AadharCard a8=new AadharCard(675432456788l,"lavanya",28,false,"Adyar");
		AadharCard a9=new AadharCard(543216789908l,"Aishwarya",26,false,"porur");
		AadharCard a10=new AadharCard(12322111833l,"Bavitha",24,false,"Madurai");
		AadharCard a11=new AadharCard(77723456772l,"devi",26,false,"Bangalore");
		AadharCard a12=new AadharCard(85643256234l,"hema",30,false,"Avinasi");
		
		HashMap<Long,AadharCard> acards=new HashMap<>();
		
		acards.put(a1.getAadharNumber(), a1);
		acards.put(a2.getAadharNumber(), a2);
		acards.put(a3.getAadharNumber(), a3);
		acards.put(a4.getAadharNumber(), a4);
		acards.put(a5.getAadharNumber(), a5);
		acards.put(a6.getAadharNumber(), a6);
		acards.put(a7.getAadharNumber(), a7);
		acards.put(a8.getAadharNumber(), a8);
		acards.put(a9.getAadharNumber(), a9);
		acards.put(a10.getAadharNumber(), a10);
		acards.put(a11.getAadharNumber(), a11);
		acards.put(a12.getAadharNumber(), a12);
		
		//System.out.println(acards.remove(a1.getAadharNumber(), a1));
		//acards.forEach((k,v)->System.out.println(k+" "+v));
		
	/*	acards.forEach((k,v)->{
			if(v.getIsMale()==true) {
				System.out.println(k+" "+v);
			}
		});
		*/
		
		
	/*	acards.forEach((k,v)->{
			if(v.getIsMale()!=true) {
				System.out.println(v);
			}
		});
		*/
		
	/*	acards.keySet().forEach(k->{
			if(acards.get(k).getIsMale()==false) {
				System.out.println(acards.get(k));
			}
		});
		*/
		
	/*	for(Long le:acards.keySet()) {
			if(acards.get(le).getAge()%2==0){
				System.out.println(acards.get(le));
			}
			
		}
		
		for(Long le:acards.keySet()) {
			if(acards.remove(le, acards)) {
				System.out.println();
			}
		}
		*/
		
		Iterator<AadharCard>itr=acards.values().iterator();
		
		while(itr.hasNext()) {
			if(itr.next().getIsMale()==false) {
				itr.remove();
			}
		}
		
		acards.forEach((k,v)->System.out.println(v));
		
	
		
		Iterator<Long>itr1=acards.keySet().iterator();
		
		while(itr1.hasNext()) {
			if(acards.get(itr1.next()).getIsMale()==true) {
				itr1.remove();
			}
		}
		
		acards.forEach((k,v)->System.out.println(v));
		
		
		
		Iterator<Long>ite=acards.keySet().iterator();
		while(ite.hasNext()){
			long k=ite.next();
			if(acards.get(k).getName().startsWith("A")) {
				System.out.println(acards.get(k));
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
