package hashMap;

public class AadharCard {
	private long aadharNo;
	private String name;
	private int age;
	private boolean isMale;
	private String address;
	
	public void setAadharNo(long aadharNo) {
		this.aadharNo=aadharNo;
	}
	public long getAadharNumber() {
		return aadharNo;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setIsMale(boolean isMale) {
		this.isMale=isMale;
	}
	public boolean getIsMale() {
		return isMale;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return address;
	}
	
	AadharCard(long aadharNo,String name,int age,boolean isMale,String address){
		this.aadharNo=aadharNo;
		this.name=name;
		this.age=age;
		this.isMale=isMale;
		this.address=address;
	}
	public String toString() {
		return "AADHAR NUMBER : "+aadharNo+"\nNAME : "+name+"\nAGE : "+age+"\nIS MALE ? "+isMale+"\nADDRESS : "+address;
	}

}
