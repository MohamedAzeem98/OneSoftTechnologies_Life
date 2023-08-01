
public class VaragsSolving {

	static void display(String...va) {
		
		System.out.println("display method invoked1");

		for (String s : va) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();
		display("Hello");
		display("my", "name", "is", "varags","abceds");
	}
}
