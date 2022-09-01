package Oops2;

public class Fruits {
	String name;
	String color;
	boolean isEdible;
	
	public String showFruitsWithTheirSeason(String season) {
		
		if(season=="Summer") {
			return "Mango can be eaten "+season;
		}else if(season=="Winter") {
			return "Sapotta can be eaten "+season;
		}
		
		return "This fruit can be eaten during "+season;
	}

}
