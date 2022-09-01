package stringsMethod;

public class ConcatInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Mohamed Azeem";
		String fathersName="Salahudeen";
		String initial="S";
		
		String fullName=name.concat(" "+fathersName).concat(" . "+initial);
		
		System.out.println(fullName);

	}

}
