import java.util.ArrayList;
import java.util.Collections;
import java.lang.*;


public class Abcd {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Author> al=new ArrayList<Author>();        
	     al.add(new Author("Henry", "Tropic of Cancer",  45));
	     al.add(new Author("Nalo", "Brown Girl in the Ring", 56));
	     al.add(new Author("Frank", "300", 65));
	     al.add(new Author("Deborah", "Sky Boys", 51));
	     al.add(new Author("George R. R.", "A Song of Ice and Fire", 62));
	     /*       
	      * Sorting the list using Collections.sort() method, we       
	      * can use this method because we have implemented the        
	      * Comparable interface in our user defined class Author       
	      */      
	     System.out.println("Sorting by Author First Name:");      
	     Collections.sort(al);        
	     for(Author au: al){       
	       System.out.println(au.getFirstName()+", "+au.getBookName()+", "+
	           au.getAuAge());        
	     } 
	     

	}

}
