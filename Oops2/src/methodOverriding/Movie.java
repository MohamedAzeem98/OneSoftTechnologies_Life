package methodOverriding;

public class Movie {

	public String fightSequence(int fightScenes){
		if(fightScenes==6) {
			return "good movie";
		}
		else if(fightScenes==4) {
			return "average movie";
		}
		else if(fightScenes==2) {
			return "Bad movie";
		}
		else {
		return "invalid";
	}
	}
}
