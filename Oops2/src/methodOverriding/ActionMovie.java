package methodOverriding;

public class ActionMovie extends Movie{
	public String fightSequence(int fightScenes) {
		if(fightScenes==9) {
			return "good movie";
		}else if(fightScenes==6) {
			return "average movie";
		}else if(fightScenes==4) {
			return "Bad movie";
		}else {
			return "Invalid data";
		}
	}
}
