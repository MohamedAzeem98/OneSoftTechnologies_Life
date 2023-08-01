package FourthProject_Model1.FourthProject_model;
import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
     XSSFWorkbook book=new XSSFWorkbook();
     XSSFSheet sheet=book.createSheet("MY ProgramDetails");
     XSSFRow row;
     
     Student s1=new Student(12,"Arun","12th");
     Student s2=new Student(17,"Balaji","11th");
     Student s3=new Student(35,"Charan","10th");
     
     Student stud[]= {s1,s2,s3};
     int ro=0; 
     for(Student s:stud) {
    	 row=sheet.createRow(ro++);
    	 int co=0;
    	 
    	 //for (Student v :stud) {
    		 Cell cell=row.createCell(co++);
        	 cell.setCellValue(s.name);
        	 cell.setCellValue(s.std);
        	 cell.setCellValue(s.id);
    		 
             
         //}
     	 
   }
     FileOutputStream fs=new FileOutputStream("C:\\Users\\AZEEM\\Documents\\PracticeBook.xlsx");
     book.write(fs);
     fs.close();
     
      }
}
class Student{
	int id;
	String name;
	String std;
	
	Student(int id,String name,String std){
		this.id=id;
		this.name=name;
		this.std=std;
	}
	
}
