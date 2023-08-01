package TodaySadBegin;

//import java.util.Scanner;

public class leapi {

	public static void main(String[] args) {
		
		int year=2017;
		boolean leap=false;
		
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					leap=true;
				}else {
					leap=false;
				}
			}
				else {
					leap=true;
				}
		}
		if(leap) {
			System.out.println(year+" "+"is a leap year ");
		}else {
			System.out.println(year +" "+"is not a leap year");
		}
		
		
		
	}

}
