
public class Author1 implements Comparable<Author1>{
	private String name;
	private int modelNo;
	private int price;
	
	Author1(String name,int modelNo,int price){
		this.name=name;
		this.modelNo=modelNo;
		this.price=price;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String CompareTo(Author1 au) {
		return this.name=au.name;
	}
}
