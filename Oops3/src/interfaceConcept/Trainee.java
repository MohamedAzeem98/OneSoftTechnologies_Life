package interfaceConcept;

public class Trainee implements Employee {
	public String employeeSalaryDetails(int salary) {
		return "EMPLOYEE SALARY IS : "+salary;
	}
	public String employeeSector(String department) {
		return "DEPARTMENT : "+department;
	}
	public String employeeId(int id) {
		return "EMPLOYEE ID NO : "+id;
	}

}
