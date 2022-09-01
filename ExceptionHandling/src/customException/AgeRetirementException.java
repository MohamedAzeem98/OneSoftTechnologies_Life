package customException;

public class AgeRetirementException extends Exception {
	
	public AgeRetirementException(String msg) {
		super(msg);
	}
	public void printStackTrace() {
		System.err.println("Not eligible");
	}

}
