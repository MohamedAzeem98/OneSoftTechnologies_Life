package practice;
import java.util.List;
import java.util.ArrayList;
public class UseProgrammer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Programmer p1=new Programmer("Ajay","FrontEddeveloper","Java",true);
		//Programmer p2=new Programmer("Bala","BackEnddeveloper","Python",true);
		
		
		ArrayList<Programmer>employees=new ArrayList<>();
		employees.add(new Programmer("Ajay","junior developer","PYTHON , MONGO ",true));
		
		employees.add(new Programmer("Bala","FrontEnddeveloper","HTML,CSS,REACT JS",true));
		
		employees.add(new Programmer("Chandrika","BackEnddeveloper","Java,MySql,SpringBoot",false));
		
		employees.add(new Programmer("Devi","ManualTester","JAVA,selenium",false));
		
		employees.add(new Programmer("Eswaran","AutomatedTester","JAVA",true));
		
		employees.add(new Programmer("Fahad","Senior Tester","JAVA",true));
		
		//ArrayList<Programmer>developer=new ArrayList<>();
		//ArrayList<Programmer>tester=new ArrayList<>();
		List<Programmer>developer=new ArrayList<>();
		List<Programmer>Tester=new ArrayList<>();
		
		for(Programmer e:employees) {
			if(e.getRole().contains("developer")) {
				developer.add(e);
			}else if(e.getRole().contains("Tester")) {
				Tester.add(e);
			}
		}
		
		System.out.println();
		developer.forEach(x->System.out.println(x));
		System.out.println();
		Tester.forEach(Y->System.out.println(Y));
		
		

	}

}
