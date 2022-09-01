package com.sample.programs.sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

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
        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet("My Datas");
        
        XSSFRow row;
        
        Map<String,Object[]> MyDatas=new TreeMap<>();
        MyDatas.put("1",new Object[] {"Roll No","Name","Year"});
        MyDatas.put("2",new Object[] {"00432","Adithya","2000"});
        MyDatas.put("3",new Object[] {"1251","Bala","1996"});
        MyDatas.put("4",new Object[] {"5439","Cyril","1998"});
        
        Set<String> keyid=MyDatas.keySet();
        
        int rowid=0;
        
        for(String key:keyid) {
        	row=sheet.createRow(rowid++);
        	Object[] objectArr=MyDatas.get(key);
        	
        	int cellid=0;
        	
        	for (Object obj :objectArr) {
                Cell cell = row.createCell(cellid++);
                cell.setCellValue((String)obj);
            }
        	
        	FileOutputStream fs=new FileOutputStream(new File("C:\\Users\\AZEEM\\Documents\\PracticeBook.xlsx"));
        	
        	wb.write(fs);
        	fs.close();
        }
        	
        }
        
    
}
