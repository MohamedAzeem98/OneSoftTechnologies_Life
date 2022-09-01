package abstractConcept;

public abstract class Vaccine {
	public String showName(String name) {
		return "Brand : "+name;
	}
	public abstract String showStatus(int dose) ;
	


}
