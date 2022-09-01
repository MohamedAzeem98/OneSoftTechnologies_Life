
public class Laptop implements Comparable<Laptop> {
	
	private String name;
	private int price;
	private int modelNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	Laptop(String name,int price,int modelNo){
		this.name=name;
		this.price=price;
		this.modelNo=modelNo;
	}
	
	public int  CompareTo(Laptop o) {
		if(this.price>o.getPrice()) {
			return 1;
		}else
			return -1;
	}
}

