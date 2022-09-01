import java.util.ArrayList;
import java.util.Collections;

public class Defgh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Authors> al1=new ArrayList<Authors>();        
	     al1.(new Author("Henry", "Tropic of Cancer",  45));
	     al1.add(new Author("Nalo", "Brown Girl in the Ring", 56));
	     al1.add(new Author("Frank", "300", 65));
	     al1.add(new Author("Deborah", "Sky Boys", 51));
	     al1.add(new Author("George R. R.", "A Song of Ice and Fire", 62));
	     /*       
	      * Sorting the list using Collections.sort() method, we       
	      * can use this method because we have implemented the        
	      * Comparable interface in our user defined class Author       
	      */      
	     System.out.println("Sorting by Author First Name:");      
	     Collections.sort(al1);        
	     for(Authors au: al1){       
	       System.out.println(au.getFirstName()+", "+au.getBookName()+", "+
	           au.getAuAge());        
	     } 

	}

}
