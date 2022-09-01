package datatypes;

public class CarDetailsDisplaying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no=14;
		String name="MERCENDZ BENZ 65R";
		float cost=25.5f;
		char version='5';
		long zipCode=67123459857l;
		double weightInTonnes=87.5672431567783452d;
		boolean emi=true;
		
		
		System.out.println("Cars Details in ShowRoom : ");
		System.out.println();
		System.out.println("MODEL NO: "+no);
		System.out.println("BrandName : "+name);
		System.out.println("Costs : "+cost+"in lacs .....");
		System.out.println("VERSION : "+version);
		System.out.println("SECRET NO : "+zipCode);
		System.out.println("Weight In Tonnes : "+weightInTonnes);
		System.out.println("Is that EMI available ? "+emi);
	}

}
