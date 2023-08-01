package com.friend.ExampleForProgram;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

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
       XSSFSheet sheet=book.createSheet("Important Details");
       XSSFRow row;
       
     Employee e1=new Employee("Arun",27,"Avadi");  
     Employee e2=new  Employee("Sam",25,"Guindy");
     Employee e3=new Employee("Charan",26,"Porur");
     
     
     ArrayList<Employee>emp=new ArrayList<>();
     emp.add(e1);
     emp.add(e2);
     emp.add(e3);
     
     Row headerRow =sheet.createRow(0);
     Row headerRow1 =sheet.createRow(1);
     Row headerRow2 =sheet.createRow(2);

     headerRow.createCell(0).setCellValue("NAME");
     headerRow1.createCell(1).setCellValue("AGE");
     headerRow2.createCell(2).setCellValue("PLACE OF ");

     int rowNum=1;

     for(Employee result:emp){
     Employee results=result;
      row=sheet.createRow(rowNum++);

     row.createCell(0).setCellValue(results.name);
     row.createCell(1).setCellValue(results.age);
     row.createCell(2).setCellValue(results.place);
     
     
     FileOutputStream fs=new FileOutputStream("C:\\Users\\AZEEM\\Documents\\Booking78910.xlsx");
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
}
class Employee{
	String name;
	int age;
	String place;
	Employee(String name,int age,String place){
		this.name=name;
		this.age=age;
		this.place=place;
	}
}


