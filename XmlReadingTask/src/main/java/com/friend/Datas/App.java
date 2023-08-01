package com.friend.Datas;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;

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
    public static void main( String[] args ) throws IOException
    {
        XSSFWorkbook wb=new XSSFWorkbook();
        XSSFSheet sheet=wb.createSheet("LAST ATTEMPT");
        XSSFRow row;
        
        Student s1=new Student("Ajay",450,"8th");
        Student s2=new Student("Vijay",377,"9th");
        Student s3=new Student("Sanjay",444,"10th");
        
        
        ArrayList<Student>list=new ArrayList<>();
        
        list.add(s1);
        list.add(s2);
        list.add(s3);
        
        
        //int rows=0;
        Row row1=sheet.createRow(0);
       // Row row2=sheet.createRow(1);
       // Row row3=sheet.createRow(2);
        
        row1.createCell(0).setCellValue("NAME");
        row1.createCell(1).setCellValue("MARKS");
        row1.createCell(2).setCellValue("STD");
        
        int rowNum=1;
        
        for(Student stud:list) {
        	Student res=stud;
        	row=sheet.createRow(rowNum++);
        	
        	row.createCell(0).setCellValue(res.name);
        	row.createCell(1).setCellValue(res.marks);
        	row.createCell(2).setCellValue(res.std);
        	try {
        	FileOutputStream fs=new FileOutputStream("C:\\Users\\AZEEM\\Documents\\HelloWorld1234.xlsx");
        	
        	
        		wb.write(fs);
        		fs.close();
        	
        	}catch(Exception e) {
        		e.printStackTrace();
        	}
        	

        }
     }
}
class Student{
	String name;
	int marks;
	String std;
	
	Student(String name,int marks,String std){
		this.name=name;
		this.marks=marks;
		this.std=std;
	}
}