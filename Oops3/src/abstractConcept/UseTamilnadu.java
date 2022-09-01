package abstractConcept;

public class UseTamilnadu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TamilNadu tn=new TamilNadu();
		
		System.out.println(tn.display());
		System.out.println(tn.fontSize(7));
		System.out.println(tn.fontStyle("ArialBlack"));
		System.out.println(tn.stateCode("TN"));
		System.out.println(tn.numberPlateColor("Private"));
	}

}
