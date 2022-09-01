
public class StringContainingVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[]= {"ram","raja","krish"};
		
		
		for(int i=0;i<name.length;i++) {
			if(name[i].length()%2==0) {
				System.out.println(name[i].substring(name[i].length()/2-1,name[i].length()/2+1));
			}else if(name[i].length()%2!=0) {
				System.out.println(name[i].charAt(name[i].length()/2));
		}
	}

}
}
