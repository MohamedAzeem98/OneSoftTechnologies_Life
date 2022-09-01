package Objects;

public class UseMarker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marker marker1=new Marker();      // MARKER 1
		
		marker1.brand="Doms";
		marker1.Price=25;
		marker1.Color="black";
		marker1.isRefillable=false;
		
		System.out.println("Marker1 brand = "+marker1.brand+", Price = "+marker1.Price+", Color = "+marker1.Color+",is Refillable ? "+marker1.isRefillable);

		
		//MARKER 2
		
		Marker marker2=new Marker();
		
		marker2.brand="Reynolds";
		marker2.Price=30;
		marker2.Color="blue";
		marker2.isRefillable=false;
		System.out.println();
		
		System.out.println("MARKER 2 BRAND = "+marker2.brand+", PRICE = "+marker2.Price+", COLOR= "+marker2.Color+" is REFILLABLE ?"+marker2.isRefillable);
		
		// MARKER 3 
		
		Marker marker3=new Marker();
		
		marker3.brand=" CAMLIN ";
		marker3.Color="GREEN";
		marker3.isRefillable=true;
		marker3.Price=50;
		
		System.out.println();
		System.out.println("MARKER3 BRAND = "+marker3.brand+", MARKER3 PRICE = "+marker3.Price+", MARKER3 COLOR = "+marker3.Color+", Is MARKER3 Refillable ? "+marker3.isRefillable);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
