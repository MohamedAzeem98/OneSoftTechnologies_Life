package interfaceConcept;

public class AxisBank implements Bank{
	public String rateOfInterest(int amount) {
		return "Rate Of Interest : "+(amount*15/100);
	}

}
