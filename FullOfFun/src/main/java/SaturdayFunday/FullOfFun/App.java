package SaturdayFunday.FullOfFun;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        HSSFWorkbook book=new HSSFWorkbook();
        
        FileOutputStream fs = null;
		try {
			fs = new FileOutputStream("C:\\Users\\AZEEM\\Documents\\Henry.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        HSSFSheet sheet=book.createSheet("GoodMorning");
        
        Row row=sheet.createRow(3);
        Cell cell=row.createCell(4);
        
        int r=cell.getRowIndex();
        int c=cell.getColumnIndex();
        
        
        try {
			book.write(fs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println("("+r+","+c+")");
        
        try {
			fs.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
    }
}
