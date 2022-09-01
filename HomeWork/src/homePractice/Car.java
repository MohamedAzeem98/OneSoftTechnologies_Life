package homePractice;

public class Car {
	private String brand;
	private int modelNo;
	private boolean isAirBag;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	public boolean isAirBag() {
		return isAirBag;
	}
	public void setAirBag(boolean isAirBag) {
		this.isAirBag = isAirBag;
	}
	
	
	Car(String brand, int modelNo, boolean isAirBag) {
		this.brand=brand;
		this.modelNo=modelNo;
		this.isAirBag=isAirBag;
	}
	
	public String toString() {
		return "BRAND : "+brand+"\nMODEL NO : "+modelNo+"\nAIR BAG : "+isAirBag;
	}

}
