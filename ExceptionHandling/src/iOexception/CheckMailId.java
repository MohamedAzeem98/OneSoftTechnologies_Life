package iOexception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckMailId {
	public static void main(String args[]) {
		
		try {
			File f=new File("C:\\Users\\AZEEM\\Pictures\\Camera Roll\\MyMailId.txt");
			FileReader fr1=new FileReader(f);
			int temp=0;
			while((temp=fr1.read())!=-1) {
				System.err.print((char)(temp));
			}
		}catch(IOException r) {
			r.printStackTrace();
		}
		System.out.println("Job is done....");
		
	}

}
