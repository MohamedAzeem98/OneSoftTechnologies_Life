package abstractConcept;

public  class Kollywood extends TamilMovie {
	public String ticketRange(int ticket) {
		if(ticket>1000) {
			return "First Class costs around : "+ticket;
		}else if(ticket<1000 && ticket>=500) {
			return "Second Class costs around : "+ticket;
		}else if(ticket>=100 && ticket<500) {
			return "Third Class costs around : "+ticket;
		}
		else {
			return "Lower Class "+ticket;
		}
	}
	
	public String ticketsSold(int numbers) {
		if(numbers>1000) {
			return "HouseFull"+numbers;
		}else if(numbers<=1000 && numbers>500) {
			return "Half Full"+numbers;
		}else if(numbers>100 && numbers<=500) {
			return "Partially filled with around "+numbers+" seats";
		}
		else {
			return "Notfilled";
		}
	}

	

}
