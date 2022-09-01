package methodOverloading;

public class Maximum {
	public String findMaximum1(int num1,int num2) {
		if(num1>num2) {
			return "Maximum is : "+num1;
		}
		else {
			return "Maximum is : "+num2;
		}
		
	}
	public String findMaximum1(int num1,int num2,int num3) {
		if(num2>num3 && num2>num1) {
		return "Maximum is : "+num2;	
		}
		else if(num3>num2 && num3>num1) {
			return "Maximum is : "+num3;
		}
		else if(num1>num2 && num1>num3) {
			return "Maximum is : "+num1;
		}
		else {
			return "Invalid numbers";
		}
	}
		
		public String findMaximum1(String name1,String name2,String name3) {
			if(name1.length()>name2.length() && name1.length()>name2.length() ) {
				return name1+" has a maximum characters";
			}
			else if(name2.length()>name3.length() && name2.length()>name1.length()) {
				return name2+" has a maximum characters";
			}
			else {
				return name3+" has a maximum characters";
			}
			
	}

}
