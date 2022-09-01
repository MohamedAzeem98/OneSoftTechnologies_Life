package abstractConcept;

public abstract class StateGovernmentRules implements CentralGovernmentRules{
	
	public String display() {
		return "Two Wheeler vehicle ";
	}
	public String fontStyle(String style) {
		if(style=="TimesNewRoman") {
			return "Its Font Style is : "+style;
		}
		else if(style=="ArialBlack") {
			return "Its FontStyle is : "+style;
		}
		else if(style=="ItalicStyle") {
			return "Its FontStyle is : "+style;
		}else {
			return "None";
		}
	}
	public String fontSize(int size) {
		if(size>=5 && size <=7) {
			return "Medium Size ";
		}else if(size>=7 && size<10) {
			return "Huge Size ";
		}else {
			return"Small size";
		}
	}
	
	public String stateCode(String code) {
		if(code=="TN") {
			return "TamilNadu";
		}else if(code=="AP") {
			return "Andhra pradesh";
		}else if(code=="KL") {
			return "Kerala";
		}else {
			return "none";
		}
		}
	public abstract String numberPlateColor(String vType);

}
