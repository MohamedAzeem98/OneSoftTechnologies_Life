package ConditionsInsideObject;

public class UseWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Watch w1=new Watch();
		w1.brand="Sonata";
		w1.color="maroon";
		w1.price=1575;
		w1.strapType="Leather";
		w1.isWarrantyAvailable=false;
		
		
		Watch w2=new Watch();
		w2.brand="fastrack";
		w2.color="blue";
		w2.price=999;
		w2.strapType="Leather";
		w2.isWarrantyAvailable=true;
		
		Watch w3=new Watch();
		w3.brand="TATA Xiber";
		w3.color="brown";
		w3.price=1333;
		w3.strapType="ChainStraped";
		w3.isWarrantyAvailable=true;
		
		Watch w4=new Watch();
		w4.brand="puma";
		w4.color="white";
		w4.price=1888;
		w4.strapType="leather";
		w4.isWarrantyAvailable=true;
		
		if(w1.price>w2.price && w1.price>w3.price && w1.price>w4.price) {
			System.out.println(w1.brand+" is the highest price ");
		}else if(w2.price>w1.price && w2.price>w3.price && w2.price>w4.price) {
			System.out.println(w2.brand+" is the highest price ");
		}else if(w3.price>w4.price && w3.price>w2.price && w3.price>w1.price) {
			System.out.println(w3.brand+" is the highest price ");
		}
		else
			System.out.println(w4.brand+" is the highest price ");
		}

}
