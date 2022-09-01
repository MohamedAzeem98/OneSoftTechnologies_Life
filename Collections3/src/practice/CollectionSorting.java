package practice;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Java program to demonstrate working of Collections.sort()
		
				// Create a list of strings
				ArrayList<String> al = new ArrayList<String>();
				al.add("GokulHari");
				al.add("MohamedAzeem");
				al.add("Naga");
				al.add("priya");
				al.add("loki");

				/* Collections.sort method is sorting the
				elements of ArrayList in ascending order. */
				Collections.sort(al);

				// Let us print the sorted list
				System.out.println(al);
				
				al.clear();
				
				System.out.println(al);
	}

}
