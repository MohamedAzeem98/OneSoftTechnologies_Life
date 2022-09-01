package primitiveArrays;

public class StartsAndEndingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String []names= {"Arun","Aravind","ravi","Surya"};
		
		int count=0;
		
		for(int i=0;i<names.length;i++) {
			if(names[i].startsWith("A")) {
				count++;
				System.out.println(names[i]);
			}
		}
		System.out.println(count);
		
		String fruits[]= {"Grapes","oranges","apples","pineapples"};
	for(int i=0;i<fruits.length;i++) {
		if(fruits[i].endsWith("s")) {
			count++;
			System.out.println(fruits[i]);
		}
	}
		
		
		
		
		
		
		
	}

}
