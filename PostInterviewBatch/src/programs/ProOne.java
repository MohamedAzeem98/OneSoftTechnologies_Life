package programs;

import java.io.File;
import java.io.FileNotFoundException;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;

public class ProOne {

	public static void main(String[] args) throws FileNotFoundException {
		
File f=new File("C:\\Users\\AZEEM\\Documents\\rtg.txt");	
			
		try {
			FileReader s=new FileReader(f);
			System.out.println("Done");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
