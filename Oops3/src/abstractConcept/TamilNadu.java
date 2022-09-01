package abstractConcept;

public class TamilNadu extends StateGovernmentRules{
	public String numberPlateColor(String vType) {
		if(vType=="Private") {
			return " BLACK WITH WHITE ";
		}else if(vType=="public") {
			return "BLACK WITH YELLOW ";
		}else {
			return "GREEN WITH WHITE ";
		}
	}

	
}
