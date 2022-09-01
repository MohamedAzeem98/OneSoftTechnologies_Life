package elseif_Conditions;

public class AcTemperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temperature=22;
		
		if(temperature>=16 || temperature<=20) {
			System.out.println("Very Cold Weather.....");
		}
		else if(temperature>20 && temperature<=25) {
			System.out.println("Cold Weather.....");
		}
		else if(temperature>25 && temperature<=30) {
			System.out.println("Normal Weather");
		}
	}

}
