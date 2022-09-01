package abstractConcept;

public class Covaxin extends Vaccine {
	public String showStatus(int dose) {
		if(dose==1) {
			return "You need to wait for nextDose and you injected with "+dose+" dose";
		}else {
			return "You have been fully vaccinated as u got "+dose+" doses";
		}
	}

}
