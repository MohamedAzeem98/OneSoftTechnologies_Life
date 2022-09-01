package practice;
import java.util.HashMap;
import java.util.Iterator;
public class UseEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1234,"arun",23,true,"BackEnd Developer");
		Employee e2=new Employee(4567,"bala",25,true,"FrontEnd Developer");
		Employee e3=new Employee(8910,"akash",27,true,"HR DEVELOPER");
		Employee e4=new Employee(1112,"balaji",26,true,"BackEnd Developer");
		Employee e5=new Employee(1314,"akshy",25,true,"HR DEVELOPER");
		Employee e6=new Employee(1415,"pooja",26,false,"FrontEnd Developer");
		Employee e7=new Employee(1617,"Sushma",27,false,"BackEnd Developer");
		Employee e8=new Employee(1819,"huma",26,false,"FrontEnd Developer");
		
		HashMap<Integer,Employee>em=new HashMap<>();
		
		em.put(e1.getId(), e1);
		em.put(e2.getId(), e2);
		em.put(e3.getId(), e3);
		em.put(e4.getId(), e4);
		em.put(e5.getId(), e5);
		em.put(e6.getId(), e6);
		em.put(e7.getId(), e7);
		em.put(e8.getId(), e8);
		
		
		
		Iterator<Integer>itr=em.keySet().iterator();
		
		while(itr.hasNext()) {
			int r=itr.next();
			if(em.get(r).getRole()=="FrontEnd Developer") {
				System.out.println("FRONT END ");
				System.out.println(em.get(r));
			}else if(em.get(r).getRole()=="BackEnd Developer") {
				System.out.println("BACK END ");
				System.out.println(em.get(r));
			}else if(em.get(r).getRole()=="HR DEVELOPER")
				System.out.println("HR DEVELOPMENT");
				System.out.println(em.get(r));
		}
		
	}

}
