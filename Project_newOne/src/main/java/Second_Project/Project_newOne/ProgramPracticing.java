package Second_Project.Project_newOne;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ProgramPracticing {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		XSSFWorkbook wb=new XSSFWorkbook();
		
		XSSFSheet sheet=wb.createSheet("Employee Details");
		XSSFRow row;
		
		Map<String , Object[]>data=new TreeMap<>();
		
		data.put("1",new Object[]{"Azeem","1998"});
		data.put("2",new Object[] {"Bala","2000"});
		data.put("3",new Object[] {"Cyril","2001"});
		data.put("4",new Object[] {"Dinesh","4567"});
		
		Set<String>key=data.keySet();
		
		int nrow=0;
		
		for(String r:key) {
			 row=sheet.createRow(nrow++);
			Object[] obj=data.get(r);
			
			int ncol=0;
			
			for(Object c:obj) {
				Cell cell=row.createCell(ncol++);
				cell.setCellValue((String)c);
				
			}
			FileOutputStream fs=new FileOutputStream(new File("C:\\Users\\AZEEM\\Documents\\Booking.xslx"));
			wb.write(fs);
			fs.close();
		}
		
		
	}

}
