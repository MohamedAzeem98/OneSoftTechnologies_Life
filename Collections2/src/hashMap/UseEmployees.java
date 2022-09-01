package hashMap;

import java.util.HashMap;

public class UseEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> employees = new HashMap<>();

		employees.put(1234, "Ajay");
		employees.put(45678, "Bala");
		employees.put(7890, "Chandru");
		employees.put(9101, "Dinesh");

		/*
		 * employees.forEach((k,v)->System.out.println(k+" "+v));
		 * 
		 * 
		 * for(String s:employees.values()) { System.out.println(s); }
		 * 
		 * for(Integer i:employees.keySet()) { System.out.println(i); }
		 */

		System.out.println(employees.get(9101));

		employees.remove(9101);

		employees.forEach((k, v) -> System.out.println(k + " " + v));

		/*
		 * for(int i=0;i<employees;i++) {
		 * 
		 * }
		 */

		/*
		 * for(Integer i:employees.keySet()) { if(i.keySet()%2==0) {
		 * System.out.println(i.values()); } }
		 */

		employees.forEach((k, v) -> {
			if (k % 2 == 0) {
				//System.out.println(k + " " + v);

			}
		});

		employees.keySet().forEach(k -> {
			if (k % 2 != 0) {
				System.out.println(k + " " + employees.get(k));
			}
		});

	}

}
