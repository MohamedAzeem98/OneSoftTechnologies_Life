import java.util.Comparator;

public class Authors implements Comparator {
	  String firstName; 
	  String bookName; 
	  int auAge; 
	  Authors(String first, String book, int age){ 
	    this.firstName = first; 
	    this.bookName = book; 
	    this.auAge = age; 
	  } 
	  public String getFirstName() { 
	    return firstName; 
	  }
	  public void setFirstName(String firstName) { 
	    this.firstName = firstName; 
	  }
	  public String getBookName() { 
	    return bookName; 
	  }
	  public void setBookName(String bookName) { 
	    this.bookName = bookName; 
	  }
	  public int getAuAge() { 
	    return auAge; 
	  }
	  public void setAuAge(int auAge) { 
	    this.auAge = auAge; 
	  } 
	  
	  
	    public int compare(Author a1,Author a2){
	       if(a1.auAge==a2.auAge)
	         return 0;
	     else if(a1.auAge>a2.auAge)
	         return 1;
	     else
	         return -1;
	    }
	  }

