package hashMap;
import java.util.HashMap;
import java.util.Iterator;
public class UseCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Customer c1=new Customer(12345,"Aravindh",16000,1234567891011l,"AX12345678");
	Customer c2=new Customer(45673,"Akash",17500,345676789923455l,"AX56789345");
	Customer c3=new Customer(78910,"Bajaj",16789,245667787812l,"CA23456567");
	Customer c4=new Customer(56782,"Balan",12222,234567778882l,"CA12345677");
	Customer c5=new Customer(43210,"Charan",67890,1299765443234l,"UA123344562");
	Customer c6=new Customer(34455,"Chandru",333333,765432467788l,"BI67432566");
	Customer c7=new Customer(32345,"Arogi",26000,891011123456l,"AA12345678");
	Customer c8=new Customer(49678,"Akila",17500,945675559923455l,"AR56789345");
	Customer c9=new Customer(28910,"Bavitha",16789,7775667787812l,"CT23456567");
	Customer c10=new Customer(57782,"Chandrika",15222,999567778882l,"BB12345677");
	Customer c11=new Customer(93210,"Devi",67222,9945765443234l,"TA123344562");
	Customer c12=new Customer(78455,"Eswari",32333,335432467788l,"FD67432566");
	Customer c13=new Customer(12245,"Fajitha",78000,2224567891011l,"RR12345678");
	Customer c14=new Customer(44473,"Anjali",13450,99976789923455l,"XX56789345");
	
	HashMap<Integer,Customer>cus=new HashMap<>();
	
	cus.put(c1.getCustomerId(), c1);
	cus.put(c2.getCustomerId(), c2);
	cus.put(c3.getCustomerId(), c3);
	cus.put(c4.getCustomerId(), c4);
	cus.put(c5.getCustomerId(), c5);
	cus.put(c6.getCustomerId(), c6);
	cus.put(c7.getCustomerId(), c7);
	cus.put(c8.getCustomerId(), c8);
	cus.put(c9.getCustomerId(), c9);
	cus.put(c10.getCustomerId(), c10);
	cus.put(c11.getCustomerId(), c11);
	cus.put(c12.getCustomerId(), c12);
	cus.put(c13.getCustomerId(), c13);
	cus.put(c14.getCustomerId(), c14);
	
	
	cus.forEach((k,v)->{
		if(k%2==0) {
			System.out.println(v);
		}
		
	});
	System.out.println();
	System.out.println();
	Iterator<Integer>itr=cus.keySet().iterator();
	
	while(itr.hasNext()) {
		int k=itr.next();
		if(cus.get(k).getName().endsWith("a")) {
			System.out.println(cus.get(k));
		}
	}
  }

}
