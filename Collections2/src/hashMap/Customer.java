package hashMap;

public class Customer {
	private int customerId;
	private String name;
	private int balance;
	long accountNo;
	String ifscCode;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	
	Customer(int customerId,String name,int balance,long accountNo,String ifscCode){
		this.customerId=customerId;
		this.name=name;
		this.balance=balance;
		this.accountNo=accountNo;
		this.ifscCode=ifscCode;
	}
	public String toString() {
		return "CUSTOMER ID : "+customerId+"\nNAME : "+name+"\nBALANCE : "+balance+"\nACCOUNT NO : "+accountNo+"\nIFSC CODE : "+ifscCode;
	}

}
