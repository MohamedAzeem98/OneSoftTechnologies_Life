package collectionsMap;

public class Mask {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	Mask(int price){
		this.price=getPrice();
	}
	
	public String toString() {
		return "price : "+price;
	}

}
