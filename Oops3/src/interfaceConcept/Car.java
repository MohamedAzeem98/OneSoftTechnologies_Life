package interfaceConcept;

public class Car implements Vehicle,Automobile{
	public String showVehicleNo(String no) {
		return "VEHICLE NO : "+no;
	}
	public String isSuv(boolean type ) {
		return "IS a Suv typed : "+type;
	}

}
