package datatypes;

public class AverageAndTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Mohamed Azeem S";
		int maths=78;
		int english=84;
		int social=88;
		int science=80;
		
		int average=((maths+english+social+science)/4);
		
		int total=maths+english+social+science;
		
		System.out.println("NAME : "+name);
		
		System.out.println();
		System.out.println("Average of all his Subject : "+average);
		System.out.println("TOTAL OF HIS SUBJECT IS : "+total);
		
		
	}

}
