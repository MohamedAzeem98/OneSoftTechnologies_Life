package abstractConcept;

public abstract class TamilMovie implements Movie{

	public String movieRating(int rating) {
		if(rating>=7) {
			return " Its a good movie with Imdb rate "+rating+"/10 ";
		}
		else if(rating>=6) {
			return "Its an average movie needs to improve Imdb rate "+rating+"/10";
		}else {
			return "Its a complete disaster with Imdb rate "+rating+"/10";
		}
	}
	
	public abstract String ticketRange(int ticket);
	public abstract String ticketsSold(int numbers);
}
