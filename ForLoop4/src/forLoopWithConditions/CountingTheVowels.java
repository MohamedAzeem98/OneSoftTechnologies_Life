package forLoopWithConditions;

public class CountingTheVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="helloworld";
		int Vcount=0,Ccount=0;
for(int i=0;i<str.length();i++) {
	if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
		Vcount++;
	
	}else
		Ccount++;
	}
System.out.println("Vowels :"+Vcount);
System.out.println("Consonants :"+Ccount);

}
}
