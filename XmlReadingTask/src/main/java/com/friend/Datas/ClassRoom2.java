package com.friend.Datas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ClassRoom2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	try {
		
		FileInputStream f=new FileInputStream("C:\\Users\\AZEEM\\Documents\\HelloWorld1234.xlsx");
	
	
	XSSFWorkbook book=new XSSFWorkbook(f);
	XSSFSheet sheet=book.getSheetAt(0);
	
	Iterator<Row>itr=sheet.iterator();
	while(itr.hasNext()) {
		Row row=itr.next();
		
		Iterator<Cell>cellIter=row.cellIterator();
		while(cellIter.hasNext()) {
			Cell cell=cellIter.next();
			
			switch(cell.getCellType()) {
			case Cell.CELL_TYPE_STRING:
				System.out.print(cell.getStringCellValue()+"\t\t\t");
				break;
			
			case Cell.CELL_TYPE_NUMERIC:
				System.out.print(cell.getNumericCellValue()+"\t\t\t");
				break;
			default:
			}
		  }
		System.out.println("");
			
	      }
		}
	
	catch(Exception e) {
		e.printStackTrace();
	}
}
}


