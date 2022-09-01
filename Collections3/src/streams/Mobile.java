package streams;

public class Mobile {
	private String brand;
	private String model;
	private String processor;
	private int ram;
	private boolean isAndroid;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setModel(String model) {
		this.model=model;
	}
	public String getModel() {
		return model;
	}
	public void setProcessor(String processor) {
		this.processor=processor;
	}
	public String getProcessor() {
		return processor;
	}
	public void setRam(int ram) {
		this.ram=ram;
	}
	public int getRam() {
		return ram;
	}
	public void setIsAndroid(boolean isAndroid) {
		this.isAndroid=isAndroid;
	}
	public boolean getIsAndroid() {
		return isAndroid;
	}
	
	Mobile(String brand,String model,String processor,int ram,boolean isAndroid){
		this.brand=brand;
		this.model=model;
		this.processor=processor;
		this.ram=ram;
		this.isAndroid=isAndroid;
		
	}
	public String toString() {
		return "BRAND: "+getBrand()+"\nMODEL : "+getModel()+"\nPROCESSOR : "+getProcessor()+"\nRAM : "+getRam()+"\nIS ANDROID ? "+getIsAndroid();
	}

}
