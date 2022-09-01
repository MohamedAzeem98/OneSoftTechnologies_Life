package ConditionsInsideObject;

public class UseCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1=new Car();
		c1.brand="BMW ";
		c1.color="Black";
		c1.price=2500000;
		c1.isAutomaticGear=true;
		
		Car c2=new Car();
		c2.brand="swiftxl";
		c2.color="red";
		c2.price=800000;
		c2.isAutomaticGear=false;
		
		/*if(c1.price>c2.price) {
			System.out.println(c1.brand+"  is the highest price");
		}else
			System.out.println(c2.brand+" is the highest price");
        */
		
		/*if(c1.isAutomaticGear==true) {
			System.out.println(c1.price+(c1.price*10/100));
		}
		else
			System.out.println(c1.price-(c1.price*5/100));
		*/
		
		if(c2.brand.contains("a")|| c2.brand.contains("e") || c2.brand.contains("i")|| c2.brand.contains("u")|| c2.brand.contains("o"))
		{
			System.out.println(c2.color.toUpperCase());          
		}else
			System.out.println(c2.price);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
