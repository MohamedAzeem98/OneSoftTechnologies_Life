package Saturday.sat;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException
    {
     XSSFWorkbook book=new XSSFWorkbook();
     XSSFSheet sheet=book.createSheet("Responsibilities");
     
     XSSFRow row;
     
     
     ArrayList<Student>al=new ArrayList<>();
     al.add(new Student("Ajay",1));
     al.add(new Student("Vijay",2));
     al.add(new Student("Naveen",3));
     
     Row rows=sheet.createRow(0);
    // Row rows1=sheet.createRow(1);
    // Row rows2=sheet.createRow(2);
     
     Cell cell1=rows.createCell(0);
     Cell cell2=rows.createCell(1);
    // Cell cell3=rows2.createCell(2);
     
     
     cell1.setCellValue("Name");
     cell2.setCellValue("RollNo");
     
     int rNum=1;
     for(Student n:al) {
    	 Student res=n;
    	 row=sheet.createRow(rNum++);

         row.createCell(0).setCellValue(n.getName());
         row.createCell(1).setCellValue(n.getRollNo());
    	
     }
     
   
     FileOutputStream fs=new FileOutputStream("C:\\Users\\AZEEM\\Documents\\shrink12.xlsx");
     
     try {
		book.write(fs);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
     try {
		fs.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
     
     
    class   Student{
  	   private String name;
  	   private int rollNo;
	
  	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}
	
  }
       
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
 

