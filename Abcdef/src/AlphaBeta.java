import java.util.*;
public class AlphaBeta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Author1>al=new ArrayList<>();
		
		al.add(new Author1("Tale1",123,456));
		al.add(new Author1("Tale2",789,987));
		al.add(new Author1("Tale3",678,123));
		al.add(new Author1("Tale4",654,333));
		
		Collections.sort(al, new Author1());
		for(Author1 ay:al) {
			System.out.println(ay.getName()+" "+ay.getPrice());
		}
		

	}

}
