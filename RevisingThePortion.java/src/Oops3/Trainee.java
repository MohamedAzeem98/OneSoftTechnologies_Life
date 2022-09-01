package Oops3;

public abstract class Trainee implements Employee{
	public String displayname(String name) {
		return "Name : "+name;
	}
	public String showId(int id) {
		return "EMPLOYEE ID : "+id;
	}
	public String salaryPerHour(int salary,int hours) {
		return "SALARY : "+(salary*hours);
	}
	public abstract String workingHour(int hours) ;
	

}
