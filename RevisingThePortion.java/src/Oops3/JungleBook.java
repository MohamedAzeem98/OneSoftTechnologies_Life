package Oops3;

public class JungleBook implements Book{
	public String displayPrice(int price) {
		return "PRICE : "+price;
	}
	public String displayAuthor(String author) {
		return "AUTHOR : "+author;
	}
	public String publicationYear(int year) {
		return "Year : "+year;
	}
	

}
