package practice;

public class Laptop {
	private String brand;
	private int price;
	private boolean isMadeInIndia;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setIsMadeInIndia(boolean isMadeInIndia) {
		this.isMadeInIndia=isMadeInIndia;
	}
	public boolean getIsMadeInIndia() {
		return isMadeInIndia;
	}
	
	Laptop(String brand,int price,boolean isMadeInIndia){
		this.brand=brand;
		this.price=price;
		this.isMadeInIndia=isMadeInIndia;
		
	}
	public String toString() {
		return "BRAND : "+getBrand()+"\nPRICE : "+getPrice()+"\nIS MADE IN INDIA ? "+getIsMadeInIndia();
	}

}
